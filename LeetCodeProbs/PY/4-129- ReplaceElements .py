class Solution(object):
    def replaceElements(self, arr):
        val = -1
        for i in range(len(arr)-1, -1, -1) :
            temp = max(arr[i], val)
            arr[i] = val
            val = temp
        return arr