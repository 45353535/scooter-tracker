package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.e2;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.jh;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class StartAppSDK {

    @Keep
    public static class InitParams {

        @Nullable
        private String accountId;

        @NonNull
        private final String appId;

        @Nullable
        private Runnable callback;

        @NonNull
        private final Context context;

        @Nullable
        private SDKAdPreferences sdkAdPrefs;

        @Keep
        public void init() {
            ih.f64695a.a(this.context, this.accountId, this.appId, this.sdkAdPrefs, this.callback);
        }

        @NonNull
        @Keep
        public InitParams setAccountId(@NonNull String str) {
            this.accountId = str;
            return this;
        }

        @NonNull
        @Keep
        public InitParams setCallback(@NonNull Runnable runnable) {
            this.callback = runnable;
            return this;
        }

        @NonNull
        @Keep
        @Deprecated
        public InitParams setReturnAdsEnabled(boolean z10) {
            return this;
        }

        @NonNull
        @Keep
        public InitParams setSdkAdPrefs(@NonNull SDKAdPreferences sDKAdPreferences) {
            this.sdkAdPrefs = sDKAdPreferences;
            return this;
        }

        private InitParams(@NonNull Context context, @NonNull String str) {
            this.context = context;
            this.appId = str;
        }
    }

    @Keep
    public static void addWrapper(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        jh jhVar = ih.f64695a;
        jhVar.getClass();
        if (context == null || str == null || str2 == null) {
            return;
        }
        if (jhVar.f64787o == null) {
            jhVar.f64787o = new TreeMap();
        }
        jhVar.f64787o.put(str, str2);
        vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
        TreeMap treeMap = jhVar.f64787o;
        WeakHashMap weakHashMap = vi.f65408a;
        String string = new JSONObject(treeMap).toString();
        uf ufVarEdit = vfVar.edit();
        ufVarEdit.a("sharedPrefsWrappers", string);
        ufVarEdit.f65346a.putString("sharedPrefsWrappers", string);
        ufVarEdit.apply();
    }

    @Keep
    public static void enableConsent(@NonNull Context context, boolean z10) {
        ((h6) com.startapp.sdk.components.a.a(context).f64183j.a()).f64605f = z10;
    }

    @Keep
    public static void enableMediationMode(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        enableConsent(context, false);
        StartAppAd.disableAutoInterstitial();
        addWrapper(context, str, str2);
        ih.f64695a.f64789q = true;
    }

    @Keep
    @Deprecated
    public static void enableReturnAds(boolean z10) {
    }

    private static void ensureValidAppId(@Nullable String str) {
        if (str == null) {
            throw new NullPointerException(paramIs(RemoteConfigConstants.RequestFieldKey.APP_ID, null, null));
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException(paramIs(RemoteConfigConstants.RequestFieldKey.APP_ID, "empty", null));
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new IllegalArgumentException(paramIs(RemoteConfigConstants.RequestFieldKey.APP_ID, "invalid", str));
            }
        }
    }

    private static void ensureValidContext(@Nullable Context context) {
        if (context == null) {
            throw new NullPointerException(paramIs(POBCoreNativeConstants.NATIVE_CONTEXT, null, null));
        }
        if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
            throw new IllegalArgumentException(paramIs(POBCoreNativeConstants.NATIVE_CONTEXT, "invalid", "getBaseContext() == null"));
        }
        if (context.getApplicationContext() == null) {
            throw new IllegalArgumentException(paramIs(POBCoreNativeConstants.NATIVE_CONTEXT, "invalid", "getApplicationContext() == null"));
        }
    }

    @NonNull
    @Keep
    public static String getBidToken() {
        return e2.a(ih.f64695a.f64792t);
    }

    @NonNull
    @Keep
    public static SharedPreferences getExtras(@NonNull Context context) {
        return (SharedPreferences) com.startapp.sdk.components.a.a(context).I.a();
    }

    @NonNull
    @Keep
    public static String getVersion() {
        return "5.2.4";
    }

    @Keep
    public static void inAppPurchaseMade(@NonNull Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    @Keep
    public static void init(@NonNull Context context, @NonNull String str) {
        init(context, str, new SDKAdPreferences());
    }

    @NonNull
    @Keep
    public static InitParams initParams(@NonNull Context context, @NonNull String str) {
        ensureValidContext(context);
        ensureValidAppId(str);
        return new InitParams(context, str);
    }

    @NonNull
    private static String paramIs(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" is ");
        sb2.append(str2);
        sb2.append(str3 == null ? "" : ": ".concat(str3));
        return sb2.toString();
    }

    @Keep
    public static void setTestAdsEnabled(boolean z10) {
        ih.f64695a.f64792t = z10;
    }

    @Keep
    public static void setUserConsent(@NonNull Context context, @NonNull String str, long j10, boolean z10) {
        ih.f64695a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
            String string = vfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
            if (string != null) {
                if (string.equals(z10 ? "1" : "0")) {
                    return;
                }
            }
            String strConcat = (z10 ? "1" : "0").concat("M");
            g9 g9Var = new g9(h9.f64609d);
            g9Var.f64553d = "User consent: " + str;
            g9Var.f64554e = strConcat;
            g9Var.a();
            uf ufVarEdit = vfVar.edit();
            String str2 = z10 ? "1" : "0";
            ufVarEdit.a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            ufVarEdit.f65346a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            ufVarEdit.apply();
            pg.f65112d.a(context, MetaDataRequest$RequestReason.PAS);
        }
    }

    @Keep
    public static void startNewSession(@NonNull Context context) {
        pg.f65112d.a(context, MetaDataRequest$RequestReason.CUSTOM);
    }

    @Keep
    public static void inAppPurchaseMade(@NonNull Context context, double d10) {
        vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
        float f10 = vfVar.getFloat("inAppPurchaseAmount", 0.0f);
        uf ufVarEdit = vfVar.edit();
        float f11 = (float) (((double) f10) + d10);
        ufVarEdit.a("inAppPurchaseAmount", Float.valueOf(f11));
        ufVarEdit.f65346a.putFloat("inAppPurchaseAmount", f11);
        ufVarEdit.a("payingUser", Boolean.TRUE);
        ufVarEdit.f65346a.putBoolean("payingUser", true);
        ufVarEdit.apply();
        pg.f65112d.a(context, MetaDataRequest$RequestReason.IN_APP_PURCHASE);
    }

    @Keep
    public static void init(@NonNull Context context, @NonNull String str, @NonNull SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    @Keep
    public static void init(@NonNull Context context, @Nullable String str, @NonNull String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    @Keep
    public static void init(@NonNull Context context, @Nullable String str, @NonNull String str2, @NonNull SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    @Keep
    @Deprecated
    public static void init(@NonNull Context context, @NonNull String str, boolean z10) {
        init(context, (String) null, str, z10);
    }

    @Keep
    @Deprecated
    public static void init(@NonNull Context context, @Nullable String str, @NonNull String str2, @Nullable SDKAdPreferences sDKAdPreferences, boolean z10) {
        ih.f64695a.a(context, str, str2, sDKAdPreferences, null);
    }

    @Keep
    @Deprecated
    public static void init(@NonNull Context context, @Nullable String str, @NonNull String str2, boolean z10) {
        init(context, str, str2, new SDKAdPreferences(), z10);
    }

    @Keep
    @Deprecated
    public static void init(@NonNull Context context, @NonNull String str, @NonNull SDKAdPreferences sDKAdPreferences, boolean z10) {
        init(context, null, str, sDKAdPreferences, z10);
    }
}
