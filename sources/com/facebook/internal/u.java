package com.facebook.internal;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f19978a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f19979b = new ConcurrentHashMap();

    private u() {
    }

    public static final JSONObject a(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return (JSONObject) f19979b.get(accessToken);
    }

    public static final void b(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        f19979b.put(key, value);
    }
}
