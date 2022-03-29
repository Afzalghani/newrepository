class Solution {
    public boolean isMatching(char x,char y)
    {
        return ((x=='[' && y==']') || (x=='{' && y=='}') || (x=='(' && y==')'));
    }
    public boolean isValid(String s) {
        
        Deque<Character> st=new ArrayDeque<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()==true)
                {
                    return false;
                }
                if(isMatching(st.peek(),s.charAt(i))==false)
                {
                    return false;
                }
                st.pop();
            }
        }
        return (st.isEmpty()==true);
        
