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

        public static final String GET_FAVORITE_TRADING_NETWORKS = GENERAL_URL + "/{id}/settings/favoriteTradingNetworks";

        public static final String PUT_INTERESTED_CATEGORIES = GENERAL_URL + "/{id}/settings/interestedCategories";
        public static final String PUT_FAVORITE_TRADING_NETWORKS = GENERAL_URL + "/{id}/settings/favoriteTradingNetworks";

        public static final String POST_REGISTRATION = GENERAL_URL + "/registration";
    }
}
