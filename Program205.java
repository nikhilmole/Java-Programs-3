
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

    public void Palindrome()
    {
        int iRev = 0;
        int iDigit = 0;
        node temp = First;
        int iNo = 0;
        int originalnumber = 0;

        while(temp != null)
        {   
            iRev = 0;
            originalnumber = temp.data;
            iNo = temp.data;

            while(iNo > 0)
            {
                iDigit = iNo % 10;
                iRev = iRev * 10 + iDigit;
                iNo = iNo / 10;
            }
            if(iRev == originalnumber)
            {
                System.out.println(originalnumber+" is a palindrome");
            }
            else
            {
                System.out.println(originalnumber+" is not a palindrome");
            }
            temp = temp.next;
        }

    }
}

class Program205
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(212);
        obj.InsertFirst(32);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        obj.Palindrome();
    }
}