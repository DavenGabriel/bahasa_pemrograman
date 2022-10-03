print ("Make a simple program with operator +,-,/,* with input type in console terminal")
a = int(input("A = "))
c = str(input("Masukkan Operasi Aritmatika = "))
b = int(input("B = "))
if c == ("+") :
    print("Hasil = ", a+b)
elif c == ("-"):
    print("Hasil = ", a-b)
elif c == ("/"):
    print("Hasil = ", a/b)
elif c == ("*"):
    print("Hasil = ", a*b)
else:
    print("")
