package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f22831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f22833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f22837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f22838h;

    public a(int i10, int i11, long j10, long j11, o oVar, h hVar, k kVar, Object obj) {
        hVar.getClass();
        this.f22838h = hVar;
        this.f22831a = kVar;
        this.f22832b = i10;
        this.f22833c = oVar;
        this.f22834d = i11;
        this.f22835e = obj;
        this.f22836f = j10;
        this.f22837g = j11;
    }

    public abstract long c();
}
