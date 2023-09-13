def fisOcc(arr,size,i,ans):
    if i == size:
        return False

    if arr[i] == ans:
        print("The First occurrence of value {} is in {}th position".format(ans, i+1))
        i = size - 1

    fisOcc(arr, size,i+1,ans)

st = [3,5,1,3,8,0,9,5,4,8,6]
sc = len(st)
N = int(input("Enter the number: "))
l = 0
found = fisOcc(st, sc, l, N)

if not found:
    print("The value you entered is not found in the array.")

