package defaultpackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;


/**
 * 
 */
/**
 * This is a chatbot you can interact with about many things! Most notably, it can give you nba stats
 * and entertainment as well as predictions
 *
 * @author Albert
 * @version Apr 7, 2018
 * @author Period: TODO
 * @author Assignment: ChatBot
 *
 * @author Sources: Andrew Tedijanto, Heewon Chung
 */

public class ChatBot
{
    private String name;

    private ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>(30);
    private ArrayList<String> stevenAdams = new ArrayList<String>();
    private ArrayList<String> lamarcusAldridge = new ArrayList<String>();
    private ArrayList<String> tonyAllen = new ArrayList<String>();
    private ArrayList<String> kyleAnderson = new ArrayList<String>();
    private ArrayList<String> giannisAntetokounmpo = new ArrayList<String>();
    private ArrayList<String> carmeloAnthony = new ArrayList<String>();
    private ArrayList<String> lonzoBall = new ArrayList<String>();
    private ArrayList<String> bradleyBeal = new ArrayList<String>();
    private ArrayList<String> devinBooker = new ArrayList<String>();
    private ArrayList<String> jaylenBrown = new ArrayList<String>();
    private ArrayList<String> stephenCurry = new ArrayList<String>();
    private ArrayList<String> stephCurry = new ArrayList<String>();
    private ArrayList<String> demarDeRozan = new ArrayList<String>();
    private ArrayList<String> kevinDurant = new ArrayList<String>();
    private ArrayList<String> joelEmbiid = new ArrayList<String>();
    private ArrayList<String> aaronGordon = new ArrayList<String>();
    private ArrayList<String> draymondGreen = new ArrayList<String>();
    private ArrayList<String> blakeGriffin = new ArrayList<String>();
    private ArrayList<String> kyrieIrving = new ArrayList<String>();
    private ArrayList<String> lebronJames = new ArrayList<String>();
    private ArrayList<String> nikolaJokic = new ArrayList<String>();
    private ArrayList<String> kevinLove = new ArrayList<String>();
    private ArrayList<String> cjMcCollum = new ArrayList<String>();
    private ArrayList<String> donovanMitchell = new ArrayList<String>();
    private ArrayList<String> victorOladipo = new ArrayList<String>();
    private ArrayList<String> kristapsPorzingis = new ArrayList<String>();
    private ArrayList<String> karlanthonyTowns = new ArrayList<String>();
    private ArrayList<String> klayThompson = new ArrayList<String>();
    private ArrayList<String> russellWestbrook = new ArrayList<String>();
    private ArrayList<String> jamesHarden = new ArrayList<String>();


