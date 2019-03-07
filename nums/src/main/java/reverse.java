public class reverse {

    public int reverse(int x) {
        String s = x+"";
        char[] c = s.toCharArray();
        int i = 0;
        if("0".equals(c[0]) ||  s.indexOf("-") ==0){
                i=1;
        }
        s = "";
       for(int l = c.length-1;l>=i;l--){
           s+=c[l];
       }

       if( (c[0]+"").indexOf("-") ==0){
           s = "-"+s;
       }
       try {
           return Integer.valueOf(s);
       }catch (Exception e){
           return 0;
       }

    }


    public static void main(String[] str) {
        reverse s = new reverse();
        System.out.println(s.reverse(1233));
    }
}