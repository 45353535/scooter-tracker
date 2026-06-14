package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f23279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23280b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f23280b = pVar;
        this.f23279a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f23280b.f23301i;
        if (nVar != null) {
            ((q) nVar).a(this.f23279a);
        }
    }
}
