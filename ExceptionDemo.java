class ExceptionDemo{
  int a;
  String gender="g";
  int arr[]={10,20,30};
  void general() throws ArithmeticException, ArrayIndexOutOfBoundsException{
    a=10/5;
    System.out.println(a);
    System.out.println(arr[2]);
  }
  void displayGender() throws GenderMisMatchException{
    if((gender.equalsIgnoreCase("M"))||(gender.equalsIgnoreCase("F")))
      System.out.println(gender);
    else
      throw new GenderMisMatchException();
  }
  public static void main(String args[]){
    try{
      ExceptionDemo ed = new ExceptionDemo();
        ed.general();
        ed.displayGender();
    }
    catch(ArithmeticException ae){
      a=10/2;
      System.out.println(a);
    }
    catch(ArrayIndexOutOfBoundsException ae){
      System.out.println(arr[0]);
    }
    catch(GenderMismatchException e){
      System.out.println(e);
    }
    finally{
      System.out.println("END");
    }
  }
}
