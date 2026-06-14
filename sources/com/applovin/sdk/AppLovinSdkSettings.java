package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11807b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f11810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f11812g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f11815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k f11816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f11817l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11809d = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f11813h = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f11814i = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11808c = true;

    AppLovinSdkSettings(Context context) {
        this.f11817l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = n7.e(context);
        this.f11806a = n7.m(contextE);
        this.f11815j = u0.a(contextE);
        this.f11817l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = n7.a(identifier, context, (k) null);
        this.f11813h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.f11816k = kVar;
        if (StringUtils.isValidString(this.f11810e)) {
            kVar.s0().a(Arrays.asList(this.f11810e.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            this.f11810e = null;
        }
        if (this.f11811f != null) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinSdkSettings", "Setting user id: " + this.f11811f);
            }
            kVar.w0().a(this.f11811f);
            this.f11811f = null;
        }
        if (StringUtils.isValidString(this.f11812g)) {
            l.a(this.f11812g, kVar);
            this.f11812g = null;
        }
        for (Map.Entry entry : this.f11814i.entrySet()) {
            kVar.v0().a(d2.f8579k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + ((String) entry.getValue())));
        }
        this.f11814i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f11813h) {
            map = CollectionUtils.map(this.f11813h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f11815j;
    }

    @Nullable
    public String getUserIdentifier() {
        k kVar = this.f11816k;
        return kVar == null ? this.f11811f : kVar.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f11808c;
    }

    public boolean isMuted() {
        return this.f11807b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f11806a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f11808c == z10) {
            return;
        }
        this.f11808c = z10;
        k kVar = this.f11816k;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.y().l();
        } else {
            kVar.y().k();
        }
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        o.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f11816k == null) {
                this.f11810e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f11816k.s0().a(Arrays.asList(strTrim.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            } else {
                this.f11816k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f11817l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.f11816k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.f11812g = strTrim;
            }
        }
        if (this.f11816k != null) {
            this.f11816k.v0().a(d2.f8579k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + str2));
        } else {
            this.f11814i.put(str, strTrim);
        }
        this.f11813h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f11807b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f11809d = z10;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > n7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + n7.d(8) + " maximum)");
        }
        k kVar = this.f11816k;
        if (kVar == null) {
            this.f11811f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            this.f11816k.O().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.f11816k.w0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!n7.l()) {
            this.f11806a = z10;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (n7.m(null) != z10) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f11809d;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f11806a + ", muted=" + this.f11807b + ", creativeDebuggerEnabled=" + this.f11808c + '}';
    }
}
