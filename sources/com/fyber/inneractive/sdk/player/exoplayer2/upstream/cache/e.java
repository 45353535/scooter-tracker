package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.e0;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f22957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f22958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f22959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f22960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22961e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22962f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22963g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f22964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f22966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f22968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f22971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22973q;

    public e(l lVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2, c cVar) {
        this.f22957a = lVar;
        this.f22958b = hVar2;
        this.f22960d = hVar;
        if (cVar != null) {
            this.f22959c = new e0(hVar, cVar);
        } else {
            this.f22959c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r9) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 1
            android.net.Uri r1 = r9.f23036a     // Catch: java.io.IOException -> L23
            r8.f22966j = r1     // Catch: java.io.IOException -> L23
            int r2 = r9.f23041f     // Catch: java.io.IOException -> L23
            r8.f22967k = r2     // Catch: java.io.IOException -> L23
            java.lang.String r2 = r9.f23040e     // Catch: java.io.IOException -> L23
            if (r2 == 0) goto Le
            goto L12
        Le:
            java.lang.String r2 = r1.toString()     // Catch: java.io.IOException -> L23
        L12:
            r8.f22968l = r2     // Catch: java.io.IOException -> L23
            long r3 = r9.f23038c     // Catch: java.io.IOException -> L23
            r8.f22969m = r3     // Catch: java.io.IOException -> L23
            boolean r1 = r8.f22962f     // Catch: java.io.IOException -> L23
            r3 = -1
            if (r1 == 0) goto L25
            boolean r1 = r8.f22972p     // Catch: java.io.IOException -> L23
            if (r1 != 0) goto L2f
            goto L25
        L23:
            r9 = move-exception
            goto L63
        L25:
            long r5 = r9.f23039d     // Catch: java.io.IOException -> L23
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L31
            boolean r1 = r8.f22963g     // Catch: java.io.IOException -> L23
            if (r1 == 0) goto L31
        L2f:
            r1 = r0
            goto L32
        L31:
            r1 = 0
        L32:
            r8.f22973q = r1     // Catch: java.io.IOException -> L23
            long r5 = r9.f23039d     // Catch: java.io.IOException -> L23
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L5b
            if (r1 == 0) goto L3d
            goto L5b
        L3d:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r1 = r8.f22957a     // Catch: java.io.IOException -> L23
            long r1 = r1.a(r2)     // Catch: java.io.IOException -> L23
            r8.f22970n = r1     // Catch: java.io.IOException -> L23
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L5d
            long r3 = r9.f23038c     // Catch: java.io.IOException -> L23
            long r1 = r1 - r3
            r8.f22970n = r1     // Catch: java.io.IOException -> L23
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L55
            goto L5d
        L55:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.i r9 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i     // Catch: java.io.IOException -> L23
            r9.<init>()     // Catch: java.io.IOException -> L23
            throw r9     // Catch: java.io.IOException -> L23
        L5b:
            r8.f22970n = r5     // Catch: java.io.IOException -> L23
        L5d:
            r8.a(r0)     // Catch: java.io.IOException -> L23
            long r0 = r8.f22970n     // Catch: java.io.IOException -> L23
            return r0
        L63:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r1 = r8.f22964h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r2 = r8.f22958b
            if (r1 == r2) goto L6d
            boolean r1 = r9 instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
            if (r1 == 0) goto L6f
        L6d:
            r8.f22972p = r0
        L6f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k):long");
    }

    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f22964h;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
            this.f22964h = null;
            this.f22965i = false;
            m mVar = this.f22971o;
            if (mVar != null) {
                l lVar = this.f22957a;
                synchronized (lVar) {
                    if (mVar != lVar.f23001c.remove(mVar.f22978a)) {
                        throw new IllegalStateException();
                    }
                    lVar.notifyAll();
                }
                this.f22971o = null;
            }
        } catch (Throwable th2) {
            m mVar2 = this.f22971o;
            if (mVar2 != null) {
                this.f22957a.b(mVar2);
                this.f22971o = null;
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws IOException {
        this.f22966j = null;
        try {
            b();
        } catch (IOException e10) {
            if (this.f22964h == this.f22958b || (e10 instanceof a)) {
                this.f22972p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f22970n == 0) {
            return -1;
        }
        try {
            int i12 = this.f22964h.read(bArr, i10, i11);
            if (i12 >= 0) {
                long j10 = i12;
                this.f22969m += j10;
                long j11 = this.f22970n;
                if (j11 != -1) {
                    this.f22970n = j11 - j10;
                    return i12;
                }
            } else {
                if (this.f22965i) {
                    a(this.f22969m);
                    this.f22970n = 0L;
                }
                b();
                long j12 = this.f22970n;
                if ((j12 > 0 || j12 == -1) && a(false)) {
                    return read(bArr, i10, i11);
                }
            }
            return i12;
        } catch (IOException e10) {
            if (this.f22964h == this.f22958b || (e10 instanceof a)) {
                this.f22972p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f22964h;
        return hVar == this.f22960d ? hVar.a() : this.f22966j;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e.a(boolean):boolean");
    }

    public final void a(long j10) {
        if (this.f22964h == this.f22959c) {
            l lVar = this.f22957a;
            String str = this.f22968l;
            synchronized (lVar) {
                try {
                    i iVar = lVar.f23002d;
                    h hVar = (h) iVar.f22988a.get(str);
                    if (hVar == null) {
                        iVar.a(str, j10);
                    } else if (hVar.f22987d != j10) {
                        hVar.f22987d = j10;
                        iVar.f22993f = true;
                    }
                    lVar.f23002d.b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
