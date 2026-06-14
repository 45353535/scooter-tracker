package com.appodeal.ads.utils.campaign_frequency;

import android.text.TextUtils;
import com.appodeal.ads.storage.a0;
import com.appodeal.ads.storage.d;
import com.appodeal.ads.storage.e0;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f14969b = e0.f14799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ boolean f14970c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14971a;

    public a(String str) {
        this.f14971a = str;
    }

    public static JSONObject a() {
        a0 a0Var = f14969b.f14800a;
        a0Var.getClass();
        Map<String, ?> all = a0Var.c(d.f14791f).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Pair pair = (value instanceof String ? (String) value : null) != null ? TuplesKt.to(key, value) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry2 : map.entrySet()) {
            try {
                jSONObject.put((String) entry2.getKey(), new JSONObject((String) entry2.getValue()));
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
        return jSONObject;
    }

    public final JSONObject b() {
        e0 e0Var = f14969b;
        String campaignId = this.f14971a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        a0 a0Var = e0Var.f14800a;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        String string = a0Var.c(d.f14791f).getString(campaignId, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                if (!f14970c && string == null) {
                    throw new AssertionError();
                }
                return new JSONObject(string);
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
        return null;
    }
}
