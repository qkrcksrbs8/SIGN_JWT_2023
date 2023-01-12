package cg.park.sign_jwt_2023.comm.auth;

import cg.park.sign_jwt_2023.comm.util.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//@RestControllerAdvice
@RequestMapping("/auth")
@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/token")
    public ResponseEntity<Param> token(Auth auth) throws Exception {
        return authService.token(auth);
    }

    @GetMapping("/token")
    public ResponseEntity<Param> cert(@RequestHeader(value = "Authorization") String token) throws Exception {
        return authService.cert(token);
    }

}
