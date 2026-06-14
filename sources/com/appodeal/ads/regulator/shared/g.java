package com.appodeal.ads.regulator.shared;

import android.content.SharedPreferences;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.ext.LogExtKt;
import com.mobilefuse.sdk.privacy.IabString;
import eg.o0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14379a = lf.i.a(new Function0() { // from class: com.appodeal.ads.regulator.shared.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.a(this.f14373b);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f14380b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f14385g;

    public static final SharedPreferences.OnSharedPreferenceChangeListener a(final g gVar) {
        return new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.appodeal.ads.regulator.shared.e
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                g.h(this.f14376a, sharedPreferences, str);
            }
        };
    }

    public static String b(g gVar, SharedPreferences sharedPreferences, String str) {
        gVar.getClass();
        try {
            if (sharedPreferences.contains(str)) {
                String string = sharedPreferences.getString(str, null);
                if (string != null) {
                    return string;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final Unit c(SharedPreferences sharedPreferences, String str, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNull(key);
            if (StringsKt.a0(key, str, false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(str2);
            jsonObject.hasValue(str2, value);
        }
        return Unit.f93236a;
    }

    public static final Unit d(g gVar, SharedPreferences sharedPreferences, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Pair pair : (Pair[]) i.f14386a.getValue()) {
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            gVar.getClass();
            jsonObject.hasObject(str, e(sharedPreferences, str2));
        }
        return Unit.f93236a;
    }

    public static JSONObject e(final SharedPreferences sharedPreferences, final String str) {
        JSONObject jsonObject = JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.regulator.shared.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.c(sharedPreferences, str, (JsonObjectBuilder) obj);
            }
        });
        if (jsonObject.length() > 0) {
            return jsonObject;
        }
        return null;
    }

    public static final void h(g gVar, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        gVar.getClass();
        eg.i.d(kotlinx.coroutines.i.a(o0.b()), null, null, new b(str, gVar, sharedPreferences, null), 3, null);
    }

    public final void f(SharedPreferences sharedPreferences) {
        String strB = b(this, sharedPreferences, "IABConsent_ConsentString");
        this.f14382d = strB;
        LogExtKt.logInternal$default("IABSharedPreference", "updateConsentString: " + strB, null, 4, null);
    }

    public final void g(final SharedPreferences sharedPreferences) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.regulator.shared.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.d(this.f14374b, sharedPreferences, (JsonObjectBuilder) obj);
                }
            }));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        this.f14385g = (JSONObject) objB;
    }

    public final void i(SharedPreferences sharedPreferences) {
        String strB = b(this, sharedPreferences, "IABTCF_ApdPrivacyConsent");
        this.f14384f = strB;
        LogExtKt.logInternal$default("IABSharedPreference", "updateTcfApdPrivacyString: " + strB, null, 4, null);
    }

    public final void j(SharedPreferences sharedPreferences) {
        String strB = b(this, sharedPreferences, "IABTCF_TCString");
        this.f14381c = strB;
        LogExtKt.logInternal$default("IABSharedPreference", "updateTcfTcString: " + strB, null, 4, null);
    }

    public final void k(SharedPreferences sharedPreferences) {
        String strB = b(this, sharedPreferences, IabString.IAB_US_PRIVACY_STRING);
        this.f14383e = strB;
        LogExtKt.logInternal$default("IABSharedPreference", "updateUSPrivacyString: " + strB, null, 4, null);
    }
}
