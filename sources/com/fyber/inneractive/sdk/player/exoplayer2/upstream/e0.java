package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c f23021b;

    public e0(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar) {
        hVar.getClass();
        this.f23020a = hVar;
        cVar.getClass();
        this.f23021b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        long jA = this.f23020a.a(kVar);
        if (kVar.f23039d == -1 && jA != -1) {
            kVar = new k(kVar.f23036a, kVar.f23037b, kVar.f23038c, jA, kVar.f23040e, kVar.f23041f);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f23021b;
        cVar.getClass();
        if (kVar.f23039d == -1 && (kVar.f23041f & 2) != 2) {
            cVar.f22949d = null;
            return jA;
        }
        cVar.f22949d = kVar;
        cVar.f22954i = 0L;
        try {
            cVar.b();
            return jA;
        } catch (IOException e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        try {
            this.f23020a.close();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f23021b;
            if (cVar.f22949d == null) {
                return;
            }
            try {
                cVar.a();
            } catch (IOException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar2 = this.f23021b;
            if (cVar2.f22949d != null) {
                try {
                    cVar2.a();
                } catch (IOException e11) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e11);
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        int i12 = this.f23020a.read(bArr, i10, i11);
        if (i12 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f23021b;
            if (cVar.f22949d != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (cVar.f22953h == cVar.f22947b) {
                            cVar.a();
                            cVar.b();
                        }
                        int iMin = (int) Math.min(i12 - i13, cVar.f22947b - cVar.f22953h);
                        cVar.f22951f.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        cVar.f22953h += j10;
                        cVar.f22954i += j10;
                    } catch (IOException e10) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
                    }
                }
            }
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f23020a.a();
    }
}
