numeros = [1,2,3,4]
nums2 = [5,10,50,600]

#Recorriendo la lista de numeros
for num in numeros:
    print("Numeros = ",num)

#Recorriendo la lista nums2 y multiplicando los valores * 3
for num in nums2:
    res = num*3
    print (res)

for numeros, nums2 in zip(nums2,numeros):
    print(numeros)
    print(nums2)