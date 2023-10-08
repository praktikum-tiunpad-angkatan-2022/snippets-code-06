from enum import Enum

class shape(Enum):
    LINGKARAN = 0
    PERSEGI_PANJANG = 10
    PERSEGI = 10

print(shape.LINGKARAN) # shape.LINGKARAN

print(shape.LINGKARAN.name) # LINGKARAN

print(shape.LINGKARAN.value) # 0

print(type(shape.LINGKARAN)) # <enum 'shape'>

print(list(shape)) # [<shape.LINGKARAN: 0>, <shape.PERSEGI_PANJANG: 10>] ==> Persegi tidak terbaca

print(shape.PERSEGI.name) # PERSEGI_PANJANG ==> karena memiliki value yang sama, jadi tertimpa PERSEGI_PANJANG

print(shape(0)) # shape.LINGKARAN

print(shape['LINGKARAN'].value) # 0