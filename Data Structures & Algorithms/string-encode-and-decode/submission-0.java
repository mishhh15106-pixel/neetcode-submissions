class Solution {

    public String encode(List<String> strs) {
     String result="";
     for(String s:strs)
     {
        result += Integer.toString(s.length())+"#"+s;
     }
     return result;
    }

    public List<String> decode(String str) {
        List<String> decoded=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j+=1;
            }
           int length=Integer.parseInt(str.substring(i,j));
           decoded.add(str.substring(j+1,j+1+length));
           i=j+1+length;
        }
     return decoded;
    }
}
