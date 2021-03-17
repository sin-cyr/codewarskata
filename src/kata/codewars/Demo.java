package kata.codewars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myarr = new int[] {2,3,4,5,6,7,1};
		//System.out.println(map(myarr).toString());
		
	//	System.out.println(multiply2numbersWithoutOperator(3, 4));
		//rearrangeDigitsToMakeHighestNumber(4873);
		//System.out.println(isPalindrome(232));
		//System.out.println(palindromeChainLength(1232));
		//System.out.println(sortDesc3(1425));
		//System.out.println(toCamelCase("the-stealth-warrior"));
		String expr = "5 1 2 + 4 * + 3 -";
		//System.out.println(evaluate(expr));
		
		//uals("1024x768", Kata.findScreenHeight(1024,"4:3"));
		//System.out.println(findScreenHeight(1024, "4:3"));
		//System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
		//4281, 5087, 2
		//System.out.println(dateNbDays(4281, 5087, 2));
		
		String str = "Hello";
		System.out.println(str.length());
		
	
		
	}

	
	//given an array return it with each numbers doubled
	//option 1
	public static int[] map(int[] arr) {
		int[] doubledArray = new int[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			doubledArray[i] = arr[i] * 2;
		//	System.out.println(doubledArray[i]);
		}
		return doubledArray;
	}
	//option 2
	public static int[] map2(int[] arr) {

		return Arrays.stream(arr).map(x -> x*2).toArray();
	}
	//method which multiplies two numbers without using * operator
	public static int multiply2numbersWithoutOperator(int a, int b) {
		int result = 0;
			for (int i=0; i<a; i++) {
				result += b;
			}
		return result;
	}
	
	public static void rearrangeDigitsToMakeHighestNumber(int a) {
		String num = String.valueOf(a);
		System.out.println(num);
		int[] arr = new int[num.length()];
		Arrays.sort(arr);
		int newNum = 0;
		
		for(int i=0; i<arr.length; i++) {
			newNum += arr[i];
			}
		for (int i : arr) {
			System.out.println(i);
		}
		//return arr;
	}
	
	
		  
		  // an nput Array
		  //int[] intArray = new int[] { 5, 1, 6, 4, 1, 4, 5, 2, 3, 7, 1, 3, 5, 6, 8, 2 };
		  // countMap holds key as int and value as count of an element
		  public static HashMap<Integer,Integer> countMapOccurences(int[] intArray){
		  
			  HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		  
			  for (int i = 0; i < intArray.length; i++) {
		    int key = intArray[i];
		    if (countMap.containsKey(key)) {
		    int count = countMap.get(key);
		    count++;
		    countMap.put(key, count);
		    }  else {
		    countMap.put(key, 1);
		    }
		  }
		 return countMap;
		  }
		  
		  //Pallindrome chain length
		   public static int palindromeChainLength (long n) {      
			      long sum = n;//1234
			      int steps = 0;
			      while (!isPalindrome(sum)) {
			        long reversed = Long.parseLong(String.valueOf(new StringBuilder(String.valueOf(sum)).reverse()));
			        sum += reversed;
			        steps++;
			      }
			      return steps;
			    }
			  
			    public static boolean isPalindrome(long n) {
			      return n == Long.parseLong(String.valueOf(new StringBuilder(String.valueOf(n)).reverse()));
			    }
			 //sort non-nergative number in descening order to form the largest number   
			 public static int sortDesc(int num) {
			       
				 List<Integer> nums = new ArrayList<>();
				 String newNum = " "; 
				 while(num !=0) {
					int digit = num % 10; 
					nums.add(digit);
				 }
				
				 for (int i=0; i<nums.size()-1; i++) {
					 newNum.concat(String.valueOf(i));
				 }
				 int result = Integer.parseInt(newNum);
				 
				 return result;
				 
			 }
			 public static int sortDesc2(int num) {
			 
				 String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
				 Arrays.sort(numbers);
				 
				 String result = "";
				 
				 for (String s : numbers) {
					result = s + result;
				}
				 int newNum = Integer.parseInt(result);
				 return newNum;
			 }
			 public static int sortDesc3(int num) {
				 
				 String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
				 Arrays.sort(numbers);
				 
				 String result = "";
				 
				 for (String s : numbers) {
					result = s + result;
				}
				 int newNum = Integer.parseInt(result);
				 return newNum;
			 }
			 //convert a string contiant - or _ into camel case string
			 public static String toCamelCase(String s){
				    s = s.replace("_","-");
				    StringBuilder res = new StringBuilder();
				    String[] arr = s.split("-"); 
				    res.append(arr[0]);
				    for(int i=1; i<arr.length;i++){
				      res.append(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1));
				    }
				    return res.toString();
				  }
			 //remove first and last chars of a string
			 public static String remove(String str) {

			    return str.substring(1, str.length()-1);
			     
			     
			    }
			 //Given your house number address and length of street n, give the house number on the opposite side of the street.
			 public static long overTheRoad(long address, long n) {
				    return 2 * n + 1 - address;
				  }
			 
			 //calculate growth of population
			//population i.e. 1000, percent 0.02, inhabitants 50, population to surpass
			 //1500, 5, 100, 5000),15);
			   public static int nbYear(int p0, double percent, int aug, int p) {
			        int year = 0;
			        int population = p0;
			        while (population < p) {
						population += population*percent/100 + aug;
						year++;
			        }
			        return year;
			    }
			   //       assertEquals("1024x768", Kata.findScreenHeight(1024,"4:3"));
			   public static String findScreenHeight(int width, String ratio) {
			    	  
				 		      
				      String[] aps = ratio.split(":");
				     // System.out.println(ratioFirst + " " + ratioSecond);
				      
				      int height = width * Integer.valueOf(aps[0]) / Integer.valueOf(aps[1]);
				     
				      return width + "x" + height;
				    }
			   public static String printerError(String s) {
			     
				   String result = "";
				   int length = s.length();
				   int error =0;
				   char[] chars = s.toCharArray();
				   
				   for (char c : chars) {
					if (!(c >= 'a' && c <= 'm')) {
						error++;
					}
				}
				 return result.concat(Integer.valueOf(error) + "/" + Integer.valueOf(length));  
			    }
			   // testing(DateDays.dateNbDays(4281, 5087, 2), "2024-07-03");
			   public static String dateNbDays(double amount, double target, double intrest) {
			      LocalDate dt = LocalDate.of(2016, 1, 1);
				 
			        while (amount < target)
			        {
			            amount += amount * (intrest / 36000);
			            dt = dt.plusDays(1);
			        }

			        return dt.toString();
			    }
//			   public static int solve(final String digits) {//127241
//				  int start=0;  
//				  int end =5; 
//				 
//				  for (int i=0; i<)
//				  String answer = digits.substring(start, end);
//				 
//				 
//				   
//			        return; // you code here
//			    }
}
