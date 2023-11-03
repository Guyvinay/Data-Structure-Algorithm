def maxContiguousSubArray(A):
    currSum = A[0]
    maxSum = A[0]
    for n in A[1:] :
        currSum = max(currSum+n,n)
        maxSum  = max(currSum, maxSum)
    return maxSum

T = int(input())
for _ in range(T):    
    N = int(input())
    A = list(map(int, input().split()))
    ans = maxContiguousSubArray(A)
    print(ans)