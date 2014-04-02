/**
 */
package questionairemodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import questionairemodel.Questionaire;
import questionairemodel.QuestionairemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Questionaire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionaireTest extends TestCase {

	/**
	 * The fixture for this Questionaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Questionaire fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionaireTest.class);
	}

	/**
	 * Constructs a new Questionaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionaireTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Questionaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Questionaire fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Questionaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Questionaire getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionairemodelFactory.eINSTANCE.createQuestionaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //QuestionaireTest
