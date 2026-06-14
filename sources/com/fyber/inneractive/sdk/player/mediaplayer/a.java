package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f23276c;

    public a(p pVar, int i10, int i11) {
        this.f23276c = pVar;
        this.f23274a = i10;
        this.f23275b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23276c.f23301i != null) {
            Locale locale = Locale.ENGLISH;
            String str = "Player Error: " + this.f23274a + ", " + this.f23275b;
            n nVar = this.f23276c.f23301i;
            o oVar = new o(str);
            q qVar = (q) nVar;
            qVar.a(com.fyber.inneractive.sdk.player.enums.b.Error);
            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(qVar), oVar);
            qVar.f21530i.post(new com.fyber.inneractive.sdk.player.controller.j(qVar, oVar));
            qVar.k();
        }
    }
}
