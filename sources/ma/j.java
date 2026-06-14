package ma;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.TsExtractor;
import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.common.Scopes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.MoreExecutors;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import da.n;
import ga.f0;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.video.PlaceholderSurface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import ma.f0;
import ma.g0;
import ma.n;
import ma.s;
import n9.e0;
import n9.n0;
import q9.k0;
import q9.o0;
import u9.j0;

/* JADX INFO: loaded from: classes12.dex */
public class j extends da.t implements s.b {

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final int[] f94576v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static boolean f94577w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static boolean f94578x1;
    private final Context G0;
    private final boolean H0;
    private final f0.a I0;
    private final int J0;
    private final boolean K0;
    private final s L0;
    private final s.a M0;
    private final ma.a N0;
    private final long O0;
    private final PriorityQueue P0;
    private e Q0;
    private boolean R0;
    private boolean S0;
    private g0 T0;
    private boolean U0;
    private List V0;
    private Surface W0;
    private PlaceholderSurface X0;
    private q9.f0 Y0;
    private boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f94579a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f94580b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private long f94581c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f94582d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f94583e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f94584f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private long f94585g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f94586h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private long f94587i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private n0 f94588j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private n0 f94589k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f94590l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private boolean f94591m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f94592n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    f f94593o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private r f94594p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private long f94595q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private long f94596r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private boolean f94597s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private boolean f94598t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private int f94599u1;

    class b implements g0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ da.n f94601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f94602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f94603c;

        b(da.n nVar, int i10, long j10) {
            this.f94601a = nVar;
            this.f94602b = i10;
            this.f94603c = j10;
        }

        @Override // ma.g0.b
        public void a() {
            j.this.o2(this.f94601a, this.f94602b, this.f94603c);
        }

