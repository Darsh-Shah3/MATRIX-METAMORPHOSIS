import java.util.*;
class Operation
{
    Scanner sc = new Scanner(System.in);
    void Addition()
    {
        System.out.print("Enter number of rows for Matrix-1:");
        int r1 = sc.nextInt();
        System.out.print("Enter number of column for Matrix-1:");
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];

        System.out.print("Enter number of rows for Matrix-2:");
        int r2 = sc.nextInt();
        System.out.print("Enter number of column for Matrix-2:");
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];

        //   For loop for taking input

        if (r1 == r2 && c1 == c2)
        {
            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    System.out.print("Enter input for Matrix-1 [" + (i) + "][" + (j) + "]:");
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < r2; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    System.out.print("Enter input for Matrix-2 [" + (i) + "][" + (j) + "]:");
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix-1 is:");

            // For loop for printing elements of matrix 1

            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix-2 is:");

            // For loop for printing elements of matrix 2

            for (int i = 0; i < r2; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            // For loop for summation process

            System.out.println("Addition of given two Matrix is:");
            int c[][] = new int[r1][c1];
            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            // For loop for printing elements of matrix 3

            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Addition of given two Matrix is not possible");
        }
    }

    void Subtraction()
    {
            System.out.print("Enter number of rows for Matrix-1:");
            int r1=sc.nextInt();
            System.out.print("Enter number of column for Matrix-1:");
            int c1=sc.nextInt();
            int a[][]=new int[r1][c1];

            System.out.print("Enter number of rows for Matrix-2:");
            int r2=sc.nextInt();
            System.out.print("Enter number of column for Matrix-2:");
            int c2=sc.nextInt();
            int b[][]=new int[r2][c2];

         //   For loop for taking input

            if(r1==r2 && c1==c2)
            {
                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c1;j++)
                    {
                        System.out.print("Enter input for Matrix-1 ["+(i)+"]["+(j)+"]:");
                        a[i][j]=sc.nextInt();
                    }
                }
                for(int i=0;i<r2;i++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        System.out.print("Enter input for Matrix-2 ["+(i)+"]["+(j)+"]:");
                        b[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Matrix-1 is:");

                // For loop for printing elements of matrix 1

                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c1;j++)
                    {
                        System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println("Matrix-2 is:");

                // For loop for printing elements of matrix 2

                for(int i=0;i<r2;i++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        System.out.print(b[i][j]+" ");
                    }
                    System.out.println();
                }

                // For loop for subtraction process

                System.out.println("Subtraction of given two Matrix is:");
                int c[][]=new int[r1][c1];
                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c1;j++)
                    {
                        c[i][j]=a[i][j]-b[i][j];
                    }
                }

                // For loop for printing elements of matrix 3

                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c1;j++)
                    {
                        System.out.print(c[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("Subtraction of given two Matrix is not possible");
            }
    }

    void Multiplication()
    {
        System.out.print("Enter number of rows for Matrix-1:");
        int r1=sc.nextInt();
        System.out.print("Enter number of column for Matrix-1:");
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];

        System.out.print("Enter number of rows for Matrix-2:");
        int r2=sc.nextInt();
        System.out.print("Enter number of column for Matrix-2:");
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];

        int c[][]=new int[r1][c2];

        if(r1 == c2)
        {
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    System.out.print("Enter input for Matrix-1 ["+(i)+"]["+(j)+"]:");
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print("Enter input for Matrix-2 ["+(i)+"]["+(j)+"]:");
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("Matrix-1 is:");

            // For loop for printing elements of matrix 1

            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Matrix-2 is:");

            // For loop for printing elements of matrix 2

            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }

            // For loop for multiplication process

            System.out.println("Multiplication of given two Matrix is:");

            for(int i=0;i<r1;i++)   // Use condition of row_size of first array 'a'
            {
                for(int j=0;j<c2;j++)  // Use condition of column_size of second array 'b'
                {
                    c[i][j]=0;
                    for(int k=0;k<c1;k++)  // Use additional for loop for multiplication purpose
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }

            // For loop for printing elements of multiplication matrix

            for(int i=0;i<c.length;i++)
            {
                for(int j=0;j<c[i].length;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Multiplication of given two Matrix is not possible");
        }
    }
    void Determinant()
    {
        System.out.print("Enter number of rows:");
        int r=sc.nextInt();
        System.out.print("Enter number of columns:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];

        //  for loop for taking input

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter input for Matrix ["+(i)+"]["+(j)+"]:");
                a[i][j]=sc.nextInt();
            }
        }

        // for loop for printing matrix

        System.out.println("Matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        if(r==1&&c==1)
        {
            int determinant = a[0][0];
            System.out.println("Determinant of 1*1 Matrix is:"+  +determinant);
        }

        else if(r==2&&c==2)
        {
            int determinant = a[0][0] * a[1][1] - a[0][1] * a[1][0];
            System.out.println("Determinant of 2*2 Matrix is:"  +determinant);
        }
        else if(r==3&&c==3)
        {
            int determinant=0;
            determinant +=a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]);
            determinant -=a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0]);
            determinant +=a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[1][1]*a[2][0]);
            System.out.println("Determinant of 3*3 Matrix is:"  +determinant);
        }
        else
        {
            System.out.println("Determinant of given matrix is not possible");
        }
    }
    void UpperTriangular()
    {
        System.out.print("Enter number of rows for Matrix:");
        int r = sc.nextInt();
        System.out.print("Enter number of column for Matrix:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];

        if(r==c)
        {
            //  for loop for  taking input of matrix
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    System.out.print("Enter input for Matrix [" + (i) + "][" + (j) + "]:");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix is:");

            // for loop for printing matrix
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            // for loop for printing upper triangular matrix
            System.out.println("Upper Triangular Matrix is:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i>j)
                        System.out.print("0 ");
                    else
                        System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Printing Upper Triangular Matrix is not Possible");
        }
    }
    void LowerTriangular()
    {
        System.out.print("Enter number of rows for Matrix:");
        int r = sc.nextInt();
        System.out.print("Enter number of column for Matrix:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];

        if(r==c)
        {
            //  for loop for  taking input of matrix
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    System.out.print("Enter input for Matrix [" + (i) + "][" + (j) + "]:");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix is:");

            // for loop for printing matrix
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            // for loop for printing lower triangular matrix
            System.out.println("Lower Triangular Matrix is:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(j>i)
                        System.out.print("0 ");
                    else
                        System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Printing Lower Triangular Matrix is not Possible");
        }
    }
    void Transpose()
    {
        System.out.print("Enter number of rows for Matrix:");
        int r = sc.nextInt();
        System.out.print("Enter number of column for Matrix:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][]=new int[c][r];

        //  for loop for  taking input of matrix
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print("Enter input for Matrix [" + (i) + "][" + (j) + "]:");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is:");

        // for loop for printing matrix
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix is:");

        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=a[j][i];
            }
        }
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
    }
}

class run1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("----------Welcome To Matrix Operation----------");
            System.out.println("Which Operation do you want to Perform\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Upper Triangular Matrix\n5.Lower Triangular Matrix\n6.Transpose Matrix\n7.Determinant\n8.Exit");
            System.out.print("Enter option number:");
            int n=sc.nextInt();

            switch (n)
            {
                case 1:
                    Operation ob1 = new Operation();
                    ob1.Addition();
                    break;

                case 2:
                    Operation ob2=new Operation();
                    ob2.Subtraction();
                    break;

                case 3:
                    Operation ob3=new Operation();
                    ob3.Multiplication();
                    break;

                case 4: Operation ob4=new Operation();
                    ob4.UpperTriangular();
                    break;

                case 5:
                    Operation ob5=new Operation();
                    ob5.LowerTriangular();
                    break;

                case 6:
                    Operation ob6=new Operation();
                    ob6.Transpose();
                    break;

                case 7:
                    Operation ob7=new Operation();
                    ob7.Determinant();
                    break;

                case 8:
                    System.out.println("-----Thank you-----");
                    System.exit(0);
            }
        }
    }
}
