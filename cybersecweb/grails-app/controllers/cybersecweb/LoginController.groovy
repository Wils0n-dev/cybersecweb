package cybersecweb

class LoginController {

    // For simplicity, store a single user
    def username = "admin"
    def password = "Password123"
    def failedAttempts = 0
    def accountLocked = false

    // Default action redirects to login page
    def index() {
        redirect(action: "login")
    }

    def login() {
        if (accountLocked) {
            render(view: "login", model: [message: "Account locked due to too many failed attempts."])
            return
        }

        if (params.username && params.password) {
            if (params.username == username && params.password == password) {
                failedAttempts = 0
                render(view: "login", model: [message: "Login successful! Welcome ${username}."])
            } else {
                failedAttempts++
                if (failedAttempts >= 3) {
                    accountLocked = true
                    render(view: "login", model: [message: "Account locked due to 3 failed attempts."])
                } else {
                    render(view: "login", model: [message: "Incorrect username or password. Attempt ${failedAttempts}/3"])
                }
            }
        } else {
            render(view: "login", model: [message: "Please enter username and password."])
        }
    }
}