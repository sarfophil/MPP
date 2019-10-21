package lesson9.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PuttingIntoPractice {
	public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		processList(transactions)
					.filter(t -> t.getYear() >= 2011) //
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
		

        
        // Query 2: What are all the unique cities where the traders work?
		processList(transactions)
						.map(t->t.getTrader().getCity())
						.distinct()
						.forEach(System.out::println);
        

        // Query 3: Find all traders from Cambridge and sort them by name.
        processList(transactions)
        			.filter(t->t.getTrader().getCity().equals("Cambridge"))
        			.map(t -> t.getTrader().getName())
        			.sorted(Comparator.comparing(e->e))
        			.distinct()
        			.forEach(System.out::println);
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        processList(transactions)
        			.map(name->name.getTrader().getName())
        			.sorted()
        			.distinct()
        			.forEach(System.out::println);
        			
        			

        // Query 5: Are there any trader based in Milan?
        processList(transactions)
        			.filter(t->t.getTrader().getCity().equals("Milan"))
        			.findAny()
        			.ifPresent(System.out::println);
        			
        
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        processList(transactions)
        			.filter(t->t.getTrader().getCity().equals("Milan"))
        			.map(t->{
        				t.getTrader().setCity("Cambridge");
        				return t;
        			})
        			.forEach(System.out::println);
        			
        
        // Query 7: What's the highest value in all the transactions?
		processList(transactions).max((t1, t2) -> {
			return ((Integer) t1.getValue()).compareTo(((Integer) t2.getValue()));
		}).ifPresent(t -> {
			System.out.println("Highest Value: " + t.getValue());
		});
        
        		
    }

	static Stream<Transaction> processList(List<Transaction> list) {
		return list.stream();
	}
}
