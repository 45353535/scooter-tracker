package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.AbstractC4063tk;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4063tk {
    public static String a(Map map, String str) throws JSONException {
        Map map2;
        String string;
        C3903n9 c3903n9A = Jh.a("getToken", "AB");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("tp");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f37226b = str2;
            }
            String str3 = (String) map.get("tp-v");
            if (!TextUtils.isEmpty(str3)) {
                Ki.f37225a = str3;
            }
        }
        a();
        if (!Ji.d()) {
            if (c3903n9A != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
                c3903n9A.b("com.inmobi.media.tk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, c3903n9A);
            return null;
        }
        Context context = Ji.f37157a;
        C3709ff c3709ff = context != null ? new C3709ff(context, c3903n9A) : null;
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C3774i4 c3774i42 = Y3.f38021a;
        if (((RootConfig) c3774i42.a(RootConfig.class)).getMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, c3903n9A);
            if (c3903n9A != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
                c3903n9A.b("com.inmobi.media.tk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        Ak uidMap = new Ak(((AdConfig) c3774i42.a(AdConfig.class)).getIncludeIds());
        C4088uk metaData = new C4088uk(str, map);
        C3658df c3658dfA = c3709ff != null ? c3709ff.a() : null;
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) c3774i42.a(SignalsConfig.class);
        LinkedHashMap payload = new LinkedHashMap();
        String strA = AbstractC4151x8.a();
        if (strA != null) {
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.f37551a;
        if (str4 != null) {
        }
        payload.put("is-unifid-service-used", String.valueOf(pkA.f37552b));
        AbstractC4127w9.d(payload);
        payload.put("d-media-volume", String.valueOf(C4148x5.f39893a.a(Ji.f37157a, false)));
        payload.putAll(uidMap.a());
        String str5 = metaData.f39694a;
        if (str5 != null) {
        }
        HashMap map3 = new HashMap();
        map3.putAll(X3.f37984a);
        payload.putAll(map3);
        Map map4 = metaData.f39695b;
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!payload.containsKey(str6)) {
                    payload.put(str6, str7);
                }
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        C3774i4 c3774i43 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string2 = ext.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            payload.put("im-ext", string2);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        C4148x5 c4148x5 = C4148x5.f39893a;
        c4148x5.getClass();
        if (C4148x5.q()) {
            if (J5.f37103e) {
                string = null;
            } else {
                string = J5.f37101c;
                if (string == null) {
                    Context context2 = Ji.f37157a;
                    if (context2 == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                        Ea eaA = Da.a(context2, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", C4240b4.i.W);
                        string = eaA.f36783a.getString("gesture_margin", null);
                    }
                    J5.f37101c = string;
                }
            }
            if (string != null) {
                payload.put("d-device-gesture-margins", string);
            }
        }
        AbstractC4127w9.c(payload);
        AbstractC4127w9.e(payload);
        AbstractC4127w9.a(payload);
        AbstractC4127w9.b(payload);
        payload.put("h-user-agent", Ji.c());
        Intrinsics.checkNotNullParameter(payload, "<this>");
        String str8 = Vg.f37911a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str9 = Vg.f37911a;
        if (str9 != null) {
            linkedHashMap.put("u-nip", str9);
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            payload.putAll(linkedHashMap);
        }
        payload.putAll(Tg.a());
        payload.putAll(J5.c());
        payload.putAll(O2.a());
        if (c3658dfA != null && (map2 = c3658dfA.f38446a) != null) {
            payload.putAll(map2);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Lazy lazy = E0.f36764c;
        if (!((CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            String string3 = new JSONArray((Collection) lazy.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            payload.put("u-r-crid", string3);
        }
        JSONObject jSONObjectA = W8.f37936c.a();
        if (jSONObjectA.length() > 0) {
            String string4 = jSONObjectA.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            payload.put("audioObject", string4);
        }
        AppSetIdInfo appSetIdInfo = B1.f36600a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        B1.a(linkedHashMap2);
        payload.putAll(linkedHashMap2);
        if (signalsConfig.getPublisher().getEnableAB()) {
            Intrinsics.checkNotNullParameter(payload, "<this>");
            JSONObject jSONObjectE = Og.f37496a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                payload.put(C4240b4.i.f42637l0, string5);
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.put("u-appsecure", String.valueOf((int) A1.f36544f));
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            payload.put("ik", K4.f37207f);
            payload.put("c_data", K4.d());
            Context context3 = Ji.f37157a;
            int i10 = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
                Ea eaA2 = Da.a(context3, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", C4240b4.i.W);
                i10 = eaA2.f36783a.getInt("akv", 1);
            }
            payload.put("aKV", String.valueOf(i10));
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            payload.put("consentObject", string6);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.putAll(A1.f36543e);
        payload.putAll(c4148x5.a(false));
        payload.putAll(AbstractC4201z8.a());
        Intrinsics.checkNotNullParameter(payload, "mHttpHeaders");
        payload.put("User-Agent", Ji.c());
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!W6.a()) {
            if (c3903n9A != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
                c3903n9A.b("com.inmobi.media.tk", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, c3903n9A);
            return null;
        }
        a(jCurrentTimeMillis, c3903n9A);
        if (c3903n9A != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
            c3903n9A.a("com.inmobi.media.tk", "get signals success");
        }
        byte[] bArrEncode = Base64.encode(new vh.e().writeUtf8(F3.a(payload)).readByteArray(), 8);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return new String(bArrEncode, Charsets.UTF_8);
    }

    public static final void b() {
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to("networkType", C4148x5.m()), TuplesKt.to("plType", "AB"));
        Wj wj = Wj.f37959a;
        Wj.b("AdGetSignalsCalled", mapHashMapOf, EnumC3585ak.f38215a);
    }

    public static void a(final int i10, final long j10, C3903n9 c3903n9) {
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
            c3903n9.c("com.inmobi.media.tk", "submitAdGetSignalsFailed - errorCode - " + i10 + ", startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: w3.sa
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4063tk.a(j10, i10);
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
        if (c3903n9 != null) {
            c3903n9.a();
        }
    }

    public static final void a(long j10, int i10) {
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to("latency", Long.valueOf(System.currentTimeMillis() - j10)), TuplesKt.to("networkType", C4148x5.m()), TuplesKt.to("errorCode", Integer.valueOf(i10)), TuplesKt.to("plType", "AB"));
        Wj wj = Wj.f37959a;
        Wj.b("AdGetSignalsFailed", mapHashMapOf, EnumC3585ak.f38215a);
    }

    public static void a(final long j10, C3903n9 c3903n9) {
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
            c3903n9.c("com.inmobi.media.tk", "submitAdGetSignalsSucceeded - startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: w3.ta
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4063tk.a(j10);
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
        if (c3903n9 != null) {
            c3903n9.a();
        }
    }

    public static final void a(long j10) {
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to("latency", Long.valueOf(System.currentTimeMillis() - j10)), TuplesKt.to("networkType", C4148x5.m()), TuplesKt.to("plType", "AB"));
        Wj wj = Wj.f37959a;
        Wj.b("AdGetSignalsSucceeded", mapHashMapOf, EnumC3585ak.f38215a);
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: w3.ua
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4063tk.b();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }
}
