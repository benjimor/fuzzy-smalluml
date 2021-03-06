/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Namespace is an Element in a model that owns and/or imports a set of NamedElements that can be identified by name.
 * membersAreDistinguishable()
 * packageImport.importedPackage.oclAsType(Namespace)->excludes(self)
 * elementImport.importedElement.oclAsType(Element)->excludesAll(ownedMember)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.Namespace#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.commonStructure.Namespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.commonStructure.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link uml.commonStructure.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml.commonStructure.Namespace#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml.commonStructure.Namespace#getPackageImport <em>Package Import</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getNamespace()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='members_distinguishable cannot_import_self cannot_import_ownedMembers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL members_distinguishable='membersAreDistinguishable()' cannot_import_self='packageImport.importedPackage.oclAsType(Namespace)->excludes(self)' cannot_import_ownedMembers='elementImport.importedElement.oclAsType(Element)->excludesAll(ownedMember)'"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.ElementImport}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ElementImports owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getNamespace_ElementImport()
	 * @see uml.commonStructure.ElementImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementImport> getElementImport();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getNamespace_ImportedMember()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='namespace'"
	 * @generated
	 */
	EList<PackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getNamespace_Member()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='memberNamespace'"
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getNamespace_OwnedMember()
	 * @see uml.commonStructure.NamedElement#getNamespace
	 * @model opposite="namespace" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of Constraints owned by this Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getNamespace_OwnedRule()
	 * @see uml.commonStructure.Constraint#getContext
	 * @model opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedRule();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.PackageImport}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageImports owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getNamespace_PackageImport()
	 * @see uml.commonStructure.PackageImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageImport> getPackageImport();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query excludeCollisions() excludes from a set of PackageableElements any that would not be distinguishable from each other in this Namespace.
	 * <!-- end-model-doc -->
	 * @model ordered="false" impsMany="true" impsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='imps->reject(imp1  | imps->exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))'"
	 * @generated
	 */
	EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getNamesOfMember() gives a set of all of the names that a member would have in a Namespace, taking importing into account. In general a member can have multiple names in a Namespace if it is imported more than once with different aliases.
	 * <!-- end-model-doc -->
	 * @model dataType="types.String" ordered="false" elementRequired="true" elementOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if self.ownedMember ->includes(element)\nthen Set{element.name}\nelse let elementImports : Set(ElementImport) = self.elementImport->select(ei | ei.importedElement = element) in\n  if elementImports->notEmpty()\n  then\n     elementImports->collect(el | el.getName())->asSet()\n  else \n     self.packageImport->select(pi | pi.importedPackage.visibleMembers().oclAsType(NamedElement)->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))->asSet()\n  endif\nendif'"
	 * @generated
	 */
	EList<String> getNamesOfMember(NamedElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query importMembers() defines which of a set of PackageableElements are actually imported into the Namespace. This excludes hidden ones, i.e., those which have names that conflict with names of ownedMembers, and it also excludes PackageableElements that would have the indistinguishable names when imported.
	 * <!-- end-model-doc -->
	 * @model ordered="false" impsMany="true" impsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem | imp.isDistinguishableFrom(mem, self)))'"
	 * @generated
	 */
	EList<PackageableElement> importMembers(EList<PackageableElement> imps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The importedMember property is derived as the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.importMembers(elementImport.importedElement->asSet()->union(packageImport.importedPackage->collect(p | p.visibleMembers()))->asSet())'"
	 * @generated
	 */
	EList<PackageableElement> importedMember();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean query membersAreDistinguishable() determines whether all of the Namespace's members are distinguishable within it.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='member->forAll( memb |\n   member->excluding(memb)->forAll(other |\n       memb.isDistinguishableFrom(other, self)))'"
	 * @generated
	 */
	boolean membersAreDistinguishable();

} // Namespace
