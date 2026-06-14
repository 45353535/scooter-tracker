package com.bytedance.sdk.openadsdk.bch.ud;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private final float lnr;
    private final int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int f16938ud;

    public qdl(int i10, int i11, float f10) {
        this.qdl = i10;
        this.f16938ud = i11;
        this.lnr = f10;
    }

    public static JSONObject qdl(qdl qdlVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", qdlVar.qdl);
        jSONObject.put("height", qdlVar.f16938ud);
        jSONObject.put("alpha", qdlVar.lnr);
        return jSONObject;
    }
}
