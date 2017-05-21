package by.dt.controller;

import by.dt.entity.from.ui.RegistrationDataWrapper;
import by.dt.entity.from.ui.UserWrapper;
import by.dt.entity.to.ui.UserDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiResponses(value = {@ApiResponse(code = 401, message = "Unauthorized", response = ResponseEntity.class)})
@RestController
@RequestMapping(path = "/data-aggregation/v1/user")
public class UserController {

    @ApiOperation(value = "New user registration", notes = "Return a created user", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public UserDTO userRegistration(@RequestBody RegistrationDataWrapper registrationDataWrapper) {
        return new UserDTO();
    }

    @ApiOperation(value = "UserDTO authentication", notes = "Returns an authorized user", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/authentication", method = RequestMethod.POST)
    public UserDTO userAuthentication(@RequestBody RegistrationDataWrapper registrationDataWrapper) {
        return new UserDTO();
    }

    @ApiOperation(value = "Update user and user settings", notes = "Returns the execution status", produces = MediaType.TEXT_HTML_VALUE)
    /*@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", ),
            @ApiResponse(code = 404, message = "UserDTO not found", response = String.class)})*/
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateUser(@RequestBody UserWrapper user) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
