public class furtherestPointFromOrigin {
    
    public int solution(String moves) {
        
        // if(!moves.contains("L")) 
        //     return moves.length();

        

        // int count = 1;
        // for(int i=1; i < moves.length(); i++) {
        //     char c = moves.charAt(i);

        //     // if previous character is L of '_', then make '_' as L.
        //     if(c == '_' ) {
        //         if(moves.charAt(i-1) == 'L')
        //             count--;
        //         else
        //             count++; 
        //     } else {
        //         if(c == 'L')
        //             count--;
        //         else
        //             count++;
        //     }

        // }

        // if(moves.charAt(0) == 'L')
        //     return Math.abs(count) - 1;

        // return Math.abs(count);
        
        int L=0, R=0, B=0;
        for(int i=0; i<moves.length(); i++) {
            char c = moves.charAt(i);
            if(c == 'L') L++;
            else if(c == 'R') R++;
            else B++;
        }

        return (L-R)+B;
    }

    public static void main(String[] args) {
        furtherestPointFromOrigin fp = new furtherestPointFromOrigin();
        System.out.println(fp.solution("__LRR_"));   
        
        float i = 122/11;
        System.out.println(122/11);
        System.out.println(i);

        System.out.println(i == (122/11));
    }
    
}
