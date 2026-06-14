package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends com.fyber.inneractive.sdk.player.exoplayer2.a {
    public static final byte[] O;
    public ByteBuffer[] A;
    public long B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public DecoderCounters N;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f22722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f22723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f22724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f22725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f22726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaCodec.BufferInfo f22727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f22728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MediaCodec f22729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer[] f22740z;

    static {
        int i10 = z.f23162a;
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4));
        }
        O = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, boolean z10) {
        super(i10);
        d dVar = d.f22741a;
        if (z.f23162a < 16) {
            throw new IllegalStateException();
        }
        this.f22722h = dVar;
        this.f22723i = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f22724j = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f22725k = new p();
        this.f22726l = new ArrayList();
        this.f22727m = new MediaCodec.BufferInfo();
        this.G = 0;
        this.H = 0;
    }

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void a(a aVar, MediaCodec mediaCodec, o oVar);

    public abstract void a(String str, long j10, long j11);

    public abstract boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10);

    public boolean a(boolean z10, o oVar, o oVar2) {
        return false;
    }

    public abstract int b(d dVar, o oVar);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean e() {
        return this.L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean f() {
        if (this.f22728n == null) {
            return false;
        }
        if ((this.f21578f ? this.f21579g : this.f21576d.isReady()) || this.D >= 0) {
            return true;
        }
        return this.B != -9223372036854775807L && SystemClock.elapsedRealtime() < this.B;
    }

    public final boolean k() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        MediaCodec mediaCodec = this.f22729o;
        if (mediaCodec == null || this.H == 2 || this.K) {
            return false;
        }
        if (this.C < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.C = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar = this.f22723i;
            cVar.f21721c = this.f22740z[iDequeueInputBuffer];
            cVar.a();
        }
        if (this.H == 1) {
            if (!this.f22734t) {
                this.J = true;
                this.f22729o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                this.C = -1;
            }
            this.H = 2;
            return false;
        }
        if (this.f22738x) {
            this.f22738x = false;
            ByteBuffer byteBuffer = this.f22723i.f21721c;
            byte[] bArr = O;
            byteBuffer.put(bArr);
            this.f22729o.queueInputBuffer(this.C, 0, bArr.length, 0L, 0);
            this.C = -1;
            this.I = true;
            return true;
        }
        if (this.G == 1) {
            for (int i10 = 0; i10 < this.f22728n.f22795h.size(); i10++) {
                this.f22723i.f21721c.put((byte[]) this.f22728n.f22795h.get(i10));
            }
            this.G = 2;
        }
        int iPosition = this.f22723i.f21721c.position();
        int iA = a(this.f22725k, this.f22723i, false);
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            if (this.G == 2) {
                this.f22723i.a();
                this.G = 1;
            }
            a(this.f22725k.f22814a);
            return true;
        }
        if (this.f22723i.b(4)) {
            if (this.G == 2) {
                this.f22723i.a();
                this.G = 1;
            }
            this.K = true;
            if (!this.I) {
                n();
                return false;
            }
            try {
                if (!this.f22734t) {
                    this.J = true;
                    this.f22729o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                    this.C = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
            }
        }
        if (this.M && !this.f22723i.b(1)) {
            this.f22723i.a();
            if (this.G == 2) {
                this.G = 1;
            }
            return true;
        }
        this.M = false;
        boolean zB = this.f22723i.b(1073741824);
        if (this.f22731q && !zB) {
            ByteBuffer byteBuffer2 = this.f22723i.f21721c;
            int iPosition2 = byteBuffer2.position();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                if (i13 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i14 = byteBuffer2.get(i11) & 255;
                if (i12 == 3) {
                    if (i14 == 1 && (byteBuffer2.get(i13) & Ascii.US) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(i11 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i14 == 0) {
                    i12++;
                }
                if (i14 != 0) {
                    i12 = 0;
                }
                i11 = i13;
            }
            if (this.f22723i.f21721c.position() == 0) {
                return true;
            }
            this.f22731q = false;
        }
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar2 = this.f22723i;
            long j10 = cVar2.f21722d;
            if (cVar2.b(Integer.MIN_VALUE)) {
                this.f22726l.add(Long.valueOf(j10));
            }
            this.f22723i.f21721c.flip();
            m();
            if (zB) {
                MediaCodec.CryptoInfo cryptoInfo = this.f22723i.f21720b.f21717d;
                if (iPosition != 0) {
                    if (cryptoInfo.numBytesOfClearData == null) {
                        cryptoInfo.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfo.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.f22729o.queueSecureInputBuffer(this.C, 0, cryptoInfo, j10, 0);
            } else {
                this.f22729o.queueInputBuffer(this.C, 0, this.f22723i.f21721c.limit(), j10, 0);
            }
            this.C = -1;
            this.I = true;
            this.G = 0;
            this.N.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.l():void");
    }

    public void m() {
    }

    public final void n() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.H == 2) {
            o();
            l();
        } else {
            this.L = true;
            p();
        }
    }

    public final void o() {
        if (this.f22729o != null) {
            this.B = -9223372036854775807L;
            this.C = -1;
            this.D = -1;
            this.E = false;
            this.f22726l.clear();
            this.f22740z = null;
            this.A = null;
            this.F = false;
            this.I = false;
            this.f22730p = false;
            this.f22731q = false;
            this.f22732r = false;
            this.f22733s = false;
            this.f22734t = false;
            this.f22735u = false;
            this.f22737w = false;
            this.f22738x = false;
            this.f22739y = false;
            this.J = false;
            this.G = 0;
            this.H = 0;
            this.N.decoderReleaseCount++;
            this.f22723i.f21721c = null;
            try {
                this.f22729o.stop();
                try {
                    this.f22729o.release();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    this.f22729o.release();
                    throw th2;
                } finally {
                }
            }
        }
    }

    public void p() {
    }

    public boolean q() {
        return this.f22729o == null && this.f22728n != null;
    }

    public a a(d dVar, o oVar) {
        String str = oVar.f22793f;
        dVar.getClass();
        return j.a(false, str);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.K = false;
        this.L = false;
        if (this.f22729o != null) {
            this.B = -9223372036854775807L;
            this.C = -1;
            this.D = -1;
            this.M = true;
            this.E = false;
            this.f22726l.clear();
            this.f22738x = false;
            this.f22739y = false;
            if (this.f22732r || ((this.f22735u && this.J) || this.H != 0)) {
                o();
                l();
            } else {
                this.f22729o.flush();
                this.I = false;
            }
            if (!this.F || this.f22728n == null) {
                return;
            }
            this.G = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r16, long r18) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.a(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.o r5) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.o r0 = r4.f22728n
            r4.f22728n = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r5 = r5.f22796i
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r1 = r0.f22796i
        Lc:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(r5, r1)
            if (r5 != 0) goto L26
            com.fyber.inneractive.sdk.player.exoplayer2.o r5 = r4.f22728n
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r5 = r5.f22796i
            if (r5 != 0) goto L19
            goto L26
        L19:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = new com.fyber.inneractive.sdk.player.exoplayer2.d
            r0.<init>(r5)
            throw r0
        L26:
            android.media.MediaCodec r5 = r4.f22729o
            r1 = 1
            if (r5 == 0) goto L50
            boolean r5 = r4.f22730p
            com.fyber.inneractive.sdk.player.exoplayer2.o r2 = r4.f22728n
            boolean r5 = r4.a(r5, r0, r2)
            if (r5 == 0) goto L50
            r4.F = r1
            r4.G = r1
            boolean r5 = r4.f22733s
            if (r5 == 0) goto L4c
            com.fyber.inneractive.sdk.player.exoplayer2.o r5 = r4.f22728n
            int r2 = r5.f22797j
            int r3 = r0.f22797j
            if (r2 != r3) goto L4c
            int r5 = r5.f22798k
            int r0 = r0.f22798k
            if (r5 != r0) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            r4.f22738x = r1
            return
        L50:
            boolean r5 = r4.I
            if (r5 == 0) goto L57
            r4.H = r1
            return
        L57:
            r4.o()
            r4.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.a(com.fyber.inneractive.sdk.player.exoplayer2.o):void");
    }
}
