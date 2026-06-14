package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f22613g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f22607a = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22609c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f22608b = new SparseArray();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        byte[] bArr = new byte[14];
        bVar.a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.a(bArr[13] & 7, false);
        bVar.a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f22613g = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f22607a.f23160c = -9223372036854775807L;
        for (int i10 = 0; i10 < this.f22608b.size(); i10++) {
            t tVar = (t) this.f22608b.valueAt(i10);
            tVar.f22605f = false;
            tVar.f22600a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r15) throws java.lang.InterruptedException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }
}
