package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class G6 {
    public static final JSONObject a(F6 f62) throws JSONException {
        Intrinsics.checkNotNullParameter(f62, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", Float.valueOf(F3.a(f62.f36825a)));
        jSONObject.put("y", Float.valueOf(F3.a(f62.f36826b)));
        jSONObject.put("width", f62.f36827c);
        jSONObject.put("height", f62.f36828d);
        return jSONObject;
    }
}
