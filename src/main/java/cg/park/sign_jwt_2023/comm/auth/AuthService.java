package cg.park.sign_jwt_2023.comm.auth;

import cg.park.sign_jwt_2023.comm.util.JwtProvider;
import cg.park.sign_jwt_2023.comm.util.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Service
public class AuthService {

    @Autowired
    JwtProvider jwt;

    public ResponseEntity<Param> token(Auth auth) throws Exception{
        return new ResponseEntity<>(new Param(isAuthCheck(auth) ? "" : jwt.create(auth.getData())), HttpStatus.OK);
    }

    private boolean isAuthCheck(Auth auth) {
        return null == auth || "".equals(auth.getData());
    }

}
