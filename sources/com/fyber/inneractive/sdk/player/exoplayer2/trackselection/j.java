package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f22937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t[] f22940d;

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.f22937a = zVar;
        this.f22938b = hVar;
        this.f22939c = fVar;
        this.f22940d = tVarArr;
    }

    public final boolean a(j jVar, int i10) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f22938b.f22935b[i10], jVar.f22938b.f22935b[i10]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f22940d[i10], jVar.f22940d[i10]);
    }
}
