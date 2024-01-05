def numberOfOccurences(num, k, arr):
    lower = lower_bound(num,k,arr)
    upper = upper_bound(num,k,arr)
    return upper-lower
    
def upper_bound(num, k, arr) :
    i=0
    j=num-1
    upper=-1
    while(i<=j):
        mid = int((i+j)/2)
        if(arr[mid]<=k) :
            upper = mid
            i = mid+1
        else : j = mid-1
    return upper+1    
def lower_bound(num, k, arr) :
    i=0
    j=num-1
    lower = -1
    while(i<=j):
        mid = int((i+j)/2)
        if(arr[mid]==k):
            lower = mid
            j = mid-1
        elif(arr[mid]>k): j = mid-1
        else : i = mid+1
    return lower
    
nums = list(map(int, input().split()))
arr = list(map(int, input().split()))
# print(nums)
# print(arr)
ans = numberOfOccurences(nums[0],nums[1],arr)
print(ans)