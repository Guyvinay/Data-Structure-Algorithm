def longestConsecutiveSubsequence(arr):
    num_set = set(arr)
    # print(num_set)
    mx = 0
    for num in arr :
        if num-1 not in num_set :
            curr = num
            pt = 1
            while curr+1 in num_set :
                curr=curr+1
                pt=pt+1
            if pt>mx:
                mx=pt
    return mx
ans = longestConsecutiveSubsequence([100,4,200,1,3,2]) 
print(ans)   