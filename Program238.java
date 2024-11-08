import java.util.*;

class Program237
{
    static boolean reverse(int Arr[][], int iRow, int iCol)
    {
        int i =0;
        int j = 0;
        int Element = iRow * iCol;
        int iCnt = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCnt++;
                }
            }
        }
        if(iCnt == Element / 2)
        {
            return true;
        }
        return false;
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

        boolean bRet = reverse(ptr,iNo1,iNo2);
        if(bRet == false)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }

    }

}