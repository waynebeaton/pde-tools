/**
 */
package net.jeeeyul.pdetools.icg.model.imageResource.impl;

import java.util.Collection;

import net.jeeeyul.pdetools.icg.model.imageResource.ImageFile;
import net.jeeeyul.pdetools.icg.model.imageResource.ImageResourcePackage;
import net.jeeeyul.pdetools.icg.model.imageResource.Palette;

import org.eclipse.core.resources.IFolder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.jeeeyul.pdetools.icg.model.imageResource.impl.PaletteImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link net.jeeeyul.pdetools.icg.model.imageResource.impl.PaletteImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.jeeeyul.pdetools.icg.model.imageResource.impl.PaletteImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link net.jeeeyul.pdetools.icg.model.imageResource.impl.PaletteImpl#getSubPalettes <em>Sub Palettes</em>}</li>
 *   <li>{@link net.jeeeyul.pdetools.icg.model.imageResource.impl.PaletteImpl#getImageFiles <em>Image Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaletteImpl extends MinimalEObjectImpl.Container implements Palette
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getFolder() <em>Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFolder()
   * @generated
   * @ordered
   */
  protected static final IFolder FOLDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFolder() <em>Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFolder()
   * @generated
   * @ordered
   */
  protected IFolder folder = FOLDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubPalettes() <em>Sub Palettes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPalettes()
   * @generated
   * @ordered
   */
  protected EList<Palette> subPalettes;

  /**
   * The cached value of the '{@link #getImageFiles() <em>Image Files</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageFiles()
   * @generated
   * @ordered
   */
  protected EList<ImageFile> imageFiles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PaletteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ImageResourcePackage.Literals.PALETTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Palette getParent()
  {
    if (eContainerFeatureID() != ImageResourcePackage.PALETTE__PARENT) return null;
    return (Palette)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Palette newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, ImageResourcePackage.PALETTE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Palette newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != ImageResourcePackage.PALETTE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, ImageResourcePackage.PALETTE__SUB_PALETTES, Palette.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ImageResourcePackage.PALETTE__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ImageResourcePackage.PALETTE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IFolder getFolder()
  {
    return folder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFolder(IFolder newFolder)
  {
    IFolder oldFolder = folder;
    folder = newFolder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ImageResourcePackage.PALETTE__FOLDER, oldFolder, folder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Palette> getSubPalettes()
  {
    if (subPalettes == null)
    {
      subPalettes = new EObjectContainmentWithInverseEList<Palette>(Palette.class, this, ImageResourcePackage.PALETTE__SUB_PALETTES, ImageResourcePackage.PALETTE__PARENT);
    }
    return subPalettes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImageFile> getImageFiles()
  {
    if (imageFiles == null)
    {
      imageFiles = new EObjectContainmentWithInverseEList<ImageFile>(ImageFile.class, this, ImageResourcePackage.PALETTE__IMAGE_FILES, ImageResourcePackage.IMAGE_FILE__PARENT);
    }
    return imageFiles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ImageResourcePackage.PALETTE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Palette)otherEnd, msgs);
      case ImageResourcePackage.PALETTE__SUB_PALETTES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPalettes()).basicAdd(otherEnd, msgs);
      case ImageResourcePackage.PALETTE__IMAGE_FILES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getImageFiles()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ImageResourcePackage.PALETTE__PARENT:
        return basicSetParent(null, msgs);
      case ImageResourcePackage.PALETTE__SUB_PALETTES:
        return ((InternalEList<?>)getSubPalettes()).basicRemove(otherEnd, msgs);
      case ImageResourcePackage.PALETTE__IMAGE_FILES:
        return ((InternalEList<?>)getImageFiles()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case ImageResourcePackage.PALETTE__PARENT:
        return eInternalContainer().eInverseRemove(this, ImageResourcePackage.PALETTE__SUB_PALETTES, Palette.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ImageResourcePackage.PALETTE__PARENT:
        return getParent();
      case ImageResourcePackage.PALETTE__ID:
        return getId();
      case ImageResourcePackage.PALETTE__FOLDER:
        return getFolder();
      case ImageResourcePackage.PALETTE__SUB_PALETTES:
        return getSubPalettes();
      case ImageResourcePackage.PALETTE__IMAGE_FILES:
        return getImageFiles();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ImageResourcePackage.PALETTE__PARENT:
        setParent((Palette)newValue);
        return;
      case ImageResourcePackage.PALETTE__ID:
        setId((String)newValue);
        return;
      case ImageResourcePackage.PALETTE__FOLDER:
        setFolder((IFolder)newValue);
        return;
      case ImageResourcePackage.PALETTE__SUB_PALETTES:
        getSubPalettes().clear();
        getSubPalettes().addAll((Collection<? extends Palette>)newValue);
        return;
      case ImageResourcePackage.PALETTE__IMAGE_FILES:
        getImageFiles().clear();
        getImageFiles().addAll((Collection<? extends ImageFile>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ImageResourcePackage.PALETTE__PARENT:
        setParent((Palette)null);
        return;
      case ImageResourcePackage.PALETTE__ID:
        setId(ID_EDEFAULT);
        return;
      case ImageResourcePackage.PALETTE__FOLDER:
        setFolder(FOLDER_EDEFAULT);
        return;
      case ImageResourcePackage.PALETTE__SUB_PALETTES:
        getSubPalettes().clear();
        return;
      case ImageResourcePackage.PALETTE__IMAGE_FILES:
        getImageFiles().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ImageResourcePackage.PALETTE__PARENT:
        return getParent() != null;
      case ImageResourcePackage.PALETTE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ImageResourcePackage.PALETTE__FOLDER:
        return FOLDER_EDEFAULT == null ? folder != null : !FOLDER_EDEFAULT.equals(folder);
      case ImageResourcePackage.PALETTE__SUB_PALETTES:
        return subPalettes != null && !subPalettes.isEmpty();
      case ImageResourcePackage.PALETTE__IMAGE_FILES:
        return imageFiles != null && !imageFiles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", folder: ");
    result.append(folder);
    result.append(')');
    return result.toString();
  }

} //PaletteImpl