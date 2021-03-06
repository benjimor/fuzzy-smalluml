/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Package#getClass_ <em>Class</em>}</li>
 *   <li>{@link smalluml.Package#getRelation <em>Relation</em>}</li>
 *   <li>{@link smalluml.Package#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getPackage_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<smalluml.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getPackage_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelation();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getPackage_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // Package
