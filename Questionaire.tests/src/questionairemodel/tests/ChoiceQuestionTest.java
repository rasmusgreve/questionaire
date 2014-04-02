/**
 */
package questionairemodel.tests;

import junit.textui.TestRunner;

import questionairemodel.ChoiceQuestion;
import questionairemodel.QuestionairemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Choice Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoiceQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChoiceQuestionTest.class);
	}

	/**
	 * Constructs a new Choice Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Choice Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChoiceQuestion getFixture() {
		return (ChoiceQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionairemodelFactory.eINSTANCE.createChoiceQuestion());
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

} //ChoiceQuestionTest
