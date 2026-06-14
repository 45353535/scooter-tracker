package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import androidx.collection.SieveCacheKt;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements i, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f22627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f22628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f22629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22631e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f22629c;
        return ((bVar.f22639h / ((long) bVar.f22635d)) * 1000000) / ((long) bVar.f22633b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return d.a(bVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f22627a = jVar;
        this.f22628b = jVar.a(0, 1);
        this.f22629c = null;
        jVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f22631e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        if (this.f22629c == null) {
            b bVarA = d.a(bVar);
            this.f22629c = bVarA;
            if (bVarA != null) {
                int i10 = bVarA.f22633b;
                int i11 = bVarA.f22636e * i10;
                int i12 = bVarA.f22632a;
                this.f22628b.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/raw", i11 * i12, 32768, i12, i10, bVarA.f22637f, -1, -1, null, null, 0, null, null));
                this.f22630d = this.f22629c.f22635d;
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unsupported or unrecognized wav header.");
            }
        }
        b bVar2 = this.f22629c;
        if (bVar2.f22638g == 0 || bVar2.f22639h == 0) {
            bVar.f21743e = 0;
            n nVar = new n(8);
            c cVarA = c.a(bVar, nVar);
            while (cVarA.f22640a != z.a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + cVarA.f22640a);
                long j10 = cVarA.f22641b + 8;
                if (cVarA.f22640a == z.a("RIFF")) {
                    j10 = 12;
                }
                if (j10 <= SieveCacheKt.NodeLinkMask) {
                    bVar.a((int) j10);
                    cVarA = c.a(bVar, nVar);
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Chunk is too large (~2GB+) to skip; id: " + cVarA.f22640a);
                }
            }
            bVar.a(8);
            long j11 = bVar.f21741c;
            long j12 = cVarA.f22641b;
            bVar2.f22638g = j11;
            bVar2.f22639h = j12;
            this.f22627a.a(this);
        }
        int iA = this.f22628b.a(bVar, 32768 - this.f22631e, true);
        if (iA != -1) {
            this.f22631e += iA;
        }
        int i13 = this.f22631e;
        int i14 = this.f22630d;
        int i15 = i13 / i14;
        if (i15 > 0) {
            long j13 = ((bVar.f21741c - ((long) i13)) * 1000000) / ((long) this.f22629c.f22634c);
            int i16 = i15 * i14;
            int i17 = i13 - i16;
            this.f22631e = i17;
            this.f22628b.a(j13, 1, i16, i17, null);
        }
        return iA == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        b bVar = this.f22629c;
        long j11 = (j10 * ((long) bVar.f22634c)) / 1000000;
        long j12 = bVar.f22635d;
        return Math.min((j11 / j12) * j12, bVar.f22639h - j12) + bVar.f22638g;
    }
}
