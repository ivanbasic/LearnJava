/*
 18.04.2021
 
 sunday morning
 conversation with my first boss, 
 fixed 2dim arrays in java in c#
 Q
 a are fixed arrays the same in java and c#?
 b 2 dim array, access by rows and cols?
 

 
 nedeljno prepodne, 
 razgovor sa mojim prvim sefom.
 fiksni 2dim nizovi u javi i c#u.
 Q
 a da li su fiksni nizovi u javi i c#u isti?
 b da li se 2dim niz moze citati samo po redovima ili 
   moze i po kolonama? 
 A
 a skoro isti. kod prebacen u c# uz minimalene izmene. 
   u c#u postoji kljucna rec fixed
   2dim niz se oznacava sa [,] a ne [][]
 b moze bilo kojim redom, naravno. 
   
 */




package ivanbasic;

import java.util.Arrays;

public class java_11_05_041_ArraysRowsAndCols implements Lesson {

	public void main() {
		int ROWS = 5;
		int COLS = 8;
		int sumOne = 0;
		int sumAll = 0;
		
		System.out.println("Declare and populate...");		
		int fixed[][] = new int[ROWS][COLS];
		for (int ii = 0; ii < ROWS; ii++) {
			for (int jj = 0; jj < COLS; jj++) {
				fixed[ii][jj] = 10 * (ii + 1) + (jj + 1);
			}
		}
		
		System.out.println("Result");
		System.out.println(Arrays.deepToString(fixed).replace("], ", "]\n"));

		System.out.println("");
		System.out.println("Sum of rows");
		System.out.println("Sumiranje po redovima");
		sumOne = 0;
		sumAll = 0;
		for (int ii = 0; ii < ROWS; ii++) {
			for (int jj = 0; jj < COLS; jj++) {
				sumOne += fixed[ii][jj];
			}
			System.out.println(sumOne);
			sumAll += sumOne;
			sumOne = 0;
		}
		System.out.println("=" + sumAll);

		
		System.out.println("");
		System.out.println("Sum of cols");		
		System.out.println("Sumiranje po kolonama");
		sumOne = 0;
		sumAll = 0;
		for (int jj = 0; jj < COLS; jj++) {
			for (int ii = 0; ii < ROWS; ii++) {

				sumOne += fixed[ii][jj];
			}
			System.out.println(sumOne);
			sumAll += sumOne;
			sumOne = 0;
		}
		System.out.println("=" + sumAll);

	}

}
