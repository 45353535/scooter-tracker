package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3944p0 extends AbstractC4127w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ak f39228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3894n0 f39229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3964pk f39230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3658df f39231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3903n9 f39232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3944p0(String str, Ak ak, C3894n0 metaData, C3964pk timeoutConfig, C3658df c3658df, C3903n9 c3903n9, boolean z10) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f39228b = ak;
        this.f39229c = metaData;
        this.f39230d = timeoutConfig;
        this.f39231e = c3658df;
        this.f39232f = c3903n9;
    }

    public final Le a() throws JSONException {
        String string;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = Ji.f37159c;
        if (str == null) {
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str);
        linkedHashMap.putAll(J5.c());
        String str2 = A1.f36540b;
        if (str2 != null) {
        }
        linkedHashMap.put("client-request-id", this.f39229c.f39065a);
        linkedHashMap.put("sdk-flavor", "row");
        this.f39229c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        String str3 = this.f39229c.f39069e;
        if (str3 != null) {
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.f37551a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(pkA.f37552b));
        long j10 = this.f39229c.f39067c;
        if (j10 != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j10));
        }
        AbstractC4127w9.d(linkedHashMap);
        linkedHashMap.putAll(O2.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(O2.b());
        linkedHashMap.putAll(O2.c());
        C3658df c3658df = this.f39231e;
        if (c3658df != null && (map = c3658df.f38446a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap map2 = new HashMap();
        map2.putAll(X3.f37984a);
        linkedHashMap.putAll(map2);
        String str5 = this.f39229c.f39071g;
        if (str5 != null) {
        }
        Map map3 = this.f39229c.f39070f;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        this.f39229c.getClass();
        linkedHashMap.put("int-origin", "im");
        AbstractC4127w9.c(linkedHashMap);
        AbstractC4127w9.e(linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Lazy lazy = E0.f36764c;
        if (!((CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            String string2 = new JSONArray((Collection) lazy.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            linkedHashMap.put("u-r-crid", string2);
        }
        linkedHashMap.put("m10n_context", Intrinsics.areEqual("others", this.f39229c.f39068d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4148x5.f39893a.getClass();
        if (C4148x5.q()) {
            if (J5.f37103e) {
                string = null;
            } else {
                string = J5.f37101c;
                if (string == null) {
                    Context context = Ji.f37157a;
                    if (context == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                        Ea eaA = Da.a(context, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", C4240b4.i.W);
                        string = eaA.f36783a.getString("gesture_margin", null);
                    }
                    J5.f37101c = string;
                }
            }
            if (string != null) {
                linkedHashMap.put("d-device-gesture-margins", string);
            }
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string3 = ext.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            linkedHashMap.put("im-ext", string3);
        }
        Map map4 = this.f39229c.f39066b;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str6)) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        AbstractC4127w9.a(linkedHashMap);
        C3894n0 metaData = this.f39229c;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        String str8 = metaData.f39069e;
        if (str8 != null && AbstractC4127w9.a(str8).length() > 0) {
            String string4 = AbstractC4127w9.a(str8).toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            linkedHashMap.put("audioObject", string4);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String str9 = Vg.f37911a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str10 = Vg.f37911a;
        if (str10 != null) {
            linkedHashMap2.put("u-nip", str10);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(Tg.a());
        AppSetIdInfo appSetIdInfo = B1.f36600a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            linkedHashMap.put("ik", K4.f37207f);
            linkedHashMap.put("c_data", K4.d());
            Context context2 = Ji.f37157a;
            int i10 = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
                Ea eaA2 = Da.a(context2, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", C4240b4.i.W);
                i10 = eaA2.f36783a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i10));
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f36544f));
        Ak ak = this.f39228b;
        HashMap mapA = ak != null ? ak.a() : null;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (mapA != null) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        C3774i4 c3774i42 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        if (((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getPublisher().getEnableMCO()) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            JSONObject jSONObjectE = Og.f37496a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                linkedHashMap.put(C4240b4.i.f42637l0, string5);
            }
        }
        AbstractC4127w9.b(linkedHashMap);
        boolean z10 = this.f39229c.f39072h;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f36543e);
        linkedHashMap.putAll(C4148x5.f39893a.a(z10));
        linkedHashMap.putAll(AbstractC4201z8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            linkedHashMap.put("consentObject", string6);
        }
        this.f39229c.getClass();
        C3903n9 c3903n9 = this.f39232f;
        if (c3903n9 != null) {
            c3903n9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str11 = this.f39834a;
        LinkedHashMap mHttpHeaders = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(mHttpHeaders, "mHttpHeaders");
        mHttpHeaders.put("User-Agent", Ji.c());
        return new Le(str11, mHttpHeaders, this.f39230d, new Y6(linkedHashMap), null, 48);
    }
}
