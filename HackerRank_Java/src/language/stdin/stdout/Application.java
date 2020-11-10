package language.stdin.stdout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.registry.LocateRegistry;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;



public class Application {
	
	public static void main(String[] args) {
		// currencyFormater();
		// testBigDecimal();
		// testStringReverse();
		// testAnagrams();
		// TestJavaStringTokens();
		testPatternSyntaxChecker();
	}
	
	


    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	Calendar myCalendar = Calendar.getInstance();
    	myCalendar.set(year, month-1, day);
    	
    	int dayOfWeek = myCalendar.get(myCalendar.DAY_OF_WEEK);
    	    	
    	String [] dayNames = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    	
    	String dayOfWeekName = dayNames[dayOfWeek - 1];
    	 
    	return dayOfWeekName;
    			
    }
	
    public static void testDateAndTime() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
	
	
	public static void testStdinStdout () {
		int x = 1;
		String xs = String.valueOf(x);
		long y = (long) x;
		
		
	    Scanner scan = new Scanner(System.in);
	    int i = scan.nextInt();
	    scan.nextLine();
	    double d = Double.parseDouble(scan.nextLine());
	    String s = scan.nextLine();
	    scan.close();
	
	    System.out.println("String: " + s);
	    System.out.println("Double: " + d);
	    System.out.println("Int: " + i);		
	}
	
    public static void testDataTypes (String []argh)
    {
    


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                } else if (x>=-32768 && x<=32767){
                    System.out.println("* short");
                } else if (x>=-2147483648 && x<=2147483647){
                    System.out.println("* int");
                } else if (x>=Long.MIN_VALUE && x<= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
    
    public static void currencyFormater() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale indianLocale = new Locale("EN", "INDIA");
        
        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(indianLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
    public static void bigInteger() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
    
    public static void testBigDecimal(){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

      	/*
      	 * My original solution:
      	Comparator<String> bigDecimalComparator 
      	 = (String o1, String o2) -> {
      		 
      		int output = 0;
      		 
 			if (o1 != null && o2 == null) {
				output = 0;
			} else if (o1 == null) {
				output = 1;
			} else if (o2 == null) {
				output = -1;
			} else {
				BigDecimal a = new BigDecimal(o1);
				BigDecimal b = new BigDecimal(o2);
				
				int comparison = a.compareTo(b);
				
				if (comparison == 0) {
					output = 0;
				} else if (comparison == 1) {
					output = -1;
				} else if (comparison == -1) {
					output = 1;
				}
			}
 			return output;
      	 };
      	Arrays.sort(s, bigDecimalComparator);
      	*/
      	
      	// Improvement according to comments in hackerrank
        
      	/*
      	// For sorting in descending order I inverted the comparison b.compareTo(a) instead of a.compareTo(b)
      	Comparator<String> bigDecimalComparator 
     	 = (String o1, String o2) -> {
				BigDecimal a = new BigDecimal(o1);
				BigDecimal b = new BigDecimal(o2);
				
				return b.compareTo(a);				
			};
     	 
		// I specify the range of element to order. Because the last two positions are null 
		// they do not need to be ordered. If I do it it will throw a nullPointerException
      	Arrays.sort(s, 0, s.length - 2, bigDecimalComparator);
      	*/
      	String a = "jose"; 
      	
      	
      	// Last improvement
        // 1) I specify the range of element to order. Because the last two positions are null 
        // they do not need to be ordered. If I do it it will throw a nullPointerException.
      	// 2) For sorting in descending order I inverted the comparison b.compareTo(a) instead of a.compareTo(b)
      	// 3) I am creating an anonymous instance from the interface Comparator 
        Arrays.sort(s, 0, s.length - 2, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				BigDecimal a = new BigDecimal(o1);
				BigDecimal b = new BigDecimal(o2);
				
				return b.compareTo(a);
			}
        });
      	

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    
    public static void testStrings() {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        
        if (A.compareTo(B) > 0) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
        String upperA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String upperB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(upperA + " " + upperB);
        
        
        
    }
    
    public static void testStringReverse() {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        
        /*
        // My first attempt:
        String B = "";
        for (int i = A.length() - 1; i >= 0; i-- ) {
        	B += A.substring(i, i+1);
        }
        
        if (A.equals(B)){
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }*/
        
        // Improvement copy from hackerrank
        System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );         
    }
     
    static boolean isAnagram(String a, String b) {
    	
    	if (a.length() != b.length()) {
    		return false;
    	}
    	
    	int [] word1 = new int[26];
    	int [] word2 = new int[26];
    	
    	a = a.toUpperCase();
    	b = b.toUpperCase();
    	
    	for(int i = 0; i < a.length(); i++) {
    		word1[a.charAt(i) - 'A'] += 1;
    		word2[b.charAt(i) - 'A'] += 1;
    	}
        	
    	for (int i = 0; i < 26; i++) {
    		if (word1[i] != word2[i]) {
    			return false;
    		}	
    	}
    
    	return true;    	
    }

    public static void testAnagrams() {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    


    public static void TestJavaStringTokens() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // Write your code here.
        String [] tokens = s.split("[ !,?._'@]+");
        
        // When it was starting with non alphabetic character it was getting
        // an empty string at the first position, so I remove it.
        int start = 0;
        if (tokens.length > 0 && tokens[0].isEmpty()) {
            start = 1;
        }
        
        System.out.println(tokens.length - start);
        for(int i = start; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        
        try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
        

        scan.close();
    }
    
	public static void testPatternSyntaxChecker(){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		String a = "jose";
		
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              try {
                   Pattern.compile(pattern);
                   System.out.println("Valid");
              } catch(Exception e){
                System.out.println("Invalid");
              }
              testCases--;
		}
	}


}
