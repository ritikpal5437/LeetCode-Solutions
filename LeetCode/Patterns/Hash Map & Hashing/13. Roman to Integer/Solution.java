class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0; i<s.length(); i++)
        { 
            if(i<s.length()-1 && roman(s.charAt(i))<roman(s.charAt(i+1))) 
            { 
                sum=sum+roman(s.charAt(i+1))-roman(s.charAt(i));
                i++;
            }
            else
            {
                 sum=sum+roman(s.charAt(i));
            }
          
        }  return sum;
    }
        static int roman(char c)
    {
        switch(c)
{
    case 'I':
        return 1;

    case 'V':
        return 5;

    case 'X':
        return 10;

    case 'L':
        return 50;

    case 'C':
        return 100;

    case 'D':
        return 500;

    case 'M':
        return 1000;

    default:
        return -1;
}
}
}