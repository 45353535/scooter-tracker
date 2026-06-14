package com.inmobi.media;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3848l4 extends AbstractC4127w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3848l4(String url, String accountId, List configRequestContexts, boolean z10) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
        this.f38942b = accountId;
        this.f38943c = configRequestContexts;
        this.f38944d = z10;
    }

    public final Le a() throws JSONException {
        List<C3873m4> list = this.f38943c;
        JSONArray jSONArray = new JSONArray();
        for (C3873m4 c3873m4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("n", c3873m4.f39008b.getType());
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, c3873m4.f39008b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.f38942b);
        linkedHashMap.put("p", string);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string2 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            linkedHashMap.put("consentObject", string2);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f36543e);
        linkedHashMap.putAll(C4148x5.f39893a.a(false));
        linkedHashMap.putAll(AbstractC4201z8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f36544f));
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.f38944d) {
            linkedHashMap2.put("rip", "true");
        }
        return new Le(this.f39834a, linkedHashMap2, null, new Y6(linkedHashMap), null, 52);
    }
}
