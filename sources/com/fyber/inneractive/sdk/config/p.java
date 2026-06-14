package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f20429a;

    public p(s sVar) {
        this.f20429a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.f20429a;
            if (oVar.equals(sVar.f20484b)) {
                return;
            }
            sVar.f20486d = true;
            sVar.f20484b = oVar;
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new q(sVar));
        }
    }
}
