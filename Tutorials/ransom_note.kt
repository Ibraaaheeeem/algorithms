"""
383. Ransom Note
Easy

4912

496

Add to List

Share
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
"""

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        // convert string to a list of characteres
        var myMagazine = magazine.toMutableList()

        // For every character in ransomNote, check ifit exits in magazine
        // When a character doesn't exist, return false
        for (char in ransomNote){
            if (char in myMagazine){
                myMagazine.remove(char)
            }
            else return false
        }
        return true
    }
}