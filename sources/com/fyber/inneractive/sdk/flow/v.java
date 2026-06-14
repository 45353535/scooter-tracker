package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f20988a;

    public v(w wVar) {
        this.f20988a = wVar;
    }

    public final void a(com.fyber.inneractive.sdk.network.u uVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        w wVar = this.f20988a;
        InneractiveAdRequest inneractiveAdRequest = wVar.f21035a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.f21036b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.f21037c;
        JSONArray jSONArrayB = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.f21418c = uVar;
        wVar2.f21416a = inneractiveAdRequest;
        wVar2.f21419d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        String strA = mVar.a();
        try {
            jSONObject.put("ignitem", strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "ignitem", strA);
        }
        wVar2.f21421f.put(jSONObject);
        wVar2.a((String) null);
    }

    public final void a(com.fyber.inneractive.sdk.network.t tVar, String str, String str2, com.fyber.inneractive.sdk.ignite.m mVar) {
        w wVar = this.f20988a;
        InneractiveAdRequest inneractiveAdRequest = wVar.f21035a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.f21036b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.f21037c;
        JSONArray jSONArrayB = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.f21417b = tVar;
        wVar2.f21416a = inneractiveAdRequest;
        wVar2.f21419d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        if (mVar != null) {
            String strA = mVar.a();
            try {
                jSONObject.put("ignitem", strA);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "ignitem", strA);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, str);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("error_code", str2);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "error_code", str2);
            }
        }
        wVar2.f21421f.put(jSONObject);
        wVar2.a((String) null);
    }
}
