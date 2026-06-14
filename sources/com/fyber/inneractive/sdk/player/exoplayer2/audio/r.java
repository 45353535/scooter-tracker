package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C4240b4;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class r {
    public long A;
    public boolean B;
    public long C;
    public Method D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public float P;
    public c[] Q;
    public ByteBuffer[] R;
    public ByteBuffer S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f21621a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f21622a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f21623b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f21624b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c[] f21625c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f21626c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f21627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConditionVariable f21628e = new ConditionVariable(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f21629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f21630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f21631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioTrack f21632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f21640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f21641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f21642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f21644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ByteBuffer f21645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f21649z;

    public r(c[] cVarArr, u uVar) {
        this.f21627d = uVar;
        if (z.f23162a >= 18) {
            try {
                this.D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (z.f23162a >= 19) {
            this.f21630g = new l();
        } else {
            this.f21630g = new k();
        }
        s sVar = new s();
        this.f21621a = sVar;
        x xVar = new x();
        this.f21623b = xVar;
        c[] cVarArr2 = new c[cVarArr.length + 3];
        this.f21625c = cVarArr2;
        cVarArr2[0] = new v();
        cVarArr2[1] = sVar;
        System.arraycopy(cVarArr, 0, cVarArr2, 2, cVarArr.length);
        cVarArr2[cVarArr.length + 2] = xVar;
        this.f21629f = new long[10];
        this.P = 1.0f;
        this.L = 0;
        this.f21637n = 3;
        this.Z = 0;
        this.f21642s = com.fyber.inneractive.sdk.player.exoplayer2.s.f22815d;
        this.W = -1;
        this.Q = new c[0];
        this.R = new ByteBuffer[0];
        this.f21631h = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r10, int r11, int r12, int[] r13) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.m {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a(int, int, int, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.nio.ByteBuffer r8, long r9) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.q {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.b(java.nio.ByteBuffer, long):void");
    }

    public final boolean c() {
        if (!d()) {
            return false;
        }
        if (b() <= this.f21630g.a()) {
            return e() && this.f21632i.getPlayState() == 2 && this.f21632i.getPlaybackHeadPosition() == 0;
        }
        return true;
    }

    public final boolean d() {
        return this.f21632i != null;
    }

    public final boolean e() {
        if (z.f23162a >= 23) {
            return false;
        }
        int i10 = this.f21636m;
        return i10 == 5 || i10 == 6;
    }

    public final void f() {
        this.Y = true;
        if (d()) {
            this.N = System.nanoTime() / 1000;
            this.f21632i.play();
        }
    }

    public final void g() {
        if (d()) {
            this.F = 0L;
            this.G = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f21641r;
            if (sVar != null) {
                this.f21642s = sVar;
                this.f21641r = null;
            } else if (!this.f21631h.isEmpty()) {
                this.f21642s = ((p) this.f21631h.getLast()).f21618a;
            }
            this.f21631h.clear();
            this.f21643t = 0L;
            this.f21644u = 0L;
            this.S = null;
            this.T = null;
            int i10 = 0;
            while (true) {
                c[] cVarArr = this.Q;
                if (i10 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i10];
                cVar.flush();
                this.R[i10] = cVar.a();
                i10++;
            }
            this.X = false;
            this.W = -1;
            this.f21645v = null;
            this.f21646w = 0;
            this.L = 0;
            this.O = 0L;
            this.f21649z = 0L;
            this.f21648y = 0;
            this.f21647x = 0;
            this.A = 0L;
            this.B = false;
            this.C = 0L;
            if (this.f21632i.getPlayState() == 3) {
                this.f21632i.pause();
            }
            AudioTrack audioTrack = this.f21632i;
            this.f21632i = null;
            this.f21630g.a(null, false);
            this.f21628e.close();
            new j(this, audioTrack).start();
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f21625c) {
            if (cVar.d()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.Q = (c[]) arrayList.toArray(new c[size]);
        this.R = new ByteBuffer[size];
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = this.Q[i10];
            cVar2.flush();
            this.R[i10] = cVar2.a();
        }
    }

    public final void i() {
        if (d()) {
            if (z.f23162a >= 21) {
                this.f21632i.setVolume(this.P);
                return;
            }
            AudioTrack audioTrack = this.f21632i;
            float f10 = this.P;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final boolean a(ByteBuffer byteBuffer, long j10) throws q, n {
        long j11;
        int i10;
        ByteBuffer byteBuffer2 = this.S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!d()) {
            this.f21628e.block();
            if (this.f21622a0) {
                this.f21632i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f21634k).setEncoding(this.f21636m).setSampleRate(this.f21633j).build(), this.f21639p, 1, this.Z);
            } else if (this.Z == 0) {
                this.f21632i = new AudioTrack(this.f21637n, this.f21633j, this.f21634k, this.f21636m, this.f21639p, 1);
            } else {
                this.f21632i = new AudioTrack(this.f21637n, this.f21633j, this.f21634k, this.f21636m, this.f21639p, 1, this.Z);
            }
            int state = this.f21632i.getState();
            if (state == 1) {
                int audioSessionId = this.f21632i.getAudioSessionId();
                if (this.Z != audioSessionId) {
                    this.Z = audioSessionId;
                    u uVar = (u) this.f21627d;
                    uVar.f21661a.P.audioSessionId(audioSessionId);
                    uVar.f21661a.getClass();
                }
                this.f21630g.a(this.f21632i, e());
                i();
                this.f21624b0 = false;
                if (this.Y) {
                    f();
                }
            } else {
                try {
                    this.f21632i.release();
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    this.f21632i = null;
                    throw th2;
                }
                this.f21632i = null;
                throw new n(state, this.f21633j, this.f21634k, this.f21639p);
            }
        }
        if (e()) {
            if (this.f21632i.getPlayState() == 2) {
                this.f21624b0 = false;
                return false;
            }
            if (this.f21632i.getPlayState() == 1 && this.f21630g.a() != 0) {
                return false;
            }
        }
        boolean z10 = this.f21624b0;
        boolean zC = c();
        this.f21624b0 = zC;
        if (z10 && !zC && this.f21632i.getPlayState() != 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21626c0;
            u uVar2 = (u) this.f21627d;
            uVar2.f21661a.P.audioTrackUnderrun(this.f21639p, com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f21640q), jElapsedRealtime);
            uVar2.f21661a.getClass();
        }
        if (this.S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f21638o && this.K == 0) {
                int i11 = this.f21636m;
                if (i11 == 7 || i11 == 8) {
                    int iPosition = byteBuffer.position();
                    i10 = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i11 == 5) {
                    i10 = 1536;
                } else if (i11 == 6) {
                    i10 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a.f21580a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                } else {
                    throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected audio encoding: ", i11));
                }
                this.K = i10;
            }
            if (this.f21641r == null) {
                j11 = 1000000;
            } else {
                if (!a()) {
                    return false;
                }
                j11 = 1000000;
                this.f21631h.add(new p(this.f21641r, Math.max(0L, j10), (b() * 1000000) / ((long) this.f21633j)));
                this.f21641r = null;
                h();
            }
            int i12 = this.L;
            if (i12 == 0) {
                this.M = Math.max(0L, j10);
                this.L = 1;
            } else {
                long j12 = (((this.f21638o ? this.G : this.F / ((long) this.E)) * j11) / ((long) this.f21633j)) + this.M;
                if (i12 == 1 && Math.abs(j12 - j10) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j12 + ", got " + j10 + C4240b4.j.f42674e);
                    this.L = 2;
                }
                if (this.L == 2) {
                    this.M = (j10 - j12) + this.M;
                    this.L = 1;
                    u uVar3 = (u) this.f21627d;
                    uVar3.f21661a.getClass();
                    uVar3.f21661a.V = true;
                }
            }
            if (this.f21638o) {
                this.G += (long) this.K;
            } else {
                this.F += (long) byteBuffer.remaining();
            }
            this.S = byteBuffer;
        }
        if (this.f21638o) {
            b(this.S, j10);
        } else {
            a(j10);
        }
        if (this.S.hasRemaining()) {
            return false;
        }
        this.S = null;
        return true;
    }

    public final long b() {
        return this.f21638o ? this.J : this.I / ((long) this.H);
    }

    public final void a(long j10) throws q {
        ByteBuffer byteBuffer;
        int length = this.Q.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.R[i10 - 1];
            } else {
                byteBuffer = this.S;
                if (byteBuffer == null) {
                    byteBuffer = c.f21586a;
                }
            }
            if (i10 == length) {
                b(byteBuffer, j10);
            } else {
                c cVar = this.Q[i10];
                cVar.a(byteBuffer);
                ByteBuffer byteBufferA = cVar.a();
                this.R[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() throws com.fyber.inneractive.sdk.player.exoplayer2.audio.q {
        /*
            r9 = this;
            int r0 = r9.W
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.f21638o
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r0 = r9.Q
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r2
        L10:
            r9.W = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r5 = r9.Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.b()
        L28:
            r9.a(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.W
            int r0 = r0 + r1
            r9.W = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.W = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a():boolean");
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f21638o) {
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar2 = com.fyber.inneractive.sdk.player.exoplayer2.s.f22815d;
            this.f21642s = sVar2;
            return sVar2;
        }
        x xVar = this.f21623b;
        float f10 = sVar.f22816a;
        xVar.getClass();
        int i10 = z.f23162a;
        float fMax = Math.max(0.1f, Math.min(f10, 8.0f));
        xVar.f21695e = fMax;
        x xVar2 = this.f21623b;
        float f11 = sVar.f22817b;
        xVar2.getClass();
        xVar2.f21696f = Math.max(0.1f, Math.min(f11, 8.0f));
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.s(fMax, f11);
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar4 = this.f21641r;
        if (sVar4 == null) {
            if (!this.f21631h.isEmpty()) {
                sVar4 = ((p) this.f21631h.getLast()).f21618a;
            } else {
                sVar4 = this.f21642s;
            }
        }
        if (!sVar3.equals(sVar4)) {
            if (d()) {
                this.f21641r = sVar3;
            } else {
                this.f21642s = sVar3;
            }
        }
        return this.f21642s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r27) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a(boolean):long");
    }
}
