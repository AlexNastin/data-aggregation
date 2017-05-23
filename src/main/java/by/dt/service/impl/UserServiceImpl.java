package by.dt.service.impl;

import by.dt.client.UserStorageClient;
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
    public ResponseEntity updateInterestedCategories(String idUser, List<String> interestedCategoryIds, Properties uriParameters) {
        return userStorageClient.sendPut(UrlClientConstants.USER_STORAGE.PUT_INTERESTED_CATEGORIES, interestedCategoryIds, uriParameters);
    }
}
