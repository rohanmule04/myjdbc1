import java.io.*;
class Tesrread1{
public static void main(String[] ar){

String s1=null;
String s2=null;
int a=0;
int b=0;

try{

 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter number 1");
s1=br.readLine();
a=Integer.parseInt(s1);
System.out.println("enter number 2");
s2=br.readLine();
b=Integer.parseInt(s2);
System.out.println("The sum is:  "+(a+b));

}catch(Exception e){

//System.out.println(e);
try{
System.out.println("inside try");
FileOutputStream fos=new FileOutputStream("mylog.txt");//append is true
String ex=e.toString();
byte[] myex=ex.getBytes();
fos.write(myex);
fos.close();

}catch(Exception e1){
System.out.println(e1);
}

}

finally{

s1=null;
s2=null;
}
}


}