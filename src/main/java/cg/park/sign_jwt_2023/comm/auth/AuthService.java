package cg.park.sign_jwt_2023.comm.auth;

import cg.park.sign_jwt_2023.comm.util.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Service
public class AuthService {

    public ResponseEntity<Param> token(Auth auth) {
        // auth 파라미터 체크
        // 토큰 생성

        return new ResponseEntity<>(new Param(auth), HttpStatus.OK);
    }

}
