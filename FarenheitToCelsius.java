import java.util.Scanner;
public class FarenheitToCelsius {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
         int S,E,W,C;
        Scanner scan = new Scanner(System.in);
        S= scan.nextInt();
        E= scan.nextInt();
        W= scan.nextInt();

        
        while(S<=E){
            //C= (5*(S-32))/9);
            C =((5*(S-32))/9);
            System.out.println(S + " " + C );
            S= S+W;
        }
		
	}

}