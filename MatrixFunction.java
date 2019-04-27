package Decorator;

import java.util.ArrayList;

/**
 * Keep matrix relevant data and functions here for modularity with other defined functions in project
 * @author avery little
 *
 */
public class MatrixFunction implements MatrixProcessor {

	//The matrix for which the data will be stored
	protected ArrayList<ArrayList<String>> dataMatrix = new ArrayList<ArrayList<String>>();
	protected int columns, rows;

	/**
	 * @return returns the provided matrix structure
	 */
	@Override
	public ArrayList<ArrayList<String>> getList() {
		
		return this.dataMatrix;
		
	}

	/**
	 * Prints the dataMatrix
	 */
	@Override
	public void print() {
		
		for(int i = 0; i< this.dataMatrix.size(); i++) {
			for(int j = 0; j< this.dataMatrix.get(0).size(); j++) {
				System.out.println(dataMatrix.get(i).get(j) + "   ");
			}
			System.out.println();
		}

	}


}