    public ChatBot()
    {
        arr.add( jamesHarden );
        jamesHarden.add( "jamesHarden" );
        jamesHarden.add( "30.6" );
        jamesHarden.add( "5.4" );
        jamesHarden.add( "8.7" );
        jamesHarden.add( "1.8" );
        jamesHarden.add( "0.7" );
        arr.add( russellWestbrook );
        russellWestbrook.add( "russellWestbrook" );
        russellWestbrook.add( "25.6" );
        russellWestbrook.add( "9.9" );
        russellWestbrook.add( "10.1" );
        russellWestbrook.add( "1.8" );
        russellWestbrook.add( "0.2" );
        arr.add( klayThompson );
        klayThompson.add( "klayThompson" );
        klayThompson.add( "19.8" );
        klayThompson.add( "3.8" );
        klayThompson.add( "2.6" );
        klayThompson.add( "0.8" );
        klayThompson.add( "0.5" );
        arr.add( karlanthonyTowns );
        karlanthonyTowns.add( "karlanthonyTowns" );
        karlanthonyTowns.add( "21.2" );
        karlanthonyTowns.add( "12.3" );
        karlanthonyTowns.add( "2.4" );
        karlanthonyTowns.add( "0.8" );
        karlanthonyTowns.add( "1.4" );
        arr.add( kristapsPorzingis );
        kristapsPorzingis.add( "kristapsPorzingis" );
        kristapsPorzingis.add( "22.7" );
        kristapsPorzingis.add( "6.6" );
        kristapsPorzingis.add( "1.2" );
        kristapsPorzingis.add( "0.8" );
        kristapsPorzingis.add( "2.4" );
        arr.add( victorOladipo );
        victorOladipo.add( "victorOladipo" );
        victorOladipo.add( "23.1" );
        victorOladipo.add( "5.2" );
        victorOladipo.add( "4.3" );
        victorOladipo.add( "2.4" );
        victorOladipo.add( "0.8" );
        arr.add( donovanMitchell );
        donovanMitchell.add( "donovanMitchell" );
        donovanMitchell.add( "20.4" );
        donovanMitchell.add( "3.7" );
        donovanMitchell.add( "3.6" );
        donovanMitchell.add( "1.5" );
        donovanMitchell.add( "0.3" );
        arr.add( cjMcCollum );
        cjMcCollum.add( "cjMcCollum" );
        cjMcCollum.add( "21.5" );
        cjMcCollum.add( "3.9" );
        cjMcCollum.add( "3.4" );
        cjMcCollum.add( "0.9" );
        cjMcCollum.add( "0.4" );
        arr.add( kevinLove );
        kevinLove.add( "kevinLove" );
        kevinLove.add( "17.4" );
        kevinLove.add( "9.3" );
        kevinLove.add( "1.8" );
        kevinLove.add( "0.7" );
        kevinLove.add( "0.4" );
        arr.add( nikolaJokic );
        nikolaJokic.add( "nikolaJokic" );
        nikolaJokic.add( "18.2" );
        nikolaJokic.add( "10.6" );
        nikolaJokic.add( "6.0" );
        nikolaJokic.add( "1.2" );
        nikolaJokic.add( "0.8" );
        arr.add( lebronJames );
        lebronJames.add( "lebronJames" );
        lebronJames.add( "27.7" );
        lebronJames.add( "8.7" );
        lebronJames.add( "9.2" );
        lebronJames.add( "1.4" );
        lebronJames.add( "0.9" );
        arr.add( kyrieIrving );
        kyrieIrving.add( "kyrieIrving" );
        kyrieIrving.add( "24.4" );
        kyrieIrving.add( "3.8" );
        kyrieIrving.add( "5.1" );
        kyrieIrving.add( "1.1" );
        kyrieIrving.add( "0.3" );
        arr.add( blakeGriffin );
        blakeGriffin.add( "blakeGriffin" );
        blakeGriffin.add( "21.4" );
        blakeGriffin.add( "7.4" );
        blakeGriffin.add( "5.8" );
        blakeGriffin.add( "0.7" );
        blakeGriffin.add( "0.3" );
        arr.add( draymondGreen );
        draymondGreen.add( "draymondGreen" );
        draymondGreen.add( "11.1" );
        draymondGreen.add( "7.7" );
        draymondGreen.add( "7.3" );
        draymondGreen.add( "1.4" );
        draymondGreen.add( "1.3" );
        arr.add( aaronGordon );
        aaronGordon.add( "aaronGordon" );
        aaronGordon.add( "17.9" );
        aaronGordon.add( "8.1" );
        aaronGordon.add( "2.4" );
        aaronGordon.add( "1.0" );
        aaronGordon.add( "0.8" );
        arr.add( joelEmbiid );
        joelEmbiid.add( "joelEmbiid" );
        joelEmbiid.add( "22.9" );
        joelEmbiid.add( "11.0" );
        joelEmbiid.add( "3.2" );
        joelEmbiid.add( "0.6" );
        joelEmbiid.add( "1.8" );
        arr.add( kevinDurant );
        kevinDurant.add( "kevinDurant" );
        kevinDurant.add( "26.5" );
        kevinDurant.add( "6.9" );
        kevinDurant.add( "5.4" );
        kevinDurant.add( "0.8" );
        kevinDurant.add( "1.8" );
        arr.add( demarDeRozan );
        demarDeRozan.add( "demarDeRozan" );
        demarDeRozan.add( "23.1" );
        demarDeRozan.add( "5.2" );
        demarDeRozan.add( "1.1" );
        demarDeRozan.add( "0.3" );
        demarDeRozan.add( "2.2" );
        arr.add( stephCurry );
        stephCurry.add( "stephCurry" );
        stephCurry.add( "26.4" );
        stephCurry.add( "5.1" );
        stephCurry.add( "6.1" );
        stephCurry.add( "1.6" );
        stephCurry.add( "0.2" );
        arr.add( stephenCurry );
        stephenCurry.add( "stephenCurry" );
        stephenCurry.add( "26.4" );
        stephenCurry.add( "5.1" );
        stephenCurry.add( "6.1" );
        stephenCurry.add( "1.6" );
        stephenCurry.add( "0.2" );
        arr.add( jaylenBrown );
        jaylenBrown.add( "jaylenBrown" );
        jaylenBrown.add( "14.4" );
        jaylenBrown.add( "5.0" );
        jaylenBrown.add( "1.6" );
        jaylenBrown.add( "1.0" );
        jaylenBrown.add( "0.4" );
        arr.add( devinBooker );
        devinBooker.add( "devinBooker" );
        devinBooker.add( "24.9" );
        devinBooker.add( "4.5" );
        devinBooker.add( "4.7" );
        devinBooker.add( "0.9" );
        devinBooker.add( "0.3" );
        arr.add( bradleyBeal );
        bradleyBeal.add( "bradleyBeal" );
        bradleyBeal.add( "22.8" );
        bradleyBeal.add( "4.4" );
        bradleyBeal.add( "4.6" );
        bradleyBeal.add( "1.2" );
        bradleyBeal.add( "0.5" );
        name = "";
        arr.add( stevenAdams );
        stevenAdams.add( "13.9" );
        stevenAdams.add( "9.1" );
        stevenAdams.add( "1.2" );
        stevenAdams.add( "1.2" );
        stevenAdams.add( "1.1" );
        arr.add( lamarcusAldridge );
        lamarcusAldridge.add( "23.3" );
        lamarcusAldridge.add( "8.4" );
        lamarcusAldridge.add( "2.1" );
        lamarcusAldridge.add( "0.5" );
        lamarcusAldridge.add( "1.2" );
        arr.add( tonyAllen );
        tonyAllen.add( "4.7" );
        tonyAllen.add( "2.1" );
        tonyAllen.add( "0.4" );
        tonyAllen.add( "0.5" );
        tonyAllen.add( "0.1" );
        arr.add( kyleAnderson );
        kyleAnderson.add( "7.9" );
        kyleAnderson.add( "5.4" );
        kyleAnderson.add( "2.7" );
        kyleAnderson.add( "1.5" );
        kyleAnderson.add( ".8" );
        arr.add( giannisAntetokounmpo );
        giannisAntetokounmpo.add( "giannisAntetokounmpo" );
        giannisAntetokounmpo.add( "27.1" );
        giannisAntetokounmpo.add( "10" );
        giannisAntetokounmpo.add( "4.8" );
        giannisAntetokounmpo.add( "1.5" );
        giannisAntetokounmpo.add( "1.4" );
        arr.add( carmeloAnthony );
        carmeloAnthony.add( "carmeloAnthony" );
        carmeloAnthony.add( "16.2" );
        carmeloAnthony.add( "5.9" );
        carmeloAnthony.add( "1.3" );
        carmeloAnthony.add( "0.6" );
        carmeloAnthony.add( "0.6" );
        arr.add( lonzoBall );
        lonzoBall.add( "lonzoBall" );
        lonzoBall.add( "10.2" );
        lonzoBall.add( "6.9" );
        lonzoBall.add( "7.2" );
        lonzoBall.add( "1.7" );
        lonzoBall.add( "0.8" );
        arr.add( lebronJames );
        lebronJames.add( "lebronJames" );
        lebronJames.add( "12" );
    }


