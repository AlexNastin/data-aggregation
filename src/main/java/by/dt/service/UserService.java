package by.dt.service;

import by.dt.entity.from.ui.PersonalInformationWrapper;
import by.dt.entity.from.ui.RegistrationDataWrapper;
import by.dt.entity.from.ui.UserSettingsWrapper;
import by.dt.entity.to.ui.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
public interface UserService {

    ResponseEntity updateFavoriteCategories(String idUser, List<String> favoriteCategoryIds);

    List<String> getFavoriteCategories(String idUser);

    UserDTO userRegistration(RegistrationDataWrapper registrationDataWrapper);

    ResponseEntity updateFavoriteTradingNetworks(String idUser, List<String> favoriteTradingNetworksIds);

    List<String> getFavoriteTradingNetworks(String idUser);

    ResponseEntity updateUserSettings(String idUser, UserSettingsWrapper userSettingsWrapper);

    ResponseEntity updatePersonalInformation(String idUser, PersonalInformationWrapper personalInformationWrapper);
}