        @Override // ma.g0.b
        public void b(long j10) {
            j.this.b2(this.f94601a, this.f94602b, this.f94603c, j10);
        }
    }

    private static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f94605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f94606b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n.b f94608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f94609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f94610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Handler f94611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f0 f94612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f94613i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g0 f94615k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f94616l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private da.x f94607c = da.x.f68600a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f94614j = 30.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f94617m = -9223372036854775807L;

        public d(Context context) {
            this.f94605a = context;
            this.f94608d = da.o.a(context);
        }

        public j m() {
            q9.a.g(!this.f94606b);
            Handler handler = this.f94611g;
            q9.a.g((handler == null && this.f94612h == null) || !(handler == null || this.f94612h == null));
            this.f94606b = true;
            return new j(this);
        }

        public d n(long j10) {
            this.f94617m = j10;
            return this;
        }

        public d o(boolean z10) {
            this.f94616l = z10;
            return this;
        }

        public d p(long j10) {
            this.f94609e = j10;
            return this;
        }

        public d q(n.b bVar) {
            this.f94608d = bVar;
            return this;
        }

        public d r(boolean z10) {
            this.f94610f = z10;
            return this;
        }

        public d s(Handler handler) {
            this.f94611g = handler;
            return this;
        }

        public d t(f0 f0Var) {
            this.f94612h = f0Var;
            return this;
        }

        public d u(int i10) {
            this.f94613i = i10;
            return this;
        }

        public d v(da.x xVar) {
            this.f94607c = xVar;
            return this;
        }
    }

    protected static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f94618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f94619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f94620c;

        public e(int i10, int i11, int i12) {
            this.f94618a = i10;
            this.f94619b = i11;
            this.f94620c = i12;
        }
    }

    private final class f implements n.d, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f94621b;

        public f(da.n nVar) {
            Handler handlerB = o0.B(this);
            this.f94621b = handlerB;
            nVar.b(this, handlerB);
        }

        private void b(long j10) {
            j jVar = j.this;
            if (this != jVar.f94593o1 || jVar.c0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                j.this.Y1();
                return;
            }
            try {
                j.this.X1(j10);
            } catch (io.bidmachine.media3.exoplayer.s e10) {
                j.this.b1(e10);
            }
        }

        @Override // da.n.d
        public void a(da.n nVar, long j10, long j11) {
            if (o0.f98837a >= 30) {
                b(j10);
            } else {
                this.f94621b.sendMessageAtFrontOfQueue(Message.obtain(this.f94621b, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(o0.o1(message.arg1, message.arg2));
            return true;
        }
    }

    protected j(d dVar) {
        super(2, dVar.f94608d, dVar.f94607c, dVar.f94610f, dVar.f94614j);
        Context applicationContext = dVar.f94605a.getApplicationContext();
        this.G0 = applicationContext;
        this.J0 = dVar.f94613i;
        this.T0 = dVar.f94615k;
        this.I0 = new f0.a(dVar.f94611g, dVar.f94612h);
        this.H0 = this.T0 == null;
        this.L0 = new s(applicationContext, this, dVar.f94609e);
        this.M0 = new s.a();
        this.K0 = x1();
        this.Y0 = q9.f0.f98785c;
        this.f94579a1 = 1;
        this.f94580b1 = 0;
        this.f94588j1 = n0.f95432e;
        this.f94592n1 = 0;
        this.f94589k1 = null;
        this.f94590l1 = -1000;
        this.f94595q1 = -9223372036854775807L;
        this.f94596r1 = -9223372036854775807L;
        this.N0 = dVar.f94616l ? new ma.a() : null;
        this.P0 = new PriorityQueue();
        this.O0 = dVar.f94617m != -9223372036854775807L ? -dVar.f94617m : -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int B1(da.r r11, io.bidmachine.media3.common.a r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.j.B1(da.r, io.bidmachine.media3.common.a):int");
    }

    private static Point C1(da.r rVar, io.bidmachine.media3.common.a aVar) {
        int i10 = aVar.f80569w;
        int i11 = aVar.f80568v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f94576v1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point pointC = rVar.c(i15, i13);
            float f11 = aVar.f80570x;
            if (pointC != null && rVar.u(pointC.x, pointC.y, f11)) {
                return pointC;
            }
        }
        return null;
    }

    private static List E1(Context context, da.x xVar, io.bidmachine.media3.common.a aVar, boolean z10, boolean z11) {
        String str = aVar.f80561o;
        if (str == null) {
            return ImmutableList.of();
        }
        if (o0.f98837a >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List listG = da.c0.g(xVar, aVar, z10, z11);
            if (!listG.isEmpty()) {
                return listG;
            }
        }
        return da.c0.m(xVar, aVar, z10, z11);
    }

    protected static int F1(da.r rVar, io.bidmachine.media3.common.a aVar) {
        if (aVar.f80562p == -1) {
            return B1(rVar, aVar);
        }
        int size = aVar.f80564r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) aVar.f80564r.get(i10)).length;
        }
        return aVar.f80562p + length;
    }

    private static int G1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private Surface I1(da.r rVar) {
        g0 g0Var = this.T0;
        if (g0Var != null) {
            return g0Var.getInputSurface();
        }
        Surface surface = this.W0;
        if (surface != null) {
            return surface;
        }
        if (m2(rVar)) {
            return null;
        }
        q9.a.g(n2(rVar));
        PlaceholderSurface placeholderSurface = this.X0;
        if (placeholderSurface != null && placeholderSurface.f81381b != rVar.f68548g) {
            a2();
        }
        if (this.X0 == null) {
            this.X0 = PlaceholderSurface.c(this.G0, rVar.f68548g);
        }
        return this.X0;
    }

    private boolean J1(da.r rVar) {
        if (this.T0 != null) {
            return true;
        }
        Surface surface = this.W0;
        return (surface != null && surface.isValid()) || m2(rVar) || n2(rVar);
    }

    private boolean K1(t9.f fVar) {
        return fVar.f104990g < n();
    }

    private boolean L1(t9.f fVar) {
        if (hasReadStreamToEnd() || fVar.i() || this.f94596r1 == -9223372036854775807L) {
            return true;
        }
        return this.f94596r1 - (fVar.f104990g - m0()) <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private void N1() {
        if (this.f94582d1 > 0) {
            long jElapsedRealtime = j().elapsedRealtime();
            this.I0.n(this.f94582d1, jElapsedRealtime - this.f94581c1);
            this.f94582d1 = 0;
            this.f94581c1 = jElapsedRealtime;
        }
    }

    private void O1() {
        if (!this.L0.i() || this.W0 == null) {
            return;
        }
        W1();
    }

    private void P1() {
        int i10 = this.f94586h1;
        if (i10 != 0) {
            this.I0.r(this.f94585g1, i10);
            this.f94585g1 = 0L;
            this.f94586h1 = 0;
        }
    }

    private void Q1(n0 n0Var) {
        if (n0Var.equals(n0.f95432e) || n0Var.equals(this.f94589k1)) {
            return;
        }
        this.f94589k1 = n0Var;
        this.I0.t(n0Var);
    }

    private void R1() {
        Surface surface = this.W0;
        if (surface == null || !this.Z0) {
            return;
        }
        this.I0.q(surface);
    }

    private void S1() {
        n0 n0Var = this.f94589k1;
        if (n0Var != null) {
            this.I0.t(n0Var);
        }
    }

    private void T1(MediaFormat mediaFormat) {
        if (this.T0 == null || o0.H0(this.G0)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void U1() {
        int i10;
        da.n nVarC0;
        if (!this.f94591m1 || (i10 = o0.f98837a) < 23 || (nVarC0 = c0()) == null) {
            return;
        }
        this.f94593o1 = new f(nVarC0);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            nVarC0.setParameters(bundle);
        }
    }

    private void V1(long j10, long j11, io.bidmachine.media3.common.a aVar) {
        r rVar = this.f94594p1;
        if (rVar != null) {
            rVar.a(j10, j11, aVar, h0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1() {
        this.I0.q(this.W0);
        this.Z0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1() {
        a1();
    }

    private void Z1(da.n nVar, int i10, long j10, io.bidmachine.media3.common.a aVar) {
        j jVar;
        long jG = this.M0.g();
        long jF = this.M0.f();
        if (l2() && jG == this.f94587i1) {
            o2(nVar, i10, j10);
            jVar = this;
        } else {
            jVar = this;
            jVar.V1(j10, jG, aVar);
            jVar.c2(nVar, i10, j10, jG);
            jG = jG;
        }
        u2(jF);
        jVar.f94587i1 = jG;
    }

    private void a2() {
        PlaceholderSurface placeholderSurface = this.X0;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.X0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2(da.n nVar, int i10, long j10, long j11) {
        c2(nVar, i10, j10, j11);
    }

    private static void d2(da.n nVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        nVar.setParameters(bundle);
    }

    private void e2(Object obj) throws io.bidmachine.media3.exoplayer.s {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.W0 == surface) {
            if (surface != null) {
                S1();
                R1();
                return;
            }
            return;
        }
        this.W0 = surface;
        if (this.T0 == null) {
            this.L0.q(surface);
        }
        this.Z0 = false;
        int state = getState();
        da.n nVarC0 = c0();
        if (nVarC0 != null && this.T0 == null) {
            da.r rVar = (da.r) q9.a.e(e0());
            boolean zJ1 = J1(rVar);
            if (o0.f98837a < 23 || !zJ1 || this.R0) {
                S0();
                A0();
            } else {
                f2(nVarC0, I1(rVar));
            }
        }
        if (surface != null) {
            S1();
        } else {
            this.f94589k1 = null;
            g0 g0Var = this.T0;
            if (g0Var != null) {
                g0Var.clearOutputSurfaceInfo();
            }
        }
        if (state == 2) {
            g0 g0Var2 = this.T0;
            if (g0Var2 != null) {
                g0Var2.l(true);
            } else {
                this.L0.e(true);
            }
        }
        U1();
    }

    private void f2(da.n nVar, Surface surface) {
        int i10 = o0.f98837a;
        if (i10 >= 23 && surface != null) {
            g2(nVar, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            w1(nVar);
        }
    }

    private static int p2(Context context, da.x xVar, io.bidmachine.media3.common.a aVar) {
        boolean z10;
        int i10 = 0;
        if (!n9.w.t(aVar.f80561o)) {
            return j0.a(0);
        }
        boolean z11 = aVar.f80565s != null;
        List listE1 = E1(context, xVar, aVar, z11, false);
        if (z11 && listE1.isEmpty()) {
            listE1 = E1(context, xVar, aVar, false, false);
        }
        if (listE1.isEmpty()) {
            return j0.a(1);
        }
        if (!da.t.k1(aVar)) {
            return j0.a(2);
        }
        da.r rVar = (da.r) listE1.get(0);
        boolean zO = rVar.o(aVar);
        if (zO) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listE1.size(); i11++) {
                da.r rVar2 = (da.r) listE1.get(i11);
                if (rVar2.o(aVar)) {
                    z10 = false;
                    zO = true;
                    rVar = rVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = zO ? 4 : 3;
        int i13 = rVar.r(aVar) ? 16 : 8;
        int i14 = rVar.f68549h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (o0.f98837a >= 26 && "video/dolby-vision".equals(aVar.f80561o) && !c.a(context)) {
            i15 = 256;
        }
        if (zO) {
            List listE12 = E1(context, xVar, aVar, z11, true);
            if (!listE12.isEmpty()) {
                da.r rVar3 = (da.r) da.c0.n(listE12, aVar).get(0);
                if (rVar3.o(aVar) && rVar3.r(aVar)) {
                    i10 = 32;
                }
            }
        }
        return j0.c(i12, i13, i10, i14, i15);
    }

    private void q2() {
        da.n nVarC0 = c0();
        if (nVarC0 != null && o0.f98837a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f94590l1));
            nVarC0.setParameters(bundle);
        }
    }

    private void s2(long j10) {
        int i10 = 0;
        while (true) {
            Long l10 = (Long) this.P0.peek();
            if (l10 == null || l10.longValue() >= j10) {
                break;
            }
            i10++;
            this.P0.poll();
        }
        r2(i10, 0);
    }

    private void t2(f0.b bVar) {
        n9.e0 e0VarR = r();
        if (e0VarR.q()) {
            this.f94596r1 = -9223372036854775807L;
        } else {
            this.f94596r1 = e0VarR.h(((f0.b) q9.a.e(bVar)).f72270a, new e0.b()).j();
        }
    }

    private static boolean x1() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean z1() {
        String str;
        byte b10 = Ascii.SUB;
        int i10 = o0.f98837a;
        if (i10 <= 28) {
            String str2 = Build.DEVICE;
            str2.getClass();
            switch (str2) {
            }
            return true;
        }
        if (i10 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        str = Build.MODEL;
        str.getClass();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i10 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b10 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b10 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b10 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b10 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b10 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b10 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b10 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            b10 = !str3.equals("PGN528") ? (byte) -1 : (byte) 7;
                            break;
                        case -1936688066:
                            b10 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b10 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b10 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b10 = !str3.equals("RAIJIN") ? (byte) -1 : Ascii.VT;
                            break;
                        case -1696512866:
                            b10 = !str3.equals("XT1663") ? (byte) -1 : Ascii.FF;
                            break;
                        case -1680025915:
                            b10 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b10 = !str3.equals("Phantom6") ? (byte) -1 : Ascii.SO;
                            break;
                        case -1600724499:
                            b10 = !str3.equals("pacificrim") ? (byte) -1 : Ascii.SI;
                            break;
                        case -1554255044:
                            b10 = !str3.equals("vernee_M5") ? (byte) -1 : Ascii.DLE;
                            break;
                        case -1481772737:
                            b10 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b10 = !str3.equals("panell_ds") ? (byte) -1 : Ascii.DC2;
                            break;
                        case -1481772729:
                            b10 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b10 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : Ascii.DC4;
                            break;
                        case -1217592143:
                            b10 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : Ascii.NAK;
                            break;
                        case -1180384755:
                            b10 = !str3.equals("iris60") ? (byte) -1 : Ascii.SYN;
                            break;
                        case -1139198265:
                            b10 = !str3.equals("Slate_Pro") ? (byte) -1 : Ascii.ETB;
                            break;
                        case -1052835013:
                            b10 = !str3.equals("namath") ? (byte) -1 : Ascii.CAN;
                            break;
                        case -993250464:
                            b10 = !str3.equals("A10-70F") ? (byte) -1 : Ascii.EM;
                            break;
                        case -993250458:
                            if (!str3.equals("A10-70L")) {
                                b10 = -1;
                            }
                            break;
                        case -965403638:
                            b10 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b10 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b10 = !str3.equals("tcl_eu") ? (byte) -1 : Ascii.GS;
                            break;
                        case -842500323:
                            b10 = !str3.equals("nicklaus_f") ? (byte) -1 : Ascii.RS;
                            break;
                        case -821392978:
                            b10 = !str3.equals("A7000-a") ? (byte) -1 : Ascii.US;
                            break;
                        case -797483286:
                            b10 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b10 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b10 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b10 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b10 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b10 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b10 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b10 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b10 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b10 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b10 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b10 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b10 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b10 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b10 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b10 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b10 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b10 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b10 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b10 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b10 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b10 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b10 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b10 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b10 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b10 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b10 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b10 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b10 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b10 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b10 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b10 = !str3.equals("1713") ? (byte) -1 : Utf8.REPLACEMENT_BYTE;
                            break;
                        case 1514185:
                            b10 = !str3.equals("1714") ? (byte) -1 : SignedBytes.MAX_POWER_OF_TWO;
                            break;
                        case 2133089:
                            b10 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b10 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b10 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b10 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b10 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b10 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b10 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b10 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b10 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b10 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b10 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b10 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b10 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b10 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b10 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b10 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b10 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b10 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b10 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b10 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b10 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b10 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b10 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b10 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b10 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b10 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b10 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b10 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b10 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b10 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b10 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b10 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b10 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b10 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b10 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b10 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b10 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b10 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b10 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b10 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b10 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b10 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b10 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b10 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b10 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b10 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b10 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b10 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b10 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b10 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b10 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b10 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b10 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b10 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b10 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b10 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b10 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b10 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b10 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b10 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b10 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b10 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b10 = !str3.equals("iball8735_9806") ? (byte) -1 : Ascii.DEL;
                            break;
                        case 1865889110:
                            b10 = !str3.equals("santoni") ? (byte) -1 : UnsignedBytes.MAX_POWER_OF_TWO;
                            break;
                        case 1906253259:
                            b10 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b10 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b10 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b10 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b10 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b10 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b10 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b10 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b10 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b10 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b10 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            str.getClass();
                            if (!str.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                        case 134:
                        case 135:
                        case 136:
                        case TPAT_RETRY_FAILED_VALUE:
                        case 138:
                        case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void A() {
        super.A();
        this.f94582d1 = 0;
        this.f94581c1 = j().elapsedRealtime();
        this.f94585g1 = 0L;
        this.f94586h1 = 0;
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.onRendererStarted();
        } else {
            this.L0.k();
        }
    }

    protected long A1() {
        return -this.f94595q1;
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void B() {
        N1();
        P1();
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.onRendererStopped();
        } else {
            this.L0.l();
        }
        super.B();
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void C(io.bidmachine.media3.common.a[] aVarArr, long j10, long j11, f0.b bVar) {
        super.C(aVarArr, j10, j11, bVar);
        if (this.f94595q1 == -9223372036854775807L) {
            this.f94595q1 = j10;
        }
        t2(bVar);
    }

    @Override // da.t
    protected boolean C0(io.bidmachine.media3.common.a aVar) throws io.bidmachine.media3.exoplayer.s {
        g0 g0Var = this.T0;
        if (g0Var == null || g0Var.isInitialized()) {
            return true;
        }
        try {
            return this.T0.d(aVar);
        } catch (g0.c e10) {
            throw h(e10, aVar, 7000);
        }
    }

    @Override // da.t
    protected void D0(Exception exc) {
        q9.u.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.I0.s(exc);
    }

    protected e D1(da.r rVar, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a[] aVarArr) {
        int iB1;
        int iMax = aVar.f80568v;
        int iMax2 = aVar.f80569w;
        int iF1 = F1(rVar, aVar);
        if (aVarArr.length == 1) {
            if (iF1 != -1 && (iB1 = B1(rVar, aVar)) != -1) {
                iF1 = Math.min((int) (iF1 * 1.5f), iB1);
            }
            return new e(iMax, iMax2, iF1);
        }
        int length = aVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            io.bidmachine.media3.common.a aVarN = aVarArr[i10];
            if (aVar.C != null && aVarN.C == null) {
                aVarN = aVarN.b().T(aVar.C).N();
            }
            if (rVar.e(aVar, aVarN).f105293d != 0) {
                int i11 = aVarN.f80568v;
                z10 |= i11 == -1 || aVarN.f80569w == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, aVarN.f80569w);
                iF1 = Math.max(iF1, F1(rVar, aVarN));
            }
        }
        if (z10) {
            q9.u.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointC1 = C1(rVar, aVar);
            if (pointC1 != null) {
                iMax = Math.max(iMax, pointC1.x);
                iMax2 = Math.max(iMax2, pointC1.y);
                iF1 = Math.max(iF1, B1(rVar, aVar.b().B0(iMax).d0(iMax2).N()));
                q9.u.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iF1);
    }

    @Override // da.t
    protected void E0(String str, n.a aVar, long j10, long j11) {
        this.I0.k(str, j10, j11);
        this.R0 = v1(str);
        this.S0 = ((da.r) q9.a.e(e0())).p();
        U1();
    }

    @Override // da.t
    protected void F0(String str) {
        this.I0.l(str);
    }

    @Override // da.t
    protected u9.c G0(u9.d0 d0Var) throws io.bidmachine.media3.exoplayer.s {
        u9.c cVarG0 = super.G0(d0Var);
        this.I0.p((io.bidmachine.media3.common.a) q9.a.e(d0Var.f105308b), cVarG0);
        return cVarG0;
    }

    @Override // da.t
    protected void H0(io.bidmachine.media3.common.a aVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        da.n nVarC0 = c0();
        if (nVarC0 != null) {
            nVarC0.setVideoScalingMode(this.f94579a1);
        }
        if (this.f94591m1) {
            i10 = aVar.f80568v;
            integer = aVar.f80569w;
        } else {
            q9.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = aVar.f80572z;
        int i11 = aVar.f80571y;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f94588j1 = new n0(i10, integer, f10);
        g0 g0Var = this.T0;
        if (g0Var == null || !this.f94597s1) {
            this.L0.p(aVar.f80570x);
        } else {
            u1(g0Var, 1, aVar.b().B0(i10).d0(integer).q0(f10).N());
        }
        this.f94597s1 = false;
    }

    protected MediaFormat H1(io.bidmachine.media3.common.a aVar, String str, e eVar, float f10, boolean z10, int i10) {
        Pair pairI;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", aVar.f80568v);
        mediaFormat.setInteger("height", aVar.f80569w);
        q9.x.e(mediaFormat, aVar.f80564r);
        q9.x.c(mediaFormat, "frame-rate", aVar.f80570x);
        q9.x.d(mediaFormat, "rotation-degrees", aVar.f80571y);
        q9.x.b(mediaFormat, aVar.C);
        if ("video/dolby-vision".equals(aVar.f80561o) && (pairI = da.c0.i(aVar)) != null) {
            q9.x.d(mediaFormat, Scopes.PROFILE, ((Integer) pairI.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f94618a);
        mediaFormat.setInteger("max-height", eVar.f94619b);
        q9.x.d(mediaFormat, "max-input-size", eVar.f94620c);
        int i11 = o0.f98837a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f94590l1));
        }
        return mediaFormat;
    }

    @Override // da.t
    protected void J0(long j10) {
        super.J0(j10);
        if (this.f94591m1) {
            return;
        }
        this.f94584f1--;
    }

    @Override // da.t
    protected u9.c K(da.r rVar, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2) {
        u9.c cVarE = rVar.e(aVar, aVar2);
        int i10 = cVarE.f105294e;
        e eVar = (e) q9.a.e(this.Q0);
        if (aVar2.f80568v > eVar.f94618a || aVar2.f80569w > eVar.f94619b) {
            i10 |= 256;
        }
        if (F1(rVar, aVar2) > eVar.f94620c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new u9.c(rVar.f68542a, aVar, aVar2, i11 != 0 ? 0 : cVarE.f105293d, i11);
    }

    @Override // da.t
    protected void K0() {
        super.K0();
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.a();
            this.T0.i(n0(), A1());
        } else {
            this.L0.j();
        }
        this.f94597s1 = true;
        U1();
    }

    @Override // da.t
    protected void L0(t9.f fVar) {
        ByteBuffer byteBuffer;
        if (this.N0 != null && ((da.r) q9.a.e(e0())).f68543b.equals("video/av01") && (byteBuffer = fVar.f104988e) != null) {
            this.N0.b(byteBuffer);
        }
        this.f94599u1 = 0;
        boolean z10 = this.f94591m1;
        if (!z10) {
            this.f94584f1++;
        }
        if (o0.f98837a >= 23 || !z10) {
            return;
        }
        X1(fVar.f104990g);
    }

    @Override // da.t
    protected void M0(i2.a aVar) {
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.g(aVar);
        }
    }

    protected boolean M1(long j10, boolean z10) throws io.bidmachine.media3.exoplayer.s {
        int iG = G(j10);
        if (iG == 0) {
            return false;
        }
        if (z10) {
            u9.b bVar = this.A0;
            int i10 = bVar.f105281d + iG;
            bVar.f105281d = i10;
            bVar.f105283f += this.f94584f1;
            bVar.f105281d = i10 + this.P0.size();
        } else {
            this.A0.f105287j++;
            r2(iG + this.P0.size(), this.f94584f1);
        }
        Z();
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.flush(false);
        }
        return true;
    }

    @Override // da.t
    protected boolean O0(long j10, long j11, da.n nVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, io.bidmachine.media3.common.a aVar) {
        q9.a.e(nVar);
        long jM0 = j12 - m0();
        s2(j12);
        if (this.T0 != null) {
            if (!z10 || z11) {
                return this.T0.c(A1() + j12, z11, new b(nVar, i10, jM0));
            }
            o2(nVar, i10, jM0);
            return true;
        }
        int iC = this.L0.c(j12, j10, j11, n0(), z10, z11, this.M0);
        if (iC == 0) {
            long jNanoTime = j().nanoTime();
            V1(jM0, jNanoTime, aVar);
            b2(nVar, i10, jM0, jNanoTime);
            u2(this.M0.f());
            return true;
        }
        if (iC == 1) {
            Z1((da.n) q9.a.i(nVar), i10, jM0, aVar);
            return true;
        }
        if (iC == 2) {
            y1(nVar, i10, jM0);
            u2(this.M0.f());
            return true;
        }
        if (iC == 3) {
            o2(nVar, i10, jM0);
            u2(this.M0.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    @Override // da.t
    protected da.q Q(Throwable th2, da.r rVar) {
        return new i(th2, rVar, this.W0);
    }

    @Override // da.t
    protected void T0() {
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    @Override // da.t
    protected void U0() {
        super.U0();
        this.P0.clear();
        this.f94598t1 = false;
        this.f94584f1 = 0;
        this.f94599u1 = 0;
        ma.a aVar = this.N0;
        if (aVar != null) {
            aVar.c();
        }
    }

    protected void X1(long j10) {
        n1(j10);
        Q1(this.f94588j1);
        this.A0.f105282e++;
        O1();
        J0(j10);
    }

    protected void c2(da.n nVar, int i10, long j10, long j11) {
        k0.a("releaseOutputBuffer");
        nVar.releaseOutputBuffer(i10, j11);
        k0.b();
        this.A0.f105282e++;
        this.f94583e1 = 0;
        if (this.T0 == null) {
            Q1(this.f94588j1);
            O1();
        }
    }

    @Override // da.t
    protected int d0(t9.f fVar) {
        return (o0.f98837a >= 34 && this.f94591m1 && K1(fVar)) ? 32 : 0;
    }

    @Override // da.t
    protected boolean e1(t9.f fVar) {
        ByteBuffer byteBuffer;
        if (L1(fVar) || fVar.o()) {
            return false;
        }
        boolean zK1 = K1(fVar);
        if ((!zK1 && !this.f94598t1) || fVar.e()) {
            return false;
        }
        if (fVar.j()) {
            fVar.c();
            if (zK1) {
                this.A0.f105281d++;
            } else if (this.f94598t1) {
                this.P0.add(Long.valueOf(fVar.f104990g));
                this.f94599u1++;
            }
            return true;
        }
        if (this.N0 != null && ((da.r) q9.a.e(e0())).f68543b.equals("video/av01") && (byteBuffer = fVar.f104988e) != null) {
            boolean z10 = zK1 || this.f94599u1 <= 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.flip();
            int iD = this.N0.d(byteBufferAsReadOnlyBuffer, z10);
            boolean z11 = ((e) q9.a.e(this.Q0)).f94620c + iD < byteBufferAsReadOnlyBuffer.capacity();
            if (iD != byteBufferAsReadOnlyBuffer.limit() && z11) {
                ((ByteBuffer) q9.a.e(fVar.f104988e)).position(iD);
                if (zK1) {
                    this.A0.f105281d++;
                } else if (this.f94598t1) {
                    this.P0.add(Long.valueOf(fVar.f104990g));
                    this.f94599u1++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.i2
    public void enableMayRenderStartOfStream() {
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.enableMayRenderStartOfStream();
        } else {
            this.L0.a();
        }
    }

    @Override // da.t
    protected boolean f0() {
        return this.f94591m1 && o0.f98837a < 23;
    }

    @Override // da.t
    protected boolean f1(da.r rVar) {
        return J1(rVar);
    }

    @Override // da.t
    protected float g0(float f10, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a[] aVarArr) {
        float fMax = -1.0f;
        for (io.bidmachine.media3.common.a aVar2 : aVarArr) {
            float f11 = aVar2.f80570x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    protected void g2(da.n nVar, Surface surface) {
        nVar.setOutputSurface(surface);
    }

    @Override // io.bidmachine.media3.exoplayer.i2, io.bidmachine.media3.exoplayer.j2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public void h2(List list) {
        this.V0 = list;
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.setVideoEffects(list);
        }
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.g2.b
    public void handleMessage(int i10, Object obj) throws io.bidmachine.media3.exoplayer.s {
        if (i10 == 1) {
            e2(obj);
            return;
        }
        if (i10 == 7) {
            r rVar = (r) q9.a.e(obj);
            this.f94594p1 = rVar;
            g0 g0Var = this.T0;
            if (g0Var != null) {
                g0Var.h(rVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) q9.a.e(obj)).intValue();
            if (this.f94592n1 != iIntValue) {
                this.f94592n1 = iIntValue;
                if (this.f94591m1) {
                    S0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.f94579a1 = ((Integer) q9.a.e(obj)).intValue();
            da.n nVarC0 = c0();
            if (nVarC0 != null) {
                nVarC0.setVideoScalingMode(this.f94579a1);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue2 = ((Integer) q9.a.e(obj)).intValue();
            this.f94580b1 = iIntValue2;
            g0 g0Var2 = this.T0;
            if (g0Var2 != null) {
                g0Var2.f(iIntValue2);
                return;
            } else {
                this.L0.n(iIntValue2);
                return;
            }
        }
        if (i10 == 13) {
            h2((List) q9.a.e(obj));
            return;
        }
        if (i10 == 14) {
            q9.f0 f0Var = (q9.f0) q9.a.e(obj);
            if (f0Var.b() == 0 || f0Var.a() == 0) {
                return;
            }
            this.Y0 = f0Var;
            g0 g0Var3 = this.T0;
            if (g0Var3 != null) {
                g0Var3.e((Surface) q9.a.i(this.W0), f0Var);
                return;
            }
            return;
        }
        if (i10 == 16) {
            this.f94590l1 = ((Integer) q9.a.e(obj)).intValue();
            q2();
        } else {
            if (i10 != 17) {
                super.handleMessage(i10, obj);
                return;
            }
            Surface surface = this.W0;
            e2(null);
            ((j) q9.a.e(obj)).handleMessage(1, surface);
        }
    }

    @Override // da.t
    protected List i0(da.x xVar, io.bidmachine.media3.common.a aVar, boolean z10) {
        return da.c0.n(E1(this.G0, xVar, aVar, z10, this.f94591m1), aVar);
    }

    protected boolean i2(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.i2
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        g0 g0Var = this.T0;
        return g0Var == null || g0Var.isEnded();
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.i2
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        g0 g0Var = this.T0;
        if (g0Var != null) {
            return g0Var.k(zIsReady);
        }
        if (zIsReady && (c0() == null || this.f94591m1)) {
            return true;
        }
        return this.L0.d(zIsReady);
    }

    @Override // da.t
    protected int j1(da.x xVar, io.bidmachine.media3.common.a aVar) {
        return p2(this.G0, xVar, aVar);
    }

    protected boolean j2(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    protected boolean k2(long j10, long j11) {
        return j10 < -30000 && j11 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    @Override // da.t
    protected n.a l0(da.r rVar, io.bidmachine.media3.common.a aVar, MediaCrypto mediaCrypto, float f10) {
        String str = rVar.f68544c;
        e eVarD1 = D1(rVar, aVar, p());
        this.Q0 = eVarD1;
        MediaFormat mediaFormatH1 = H1(aVar, str, eVarD1, f10, this.K0, this.f94591m1 ? this.f94592n1 : 0);
        Surface surfaceI1 = I1(rVar);
        T1(mediaFormatH1);
        return n.a.b(rVar, mediaFormatH1, aVar, surfaceI1, mediaCrypto);
    }

    protected boolean l2() {
        return true;
    }

    protected boolean m2(da.r rVar) {
        return o0.f98837a >= 35 && rVar.f68552k;
    }

    protected boolean n2(da.r rVar) {
        if (o0.f98837a < 23 || this.f94591m1 || v1(rVar.f68542a)) {
            return false;
        }
        return !rVar.f68548g || PlaceholderSurface.b(this.G0);
    }

    protected void o2(da.n nVar, int i10, long j10) {
        k0.a("skipVideoBuffer");
        nVar.releaseOutputBuffer(i10, false);
        k0.b();
        this.A0.f105283f++;
    }

    @Override // da.t
    protected void q0(t9.f fVar) {
        if (this.S0) {
            ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(fVar.f104991h);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        d2((da.n) q9.a.e(c0()), bArr);
                    }
                }
            }
        }
    }

    protected void r2(int i10, int i11) {
        u9.b bVar = this.A0;
        bVar.f105285h += i10;
        int i12 = i10 + i11;
        bVar.f105284g += i12;
        this.f94582d1 += i12;
        int i13 = this.f94583e1 + i12;
        this.f94583e1 = i13;
        bVar.f105286i = Math.max(i13, bVar.f105286i);
        int i14 = this.J0;
        if (i14 <= 0 || this.f94582d1 < i14) {
            return;
        }
        N1();
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.i2
    public void render(long j10, long j11) throws io.bidmachine.media3.exoplayer.s {
        g0 g0Var = this.T0;
        if (g0Var != null) {
            try {
                g0Var.render(j10, j11);
            } catch (g0.c e10) {
                throw h(e10, e10.f94559b, 7001);
            }
        }
        super.render(j10, j11);
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.i2
    public void setPlaybackSpeed(float f10, float f11) throws io.bidmachine.media3.exoplayer.s {
        super.setPlaybackSpeed(f10, f11);
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.setPlaybackSpeed(f10);
        } else {
            this.L0.r(f10);
        }
    }

    @Override // ma.s.b
    public boolean shouldDropFrame(long j10, long j11, boolean z10) {
        return j2(j10, j11, z10);
    }

    @Override // ma.s.b
    public boolean shouldForceReleaseFrame(long j10, long j11) {
        return k2(j10, j11);
    }

    @Override // ma.s.b
    public boolean shouldIgnoreFrame(long j10, long j11, long j12, boolean z10, boolean z11) {
        if (this.O0 != -9223372036854775807L) {
            this.f94598t1 = j11 > n() + 200000 && j10 < this.O0;
        }
        return i2(j10, j12, z10) && M1(j11, z11);
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void t() {
        this.f94589k1 = null;
        this.f94596r1 = -9223372036854775807L;
        g0 g0Var = this.T0;
        if (g0Var != null) {
            g0Var.onRendererDisabled();
        } else {
            this.L0.g();
        }
        U1();
        this.Z0 = false;
        this.f94593o1 = null;
        try {
            super.t();
        } finally {
            this.I0.m(this.A0);
            this.I0.t(n0.f95432e);
        }
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void u(boolean z10, boolean z11) {
        super.u(z10, z11);
        boolean z12 = k().f105315b;
        q9.a.g((z12 && this.f94592n1 == 0) ? false : true);
        if (this.f94591m1 != z12) {
            this.f94591m1 = z12;
            S0();
        }
        this.I0.o(this.A0);
        if (!this.U0) {
            if (this.V0 != null && this.T0 == null) {
                n nVarH = new n.b(this.G0, this.L0).i(j()).h();
                nVarH.M(1);
                this.T0 = nVarH.B(0);
            }
            this.U0 = true;
        }
        g0 g0Var = this.T0;
        if (g0Var == null) {
            this.L0.o(j());
            this.L0.h(z11);
            return;
        }
        g0Var.j(new a(), MoreExecutors.directExecutor());
        r rVar = this.f94594p1;
        if (rVar != null) {
            this.T0.h(rVar);
        }
        if (this.W0 != null && !this.Y0.equals(q9.f0.f98785c)) {
            this.T0.e(this.W0, this.Y0);
        }
        this.T0.f(this.f94580b1);
        this.T0.setPlaybackSpeed(o0());
        List list = this.V0;
        if (list != null) {
            this.T0.setVideoEffects(list);
        }
        this.T0.onRendererEnabled(z11);
        i2.a aVarP0 = p0();
        if (aVarP0 != null) {
            this.T0.g(aVarP0);
        }
    }

    protected void u1(g0 g0Var, int i10, io.bidmachine.media3.common.a aVar) {
        List listOf = this.V0;
        if (listOf == null) {
            listOf = ImmutableList.of();
        }
        g0Var.b(i10, aVar, listOf);
    }

    protected void u2(long j10) {
        this.A0.a(j10);
        this.f94585g1 += j10;
        this.f94586h1++;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void v() {
        super.v();
    }

    protected boolean v1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j.class) {
            try {
                if (!f94577w1) {
                    f94578x1 = z1();
                    f94577w1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f94578x1;
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void w(long j10, boolean z10) throws io.bidmachine.media3.exoplayer.s {
        g0 g0Var = this.T0;
        if (g0Var != null) {
            if (!z10) {
                g0Var.flush(true);
            }
            this.T0.i(n0(), A1());
            this.f94597s1 = true;
        }
        super.w(j10, z10);
        if (this.T0 == null) {
            this.L0.m();
        }
        if (z10) {
            g0 g0Var2 = this.T0;
            if (g0Var2 != null) {
                g0Var2.l(false);
            } else {
                this.L0.e(false);
            }
        }
        U1();
        this.f94583e1 = 0;
    }

    protected void w1(da.n nVar) {
        nVar.c();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void x() {
        super.x();
        g0 g0Var = this.T0;
        if (g0Var == null || !this.H0) {
            return;
        }
        g0Var.release();
    }

    protected void y1(da.n nVar, int i10, long j10) {
        k0.a("dropVideoBuffer");
        nVar.releaseOutputBuffer(i10, false);
        k0.b();
        r2(0, 1);
    }

    @Override // da.t, io.bidmachine.media3.exoplayer.h
    protected void z() {
        try {
            super.z();
        } finally {
            this.U0 = false;
            this.f94595q1 = -9223372036854775807L;
            a2();
        }
    }

    class a implements g0.a {
        a() {
        }

        @Override // ma.g0.a
        public void a(g0 g0Var) {
            if (j.this.W0 != null) {
                j.this.W1();
            }
        }

        @Override // ma.g0.a
        public void c(g0 g0Var) {
            if (j.this.W0 != null) {
                j.this.r2(0, 1);
            }
        }

        @Override // ma.g0.a
        public void b(g0 g0Var, n0 n0Var) {
        }
    }
}
