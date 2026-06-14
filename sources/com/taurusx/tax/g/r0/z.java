package com.taurusx.tax.g.r0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.internal.AssetHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.g.c0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;

/* JADX INFO: loaded from: classes11.dex */
public class z {
    public static Intent w(Uri uri) throws Exception {
        if (!y.HANDLE_SHARE_TWEET.shouldTryHandlingUrl(uri)) {
            throw new Exception("URL does not have taxshare://tweet? format.");
        }
        try {
            String queryParameter = uri.getQueryParameter(FirebaseAnalytics.Param.SCREEN_NAME);
            String queryParameter2 = uri.getQueryParameter("tweet_id");
            if (TextUtils.isEmpty(queryParameter)) {
                throw new Exception("URL missing non-empty 'screen_name' query parameter.");
            }
            if (TextUtils.isEmpty(queryParameter2)) {
                throw new Exception("URL missing non-empty 'tweet_id' query parameter.");
            }
            String str = String.format("Check out @%s's Tweet: %s", queryParameter, String.format("https://twitter.com/%s/status/%s", queryParameter, queryParameter2));
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", str);
            return intent;
        } catch (UnsupportedOperationException unused) {
            LogUtil.d("taurusx", "Could not handle url: " + uri);
            throw new Exception("Passed-in URL did not create a hierarchical URI.");
        }
    }

    public static void y(Context context, Intent intent) {
        r.z(context);
        r.z(intent);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public static Intent z(Context context, Class cls, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public static boolean z(Context context, Intent intent) {
        try {
            return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static Intent z(Uri uri) throws Exception {
        r.z(uri);
        if (y.OPEN_NATIVE_BROWSER.shouldTryHandlingUrl(uri)) {
            if ("navigate".equals(uri.getHost())) {
                try {
                    String queryParameter = uri.getQueryParameter("url");
                    if (queryParameter != null) {
                        return new Intent("android.intent.action.VIEW", Uri.parse(queryParameter));
                    }
                    throw new Exception("URL missing 'url' query parameter.");
                } catch (UnsupportedOperationException unused) {
                    LogUtil.d("taurusx", "Could not handle url: " + uri);
                    throw new Exception("Passed-in URL did not create a hierarchical URI.");
                }
            }
            throw new Exception("URL missing 'navigate' host parameter.");
        }
        throw new Exception("URL does not have taxnativebrowser:// scheme.");
    }

    public static void w(Context context, Uri uri, String str) throws c0 {
        r.z(context);
        r.z(uri);
        LogUtil.d("taurusx", "Final URI to show in browser: " + uri);
        Bundle bundle = new Bundle();
        bundle.putString(TaxBrowserActivity.f66923n, uri.toString());
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(TaxBrowserActivity.f66924t, str);
        }
        z(context, z(context, TaxBrowserActivity.class, bundle), "Could not show TAXBrowser for url: " + uri + "\n\tPerhaps you forgot to declare TAXBrowser in your Android manifest file.");
    }

    public static void z(Context context, Intent intent, String str) {
        r.z.z(context);
        r.z.z(intent);
        try {
            y(context, intent);
        } catch (Throwable unused) {
        }
    }

    public static void z(Context context, Uri uri) throws c0 {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        r.z(context);
        r.z(uri);
        if (z(context, intent)) {
            w(context, intent);
            return;
        }
        throw new c0("Could not handle application specific action: " + uri + "\n\tYou may be running in the emulator or another device which does not have the required application.");
    }

    public static void w(Context context, Intent intent) throws c0 {
        r.z(context);
        r.z(intent);
        if (z(context, intent)) {
            String str = "Unable to open intent: " + intent;
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            z(context, intent, str);
            return;
        }
        String stringExtra = intent.getStringExtra("browser_fallback_url");
        if (TextUtils.isEmpty(stringExtra)) {
            if (!"market".equalsIgnoreCase(intent.getScheme())) {
                z(context, z(intent));
                return;
            }
            throw new c0("Device could not handle neither intent nor market url.\nIntent: " + intent.toString());
        }
        Uri uri = Uri.parse(stringExtra);
        String scheme = uri.getScheme();
        if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
            z(context, uri);
        } else {
            w(context, uri, null);
        }
    }

    public static Uri z(Intent intent) {
        r.z(intent);
        return Uri.parse("market://details?id=" + intent.getPackage());
    }

    public static void z(Context context, Uri uri, String str) throws c0 {
        r.z(context);
        r.z(uri);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        z(context, intent, str);
    }
}
