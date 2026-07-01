def createLogin(func):
    def login():
        print("Attempting to login")
        func()
        print("login success")
    return login

@createLogin
def login():
    print("loging...")

login()