import java.util.*;

class Program232
{
    static void AddCol(int [][]Arr, int iRow, int iCol)
    {
        int i = 0; 
        int j = 0;

        for(i = 0; i < iRow; i++)
        {
            int iAdd = 0;
            for(j = 0; j < iCol; j++)
            {
                iAdd = iAdd + Arr[j][i];
            }
            System.out.println(iAdd);
        }
    }
    public static void main(String[] Argv)
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int ptr[][];
        int i = 0; 
        int j = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of the rows : ");
        iNo1 = sobj.nextInt();
        System.out.println("Enter the elements of the cols : ");
        iNo2 = sobj.nextInt();

        ptr = new int[iNo1][iNo2];
        System.out.println("Entere the elements : ");
        for(i = 0; i < iNo1; i++)
        {
            for(j = 0; j < iNo2; j++)
            {
                ptr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Entered elements are : ");
        for(i = 0; i < iNo1; i++)
        {
            for(j = 0; j < iNo2; j++)
            {
                System.out.print(ptr[i][j]+"\t");
            }
            SDystem.out.prinln()
        }

        AddCol(ptr,iNo1,iNo2);
;    }
}