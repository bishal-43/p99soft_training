from app.core.security import hash_password, verify_password


dummy_users = {
    "admin":{
        "username":"admin",
        "password":hash_password("1234")
    }
}


def authenticate_user(username:str,password:str):
    user = dummy_users.get(username)

    if not user:
        return None
    
    if not verify_password(password, user["password"]):
        return None
    
    return user