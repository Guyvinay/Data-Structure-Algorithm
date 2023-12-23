from colorama import Fore
def whole_some(str) :
    lines = []
    for y in range(15, -15, -1) :
        line = ""
        for x in range(-30, 30) :
            f = ((x*0.05)**2+(y*0.1)**2-1)**3-(x*0.05)**2*(y*0.1)**3
            line += str[(x-y)%len(str)]if f<=0 else " "
        lines.append(line)
    print(Fore.RED+"\n".join(lines))
    print(Fore.GREEN+str)        
whole_some("Merry Christmas")    