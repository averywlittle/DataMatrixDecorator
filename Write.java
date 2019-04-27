package Decorator;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Used to write the matrix to an output file
 * @author avery little
 *
 */
public class Write extends MatrixFunction{

	/**
	 * Constructor for the write decorator
	 * @param matrixProcessor, contains our data matrix
	 * @param outputFile, desired output file name
	 * @throws IOException 
	 */
	public Write(MatrixProcessor matrixProcessor, String outputFile) throws IOException {

		writeToFile(outputFile);
	}

	/**
	 * Writes the matrix to an output file as a .csv using a file writer iterating over collection of arraylists
	 * @param outputFile, the desired output file name
	 * @throws IOException
	 */
	private void writeToFile(String outputFile) throws IOException {

		FileWriter writer = new FileWriter(outputFile);
		for(int i = 0; i < this.dataMatrix.size(); i++) {
			for(int j = 0; i < this.dataMatrix.get(0).size(); j++) {
				writer.write(this.dataMatrix.get(i).get(j) + ", ");
			}
		}
		writer.close();
	}
}
