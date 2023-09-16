public static String getSmallestAndLargest(String s, int k) {
        String st = s.substring(0,k);
        String smallest = st;
        String largest = st;
        
        for(int i =0;i<=s.length()-k;i++){
            st = s.substring(i,i+k);
            if(st.compareTo(largest)>0){
                largest = st;
            }
            if(st.compareTo(smallest)<0){
                smallest = st;
            }
        }
       
        return smallest + "\n" + largest;
    }
