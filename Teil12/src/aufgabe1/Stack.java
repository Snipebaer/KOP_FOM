package aufgabe1;

//Datei: ObjectStack.java

public class Stack<T>
{
private int position;
private Object[] stack;

public Stack (int groesse)
{
   stack = new Object [groesse];
   position = 0;
}

public boolean isEmpty()
{
   if (position == 0)
   {
      return true;
   }

   return false;
}

public void push (T wert)
{
   stack [position] = wert;
   
   position++;
}

public Object pop()
{
   position--;
   return (T) stack [position];
}

public void stackPrint()
{
   for (int i = 0; i < position; i++)
   {
      System.out.println (stack [i]);
   }
}
}