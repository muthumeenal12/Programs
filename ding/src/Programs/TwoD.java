package Programs;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]  a= new int[3][2];
		System.out.println(a[2].length);//To know column of array
		int [][] arr= {{10,20},{30,40}};
		printMatrix(arr);
		transposeMatrix(arr);
	}
	public static void printMatrix(int [][] arr) {
		System.out.println("Matrix (2*2):");
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
		public static void transposeMatrix(int [][] arr)
		{
			System.out.println("Transpose Matrix (2*2):");
			for(int i =0;i<arr.length;i++)
			{
				for(int j =0;j<arr.length;j++)
				{
					System.out.print(arr[j][i]+ " ");
				}
				System.out.println();	
		}

	}

}
