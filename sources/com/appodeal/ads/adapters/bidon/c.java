package com.appodeal.ads.adapters.bidon;

import com.appodeal.ads.AdUnitParams;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f12119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f12120d;

    public c(JSONObject jSONObject, String idfa) {
        final JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(idfa, "idfa");
        double dDoubleValue = 0.0d;
        Map map = null;
        if (jSONObject != null) {
            double dOptDouble = jSONObject.optDouble("pricefloor");
            Double dValueOf = (Double.isNaN(dOptDouble) || dOptDouble < 0.0d) ? null : Double.valueOf(dOptDouble);
            if (dValueOf != null) {
                dDoubleValue = dValueOf.doubleValue();
            }
        }
        this.f12117a = dDoubleValue;
        this.f12118b = jSONObject != null ? jSONObject.optString("auction_key") : null;
        this.f12119c = com.appodeal.ads.adapters.bidon.ext.f.i(jSONObject != null ? jSONObject.optJSONObject("ext") : null, idfa);
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("segment_props")) != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            map = MapsKt.toMap(k.R(k.h(itKeys), new Function1() { // from class: com.appodeal.ads.adapters.bidon.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.a(this.f12112b, jSONObjectOptJSONObject, (String) obj);
                }
            }));
        }
        this.f12120d = map == null ? MapsKt.emptyMap() : map;
    }

    public static final Pair a(c cVar, JSONObject jSONObject, String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Object objOpt = jSONObject.opt(str);
            Object string = objOpt instanceof String ? jSONObject.getString(str) : objOpt instanceof Integer ? Integer.valueOf(jSONObject.getInt(str)) : objOpt instanceof BigDecimal ? Double.valueOf(((BigDecimal) objOpt).doubleValue()) : objOpt instanceof Boolean ? Boolean.valueOf(jSONObject.getBoolean(str)) : objOpt instanceof JSONObject ? jSONObject.getJSONObject(str) : objOpt instanceof JSONArray ? jSONObject.getJSONArray(str) : null;
            objB = Result.b(string != null ? TuplesKt.to(str, string) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (Pair) (Result.i(objB) ? null : objB);
    }
}
