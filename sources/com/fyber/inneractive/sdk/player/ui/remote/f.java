package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.player.ui.o;
import com.fyber.inneractive.sdk.player.ui.s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.fyber.inneractive.sdk.web.remoteui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f23396a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23403h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23397b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23398c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23399d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23400e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23401f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23402g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23404i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23405j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f23406k = m.NONE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f23407l = "";

    public f(o oVar) {
        this.f23396a = null;
        this.f23403h = false;
        this.f23396a = oVar;
        this.f23403h = oVar.H;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        s sVar = this.f23396a;
        if (sVar == null) {
            IAlog.a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        sVar.g(this.f23397b);
        this.f23396a.d(this.f23404i);
        this.f23396a.f(this.f23401f);
        this.f23396a.a(this.f23400e, this.f23406k);
        this.f23396a.c(this.f23403h);
        this.f23396a.a(this.f23405j, this.f23407l);
        this.f23396a.b(this.f23402g);
        this.f23396a.e(this.f23398c);
        this.f23396a.a(this.f23399d);
    }
}
