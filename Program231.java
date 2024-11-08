import java.util.*;


class Program230
{
    static void FindMax(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int Digo1 = 0;
        int Digo2 = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Digo1 < Arr[i][j])
                    {
                        Digo1 = Arr[i][j];
                    }
                }
                else if(i + j == iCol - 1)
                {
                    if(Digo2 < Arr[i][j])
                    {
                        Digo2 = Arr[i][j];
                    }
                }
            }
        }
        System.out.println(Digo1);
        System.out.println(Digo2);

    }
    public static void main(String[] Argv)
    {
        int i = 0;
        int j = 0;
        int iNo1 = 0; 
        int iNo2 = 0;
        int iFind = 0;
        int ptr[][];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the Number of cols : ");
        iNo2 = sobj.nextInt();

        ptr = new int[iNo1][iNo2];

        System.out.println("Entered the elements : ");
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
            System.out.println();
        }

        MaxFind(ptr, iNo1, iNo2);
        System.out.println(iRet);
    }
}