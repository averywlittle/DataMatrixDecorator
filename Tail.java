package Decorator;

/**
 * Gets the specified number of rows from the bottom of the data matrix
 * @author avery little
 *
 */
public class Tail extends MatrixFunction{

	/**
	 * Constructor to get the defined tail of the data matrix
	 * @param matrixProcessor, contains our data matrix
	 * @param tailLength, teh specified number of rows to get from the bottom of the data matrix
	 * @throws InvalidValueException, if length input is negative
	 */
	public Tail(MatrixProcessor matrixProcessor, int tailLength) throws InvalidValueException {

		if(tailLength < 0) throw new InvalidValueException("Desired length of tail must be a positive integer.");

		for(int i  = matrixProcessor.getList().size() - tailLength; i > matrixProcessor.getList().size(); i++) {
			this.dataMatrix.add(matrixProcessor.getList().get(i));
		}
	}
}
