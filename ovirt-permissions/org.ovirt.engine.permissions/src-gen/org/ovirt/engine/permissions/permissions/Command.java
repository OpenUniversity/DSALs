/**
 */
package org.ovirt.engine.permissions.permissions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Command#getType <em>Type</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Command#isOverrides <em>Overrides</em>}</li>
 *   <li>{@link org.ovirt.engine.permissions.permissions.Command#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(JvmDeclaredType)
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getCommand_Type()
   * @model
   * @generated
   */
  JvmDeclaredType getType();

  /**
   * Sets the value of the '{@link org.ovirt.engine.permissions.permissions.Command#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmDeclaredType value);

  /**
   * Returns the value of the '<em><b>Overrides</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overrides</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overrides</em>' attribute.
   * @see #setOverrides(boolean)
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getCommand_Overrides()
   * @model
   * @generated
   */
  boolean isOverrides();

  /**
   * Sets the value of the '{@link org.ovirt.engine.permissions.permissions.Command#isOverrides <em>Overrides</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overrides</em>' attribute.
   * @see #isOverrides()
   * @generated
   */
  void setOverrides(boolean value);

  /**
   * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
   * The list contents are of type {@link org.ovirt.engine.permissions.permissions.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' containment reference list.
   * @see org.ovirt.engine.permissions.permissions.PermissionsPackage#getCommand_Permissions()
   * @model containment="true"
   * @generated
   */
  EList<Permission> getPermissions();

} // Command
