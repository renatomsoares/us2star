/**
 */
package us;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see us.UsFactory
 * @model kind="package"
 * @generated
 */
public interface UsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "us";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "UsModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UsModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsPackage eINSTANCE = us.impl.UsPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.impl.UsPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.UsPartImpl
	 * @see us.impl.UsPackageImpl#getUsPart()
	 * @generated
	 */
	int US_PART = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_PART__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_PART_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link us.impl.USNodeImpl <em>US Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.USNodeImpl
	 * @see us.impl.UsPackageImpl#getUSNode()
	 * @generated
	 */
	int US_NODE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_NODE__DESCRIPTION = US_PART__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_NODE__ELEMENTS = US_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>US Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_NODE_FEATURE_COUNT = US_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link us.impl.UsElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.UsElementImpl
	 * @see us.impl.UsPackageImpl#getUsElement()
	 * @generated
	 */
	int US_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ELEMENT__DESCRIPTION = US_PART__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ELEMENT__TYPE = US_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ELEMENT_FEATURE_COUNT = US_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link us.impl.USModelImpl <em>US Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.USModelImpl
	 * @see us.impl.UsPackageImpl#getUSModel()
	 * @generated
	 */
	int US_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_MODEL__USS = 1;

	/**
	 * The number of structural features of the '<em>US Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link us.UsElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.UsElementType
	 * @see us.impl.UsPackageImpl#getUsElementType()
	 * @generated
	 */
	int US_ELEMENT_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link us.USNode <em>US Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US Node</em>'.
	 * @see us.USNode
	 * @generated
	 */
	EClass getUSNode();

	/**
	 * Returns the meta object for the containment reference list '{@link us.USNode#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see us.USNode#getElements()
	 * @see #getUSNode()
	 * @generated
	 */
	EReference getUSNode_Elements();

	/**
	 * Returns the meta object for class '{@link us.UsPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see us.UsPart
	 * @generated
	 */
	EClass getUsPart();

	/**
	 * Returns the meta object for the attribute '{@link us.UsPart#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see us.UsPart#getDescription()
	 * @see #getUsPart()
	 * @generated
	 */
	EAttribute getUsPart_Description();

	/**
	 * Returns the meta object for class '{@link us.UsElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see us.UsElement
	 * @generated
	 */
	EClass getUsElement();

	/**
	 * Returns the meta object for the attribute '{@link us.UsElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see us.UsElement#getType()
	 * @see #getUsElement()
	 * @generated
	 */
	EAttribute getUsElement_Type();

	/**
	 * Returns the meta object for class '{@link us.USModel <em>US Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US Model</em>'.
	 * @see us.USModel
	 * @generated
	 */
	EClass getUSModel();

	/**
	 * Returns the meta object for the attribute '{@link us.USModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see us.USModel#getName()
	 * @see #getUSModel()
	 * @generated
	 */
	EAttribute getUSModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link us.USModel#getUss <em>Uss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uss</em>'.
	 * @see us.USModel#getUss()
	 * @see #getUSModel()
	 * @generated
	 */
	EReference getUSModel_Uss();

	/**
	 * Returns the meta object for enum '{@link us.UsElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see us.UsElementType
	 * @generated
	 */
	EEnum getUsElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsFactory getUsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link us.impl.USNodeImpl <em>US Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.USNodeImpl
		 * @see us.impl.UsPackageImpl#getUSNode()
		 * @generated
		 */
		EClass US_NODE = eINSTANCE.getUSNode();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference US_NODE__ELEMENTS = eINSTANCE.getUSNode_Elements();

		/**
		 * The meta object literal for the '{@link us.impl.UsPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.UsPartImpl
		 * @see us.impl.UsPackageImpl#getUsPart()
		 * @generated
		 */
		EClass US_PART = eINSTANCE.getUsPart();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_PART__DESCRIPTION = eINSTANCE.getUsPart_Description();

		/**
		 * The meta object literal for the '{@link us.impl.UsElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.UsElementImpl
		 * @see us.impl.UsPackageImpl#getUsElement()
		 * @generated
		 */
		EClass US_ELEMENT = eINSTANCE.getUsElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ELEMENT__TYPE = eINSTANCE.getUsElement_Type();

		/**
		 * The meta object literal for the '{@link us.impl.USModelImpl <em>US Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.USModelImpl
		 * @see us.impl.UsPackageImpl#getUSModel()
		 * @generated
		 */
		EClass US_MODEL = eINSTANCE.getUSModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_MODEL__NAME = eINSTANCE.getUSModel_Name();

		/**
		 * The meta object literal for the '<em><b>Uss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference US_MODEL__USS = eINSTANCE.getUSModel_Uss();

		/**
		 * The meta object literal for the '{@link us.UsElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.UsElementType
		 * @see us.impl.UsPackageImpl#getUsElementType()
		 * @generated
		 */
		EEnum US_ELEMENT_TYPE = eINSTANCE.getUsElementType();

	}

} //UsPackage
