import java.util.*;

class Program235
{
    static void reverse(int Arr[][], int iRow, int iCol)
    {
        int i =0;
        int j = 0;
        int temp = 0;
        int iStart = 0;
        for(i = 0; i < iRow; i++)
        {
            iStart = 0;
            int iEnd = iCol - 1;
            
            while(iStart < iEnd)
            {
                temp = Arr[iStart][i];
                Arr[iStart][i] = Arr[iEnd][i];
                Arr[iEnd][i] = temp;
                
                iStart++;
                iEnd--;
            }
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter the number of cols : ");
        int iNo2 = sobj.nextInt();

        int ptr[][] = new int[iNo1][iNo2];

        int i = 0;
        int j = 0;
        System.out.println("Enter the element");
        for(i = 0; i < iNo1; i++)
        {
            for(j = 0; j < iNo2; j++)
            {
                ptr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Entered elements are");
        for(i = 0; i < iNo1; i++)
        {
            for(j = 0; j < iNo2; j++)
            {
                System.out.print(ptr[i][j]+"\t");
            }
            System.out.println();
        }

        reverse(ptr,iNo1,iNo2);

        System.out.println("Transpose elements are : ");
        for(i = 0; i < iNo1; i++)
        {
            for(j = 0; j < iNo2; j++)
            {
                System.out.print(ptr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}