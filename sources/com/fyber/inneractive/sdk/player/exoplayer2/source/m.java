package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f22858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f22859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f22860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.o f22861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f22862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f22866j;

    public m(p pVar, Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar) {
        this.f22866j = pVar;
        uri.getClass();
        this.f22857a = uri;
        hVar.getClass();
        this.f22858b = hVar;
        nVar.getClass();
        this.f22859c = nVar;
        this.f22860d = eVar;
        this.f22861e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.o();
        this.f22863g = true;
        this.f22865i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f22862f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f22862f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() throws Throwable {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
        long j10;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar;
        int iA = 0;
        while (iA == 0 && !this.f22862f) {
            try {
                j10 = this.f22861e.f22310a;
                long jA = this.f22858b.a(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(this.f22857a, j10, j10, -1L, this.f22866j.f22879h, 0));
                this.f22865i = jA;
                if (jA != -1) {
                    this.f22865i = jA + j10;
                }
                hVar = this.f22858b;
                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, j10, this.f22865i);
            } catch (Throwable th2) {
                th = th2;
                bVar = null;
            }
            try {
                n nVar = this.f22859c;
                hVar.a();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVarA = nVar.a(bVar);
                if (this.f22863g) {
                    iVarA.a(j10, this.f22864h);
                    this.f22863g = false;
                }
                while (iA == 0 && !this.f22862f) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f22860d;
                    synchronized (eVar) {
                        while (!eVar.f23107a) {
                            eVar.wait();
                        }
                    }
                    iA = iVarA.a(bVar, this.f22861e);
                    long j11 = bVar.f21741c;
                    if (j11 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j10) {
                        this.f22860d.a();
                        p pVar = this.f22866j;
                        pVar.f22885n.post(pVar.f22884m);
                        j10 = j11;
                    }
                }
                if (iA == 1) {
                    iA = 0;
                } else {
                    this.f22861e.f22310a = bVar.f21741c;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f22858b);
            } catch (Throwable th3) {
                th = th3;
                if (iA != 1 && bVar != null) {
                    this.f22861e.f22310a = bVar.f21741c;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f22858b);
                throw th;
            }
        }
    }
}
