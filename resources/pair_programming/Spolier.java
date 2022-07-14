/**
   Spoilers for pair programming work.

   -T. Mykolyk, F. Dragon -- July 2022
 **/


public class Spolier
{

  public static String barGraphify(int[] a)
  {
    String retStr = "";
    for (int row=0; row<a.length; row++ ) {
      retStr += row;
      retStr += ": ";
      for (int j=0; j<a[row]; j++) {
        retStr += "=";
      }
      retStr += "\n";
    }
    return retStr;
  }


  public static String vBarGraphify(int[] a)
  {
    String retStr = "";
    int maxInt = 0;
    for (int i : a) {
      if (i > maxInt) {
        maxInt = i;
      }
    }

    //"lower the curtain" from top to bottom
    for (int row=maxInt; row > 0; row--) {

      //iterate across the array...
      //if a column is tall enough to peek above the curtain, show it
      for (int col=0; col<a.length; col++) {
        if (a[col] >= row) {
          retStr += "*";
          retStr += " ";
        }
        else {
          retStr += " ";
          retStr += " ";
        }
      }
      retStr += "\n";
    }

    //print labels
    for (int col=0; col<a.length; col++) {
      retStr += col;
      retStr += " ";
    }

    return retStr;
  }


  public static void main(String[] args) 
  {

    int[] aoo = {0,1,2,3};
    int[] boo = {1,0,3,2};

    System.out.println("barGraphify output:");
    System.out.println(barGraphify(aoo));
    System.out.println(barGraphify(boo));
    System.out.println("vBarGraphify output:");
    System.out.println(vBarGraphify(aoo));
    System.out.println(vBarGraphify(boo));
  }//main()

}//end class
