package v9;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.exoplayer.analytics.k2;
import androidx.media3.exoplayer.analytics.l3;
import androidx.media3.exoplayer.analytics.m3;
import androidx.media3.exoplayer.analytics.o3;
import androidx.media3.exoplayer.analytics.p3;
import androidx.media3.exoplayer.analytics.q3;
import androidx.media3.exoplayer.analytics.v2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import da.t;
import ga.f0;
import io.bidmachine.media3.common.DrmInitData;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import n9.a0;
import n9.e0;
import n9.i0;
import n9.r;
import s9.p;
import s9.z;
import v9.b2;
import v9.c;
import w9.s;
import z9.h;
import z9.n;

/* JADX INFO: loaded from: classes12.dex */
public final class a2 implements c, b2.a {
    private int A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105812a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2 f105814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PlaybackSession f105815d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f105821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PlaybackMetrics.Builder f105822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f105823l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n9.y f105826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f105827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f105828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f105829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.bidmachine.media3.common.a f105830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private io.bidmachine.media3.common.a f105831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.bidmachine.media3.common.a f105832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f105833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f105834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f105835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f105836y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f105837z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f105813b = q9.b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0.c f105817f = new e0.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0.b f105818g = new e0.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap f105820i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f105819h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f105816e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f105824m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f105825n = 0;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f105839b;

        public a(int i10, int i11) {
            this.f105838a = i10;
            this.f105839b = i11;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f105840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f105841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105842c;

        public b(io.bidmachine.media3.common.a aVar, int i10, String str) {
            this.f105840a = aVar;
            this.f105841b = i10;
            this.f105842c = str;
        }
    }

    private a2(Context context, PlaybackSession playbackSession) {
        this.f105812a = context.getApplicationContext();
        this.f105815d = playbackSession;
        u1 u1Var = new u1();
        this.f105814c = u1Var;
        u1Var.f(this);
    }

    private boolean D0(b bVar) {
        return bVar != null && bVar.f105842c.equals(this.f105814c.getActiveSessionId());
    }

