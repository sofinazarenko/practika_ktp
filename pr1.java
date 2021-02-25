package practika1;

public class pr1 {

    public static void main(String[] args) {
         reminder(-9,45);

        triArea(7,3);

        animals(5,2,8);

        profitableGamble( 0.9, 1, 2);

        operation(24, 26, 24);

        ctoa ('A');

        addUpTo(3);

        nextEdge(9,2);

        sumOfCubes(new int[]{1,5,9});

        abcmath (5, 2, 2);

    }
    /* Метод для зачачи 1 из блока 1/6 */
     static void reminder(int i, int j){
        int n = i % j;
        System.out.println("Answer 1 = " + n);;
    }
    /* Метод для зачачи 2 из блока 1/6 */
     static void triArea   (int osnovanie, int visota){
        int s = (osnovanie * visota)/2;
        System.out.println("Answer 2  = " + s);
    }
    /* Метод для зачачи 3 из блока 1/6 */
      static void animals  (int chickens, int cows, int pigs){
        int kolvo = 2 * chickens + 4 * cows + 4 * pigs;
          System.out.println("Answer 3  = " + kolvo);
    }
    /* Метод для зачачи 4 из блока 1/6 */
     static void profitableGamble  (double prob, int prize, int pay){
        boolean t = true;
        boolean f = false;
        if (prob * prize > pay)
        {
            System.out.println("Answer 4  = " + t);
        }
        else
            System.out.println("Answer 4  = " + f);
     }

    /* Метод для зачачи 5 из блока 1/6 */
    static void operation  (int N, int a, int b){
        String add = "added";
        String sub = "subtracted";
        String mult = "multiplicated";
        String none = "none";
        String div = "divided";

        if (N == a + b)
        {        System.out.println("Answer 5 =  " + add);
        }
        else if ((N == a - b) | (N == b - a))
        {        System.out.println("Answer 5 =  " + sub);}
        else if (N == a*b)
        {        System.out.println("Answer 5 =  " + mult);}
        else if ((N == a/b) | (N == b/a))
        {        System.out.println("Answer 5 =  " + div);}
        else         System.out.println("Answer 5 =  " + none);
    }
    /* Метод для зачачи 6 из блока 1/6 */
     static void ctoa  (char character){
        int ascii = (int) character;
         System.out.println("Answer 6 =  " + ascii);
     }

    /* Метод для зачачи 7 из блока 1/6 */
    static void addUpTo (int number){
        int sum = 0;
        int n = number;
        for(int i = 0; i < n; i++)
        { int a = number % 10;
            sum = sum + a;
            number = number - 1;
        }
        System.out.println("Answer 7 =  " + sum);
        ;
    }

    /* Метод для зачачи 8 из блока 1/6 */
    static void nextEdge (int st1, int st2){
        int st3 = (int) Math.sqrt(Math.pow(st1,2) + Math.pow(st2,2) ) + 1;
        System.out.println("Answer 8 =  " + st3);
    }

    /* Метод для зачачи 9 из блока 1/6 */
     static void sumOfCubes (int mass[]) {
        int cubes = 0;

        for (int i = 0; i< mass.length; i++)
        {
            cubes += Math.pow(mass[i],3);
        }

         System.out.println("Answer 9 =  " + cubes);
     }

    /* Метод для зачачи 10 из блока 1/6 */
    static void abcmath (int a, int b, int c){
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
            System.out.println("Answer 10 =  " + t);
            }
        else
            System.out.println("Answer 10 =  " + f);
    }

}
