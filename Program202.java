class node
{
    public node next;
    public int data;

    public node(int iNo)
    {
        next = null;
        data = iNo;
    }
}

class SinglyLL
{
    public node First;
    public int iCnt;

    public SinglyLL()
    {
        First = null;
        iCnt = 0;
    }

    public void Display()
    {
        node temp = First;

        if(temp == null)
        {
            System.out.println("The LL is empty");
            return;
        }
        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return iCnt;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(First == null)
        {   
            First = newn;
        }
        else
        {
            newn.next = First;
            First  = newn;
        }

        iCnt++;
    }

    public int SecondMax()
    {
        int iNum = 0;
        node temp = First;
        int SecondMax = 0;
        int Max = temp.data;

        if((temp == null)||(temp.next == null))
        {
            System.out.println("The ll is empty");
            return -1;
        }
        while(temp != null)
        {
            iNum = temp.data;
            if(iNum > Max)
            {
                SecondMax = Max;
                Max = temp.data;
            }
            else
            {
                SecondMax = iNum;
            }
            temp = temp.next;
        }
        return SecondMax;
    }
}

class Program202
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();
        int iRet = 0;

        obj.InsertFirst(41);
        obj.InsertFirst(32);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        iRet = obj.SecondMax(); 

        System.out.println("maximum numbers is: "+iRet);
    }
}