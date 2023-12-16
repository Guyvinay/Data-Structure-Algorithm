def searchInLogN(k,arr):
    l = 0
    r = len(arr)-1
    while(l<=r) :
        mid = l+int((r-l)/2)
        if(arr[mid]==k) : return mid
        elif(arr[mid]>k) : r = mid-1
        else :  l = mid+1
    return -1    
test = int(input())
arr = list(map(int, input().split()))
k = int(input())
ans = searchInLogN(k, arr)
print(ans)