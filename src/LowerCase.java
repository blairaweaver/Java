class LowerCase {
    public static String LowerCaseBW(String str) {
        String output = "";
        for (char c : str.toCharArray()){
            if ((int) c < 97){
                c =(char) (c + ' ');
            }
            output = output + c;
        }
        return output;
    }
    public static void main(String[] args){
        String test = "Hello";
        System.out.println(LowerCaseBW(test));
    }
}