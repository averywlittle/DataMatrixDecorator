package Decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class loads the csv into a 2D matrix
 * @author avery little
 *
 */
public class BasicMatrix extends MatrixFunction{

	/**
	 * Calls the loadCSV function to create the basic matrix
	 */
	public BasicMatrix(String csvFile) throws InvalidMatrixShapeException{

		loadCsvFile(csvFile);

	}

	/**
	 * Loads provided data into matrix data structure
	 * @param csvFile, the provided csv file containing the company data
	 */
	private void loadCsvFile(String csvFile) {

		File file = new File(csvFile);
		Scanner fileScanner;

		try {
			fileScanner = new Scanner(file);
		} catch(FileNotFoundException errorMessage) {
			System.out.println(errorMessage.toString());
			return;
		}

		while(fileScanner.hasNextLine()) {
			try {
				String[] currentLine = fileScanner.nextLine().split(",");
				ArrayList<String> initializedRow = new ArrayList<String>();

				for(int i = 0; i < currentLine.length; i++) {
					if(currentLine[i].equals("")) throw new InvalidMatrixShapeException("Missing element in data file.");
					else initializedRow.add(currentLine[i]);
				}

				this.dataMatrix.add(initializedRow);

			} catch (InvalidMatrixShapeException errorMessage) {
				System.out.println(errorMessage);
				return;
			}
		}
		fileScanner.close();
	}
}

/**
 * Is thrown when a column of the matrix is empty
 * @author avery little
 *
 */
class InvalidMatrixShapeException extends Exception {

	public InvalidMatrixShapeException(String errorMessage) {

		super(errorMessage);

	}
}


