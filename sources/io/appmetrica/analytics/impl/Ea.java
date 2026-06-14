package io.appmetrica.analytics.impl;

import com.appodeal.ads.modules.common.internal.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f75734a;

    static {
        HashSet hashSet = new HashSet();
        f75734a = hashSet;
        hashSet.add("get_ad");
        hashSet.add(Constants.REPORT);
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return AbstractC5295nb.a(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
