package cg.park.sign_jwt_2023.comm.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseProxy {

    public ResponseEntity<Param> result (Object obj) {
        return new ResponseEntity<>(new Param(obj), HttpStatus.OK);
    }

}
