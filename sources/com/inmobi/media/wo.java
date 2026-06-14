package com.inmobi.media;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.Lazy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f39881a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f39881a.entrySet()) {
                jSONObject.put(String.valueOf(Ef.a((Df) entry.getKey())), ((vo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            return new JSONObject();
        }
    }
}
