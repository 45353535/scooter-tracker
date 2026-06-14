package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    public static final HashSet<String> qdl = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final hkc f17819ud;

    public to(hkc hkcVar) {
        this.f17819ud = hkcVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl(qdl, new to(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.f17819ud.tvp(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.f17819ud.to(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.f17819ud.qdl(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.f17819ud.jpc(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.f17819ud.wd(jSONObject);
        }
        return null;
    }
}
