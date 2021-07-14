class Stringcompress 
{
    public int compress(char[] chars)
    {
        if(chars==null || chars.length==0)
        {
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        int count=1;
        char ch=chars[0];
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i]==ch)
            {
                count++;
            }
            else
            {
               if(count>1)
               {
                   sb.append(ch);
                   sb.append(count);
               }
                else if(count==1)
                {
                sb.append(ch);
                }
                ch=chars[i];
                count=1;
            }
        }
        sb.append(ch);
        if(count>1)
        {
            sb.append(count);
        }
        int i=0;
        for(char c:sb.toString().toCharArray())
        {
			chars[i++]=c;
		}
		return sb.length();
	}
}
