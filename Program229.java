import java.util.*;

class Program229
{
    static int DigoAdd(int Arr[][], int iRow, int iCol)
    {
        int iSum = 0;
        int i = 0;
        int j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i== j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }
    public static void main(String[] argv)
    {
        int i = 0; 
        int j = 0;
        int Arr[][];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of col : ");
        int iNo2 = sobj.nextInt();
        
        Arr = new int[iNo1][iNo2];
        
        System.out.println("Enter the Elements");
        for(i = 0; i < iNo1; i++)
        {
            for(j = 0; j < iNo2; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("The entered elements are : ");
        for(i = 0; i < iNo1; i++)
        {
            for(j = 0; j < iNo2; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

        int iRet = DigoAdd(Arr,iNo1,iNo2);
        System.out.println("The addition is : "+iRet);
    }
}