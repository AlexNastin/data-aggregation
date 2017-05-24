package by.dt.service.impl;

import by.dt.client.UserStorageClient;
import by.dt.entity.from.ui.PersonalInformationWrapper;
import by.dt.entity.from.ui.RegistrationDataWrapper;
import by.dt.entity.from.ui.UserSettingsWrapper;
import by.dt.entity.to.ui.UserDTO;
import by.dt.service.UserService;
import by.dt.util.constants.UrlClientConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserStorageClient userStorageClient;

    @Autowired
    public UserServiceImpl(UserStorageClient userStorageClient) {
        this.userStorageClient = userStorageClient;
    }

    @Override
    public ResponseEntity updateFavoriteCategories(String idUser, List<String> favoriteCategoryIds) {
        Properties uriParameters = new Properties();
        uriParameters.put("id", idUser);
        return userStorageClient.sendPut(UrlClientConstants.USER_STORAGE.PUT_FAVORITE_CATEGORIES, favoriteCategoryIds, uriParameters);
    }

    @Override
    public List<String> getFavoriteCategories(String idUser) {
        Properties uriParameters = new Properties();
        uriParameters.put("id", idUser);
        return (List<String>) userStorageClient.sendGet(UrlClientConstants.USER_STORAGE.GET_FAVORITE_CATEGORIES, uriParameters).getBody();
    }

    @Override
    public UserDTO userRegistration(RegistrationDataWrapper registrationDataWrapper) {
        return (UserDTO) userStorageClient.sendPost(UrlClientConstants.USER_STORAGE.POST_REGISTRATION, registrationDataWrapper).getBody();
    }

    @Override
    public ResponseEntity updateFavoriteTradingNetworks(String idUser, List<String> favoriteTradingNetworksIds) {
        Properties uriParameters = new Properties();
        uriParameters.put("id", idUser);
        return userStorageClient.sendPut(UrlClientConstants.USER_STORAGE.PUT_FAVORITE_TRADING_NETWORKS, favoriteTradingNetworksIds, uriParameters);
    }

    @Override
    public List<String> getFavoriteTradingNetworks(String idUser) {
        Properties uriParameters = new Properties();
        uriParameters.put("id", idUser);
        return (List<String>) userStorageClient.sendGet(UrlClientConstants.USER_STORAGE.GET_FAVORITE_TRADING_NETWORKS, uriParameters).getBody();
    }

    @Override
    public ResponseEntity updateUserSettings(String idUser, UserSettingsWrapper userSettingsWrapper) {
        Properties uriParameters = new Properties();
        uriParameters.put("id", idUser);
        return userStorageClient.sendPut(UrlClientConstants.USER_STORAGE.PUT_USER_SETTINGS, userSettingsWrapper, uriParameters);
    }

    @Override
    public ResponseEntity updatePersonalInformation(String idUser, PersonalInformationWrapper personalInformationWrapper) {
        Properties uriParameters = new Properties();
        uriParameters.put("id", idUser);
        return userStorageClient.sendPut(UrlClientConstants.USER_STORAGE.PUT_PERSONAL_INFORMATION, personalInformationWrapper, uriParameters);
    }
}
