package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    private JSONObject lnr;
    private Map<String, Object> mml;
    private Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private JSONObject f16157ud;

    public void qdl(Context context) {
        this.qdl = context;
    }

    public void ud(JSONObject jSONObject) {
        this.lnr = jSONObject;
    }

    public void qdl(JSONObject jSONObject) {
        this.f16157ud = jSONObject;
    }

    public Map<String, Object> ud() {
        return this.mml;
    }

    public JSONObject qdl() {
        return this.lnr;
    }

    public void qdl(Map<String, Object> map) {
        this.mml = map;
    }
}