    public static void main( String[] args )
    {
        ChatBot run = new ChatBot();
        run.prompt();
        String input = "";
        do {
            input = Prompt.getString("What service do you want to use? Player Info(NBA Player Stats), better "
                + "player(who should win the NBA MVP award) or magic 8 ball? Type \'q\' to exit program");
            input = input.toLowerCase();
            if((input.contains("magic")) || ((input.contains("ball")) && (input.contains("eight"))) || (input.contains("8")))
                run.magic8Ball("yesornostarters.txt");
            else if(input.contains("player info")||(input.contains( "info")) 
                            ||(input.contains( "stat"  ))|| (input.contains( "statistics" )))
                run.getPlayerInfo();
            else if(input.contains("better")||(input.contains( "mvp" )))
            run.getBetterPlayer();
            else if(input.contains( "meme" ))
            {
                run.meme();
            }
        }while(!input.equals("q"));
    }
    
    public void meme()
    {
        System.out.print( "To be fair, you have to have a very high IQ to understand Rick and Morty. "
            + "\nThe humor is extremely subtle, and without a solid grasp of theoretical physics most of "
            + "\nthe jokes will go over a typical viewer's head. There's also Rick's nihilistic outlook, "
            + "\nwhich is deftly woven into his characterisation - his personal philosophy draws heavily "
            + "\nfrom Narodnaya Volya literature, for instance. The fans understand this stuff; they "
            + "\nhave the intellectual capacity to truly appreciate the depths of these jokes, to realize "
            + "\nthat they're not just funny- they say something deep about LIFE. As a consequence people who "
            + "\ndislike Rick and Morty truly ARE idiots- of course they wouldn't appreciate, for instance, the "
            + "\nhumour in Rick's existencial catchphrase \"Wubba Lubba Dub Dub,\" which itself is a cryptic "
            + "\nreference to Turgenev's Russian epic Fathers and Sons I'm smirking right now just imagining "
            + "\none of those addlepated simpletons scratching their heads in confusion as Dan Harmon's unfolds "
            + "\nitself on their television screens. What fools... how I pity them.  And yes by the way, I DO "
            + "\nhave a Rick and Morty tattoo. And no, you cannot see it. It's for the ladies' eyes only- And "
            + "\neven they have to demonstrate that they're within 5 IQ points of my own (preferably lower) beforehand.\n\n" );
    }
    public void scanPlayerInfo( String fileName )
    {
        Scanner scanner = OpenFile.openToRead( fileName );
        int count = 0;
        ArrayList<String> newPlayer = new ArrayList<String>();
        while ( scanner.hasNext() )
        {
            while ( count <= 5 )
            {
                newPlayer.add( scanner.next() );
                count++;
            }
            count = 0;
            arr.add( newPlayer );
        }
    }


