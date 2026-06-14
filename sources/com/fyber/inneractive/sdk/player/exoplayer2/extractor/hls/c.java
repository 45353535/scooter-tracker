package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f21812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f21814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f21815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f21816m;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i10, Object obj, byte[] bArr, String str) {
        super(3, i10, -9223372036854775807L, -9223372036854775807L, oVar, hVar, kVar, obj);
        this.f21812i = bArr;
        this.f21815l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f21814k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f21814k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.f21813j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.f22838h.a(this.f22831a);
            int i10 = 0;
            this.f21813j = 0;
            while (i10 != -1 && !this.f21814k) {
                byte[] bArr = this.f21812i;
                if (bArr == null) {
                    this.f21812i = new byte[16384];
                } else if (bArr.length < this.f21813j + 16384) {
                    this.f21812i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f22838h.read(this.f21812i, this.f21813j, 16384);
                if (i10 != -1) {
                    this.f21813j += i10;
                }
            }
            if (!this.f21814k) {
                this.f21816m = Arrays.copyOf(this.f21812i, this.f21813j);
            }
            z.a(this.f22838h);
        } catch (Throwable th2) {
            z.a(this.f22838h);
            throw th2;
        }
    }
}
