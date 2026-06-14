package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.C4500q8;
import com.ironsource.C4584v8;
import com.ironsource.F5;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4635y8 {
    public static C4584v8 a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C4584v8.a aVar = new C4584v8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.c(map.get("sessionid"));
        }
        aVar.a(context);
        return aVar.d(str).a(str2).a();
    }

    public static F5 a(JSONObject jSONObject) {
        return new F5.a(jSONObject.optString(D5.f40571r)).b().b(jSONObject.optBoolean("enabled")).a(new C4601w8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", D5.L));
        arrayList.add(new Pair<>(D5.M, D5.N));
        return arrayList;
    }

    public static boolean a(V4 v42) {
        if (v42 == null || v42.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(v42.g().get("inAppBidding"));
    }

    public static C4500q8.e a(V4 v42, C4500q8.e eVar) {
        if (v42 == null || v42.g() == null || v42.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(v42.g().get("rewarded"))) {
            return C4500q8.e.RewardedVideo;
        }
        return C4500q8.e.Interstitial;
    }
}
