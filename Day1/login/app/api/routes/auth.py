from fastapi import (APIRouter,Depends,HTTPException,status)

from fastapi.security import (OAuth2PasswordBearer, OAuth2PasswordRequestForm)

from app.services.auth_services import authenticate_user

from app.core.security import create_access_token

router = APIRouter()

oauth2_scheme = OAuth2PasswordBearer(tokenUrl="login")

@router.post("/login")
def login(form_data: OAuth2PasswordRequestForm=Depends()):
    user = authenticate_user(form_data.username,form_data.password)

    if not user:
        raise HTTPException(
            status_code=status.HTTP_401_UNAUTHORIZED,
            detail="Invalid Credentials"
        )
    
    token = create_access_token(
        data={
            "sub": user["username"]
        }
    )

    return {
        "access_token":token,
        "token_type":"bearer"
    }


@router.get("/protected")
def protected(token:str = Depends(oauth2_scheme)):
    return {
        "message": "protected route accessed",
        "token": token
    }