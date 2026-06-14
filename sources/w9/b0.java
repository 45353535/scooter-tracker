package w9;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o9.f;
import q9.o0;
import v9.c2;
import w9.b;
import w9.d0;
import w9.s;
import w9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements s {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static boolean f107580l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Object f107581m0 = new Object();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static ScheduledExecutorService f107582n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static int f107583o0;
    private l A;
    private n9.c B;
    private k C;
    private k D;
    private n9.z E;
    private boolean F;
    private ByteBuffer G;
    private int H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private boolean N;
    private boolean O;
    private long P;
    private float Q;
    private ByteBuffer R;
    private int S;
    private ByteBuffer T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f107584a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private n9.d f107585a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o9.g f107586b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private w9.c f107587b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f107588c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f107589c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v f107590d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f107591d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0 f107592e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f107593e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImmutableList f107594f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f107595f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImmutableList f107596g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f107597g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f107598h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Looper f107599h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque f107600i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private long f107601i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f107602j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private long f107603j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f107604k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Handler f107605k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o f107606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m f107607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f107608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f107609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d f107610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ExoPlayer.a f107611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f107612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c2 f107613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private s.d f107614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private h f107615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h f107616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private o9.e f107617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AudioTrack f107618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private w9.a f107619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w9.b f107620z;

    private static final class b {
        public static long a(AudioTrack audioTrack, h hVar) {
            return hVar.f107635c == 0 ? hVar.d(audioTrack.getBufferSizeInFrames()) : o0.e1(audioTrack.getBufferSizeInFrames(), 1000000L, d0.c(hVar.f107639g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, w9.c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f107664a);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, c2 c2Var) {
            LogSessionId logSessionIdA = c2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface d {
        w9.d a(io.bidmachine.media3.common.a aVar, n9.c cVar);
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f107621a = new d0.a().h();

        int getBufferSizeInBytes(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f107622a = new e0();

        AudioTrack a(s.a aVar, n9.c cVar, int i10);
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f107623a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o9.g f107625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f107626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f107627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f107628f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d f107631i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ExoPlayer.a f107632j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w9.a f107624b = w9.a.f107555c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f107629g = e.f107621a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f f107630h = f.f107622a;

        public g(Context context) {
            this.f107623a = context;
        }

        public b0 j() {
            q9.a.g(!this.f107628f);
            this.f107628f = true;
            if (this.f107625c == null) {
                this.f107625c = new i(new o9.f[0]);
            }
            if (this.f107631i == null) {
                this.f107631i = new w(this.f107623a);
            }
            return new b0(this);
        }

        public g k(boolean z10) {
            this.f107627e = z10;
            return this;
        }

        public g l(boolean z10) {
            this.f107626d = z10;
            return this;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f107633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f107634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f107635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f107636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f107637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f107638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f107639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f107640h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final o9.e f107641i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f107642j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f107643k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f107644l;

        public h(io.bidmachine.media3.common.a aVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, o9.e eVar, boolean z10, boolean z11, boolean z12) {
            this.f107633a = aVar;
            this.f107634b = i10;
            this.f107635c = i11;
            this.f107636d = i12;
            this.f107637e = i13;
            this.f107638f = i14;
            this.f107639g = i15;
            this.f107640h = i16;
            this.f107641i = eVar;
            this.f107642j = z10;
            this.f107643k = z11;
            this.f107644l = z12;
        }

        public s.a a() {
            return new s.a(this.f107639g, this.f107637e, this.f107638f, this.f107644l, this.f107635c == 1, this.f107640h);
        }

        public boolean b(h hVar) {
            return hVar.f107635c == this.f107635c && hVar.f107639g == this.f107639g && hVar.f107637e == this.f107637e && hVar.f107638f == this.f107638f && hVar.f107636d == this.f107636d && hVar.f107642j == this.f107642j && hVar.f107643k == this.f107643k;
        }

        public h c(int i10) {
            return new h(this.f107633a, this.f107634b, this.f107635c, this.f107636d, this.f107637e, this.f107638f, this.f107639g, i10, this.f107641i, this.f107642j, this.f107643k, this.f107644l);
        }

        public long d(long j10) {
            return o0.b1(j10, this.f107637e);
        }

        public long e(long j10) {
            return o0.b1(j10, this.f107633a.F);
        }

        public boolean f() {
            return this.f107635c == 1;
        }
    }

    public static class i implements o9.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o9.f[] f107645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i0 f107646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o9.j f107647c;

        public i(o9.f... fVarArr) {
            this(fVarArr, new i0(), new o9.j());
        }

        @Override // o9.g
        public n9.z a(n9.z zVar) {
            this.f107647c.e(zVar.f95679a);
            this.f107647c.d(zVar.f95680b);
            return zVar;
        }

        @Override // o9.g
        public boolean applySkipSilenceEnabled(boolean z10) {
            this.f107646b.y(z10);
            return z10;
        }

        @Override // o9.g
        public o9.f[] getAudioProcessors() {
            return this.f107645a;
        }

        @Override // o9.g
        public long getMediaDuration(long j10) {
            return this.f107647c.isActive() ? this.f107647c.c(j10) : j10;
        }

        @Override // o9.g
        public long getSkippedOutputFrameCount() {
            return this.f107646b.p();
        }

        public i(o9.f[] fVarArr, i0 i0Var, o9.j jVar) {
            o9.f[] fVarArr2 = new o9.f[fVarArr.length + 2];
            this.f107645a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f107646b = i0Var;
            this.f107647c = jVar;
            fVarArr2[fVarArr.length] = i0Var;
            fVarArr2[fVarArr.length + 1] = jVar;
        }
    }

    public static final class j extends RuntimeException {
        private j(String str) {
            super(str);
        }
    }

    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n9.z f107648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f107649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f107650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f107651d;

        private k(n9.z zVar, long j10, long j11) {
            this.f107648a = zVar;
            this.f107649b = j10;
            this.f107650c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f107652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w9.b f107653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f107654c = new AudioRouting.OnRoutingChangedListener() { // from class: w9.c0
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f107665a.b(audioRouting);
            }
        };

        public l(AudioTrack audioTrack, w9.b bVar) {
            this.f107652a = audioTrack;
            this.f107653b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f107654c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f107654c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f107653b.i(routedDevice);
        }

        public void c() {
            this.f107652a.removeOnRoutingChangedListener(androidx.media3.exoplayer.audio.j0.a(q9.a.e(this.f107654c)));
            this.f107654c = null;
        }
    }

    private static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Exception f107655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f107656b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f107657c = -9223372036854775807L;

        public void a() {
            this.f107655a = null;
            this.f107656b = -9223372036854775807L;
            this.f107657c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f107655a == null) {
                return false;
            }
            return b0.J() || SystemClock.elapsedRealtime() < this.f107657c;
        }

        public void c(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f107655a == null) {
                this.f107655a = exc;
            }
            if (this.f107656b == -9223372036854775807L && !b0.J()) {
                this.f107656b = 200 + jElapsedRealtime;
            }
            long j10 = this.f107656b;
            if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
                this.f107657c = jElapsedRealtime + 50;
                return;
            }
            Exception exc2 = this.f107655a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f107655a;
            a();
            throw exc3;
        }
    }

    private final class n implements u.a {
        private n() {
        }

        @Override // w9.u.a
        public void onInvalidLatency(long j10) {
            q9.u.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // w9.u.a
        public void onPositionAdvancing(long j10) {
            if (b0.this.f107614t != null) {
                b0.this.f107614t.onPositionAdvancing(j10);
            }
        }

        @Override // w9.u.a
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + b0.this.G() + ", " + b0.this.H();
            if (b0.f107580l0) {
                throw new j(str);
            }
            q9.u.h("DefaultAudioSink", str);
        }

        @Override // w9.u.a
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + b0.this.G() + ", " + b0.this.H();
            if (b0.f107580l0) {
                throw new j(str);
            }
            q9.u.h("DefaultAudioSink", str);
        }

        @Override // w9.u.a
        public void onUnderrun(int i10, long j10) {
            if (b0.this.f107614t != null) {
                b0.this.f107614t.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - b0.this.f107593e0);
            }
        }
    }

    private final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f107659a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f107660b;

        class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f107662a;

            a(b0 b0Var) {
                this.f107662a = b0Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(b0.this.f107618x) && b0.this.f107614t != null && b0.this.X) {
                    b0.this.f107614t.onOffloadBufferEmptying();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(b0.this.f107618x)) {
                    b0.this.W = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(b0.this.f107618x) && b0.this.f107614t != null && b0.this.X) {
                    b0.this.f107614t.onOffloadBufferEmptying();
                }
            }
        }

        public o() {
            this.f107660b = new a(b0.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f107659a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.a(handler), this.f107660b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f107660b);
            this.f107659a.removeCallbacksAndMessages(null);
        }
    }

    private AudioTrack A(h hVar) throws s.c {
        try {
            AudioTrack audioTrackZ = z(hVar.a(), this.B, this.Z, hVar.f107633a);
            ExoPlayer.a aVar = this.f107611q;
            if (aVar == null) {
                return audioTrackZ;
            }
            aVar.onOffloadedPlayback(N(audioTrackZ));
            return audioTrackZ;
        } catch (s.c e10) {
            s.d dVar = this.f107614t;
            if (dVar != null) {
                dVar.onAudioSinkError(e10);
            }
            throw e10;
        }
    }

    private AudioTrack B() throws s.c {
        try {
            return A((h) q9.a.e(this.f107616v));
        } catch (s.c e10) {
            h hVar = this.f107616v;
            if (hVar.f107640h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackA = A(hVarC);
                    this.f107616v = hVarC;
                    return audioTrackA;
                } catch (s.c e11) {
                    e10.addSuppressed(e11);
                    O();
                    throw e10;
                }
            }
            O();
            throw e10;
        }
    }

    private void C(long j10) throws Exception {
        b0 b0Var;
        int iG0;
        s.d dVar;
        if (this.T == null || this.f107608n.b()) {
            return;
        }
        int iRemaining = this.T.remaining();
        if (this.f107589c0) {
            q9.a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f107591d0;
            } else {
                this.f107591d0 = j10;
            }
            b0Var = this;
            iG0 = b0Var.h0(this.f107618x, this.T, iRemaining, j10);
        } else {
            b0Var = this;
            iG0 = g0(b0Var.f107618x, b0Var.T, iRemaining);
        }
        b0Var.f107593e0 = SystemClock.elapsedRealtime();
        if (iG0 < 0) {
            if (L(iG0)) {
                if (H() > 0) {
                    z = true;
                } else if (N(b0Var.f107618x)) {
                    O();
                    z = true;
                }
            }
            s.f fVar = new s.f(iG0, b0Var.f107616v.f107633a, z);
            s.d dVar2 = b0Var.f107614t;
            if (dVar2 != null) {
                dVar2.onAudioSinkError(fVar);
            }
            if (!fVar.f107759c || b0Var.f107584a == null) {
                b0Var.f107608n.c(fVar);
                return;
            } else {
                b0Var.f107619y = w9.a.f107555c;
                throw fVar;
            }
        }
        b0Var.f107608n.a();
        if (N(b0Var.f107618x)) {
            if (b0Var.L > 0) {
                b0Var.f107597g0 = false;
            }
            if (b0Var.X && (dVar = b0Var.f107614t) != null && iG0 < iRemaining && !b0Var.f107597g0) {
                dVar.onOffloadBufferFull();
            }
        }
        int i10 = b0Var.f107616v.f107635c;
        if (i10 == 0) {
            b0Var.K += (long) iG0;
        }
        if (iG0 == iRemaining) {
            if (i10 != 0) {
                q9.a.g(b0Var.T == b0Var.R);
                b0Var.L += ((long) b0Var.M) * ((long) b0Var.S);
            }
            b0Var.T = null;
        }
    }

    private boolean D() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f107617w.f()) {
            C(Long.MIN_VALUE);
            return this.T == null;
        }
        this.f107617w.h();
        U(Long.MIN_VALUE);
        return this.f107617w.e() && ((byteBuffer = this.T) == null || !byteBuffer.hasRemaining());
    }

    private static int E(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        q9.a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int F(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return oa.k0.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = oa.i0.m(o0.P(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iB = oa.b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return oa.b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return oa.c.e(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
                    break;
            }
            return oa.b.e(byteBuffer);
        }
        return oa.p.f(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long G() {
        h hVar = this.f107616v;
        return hVar.f107635c == 0 ? this.I / ((long) hVar.f107634b) : this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long H() {
        return this.f107616v.f107635c == 0 ? o0.l(this.K, r0.f107636d) : this.L;
    }

    private void I(long j10) {
        this.f107603j0 += j10;
        if (this.f107605k0 == null) {
            this.f107605k0 = new Handler(Looper.myLooper());
        }
        this.f107605k0.removeCallbacksAndMessages(null);
        this.f107605k0.postDelayed(new Runnable() { // from class: w9.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107564b.Q();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J() {
        boolean z10;
        synchronized (f107581m0) {
            z10 = f107583o0 > 0;
        }
        return z10;
    }

    private boolean K() throws s.c {
        w9.b bVar;
        c2 c2Var;
        if (this.f107607m.b()) {
            return false;
        }
        AudioTrack audioTrackB = B();
        this.f107618x = audioTrackB;
        if (N(audioTrackB)) {
            V(this.f107618x);
            h hVar = this.f107616v;
            if (hVar.f107643k) {
                AudioTrack audioTrack = this.f107618x;
                io.bidmachine.media3.common.a aVar = hVar.f107633a;
                audioTrack.setOffloadDelayPadding(aVar.H, aVar.I);
            }
        }
        int i10 = o0.f98837a;
        if (i10 >= 31 && (c2Var = this.f107613s) != null) {
            c.a(this.f107618x, c2Var);
        }
        this.Z = this.f107618x.getAudioSessionId();
        u uVar = this.f107598h;
        AudioTrack audioTrack2 = this.f107618x;
        h hVar2 = this.f107616v;
        uVar.s(audioTrack2, hVar2.f107635c == 2, hVar2.f107639g, hVar2.f107636d, hVar2.f107640h);
        b0();
        int i11 = this.f107585a0.f95242a;
        if (i11 != 0) {
            this.f107618x.attachAuxEffect(i11);
            this.f107618x.setAuxEffectSendLevel(this.f107585a0.f95243b);
        }
        w9.c cVar = this.f107587b0;
        if (cVar != null && i10 >= 23) {
            b.b(this.f107618x, cVar);
            w9.b bVar2 = this.f107620z;
            if (bVar2 != null) {
                bVar2.i(this.f107587b0.f107664a);
            }
        }
        if (i10 >= 24 && (bVar = this.f107620z) != null) {
            this.A = new l(this.f107618x, bVar);
        }
        this.O = true;
        s.d dVar = this.f107614t;
        if (dVar != null) {
            dVar.b(this.f107616v.a());
        }
        return true;
    }

    private static boolean L(int i10) {
        return (o0.f98837a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean M() {
        return this.f107618x != null;
    }

    private static boolean N(AudioTrack audioTrack) {
        return o0.f98837a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void O() {
        if (this.f107616v.f()) {
            this.f107595f0 = true;
        }
    }

    private ByteBuffer P(ByteBuffer byteBuffer) {
        if (this.f107616v.f107635c == 0) {
            int iF = (int) o0.F(o0.P0(20L), this.f107616v.f107637e);
            long jH = H();
            if (jH < iF) {
                h hVar = this.f107616v;
                return h0.a(byteBuffer, hVar.f107639g, hVar.f107636d, (int) jH, iF);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (this.f107603j0 >= 300000) {
            this.f107614t.onSilenceSkipped();
            this.f107603j0 = 0L;
        }
    }

    private void R() {
        if (this.f107620z == null && this.f107584a != null) {
            this.f107599h0 = Looper.myLooper();
            w9.b bVar = new w9.b(this.f107584a, new b.f() { // from class: w9.y
                @Override // w9.b.f
                public final void a(a aVar) {
                    this.f107808a.S(aVar);
                }
            }, this.B, this.f107587b0);
            this.f107620z = bVar;
            this.f107619y = bVar.g();
        }
        q9.a.e(this.f107619y);
    }

    private void T() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f107598h.g(H());
        if (N(this.f107618x)) {
            this.W = false;
        }
        this.f107618x.stop();
        this.H = 0;
    }

    private void U(long j10) throws Exception {
        C(j10);
        if (this.T != null) {
            return;
        }
        if (!this.f107617w.f()) {
            ByteBuffer byteBuffer = this.R;
            if (byteBuffer != null) {
                a0(byteBuffer);
                C(j10);
                return;
            }
            return;
        }
        while (!this.f107617w.e()) {
            do {
                ByteBuffer byteBufferD = this.f107617w.d();
                if (byteBufferD.hasRemaining()) {
                    a0(byteBufferD);
                    C(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f107617w.i(this.R);
                    }
                }
            } while (this.T == null);
            return;
        }
    }

    private void V(AudioTrack audioTrack) {
        if (this.f107606l == null) {
            this.f107606l = new o();
        }
        this.f107606l.a(audioTrack);
    }

    private static void W(final AudioTrack audioTrack, final s.d dVar, final s.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f107581m0) {
            try {
                if (f107582n0 == null) {
                    f107582n0 = o0.R0("ExoPlayer:AudioTrackReleaseThread");
                }
                f107583o0++;
                f107582n0.schedule(new Runnable() { // from class: w9.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.l(audioTrack, dVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void X() {
        this.I = 0L;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.f107597g0 = false;
        this.M = 0;
        this.D = new k(this.E, 0L, 0L);
        this.P = 0L;
        this.C = null;
        this.f107600i.clear();
        this.R = null;
        this.S = 0;
        this.T = null;
        this.V = false;
        this.U = false;
        this.W = false;
        this.G = null;
        this.H = 0;
        this.f107592e.i();
        c0();
    }

    private void Y(n9.z zVar) {
        k kVar = new k(zVar, -9223372036854775807L, -9223372036854775807L);
        if (M()) {
            this.C = kVar;
        } else {
            this.D = kVar;
        }
    }

    private void Z() {
        if (M()) {
            try {
                this.f107618x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f95679a).setPitch(this.E.f95680b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                q9.u.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            n9.z zVar = new n9.z(this.f107618x.getPlaybackParams().getSpeed(), this.f107618x.getPlaybackParams().getPitch());
            this.E = zVar;
            this.f107598h.t(zVar.f95679a);
        }
    }

    private void a0(ByteBuffer byteBuffer) {
        q9.a.g(this.T == null);
        if (byteBuffer.hasRemaining()) {
            this.T = P(byteBuffer);
        }
    }

    private void b0() {
        if (M()) {
            this.f107618x.setVolume(this.Q);
        }
    }

    private void c0() {
        o9.e eVar = this.f107616v.f107641i;
        this.f107617w = eVar;
        eVar.b();
    }

    private boolean d0() {
        if (this.f107589c0) {
            return false;
        }
        h hVar = this.f107616v;
        return hVar.f107635c == 0 && !e0(hVar.f107633a.G);
    }

    private boolean e0(int i10) {
        return this.f107588c && o0.F0(i10);
    }

    private boolean f0() {
        h hVar = this.f107616v;
        return hVar != null && hVar.f107642j && o0.f98837a >= 23;
    }

    private static int g0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int h0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (o0.f98837a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.G == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.G = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.G.putInt(1431633921);
        }
        if (this.H == 0) {
            this.G.putInt(4, i10);
            this.G.putLong(8, j10 * 1000);
            this.G.position(0);
            this.H = i10;
        }
        int iRemaining = this.G.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.G, iRemaining, 1);
            if (iWrite < 0) {
                this.H = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iG0 = g0(audioTrack, byteBuffer, i10);
        if (iG0 < 0) {
            this.H = 0;
            return iG0;
        }
        this.H -= iG0;
        return iG0;
    }

    public static /* synthetic */ void l(AudioTrack audioTrack, final s.d dVar, Handler handler, final s.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: w9.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(aVar);
                    }
                });
            }
            synchronized (f107581m0) {
                try {
                    int i10 = f107583o0 - 1;
                    f107583o0 = i10;
                    if (i10 == 0) {
                        f107582n0.shutdown();
                        f107582n0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: w9.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(aVar);
                    }
                });
            }
            synchronized (f107581m0) {
                try {
                    int i11 = f107583o0 - 1;
                    f107583o0 = i11;
                    if (i11 == 0) {
                        f107582n0.shutdown();
                        f107582n0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private void w(long j10) {
        n9.z zVarA;
        if (f0()) {
            zVarA = n9.z.f95676d;
        } else {
            zVarA = d0() ? this.f107586b.a(this.E) : n9.z.f95676d;
            this.E = zVarA;
        }
        n9.z zVar = zVarA;
        this.F = d0() ? this.f107586b.applySkipSilenceEnabled(this.F) : false;
        this.f107600i.add(new k(zVar, Math.max(0L, j10), this.f107616v.d(H())));
        c0();
        s.d dVar = this.f107614t;
        if (dVar != null) {
            dVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    private long x(long j10) {
        while (!this.f107600i.isEmpty() && j10 >= ((k) this.f107600i.getFirst()).f107650c) {
            this.D = (k) this.f107600i.remove();
        }
        k kVar = this.D;
        long j11 = j10 - kVar.f107650c;
        long jG0 = o0.g0(j11, kVar.f107648a.f95679a);
        if (!this.f107600i.isEmpty()) {
            k kVar2 = this.D;
            return kVar2.f107649b + jG0 + kVar2.f107651d;
        }
        long mediaDuration = this.f107586b.getMediaDuration(j11);
        k kVar3 = this.D;
        long j12 = kVar3.f107649b + mediaDuration;
        kVar3.f107651d = mediaDuration - jG0;
        return j12;
    }

    private long y(long j10) {
        long skippedOutputFrameCount = this.f107586b.getSkippedOutputFrameCount();
        long jD = j10 + this.f107616v.d(skippedOutputFrameCount);
        long j11 = this.f107601i0;
        if (skippedOutputFrameCount > j11) {
            long jD2 = this.f107616v.d(skippedOutputFrameCount - j11);
            this.f107601i0 = skippedOutputFrameCount;
            I(jD2);
        }
        return jD;
    }

    private AudioTrack z(s.a aVar, n9.c cVar, int i10, io.bidmachine.media3.common.a aVar2) throws s.c {
        try {
            AudioTrack audioTrackA = this.f107612r.a(aVar, cVar, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new s.c(state, aVar.f107747b, aVar.f107748c, aVar.f107746a, aVar2, aVar.f107750e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new s.c(0, aVar.f107747b, aVar.f107748c, aVar.f107746a, aVar2, aVar.f107750e, e10);
        }
    }

    public void S(w9.a aVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f107599h0;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        w9.a aVar2 = this.f107619y;
        if (aVar2 == null || aVar.equals(aVar2)) {
            return;
        }
        this.f107619y = aVar;
        s.d dVar = this.f107614t;
        if (dVar != null) {
            dVar.onAudioCapabilitiesChanged();
        }
    }

    @Override // w9.s
    public boolean a(io.bidmachine.media3.common.a aVar) {
        return h(aVar) != 0;
    }

    @Override // w9.s
    public void b(n9.z zVar) {
        this.E = new n9.z(o0.o(zVar.f95679a, 0.1f, 8.0f), o0.o(zVar.f95680b, 0.1f, 8.0f));
        if (f0()) {
            Z();
        } else {
            Y(zVar);
        }
    }

    @Override // w9.s
    public long c() {
        if (!M()) {
            return -9223372036854775807L;
        }
        if (o0.f98837a >= 23) {
            return b.a(this.f107618x, this.f107616v);
        }
        h hVar = this.f107616v;
        return o0.e1(this.f107616v.f107640h, 1000000L, hVar.f107635c == 0 ? ((long) hVar.f107637e) * ((long) hVar.f107636d) : d0.c(hVar.f107639g), RoundingMode.DOWN);
    }

    @Override // w9.s
    public w9.d d(io.bidmachine.media3.common.a aVar) {
        return this.f107595f0 ? w9.d.f107666d : this.f107610p.a(aVar, this.B);
    }

    @Override // w9.s
    public void disableTunneling() {
        if (this.f107589c0) {
            this.f107589c0 = false;
            flush();
        }
    }

    @Override // w9.s
    public void e(c2 c2Var) {
        this.f107613s = c2Var;
    }

    @Override // w9.s
    public void enableTunnelingV21() {
        q9.a.g(this.Y);
        if (this.f107589c0) {
            return;
        }
        this.f107589c0 = true;
        flush();
    }

    @Override // w9.s
    public void f(q9.h hVar) {
        this.f107598h.u(hVar);
    }

    @Override // w9.s
    public void flush() {
        l lVar;
        if (M()) {
            X();
            if (this.f107598h.i()) {
                this.f107618x.pause();
            }
            if (N(this.f107618x)) {
                ((o) q9.a.e(this.f107606l)).b(this.f107618x);
            }
            s.a aVarA = this.f107616v.a();
            h hVar = this.f107615u;
            if (hVar != null) {
                this.f107616v = hVar;
                this.f107615u = null;
            }
            this.f107598h.q();
            if (o0.f98837a >= 24 && (lVar = this.A) != null) {
                lVar.c();
                this.A = null;
            }
            W(this.f107618x, this.f107614t, aVarA);
            this.f107618x = null;
        }
        this.f107608n.a();
        this.f107607m.a();
        this.f107601i0 = 0L;
        this.f107603j0 = 0L;
        Handler handler = this.f107605k0;
        if (handler != null) {
            ((Handler) q9.a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // w9.s
    public void g(n9.d dVar) {
        if (this.f107585a0.equals(dVar)) {
            return;
        }
        int i10 = dVar.f95242a;
        float f10 = dVar.f95243b;
        AudioTrack audioTrack = this.f107618x;
        if (audioTrack != null) {
            if (this.f107585a0.f95242a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f107618x.setAuxEffectSendLevel(f10);
            }
        }
        this.f107585a0 = dVar;
    }

    @Override // w9.s
    public long getCurrentPositionUs(boolean z10) {
        if (!M() || this.O) {
            return Long.MIN_VALUE;
        }
        return y(x(Math.min(this.f107598h.c(), this.f107616v.d(H()))));
    }

    @Override // w9.s
    public n9.z getPlaybackParameters() {
        return this.E;
    }

    @Override // w9.s
    public int h(io.bidmachine.media3.common.a aVar) {
        R();
        if (!"audio/raw".equals(aVar.f80561o)) {
            return this.f107619y.j(aVar, this.B) ? 2 : 0;
        }
        if (o0.G0(aVar.G)) {
            int i10 = aVar.G;
            return (i10 == 2 || (this.f107588c && i10 == 4)) ? 2 : 1;
        }
        q9.u.h("DefaultAudioSink", "Invalid PCM encoding: " + aVar.G);
        return 0;
    }

    @Override // w9.s
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.R;
        q9.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f107615u != null) {
            if (!D()) {
                return false;
            }
            if (this.f107615u.b(this.f107616v)) {
                this.f107616v = this.f107615u;
                this.f107615u = null;
                AudioTrack audioTrack = this.f107618x;
                if (audioTrack != null && N(audioTrack) && this.f107616v.f107643k) {
                    if (this.f107618x.getPlayState() == 3) {
                        this.f107618x.setOffloadEndOfStream();
                        this.f107598h.a();
                    }
                    AudioTrack audioTrack2 = this.f107618x;
                    io.bidmachine.media3.common.a aVar = this.f107616v.f107633a;
                    audioTrack2.setOffloadDelayPadding(aVar.H, aVar.I);
                    this.f107597g0 = true;
                }
            } else {
                T();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            w(j10);
        }
        if (!M()) {
            try {
                if (!K()) {
                    return false;
                }
            } catch (s.c e10) {
                if (e10.f107754c) {
                    throw e10;
                }
                this.f107607m.c(e10);
                return false;
            }
        }
        this.f107607m.a();
        if (this.O) {
            this.P = Math.max(0L, j10);
            this.N = false;
            this.O = false;
            if (f0()) {
                Z();
            }
            w(j10);
            if (this.X) {
                play();
            }
        }
        if (!this.f107598h.k(H())) {
            return false;
        }
        if (this.R == null) {
            q9.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f107616v;
            if (hVar.f107635c != 0 && this.M == 0) {
                int iF = F(hVar.f107639g, byteBuffer);
                this.M = iF;
                if (iF == 0) {
                    return true;
                }
            }
            if (this.C != null) {
                if (!D()) {
                    return false;
                }
                w(j10);
                this.C = null;
            }
            long jE = this.P + this.f107616v.e(G() - this.f107592e.h());
            if (!this.N && Math.abs(jE - j10) > 200000) {
                s.d dVar = this.f107614t;
                if (dVar != null) {
                    dVar.onAudioSinkError(new s.e(j10, jE));
                }
                this.N = true;
            }
            if (this.N) {
                if (!D()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.P += j11;
                this.N = false;
                w(j10);
                s.d dVar2 = this.f107614t;
                if (dVar2 != null && j11 != 0) {
                    dVar2.onPositionDiscontinuity();
                }
            }
            if (this.f107616v.f107635c == 0) {
                this.I += (long) byteBuffer.remaining();
            } else {
                this.J += ((long) this.M) * ((long) i10);
            }
            this.R = byteBuffer;
            this.S = i10;
        }
        U(j10);
        if (!this.R.hasRemaining()) {
            this.R = null;
            this.S = 0;
            return true;
        }
        if (!this.f107598h.j(H())) {
            return false;
        }
        q9.u.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // w9.s
    public void handleDiscontinuity() {
        this.N = true;
    }

    @Override // w9.s
    public boolean hasPendingData() {
        if (M()) {
            return !(o0.f98837a >= 29 && this.f107618x.isOffloadedPlayback() && this.W) && this.f107598h.h(H());
        }
        return false;
    }

    @Override // w9.s
    public void i(s.d dVar) {
        this.f107614t = dVar;
    }

    @Override // w9.s
    public boolean isEnded() {
        if (M()) {
            return this.U && !hasPendingData();
        }
        return true;
    }

    @Override // w9.s
    public void j(io.bidmachine.media3.common.a aVar, int i10, int[] iArr) throws s.b {
        int i11;
        int i12;
        int iK0;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        o9.e eVar;
        int i15;
        int i16;
        int bufferSizeInBytes;
        R();
        if ("audio/raw".equals(aVar.f80561o)) {
            q9.a.a(o0.G0(aVar.G));
            iK0 = o0.k0(aVar.G, aVar.E);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (e0(aVar.G)) {
                builder.addAll((Iterable) this.f107596g);
            } else {
                builder.addAll((Iterable) this.f107594f);
                builder.add((Object[]) this.f107586b.getAudioProcessors());
            }
            o9.e eVar2 = new o9.e(builder.build());
            if (eVar2.equals(this.f107617w)) {
                eVar2 = this.f107617w;
            }
            this.f107592e.j(aVar.H, aVar.I);
            this.f107590d.h(iArr);
            try {
                f.a aVarA = eVar2.a(new f.a(aVar));
                int i17 = aVarA.f96395c;
                i11 = aVarA.f96393a;
                int iM = o0.M(aVarA.f96394b);
                int iK02 = o0.k0(i17, aVarA.f96394b);
                i12 = 0;
                i13 = i17;
                i14 = iM;
                z11 = this.f107602j;
                eVar = eVar2;
                i15 = iK02;
                z10 = false;
            } catch (f.b e10) {
                throw new s.b(e10, aVar);
            }
        } else {
            o9.e eVar3 = new o9.e(ImmutableList.of());
            i11 = aVar.F;
            w9.d dVarD = this.f107604k != 0 ? d(aVar) : w9.d.f107666d;
            if (this.f107604k == 0 || !dVarD.f107667a) {
                Pair pairH = this.f107619y.h(aVar, this.B);
                if (pairH == null) {
                    throw new s.b("Unable to configure passthrough for: " + aVar, aVar);
                }
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH.second).intValue();
                i12 = 2;
                iK0 = -1;
                z10 = false;
                i13 = iIntValue;
                i14 = iIntValue2;
                z11 = this.f107602j;
                eVar = eVar3;
            } else {
                int iF = n9.w.f((String) q9.a.e(aVar.f80561o), aVar.f80557k);
                int iM2 = o0.M(aVar.E);
                z10 = dVarD.f107668b;
                iK0 = -1;
                eVar = eVar3;
                i13 = iF;
                i14 = iM2;
                z11 = true;
                i12 = 1;
            }
            i15 = iK0;
        }
        if (i13 == 0) {
            throw new s.b("Invalid output encoding (mode=" + i12 + ") for: " + aVar, aVar);
        }
        if (i14 == 0) {
            throw new s.b("Invalid output channel config (mode=" + i12 + ") for: " + aVar, aVar);
        }
        int i18 = aVar.f80556j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(aVar.f80561o) && i18 == -1) {
            i18 = 768000;
        }
        int i19 = i18;
        if (i10 != 0) {
            bufferSizeInBytes = i10;
            i16 = i11;
        } else {
            i16 = i11;
            bufferSizeInBytes = this.f107609o.getBufferSizeInBytes(E(i11, i14, i13), i13, i12, i15 != -1 ? i15 : 1, i16, i19, z11 ? 8.0d : 1.0d);
        }
        this.f107595f0 = false;
        boolean z12 = z10;
        int i20 = i12;
        h hVar = new h(aVar, iK0, i20, i15, i16, i14, i13, bufferSizeInBytes, eVar, z11, z12, this.f107589c0);
        if (M()) {
            this.f107615u = hVar;
        } else {
            this.f107616v = hVar;
        }
    }

    @Override // w9.s
    public void k(n9.c cVar) {
        if (this.B.equals(cVar)) {
            return;
        }
        this.B = cVar;
        if (this.f107589c0) {
            return;
        }
        w9.b bVar = this.f107620z;
        if (bVar != null) {
            bVar.h(cVar);
        }
        flush();
    }

    @Override // w9.s
    public void pause() {
        this.X = false;
        if (M()) {
            if (this.f107598h.p() || N(this.f107618x)) {
                this.f107618x.pause();
            }
        }
    }

    @Override // w9.s
    public void play() {
        this.X = true;
        if (M()) {
            this.f107598h.v();
            this.f107618x.play();
        }
    }

    @Override // w9.s
    public void playToEndOfStream() {
        if (!this.U && M() && D()) {
            T();
            this.U = true;
        }
    }

    @Override // w9.s
    public void release() {
        w9.b bVar = this.f107620z;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // w9.s
    public void reset() {
        flush();
        UnmodifiableIterator it = this.f107594f.iterator();
        while (it.hasNext()) {
            ((o9.f) it.next()).reset();
        }
        UnmodifiableIterator it2 = this.f107596g.iterator();
        while (it2.hasNext()) {
            ((o9.f) it2.next()).reset();
        }
        o9.e eVar = this.f107617w;
        if (eVar != null) {
            eVar.j();
        }
        this.X = false;
        this.f107595f0 = false;
    }

    @Override // w9.s
    public void setAudioSessionId(int i10) {
        if (this.Z != i10) {
            this.Z = i10;
            this.Y = i10 != 0;
            flush();
        }
    }

    @Override // w9.s
    public void setOffloadDelayPadding(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f107618x;
        if (audioTrack == null || !N(audioTrack) || (hVar = this.f107616v) == null || !hVar.f107643k) {
            return;
        }
        this.f107618x.setOffloadDelayPadding(i10, i11);
    }

    @Override // w9.s
    public void setOffloadMode(int i10) {
        q9.a.g(o0.f98837a >= 29);
        this.f107604k = i10;
    }

    @Override // w9.s
    public /* synthetic */ void setOutputStreamOffsetUs(long j10) {
        r.a(this, j10);
    }

    @Override // w9.s
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f107587b0 = audioDeviceInfo == null ? null : new w9.c(audioDeviceInfo);
        w9.b bVar = this.f107620z;
        if (bVar != null) {
            bVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f107618x;
        if (audioTrack != null) {
            b.b(audioTrack, this.f107587b0);
        }
    }

    @Override // w9.s
    public void setSkipSilenceEnabled(boolean z10) {
        this.F = z10;
        Y(f0() ? n9.z.f95676d : this.E);
    }

    @Override // w9.s
    public void setVolume(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            b0();
        }
    }

    private b0(g gVar) {
        Context context = gVar.f107623a;
        this.f107584a = context;
        this.B = n9.c.f95224g;
        this.f107619y = context != null ? null : gVar.f107624b;
        this.f107586b = gVar.f107625c;
        this.f107588c = gVar.f107626d;
        this.f107602j = o0.f98837a >= 23 && gVar.f107627e;
        this.f107604k = 0;
        this.f107609o = gVar.f107629g;
        this.f107610p = (d) q9.a.e(gVar.f107631i);
        this.f107598h = new u(new n());
        v vVar = new v();
        this.f107590d = vVar;
        k0 k0Var = new k0();
        this.f107592e = k0Var;
        this.f107594f = ImmutableList.of((k0) new o9.k(), (k0) vVar, k0Var);
        this.f107596g = ImmutableList.of((k0) new j0(), (k0) vVar, k0Var);
        this.Q = 1.0f;
        this.Z = 0;
        this.f107585a0 = new n9.d(0, 0.0f);
        n9.z zVar = n9.z.f95676d;
        this.D = new k(zVar, 0L, 0L);
        this.E = zVar;
        this.F = false;
        this.f107600i = new ArrayDeque();
        this.f107607m = new m();
        this.f107608n = new m();
        this.f107611q = gVar.f107632j;
        this.f107612r = gVar.f107630h;
    }
}
