public class Hamming {
        public static int hammingDistance(int x, int y) {
            String xs = String.format("%16s", Integer.toBinaryString(x)).replace(' ', '0');
            String ys = String.format("%16s", Integer.toBinaryString(y)).replace(' ', '0');
            int hammer = 0;
            for (int i = 0; i < xs.length(); i++) {
                char temp1 = xs.charAt(i);
                char temp2 = ys.charAt(i);
                if (temp1 == temp2) {
                    hammer++;
                }
                //if (!xs.charAt(i).equals(ys.charAt(i))) {
                //  hammer++;
                //  }
            }
            return hammer;
        }
        public static void main(String[] args){
            int temp = hammingDistance(1, 5);
            System.out.println(temp);
        }
}
