package Decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Used to sort the matrix according to a particular column
 * @author avery little
 *
 */
public class Sort extends MatrixFunction{

	/**
	 * Constructor for sort decorator
	 * @param matrixProcessor, contains our data matrix
	 * @param columnIndex, desired column to sort by
	 * @throws InvalidValueException, desired column index must exist within size of data matrix
	 */
	public Sort(MatrixProcessor matrixProcessor, int columnIndex) throws InvalidValueException {

		this.sortByColumn(columnIndex);

	}

	/**
	 * Sorts the entire matrix according to a single column using a comparator
	 * @param columnIndex, desired column to sort by
	 * @throws InvalidValueException, desired column index must exist within size of data matrix
	 */
	private void sortByColumn(int columnIndex) throws InvalidValueException {

		if(this.getList().size() < columnIndex) throw new InvalidValueException("Column does not exist within size of data matrix.");

		Collections.sort(this.getList(), new Comparator<ArrayList<String>>() {

			@Override
			public int compare(ArrayList<String> rowA, ArrayList<String> rowB) {
				String columnElementA = rowA.get(columnIndex);
				String columnElementB = rowB.get(columnIndex);
				return columnElementA.compareTo(columnElementB);
			}
		});

	}

}
