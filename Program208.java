
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
        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println("NULL");
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
            First = newn;
        }
        iCnt++;
    }
    public int Largest()
    {
        node temp = null;
        temp = First;
        int iNo = 0;
        int Largest = temp.data;
        while(temp != null)
        {
            iNo = temp.data;
            if(Largest < iNo)
            {
                Largest = iNo;
            }
            temp = temp.next;
        }
        return Largest;
    }
}

class Program208
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(9);
        obj.InsertFirst(32);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        int iRet = obj.Largest();
        System.out.println(iRet);
    }   
}