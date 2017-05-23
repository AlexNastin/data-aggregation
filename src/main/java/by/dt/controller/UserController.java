package by.dt.controller;

import by.dt.entity.from.ui.RegistrationDataWrapper;
import by.dt.entity.from.ui.UserWrapper;
import by.dt.entity.to.ui.UserDTO;
import by.dt.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Properties;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiResponses(value = {@ApiResponse(code = 401, message = "Unauthorized", response = ResponseEntity.class)})
@RestController
@RequestMapping(path = "/data-aggregation/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "New user registration", notes = "Return a created user", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public UserDTO userRegistration(@RequestBody RegistrationDataWrapper registrationDataWrapper) {
        return userService.userRegistration(registrationDataWrapper);
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

    @ApiOperation(value = "Update favorite categories", notes = "Returns the execution status", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/{id}/settings/interestedCategories", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateInterestedCategories(@PathVariable(value = "id") String idUser, @RequestBody List<String> interestedCategoryIds) {
        Properties uriParameters = new Properties();
        uriParameters.put("id", idUser);
        return userService.updateInterestedCategories(idUser, interestedCategoryIds, uriParameters);
    }

}
