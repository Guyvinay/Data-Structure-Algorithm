from collections import defaultdict
def groupAnagrams(num, arr):
    strDict = defaultdict(list)
    for str in arr :
        sorted_string = ''.join(sorted(str))
        strDict[sorted_string].append(str)
        # print(sorted_string)
    # return strDict
    return list(strDict.values())

test = int(input())
for _ in range(test) :
    num = int(input())
    strList = []
    for _ in range(num) :
        strList.append(input())
    ans = groupAnagrams(num,strList)
    for li in ans :
        print(len(li))
        for str in li :
            print(str)