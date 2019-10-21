package lesson9.prob9;
import java.util.*;
import java.util.stream.Stream;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Type.MEAT),
                           new Dish("beef", false, 700, Type.MEAT),
                           new Dish("chicken", false, 400, Type.MEAT),
                           new Dish("french fries", true, 530, Type.OTHER),
                           new Dish("rice", true, 350, Type.OTHER),
                           new Dish("season fruit", true, 120, Type.OTHER),
                           new Dish("pizza", true, 550, Type.OTHER),
                           new Dish("prawns", false, 400, Type.FISH),
                           new Dish("salmon", false, 450, Type.FISH));
    
    /**
     * Is there any Vegetarian meal available ( return type boolean)
     * @return Boolean
     */
    public static Boolean isVegetarianMealAvailable() {
    	return menuPipeline() //
    						.anyMatch(menu->menu.isVegetarian());
    }
    
    /**
     * Is there any healthy menu have calories less than 1000 
     * @return boolean
     */
    public static Boolean isHealthyFoodLessThan100() {
    	return menuPipeline() //
    						.anyMatch(menu->menu.calories < 1000);
    }
    
    /**
     * Is there any unhealthy menu have calories greater than 1000 
     * @return boolean
     */
    public static Boolean isUnHealthyFood() {
    	return menuPipeline() //
    						.anyMatch(menu->menu.calories > 1000);
    }
    
    /**
     *  find and return the first item for the type of MEAT
     * @return `Optional<Dish>`
     */
    public static Optional<Dish> findFirstMeat(){
    	return menuPipeline()//
    						.filter(menu->menu.type == Type.MEAT)
    						.findFirst();
    }
    
    /**
     *  calculateTotalCalories() in the menu using reduce.
     * @return Integer value
     */
    public static int totalCalories(){
    	return menuPipeline() //
    					 .map(menu->menu.calories)
    					 .reduce(0,(c1,c2)->c1+c2);							
    }
    
    /**
     * calculateTotalCaloriesMethodReference() in the menu using MethodReferences
     * @return Integer
     */
    public static int calculateTotalCaloriesMethodReference() {
    	return menuPipeline()
    						.map(menu->menu.calories)
    						.reduce(0, Integer::sum);
    }
    
    private static Stream<Dish> menuPipeline(){
		return menu.stream();
    }
    
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
		//a
    	System.out.println("Is there any Vegetarian meal available: "+Dish.isVegetarianMealAvailable());
    	
    	//b
    	System.out.println("Is there any healthy menu have calories less than 1000: "+Dish.isHealthyFoodLessThan100());
    	
    	//c
    	System.out.println("Is there any unhealthy menu have calories greater than 1000:  "+Dish.isUnHealthyFood());
    	
    	
		//d
    	System.out.println("find and return the first item for the type of MEAT: "+
    			Dish.findFirstMeat().ofNullable("No Meat Available").get());
    	
    	//e
    	System.out.println("calculateTotalCalories() in the menu using reduce: "+ Dish.totalCalories());
    	
    	//f
    	System.out.println("calculateTotalCaloriesMethodReference()in the menu using MethodReferences.: " + 
    			Dish.calculateTotalCaloriesMethodReference());
	}
    
}



