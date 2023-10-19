public class DecimalToBinary {

    public static void toBinary(int dec) {

        for(int i = 0; i < 12; i++) {
            System.out.println(i%2);
        }

        System.out.println("devide by two:");
        System.out.println(5/2);
        System.out.println(6/2);
        System.out.println(5%2);


        /*
         * 000 : 0
         * 001
         * 010 : 2
         * 011
         * 100
         * 101 : 
         * 110 : 6
         * 111 : 7
         * 1000: 8
         * 
         * 
         */
    }

    public static void main(String[] args) {
        toBinary(5);
    }
}
