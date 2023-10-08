import numpy as np

arr = [
    [1, 2, 3],
    [4, 5, 6]
]

print("array : " + str(arr))

my_array = np.array(arr)
# print("np array : " + str(my_array))

# Dengan menggunakan type wrapper, kita mendapatkan fungsionalitas lebih dibandingkan tipe biasa
my_array = my_array.flatten()
print("np array (flat): " + str(my_array))

arr = my_array.tolist()
print("arr : " + str(arr))
