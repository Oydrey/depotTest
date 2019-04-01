package fr.unilim.fr.testGit;

public class HelloWorld {
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Jouons ensemble ! NON" );
        System.out.println( "Et si on jouait au FizzBuzz ?" );  
        System.out.println(FizzBuzz.jouer());
    
        System.out.println( "Et si on jouait au Marabout ?" );  
        System.out.println(Marabout.jouer());
    
        System.out.println( "Et si on jouait au Marabout de manière plus simple ?" );  
        System.out.println(MaraboutSimple.getResult());
    }
}
