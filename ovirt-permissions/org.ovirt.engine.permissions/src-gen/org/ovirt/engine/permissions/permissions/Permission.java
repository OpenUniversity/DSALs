/**
 */
package org.ovirt.engine.permissions.permissions;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Permission#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Permission#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Permission#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Permission#isConditional <em>Conditional</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Permission#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' reference.
   * @see #setObjectType(JvmEnumerationLiteral)
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getPermission_ObjectType()
   * @model
   * @generated
   */
  JvmEnumerationLiteral getObjectType();

  /**
   * Sets the value of the '{@link org.ovirt.engine.permissions.permissions.Permission#getObjectType <em>Object Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' reference.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(JvmEnumerationLiteral value);

  /**
   * Returns the value of the '<em><b>Object Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Id</em>' reference.
   * @see #setObjectId(JvmOperation)
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getPermission_ObjectId()
   * @model
   * @generated
   */
  JvmOperation getObjectId();

  /**
   * Sets the value of the '{@link org.ovirt.engine.permissions.permissions.Permission#getObjectId <em>Object Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Id</em>' reference.
   * @see #getObjectId()
   * @generated
   */
  void setObjectId(JvmOperation value);

  /**
   * Returns the value of the '<em><b>Action Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Group</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Group</em>' reference.
   * @see #setActionGroup(JvmEnumerationLiteral)
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getPermission_ActionGroup()
   * @model
   * @generated
   */
  JvmEnumerationLiteral getActionGroup();

  /**
   * Sets the value of the '{@link org.ovirt.engine.permissions.permissions.Permission#getActionGroup <em>Action Group</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Group</em>' reference.
   * @see #getActionGroup()
   * @generated
   */
  void setActionGroup(JvmEnumerationLiteral value);

  /**
   * Returns the value of the '<em><b>Conditional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' attribute.
   * @see #setConditional(boolean)
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getPermission_Conditional()
   * @model
   * @generated
   */
  boolean isConditional();

  /**
   * Sets the value of the '{@link org.ovirt.engine.permissions.permissions.Permission#isConditional <em>Conditional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' attribute.
   * @see #isConditional()
   * @generated
   */
  void setConditional(boolean value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' reference.
   * @see #setCondition(JvmOperation)
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getPermission_Condition()
   * @model
   * @generated
   */
  JvmOperation getCondition();

  /**
   * Sets the value of the '{@link org.ovirt.engine.permissions.permissions.Permission#getCondition <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(JvmOperation value);

} // Permission
