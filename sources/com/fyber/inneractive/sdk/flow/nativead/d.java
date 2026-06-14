package com.fyber.inneractive.sdk.flow.nativead;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends com.fyber.inneractive.sdk.flow.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f20772m = LogConstants.KEY_NATIVE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f20773n;

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f20754c;
        if (xVar != null) {
            ((w0) xVar).destroy();
        }
        f fVar = this.f20773n;
        if (fVar != null) {
            fVar.f20780d.clear();
            fVar.f20782f = null;
            Iterator it = fVar.f20777a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).destroy();
            }
            fVar.f20777a.clear();
            this.f20773n = null;
        }
        this.f20762k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(this.f20763l);
        this.f20752a = null;
        this.f20753b = null;
        this.f20754c = null;
        this.f20755d = null;
        this.f20756e = null;
        this.f20757f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.response.e eVar = this.f20753b;
        if (eVar == null || ((com.fyber.inneractive.sdk.response.nativead.j) eVar).T.N == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.f20758g;
        InneractiveAdRequest inneractiveAdRequest = this.f20752a;
        com.fyber.inneractive.sdk.response.nativead.j jVar = (com.fyber.inneractive.sdk.response.nativead.j) this.f20753b;
        f fVar = new f(rVar, inneractiveAdRequest, jVar, jVar.T.N, this, this.f20772m);
        this.f20773n = fVar;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.d dVarA = com.fyber.inneractive.sdk.flow.nativead.mainasset.e.a(fVar.f20785i, fVar.f20787k, fVar.f20784h, fVar.f20779c, fVar.f20786j, fVar);
        if (dVarA == null) {
            if (fVar.f20783g.compareAndSet(false, true)) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Could not start loading main media"));
                d dVar = fVar.f20782f;
                dVar.getClass();
                com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f20753b, dVar.f20752a, "send_failed_native_creatives", dVar.f20758g.b()), inneractiveInfrastructureError));
                dVar.b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        fVar.f20777a.add(dVarA);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f20777a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = fVar.f20779c.f23768a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (com.fyber.inneractive.sdk.response.nativead.f fVar2 : fVar.f20779c.f23768a) {
                if (fVar2 != null && fVar2.f23755a != 2 && fVar2.f23758d != null) {
                    arrayList.add(fVar2);
                }
            }
        }
        copyOnWriteArrayList.add(new h(arrayList, fVar.f20788l));
        Iterator it = fVar.f20777a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }
}
