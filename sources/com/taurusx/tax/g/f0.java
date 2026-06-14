package com.taurusx.tax.g;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.taurusx.tax.log.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66125c = "market://";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66126w = "play.google.com";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66127y = "market";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66128z = "market.android.com";

    public interface z {
        void z(Context context, Intent intent);
    }

    public static boolean z(Context context, WebView webView, String str) {
        return z(context, webView, str, null);
    }

    public static boolean z(Context context, WebView webView, String str, z zVar) {
        if (c.y(str) && c.z(context, str, zVar)) {
            return true;
        }
        if (y.z(str) && y.z(context, webView, str, zVar)) {
            return true;
        }
        return w.z(str) && w.z(context, str, zVar);
    }

    public static class c {
        public static boolean w(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th2) {
                LogUtil.d("taurusx", Log.getStackTraceString(th2));
                return false;
            }
        }

        public static boolean y(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return w(str) || z(str);
        }

        public static boolean z(String str) {
            Uri uri;
            try {
                if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || TextUtils.isEmpty(uri.getHost())) {
                    return false;
                }
                if (TextUtils.equals(f0.f66126w, uri.getHost())) {
                    return true;
                }
                if (TextUtils.equals(f0.f66128z, uri.getHost())) {
                    return true;
                }
            } catch (Throwable th2) {
                LogUtil.d("taurusx", Log.getStackTraceString(th2));
            }
            return false;
        }

        public static List<ResolveInfo> w(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(z(context), 0);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public static Intent z(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.package.name"));
        }

        public static boolean z(Context context, String str, z zVar) {
            try {
                List<ResolveInfo> listW = w(context);
                if (listW != null && !listW.isEmpty()) {
                    if (!w(str)) {
                        if (z(str)) {
                            str = f0.f66125c + str.substring(str.indexOf("details?id="));
                        } else {
                            str = null;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    Intent intentZ = z(context);
                    intentZ.setData(Uri.parse(str));
                    intentZ.addFlags(268435456);
                    Iterator<ResolveInfo> it = listW.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            intentZ.setPackage("com.android.vending");
                            break;
                        }
                    }
                    if (zVar != null) {
                        zVar.z(context, intentZ);
                        return true;
                    }
                    context.startActivity(intentZ);
                    return true;
                }
            } catch (Exception e10) {
                LogUtil.d("taurusx", "handle market url exception " + e10);
            }
            return false;
        }
    }

    public static class w {
        public static boolean z(Context context, String str, z zVar) {
            try {
                Uri uri = Uri.parse(str);
                if (uri == null) {
                    return false;
                }
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(268435456);
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    return false;
                }
                if (zVar != null) {
                    zVar.z(context, intent);
                    return true;
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static boolean z(String str) {
            return (TextUtils.isEmpty(str) || URLUtil.isValidUrl(str)) ? false : true;
        }
    }

    public static class y {
        public static boolean z(Context context, WebView webView, String str, z zVar) {
            try {
                Intent uri = Intent.parseUri(str, 1);
                if (uri == null) {
                    return false;
                }
                uri.addFlags(268435456);
                if (uri.resolveActivity(context.getPackageManager()) != null) {
                    if (zVar != null) {
                        zVar.z(context, uri);
                    } else {
                        context.startActivity(uri);
                    }
                    return true;
                }
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (TextUtils.isEmpty(stringExtra)) {
                    return false;
                }
                if (c.y(stringExtra) && c.z(context, stringExtra, zVar)) {
                    return true;
                }
                if (webView == null || !stringExtra.startsWith("http")) {
                    return false;
                }
                webView.loadUrl(stringExtra);
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                LogUtil.d("taurusx", "handle intent url exception " + e10);
                return false;
            }
        }

        public static boolean z(String str) {
            return !TextUtils.isEmpty(str) && str.startsWith("intent://");
        }
    }
}
