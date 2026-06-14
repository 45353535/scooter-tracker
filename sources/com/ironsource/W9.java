package com.ironsource;

import com.ironsource.C4500q8;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f41991a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f41991a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(L9 l92) {
        if (l92.i()) {
            return C4500q8.e.Banner.toString();
        }
        if (l92.n()) {
            return C4500q8.e.RewardedVideo.toString();
        }
        return C4500q8.e.Interstitial.toString();
    }
}
