package da;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import da.c0;
import da.n;
import io.bidmachine.media3.exoplayer.i2;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.UUID;
import oa.k0;
import q9.i0;
import q9.o0;
import t9.f;
import v9.c2;
import w9.g0;
import z9.n;

/* JADX INFO: loaded from: classes12.dex */
public abstract class t extends io.bidmachine.media3.exoplayer.h {
    private static final byte[] F0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private final MediaCodec.BufferInfo A;
    protected u9.b A0;
    private final ArrayDeque B;
    private e B0;
    private final g0 C;
    private long C0;
    private io.bidmachine.media3.common.a D;
    private boolean D0;
    private io.bidmachine.media3.common.a E;
    private boolean E0;
    private z9.n F;
    private z9.n G;
    private i2.a H;
    private MediaCrypto I;
    private long J;
    private float K;
    private float L;
    private n M;
    private io.bidmachine.media3.common.a N;
    private MediaFormat O;
    private boolean P;
    private float Q;
    private ArrayDeque R;
    private c S;
    private r T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f68555a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f68556b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f68557c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f68558d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f68559e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f68560f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ByteBuffer f68561g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f68562h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f68563i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f68564j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f68565k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f68566l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f68567m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f68568n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f68569o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f68570p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f68571q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f68572r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final n.b f68573s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f68574s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final x f68575t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long f68576t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f68577u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long f68578u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final float f68579v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f68580v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final t9.f f68581w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f68582w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final t9.f f68583x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f68584x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final t9.f f68585y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f68586y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final h f68587z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.s f68588z0;

