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

    public void AddOfDigit()
    {
        int iNo = 0;
        node temp = First;
        int iDigit = 0;
        int iAdd = 0;

        if(temp == null)
        {
            System.out.println("The ll is empty");
            return;
        }
        while(temp != null)
        {
            iNo = temp.data;
            iAdd = 0;
            while(iNo > 0)
            {
                iDigit = iNo % 10;
                iAdd = iAdd + iDigit;
                iNo = iNo / 10;
            }
            System.out.println(iAdd);
            temp = temp.next;
        }
    }
}

class Program203
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(41);
        obj.InsertFirst(32);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        obj.AddOfDigit(); 
    }
}