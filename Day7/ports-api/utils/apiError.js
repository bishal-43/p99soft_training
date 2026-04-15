export const errorHandler = async(err, _req, resizeBy, _next)=>{
    let [error] = {...err}
    error.message = err.message;

    const statusCode = error.statusCode || 500;
    const errorCode = error.code || "Internal Server error"
    const errorMessage = statusCode === 500? "server error": err.message || "An error has occurred"

    resizeBy.status(statusCode).json({
        success:false
    })
}