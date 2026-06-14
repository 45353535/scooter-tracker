package com.appodeal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;
import com.appodeal.ads.utils.Log;
import com.ironsource.N6;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public class zc implements RestrictedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zc f15321a = new zc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f15322b;

    @Override // com.appodeal.ads.RestrictedData
    public final boolean canSendLocation() {
        return (y3.a() || isParameterBlocked(N6.f41419s) || isParameterBlocked("lon")) ? false : true;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean canSendLocationType() {
        return (y3.a() || isParameterBlocked("lt")) ? false : true;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean canSendUserSettings() {
        return (y3.a() || isParameterBlocked("user_settings")) ? false : true;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getCity() {
        if (canSendUserSettings()) {
            return o6.a().f14252h;
        }
        return null;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final ConnectionData getConnectionData(Context context) {
        return j2.h(context);
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getCountry() {
        if (canSendUserSettings()) {
            return o6.a().f14248d;
        }
        return null;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getHttpAgent(Context context) {
        String string;
        String property = null;
        if (!canSendUserSettings()) {
            return null;
        }
        String str = f15322b;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            f15322b = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th2) {
            Log.log(LogConstants.KEY_SDK, "HttpAgent", "Failed to receive DefaultUserAgent: " + th2.getMessage());
        }
        if (f15322b == null) {
            try {
                StringBuilder sb2 = new StringBuilder("Mozilla/5.0 (Linux; Android ");
                HashMap map = j2.f13491a;
                sb2.append(Build.VERSION.RELEASE);
                sb2.append("; ");
                sb2.append(Build.MODEL);
                sb2.append(" Build/");
                sb2.append(Build.ID);
                sb2.append("; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo("com.google.android.webview", PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo("com.google.android.webview", 0);
                    sb2.append(" Chrome/");
                    sb2.append(packageInfo.versionName);
                } catch (Throwable th3) {
                    Log.log(LogConstants.KEY_SDK, "generateHttpAgent", "Failed to receive PackageInfo: " + th3.getMessage());
                }
                sb2.append(" Mobile");
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    PackageInfo packageInfo2 = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(context.getPackageName(), 0);
                    sb2.append(" ");
                    int i10 = applicationInfo.labelRes;
                    sb2.append(i10 == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i10));
                    sb2.append("/");
                    sb2.append(packageInfo2.versionName);
                } catch (Throwable th4) {
                    Log.log(LogConstants.KEY_SDK, "generateHttpAgent", "Failed to receive PackageInfo: " + th4.getMessage());
                }
                string = sb2.toString();
            } catch (Throwable unused) {
                string = null;
            }
            f15322b = string;
        }
        if (f15322b == null) {
            try {
                property = System.getProperty("http.agent", "");
            } catch (Throwable th5) {
                Log.log(th5);
            }
            f15322b = property;
        }
        if (f15322b == null) {
            f15322b = "";
        }
        return f15322b;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getIabConsentString() {
        com.appodeal.ads.regulator.b0 b0Var = (com.appodeal.ads.regulator.b0) v4.f15141b.getValue();
        String str = ((com.appodeal.ads.regulator.shared.g) ((com.appodeal.ads.regulator.shared.a) b0Var.f14347b.getValue())).f14381c;
        return str == null ? ((com.appodeal.ads.regulator.shared.g) ((com.appodeal.ads.regulator.shared.a) b0Var.f14347b.getValue())).f14382d : str;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getIfa() {
        return v4.f15145f.getId();
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getIp() {
        if (canSendUserSettings()) {
            return o6.a().f14246b;
        }
        return null;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final LocationData getLocation(Context context) {
        return new jd(context, this);
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getUSPrivacyString() {
        return ((com.appodeal.ads.regulator.shared.g) ((com.appodeal.ads.regulator.shared.a) ((com.appodeal.ads.regulator.b0) v4.f15141b.getValue()).f14347b.getValue())).f14383e;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getUserId() {
        return o6.a().f14245a;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final String getZip() {
        if (canSendUserSettings()) {
            return o6.a().f14253i;
        }
        return null;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean isLimitAdTrackingEnabled() {
        return v4.f15145f.getIsLimitAdTrackingEnabled();
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean isParameterBlocked(String str) {
        return v4.j() && CollectionsKt.contains(v4.f15147h, str);
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean isUserAgeRestricted() {
        return y3.a();
    }

    @Override // com.appodeal.ads.RestrictedData
    public boolean isUserHasConsent() {
        return ((com.appodeal.ads.regulator.b0) v4.f15141b.getValue()).f14348c;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean isUserInCcpaScope() {
        return ((com.appodeal.ads.regulator.b0) v4.f15141b.getValue()).f14350e;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean isUserInGdprScope() {
        return ((com.appodeal.ads.regulator.b0) v4.f15141b.getValue()).f14349d;
    }

    @Override // com.appodeal.ads.RestrictedData
    public final boolean isUserProtected() {
        return v4.j();
    }
}
