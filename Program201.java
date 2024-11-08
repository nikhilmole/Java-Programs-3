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

    public int EvenAdd()
    {
        int iAdd = 0;
        int iNum = 0;
        node temp = First;

        while(temp != null)
        {
            iNum = temp.data;
            if(iNum % 2 == 0)
            {
                iAdd = iAdd + iNum;
            }
            temp = temp.next;
        }
        return iAdd;
    }
}

class Program201
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

        iRet = obj.EvenAdd(); 

        System.out.println("Addition of even numbers is: "+iRet);
    }
}