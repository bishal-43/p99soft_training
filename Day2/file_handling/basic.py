
with open("demo.txt","w") as f:
    f.write("This is a demo file")


with open("demo.txt") as f:
    print(f.read())

f.close()
