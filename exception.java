class exception{
  public static void main(String args[]){
    int a;
    int arr[]={10,20,30};
    try{
      a=10/5;
      System.out.println(a);
      System.out.println(arr[2]);
    }
    catch(ArithmeticException ae){
      a=10/2;
      System.out.println(a);
    }
    catch(ArrayIndexOutOfBoundException ae){
      System.out.println(arr[0]);
    }
    catch(Exception e){
      System.out.println(e);
    }
    finally{
      System.out.println("End");
    }
