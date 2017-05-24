package by.dt.service;

import by.dt.entity.from.ui.RegistrationDataWrapper;
import by.dt.entity.from.ui.UserSettingsWrapper;
import by.dt.entity.to.ui.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Properties;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
public interface UserService {

    ResponseEntity updateInterestedCategories(String idUser, List<String> interestedCategoryIds, Properties uriParameters);

    UserDTO userRegistration(RegistrationDataWrapper registrationDataWrapper);

    ResponseEntity updateFavoriteTradingNetworks(String idUser, List<String> favoriteTradingNetworksIds, Properties uriParameters);

    List<String> getFavoriteTradingNetworks(String idUser, Properties uriParameters);

    ResponseEntity updateUserSettings(String idUser, UserSettingsWrapper userSettingsWrapper, Properties uriParameters);
}
