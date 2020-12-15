package task2;


public class Test {
    public static void main(String[] args) {
        Address address1 = new Address();
        Address address2 = new Address(":");
        Address address3 = new Address(" ");
        Address address4 = new Address();

        address1.splitAddress("Russia,Leningradskaya oblast,Saint-Petersburg,Palace Square,2,1,1");
        address2.splitAddress("Russia:Leningradskaya oblast:Saint-Petersburg:Palace Square:2,1,1");
        address1.tokenizeAddress("Russia,Leningradskaya oblast,Saint-Petersburg,Palace Square,2,1,1");
        address2.tokenizeAddress("Russia,Leningradskaya oblast,Saint-Petersburg,Palace Square,2,1,1");

        address3.splitAddress("       ");
        boolean correctSplitAddress = address4.splitAddress("Russia,Komi Republic,Syktyvkar,Pushkina st,59,1,144");
        boolean correctTokenAddress = address4.tokenizeAddress("Russia,Komi Republic,Syktyvkar,Pushkina st,59,1,144");

        System.out.println(correctSplitAddress);
        System.out.println(correctTokenAddress);

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);

    }
}