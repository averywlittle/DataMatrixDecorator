package Decorator;

/**
 * Gets the rows that contain a particular subtext within fields
 * @author avery little
 *
 */
public class Find extends MatrixFunction{

	/**
	 * Iterate through the columns of each row starting from the first, and try to match the subtext to the text found in the matrix
	 * @param matrixProcessor, contains our data matrix
	 * @param subtext, the desired string to search for
	 */
	public Find(MatrixProcessor matrixProcessor, String subtext) {

		for(int i = 0; i < this.dataMatrix.size(); i++) {
			for(int j = 0; j < this.dataMatrix.get(0).size(); j++) {
				String text = matrixProcessor.getList().get(i).get(j).toLowerCase();
				if(text.contains(subtext.toLowerCase())) this.dataMatrix.add(matrixProcessor.getList().get(i));
			}
		}
	}
}
