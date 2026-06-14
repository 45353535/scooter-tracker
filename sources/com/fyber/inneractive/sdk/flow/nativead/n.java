package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f20824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f20826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f20827d;

    public n(p pVar, i iVar, String str, com.fyber.inneractive.sdk.util.g gVar) {
        this.f20827d = pVar;
        this.f20824a = iVar;
        this.f20825b = str;
        this.f20826c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f20249a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f20827d;
            i iVar = this.f20824a;
            String str = this.f20825b;
            com.fyber.inneractive.sdk.util.g gVar = this.f20826c;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f20831b, str);
            if (v.a(str)) {
                o oVar = new o(pVar, iVar, gVar);
                k kVar = ((j) pVar.f20832a).f20803b;
                if (kVar != null) {
                    kVar.a(str, true, gVar, oVar);
                    return;
                }
                return;
            }
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
