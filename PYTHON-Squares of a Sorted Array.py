class Solution(object):
    def sortedSquares(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        x = 0
        square = []
        for i in A:
            square.append(i ** 2)
            
        square.sort()
        return square
            
        
            