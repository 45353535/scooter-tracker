package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f23059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f23060c;

    public o(Context context, m mVar, q qVar) {
        this.f23058a = context.getApplicationContext();
        this.f23059b = mVar;
        this.f23060c = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.f23058a, this.f23059b, this.f23060c.a());
    }
}
