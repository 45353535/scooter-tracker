package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.g;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f20698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f20699b;

    public c(o oVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f20699b = oVar;
        this.f20698a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (str != null && exc == null) {
            ((p) this.f20699b.f()).f20718e = str.concat("<style>body {margin: 0px; background-color: rgba(0, 0, 0, 0.0);}</style>");
            ((p) this.f20699b.f()).f20708l = z10;
            ((p) this.f20699b.f()).b(this.f20698a);
            return;
        }
        if (exc == null || (exc instanceof g) || z10) {
            return;
        }
        o oVar = this.f20699b;
        IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", "TemplateCallback");
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
        Boolean bool = Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        x0 x0Var = oVar.f20648c;
        t tVar = t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f21043c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f21044d;
        JSONArray jSONArray = x0Var.f21046f;
        w wVar = new w(gVar);
        wVar.f21417b = tVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArray;
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
    }
}
