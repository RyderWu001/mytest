import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		System.out.println("1-A");
		
		Scanner sc = new Scanner(System.in);
		
	    int ticket1 = sc.nextInt();		//宣告變數，sc物件呼叫函式輸入變數值
	    int price1 = sc.nextInt();
	    int ticket2 = sc.nextInt();
	    int price2 = sc.nextInt();
	    int budget1 = sc.nextInt();
	    
	    int tatalCost = ticket1 * price1 + ticket2 * price2 ; //加總金額
	    
	    if(tatalCost <= budget1) {		// if else 運作過濾條件
	    	
	    	int change ;
	    	
	    	change = budget1 - tatalCost;
	    	
	    	System.out.println("$"+change);
	    	
	    	
	    }else {
	     
	    System.out.println("Not affordable");
		
	}
	    
	    
	    
	    
	    //1-B
	    System.out.println();
	    System.out.println("1-B");
	    	    
	    int ticket3 = sc.nextInt();       //設變數，呼叫函式
	    int price3 = sc.nextInt();
	    int ticket4 = sc.nextInt();
	    int price4 = sc.nextInt();	
	    int budget2 = sc.nextInt();	
	    int max = sc.nextInt();	
	    
	    if ((ticket3+ticket4)<=max) {
	    	
	    	
	    	System.out.print(max-(ticket3 + ticket4));
	    	int totalCost2 = ticket3 * price3 + ticket4 * price4 ; 
	    	if (totalCost2 <= budget2) {
	    		System.out.print(", $"+(budget2 - totalCost2));
	    	}else {
	    		System.out.println("Not affordable");	    		
	    	}
	    	
	    }else {
	    	System.out.print("-1,");
	    	int totalCost2 = ticket3 * price3 + ticket4 * price4 ; 
	    	if (totalCost2 < budget2) {
	    		System.out.print(" $"+(budget2 - totalCost2));
	    	}else {
	    		System.out.print(" Not affordable");	    		
	    	}
	    		    	
	    }
	    System.out.println(); 
	    
	    
	    
	    
	    //2-A
	   System.out.println(); 
	   System.out.println("2-A");
	   
	   
	   int popcorn = sc.nextInt();
	   String theater = sc.next() ;
	   
	   boolean isPopcorn = (popcorn == 1);
	   
	   
	   String result = "";

       if (isPopcorn) {
           result = "go to the first floor and then go to the ";
       } else {
           result = "go to the ";
       }

       switch (theater) {  //switch 尋找輸入的樓層代號，給予樓層
           case "A":
           case "B":
               result += "second floor.";
               break;
           case "C":
               result += "third floor.";
               break;
           case "D":
               result += "fourth floor.";
               break;
           case "E":
               result += "fifth floor.";
               break;
           default:
               result = "Invalid theater.";
       }

       System.out.println(result);
       sc.close();
	   
	    

	}
}

