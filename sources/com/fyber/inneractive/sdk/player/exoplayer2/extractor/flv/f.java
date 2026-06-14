package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f21788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f21789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21792f;

    public f(r rVar) {
        super(rVar);
        this.f21788b = new n(l.f23126a);
        this.f21789c = new n(4);
    }

    public final boolean a(n nVar) throws d {
        int iJ = nVar.j();
        int i10 = (iJ >> 4) & 15;
        int i11 = iJ & 15;
        if (i11 != 7) {
            throw new d(m.a("Video format not supported: ", i11));
        }
        this.f21792f = i10;
        return i10 != 5;
    }

    public final void a(n nVar, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int iJ = nVar.j();
        long jL = (((long) nVar.l()) * 1000) + j10;
        if (iJ == 0 && !this.f21791e) {
            byte[] bArr = new byte[nVar.f23136c - nVar.f23135b];
            n nVar2 = new n(bArr);
            nVar.a(bArr, 0, nVar.f23136c - nVar.f23135b);
            com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar2);
            this.f21790d = aVarA.f23193b;
            this.f21787a.a(o.a(null, "video/avc", -1, aVarA.f23194c, aVarA.f23195d, aVarA.f23192a, -1, aVarA.f23196e, null, -1, null, null));
            this.f21791e = true;
            return;
        }
        if (iJ == 1 && this.f21791e) {
            byte[] bArr2 = this.f21789c.f23134a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = 4 - this.f21790d;
            int i11 = 0;
            while (nVar.f23136c - nVar.f23135b > 0) {
                nVar.a(this.f21789c.f23134a, i10, this.f21790d);
                this.f21789c.e(0);
                int iM = this.f21789c.m();
                this.f21788b.e(0);
                this.f21787a.a(4, this.f21788b);
                this.f21787a.a(iM, nVar);
                i11 = i11 + 4 + iM;
            }
            this.f21787a.a(jL, this.f21792f == 1 ? 1 : 0, i11, 0, null);
        }
    }
}