    private static final class b {
        public static void a(n.a aVar, c2 c2Var) {
            LogSessionId logSessionIdA = c2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f68533b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    private final class d implements n.c {
        private d() {
        }

        @Override // da.n.c
        public void onInputBufferAvailable() {
            if (t.this.H != null) {
                t.this.H.onWakeup();
            }
        }

        @Override // da.n.c
        public void onOutputBufferAvailable() {
            if (t.this.H != null) {
                t.this.H.onWakeup();
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f68595e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f68596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f68597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f68598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i0 f68599d = new i0();

        public e(long j10, long j11, long j12) {
            this.f68596a = j10;
            this.f68597b = j11;
            this.f68598c = j12;
        }
    }

    public t(int i10, n.b bVar, x xVar, boolean z10, float f10) {
        super(i10);
        this.f68573s = bVar;
        this.f68575t = (x) q9.a.e(xVar);
        this.f68577u = z10;
        this.f68579v = f10;
        this.f68581w = t9.f.p();
        this.f68583x = new t9.f(0);
        this.f68585y = new t9.f(2);
        h hVar = new h();
        this.f68587z = hVar;
        this.A = new MediaCodec.BufferInfo();
        this.K = 1.0f;
        this.L = 1.0f;
        this.J = -9223372036854775807L;
        this.B = new ArrayDeque();
        this.B0 = e.f68595e;
        hVar.m(0);
        hVar.f104988e.order(ByteOrder.nativeOrder());
        this.C = new g0();
        this.Q = -1.0f;
        this.U = 0;
        this.f68568n0 = 0;
        this.f68559e0 = -1;
        this.f68560f0 = -1;
        this.f68558d0 = -9223372036854775807L;
        this.f68576t0 = -9223372036854775807L;
        this.f68578u0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.f68556b0 = -9223372036854775807L;
        this.f68569o0 = 0;
        this.f68570p0 = 0;
        this.A0 = new u9.b();
    }

    private void B0(MediaCrypto mediaCrypto, boolean z10) throws c {
        io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) q9.a.e(this.D);
        if (this.R == null) {
            try {
                List listB0 = b0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.R = arrayDeque;
                if (this.f68577u) {
                    arrayDeque.addAll(listB0);
                } else if (!listB0.isEmpty()) {
                    this.R.add((r) listB0.get(0));
                }
                this.S = null;
            } catch (c0.c e10) {
                throw new c(aVar, e10, z10, -49998);
            }
        }
        if (this.R.isEmpty()) {
            throw new c(aVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) q9.a.e(this.R);
        while (this.M == null) {
            r rVar = (r) q9.a.e((r) arrayDeque2.peekFirst());
            if (!C0(aVar) || !f1(rVar)) {
                return;
            }
            try {
                u0(rVar, mediaCrypto);
            } catch (Exception e11) {
                q9.u.i("MediaCodecRenderer", "Failed to initialize decoder: " + rVar, e11);
                arrayDeque2.removeFirst();
                c cVar = new c(aVar, e11, z10, rVar);
                D0(cVar);
                if (this.S == null) {
                    this.S = cVar;
                } else {
                    this.S = this.S.c(cVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.S;
                }
            }
        }
        this.R = null;
    }

    private void I() throws io.bidmachine.media3.exoplayer.s {
        q9.a.g(!this.f68580v0);
        u9.d0 d0VarL = l();
        this.f68585y.c();
        do {
            this.f68585y.c();
            int iE = E(d0VarL, this.f68585y, 0);
            if (iE == -5) {
                G0(d0VarL);
                return;
            }
            if (iE == -4) {
                if (!this.f68585y.f()) {
                    this.f68576t0 = Math.max(this.f68576t0, this.f68585y.f104990g);
                    if (hasReadStreamToEnd() || this.f68583x.i()) {
                        this.f68578u0 = this.f68576t0;
                    }
                    if (this.f68584x0) {
                        io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) q9.a.e(this.D);
                        this.E = aVar;
                        if (Objects.equals(aVar.f80561o, "audio/opus") && !this.E.f80564r.isEmpty()) {
                            this.E = this.E.b().Z(k0.f((byte[]) this.E.f80564r.get(0))).N();
                        }
                        H0(this.E, null);
                        this.f68584x0 = false;
                    }
                    this.f68585y.n();
                    io.bidmachine.media3.common.a aVar2 = this.E;
                    if (aVar2 != null && Objects.equals(aVar2.f80561o, "audio/opus")) {
                        if (this.f68585y.e()) {
                            t9.f fVar = this.f68585y;
                            fVar.f104986c = this.E;
                            q0(fVar);
                        }
                        if (k0.g(n(), this.f68585y.f104990g)) {
                            this.C.a(this.f68585y, this.E.f80564r);
                        }
                    }
                    if (!s0()) {
                        break;
                    }
                } else {
                    this.f68580v0 = true;
                    this.f68578u0 = this.f68576t0;
                    return;
                }
            } else {
                if (iE != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    this.f68578u0 = this.f68576t0;
                    return;
                }
                return;
            }
        } while (this.f68587z.r(this.f68585y));
        this.f68565k0 = true;
    }

    private boolean J(long j10, long j11) throws io.bidmachine.media3.exoplayer.s {
        boolean z10;
        q9.a.g(!this.f68582w0);
        if (this.f68587z.w()) {
            h hVar = this.f68587z;
            z10 = false;
            if (!O0(j10, j11, null, hVar.f104988e, this.f68560f0, 0, hVar.v(), this.f68587z.t(), y0(n(), this.f68587z.u()), this.f68587z.f(), (io.bidmachine.media3.common.a) q9.a.e(this.E))) {
                return false;
            }
            J0(this.f68587z.u());
            this.f68587z.c();
        } else {
            z10 = false;
        }
        if (this.f68580v0) {
            this.f68582w0 = true;
            return z10;
        }
        if (this.f68565k0) {
            q9.a.g(this.f68587z.r(this.f68585y));
            this.f68565k0 = z10;
        }
        if (this.f68566l0) {
            if (this.f68587z.w()) {
                return true;
            }
            R();
            this.f68566l0 = z10;
            A0();
            if (!this.f68564j0) {
                return z10;
            }
        }
        I();
        if (this.f68587z.w()) {
            this.f68587z.n();
        }
        if (this.f68587z.w() || this.f68580v0 || this.f68566l0) {
            return true;
        }
        return z10;
    }

    private int L(String str) {
        int i10 = o0.f98837a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Build.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean M(String str) {
        return o0.f98837a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean N(String str) {
        return o0.f98837a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private void N0() throws io.bidmachine.media3.exoplayer.s {
        int i10 = this.f68570p0;
        if (i10 == 1) {
            Y();
            return;
        }
        if (i10 == 2) {
            Y();
            m1();
        } else if (i10 == 3) {
            R0();
        } else {
            this.f68582w0 = true;
            T0();
        }
    }

    private static boolean O(r rVar) {
        String str = rVar.f68542a;
        int i10 = o0.f98837a;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && rVar.f68548g;
        }
        return true;
    }

    private static boolean P(String str) {
        return o0.f98837a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void P0() {
        this.f68574s0 = true;
        MediaFormat outputFormat = ((n) q9.a.e(this.M)).getOutputFormat();
        if (this.U != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.Z = true;
        } else {
            this.O = outputFormat;
            this.P = true;
        }
    }

    private boolean Q0(int i10) throws io.bidmachine.media3.exoplayer.s {
        u9.d0 d0VarL = l();
        this.f68581w.c();
        int iE = E(d0VarL, this.f68581w, i10 | 4);
        if (iE == -5) {
            G0(d0VarL);
            return true;
        }
        if (iE != -4 || !this.f68581w.f()) {
            return false;
        }
        this.f68580v0 = true;
        N0();
        return false;
    }

    private void R() {
        this.f68566l0 = false;
        this.f68587z.c();
        this.f68585y.c();
        this.f68565k0 = false;
        this.f68564j0 = false;
        this.C.d();
    }

    private void R0() throws io.bidmachine.media3.exoplayer.s {
        S0();
        A0();
    }

    private boolean S() {
        if (this.f68571q0) {
            this.f68569o0 = 1;
            if (this.W) {
                this.f68570p0 = 3;
                return false;
            }
            this.f68570p0 = 1;
        }
        return true;
    }

    private void T() throws io.bidmachine.media3.exoplayer.s {
        if (!this.f68571q0) {
            R0();
        } else {
            this.f68569o0 = 1;
            this.f68570p0 = 3;
        }
    }

    private boolean U() throws io.bidmachine.media3.exoplayer.s {
        if (this.f68571q0) {
            this.f68569o0 = 1;
            if (this.W) {
                this.f68570p0 = 3;
                return false;
            }
            this.f68570p0 = 2;
        } else {
            m1();
        }
        return true;
    }

    private boolean V(long j10, long j11) throws io.bidmachine.media3.exoplayer.s {
        boolean z10;
        boolean zO0;
        int iDequeueOutputBufferIndex;
        n nVar = (n) q9.a.e(this.M);
        if (!r0()) {
            if (this.X && this.f68572r0) {
                try {
                    iDequeueOutputBufferIndex = nVar.dequeueOutputBufferIndex(this.A);
                } catch (IllegalStateException unused) {
                    N0();
                    if (this.f68582w0) {
                        S0();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = nVar.dequeueOutputBufferIndex(this.A);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    P0();
                    return true;
                }
                if (this.f68555a0 && (this.f68580v0 || this.f68569o0 == 2)) {
                    N0();
                }
                long j12 = this.f68556b0;
                if (j12 != -9223372036854775807L && j12 + 100 < j().currentTimeMillis()) {
                    N0();
                }
                return false;
            }
            if (this.Z) {
                this.Z = false;
                nVar.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.A;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                N0();
                return false;
            }
            this.f68560f0 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = nVar.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f68561g0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.A.offset);
                ByteBuffer byteBuffer = this.f68561g0;
                MediaCodec.BufferInfo bufferInfo2 = this.A;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.f68562h0 = this.A.presentationTimeUs < n();
            long j13 = this.f68578u0;
            this.f68563i0 = j13 != -9223372036854775807L && j13 <= this.A.presentationTimeUs;
            n1(this.A.presentationTimeUs);
        }
        if (this.X && this.f68572r0) {
            try {
                ByteBuffer byteBuffer2 = this.f68561g0;
                int i10 = this.f68560f0;
                MediaCodec.BufferInfo bufferInfo3 = this.A;
                z10 = false;
                try {
                    zO0 = O0(j10, j11, nVar, byteBuffer2, i10, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f68562h0, this.f68563i0, (io.bidmachine.media3.common.a) q9.a.e(this.E));
                } catch (IllegalStateException unused2) {
                    N0();
                    if (this.f68582w0) {
                        S0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f68561g0;
            int i11 = this.f68560f0;
            MediaCodec.BufferInfo bufferInfo4 = this.A;
            zO0 = O0(j10, j11, nVar, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f68562h0, this.f68563i0, (io.bidmachine.media3.common.a) q9.a.e(this.E));
        }
        if (zO0) {
            J0(this.A.presentationTimeUs);
            boolean z11 = (this.A.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f68572r0 && this.f68563i0) {
                this.f68556b0 = j().currentTimeMillis();
            }
            X0();
            if (!z11) {
                return true;
            }
            N0();
        }
        return z10;
    }

    private boolean W(r rVar, io.bidmachine.media3.common.a aVar, z9.n nVar, z9.n nVar2) {
        t9.b cryptoConfig;
        t9.b cryptoConfig2;
        if (nVar == nVar2) {
            return false;
        }
        if (nVar2 != null && nVar != null && (cryptoConfig = nVar2.getCryptoConfig()) != null && (cryptoConfig2 = nVar.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof z9.f0)) {
                return false;
            }
            if (!nVar2.getSchemeUuid().equals(nVar.getSchemeUuid()) || o0.f98837a < 23) {
                return true;
            }
            UUID uuid = n9.f.f95291e;
            if (!uuid.equals(nVar.getSchemeUuid()) && !uuid.equals(nVar2.getSchemeUuid())) {
                return !rVar.f68548g && (nVar2.getState() == 2 || ((nVar2.getState() == 3 || nVar2.getState() == 4) && nVar2.requiresSecureDecoder((String) q9.a.e(aVar.f80561o))));
            }
        }
        return true;
    }

    private void W0() {
        this.f68559e0 = -1;
        this.f68583x.f104988e = null;
    }

    private boolean X() throws io.bidmachine.media3.exoplayer.s {
        int i10;
        if (this.M == null || (i10 = this.f68569o0) == 2 || this.f68580v0) {
            return false;
        }
        if (i10 == 0 && g1()) {
            T();
        }
        n nVar = (n) q9.a.e(this.M);
        if (this.f68559e0 < 0) {
            int iDequeueInputBufferIndex = nVar.dequeueInputBufferIndex();
            this.f68559e0 = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.f68583x.f104988e = nVar.getInputBuffer(iDequeueInputBufferIndex);
            this.f68583x.c();
        }
        if (this.f68569o0 == 1) {
            if (!this.f68555a0) {
                this.f68572r0 = true;
                nVar.queueInputBuffer(this.f68559e0, 0, 0, 0L, 4);
                W0();
            }
            this.f68569o0 = 2;
            return false;
        }
        if (this.Y) {
            this.Y = false;
            ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(this.f68583x.f104988e);
            byte[] bArr = F0;
            byteBuffer.put(bArr);
            nVar.queueInputBuffer(this.f68559e0, 0, bArr.length, 0L, 0);
            W0();
            this.f68571q0 = true;
            return true;
        }
        if (this.f68568n0 == 1) {
            for (int i11 = 0; i11 < ((io.bidmachine.media3.common.a) q9.a.e(this.N)).f80564r.size(); i11++) {
                ((ByteBuffer) q9.a.e(this.f68583x.f104988e)).put((byte[]) this.N.f80564r.get(i11));
            }
            this.f68568n0 = 2;
        }
        int iPosition = ((ByteBuffer) q9.a.e(this.f68583x.f104988e)).position();
        u9.d0 d0VarL = l();
        try {
            int iE = E(d0VarL, this.f68583x, 0);
            if (iE == -3) {
                if (hasReadStreamToEnd()) {
                    this.f68578u0 = this.f68576t0;
                }
                return false;
            }
            if (iE == -5) {
                if (this.f68568n0 == 2) {
                    this.f68583x.c();
                    this.f68568n0 = 1;
                }
                G0(d0VarL);
                return true;
            }
            if (this.f68583x.f()) {
                this.f68578u0 = this.f68576t0;
                if (this.f68568n0 == 2) {
                    this.f68583x.c();
                    this.f68568n0 = 1;
                }
                this.f68580v0 = true;
                if (!this.f68571q0) {
                    N0();
                    return false;
                }
                if (!this.f68555a0) {
                    this.f68572r0 = true;
                    nVar.queueInputBuffer(this.f68559e0, 0, 0, 0L, 4);
                    W0();
                }
                return false;
            }
            if (!this.f68571q0 && !this.f68583x.h()) {
                this.f68583x.c();
                if (this.f68568n0 == 2) {
                    this.f68568n0 = 1;
                }
                return true;
            }
            if (e1(this.f68583x)) {
                return true;
            }
            boolean zO = this.f68583x.o();
            if (zO) {
                this.f68583x.f104987d.b(iPosition);
            }
            long j10 = this.f68583x.f104990g;
            if (this.f68584x0) {
                if (this.B.isEmpty()) {
                    this.B0.f68599d.a(j10, (io.bidmachine.media3.common.a) q9.a.e(this.D));
                } else {
                    ((e) this.B.peekLast()).f68599d.a(j10, (io.bidmachine.media3.common.a) q9.a.e(this.D));
                }
                this.f68584x0 = false;
            }
            this.f68576t0 = Math.max(this.f68576t0, j10);
            if (hasReadStreamToEnd() || this.f68583x.i()) {
                this.f68578u0 = this.f68576t0;
            }
            this.f68583x.n();
            if (this.f68583x.e()) {
                q0(this.f68583x);
            }
            L0(this.f68583x);
            int iD0 = d0(this.f68583x);
            if (zO) {
                ((n) q9.a.e(nVar)).a(this.f68559e0, 0, this.f68583x.f104987d, j10, iD0);
            } else {
                ((n) q9.a.e(nVar)).queueInputBuffer(this.f68559e0, 0, ((ByteBuffer) q9.a.e(this.f68583x.f104988e)).limit(), j10, iD0);
            }
            W0();
            this.f68571q0 = true;
            this.f68568n0 = 0;
            this.A0.f105280c++;
            return true;
        } catch (f.a e10) {
            D0(e10);
            Q0(0);
            Y();
            return true;
        }
    }

    private void X0() {
        this.f68560f0 = -1;
        this.f68561g0 = null;
    }

    private void Y() {
        try {
            ((n) q9.a.i(this.M)).flush();
        } finally {
            U0();
        }
    }

    private void Y0(z9.n nVar) {
        z9.m.a(this.F, nVar);
        this.F = nVar;
    }

    private void Z0(e eVar) {
        this.B0 = eVar;
        long j10 = eVar.f68598c;
        if (j10 != -9223372036854775807L) {
            this.D0 = true;
            I0(j10);
        }
    }

    private List b0(boolean z10) {
        io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) q9.a.e(this.D);
        List listI0 = i0(this.f68575t, aVar, z10);
        if (!listI0.isEmpty() || !z10) {
            return listI0;
        }
        List listI02 = i0(this.f68575t, aVar, false);
        if (!listI02.isEmpty()) {
            q9.u.h("MediaCodecRenderer", "Drm session requires secure decoder for " + aVar.f80561o + ", but no secure decoder available. Trying to proceed with " + listI02 + ".");
        }
        return listI02;
    }

    private void c1(z9.n nVar) {
        z9.m.a(this.G, nVar);
        this.G = nVar;
    }

    private boolean d1(long j10) {
        return this.J == -9223372036854775807L || j().elapsedRealtime() - j10 < this.J;
    }

    protected static boolean k1(io.bidmachine.media3.common.a aVar) {
        int i10 = aVar.N;
        return i10 == 0 || i10 == 2;
    }

    private boolean l1(io.bidmachine.media3.common.a aVar) throws io.bidmachine.media3.exoplayer.s {
        if (o0.f98837a >= 23 && this.M != null && this.f68570p0 != 3 && getState() != 0) {
            float fG0 = g0(this.L, (io.bidmachine.media3.common.a) q9.a.e(aVar), p());
            float f10 = this.Q;
            if (f10 == fG0) {
                return true;
            }
            if (fG0 == -1.0f) {
                T();
                return false;
            }
            if (f10 == -1.0f && fG0 <= this.f68579v) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fG0);
            ((n) q9.a.e(this.M)).setParameters(bundle);
            this.Q = fG0;
        }
        return true;
    }

    private void m1() throws io.bidmachine.media3.exoplayer.s {
        t9.b cryptoConfig = ((z9.n) q9.a.e(this.G)).getCryptoConfig();
        if (cryptoConfig instanceof z9.f0) {
            try {
                ((MediaCrypto) q9.a.e(this.I)).setMediaDrmSession(((z9.f0) cryptoConfig).f119200b);
            } catch (MediaCryptoException e10) {
                throw h(e10, this.D, 6006);
            }
        }
        Y0(this.G);
        this.f68569o0 = 0;
        this.f68570p0 = 0;
    }

    private boolean r0() {
        return this.f68560f0 >= 0;
    }

    private boolean s0() {
        if (!this.f68587z.w()) {
            return true;
        }
        long jN = n();
        return y0(jN, this.f68587z.u()) == y0(jN, this.f68585y.f104990g);
    }

    private void t0(io.bidmachine.media3.common.a aVar) {
        R();
        String str = aVar.f80561o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f68587z.x(32);
        } else {
            this.f68587z.x(1);
        }
        this.f68564j0 = true;
    }

    private void u0(r rVar, MediaCrypto mediaCrypto) {
        io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) q9.a.e(this.D);
        String str = rVar.f68542a;
        int i10 = o0.f98837a;
        float fG0 = i10 < 23 ? -1.0f : g0(this.L, aVar, p());
        float f10 = fG0 > this.f68579v ? fG0 : -1.0f;
        long jElapsedRealtime = j().elapsedRealtime();
        n.a aVarL0 = l0(rVar, aVar, mediaCrypto, f10);
        if (i10 >= 31) {
            b.a(aVarL0, o());
        }
        try {
            q9.k0.a("createCodec:" + str);
            n nVarA = this.f68573s.a(aVarL0);
            this.M = nVarA;
            this.f68557c0 = nVarA.d(new d());
            q9.k0.b();
            long jElapsedRealtime2 = j().elapsedRealtime();
            if (!rVar.o(aVar)) {
                q9.u.h("MediaCodecRenderer", o0.G("Format exceeds selected codec's capabilities [%s, %s]", io.bidmachine.media3.common.a.h(aVar), str));
            }
            this.T = rVar;
            this.Q = f10;
            this.N = aVar;
            this.U = L(str);
            this.V = P(str);
            this.W = M(str);
            this.X = N(str);
            this.f68555a0 = O(rVar) || f0();
            if (((n) q9.a.e(this.M)).needsReconfiguration()) {
                this.f68567m0 = true;
                this.f68568n0 = 1;
                this.Y = this.U != 0;
            }
            if (getState() == 2) {
                this.f68558d0 = j().elapsedRealtime() + 1000;
            }
            this.A0.f105278a++;
            E0(str, aVarL0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            q9.k0.b();
            throw th2;
        }
    }

    private boolean v0() throws io.bidmachine.media3.exoplayer.s {
        q9.a.g(this.I == null);
        z9.n nVar = this.F;
        t9.b cryptoConfig = nVar.getCryptoConfig();
        if (z9.f0.f119198d && (cryptoConfig instanceof z9.f0)) {
            int state = nVar.getState();
            if (state == 1) {
                n.a aVar = (n.a) q9.a.e(nVar.getError());
                throw h(aVar, this.D, aVar.f119297b);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return nVar.getError() != null;
        }
        if (cryptoConfig instanceof z9.f0) {
            z9.f0 f0Var = (z9.f0) cryptoConfig;
            try {
                this.I = new MediaCrypto(f0Var.f119199a, f0Var.f119200b);
            } catch (MediaCryptoException e10) {
                throw h(e10, this.D, 6006);
            }
        }
        return true;
    }

    private boolean y0(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        io.bidmachine.media3.common.a aVar = this.E;
        return (aVar != null && Objects.equals(aVar.f80561o, "audio/opus") && k0.g(j10, j11)) ? false : true;
    }

    private static boolean z0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void A0() throws io.bidmachine.media3.exoplayer.s {
        /*
            r3 = this;
            da.n r0 = r3.M
            if (r0 != 0) goto L6b
            boolean r0 = r3.f68564j0
            if (r0 != 0) goto L6b
            io.bidmachine.media3.common.a r0 = r3.D
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            boolean r1 = r3.x0(r0)
            if (r1 == 0) goto L17
            r3.t0(r0)
            return
        L17:
            z9.n r1 = r3.G
            r3.Y0(r1)
            z9.n r1 = r3.F
            if (r1 == 0) goto L26
            boolean r1 = r3.v0()
            if (r1 == 0) goto L55
        L26:
            z9.n r1 = r3.F     // Catch: da.t.c -> L3b
            if (r1 == 0) goto L4f
            int r1 = r1.getState()     // Catch: da.t.c -> L3b
            r2 = 3
            if (r1 == r2) goto L3d
            z9.n r1 = r3.F     // Catch: da.t.c -> L3b
            int r1 = r1.getState()     // Catch: da.t.c -> L3b
            r2 = 4
            if (r1 != r2) goto L4f
            goto L3d
        L3b:
            r1 = move-exception
            goto L64
        L3d:
            z9.n r1 = r3.F     // Catch: da.t.c -> L3b
            java.lang.String r2 = r0.f80561o     // Catch: da.t.c -> L3b
            java.lang.Object r2 = q9.a.i(r2)     // Catch: da.t.c -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: da.t.c -> L3b
            boolean r1 = r1.requiresSecureDecoder(r2)     // Catch: da.t.c -> L3b
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            android.media.MediaCrypto r2 = r3.I     // Catch: da.t.c -> L3b
            r3.B0(r2, r1)     // Catch: da.t.c -> L3b
        L55:
            android.media.MediaCrypto r0 = r3.I
            if (r0 == 0) goto L6b
            da.n r1 = r3.M
            if (r1 != 0) goto L6b
            r0.release()
            r0 = 0
            r3.I = r0
            return
        L64:
            r2 = 4001(0xfa1, float:5.607E-42)
            io.bidmachine.media3.exoplayer.s r0 = r3.h(r1, r0, r2)
            throw r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da.t.A0():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // io.bidmachine.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void C(io.bidmachine.media3.common.a[] r12, long r13, long r15, ga.f0.b r17) {
        /*
            r11 = this;
            da.t$e r12 = r11.B0
            long r0 = r12.f68598c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            da.t$e r4 = new da.t$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.Z0(r4)
            boolean r12 = r11.E0
            if (r12 == 0) goto L56
            r11.K0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.B
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.f68576t0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.C0
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            da.t$e r4 = new da.t$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.Z0(r4)
            da.t$e r12 = r11.B0
            long r12 = r12.f68598c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.K0()
        L56:
            return
        L57:
            java.util.ArrayDeque r12 = r11.B
            da.t$e r0 = new da.t$e
            long r1 = r11.f68576t0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da.t.C(io.bidmachine.media3.common.a[], long, long, ga.f0$b):void");
    }

    protected boolean C0(io.bidmachine.media3.common.a aVar) {
        return true;
    }

    protected abstract void D0(Exception exc);

    protected abstract void E0(String str, n.a aVar, long j10, long j11);

    protected abstract void F0(String str);

    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected u9.c G0(u9.d0 r12) throws io.bidmachine.media3.exoplayer.s {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.t.G0(u9.d0):u9.c");
    }

    protected abstract void H0(io.bidmachine.media3.common.a aVar, MediaFormat mediaFormat);

    protected void J0(long j10) {
        this.C0 = j10;
        while (!this.B.isEmpty() && j10 >= ((e) this.B.peek()).f68596a) {
            Z0((e) q9.a.e((e) this.B.poll()));
            K0();
        }
    }

    protected abstract u9.c K(r rVar, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2);

    protected abstract boolean O0(long j10, long j11, n nVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, io.bidmachine.media3.common.a aVar);

    protected q Q(Throwable th2, r rVar) {
        return new q(th2, rVar);
    }

    protected void S0() {
        try {
            n nVar = this.M;
            if (nVar != null) {
                nVar.release();
                this.A0.f105279b++;
                F0(((r) q9.a.e(this.T)).f68542a);
            }
            this.M = null;
            try {
                MediaCrypto mediaCrypto = this.I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.M = null;
            try {
                MediaCrypto mediaCrypto2 = this.I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    protected abstract void T0();

    protected void U0() {
        W0();
        X0();
        this.f68558d0 = -9223372036854775807L;
        this.f68572r0 = false;
        this.f68556b0 = -9223372036854775807L;
        this.f68571q0 = false;
        this.Y = false;
        this.Z = false;
        this.f68562h0 = false;
        this.f68563i0 = false;
        this.f68576t0 = -9223372036854775807L;
        this.f68578u0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.f68569o0 = 0;
        this.f68570p0 = 0;
        this.f68568n0 = this.f68567m0 ? 1 : 0;
    }

    protected void V0() {
        U0();
        this.f68588z0 = null;
        this.R = null;
        this.T = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.f68574s0 = false;
        this.Q = -1.0f;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.f68555a0 = false;
        this.f68557c0 = false;
        this.f68567m0 = false;
        this.f68568n0 = 0;
    }

    protected final boolean Z() throws io.bidmachine.media3.exoplayer.s {
        boolean zA0 = a0();
        if (zA0) {
            A0();
        }
        return zA0;
    }

    @Override // io.bidmachine.media3.exoplayer.j2
    public final int a(io.bidmachine.media3.common.a aVar) throws io.bidmachine.media3.exoplayer.s {
        try {
            return j1(this.f68575t, aVar);
        } catch (c0.c e10) {
            throw h(e10, aVar, 4002);
        }
    }

    protected boolean a0() {
        if (this.M == null) {
            return false;
        }
        int i10 = this.f68570p0;
        if (i10 == 3 || ((this.V && !this.f68574s0) || (this.W && this.f68572r0))) {
            S0();
            return true;
        }
        if (i10 == 2) {
            int i11 = o0.f98837a;
            q9.a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    m1();
                } catch (io.bidmachine.media3.exoplayer.s e10) {
                    q9.u.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    S0();
                    return true;
                }
            }
        }
        Y();
        return false;
    }

    protected final void a1() {
        this.f68586y0 = true;
    }

    protected final void b1(io.bidmachine.media3.exoplayer.s sVar) {
        this.f68588z0 = sVar;
    }

    protected final n c0() {
        return this.M;
    }

    protected int d0(t9.f fVar) {
        return 0;
    }

    protected final r e0() {
        return this.T;
    }

    protected boolean e1(t9.f fVar) {
        if (!h1(fVar)) {
            return false;
        }
        fVar.c();
        this.A0.f105281d++;
        return true;
    }

    protected boolean f0() {
        return false;
    }

    protected boolean f1(r rVar) {
        return true;
    }

    protected abstract float g0(float f10, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a[] aVarArr);

    protected boolean g1() {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.i2
    public final long getDurationToProgressUs(long j10, long j11) {
        return j0(j10, j11, this.f68557c0);
    }

    protected final MediaFormat h0() {
        return this.O;
    }

    protected boolean h1(t9.f fVar) {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.g2.b
    public void handleMessage(int i10, Object obj) {
        if (i10 != 11) {
            super.handleMessage(i10, obj);
            return;
        }
        i2.a aVar = (i2.a) q9.a.e((i2.a) obj);
        this.H = aVar;
        M0(aVar);
    }

    protected abstract List i0(x xVar, io.bidmachine.media3.common.a aVar, boolean z10);

    protected boolean i1(io.bidmachine.media3.common.a aVar) {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isEnded() {
        return this.f68582w0;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isReady() {
        if (this.D == null) {
            return false;
        }
        if (s() || r0()) {
            return true;
        }
        return this.f68558d0 != -9223372036854775807L && j().elapsedRealtime() < this.f68558d0;
    }

    protected long j0(long j10, long j11, boolean z10) {
        return super.getDurationToProgressUs(j10, j11);
    }

    protected abstract int j1(x xVar, io.bidmachine.media3.common.a aVar);

    protected long k0() {
        return this.f68578u0;
    }

    protected abstract n.a l0(r rVar, io.bidmachine.media3.common.a aVar, MediaCrypto mediaCrypto, float f10);

    protected final long m0() {
        return this.B0.f68598c;
    }

    protected final long n0() {
        return this.B0.f68597b;
    }

    protected final void n1(long j10) {
        io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) this.B0.f68599d.j(j10);
        if (aVar == null && this.D0 && this.O != null) {
            aVar = (io.bidmachine.media3.common.a) this.B0.f68599d.i();
        }
        if (aVar != null) {
            this.E = aVar;
        } else if (!this.P || this.E == null) {
            return;
        }
        H0((io.bidmachine.media3.common.a) q9.a.e(this.E), this.O);
        this.P = false;
        this.D0 = false;
    }

    protected float o0() {
        return this.K;
    }

    protected final i2.a p0() {
        return this.H;
    }

    protected abstract void q0(t9.f fVar);

    @Override // io.bidmachine.media3.exoplayer.i2
    public void render(long j10, long j11) throws io.bidmachine.media3.exoplayer.s {
        boolean z10 = false;
        if (this.f68586y0) {
            this.f68586y0 = false;
            N0();
        }
        io.bidmachine.media3.exoplayer.s sVar = this.f68588z0;
        if (sVar != null) {
            this.f68588z0 = null;
            throw sVar;
        }
        try {
            if (this.f68582w0) {
                T0();
                return;
            }
            if (this.D != null || Q0(2)) {
                A0();
                if (this.f68564j0) {
                    q9.k0.a("bypassRender");
                    while (J(j10, j11)) {
                    }
                    q9.k0.b();
                } else if (this.M != null) {
                    long jElapsedRealtime = j().elapsedRealtime();
                    q9.k0.a("drainAndFeed");
                    while (V(j10, j11) && d1(jElapsedRealtime)) {
                    }
                    while (X() && d1(jElapsedRealtime)) {
                    }
                    q9.k0.b();
                } else {
                    this.A0.f105281d += G(j10);
                    Q0(1);
                }
                this.A0.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw h(e10, this.D, o0.b0(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!z0(e11)) {
                throw e11;
            }
            D0(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                S0();
            }
            q qVarQ = Q(e11, e0());
            throw i(qVarQ, this.D, z10, qVarQ.f68541d == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : 4003);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.i2
    public void setPlaybackSpeed(float f10, float f11) throws io.bidmachine.media3.exoplayer.s {
        this.K = f10;
        this.L = f11;
        l1(this.N);
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.j2
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void t() {
        this.D = null;
        Z0(e.f68595e);
        this.B.clear();
        a0();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void u(boolean z10, boolean z11) {
        this.A0 = new u9.b();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void w(long j10, boolean z10) throws io.bidmachine.media3.exoplayer.s {
        this.f68580v0 = false;
        this.f68582w0 = false;
        this.f68586y0 = false;
        if (this.f68564j0) {
            this.f68587z.c();
            this.f68585y.c();
            this.f68565k0 = false;
            this.C.d();
        } else {
            Z();
        }
        if (this.B0.f68599d.l() > 0) {
            this.f68584x0 = true;
        }
        this.B0.f68599d.c();
        this.B.clear();
    }

    protected final boolean w0() {
        return this.f68564j0;
    }

    protected final boolean x0(io.bidmachine.media3.common.a aVar) {
        return this.G == null && i1(aVar);
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void z() {
        try {
            R();
            S0();
        } finally {
            c1(null);
        }
    }

    public static class c extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f68590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r f68591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f68592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c f68593f;

        public c(io.bidmachine.media3.common.a aVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + aVar, th2, aVar.f80561o, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            return "io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c c(c cVar) {
            return new c(getMessage(), getCause(), this.f68589b, this.f68590c, this.f68591d, this.f68592e, cVar);
        }

        public c(io.bidmachine.media3.common.a aVar, Throwable th2, boolean z10, r rVar) {
            this("Decoder init failed: " + rVar.f68542a + ", " + aVar, th2, aVar.f80561o, z10, rVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private c(String str, Throwable th2, String str2, boolean z10, r rVar, String str3, c cVar) {
            super(str, th2);
            this.f68589b = str2;
            this.f68590c = z10;
            this.f68591d = rVar;
            this.f68592e = str3;
            this.f68593f = cVar;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void A() {
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void B() {
    }

    protected void K0() {
    }

    protected void I0(long j10) {
    }

    protected void L0(t9.f fVar) {
    }

    protected void M0(i2.a aVar) {
    }
}
