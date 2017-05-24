package by.dt.util.constants;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
public class UrlClientConstants {

    public final static class BOAO_PROMTORG {
        private static final String GENERAL_URL = "/boao-promtorg/v1";

        public static final String GET_ALL_CATEGORIES = GENERAL_URL + "/categories";
    }

    public final static class USER_STORAGE {
        private static final String GENERAL_URL = "/user-storage/v1";

        public static final String GET_FAVORITE_CATEGORIES = GENERAL_URL + "/{id}/settings/favoriteCategories";
        public static final String GET_FAVORITE_TRADING_NETWORKS = GENERAL_URL + "/{id}/settings/favoriteTradingNetworks";

        public static final String PUT_FAVORITE_CATEGORIES = GENERAL_URL + "/{id}/settings/favoriteCategories";
        public static final String PUT_FAVORITE_TRADING_NETWORKS = GENERAL_URL + "/{id}/settings/favoriteTradingNetworks";
        public static final String PUT_USER_SETTINGS = GENERAL_URL + "/{id}/settings";
        public static final String PUT_PERSONAL_INFORMATION = GENERAL_URL + "/{id}/personalInformation";

        public static final String POST_REGISTRATION = GENERAL_URL + "/registration";
    }
}