    public void prompt()
    {
        name = Prompt.getString( "Hello! What is your name?" );
        System.out.println( "Hello " + name );
    }


    public void magic8Ball( String fileName )
    {
        String[] array = { "No", "idk lol", "yes", "Dumb Question Ask Another", "Forget About It",
            "Get A Clue", "Yeah And I'm The Pope", "You Wish" };
        String question = "";
        int length = array.length;
        do
        {
            boolean valid = false;
            question = Prompt
                .getString( "Ask a question for the magic 8 ball, press \'q\' to quit." );
            int num = question.length();
            if ( num > 9 )
                num = 9;
            String starter = question.trim().substring( 0, num );
            Scanner scanner = OpenFile.openToRead( fileName );
            while ( scanner.hasNext() )
            {
                if ( starter.toLowerCase().contains( scanner.next() )
                    && question.substring( question.length() - 1 ).equals( "?" ) )
                {
                    System.out.println( array[(int)( Math.random() * length )] );
                    valid = true;
                }
            }
            if ( valid == false )
                System.out.println( "This is not a valid question. Please use question "
                    + "phrases so your supreme Overlord can understand" );
        } while ( !( question.equals( "q" ) ) );
    }


    public void getBetterPlayer()
    {
        double playerOneStat = 0;
        double playerTwoStats = 0;
        int i = 0;
        int v =0;
        
        System.out.println( "Using the powers of our Supreme OverLord Chad Junior, we will predict"
            + " who will be the better player next year(Using math)!" );
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Who is the first player?");
        String playerOne = scan.next();
        
        Scanner secondPlayer = new Scanner(System.in);
        System.out.println("Who is the second player?");
        String playerTwo = secondPlayer.next();
        
        scan.close();
        secondPlayer.close();
        
        while(i <arr.size())//iterates through the array of where playernames are items
        {
            if (arr.get(i).get(0).equalsIgnoreCase(playerOne))//if the arr you are on is the same as the playerName
            {
                playerOneStat = ((Double.parseDouble(arr.get( i ).get( 1 ))))
                                + (Double.parseDouble(arr.get( i ).get( 2 ))*1.5)
                                + (Double.parseDouble(arr.get( i ).get( 3 ))* 1.5) 
                                + (Double.parseDouble(arr.get( i ).get( 4 ))* 4) 
                                + (Double.parseDouble(arr.get( i ).get( 5 ))*4);
                
            }
            i++;
            
        }
        while(v<arr.size())
        {
            if (arr.get(v).get(0).equalsIgnoreCase(playerTwo))//if the arr you are on is the same as the playerName
            {
                playerTwoStats = ((Double.parseDouble(arr.get( v ).get( 1 ))))
                                + (Double.parseDouble(arr.get( v ).get( 2 ))* 1.5)
                                + (Double.parseDouble(arr.get( v).get( 3 ))* 1.5) 
                                + (Double.parseDouble(arr.get( v ).get( 4 ))* 4) 
                                + (Double.parseDouble(arr.get( v ).get( 5 ))* 4);
                
            }
            v++;
        }
        
        if(playerOneStat > playerTwoStats)
        {
            System.out.println( playerOne + "is more likely to win MVP this season. His advanced metrics are ");
            System.out.print(Double.toString( playerOneStat ));
            System.out.print( " while " + playerTwo + " are " + playerTwoStats + ".");
        }
        
        if(playerTwoStats > playerOneStat)
        {
            System.out.print( playerTwo + " is more likely to win the MVP this season. His advanced metrics are " );
            System.out.print(Double.toString( playerTwoStats ));
            System.out.print(" while "+ playerOne + " are " + playerOneStat + ".");
        }
        
    }


