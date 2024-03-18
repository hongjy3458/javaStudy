class Solution {
    public String solution(int[] food) {
    	String answer = "";
    	
    	for(int i = 1; i < food.length; ++i) {
    		int cnt = food[i];
    		
    		if(cnt < 2) {
    			continue;
    		}
    		
    		cnt /= 2;
    		
    		for(int j = 0; j < cnt; ++j) {
    			answer += i;
    		}
    	}
    	
    	String reversedStr = "";
    	for(int i = answer.length()-1; i >= 0; --i) {
    		reversedStr += answer.charAt(i);
    	}
        
        return answer + "0" + reversedStr;
    }
}