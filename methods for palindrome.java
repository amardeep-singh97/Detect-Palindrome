char[] array;
int pos;
boolean universal;

public  boolean detect_palindrome(String words){
        String a = null;
        array = new char[words.length()+1];
        array = words.toCharArray();
        for(int i=0;i<=array.length-1;i++){
            //pick a char from array then pass it to return_position function to search if there is same char in array or not
            a=String.valueOf(array[i]);
            pos = return_position(a,i);
            if(pos!=-1&&pos-i>=2){
                String f = String.valueOf(array);
                //reverse function will check if palindrome exist in subString
                universal = reverse(f.substring(i,pos+1));
            }
            if(universal==true){
                return universal;
            }
        }
        return false;
    }

    public int return_position(String c,int d){
        //we use linear search to go through complete array to find same char
        int t=-1;
        for(int j=d+1;j<=array.length-1;j++){
            if(c.equals(String.valueOf(array[j]))){
                t = j;
            }
        }
        return t;
    }

    public boolean reverse(String f){
        //here we create reverse of string to check palindrome
        StringBuilder input1 = new StringBuilder();
        input1.append(f);
        input1 = input1.reverse();
        if(String.valueOf(input1).equals(f)){
            return true;
        }else{
            return false;
        }
    }
