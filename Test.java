package Decorator;

import java.io.IOException;

/**
 * This class executes the provided and additional tests for the matrix decorator
 * @author avery
 *
 */
public class Test extends MatrixFunction{

	public static void main(String[] args) throws InvalidMatrixShapeException, InvalidValueException, IOException {
		MatrixProcessor mp = new BasicMatrix("data.csv");
		mp.print();
		
		mp = new Head(mp, 9);
		mp.print();
		
		mp = new Find(mp, "dragon");
		mp.print();
		
		mp = new GetColumn(mp, 0, 1, 2,3);
		mp.print();
		
		mp = new GetColumn(mp, 0, 2);
		mp.print();
		
		mp = new Tail(mp, 2);
		mp.print();
		
		mp = new Tail(mp, 1);
		mp.print();
		
		mp = new Sort(mp, 0);
		mp.print();
		
		mp = new Write(mp, "output.txt");
		mp.print();

	}

}
