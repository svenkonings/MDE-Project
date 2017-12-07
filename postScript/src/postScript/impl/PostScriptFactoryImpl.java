/**
 */
package postScript.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import postScript.Array;
import postScript.Dictionary;
import postScript.DictionaryEntry;
import postScript.LiteralName;
import postScript.Name;
import postScript.PostScriptFactory;
import postScript.PostScriptPackage;
import postScript.Procedure;
import postScript.Program;
import postScript.Real;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PostScriptFactoryImpl extends EFactoryImpl implements PostScriptFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostScriptFactory init() {
		try {
			PostScriptFactory thePostScriptFactory = (PostScriptFactory)EPackage.Registry.INSTANCE.getEFactory(PostScriptPackage.eNS_URI);
			if (thePostScriptFactory != null) {
				return thePostScriptFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PostScriptFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostScriptFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PostScriptPackage.PROGRAM: return createProgram();
			case PostScriptPackage.NAME: return createName();
			case PostScriptPackage.ARRAY: return createArray();
			case PostScriptPackage.LITERAL_NAME: return createLiteralName();
			case PostScriptPackage.PROCEDURE: return createProcedure();
			case PostScriptPackage.DICTIONARY_ENTRY: return createDictionaryEntry();
			case PostScriptPackage.DICTIONARY: return createDictionary();
			case PostScriptPackage.INTEGER: return createInteger();
			case PostScriptPackage.REAL: return createReal();
			case PostScriptPackage.BOOLEAN: return createBoolean();
			case PostScriptPackage.STRING: return createString();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralName createLiteralName() {
		LiteralNameImpl literalName = new LiteralNameImpl();
		return literalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryEntry createDictionaryEntry() {
		DictionaryEntryImpl dictionaryEntry = new DictionaryEntryImpl();
		return dictionaryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postScript.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postScript.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public postScript.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostScriptPackage getPostScriptPackage() {
		return (PostScriptPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PostScriptPackage getPackage() {
		return PostScriptPackage.eINSTANCE;
	}

} //PostScriptFactoryImpl
