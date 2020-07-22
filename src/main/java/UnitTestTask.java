public class UnitTestTask {

    //method that returns a char array containing every Nth char
    //when sourceArray's length <n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){

        return null;
    }

    //Remove pairs of the same character that are next to each other
    public String removePairs(String source){

        return null;
    }

    public  int converter(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }else {
            return (a/b) + (a*30) - 2;
        }
    }
    public  String nullIfOddLength(String source){
        if(source.length()%2 == 0){
            return source;
        }
        return null;
    }
}
