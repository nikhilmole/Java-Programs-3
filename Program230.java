import java.util.*;


class Program230
{
    static int Freq(int Arr[][], int iRow, int iCol, int iFind)
    {
        int i = 0;
        int j = 0;
        int iCnt = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iFind)
                {
                    iCnt++;
                }
            }
        }
        return iCnt;
    }
    public static void main(String[] Argv)
    {
        int i = 0;
        int j = 0;
        int iNo1 = 0; 
        int iNo2 = 0;
        int iFind = 0;
        int ptr[][];
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the Number of cols : ");
        iNo2 = sobj.nextInt();

        System.out.println("Enter the Number you want to find the frequency : ");
        iFind = sobj.nextInt();

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

        iRet = Freq(ptr, iNo1, iNo2, iFind);
        System.out.println(iRet);
    }
}