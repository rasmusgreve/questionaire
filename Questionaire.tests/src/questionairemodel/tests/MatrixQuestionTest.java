/**
 */
package questionairemodel.tests;

import junit.textui.TestRunner;

import questionairemodel.MatrixQuestion;
import questionairemodel.QuestionairemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Matrix Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MatrixQuestionTest.class);
	}

	/**
	 * Constructs a new Matrix Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Matrix Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MatrixQuestion getFixture() {
		return (MatrixQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionairemodelFactory.eINSTANCE.createMatrixQuestion());
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

} //MatrixQuestionTest
