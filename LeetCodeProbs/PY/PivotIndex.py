def find_pivot(arr):
    arr_sum = sum(arr)
    left=0
    for i in range(len(arr)):
        arr_sum-=arr[i]
        if left==arr_sum:
            return i
        left=left+arr[i]        
    return -1
nums = [1, 7, 3, 6, 5, 6]
result = find_pivot(nums)
print(result)    