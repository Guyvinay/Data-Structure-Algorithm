def zeroesToEnd():
    arr = [0,1,1,0,0,1,1,1,0,0,0,1,0,1,0]
    print(arr)
    l = 0
    r = len(arr)-1
    while l<r :
        while l<r and arr[l] != 0:
            l+=1
        while l<r and arr[r] == 0 :
            r-=1
        arr[l],arr[r] = arr[r], arr[l]

    print(arr)       
zeroesToEnd()