package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f20694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f20695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f20696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20697d;

    public b(o oVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar, String str) {
        this.f20695b = oVar;
        this.f20694a = (p) oVar.f();
        this.f20696c = aVar;
        this.f20697d = str;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (str != null && exc == null) {
            IAlog.c("%s loaded FMP End-Card icon %s", "IconCallback", this.f20697d);
            p pVar = this.f20694a;
            pVar.f20707k = str;
            pVar.b(this.f20696c);
            return;
        }
        if (TextUtils.isEmpty(this.f20694a.f20707k)) {
            o oVar = this.f20695b;
            IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", "IconCallback");
            JSONObject jSONObject = new JSONObject();
            String strA = v.a(exc);
            if (!TextUtils.isEmpty(strA)) {
                try {
                    jSONObject.put("error", strA);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "error", strA);
                }
            }
            String strN = oVar.n();
            if (!TextUtils.isEmpty(strN)) {
                try {
                    jSONObject.put("version", strN);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "version", strN);
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            try {
                jSONObject.put("loaded_from_cache", boolValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
            }
            x0 x0Var = oVar.f20648c;
            t tVar = t.FMP_COMPANION_FAILED_LOADING;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f21043c;
            g gVar = x0Var.f21044d;
            JSONArray jSONArray = x0Var.f21046f;
            w wVar = new w(gVar);
            wVar.f21417b = tVar;
            wVar.f21416a = inneractiveAdRequest;
            wVar.f21419d = jSONArray;
            wVar.f21421f.put(jSONObject);
            wVar.a((String) null);
        }
    }
}
