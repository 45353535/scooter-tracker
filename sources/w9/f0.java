package w9;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableList;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import da.n;
import io.bidmachine.media3.common.a;
import io.bidmachine.media3.exoplayer.i2;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import oa.v0;
import q9.o0;
import w9.q;
import w9.s;

/* JADX INFO: loaded from: classes12.dex */
public class f0 extends da.t implements u9.g0 {
    private final Context G0;
    private final q.a H0;
    private final s I0;
    private final da.j J0;
    private int K0;
    private boolean L0;
    private boolean M0;
    private io.bidmachine.media3.common.a N0;
    private io.bidmachine.media3.common.a O0;
    private long P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private int T0;
    private boolean U0;
    private long V0;
    private boolean W0;

    private static final class b {
        public static void a(s sVar, Object obj) {
            sVar.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    private final class c implements s.d {
        private c() {
        }

        @Override // w9.s.d
        public void b(s.a aVar) {
            f0.this.H0.o(aVar);
        }

        @Override // w9.s.d
        public void c(s.a aVar) {
            f0.this.H0.p(aVar);
        }

        @Override // w9.s.d
        public void onAudioCapabilitiesChanged() {
            f0.this.y();
        }

        @Override // w9.s.d
        public void onAudioSinkError(Exception exc) {
            q9.u.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            f0.this.H0.n(exc);
        }

        @Override // w9.s.d
        public void onOffloadBufferEmptying() {
            i2.a aVarP0 = f0.this.p0();
            if (aVarP0 != null) {
                aVarP0.onWakeup();
            }
        }

        @Override // w9.s.d
        public void onOffloadBufferFull() {
            i2.a aVarP0 = f0.this.p0();
            if (aVarP0 != null) {
                aVarP0.onSleep();
            }
        }

        @Override // w9.s.d
        public void onPositionAdvancing(long j10) {
            f0.this.H0.v(j10);
        }

        @Override // w9.s.d
        public void onPositionDiscontinuity() {
            f0.this.B1();
        }

        @Override // w9.s.d
        public void onSilenceSkipped() {
            f0.this.S0 = true;
        }

        @Override // w9.s.d
        public void onSkipSilenceEnabledChanged(boolean z10) {
            f0.this.H0.w(z10);
        }

        @Override // w9.s.d
        public void onUnderrun(int i10, long j10, long j11) {
            f0.this.H0.x(i10, j10, j11);
        }
    }

    public f0(Context context, n.b bVar, da.x xVar, boolean z10, Handler handler, q qVar, s sVar) {
        this(context, bVar, xVar, z10, handler, qVar, sVar, o0.f98837a >= 35 ? new da.j() : null);
    }

    private void C1(int i10) {
        da.j jVar;
        this.I0.setAudioSessionId(i10);
        if (o0.f98837a < 35 || (jVar = this.J0) == null) {
            return;
        }
        jVar.e(i10);
    }

    private void D1() {
        da.n nVarC0 = c0();
        if (nVarC0 != null && o0.f98837a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.T0));
            nVarC0.setParameters(bundle);
        }
    }

