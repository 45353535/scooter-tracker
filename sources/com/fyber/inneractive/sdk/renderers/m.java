package com.fyber.inneractive.sdk.renderers;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements com.fyber.inneractive.sdk.player.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f23682a;

    public m(p pVar) {
        this.f23682a = pVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23682a.f23662k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.f23682a.f23662k).y();
        }
    }
}
