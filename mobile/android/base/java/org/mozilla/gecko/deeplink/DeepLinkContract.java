/* -*- Mode: Java; c-basic-offset: 4; tab-width: 4; indent-tabs-mode: nil; -*-
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.gecko.deeplink;

import java.util.Arrays;
import java.util.List;

// This class defines the contract when using deep links
public class DeepLinkContract {

    // Sumo page for setting Fennec as default browser
    public static final String SUMO_DEFAULT_BROWSER = "";
    public static final String DEEP_LINK_SCHEME = "waterfox";

    public static final String LINK_FXA_SIGNIN = "fxa-signin";

    public static final String LINK_OPEN = "open";
    public static final String LINK_DEFAULT_BROWSER = "default_browser";
    public static final String LINK_SEARCH_WIDGET = "search_widget";
    public static final String LINK_SAVE_AS_PDF = "save_as_pdf";
    public static final String LINK_BOOKMARK_LIST = "bookmark_list";
    public static final String LINK_HISTORY_LIST = "history_list";
    public static final String LINK_SIGN_UP = "sign_up";
    public static final String LINK_PREFERENCES_GENERAL = "preferences_general";
    public static final String LINK_PREFERENCES = "preferences";
    public static final String LINK_PREFERENCES_PRIAVACY = "preferences_privacy";
    public static final String LINK_PREFERENCES_SEARCH = "preferences_search";
    public static final String LINK_PREFERENCES_NOTIFICATIONS = "preferences_notifications";
    public static final String LINK_PREFERENCES_ACCESSIBILITY = "preferences_accessibility";
    public static final String LINK_PREFERENCES_HOME = "preferences_home";

    public static final String URL_PARAM = "url";

    public static final String ACCOUNTS_TOKEN_PARAM = "signin";
    public static final String ACCOUNTS_ENTRYPOINT_PARAM = "entrypoint";
    public static final String ACCOUNTS_UTM_PREFIX = "utm_";
}
