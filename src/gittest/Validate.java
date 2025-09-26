package gittest;

public final class Validate {
    private Validate (){}
    
    public static void ValidateString(String Val,String Err){
        if(Val.isBlank()||Val.isEmpty()||!Val.matches("[A-Z a-z]+")){
            throw new IllegalArgumentException(Err+" Is invalid");
        }
    }
    public static void ValidateINT(int num,String Err){
        if(num<0){
            throw new IllegalArgumentException(Err+" Can't be negative");
        }
    }
    public static void ValidateDouble(double num, String Err){
        if(num<0){
            throw new IllegalArgumentException(Err+" Can't be negative");
        }
    }
    public static void ValidateSTRNUM(String str,String Err){
        if(str.isBlank()||str.isEmpty()||!str.matches("[A-Z a-z 0-9]+")){
            throw new IllegalArgumentException(Err+" Can't be negative");
        }
    }
}
