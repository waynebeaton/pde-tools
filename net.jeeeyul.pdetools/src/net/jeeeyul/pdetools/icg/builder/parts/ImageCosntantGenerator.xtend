package net.jeeeyul.pdetools.icg.builder.parts

import net.jeeeyul.pdetools.icg.builder.model.ICGConfiguration
import net.jeeeyul.pdetools.icg.builder.model.palette.ImageFile
import net.jeeeyul.pdetools.icg.builder.model.palette.Palette
import com.google.inject.Inject

class ImageCosntantGenerator {
	@Inject
	ICGConfiguration config ;
	
	val ImagePreviewGenerator previewGenerator = new ImagePreviewGenerator()

	def generateJavaSource(Palette rootPalette) '''
		// Copyright 2012 Jeeeyul Lee, Seoul, Korea
		// https://github.com/jeeeyul/pde-tools
		//
		// This module is multi-licensed and may be used under the terms
		// of any of the following licenses:
		//
		// EPL, Eclipse Public License, V1.0 or later, http://www.eclipse.org/legal
		// LGPL, GNU Lesser General Public License, V2.1 or later, http://www.gnu.org/licenses/lgpl.html
		// GPL, GNU General Public License, V2 or later, http://www.gnu.org/licenses/gpl.html
		// AL, Apache License, V2.0 or later, http://www.apache.org/licenses
		// BSD, BSD License, http://www.opensource.org/licenses/bsd-license.php
		// MIT, MIT License, http://www.opensource.org/licenses/MIT
		//
		// Please contact the author if you need another license.
		// This module is provided "as is", without warranties of any kind.
		package « config.generatePackageName »;
		
		import java.net.URL;
		import org.eclipse.core.runtime.Platform;
		import org.eclipse.jface.resource.ImageRegistry;
		import org.eclipse.swt.graphics.Image;
		import org.eclipse.ui.ISharedImages;
		import org.eclipse.ui.PlatformUI;
		
		/*
		 * Generated by PDE Tools.
		 */
		public class « config.generateClassName »{
			« FOR eachPalette : rootPalette.subPalettes SEPARATOR lineSeparator»
				« eachPalette.generateSubPalette »
			« ENDFOR »
			
			« FOR eachFile : rootPalette.imageFiles SEPARATOR lineSeparator »
				« eachFile.generateField() »
			« ENDFOR »
			private static final ImageRegistry registry = new ImageRegistry();
			
			public static Image getImage(String key){
				Image result = registry.get(key);
				if(result == null){
					result = loadImage(key);
					registry.put(key, result);
				}
				return result;
			}
			
			private static Image loadImage(String key) {
				try {
					URL resource = Platform.getBundle("« config.bundleId »").getResource(key);
					Image image = new Image(null, resource.openStream());
					return image;
				} catch (Exception e) {
					e.printStackTrace();
					return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
				}
			}
		}
	'''

	def private generateSubPalette(Palette palette) '''
		public static interface « palette.fieldName »{
			« FOR eachSub : palette.subPalettes SEPARATOR lineSeparator»
				«eachSub.generateSubPalette()»
			« ENDFOR»
			« FOR eachFile : palette.imageFiles SEPARATOR lineSeparator»
				« eachFile.generateField() »
			« ENDFOR »
		}
	'''

	def private generateField(ImageFile file) '''
		/**
		«IF config.generateImagePreview»
		 	«' '»* «previewGenerator.generate(file.file)»
		«ENDIF»
		 * Image constant for «file.file.projectRelativePath.toPortableString»
		 */
		public static final String « file.fieldName » = "« file.file.projectRelativePath.toPortableString »";
	'''
	
	def private lineSeparator(){
		System::getProperty("line.separator") 
	}
	
}