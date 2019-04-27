package Decorator;

import java.util.ArrayList;

/**
 * Used to get the specified columns in the matrix
 * @author avery little
 *
 */
public class GetColumn extends MatrixFunction{

	/**
	 * Constructor for GetColumn function
	 * @param matrixProcessor, contains our data matrix
	 * @param columns, vararg of specified columns to add to the matrix
	 */
	public GetColumn(MatrixProcessor matrixProcessor, int ... columns) {
		try {
			for(int i = 0; i< this.dataMatrix.size(); i++) {
				if(columns[i] - 1 > this.dataMatrix.get(0).size()) throw new InvalidValueException("Illegal column index at " + columns[i]);

				ArrayList<String> initializedColumn = new ArrayList<String>();

				for(int j = 0; j < columns.length; j++) {
					initializedColumn.add(matrixProcessor.getList().get(i).get(columns[j]));
				}

				this.dataMatrix.add(initializedColumn);

			}
		} catch (InvalidValueException errorMessage) {
			System.out.println(errorMessage);
			return;

		}
	}
}

class InvalidValueException extends Exception {
	public InvalidValueException(String errorMessage) {
		super(errorMessage);
	}
}