    public void getPlayerInfo()
    {
        String playerName = "";
        boolean seen = false;
        do
        {
            seen = false;
            playerName = Prompt.getString( "What player's stats do you want to see? "
                + "Please enter it as firstnameLastName (type \'q\' to quit)" );
            for ( int i = 0; i < arr.size(); i++ )// iterates through the array 
            {
                if ( arr.get( i ).get( 0 ).equalsIgnoreCase( playerName ) )
                {
                    seen = true;
                    System.out.print(
                        "Which statistic do you want to see? (ie points, rebounds assists etc.) " );
                    Scanner scan = new Scanner( System.in );
                    String scannerResult = scan.next();
                    if ( scannerResult.equalsIgnoreCase( "p" )
                        || scannerResult.equalsIgnoreCase( "points" )
                        || scannerResult.equalsIgnoreCase( "buckets" ) )
                    {
                        System.out.println( arr.get( i ).get( 1 ) );
                    }
                    else if ( scannerResult.equalsIgnoreCase( "a" )
                        || scannerResult.equalsIgnoreCase( "assists" )
                        || scannerResult.equalsIgnoreCase( "assist" ) )
                    {
                        System.out.println( arr.get( i ).get( 3 ) );
                    }
                    else if ( scannerResult.equalsIgnoreCase( "r" )
                        || scannerResult.equalsIgnoreCase( "rebounds" )
                        || scannerResult.equalsIgnoreCase( "rebound" )
                        || scannerResult.equalsIgnoreCase( "boards" ) )
                    {
                        System.out.println( arr.get( i ).get( 2 ) );
                    }
                    else if ( scannerResult.equalsIgnoreCase( "s" )
                        || scannerResult.toLowerCase().contains( "steal" ) )
                    {
                        System.out.println( arr.get( i ).get( 4 ) );
                    }
                    else if ( scannerResult.equalsIgnoreCase( "b" )
                        || scannerResult.equalsIgnoreCase( "blocks" ) )
                    {
                        System.out.println( arr.get( i ).get( 5 ) );
                    }
                    else
                        System.out.println("Please only search for player stats.");
                }
            }
            if(seen == false && !playerName.equalsIgnoreCase( "q" ))
                System.out.println("Player name does not exist or isn't recent enough.");
        } while ( ( seen == false ) && ( !playerName.equalsIgnoreCase( "q" ) ) );

    }
}
