# fibonic
import java.io.*;
import java.util.*;
public class fibonic {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k1=0,k2=1,k3,count=10;
System.out.println(k1+" "+k2);
for(int i=0;i<count;++i){
k3=k1+k2;
System.out.println(" "+k3);
k1=k2;
k2=k3;
}
}
}
