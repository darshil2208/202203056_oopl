import java.applet.*;
import java.awt.*;
import java.util.Scanner;
public class MA extends Applet
{
  //  public static void main(String[] args) {
    //    Scanner d=new Scanner(System.in);
      //  String name=d.nextLine();
   // }
public void paint(Graphics g)
{ Scanner d=new Scanner(System.in);
    String name=d.nextLine();
g.drawString("Jay Dwarakadhish "+name,100,200);
}
}