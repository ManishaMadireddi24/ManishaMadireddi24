class Plusone {
    public int[] plusOne(int[] digits) {
        
		
        int sum = digits[digits.length-1]+1;
        int carry = sum/10;
        digits[digits.length-1] = sum % 10;

      
        for(int i=digits.length-2;i>=0;i--){
            sum = digits[i]+carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        
		
        if(carry > 0){
            int[] newDigits = new int[digits.length+1];
			
            for(int i=digits.length-1; i>=0 ; i--){

                newDigits[i+1] = digits[i];
            }
			
            newDigits[0]=carry;
            digits=newDigits;
        }
        return digits;
    }
}
