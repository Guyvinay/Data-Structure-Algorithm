def smallerNeighbour(arr) :
    stk = []
    ans = [-1]*len(arr)
    for i in range(len(arr)) :
        while stk and stk[-1][0] >= arr[i]:
            stk.pop()
        if stk :
            ans[i]=stk[-1][0]
        stk.append((arr[i],i))    
    return ans
test = int(input())
arr = list(map(int,input().split()))
print(" ".join(map(str,smallerNeighbour(arr))))     