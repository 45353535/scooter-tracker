package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f37378a = {kotlin.jvm.internal.v0.j(new kotlin.jvm.internal.n0(Mh.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String browser, String event) {
        Intrinsics.checkNotNullParameter(browser, "browser");
        Intrinsics.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put("event", event);
        return jSONObject;
    }
}
