Company-Wise String DSA Interview Questions
TCS/Infosys/Wipro (Easy-Medium Level)

Reverse a String  // complete

LeetCode: https://leetcode.com/problems/reverse-string/
GeeksforGeeks: https://practice.geeksforgeeks.org/problems/reverse-a-string/1


Check if String is Palindrome //complete

// Notes : Usage of Character class method like Character.isLetterOrDigit()

LeetCode: https://leetcode.com/problems/valid-palindrome/
GeeksforGeeks: https://practice.geeksforgeeks.org/problems/palindrome-string0817/1


Convert String to Integer (atoi) //complete

// Notes -> For cheking Intger Range we have to match it with Intger.MAX_VALUE && Intger.MIN_VALUE

LeetCode: https://leetcode.com/problems/string-to-integer-atoi/
GeeksforGeeks: https://practice.geeksforgeeks.org/problems/implement-atoi/1


First Non-Repeating Character  //complete

// Notes -> We divide problem to subproblem , First we have find all the occurance of all the character , then we have to find the first unique character.

// Intiuition : we can use two pointer but it will result in O(N*2) , so we can use HashMap it will allows us to store the all the character with frequency then we can traverse the string and can check from hashmap to return first unique element.

LeetCode: https://leetcode.com/problems/first-unique-character-in-a-string/
GeeksforGeeks: https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1


Remove Duplicates from String //complete

// Notes -> Use LinkedHashSet for keeping only unique element in set in similar order


GeeksforGeeks: https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1


Check if strings are rotations  //complete


// Notes -> We need to use KMP algorithm to solve the Questions in O(N) time complexity

// Apporach - > we need to create lps table and then with the help of that table we will travese and search the pattern

***************************************
CODE
***************************************

 <!-- public static boolean kmp(String s1,String s2){
        int[] lps = computeLPS(s2);
        int i = 0,j=0;
        while(i<s1.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
                if(j == s2.length()) return true;
            }else{
                if(j!=0) j = lps[j-1];
                else i++;
            }
        }
        return false;
    } -->
    
    <!-- private static int[] computeLPS(String s2) {
    int n = s2.length();
    int[] lps = new int[n];
    int i = 0, j = 1;

    while (j < n) {
        if (s2.charAt(i) == s2.charAt(j)) {
            lps[j] = i + 1;
            i++;
            j++;
        } else if (i > 0) {
            i = lps[i - 1]; 
        } else {
            lps[j] = 0;
            j++;
        }
    }
    return lps;
} -->


// if question comes after how many rotaion we can get the same string then we just need to return the index

****************************************

GeeksforGeeks: https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1


Count and Say // complete

// Notes ->  just follow the algorithm use StringBuilder for faster approach

LeetCode: https://leetcode.com/problems/count-and-say/


Reverse Words in a String // complete

Notes -> we use split("\\s+") this allow us to remove any other in between extra space


LeetCode: https://leetcode.com/problems/reverse-words-in-a-string/



Accenture/Capgemini (Medium Level)

Longest Common Prefix  // complete

Notes -> to solve this type of question sort the array and then compare the string at 0th index and the last index and return the longest comman prefix

LeetCode: https://leetcode.com/problems/longest-common-prefix/
GeeksforGeeks: https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1


Valid Anagram   // complete

Notes -> Use of hashing to solve the question O(n),we can also use sorting apprachh in which we sort the both the string and then check for anagram

LeetCode: https://leetcode.com/problems/valid-anagram/
GeeksforGeeks: https://practice.geeksforgeeks.org/problems/anagram-1587115620/1


String Compression  // complete

LeetCode: https://leetcode.com/problems/string-compression/


Implement strStr()  // complete

LeetCode: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/


Generate Parentheses  // complete 

Notes -> usage of the backtrack approach

LeetCode: https://leetcode.com/problems/generate-parentheses/


Group Anagrams // complete

Notes -> Use HashMap to solve the problem , sort the array and then take sorted string as key and value will be arraylist

LeetCode: https://leetcode.com/problems/group-anagrams/


Longest Substring Without Repeating Characters  // complete

Notes -> Use Of Sliding Window And HashSet...

LeetCode: https://leetcode.com/problems/longest-substring-without-repeating-characters/


String to Integer (Complex Cases)  // solved Already

LeetCode: https://leetcode.com/problems/string-to-integer-atoi/



Goldman Sachs (Medium-Hard Level)

Valid Parentheses  // complete

Notes -> Usage of Stack Data Structure

LeetCode: https://leetcode.com/problems/valid-parentheses/


Decode String  // complete

Notes -> Usage of StringBuilder and Two Stack
LeetCode: https://leetcode.com/problems/decode-string/


Longest Valid Parentheses  // complete

LeetCode: https://leetcode.com/problems/longest-valid-parentheses/


Minimum Window Substring  // complete 

Notes -> usage of sliding window approach

LeetCode: https://leetcode.com/problems/minimum-window-substring/


Basic Calculator

LeetCode: https://leetcode.com/problems/basic-calculator/


Text Justification

LeetCode: https://leetcode.com/problems/text-justification/


Integer to English Words

LeetCode: https://leetcode.com/problems/integer-to-english-words/


Regular Expression Matching

LeetCode: https://leetcode.com/problems/regular-expression-matching/



Microsoft (Medium-Hard Level)

Longest Palindromic Substring

LeetCode: https://leetcode.com/problems/longest-palindromic-substring/


Letter Combinations of a Phone Number

LeetCode: https://leetcode.com/problems/letter-combinations-of-a-phone-number/


Word Break

LeetCode: https://leetcode.com/problems/word-break/


Word Search II

LeetCode: https://leetcode.com/problems/word-search-ii/


Distinct Subsequences

LeetCode: https://leetcode.com/problems/distinct-subsequences/


Palindrome Pairs

LeetCode: https://leetcode.com/problems/palindrome-pairs/


Shortest Palindrome

LeetCode: https://leetcode.com/problems/shortest-palindrome/



Google (Hard Level)

Wildcard Matching

LeetCode: https://leetcode.com/problems/wildcard-matching/


Word Break II

LeetCode: https://leetcode.com/problems/word-break-ii/


Concatenated Words

LeetCode: https://leetcode.com/problems/concatenated-words/


Stream of Characters

LeetCode: https://leetcode.com/problems/stream-of-characters/


Longest Duplicate Substring

LeetCode: https://leetcode.com/problems/longest-duplicate-substring/


Minimum Window Subsequence

LeetCode Premium: https://leetcode.com/problems/minimum-window-subsequence/


Design Search Autocomplete System

LeetCode Premium: https://leetcode.com/problems/design-search-autocomplete-system/


Valid Number

LeetCode: https://leetcode.com/problems/valid-number/



Additional Important String Problems

KMP Algorithm Implementation

GeeksforGeeks: https://practice.geeksforgeeks.org/problems/pattern-search-kmp/1


Rabin-Karp Algorithm

GeeksforGeeks: https://practice.geeksforgeeks.org/problems/pattern-search/1


Z Algorithm

GeeksforGeeks: https://practice.geeksforgeeks.org/problems/z-algorithm/1Company-Wise String DSA Interview Questions
TCS/Infosys/Wipro (Easy-Medium Level)

