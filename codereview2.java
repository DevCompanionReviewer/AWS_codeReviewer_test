public class RuntimeIssuesDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); 

        System.out.println(numbers[4]);
        String str = null;
        System.out.println(str.length()); 

        
        int result = 10 / 0; 

    
        String numStr = "abc";
        int num = Integer.parseInt(numStr);

        
        Object obj = new Integer(10);
        String strObj = (String) obj;

        
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        for (String name : names) {
            names.remove(name);
        }

        
        List<Integer> bigList = new ArrayList<>();
        while (true) {
            bigList.add(999999999);
        }
    }
}
