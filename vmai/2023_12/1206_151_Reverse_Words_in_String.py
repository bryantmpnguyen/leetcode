class Solution:
    def reverseWords(self, s: str) -> str:

        # Simultaneous Pass White Space Index Trimming
        start = 0
        end = len(s) - 1

        while (start < end) and (s[start] == ' ' or s[end] == ' '):
            if s[start] == ' ':
                start+=1
            
            if s[end] == ' ':
                end-=1
        
        strBuf = ''
        
        while start <= end:
            wordIdx = start

            # Get Word, idx will end off with a whitespace and/or the end 
            while wordIdx <= end and s[wordIdx] != ' ':
                wordIdx+=1
            
            strBuf = s[start:wordIdx] + ' ' + strBuf if strBuf != '' else s[start:wordIdx]

            # Skip Spaces. Next idx represents a non-white space character and/or the end 
            while wordIdx <= end and s[wordIdx] == ' ':
                wordIdx+=1
            
            # Reprime
            start = wordIdx
        
        return strBuf
