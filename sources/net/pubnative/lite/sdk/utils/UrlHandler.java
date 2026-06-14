package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.taurusx.tax.g.f0;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class UrlHandler {
    private static final String DEEPLINK_PARAM = "deeplinkUrl";
    private static final String DEEPLINK_URL_SCHEMA = "vrvdl";
    private static final String FALLBACK_PARAM = "fallbackUrl";
    private static final String TAG = "UrlHandler";
    private final IntentHandler mIntentHandler;

    public UrlHandler(Context context) {
        this.mIntentHandler = new IntentHandler(context);
    }

    String getDeeplinkUrl(Uri uri) {
        String queryParameter = uri.getQueryParameter(DEEPLINK_PARAM);
        if (TextUtils.isEmpty(queryParameter) || queryParameter.equalsIgnoreCase("\"\"")) {
            return null;
        }
        return queryParameter;
    }

    String getFallbackUrl(Uri uri) {
        String queryParameter = uri.getQueryParameter(FALLBACK_PARAM);
        if (TextUtils.isEmpty(queryParameter) || queryParameter.equalsIgnoreCase("\"\"")) {
            return null;
        }
        return queryParameter;
    }

    String handleDeeplinkIfPresent(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(DEEPLINK_URL_SCHEMA)) {
            try {
                Uri uri = Uri.parse(str2);
                String deeplinkUrl = getDeeplinkUrl(uri);
                String fallbackUrl = getFallbackUrl(uri);
                if (!TextUtils.isEmpty(deeplinkUrl)) {
                    Uri uri2 = Uri.parse(deeplinkUrl);
                    String scheme = uri2.getScheme();
                    if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                        if (this.mIntentHandler.handleDeepLink(uri2)) {
                            return null;
                        }
                        if (TextUtils.isEmpty(fallbackUrl)) {
                        }
                        return fallbackUrl;
                    }
                    if (this.mIntentHandler.canHandleIntent(uri2)) {
                        this.mIntentHandler.handleDeepLink(uri2);
                        return null;
                    }
                    if (TextUtils.isEmpty(fallbackUrl)) {
                    }
                    return fallbackUrl;
                }
                if (!TextUtils.isEmpty(fallbackUrl)) {
                    return fallbackUrl;
                }
            } catch (RuntimeException e10) {
                Logger.e(TAG, "Error parsing deeplink url: " + e10.getMessage());
            }
        }
        return str;
    }

    void handleNavigation(String str, String str2) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (isPlayStoreLink(scheme, uri.getHost(), uri.toString().toLowerCase(Locale.ROOT))) {
            this.mIntentHandler.handleDeepLink(uri);
            return;
        }
        if (!isHttpOrHttps(scheme)) {
            if (TextUtils.isEmpty(scheme)) {
                return;
            }
            this.mIntentHandler.handleDeepLink(uri);
        } else if ("internal".equalsIgnoreCase(str2)) {
            this.mIntentHandler.handleBrowserLinkBrowserActivity(uri);
        } else {
            this.mIntentHandler.handleBrowserLink(uri);
        }
    }

    public void handleUrl(String str, String str2, String str3) {
        String strHandleDeeplinkIfPresent = handleDeeplinkIfPresent(str, str2);
        if (TextUtils.isEmpty(strHandleDeeplinkIfPresent)) {
            return;
        }
        Logger.d(TAG, "Handling url: " + strHandleDeeplinkIfPresent);
        handleNavigation(strHandleDeeplinkIfPresent, str3);
    }

    boolean isHttpOrHttps(String str) {
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    boolean isPlayStoreLink(String str, String str2, String str3) {
        return f0.f66126w.equalsIgnoreCase(str2) || f0.f66128z.equalsIgnoreCase(str2) || "market".equalsIgnoreCase(str) || str3.startsWith(f0.f66126w) || str3.startsWith("market.android.com/");
    }
}
