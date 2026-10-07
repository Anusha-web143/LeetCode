class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m=ransomNote.length();
        int n=magazine.length();
        if(m>n){
            return false;
        }
        HashMap<Character, Integer> map1=new HashMap<>();
        for(int i=0; i<m;i++){
        char ch1=ransomNote.charAt(i);
        map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        HashMap<Character, Integer> map2=new HashMap<>();
        for(int j=0; j<n;j++){
        char ch2=magazine.charAt(j);
        map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        for(char ch:map1.keySet()){
            int freq1= map1.get(ch);
            int freq2=map2.getOrDefault(ch,0);
            if(freq1>freq2){
                return false;
            }
        }
        return true;
    }
}