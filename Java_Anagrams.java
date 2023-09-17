 static boolean isAnagram(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        
        if(a_len != b_len) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();

   //creating a character array representing all the alphabets to a value 0
        int[] char_freq = new int[26];
                
        for( int i = 0; i<a_len; i++){

          //for every character in the first string the respective count in the char_freq is incremented
            char cur_char = a.charAt(i);
            int index = cur_char - 'a';
            char_freq[index]++;
            
            // similarly for every character in the second string the respective count in the char_freq is decremented
            char cur_char1 = b.charAt(i);
            int index1 = cur_char1 - 'a';
            char_freq[index1]--;
        }

        //if the all the elements in the char_freq is 0 , it returns True
        for(int i = 0; i<26; i++){
            if (char_freq[i] != 0) return false;
        }
        
        return true;
    }
