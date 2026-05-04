class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs) {
            sb.append(s.length()).append('#').append(s);
        }
        System.out.println(sb);
        return new String(sb);
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int pointer = 0;

        while (pointer < str.length()) {
            // Step 1: find the '#'
            int hashIndex = pointer;
            while (str.charAt(hashIndex) != '#') {
                hashIndex++;
            }

            // Step 2: get the length
            int len = Integer.parseInt(str.substring(pointer, hashIndex));

            // Step 3: extract the string
            int start = hashIndex + 1;
            int end = start + len;
            String word = str.substring(start, end);
            result.add(word);

            // Step 4: move pointer
            pointer = end;
        }

        return result;
    }
}
