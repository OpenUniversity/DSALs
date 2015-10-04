/**
 */
package org.ovirt.engine.permissions.permissions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmOperation;

import org.ovirt.engine.permissions.permissions.Permission;
import org.ovirt.engine.permissions.permissions.PermissionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.PermissionImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.PermissionImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.PermissionImpl#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.PermissionImpl#isConditional <em>Conditional</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.impl.PermissionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission
{
  /**
   * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected JvmEnumerationLiteral objectType;

  /**
   * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectId()
   * @generated
   * @ordered
   */
  protected JvmOperation objectId;

  /**
   * The cached value of the '{@link #getActionGroup() <em>Action Group</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionGroup()
   * @generated
   * @ordered
   */
  protected JvmEnumerationLiteral actionGroup;

  /**
   * The default value of the '{@link #isConditional() <em>Conditional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConditional()
   * @generated
   * @ordered
   */
  protected static final boolean CONDITIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConditional() <em>Conditional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConditional()
   * @generated
   * @ordered
   */
  protected boolean conditional = CONDITIONAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected JvmOperation condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PermissionImpl()
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
    return PermissionsPackage.Literals.PERMISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral getObjectType()
  {
    if (objectType != null && objectType.eIsProxy())
    {
      InternalEObject oldObjectType = (InternalEObject)objectType;
      objectType = (JvmEnumerationLiteral)eResolveProxy(oldObjectType);
      if (objectType != oldObjectType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PermissionsPackage.PERMISSION__OBJECT_TYPE, oldObjectType, objectType));
      }
    }
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral basicGetObjectType()
  {
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectType(JvmEnumerationLiteral newObjectType)
  {
    JvmEnumerationLiteral oldObjectType = objectType;
    objectType = newObjectType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PermissionsPackage.PERMISSION__OBJECT_TYPE, oldObjectType, objectType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmOperation getObjectId()
  {
    if (objectId != null && objectId.eIsProxy())
    {
      InternalEObject oldObjectId = (InternalEObject)objectId;
      objectId = (JvmOperation)eResolveProxy(oldObjectId);
      if (objectId != oldObjectId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PermissionsPackage.PERMISSION__OBJECT_ID, oldObjectId, objectId));
      }
    }
    return objectId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmOperation basicGetObjectId()
  {
    return objectId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectId(JvmOperation newObjectId)
  {
    JvmOperation oldObjectId = objectId;
    objectId = newObjectId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PermissionsPackage.PERMISSION__OBJECT_ID, oldObjectId, objectId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral getActionGroup()
  {
    if (actionGroup != null && actionGroup.eIsProxy())
    {
      InternalEObject oldActionGroup = (InternalEObject)actionGroup;
      actionGroup = (JvmEnumerationLiteral)eResolveProxy(oldActionGroup);
      if (actionGroup != oldActionGroup)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PermissionsPackage.PERMISSION__ACTION_GROUP, oldActionGroup, actionGroup));
      }
    }
    return actionGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral basicGetActionGroup()
  {
    return actionGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionGroup(JvmEnumerationLiteral newActionGroup)
  {
    JvmEnumerationLiteral oldActionGroup = actionGroup;
    actionGroup = newActionGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PermissionsPackage.PERMISSION__ACTION_GROUP, oldActionGroup, actionGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConditional()
  {
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional(boolean newConditional)
  {
    boolean oldConditional = conditional;
    conditional = newConditional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PermissionsPackage.PERMISSION__CONDITIONAL, oldConditional, conditional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmOperation getCondition()
  {
    if (condition != null && condition.eIsProxy())
    {
      InternalEObject oldCondition = (InternalEObject)condition;
      condition = (JvmOperation)eResolveProxy(oldCondition);
      if (condition != oldCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PermissionsPackage.PERMISSION__CONDITION, oldCondition, condition));
      }
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmOperation basicGetCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(JvmOperation newCondition)
  {
    JvmOperation oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PermissionsPackage.PERMISSION__CONDITION, oldCondition, condition));
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
      case PermissionsPackage.PERMISSION__OBJECT_TYPE:
        if (resolve) return getObjectType();
        return basicGetObjectType();
      case PermissionsPackage.PERMISSION__OBJECT_ID:
        if (resolve) return getObjectId();
        return basicGetObjectId();
      case PermissionsPackage.PERMISSION__ACTION_GROUP:
        if (resolve) return getActionGroup();
        return basicGetActionGroup();
      case PermissionsPackage.PERMISSION__CONDITIONAL:
        return isConditional();
      case PermissionsPackage.PERMISSION__CONDITION:
        if (resolve) return getCondition();
        return basicGetCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PermissionsPackage.PERMISSION__OBJECT_TYPE:
        setObjectType((JvmEnumerationLiteral)newValue);
        return;
      case PermissionsPackage.PERMISSION__OBJECT_ID:
        setObjectId((JvmOperation)newValue);
        return;
      case PermissionsPackage.PERMISSION__ACTION_GROUP:
        setActionGroup((JvmEnumerationLiteral)newValue);
        return;
      case PermissionsPackage.PERMISSION__CONDITIONAL:
        setConditional((Boolean)newValue);
        return;
      case PermissionsPackage.PERMISSION__CONDITION:
        setCondition((JvmOperation)newValue);
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
      case PermissionsPackage.PERMISSION__OBJECT_TYPE:
        setObjectType((JvmEnumerationLiteral)null);
        return;
      case PermissionsPackage.PERMISSION__OBJECT_ID:
        setObjectId((JvmOperation)null);
        return;
      case PermissionsPackage.PERMISSION__ACTION_GROUP:
        setActionGroup((JvmEnumerationLiteral)null);
        return;
      case PermissionsPackage.PERMISSION__CONDITIONAL:
        setConditional(CONDITIONAL_EDEFAULT);
        return;
      case PermissionsPackage.PERMISSION__CONDITION:
        setCondition((JvmOperation)null);
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
      case PermissionsPackage.PERMISSION__OBJECT_TYPE:
        return objectType != null;
      case PermissionsPackage.PERMISSION__OBJECT_ID:
        return objectId != null;
      case PermissionsPackage.PERMISSION__ACTION_GROUP:
        return actionGroup != null;
      case PermissionsPackage.PERMISSION__CONDITIONAL:
        return conditional != CONDITIONAL_EDEFAULT;
      case PermissionsPackage.PERMISSION__CONDITION:
        return condition != null;
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
    result.append(" (conditional: ");
    result.append(conditional);
    result.append(')');
    return result.toString();
  }

} //PermissionImpl