    public static a2 E0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = v2.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new a2(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void F0() {
        PlaybackMetrics.Builder builder = this.f105822k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f105822k.setVideoFramesDropped(this.f105836y);
            this.f105822k.setVideoFramesPlayed(this.f105837z);
            Long l10 = (Long) this.f105819h.get(this.f105821j);
            this.f105822k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f105820i.get(this.f105821j);
            this.f105822k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f105822k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f105822k.build();
            this.f105813b.execute(new Runnable() { // from class: v9.w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106031b.f105815d.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f105822k = null;
        this.f105821j = null;
        this.A = 0;
        this.f105836y = 0;
        this.f105837z = 0;
        this.f105830s = null;
        this.f105831t = null;
        this.f105832u = null;
        this.B = false;
    }

    private static int G0(int i10) {
        switch (q9.o0.b0(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static DrmInitData H0(ImmutableList immutableList) {
        DrmInitData drmInitData;
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            i0.a aVar = (i0.a) it.next();
            for (int i10 = 0; i10 < aVar.f95408a; i10++) {
                if (aVar.g(i10) && (drmInitData = aVar.b(i10).f80565s) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int I0(DrmInitData drmInitData) {
        for (int i10 = 0; i10 < drmInitData.f80510e; i10++) {
            UUID uuid = drmInitData.e(i10).f80512c;
            if (uuid.equals(n9.f.f95290d)) {
                return 3;
            }
            if (uuid.equals(n9.f.f95291e)) {
                return 2;
            }
            if (uuid.equals(n9.f.f95289c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a J0(n9.y yVar, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (yVar.f95673b == 1001) {
            return new a(20, 0);
        }
        if (yVar instanceof io.bidmachine.media3.exoplayer.s) {
            io.bidmachine.media3.exoplayer.s sVar = (io.bidmachine.media3.exoplayer.s) yVar;
            z11 = sVar.f81282k == 1;
            i10 = sVar.f81286o;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) q9.a.e(yVar.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof t.c) {
                return new a(13, q9.o0.c0(((t.c) th2).f68592e));
            }
            if (th2 instanceof da.q) {
                return new a(14, ((da.q) th2).f68541d);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof s.c) {
                return new a(17, ((s.c) th2).f107753b);
            }
            if (th2 instanceof s.f) {
                return new a(18, ((s.f) th2).f107758b);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(G0(errorCode), errorCode);
        }
        if (th2 instanceof s9.t) {
            return new a(5, ((s9.t) th2).f99887e);
        }
        if ((th2 instanceof s9.s) || (th2 instanceof n9.x)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th2 instanceof s9.r;
        if (z12 || (th2 instanceof z.a)) {
            if (q9.z.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z12 && ((s9.r) th2).f99885d == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (yVar.f95673b == 1002) {
            return new a(21, 0);
        }
        if (th2 instanceof n.a) {
            Throwable th3 = (Throwable) q9.a.e(th2.getCause());
            if (!(th3 instanceof MediaDrm.MediaDrmStateException)) {
                return (q9.o0.f98837a < 23 || !(th3 instanceof MediaDrmResetException)) ? th3 instanceof NotProvisionedException ? new a(24, 0) : th3 instanceof DeniedByServerException ? new a(29, 0) : th3 instanceof z9.p0 ? new a(23, 0) : th3 instanceof h.e ? new a(28, 0) : new a(30, 0) : new a(27, 0);
            }
            int iC0 = q9.o0.c0(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(G0(iC0), iC0);
        }
        if (!(th2 instanceof p.a) || !(th2.getCause() instanceof FileNotFoundException)) {
            return new a(9, 0);
        }
        Throwable cause2 = ((Throwable) q9.a.e(th2.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
    }

    private static Pair K0(String str) {
        String[] strArrJ1 = q9.o0.j1(str, TokenBuilder.TOKEN_DELIMITER);
        return Pair.create(strArrJ1[0], strArrJ1.length >= 2 ? strArrJ1[1] : null);
    }

    private static int M0(Context context) {
        switch (q9.z.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int N0(n9.r rVar) {
        r.h hVar = rVar.f95455b;
        if (hVar == null) {
            return 0;
        }
        int iA0 = q9.o0.A0(hVar.f95547a, hVar.f95548b);
        if (iA0 == 0) {
            return 3;
        }
        if (iA0 != 1) {
            return iA0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int O0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void P0(c.b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int iB = bVar.b(i10);
            c.a aVarC = bVar.c(iB);
            if (iB == 0) {
                this.f105814c.e(aVarC);
            } else if (iB == 11) {
                this.f105814c.b(aVarC, this.f105823l);
            } else {
                this.f105814c.c(aVarC);
            }
        }
    }

    private void Q0(long j10) {
        int iM0 = M0(this.f105812a);
        if (iM0 != this.f105825n) {
            this.f105825n = iM0;
            final NetworkEvent networkEventBuild = m3.a().setNetworkType(iM0).setTimeSinceCreatedMillis(j10 - this.f105816e).build();
            this.f105813b.execute(new Runnable() { // from class: v9.v1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106024b.f105815d.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    private void R0(long j10) {
        n9.y yVar = this.f105826o;
        if (yVar == null) {
            return;
        }
        a aVarJ0 = J0(yVar, this.f105812a, this.f105834w == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = p3.a().setTimeSinceCreatedMillis(j10 - this.f105816e).setErrorCode(aVarJ0.f105838a).setSubErrorCode(aVarJ0.f105839b).setException(yVar).build();
        this.f105813b.execute(new Runnable() { // from class: v9.z1
            @Override // java.lang.Runnable
            public final void run() {
                this.f106050b.f105815d.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.B = true;
        this.f105826o = null;
    }

    private void S0(n9.a0 a0Var, c.b bVar, long j10) {
        if (a0Var.getPlaybackState() != 2) {
            this.f105833v = false;
        }
        if (a0Var.getPlayerError() == null) {
            this.f105835x = false;
        } else if (bVar.a(10)) {
            this.f105835x = true;
        }
        int iA1 = a1(a0Var);
        if (this.f105824m != iA1) {
            this.f105824m = iA1;
            this.B = true;
            final PlaybackStateEvent playbackStateEventBuild = q3.a().setState(this.f105824m).setTimeSinceCreatedMillis(j10 - this.f105816e).build();
            this.f105813b.execute(new Runnable() { // from class: v9.y1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106044b.f105815d.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    private void T0(n9.a0 a0Var, c.b bVar, long j10) {
        if (bVar.a(2)) {
            n9.i0 currentTracks = a0Var.getCurrentTracks();
            boolean zC = currentTracks.c(2);
            boolean zC2 = currentTracks.c(1);
            boolean zC3 = currentTracks.c(3);
            if (zC || zC2 || zC3) {
                if (!zC) {
                    Y0(j10, null, 0);
                }
                if (!zC2) {
                    U0(j10, null, 0);
                }
                if (!zC3) {
                    W0(j10, null, 0);
                }
            }
        }
        if (D0(this.f105827p)) {
            b bVar2 = this.f105827p;
            io.bidmachine.media3.common.a aVar = bVar2.f105840a;
            if (aVar.f80569w != -1) {
                Y0(j10, aVar, bVar2.f105841b);
                this.f105827p = null;
            }
        }
        if (D0(this.f105828q)) {
            b bVar3 = this.f105828q;
            U0(j10, bVar3.f105840a, bVar3.f105841b);
            this.f105828q = null;
        }
        if (D0(this.f105829r)) {
            b bVar4 = this.f105829r;
            W0(j10, bVar4.f105840a, bVar4.f105841b);
            this.f105829r = null;
        }
    }

    private void U0(long j10, io.bidmachine.media3.common.a aVar, int i10) {
        if (Objects.equals(this.f105831t, aVar)) {
            return;
        }
        if (this.f105831t == null && i10 == 0) {
            i10 = 1;
        }
        this.f105831t = aVar;
        Z0(0, j10, aVar, i10);
    }

    private void V0(n9.a0 a0Var, c.b bVar) {
        DrmInitData drmInitDataH0;
        if (bVar.a(0)) {
            c.a aVarC = bVar.c(0);
            if (this.f105822k != null) {
                X0(aVarC.f105849b, aVarC.f105851d);
            }
        }
        if (bVar.a(2) && this.f105822k != null && (drmInitDataH0 = H0(a0Var.getCurrentTracks().a())) != null) {
            k2.a(q9.o0.i(this.f105822k)).setDrmType(I0(drmInitDataH0));
        }
        if (bVar.a(1011)) {
            this.A++;
        }
    }

    private void W0(long j10, io.bidmachine.media3.common.a aVar, int i10) {
        if (Objects.equals(this.f105832u, aVar)) {
            return;
        }
        if (this.f105832u == null && i10 == 0) {
            i10 = 1;
        }
        this.f105832u = aVar;
        Z0(2, j10, aVar, i10);
    }

    private void X0(n9.e0 e0Var, f0.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f105822k;
        if (bVar == null || (iB = e0Var.b(bVar.f72270a)) == -1) {
            return;
        }
        e0Var.f(iB, this.f105818g);
        e0Var.n(this.f105818g.f95256c, this.f105817f);
        builder.setStreamType(N0(this.f105817f.f95273c));
        e0.c cVar = this.f105817f;
        if (cVar.f95283m != -9223372036854775807L && !cVar.f95281k && !cVar.f95279i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f105817f.d());
        }
        builder.setPlaybackType(this.f105817f.f() ? 2 : 1);
        this.B = true;
    }

    private void Y0(long j10, io.bidmachine.media3.common.a aVar, int i10) {
        if (Objects.equals(this.f105830s, aVar)) {
            return;
        }
        if (this.f105830s == null && i10 == 0) {
            i10 = 1;
        }
        this.f105830s = aVar;
        Z0(1, j10, aVar, i10);
    }

    private void Z0(int i10, long j10, io.bidmachine.media3.common.a aVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = l3.a(i10).setTimeSinceCreatedMillis(j10 - this.f105816e);
        if (aVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(O0(i11));
            String str = aVar.f80560n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = aVar.f80561o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = aVar.f80557k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = aVar.f80556j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = aVar.f80568v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = aVar.f80569w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = aVar.E;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = aVar.F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = aVar.f80550d;
            if (str4 != null) {
                Pair pairK0 = K0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairK0.first);
                Object obj = pairK0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = aVar.f80570x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f105813b.execute(new Runnable() { // from class: v9.x1
            @Override // java.lang.Runnable
            public final void run() {
                this.f106037b.f105815d.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private int a1(n9.a0 a0Var) {
        int playbackState = a0Var.getPlaybackState();
        if (this.f105833v) {
            return 5;
        }
        if (this.f105835x) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i10 = this.f105824m;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (a0Var.getPlayWhenReady()) {
                return a0Var.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (a0Var.getPlayWhenReady()) {
                return a0Var.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f105824m == 0) {
            return this.f105824m;
        }
        return 12;
    }

    @Override // v9.c
    public /* synthetic */ void A(c.a aVar, Object obj, long j10) {
        v9.b.S(this, aVar, obj, j10);
    }

    @Override // v9.c
    public /* synthetic */ void B(c.a aVar, ga.y yVar, ga.b0 b0Var) {
        v9.b.C(this, aVar, yVar, b0Var);
    }

    @Override // v9.c
    public /* synthetic */ void C(c.a aVar) {
        v9.b.u(this, aVar);
    }

    @Override // v9.c
    public /* synthetic */ void D(c.a aVar, boolean z10) {
        v9.b.B(this, aVar, z10);
    }

    @Override // v9.c
    public /* synthetic */ void E(c.a aVar, List list) {
        v9.b.o(this, aVar, list);
    }

    @Override // v9.c
    public /* synthetic */ void F(c.a aVar, io.bidmachine.media3.common.a aVar2, u9.c cVar) {
        v9.b.g(this, aVar, aVar2, cVar);
    }

    @Override // v9.c
    public void G(n9.a0 a0Var, c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        P0(bVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        V0(a0Var, bVar);
        R0(jElapsedRealtime);
        T0(a0Var, bVar, jElapsedRealtime);
        Q0(jElapsedRealtime);
        S0(a0Var, bVar, jElapsedRealtime);
        if (bVar.a(1028)) {
            this.f105814c.d(bVar.c(1028));
        }
    }

    @Override // v9.c
    public /* synthetic */ void H(c.a aVar, String str, long j10) {
        v9.b.b(this, aVar, str, j10);
    }

    @Override // v9.c
    public /* synthetic */ void I(c.a aVar, String str, long j10, long j11) {
        v9.b.f0(this, aVar, str, j10, j11);
    }

    @Override // v9.c
    public /* synthetic */ void J(c.a aVar) {
        v9.b.s(this, aVar);
    }

    @Override // v9.c
    public void K(c.a aVar, int i10, long j10, long j11) {
        f0.b bVar = aVar.f105851d;
        if (bVar != null) {
            String strA = this.f105814c.a(aVar.f105849b, (f0.b) q9.a.e(bVar));
            Long l10 = (Long) this.f105820i.get(strA);
            Long l11 = (Long) this.f105819h.get(strA);
            this.f105820i.put(strA, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f105819h.put(strA, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // v9.c
    public /* synthetic */ void L(c.a aVar, boolean z10, int i10) {
        v9.b.Q(this, aVar, z10, i10);
    }

    public LogSessionId L0() {
        return this.f105815d.getSessionId();
    }

    @Override // v9.c
    public /* synthetic */ void M(c.a aVar, int i10, int i11, boolean z10) {
        v9.b.T(this, aVar, i10, i11, z10);
    }

    @Override // v9.c
    public void N(c.a aVar, a0.e eVar, a0.e eVar2, int i10) {
        if (i10 == 1) {
            this.f105833v = true;
        }
        this.f105823l = i10;
    }

    @Override // v9.c
    public /* synthetic */ void O(c.a aVar, long j10, int i10) {
        v9.b.i0(this, aVar, j10, i10);
    }

    @Override // v9.c
    public /* synthetic */ void P(c.a aVar, u9.b bVar) {
        v9.b.h0(this, aVar, bVar);
    }

    @Override // v9.c
    public void Q(c.a aVar, u9.b bVar) {
        this.f105836y += bVar.f105284g;
        this.f105837z += bVar.f105282e;
    }

    @Override // v9.c
    public /* synthetic */ void R(c.a aVar, boolean z10) {
        v9.b.A(this, aVar, z10);
    }

    @Override // v9.c
    public /* synthetic */ void S(c.a aVar, boolean z10) {
        v9.b.X(this, aVar, z10);
    }

    @Override // v9.c
    public /* synthetic */ void T(c.a aVar, String str, long j10) {
        v9.b.e0(this, aVar, str, j10);
    }

    @Override // v9.c
    public /* synthetic */ void U(c.a aVar, int i10) {
        v9.b.Z(this, aVar, i10);
    }

    @Override // v9.c
    public void V(c.a aVar, n9.n0 n0Var) {
        b bVar = this.f105827p;
        if (bVar != null) {
            io.bidmachine.media3.common.a aVar2 = bVar.f105840a;
            if (aVar2.f80569w == -1) {
                this.f105827p = new b(aVar2.b().B0(n0Var.f95436a).d0(n0Var.f95437b).N(), bVar.f105841b, bVar.f105842c);
            }
        }
    }

    @Override // v9.c
    public /* synthetic */ void W(c.a aVar, long j10) {
        v9.b.h(this, aVar, j10);
    }

    @Override // v9.c
    public /* synthetic */ void X(c.a aVar, n9.i0 i0Var) {
        v9.b.b0(this, aVar, i0Var);
    }

    @Override // v9.c
    public /* synthetic */ void Y(c.a aVar) {
        v9.b.v(this, aVar);
    }

    @Override // v9.c
    public /* synthetic */ void Z(c.a aVar, u9.b bVar) {
        v9.b.e(this, aVar, bVar);
    }

    @Override // v9.c
    public /* synthetic */ void a(c.a aVar, n9.v vVar) {
        v9.b.J(this, aVar, vVar);
    }

    @Override // v9.c
    public /* synthetic */ void a0(c.a aVar, String str) {
        v9.b.d(this, aVar, str);
    }

    @Override // v9.c
    public /* synthetic */ void b(c.a aVar, int i10) {
        v9.b.R(this, aVar, i10);
    }

    @Override // v9.c
    public /* synthetic */ void b0(c.a aVar, Exception exc) {
        v9.b.j(this, aVar, exc);
    }

    @Override // v9.c
    public /* synthetic */ void c(c.a aVar, n9.r rVar, int i10) {
        v9.b.H(this, aVar, rVar, i10);
    }

    @Override // v9.c
    public /* synthetic */ void c0(c.a aVar, float f10) {
        v9.b.l0(this, aVar, f10);
    }

    @Override // v9.b2.a
    public void d(c.a aVar, String str) {
        f0.b bVar = aVar.f105851d;
        if (bVar == null || !bVar.b()) {
            F0();
            this.f105821j = str;
            this.f105822k = o3.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.7.1");
            X0(aVar.f105849b, aVar.f105851d);
        }
    }

    @Override // v9.c
    public /* synthetic */ void d0(c.a aVar, String str, long j10, long j11) {
        v9.b.c(this, aVar, str, j10, j11);
    }

    @Override // v9.c
    public void e(c.a aVar, ga.b0 b0Var) {
        if (aVar.f105851d == null) {
            return;
        }
        b bVar = new b((io.bidmachine.media3.common.a) q9.a.e(b0Var.f72193c), b0Var.f72194d, this.f105814c.a(aVar.f105849b, (f0.b) q9.a.e(aVar.f105851d)));
        int i10 = b0Var.f72192b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f105828q = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f105829r = bVar;
                return;
            }
        }
        this.f105827p = bVar;
    }

    @Override // v9.c
    public /* synthetic */ void e0(c.a aVar, p9.b bVar) {
        v9.b.p(this, aVar, bVar);
    }

    @Override // v9.c
    public /* synthetic */ void f(c.a aVar, s.a aVar2) {
        v9.b.k(this, aVar, aVar2);
    }

    @Override // v9.c
    public /* synthetic */ void f0(c.a aVar, int i10) {
        v9.b.i(this, aVar, i10);
    }

    @Override // v9.c
    public /* synthetic */ void g(c.a aVar, s.a aVar2) {
        v9.b.l(this, aVar, aVar2);
    }

    @Override // v9.c
    public /* synthetic */ void g0(c.a aVar, String str) {
        v9.b.g0(this, aVar, str);
    }

    @Override // v9.c
    public /* synthetic */ void h(c.a aVar, int i10, int i11) {
        v9.b.Y(this, aVar, i10, i11);
    }

    @Override // v9.c
    public /* synthetic */ void h0(c.a aVar, int i10, boolean z10) {
        v9.b.r(this, aVar, i10, z10);
    }

    @Override // v9.c
    public /* synthetic */ void i0(c.a aVar) {
        v9.b.V(this, aVar);
    }

    @Override // v9.c
    public /* synthetic */ void j(c.a aVar, int i10, long j10, long j11) {
        v9.b.m(this, aVar, i10, j10, j11);
    }

    @Override // v9.c
    public /* synthetic */ void j0(c.a aVar) {
        v9.b.t(this, aVar);
    }

    @Override // v9.c
    public /* synthetic */ void k(c.a aVar, Exception exc) {
        v9.b.a(this, aVar, exc);
    }

    @Override // v9.c
    public /* synthetic */ void k0(c.a aVar, u9.b bVar) {
        v9.b.f(this, aVar, bVar);
    }

    @Override // v9.c
    public /* synthetic */ void l(c.a aVar, io.bidmachine.media3.common.a aVar2, u9.c cVar) {
        v9.b.j0(this, aVar, aVar2, cVar);
    }

    @Override // v9.c
    public /* synthetic */ void l0(c.a aVar, a0.b bVar) {
        v9.b.n(this, aVar, bVar);
    }

    @Override // v9.c
    public /* synthetic */ void m(c.a aVar, int i10) {
        v9.b.M(this, aVar, i10);
    }

    @Override // v9.c
    public void m0(c.a aVar, ga.y yVar, ga.b0 b0Var, IOException iOException, boolean z10) {
        this.f105834w = b0Var.f72191a;
    }

    @Override // v9.c
    public /* synthetic */ void n(c.a aVar, Exception exc) {
        v9.b.x(this, aVar, exc);
    }

    @Override // v9.c
    public /* synthetic */ void o(c.a aVar) {
        v9.b.P(this, aVar);
    }

    @Override // v9.c
    public /* synthetic */ void o0(c.a aVar, int i10, int i11, int i12, float f10) {
        v9.b.k0(this, aVar, i10, i11, i12, f10);
    }

    @Override // v9.c
    public /* synthetic */ void p(c.a aVar, Exception exc) {
        v9.b.d0(this, aVar, exc);
    }

    @Override // v9.c
    public /* synthetic */ void p0(c.a aVar) {
        v9.b.y(this, aVar);
    }

    @Override // v9.c
    public /* synthetic */ void q(c.a aVar, int i10) {
        v9.b.w(this, aVar, i10);
    }

    @Override // v9.c
    public /* synthetic */ void q0(c.a aVar, int i10) {
        v9.b.U(this, aVar, i10);
    }

    @Override // v9.c
    public /* synthetic */ void r(c.a aVar, boolean z10) {
        v9.b.W(this, aVar, z10);
    }

    @Override // v9.c
    public /* synthetic */ void r0(c.a aVar, n9.z zVar) {
        v9.b.L(this, aVar, zVar);
    }

    @Override // v9.c
    public /* synthetic */ void s(c.a aVar, n9.k kVar) {
        v9.b.q(this, aVar, kVar);
    }

    @Override // v9.c
    public /* synthetic */ void s0(c.a aVar, ga.y yVar, ga.b0 b0Var) {
        v9.b.D(this, aVar, yVar, b0Var);
    }

    @Override // v9.c
    public /* synthetic */ void t(c.a aVar, int i10) {
        v9.b.N(this, aVar, i10);
    }

    @Override // v9.c
    public /* synthetic */ void t0(c.a aVar, n9.y yVar) {
        v9.b.O(this, aVar, yVar);
    }

    @Override // v9.c
    public /* synthetic */ void u(c.a aVar, boolean z10) {
        v9.b.G(this, aVar, z10);
    }

    @Override // v9.b2.a
    public void u0(c.a aVar, String str, boolean z10) {
        f0.b bVar = aVar.f105851d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f105821j)) {
            F0();
        }
        this.f105819h.remove(str);
        this.f105820i.remove(str);
    }

    @Override // v9.c
    public /* synthetic */ void v(c.a aVar, ga.b0 b0Var) {
        v9.b.c0(this, aVar, b0Var);
    }

    @Override // v9.c
    public /* synthetic */ void v0(c.a aVar, n9.h0 h0Var) {
        v9.b.a0(this, aVar, h0Var);
    }

    @Override // v9.c
    public /* synthetic */ void w(c.a aVar, n9.t tVar) {
        v9.b.I(this, aVar, tVar);
    }

    @Override // v9.c
    public /* synthetic */ void w0(c.a aVar, int i10, long j10) {
        v9.b.z(this, aVar, i10, j10);
    }

    @Override // v9.c
    public /* synthetic */ void x(c.a aVar, ga.y yVar, ga.b0 b0Var, int i10) {
        v9.b.F(this, aVar, yVar, b0Var, i10);
    }

    @Override // v9.c
    public /* synthetic */ void x0(c.a aVar, boolean z10, int i10) {
        v9.b.K(this, aVar, z10, i10);
    }

    @Override // v9.c
    public void y(c.a aVar, n9.y yVar) {
        this.f105826o = yVar;
    }

    @Override // v9.c
    public /* synthetic */ void z(c.a aVar, ga.y yVar, ga.b0 b0Var) {
        v9.b.E(this, aVar, yVar, b0Var);
    }

    @Override // v9.b2.a
    public void n0(c.a aVar, String str) {
    }

    @Override // v9.b2.a
    public void i(c.a aVar, String str, String str2) {
    }
}
