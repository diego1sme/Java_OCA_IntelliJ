public class Update {
    private static void update(int[] nums, int index){
        index++;
        nums[index] = 14;
    }
    public static void main(String [] args){
        int index =2;
        int [] nums = {1,3,5,7};
        update(nums,index);
        for(int n : nums){
            System.out.print(n+", ");
        }
        System.out.println("\n"+index);
        int num = 0;
        switch(num){
            default:
                System.out.println("default");
            case 0:
                System.out.println("case1");
        }
        StringBuilder s = new StringBuilder(10 + 2 +"ABC" + 4+5);
        System.out.println(s);
        final int b = 1;
        switch(1){
            case b:
                System.out.println("gello");
        }
        StringBuilder $ = new StringBuilder("123456");
        System.out.println($.subSequence(3,6));
        System.out.println($);
        for(int i = 0; i < 10;){
            i = ++i;
            System.out.println("hello");
        }
    }
}
