package pkg71a.way.too.pkglong.words;

    

import java.util.Scanner;

public class WayTooLongWords {

    
    public static void main(String[] args) {
      Scanner ww=new Scanner(System.in);
      int N=ww.nextInt();
      
      
      for(int x=0;x<N;x++){
          String Word=ww.next();
          
          if(Word.length()>10){
              System.out.print(Word.charAt(0));
              System.out.print(Word.length()-2);
              System.out.println(Word.charAt(Word.length()-1));
          }
          else{
              System.out.println(Word);
          }
      }
    
    }
    }