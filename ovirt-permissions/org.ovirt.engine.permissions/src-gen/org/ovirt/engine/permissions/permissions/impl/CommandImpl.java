/**
 */
package org.ovirt.engine.permissions.permissions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmDeclaredType;

import org.ovirt.engine.permissions.permissions.Command;
import org.ovirt.engine.permissions.permissions.Permission;
import org.ovirt.engine.permissions.permissions.PermissionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.CommandImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.CommandImpl#isOverrides <em>Overrides</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.CommandImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmDeclaredType type;

  /**
   * The default value of the '{@link #isOverrides() <em>Overrides</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverrides()
   * @generated
   * @ordered
   */
  protected static final boolean OVERRIDES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOverrides() <em>Overrides</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverrides()
   * @generated
   * @ordered
   */
  protected boolean overrides = OVERRIDES_EDEFAULT;

  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<Permission> permissions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
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
    return PermissionsPackage.Literals.COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmDeclaredType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (JvmDeclaredType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PermissionsPackage.COMMAND__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmDeclaredType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmDeclaredType newType)
  {
    JvmDeclaredType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PermissionsPackage.COMMAND__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOverrides()
  {
    return overrides;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverrides(boolean newOverrides)
  {
    boolean oldOverrides = overrides;
    overrides = newOverrides;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PermissionsPackage.COMMAND__OVERRIDES, oldOverrides, overrides));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Permission> getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EObjectContainmentEList<Permission>(Permission.class, this, PermissionsPackage.COMMAND__PERMISSIONS);
    }
    return permissions;
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
      case PermissionsPackage.COMMAND__PERMISSIONS:
        return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PermissionsPackage.COMMAND__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case PermissionsPackage.COMMAND__OVERRIDES:
        return isOverrides();
      case PermissionsPackage.COMMAND__PERMISSIONS:
        return getPermissions();
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
      case PermissionsPackage.COMMAND__TYPE:
        setType((JvmDeclaredType)newValue);
        return;
      case PermissionsPackage.COMMAND__OVERRIDES:
        setOverrides((Boolean)newValue);
        return;
      case PermissionsPackage.COMMAND__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends Permission>)newValue);
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
      case PermissionsPackage.COMMAND__TYPE:
        setType((JvmDeclaredType)null);
        return;
      case PermissionsPackage.COMMAND__OVERRIDES:
        setOverrides(OVERRIDES_EDEFAULT);
        return;
      case PermissionsPackage.COMMAND__PERMISSIONS:
        getPermissions().clear();
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
      case PermissionsPackage.COMMAND__TYPE:
        return type != null;
      case PermissionsPackage.COMMAND__OVERRIDES:
        return overrides != OVERRIDES_EDEFAULT;
      case PermissionsPackage.COMMAND__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
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
    result.append(" (overrides: ");
    result.append(overrides);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
