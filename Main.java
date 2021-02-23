/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practika1;

/**
 *
 * @author 1
 */
public class Main {
    
    /* Метод для зачачи 1 из блока 1/6 */ 
    public static int reminder(int i, int j){
        int n = i % j;
        return n;
    } 
    /* Метод для зачачи 2 из блока 1/6 */ 
        public static int triArea   (int osnovanie, int visota){
        int s = (osnovanie * visota)/2;
        return s;
    }      
     /* Метод для зачачи 3 из блока 1/6 */
          public static int animals  (int chickens, int cows, int pigs){
        int kolvo = 2 * chickens + 4 * cows + 4 * pigs;
        return kolvo;
          }
     /* Метод для зачачи 4 из блока 1/6 */
          public static boolean profitableGamble  (double prob, int prize, int pay){
              boolean t = true;
              boolean f = false; 
        if (prob * prize > pay)
        {
        return t;
        }
        else
            return f; }
          
           /* Метод для зачачи 5 из блока 1/6 */
             public static String operation  (int N, int a, int b){
        String add = "added"; 
        String sub = "subtracted";
        String mult = "multiplicated";
        String none = "none";
        String div = "divided";
        
               if (N == a + b)
               {return add;}
               else if ((N == a - b) | (N == b - a))
               {return sub;}
               else if (N == a*b)
               {return mult;}
               else if ((N == a/b) | (N == b/a))
               {return div;}
               else return none;
           }
            /* Метод для зачачи 6 из блока 1/6 */
            public static int asc  (char character){  
            int ascii = (int) character;
            return ascii;}
            
             /* Метод для зачачи 7 из блока 1/6 */
              public static int addUpTo (int number){
                  int sum = 0;
                  int n = number;
                  for(int i = 0; i < n; i++)
                  { int a = number % 10;
                  sum = sum + a;
                  number = number - 1;
                  }
                  return sum;
              }
              
               /* Метод для зачачи 8 из блока 1/6 */
               public static int nextEdge (int st1, int st2){
               int st3 = (int) Math.sqrt(Math.pow(st1,2) + Math.pow(st2,2) ) + 1;
               return st3;}
               
           /* Метод для зачачи 9 из блока 1/6 */
               public static int sumOfCubes (int mass[]) {
                   int cubes = 0;
                   
                for (int i = 0; i< mass.length; i++)
                {
                    cubes += Math.pow(mass[i],3);
                }
                
               return cubes;}
               
               /* Метод для зачачи 10 из блока 1/6 */
                public static boolean abcmath (int a, int b, int c){
                boolean t = true;
                boolean f = false;
                int math = 0;
               
                for(int i=0; i< b; i++) 
                {
                if (b>0)
                {a +=a;
                }
                math = a;
                }
                if (math % c == 0){
                return t;}
                else return f;}
                       
                       
    public static void main(String[] args) {
        
        int mod = reminder(-9,45);
        System.out.println("Answer 1 = " + mod);
        
        int ploshad = triArea(7,3);
         System.out.println("Answer 2  = " + ploshad);
         
          int kolvo_legs = animals(5,2,8);
         System.out.println("Answer 3  = " + kolvo_legs);
         
         boolean true_or_false = profitableGamble( 0.9, 1, 2);
         System.out.println("Answer 4 =  " + true_or_false);
         
          String operations = operation(24, 26, 24);
        System.out.println("Answer 5 =  " + operations);
           
        int ctoa = (int) asc('A');
        System.out.println("Answer 6 =  " + ctoa);
        
        int sumnum =  addUpTo(3);
        System.out.println("Answer 7 =  " + sumnum);
        
        int storona3 =  nextEdge(9,2);
        System.out.println("Answer 8 =  " + storona3);
        
       //int vozved3 = sumOfCubes( mass[2]);
       //System.out.println("Answer 9 =  " + vozved3);
       
       boolean zadacha10 = abcmath (5, 2, 2);
       System.out.println("Answer 10 =  " + zadacha10);
    }
    
    
    
}
