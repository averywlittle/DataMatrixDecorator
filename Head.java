package Decorator;

/**
 * Gets the specified top rows of the data matrix
 * @author avery little
 *
 */
public class Head extends MatrixFunction{

	/**
	 * Constructor to find the defined head of the data matrix
	 * @param matrixProcessor, contains our data matrix
	 * @param headLength, the specified number of rows to get from the top
	 * @throws InvalidValueException, if length input is negative
	 */
	public Head(MatrixProcessor matrixProcessor, int headLength) throws InvalidValueException {

		if(headLength < 0) throw new InvalidValueException("Desired length of head must be a positive integer.");

		for(int i = 0; i < headLength; i++) {
			this.dataMatrix.add(matrixProcessor.getList().get(i));
		}
	}
}