package com.fyber.inneractive.sdk.dv.handler;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f20529a;

    public b(c cVar) {
        this.f20529a = cVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        c cVar = this.f20529a;
        e eVar = cVar.f20531b;
        if (eVar.f20535b) {
            return;
        }
        AdFormat adFormat = cVar.f20530a;
        IAlog.a("Firing Event 1000 - Fetch error DV - msg  " + str, new Object[0]);
        w wVar = new w(t.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        wVar.f21421f.put(new x().a(str, PglCryptUtils.KEY_MESSAGE).a(e.b(), "version").a(adFormat.name(), "adFormat").a(Integer.valueOf(eVar.f20537d), "success_count").f21423a);
        wVar.a((String) null);
        this.f20529a.f20531b.f20535b = true;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        IAlog.a("DVHanlder - %s - put query: %s", this.f20529a.f20530a.toString(), queryInfo.getQuery());
        synchronized (this.f20529a.f20531b.f20536c) {
            c cVar = this.f20529a;
            e eVar = cVar.f20531b;
            eVar.f20537d++;
            eVar.f20534a.put(cVar.f20530a, queryInfo);
        }
    }
}
