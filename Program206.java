
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
        System.out.println("null\n");
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
    }

    public void Product()
    {
        int iDigit = 0;
        node temp = First;
        int iNo = 0;

        while(temp != null)
        {   
            int Pro = 1;
            iNo = temp.data;

            while(iNo > 0)
            {
                iDigit = iNo % 10;
                Pro = Pro * iDigit;
                iNo = iNo / 10;
            }
            System.out.print("|"+Pro+"|->");
            temp = temp.next;
        }

    }
}

class Program206
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(212);
        obj.InsertFirst(32);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        obj.Product();
    }
}