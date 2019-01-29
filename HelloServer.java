import java.rmi.Naming;

public class HelloServer
{
public static void main (String[] argv) 
  {
try {
Naming.rebind ("Hello", new Hello ("Hello World!"));
System.out.println ("Server is connected and ready for operation.");
    } 
	catch (Exception e) {
System.out.println ("Server not connected: " + e);
    }
  }
}
