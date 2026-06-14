package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f20828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f20829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f20830c;

    public o(p pVar, i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.f20830c = pVar;
        this.f20828a = iVar;
        this.f20829b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f20249a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f20830c;
            i iVar = this.f20828a;
            String str = bVar.f20252d;
            com.fyber.inneractive.sdk.util.g gVar = this.f20829b;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f20831b, str);
            j jVar = (j) pVar.f20832a;
            i iVar2 = jVar.f20802a;
            if (iVar2 == null || iVar2.equals(iVar)) {
                IAlog.a("%s : No valid link object, origin: %s", j.f20801d, gVar);
                return;
            }
            p pVar2 = jVar.f20804c;
            i iVar3 = jVar.f20802a;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new m(pVar2, iVar3, true, gVar));
        }
    }
}
