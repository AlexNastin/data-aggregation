package by.dt.controller;

import by.dt.entity.from.ui.PersonalInformationWrapper;
import by.dt.entity.from.ui.RegistrationDataWrapper;
import by.dt.entity.from.ui.UserSettingsWrapper;
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

    @ApiOperation(value = "Update all user settings", notes = "Returns the execution status", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateUserSettings(@RequestBody UserSettingsWrapper userSettingsWrapper, @PathVariable(value = "id") String idUser) {
        return userService.updateUserSettings(idUser, userSettingsWrapper);
    }

    @ApiOperation(value = "Обновление персональных данных пользователя", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/personalInformation", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updatePersonalInformation(@RequestBody PersonalInformationWrapper personalInformationWrapper, @PathVariable(value = "id") String idUser) {
        return userService.updatePersonalInformation(idUser, personalInformationWrapper);
    }

    @ApiOperation(value = "Update favorite categories", notes = "Returns the execution status", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/{id}/settings/favoriteCategories", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateFavoriteCategories(@PathVariable(value = "id") String idUser, @RequestBody List<String> favoriteCategoryIds) {
        return userService.updateFavoriteCategories(idUser, favoriteCategoryIds);
    }

    @ApiOperation(value = "Get favorite categories", notes = "Returns the ids favorite categories", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings/favoriteCategories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getFavoriteCategories(@PathVariable(value = "id") String idUser) {
        return userService.getFavoriteCategories(idUser);
    }

    @ApiOperation(value = "Update favorite trading networks", notes = "Returns the execution status", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings/favoriteTradingNetworks", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateFavoriteTradingNetworks(@RequestBody List<String> favoriteTradingNetworksIds, @PathVariable(value = "id") String idUser) {
        return userService.updateFavoriteTradingNetworks(idUser, favoriteTradingNetworksIds);
    }

    @ApiOperation(value = "Get favorite trading networks", notes = "Returns the ids favorite trading networks", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings/favoriteTradingNetworks", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getFavoriteTradingNetworks(@PathVariable(value = "id") String idUser) {
        return userService.getFavoriteTradingNetworks(idUser);
    }

}