    private void E1() {
        long currentPositionUs = this.I0.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.Q0) {
                currentPositionUs = Math.max(this.P0, currentPositionUs);
            }
            this.P0 = currentPositionUs;
            this.Q0 = false;
        }
    }

    private static boolean t1(String str) {
        if (o0.f98837a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER)) {
            return false;
        }
        String str2 = Build.DEVICE;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    private static boolean u1(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean v1() {
        if (o0.f98837a != 23) {
            return false;
        }
        String str = Build.MODEL;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int w1(io.bidmachine.media3.common.a aVar) {
        d dVarD = this.I0.d(aVar);
        if (!dVarD.f107667a) {
            return 0;
        }
        int i10 = dVarD.f107668b ? 1536 : 512;
        return dVarD.f107669c ? i10 | 2048 : i10;
    }

    private int x1(da.r rVar, io.bidmachine.media3.common.a aVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(rVar.f68542a) || (i10 = o0.f98837a) >= 24 || (i10 == 23 && o0.K0(this.G0))) {
            return aVar.f80562p;
        }
        return -1;
    }

    private static List z1(da.x xVar, io.bidmachine.media3.common.a aVar, boolean z10, s sVar) {
        da.r rVarP;
        return aVar.f80561o == null ? ImmutableList.of() : (!sVar.a(aVar) || (rVarP = da.c0.p()) == null) ? da.c0.m(xVar, aVar, z10, false) : ImmutableList.of(rVarP);
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void A() {
        super.A();
        this.I0.play();
        this.U0 = true;
    }

    protected MediaFormat A1(io.bidmachine.media3.common.a aVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", aVar.E);
        mediaFormat.setInteger("sample-rate", aVar.F);
        q9.x.e(mediaFormat, aVar.f80564r);
        q9.x.d(mediaFormat, "max-input-size", i10);
        int i11 = o0.f98837a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !v1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(aVar.f80561o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.I0.h(o0.j0(4, aVar.E, aVar.F)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.T0));
        }
        return mediaFormat;
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void B() {
        E1();
        this.U0 = false;
        this.I0.pause();
        super.B();
    }

    protected void B1() {
        this.Q0 = true;
    }

    @Override // da.t
    protected void D0(Exception exc) {
        q9.u.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.H0.m(exc);
    }

    @Override // da.t
    protected void E0(String str, n.a aVar, long j10, long j11) {
        this.H0.q(str, j10, j11);
    }

    @Override // da.t
    protected void F0(String str) {
        this.H0.r(str);
    }

    @Override // da.t
    protected u9.c G0(u9.d0 d0Var) throws io.bidmachine.media3.exoplayer.s {
        io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) q9.a.e(d0Var.f105308b);
        this.N0 = aVar;
        u9.c cVarG0 = super.G0(d0Var);
        this.H0.u(aVar, cVarG0);
        return cVarG0;
    }

    @Override // da.t
    protected void H0(io.bidmachine.media3.common.a aVar, MediaFormat mediaFormat) throws io.bidmachine.media3.exoplayer.s {
        int i10;
        io.bidmachine.media3.common.a aVar2 = this.O0;
        int[] iArrA = null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (c0() != null) {
            q9.a.e(mediaFormat);
            io.bidmachine.media3.common.a aVarN = new a.b().u0("audio/raw").o0("audio/raw".equals(aVar.f80561o) ? aVar.G : (o0.f98837a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? o0.i0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).Z(aVar.H).a0(aVar.I).n0(aVar.f80558l).X(aVar.f80559m).f0(aVar.f80547a).h0(aVar.f80548b).i0(aVar.f80549c).j0(aVar.f80550d).w0(aVar.f80551e).s0(aVar.f80552f).R(mediaFormat.getInteger("channel-count")).v0(mediaFormat.getInteger("sample-rate")).N();
            if (this.L0 && aVarN.E == 6 && (i10 = aVar.E) < 6) {
                iArrA = new int[i10];
                for (int i11 = 0; i11 < aVar.E; i11++) {
                    iArrA[i11] = i11;
                }
            } else if (this.M0) {
                iArrA = v0.a(aVarN.E);
            }
            aVar = aVarN;
        }
        try {
            if (o0.f98837a >= 29) {
                if (!w0() || k().f105314a == 0) {
                    this.I0.setOffloadMode(0);
                } else {
                    this.I0.setOffloadMode(k().f105314a);
                }
            }
            this.I0.j(aVar, 0, iArrA);
        } catch (s.b e10) {
            throw h(e10, e10.f107752b, 5001);
        }
    }

    @Override // da.t
    protected void I0(long j10) {
        this.I0.setOutputStreamOffsetUs(j10);
    }

    @Override // da.t
    protected u9.c K(da.r rVar, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2) {
        u9.c cVarE = rVar.e(aVar, aVar2);
        int i10 = cVarE.f105294e;
        if (x0(aVar2)) {
            i10 |= 32768;
        }
        if (x1(rVar, aVar2) > this.K0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new u9.c(rVar.f68542a, aVar, aVar2, i11 != 0 ? 0 : cVarE.f105293d, i11);
    }

    @Override // da.t
    protected void K0() {
        super.K0();
        this.I0.handleDiscontinuity();
    }

    @Override // da.t
    protected boolean O0(long j10, long j11, da.n nVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, io.bidmachine.media3.common.a aVar) throws io.bidmachine.media3.exoplayer.s {
        q9.a.e(byteBuffer);
        this.V0 = -9223372036854775807L;
        if (this.O0 != null && (i11 & 2) != 0) {
            ((da.n) q9.a.e(nVar)).releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            if (nVar != null) {
                nVar.releaseOutputBuffer(i10, false);
            }
            this.A0.f105283f += i12;
            this.I0.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.I0.handleBuffer(byteBuffer, j12, i12)) {
                this.V0 = j12;
                return false;
            }
            if (nVar != null) {
                nVar.releaseOutputBuffer(i10, false);
            }
            this.A0.f105282e += i12;
            return true;
        } catch (s.c e10) {
            throw i(e10, this.N0, e10.f107754c, (!w0() || k().f105314a == 0) ? 5001 : 5004);
        } catch (s.f e11) {
            throw i(e11, aVar, e11.f107759c, (!w0() || k().f105314a == 0) ? 5002 : 5003);
        }
    }

    @Override // da.t
    protected void T0() throws io.bidmachine.media3.exoplayer.s {
        try {
            this.I0.playToEndOfStream();
            if (k0() != -9223372036854775807L) {
                this.V0 = k0();
            }
            this.W0 = true;
        } catch (s.f e10) {
            throw i(e10, e10.f107760d, e10.f107759c, w0() ? 5003 : 5002);
        }
    }

    @Override // u9.g0
    public void b(n9.z zVar) {
        this.I0.b(zVar);
    }

    @Override // da.t
    protected float g0(float f10, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a[] aVarArr) {
        int iMax = -1;
        for (io.bidmachine.media3.common.a aVar2 : aVarArr) {
            int i10 = aVar2.F;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // io.bidmachine.media3.exoplayer.i2, io.bidmachine.media3.exoplayer.j2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // u9.g0
    public n9.z getPlaybackParameters() {
        return this.I0.getPlaybackParameters();
    }

    @Override // u9.g0
    public long getPositionUs() {
        if (getState() == 2) {
            E1();
        }
        return this.P0;
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.g2.b
    public void handleMessage(int i10, Object obj) {
        if (i10 == 2) {
            this.I0.setVolume(((Float) q9.a.e(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.I0.k((n9.c) q9.a.e((n9.c) obj));
            return;
        }
        if (i10 == 6) {
            this.I0.g((n9.d) q9.a.e((n9.d) obj));
            return;
        }
        if (i10 == 12) {
            if (o0.f98837a >= 23) {
                b.a(this.I0, obj);
            }
        } else if (i10 == 16) {
            this.T0 = ((Integer) q9.a.e(obj)).intValue();
            D1();
        } else if (i10 == 9) {
            this.I0.setSkipSilenceEnabled(((Boolean) q9.a.e(obj)).booleanValue());
        } else if (i10 != 10) {
            super.handleMessage(i10, obj);
        } else {
            C1(((Integer) q9.a.e(obj)).intValue());
        }
    }

    @Override // u9.g0
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z10 = this.S0;
        this.S0 = false;
        return z10;
    }

    @Override // da.t
    protected List i0(da.x xVar, io.bidmachine.media3.common.a aVar, boolean z10) {
        return da.c0.n(z1(xVar, aVar, z10, this.I0), aVar);
    }

    @Override // da.t
    protected boolean i1(io.bidmachine.media3.common.a aVar) {
        if (k().f105314a != 0) {
            int iW1 = w1(aVar);
            if ((iW1 & 512) != 0) {
                if (k().f105314a == 2 || (iW1 & 1024) != 0) {
                    return true;
                }
                if (aVar.H == 0 && aVar.I == 0) {
                    return true;
                }
            }
        }
        return this.I0.a(aVar);
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.i2
    public boolean isEnded() {
        return super.isEnded() && this.I0.isEnded();
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.i2
    public boolean isReady() {
        return this.I0.hasPendingData() || super.isReady();
    }

    @Override // da.t
    protected long j0(long j10, long j11, boolean z10) {
        if (this.V0 == -9223372036854775807L) {
            return super.j0(j10, j11, z10);
        }
        long jC = this.I0.c();
        if (!this.W0 && jC == -9223372036854775807L) {
            return super.j0(j10, j11, z10);
        }
        long jMin = this.V0 - j10;
        if (jC != -9223372036854775807L) {
            jMin = Math.min(jC, jMin);
        }
        long jP0 = (long) ((jMin / (getPlaybackParameters() != null ? getPlaybackParameters().f95679a : 1.0f)) / 2.0f);
        if (this.U0) {
            jP0 -= o0.P0(j().elapsedRealtime()) - j11;
        }
        return Math.max(10000L, jP0);
    }

    @Override // da.t
    protected int j1(da.x xVar, io.bidmachine.media3.common.a aVar) {
        int iW1;
        boolean z10;
        if (!n9.w.o(aVar.f80561o)) {
            return u9.j0.a(0);
        }
        boolean z11 = true;
        boolean z12 = aVar.N != 0;
        boolean zK1 = da.t.k1(aVar);
        int i10 = 8;
        if (!zK1 || (z12 && da.c0.p() == null)) {
            iW1 = 0;
        } else {
            iW1 = w1(aVar);
            if (this.I0.a(aVar)) {
                return u9.j0.b(4, 8, 32, iW1);
            }
        }
        if ("audio/raw".equals(aVar.f80561o) && !this.I0.a(aVar)) {
            return u9.j0.a(1);
        }
        if (!this.I0.a(o0.j0(2, aVar.E, aVar.F))) {
            return u9.j0.a(1);
        }
        List listZ1 = z1(xVar, aVar, false, this.I0);
        if (listZ1.isEmpty()) {
            return u9.j0.a(1);
        }
        if (!zK1) {
            return u9.j0.a(2);
        }
        da.r rVar = (da.r) listZ1.get(0);
        boolean zO = rVar.o(aVar);
        if (zO) {
            z10 = true;
            z11 = zO;
        } else {
            for (int i11 = 1; i11 < listZ1.size(); i11++) {
                da.r rVar2 = (da.r) listZ1.get(i11);
                if (rVar2.o(aVar)) {
                    z10 = false;
                    rVar = rVar2;
                    break;
                }
            }
            z10 = true;
            z11 = zO;
        }
        int i12 = z11 ? 4 : 3;
        if (z11 && rVar.r(aVar)) {
            i10 = 16;
        }
        return u9.j0.d(i12, i10, 32, rVar.f68549h ? 64 : 0, z10 ? 128 : 0, iW1);
    }

    @Override // da.t
    protected n.a l0(da.r rVar, io.bidmachine.media3.common.a aVar, MediaCrypto mediaCrypto, float f10) {
        this.K0 = y1(rVar, aVar, p());
        this.L0 = t1(rVar.f68542a);
        this.M0 = u1(rVar.f68542a);
        MediaFormat mediaFormatA1 = A1(aVar, rVar.f68544c, this.K0, f10);
        this.O0 = (!"audio/raw".equals(rVar.f68543b) || "audio/raw".equals(aVar.f80561o)) ? null : aVar;
        return n.a.a(rVar, mediaFormatA1, aVar, mediaCrypto, this.J0);
    }

    @Override // da.t
    protected void q0(t9.f fVar) {
        io.bidmachine.media3.common.a aVar;
        if (o0.f98837a < 29 || (aVar = fVar.f104986c) == null || !Objects.equals(aVar.f80561o, "audio/opus") || !w0()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(fVar.f104991h);
        int i10 = ((io.bidmachine.media3.common.a) q9.a.e(fVar.f104986c)).H;
        if (byteBuffer.remaining() == 8) {
            this.I0.setOffloadDelayPadding(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void t() {
        this.R0 = true;
        this.N0 = null;
        this.V0 = -9223372036854775807L;
        this.W0 = false;
        try {
            this.I0.flush();
            try {
                super.t();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.t();
                throw th2;
            } finally {
            }
        }
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void u(boolean z10, boolean z11) {
        super.u(z10, z11);
        this.H0.t(this.A0);
        if (k().f105315b) {
            this.I0.enableTunnelingV21();
        } else {
            this.I0.disableTunneling();
        }
        this.I0.e(o());
        this.I0.f(j());
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void w(long j10, boolean z10) throws io.bidmachine.media3.exoplayer.s {
        super.w(j10, z10);
        this.I0.flush();
        this.P0 = j10;
        this.V0 = -9223372036854775807L;
        this.W0 = false;
        this.S0 = false;
        this.Q0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void x() {
        da.j jVar;
        this.I0.release();
        if (o0.f98837a < 35 || (jVar = this.J0) == null) {
            return;
        }
        jVar.c();
    }

    protected int y1(da.r rVar, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a[] aVarArr) {
        int iX1 = x1(rVar, aVar);
        if (aVarArr.length == 1) {
            return iX1;
        }
        for (io.bidmachine.media3.common.a aVar2 : aVarArr) {
            if (rVar.e(aVar, aVar2).f105293d != 0) {
                iX1 = Math.max(iX1, x1(rVar, aVar2));
            }
        }
        return iX1;
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void z() {
        this.S0 = false;
        this.V0 = -9223372036854775807L;
        this.W0 = false;
        try {
            super.z();
        } finally {
            if (this.R0) {
                this.R0 = false;
                this.I0.reset();
            }
        }
    }

    public f0(Context context, n.b bVar, da.x xVar, boolean z10, Handler handler, q qVar, s sVar, da.j jVar) {
        super(1, bVar, xVar, z10, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = sVar;
        this.J0 = jVar;
        this.T0 = -1000;
        this.H0 = new q.a(handler, qVar);
        this.V0 = -9223372036854775807L;
        sVar.i(new c());
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.i2
    public u9.g0 getMediaClock() {
        return this;
    }
}
