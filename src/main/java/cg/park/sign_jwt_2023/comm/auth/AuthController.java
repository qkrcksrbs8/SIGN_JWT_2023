package cg.park.sign_jwt_2023.comm.auth;

import cg.park.sign_jwt_2023.comm.util.JwtProvider;
import cg.park.sign_jwt_2023.comm.util.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

//@RestControllerAdvice
@RequestMapping("/auth")
@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping("/token")
    public ResponseEntity<Param> token(Auth auth) throws Exception {
        return authService.token(auth);
    }

}
