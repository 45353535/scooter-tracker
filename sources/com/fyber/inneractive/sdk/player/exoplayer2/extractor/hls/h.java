package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b {
    public static final AtomicInteger G = new AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public n D;
    public volatile boolean E;
    public volatile boolean F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f21837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f21839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f21840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f21841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f21842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f21843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f21844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f21845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f21846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f21847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f21848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f21849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f21850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n f21851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f21852y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f21853z;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar, List list, int i10, Object obj, long j10, long j11, int i11, int i12, boolean z10, v vVar, h hVar2, byte[] bArr, byte[] bArr2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h aVar2 = (bArr == null || bArr2 == null) ? hVar : new a(hVar, bArr, bArr2);
        super(i10, i11, j10, j11, aVar.f21913b, aVar2, kVar, obj);
        this.f21838k = i12;
        this.f21841n = kVar2;
        this.f21839l = aVar;
        this.f21849v = list;
        this.f21843p = z10;
        this.f21844q = vVar;
        this.f21842o = aVar2 instanceof a;
        String lastPathSegment = kVar.f23036a.getLastPathSegment();
        this.f21845r = lastPathSegment;
        boolean z11 = true;
        boolean z12 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.f21850w = z12;
        if (hVar2 != null) {
            this.f21851x = hVar2.f21851x;
            this.f21852y = hVar2.f21852y;
            this.f21846s = hVar2.f21853z;
            boolean z13 = hVar2.f21839l != aVar;
            this.f21847t = z13;
            if (hVar2.f21838k == i12 && !z13) {
                z11 = false;
            }
            this.f21848u = z11;
        } else {
            this.f21851x = z12 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n() : null;
            this.f21852y = z12 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10) : null;
            this.f21846s = null;
            this.f21847t = false;
            this.f21848u = true;
        }
        this.f21840m = hVar;
        this.f21837j = G.getAndIncrement();
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA;
        bVar.f21743e = 0;
        if (!bVar.a(this.f21852y.f23134a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f21852y.c(10);
        if (this.f21852y.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f22779b) {
            return -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f21852y;
        nVar.e(nVar.f23135b + 3);
        int i10 = this.f21852y.i();
        int i11 = i10 + 10;
        if (i11 > this.f21852y.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f21852y;
            byte[] bArr = nVar2.f23134a;
            nVar2.c(i11);
            System.arraycopy(bArr, 0, this.f21852y.f23134a, 0, 10);
        }
        if (!bVar.a(this.f21852y.f23134a, 10, i10, true) || (bVarA = this.f21851x.a(i10, this.f21852y.f23134a)) == null) {
            return -9223372036854775807L;
        }
        int length = bVarA.f22752a.length;
        for (int i12 = 0; i12 < length; i12++) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = bVarA.f22752a[i12];
            if (oVar instanceof q) {
                q qVar = (q) oVar;
                if ("com.apple.streaming.transportStreamTimestamp".equals(qVar.f22782b)) {
                    System.arraycopy(qVar.f22783c, 0, this.f21852y.f23134a, 0, 8);
                    this.f21852y.c(8);
                    return this.f21852y.g();
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ec A[Catch: all -> 0x01fb, TryCatch #3 {all -> 0x01fb, blocks: (B:128:0x01db, B:130:0x01ec, B:132:0x01f4, B:136:0x01ff, B:135:0x01fd, B:138:0x0207, B:147:0x0225, B:145:0x021a, B:146:0x0224, B:140:0x020e, B:142:0x0212), top: B:158:0x01db, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0207 A[Catch: all -> 0x01fb, TRY_LEAVE, TryCatch #3 {all -> 0x01fb, blocks: (B:128:0x01db, B:130:0x01ec, B:132:0x01f4, B:136:0x01ff, B:135:0x01fd, B:138:0x0207, B:147:0x0225, B:145:0x021a, B:146:0x0224, B:140:0x020e, B:142:0x0212), top: B:158:0x01db, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void load() {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h.load():void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.E;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i aVar;
        if (this.f21845r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j10);
        } else if (!this.f21845r.endsWith(".ac3") && !this.f21845r.endsWith(".ec3")) {
            if (this.f21845r.endsWith(".mp3")) {
                aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c(j10);
            } else {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.f21845r);
            }
        } else {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j10);
        }
        aVar.a(this.D);
        return aVar;
    }
}
