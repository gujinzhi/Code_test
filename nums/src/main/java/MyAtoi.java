public class MyAtoi {

    public int myAtoi(String str) {

        if(str.trim().length()==0 || (str.indexOf("-")==0 &&str.trim().length()==1 )){
            return 0;
        }
        str = str.trim();
        String returnString = "";
        char st[] = str.toCharArray();
        for(int i =0,l =st.length;i<l;i++  ){
            if(i == 0){
                if(!Character.isDigit(st[i]) ){
                    if((st[i]+"").indexOf("-") ==0 && l>1 ){
                        returnString += st[i];
                    }else if((st[i]+"").indexOf("+") ==0 && l>1){

                    }else{
                        returnString =  "0";
                        break;
                    }

                }else{
                    returnString += st[i];
                }

            }else{
                if(Character.isDigit(st[i])){
                    returnString += st[i];
                }else{
                    if(returnString.length() == 1 && returnString.indexOf("-") == 0)returnString = "0";
                    break;
                }
            }





        }



        return Double.valueOf(returnString).intValue();
       // -2147483648~2147483647
    }


    public static void main(String[] str) {
        MyAtoi num = new MyAtoi();
        char s[] = "w".toCharArray();
//        System.out.println(!Character.isDigit(s[0]));

        System.out.println( num.myAtoi("-2"));
    }
}
