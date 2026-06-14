package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.common.collect.ImmutableList;
import com.ironsource.C4240b4;
import ga.e1;
import ga.f0;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.d;
import io.bidmachine.media3.exoplayer.e2;
import io.bidmachine.media3.exoplayer.g2;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.exoplayer.j1;
import io.bidmachine.media3.exoplayer.p2;
import io.bidmachine.media3.exoplayer.r2;
import io.bidmachine.media3.exoplayer.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import n9.a0;
import n9.e0;
import n9.k;
import na.l;
import q9.f;
import q9.t;
import w9.s;

/* JADX INFO: loaded from: classes12.dex */
final class v0 extends n9.e implements ExoPlayer {
    private final d A;
    private final io.bidmachine.media3.exoplayer.d B;
    private final p2 C;
    private final u2 D;
    private final x2 E;
    private final long F;
    private final r2 G;
    private final q9.f H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private u9.m0 N;
    private ga.e1 O;
    private ExoPlayer.c P;
    private boolean Q;
    private a0.b R;
    private n9.t S;
    private n9.t T;
    private io.bidmachine.media3.common.a U;
    private io.bidmachine.media3.common.a V;
    private Object W;
    private Surface X;
    private SurfaceHolder Y;
    private na.l Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f81317a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ja.x f81318b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TextureView f81319b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a0.b f81320c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f81321c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.k f81322d = new q9.k();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f81323d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f81324e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private q9.f0 f81325e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n9.a0 f81326f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private u9.b f81327f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i2[] f81328g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private u9.b f81329g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i2[] f81330h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private n9.c f81331h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ja.w f81332i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f81333i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q9.q f81334j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f81335j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j1.f f81336k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private p9.b f81337k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j1 f81338l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f81339l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final q9.t f81340m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f81341m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArraySet f81342n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f81343n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0.b f81344o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f81345o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f81346p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f81347p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f81348q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private n9.k f81349q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f0.a f81350r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private n9.n0 f81351r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final v9.a f81352s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private n9.t f81353s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Looper f81354t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private f2 f81355t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ka.e f81356u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f81357u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f81358v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f81359v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f81360w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f81361w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f81362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final q9.h f81363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final c f81364z;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        public static /* synthetic */ void a(Context context, boolean z10, v0 v0Var, v9.c2 c2Var) {
            v9.a2 a2VarE0 = v9.a2.E0(context);
            if (a2VarE0 == null) {
                q9.u.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z10) {
                v0Var.t0(a2VarE0);
            }
            c2Var.b(a2VarE0.L0());
        }

        public static void b(final Context context, final v0 v0Var, final boolean z10, final v9.c2 c2Var) {
            v0Var.F0().createHandler(v0Var.J0(), null).post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.w0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.b.a(context, z10, v0Var, c2Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements ma.f0, w9.q, ia.h, ea.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, d.b, p2.b, ExoPlayer.a {
        private c() {
        }

        @Override // ma.f0
        public void a(final n9.n0 n0Var) {
            v0.this.f81351r0 = n0Var;
            v0.this.f81340m.k(25, new t.a() { // from class: io.bidmachine.media3.exoplayer.d1
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).a(n0Var);
                }
            });
        }

        @Override // w9.q
        public void b(s.a aVar) {
            v0.this.f81352s.b(aVar);
        }

        @Override // w9.q
        public void c(s.a aVar) {
            v0.this.f81352s.c(aVar);
        }

        @Override // ma.f0
        public void d(u9.b bVar) {
            v0.this.f81352s.d(bVar);
            v0.this.U = null;
            v0.this.f81327f0 = null;
        }

        @Override // ma.f0
        public void e(io.bidmachine.media3.common.a aVar, u9.c cVar) {
            v0.this.U = aVar;
            v0.this.f81352s.e(aVar, cVar);
        }

        @Override // ea.b
        public void f(final n9.v vVar) {
            v0 v0Var = v0.this;
            v0Var.f81353s0 = v0Var.f81353s0.a().N(vVar).J();
            n9.t tVarW0 = v0.this.w0();
            if (!tVarW0.equals(v0.this.S)) {
                v0.this.S = tVarW0;
                v0.this.f81340m.h(14, new t.a() { // from class: io.bidmachine.media3.exoplayer.y0
                    @Override // q9.t.a
                    public final void invoke(Object obj) {
                        ((a0.d) obj).m(v0.this.S);
                    }
                });
            }
            v0.this.f81340m.h(28, new t.a() { // from class: io.bidmachine.media3.exoplayer.z0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).f(vVar);
                }
            });
            v0.this.f81340m.f();
        }

        @Override // ma.f0
        public void g(u9.b bVar) {
            v0.this.f81327f0 = bVar;
            v0.this.f81352s.g(bVar);
        }

        @Override // ia.h
        public void h(final p9.b bVar) {
            v0.this.f81337k0 = bVar;
            v0.this.f81340m.k(27, new t.a() { // from class: io.bidmachine.media3.exoplayer.x0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).h(bVar);
                }
            });
        }

        @Override // w9.q
        public void i(u9.b bVar) {
            v0.this.f81352s.i(bVar);
            v0.this.V = null;
            v0.this.f81329g0 = null;
        }

        @Override // w9.q
        public void k(u9.b bVar) {
            v0.this.f81329g0 = bVar;
            v0.this.f81352s.k(bVar);
        }

        @Override // w9.q
        public void l(io.bidmachine.media3.common.a aVar, u9.c cVar) {
            v0.this.V = aVar;
            v0.this.f81352s.l(aVar, cVar);
        }

        @Override // io.bidmachine.media3.exoplayer.d.b
        public void onAudioBecomingNoisy() {
            v0.this.j1(false, 3);
        }

        @Override // w9.q
        public void onAudioCodecError(Exception exc) {
            v0.this.f81352s.onAudioCodecError(exc);
        }

        @Override // w9.q
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            v0.this.f81352s.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // w9.q
        public void onAudioDecoderReleased(String str) {
            v0.this.f81352s.onAudioDecoderReleased(str);
        }

        @Override // w9.q
        public void onAudioPositionAdvancing(long j10) {
            v0.this.f81352s.onAudioPositionAdvancing(j10);
        }

        @Override // w9.q
        public void onAudioSinkError(Exception exc) {
            v0.this.f81352s.onAudioSinkError(exc);
        }

        @Override // w9.q
        public void onAudioUnderrun(int i10, long j10, long j11) {
            v0.this.f81352s.onAudioUnderrun(i10, j10, j11);
        }

        @Override // ia.h
        public void onCues(final List list) {
            v0.this.f81340m.k(27, new t.a() { // from class: io.bidmachine.media3.exoplayer.a1
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onCues(list);
                }
            });
        }

        @Override // ma.f0
        public void onDroppedFrames(int i10, long j10) {
            v0.this.f81352s.onDroppedFrames(i10, j10);
        }

        @Override // io.bidmachine.media3.exoplayer.ExoPlayer.a
        public /* synthetic */ void onOffloadedPlayback(boolean z10) {
            u9.u.a(this, z10);
        }

        @Override // ma.f0
        public void onRenderedFirstFrame(Object obj, long j10) {
            v0.this.f81352s.onRenderedFirstFrame(obj, j10);
            if (v0.this.W == obj) {
                v0.this.f81340m.k(26, new t.a() { // from class: u9.b0
                    @Override // q9.t.a
                    public final void invoke(Object obj2) {
                        ((a0.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // w9.q
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (v0.this.f81335j0 == z10) {
                return;
            }
            v0.this.f81335j0 = z10;
            v0.this.f81340m.k(23, new t.a() { // from class: io.bidmachine.media3.exoplayer.e1
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.ExoPlayer.a
        public void onSleepingForOffloadChanged(boolean z10) {
            v0.this.m1();
        }

        @Override // io.bidmachine.media3.exoplayer.p2.b
        public void onStreamTypeChanged(int i10) {
            final n9.k kVarA0 = v0.A0(v0.this.C);
            if (kVarA0.equals(v0.this.f81349q0)) {
                return;
            }
            v0.this.f81349q0 = kVarA0;
            v0.this.f81340m.k(29, new t.a() { // from class: io.bidmachine.media3.exoplayer.c1
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).A(kVarA0);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.p2.b
        public void onStreamVolumeChanged(final int i10, final boolean z10) {
            v0.this.f81340m.k(30, new t.a() { // from class: io.bidmachine.media3.exoplayer.b1
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            v0.this.e1(surfaceTexture);
            v0.this.T0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            v0.this.f1(null);
            v0.this.T0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            v0.this.T0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // ma.f0
        public void onVideoCodecError(Exception exc) {
            v0.this.f81352s.onVideoCodecError(exc);
        }

        @Override // ma.f0
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            v0.this.f81352s.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // ma.f0
        public void onVideoDecoderReleased(String str) {
            v0.this.f81352s.onVideoDecoderReleased(str);
        }

        @Override // ma.f0
        public void onVideoFrameProcessingOffset(long j10, int i10) {
            v0.this.f81352s.onVideoFrameProcessingOffset(j10, i10);
        }

        @Override // na.l.b
        public void onVideoSurfaceCreated(Surface surface) {
            v0.this.f1(surface);
        }

        @Override // na.l.b
        public void onVideoSurfaceDestroyed(Surface surface) {
            v0.this.f1(null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            v0.this.T0(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (v0.this.f81317a0) {
                v0.this.f1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (v0.this.f81317a0) {
                v0.this.f1(null);
            }
            v0.this.T0(0, 0);
        }
    }

    private static final class d implements ma.r, na.a, g2.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ma.r f81366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private na.a f81367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ma.r f81368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private na.a f81369e;

        private d() {
        }

        @Override // ma.r
        public void a(long j10, long j11, io.bidmachine.media3.common.a aVar, MediaFormat mediaFormat) {
            long j12;
            long j13;
            io.bidmachine.media3.common.a aVar2;
            MediaFormat mediaFormat2;
            ma.r rVar = this.f81368d;
            if (rVar != null) {
                rVar.a(j10, j11, aVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                aVar2 = aVar;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                aVar2 = aVar;
                mediaFormat2 = mediaFormat;
            }
            ma.r rVar2 = this.f81366b;
            if (rVar2 != null) {
                rVar2.a(j12, j13, aVar2, mediaFormat2);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.g2.b
        public void handleMessage(int i10, Object obj) {
            if (i10 == 7) {
                this.f81366b = (ma.r) obj;
                return;
            }
            if (i10 == 8) {
                this.f81367c = (na.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            na.l lVar = (na.l) obj;
            if (lVar == null) {
                this.f81368d = null;
                this.f81369e = null;
            } else {
                this.f81368d = lVar.getVideoFrameMetadataListener();
                this.f81369e = lVar.getCameraMotionListener();
            }
        }

        @Override // na.a
        public void onCameraMotion(long j10, float[] fArr) {
            na.a aVar = this.f81369e;
            if (aVar != null) {
                aVar.onCameraMotion(j10, fArr);
            }
            na.a aVar2 = this.f81367c;
            if (aVar2 != null) {
                aVar2.onCameraMotion(j10, fArr);
            }
        }

        @Override // na.a
        public void onCameraMotionReset() {
            na.a aVar = this.f81369e;
            if (aVar != null) {
                aVar.onCameraMotionReset();
            }
            na.a aVar2 = this.f81367c;
            if (aVar2 != null) {
                aVar2.onCameraMotionReset();
            }
        }
    }

    private static final class e implements q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f81370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ga.f0 f81371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n9.e0 f81372c;

        public e(Object obj, ga.a0 a0Var) {
            this.f81370a = obj;
            this.f81371b = a0Var;
            this.f81372c = a0Var.R();
        }

        public void a(n9.e0 e0Var) {
            this.f81372c = e0Var;
        }

        @Override // io.bidmachine.media3.exoplayer.q1
        public n9.e0 getTimeline() {
            return this.f81372c;
        }

        @Override // io.bidmachine.media3.exoplayer.q1
        public Object getUid() {
            return this.f81370a;
        }
    }

    static {
        n9.s.a("media3.exoplayer");
    }

    public v0(ExoPlayer.b bVar, n9.a0 a0Var) {
        Looper looper;
        Looper looper2;
        q9.h hVar;
        try {
            q9.u.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + q9.o0.f98841e + C4240b4.j.f42674e);
            this.f81324e = bVar.f80599a.getApplicationContext();
            this.f81352s = (v9.a) bVar.f80607i.apply(bVar.f80600b);
            this.f81343n0 = bVar.f80609k;
            this.f81331h0 = bVar.f80610l;
            this.f81321c0 = bVar.f80616r;
            this.f81323d0 = bVar.f80617s;
            this.f81335j0 = bVar.f80614p;
            this.F = bVar.A;
            c cVar = new c();
            this.f81364z = cVar;
            this.A = new d();
            Handler handler = new Handler(bVar.f80608j);
            u9.l0 l0Var = (u9.l0) bVar.f80602d.get();
            Handler handler2 = handler;
            i2[] i2VarArrA = l0Var.a(handler2, cVar, cVar, cVar, cVar);
            this.f81328g = i2VarArrA;
            int i10 = 0;
            q9.a.g(i2VarArrA.length > 0);
            this.f81330h = new i2[i2VarArrA.length];
            int i11 = 0;
            while (true) {
                i2[] i2VarArr = this.f81330h;
                if (i11 >= i2VarArr.length) {
                    break;
                }
                i2 i2Var = this.f81328g[i11];
                c cVar2 = this.f81364z;
                int i12 = i10;
                u9.l0 l0Var2 = l0Var;
                Handler handler3 = handler2;
                i2VarArr[i11] = l0Var2.b(i2Var, handler3, cVar2, cVar2, cVar2, cVar2);
                i11++;
                i10 = i12;
                l0Var = l0Var2;
                handler2 = handler3;
            }
            int i13 = i10;
            ja.w wVar = (ja.w) bVar.f80604f.get();
            this.f81332i = wVar;
            this.f81350r = (f0.a) bVar.f80603e.get();
            ka.e eVar = (ka.e) bVar.f80606h.get();
            this.f81356u = eVar;
            this.f81348q = bVar.f80618t;
            this.N = bVar.f80619u;
            this.f81358v = bVar.f80620v;
            this.f81360w = bVar.f80621w;
            this.f81362x = bVar.f80622x;
            this.Q = bVar.B;
            Looper looper3 = bVar.f80608j;
            this.f81354t = looper3;
            q9.h hVar2 = bVar.f80600b;
            this.f81363y = hVar2;
            n9.a0 a0Var2 = a0Var == null ? this : a0Var;
            this.f81326f = a0Var2;
            this.f81340m = new q9.t(looper3, hVar2, new t.b() { // from class: io.bidmachine.media3.exoplayer.a0
                @Override // q9.t.b
                public final void a(Object obj, n9.n nVar) {
                    ((a0.d) obj).D(this.f80634a.f81326f, new a0.c(nVar));
                }
            });
            this.f81342n = new CopyOnWriteArraySet();
            this.f81346p = new ArrayList();
            this.O = new e1.a(i13);
            this.P = ExoPlayer.c.f80625b;
            i2[] i2VarArr2 = this.f81328g;
            ja.x xVar = new ja.x(new u9.k0[i2VarArr2.length], new ja.r[i2VarArr2.length], n9.i0.f95401b, null);
            this.f81318b = xVar;
            this.f81344o = new e0.b();
            a0.b bVarE = new a0.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, wVar.h()).d(23, bVar.f80615q).d(25, bVar.f80615q).d(33, bVar.f80615q).d(26, bVar.f80615q).d(34, bVar.f80615q).e();
            this.f81320c = bVarE;
            this.R = new a0.b.a().b(bVarE).a(4).a(10).e();
            this.f81334j = hVar2.createHandler(looper3, null);
            j1.f fVar = new j1.f() { // from class: io.bidmachine.media3.exoplayer.b0
                @Override // io.bidmachine.media3.exoplayer.j1.f
                public final void a(j1.e eVar2) {
                    v0 v0Var = this.f80641a;
                    v0Var.f81334j.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            v0Var.O0(eVar2);
                        }
                    });
                }
            };
            this.f81336k = fVar;
            this.f81355t0 = f2.k(xVar);
            this.f81352s.C(a0Var2, looper3);
            v9.c2 c2Var = new v9.c2(bVar.G);
            j1 j1Var = new j1(this.f81324e, this.f81328g, this.f81330h, wVar, xVar, (k1) bVar.f80605g.get(), eVar, this.I, this.J, this.f81352s, this.N, bVar.f80623y, bVar.f80624z, this.Q, bVar.H, looper3, hVar2, fVar, c2Var, bVar.D, this.P);
            this.f81338l = j1Var;
            Looper looperG = j1Var.G();
            this.f81333i0 = 1.0f;
            this.I = 0;
            n9.t tVar = n9.t.I;
            this.S = tVar;
            this.T = tVar;
            this.f81353s0 = tVar;
            this.f81357u0 = -1;
            this.f81337k0 = p9.b.f98111c;
            this.f81339l0 = true;
            c(this.f81352s);
            eVar.b(new Handler(looper3), this.f81352s);
            u0(this.f81364z);
            long j10 = bVar.f80601c;
            if (j10 > 0) {
                j1Var.A(j10);
            }
            if (q9.o0.f98837a >= 31) {
                b.b(this.f81324e, this, bVar.C, c2Var);
            }
            q9.f fVar2 = new q9.f(0, looperG, looper3, hVar2, new f.a() { // from class: io.bidmachine.media3.exoplayer.c0
                @Override // q9.f.a
                public final void a(Object obj, Object obj2) {
                    this.f80649a.U0(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.H = fVar2;
            fVar2.e(new Runnable() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // java.lang.Runnable
                public final void run() {
                    v0 v0Var = this.f80661b;
                    v0Var.H.f(Integer.valueOf(q9.o0.J(v0Var.f81324e)));
                }
            });
            io.bidmachine.media3.exoplayer.d dVar = new io.bidmachine.media3.exoplayer.d(bVar.f80599a, looperG, bVar.f80608j, this.f81364z, hVar2);
            this.B = dVar;
            dVar.d(bVar.f80613o);
            if (bVar.F) {
                r2 r2Var = bVar.I;
                this.G = r2Var;
                looper = looper3;
                r2Var.b(new r2.a() { // from class: io.bidmachine.media3.exoplayer.f0
                    @Override // io.bidmachine.media3.exoplayer.r2.a
                    public final void a(boolean z10) {
                        this.f80824a.V0(z10);
                    }
                }, this.f81324e, looper, looperG, hVar2);
                looperG = looperG;
            } else {
                looper = looper3;
                this.G = null;
            }
            if (bVar.f80615q) {
                Looper looper4 = looperG;
                looper2 = looper4;
                hVar = hVar2;
                this.C = new p2(bVar.f80599a, this.f81364z, this.f81331h0.b(), looper4, looper, hVar2);
            } else {
                looper2 = looperG;
                hVar = hVar2;
                this.C = null;
            }
            u2 u2Var = new u2(bVar.f80599a, looper2, hVar);
            this.D = u2Var;
            u2Var.c(bVar.f80612n != 0);
            x2 x2Var = new x2(bVar.f80599a, looper2, hVar);
            this.E = x2Var;
            x2Var.c(bVar.f80612n == 2);
            this.f81349q0 = n9.k.f95415e;
            this.f81351r0 = n9.n0.f95432e;
            this.f81325e0 = q9.f0.f98785c;
            j1Var.V0(this.f81331h0, bVar.f80611m);
            Z0(1, 3, this.f81331h0);
            Z0(2, 4, Integer.valueOf(this.f81321c0));
            Z0(2, 5, Integer.valueOf(this.f81323d0));
            Z0(1, 9, Boolean.valueOf(this.f81335j0));
            Z0(2, 7, this.A);
            Z0(6, 8, this.A);
            a1(16, Integer.valueOf(this.f81343n0));
            this.f81322d.e();
        } catch (Throwable th2) {
            this.f81322d.e();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n9.k A0(p2 p2Var) {
        return new k.b(0).g(p2Var != null ? p2Var.j() : 0).f(p2Var != null ? p2Var.i() : 0).e();
    }

    private n9.e0 B0() {
        return new h2(this.f81346p, this.O);
    }

    private List C0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f81350r.e((n9.r) list.get(i10)));
        }
        return arrayList;
    }

    private g2 D0(g2.b bVar) {
        int iI0 = I0(this.f81355t0);
        j1 j1Var = this.f81338l;
        n9.e0 e0Var = this.f81355t0.f80828a;
        if (iI0 == -1) {
            iI0 = 0;
        }
        return new g2(j1Var, bVar, e0Var, iI0, this.f81363y, j1Var.G());
    }

    private Pair E0(f2 f2Var, f2 f2Var2, boolean z10, int i10, boolean z11, boolean z12) {
        n9.e0 e0Var = f2Var2.f80828a;
        n9.e0 e0Var2 = f2Var.f80828a;
        if (e0Var2.q() && e0Var.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (e0Var2.q() != e0Var.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (e0Var.n(e0Var.h(f2Var2.f80829b.f72270a, this.f81344o).f95256c, this.f95244a).f95271a.equals(e0Var2.n(e0Var2.h(f2Var.f80829b.f72270a, this.f81344o).f95256c, this.f95244a).f95271a)) {
            return (z10 && i10 == 0 && f2Var2.f80829b.f72273d < f2Var.f80829b.f72273d) ? new Pair(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i11));
    }

    private long G0(f2 f2Var) {
        if (!f2Var.f80829b.b()) {
            return q9.o0.q1(H0(f2Var));
        }
        f2Var.f80828a.h(f2Var.f80829b.f72270a, this.f81344o);
        return f2Var.f80830c == -9223372036854775807L ? f2Var.f80828a.n(I0(f2Var), this.f95244a).b() : this.f81344o.m() + q9.o0.q1(f2Var.f80830c);
    }

    public static /* synthetic */ void H(int i10, a0.e eVar, a0.e eVar2, a0.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.u(eVar, eVar2, i10);
    }

    private long H0(f2 f2Var) {
        if (f2Var.f80828a.q()) {
            return q9.o0.P0(this.f81361w0);
        }
        long jM = f2Var.f80843p ? f2Var.m() : f2Var.f80846s;
        return f2Var.f80829b.b() ? jM : W0(f2Var.f80828a, f2Var.f80829b, jM);
    }

    private int I0(f2 f2Var) {
        return f2Var.f80828a.q() ? this.f81357u0 : f2Var.f80828a.h(f2Var.f80829b.f72270a, this.f81344o).f95256c;
    }

    private a0.e L0(long j10) {
        Object obj;
        int iB;
        n9.r rVar;
        Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.f81355t0.f80828a.q()) {
            obj = null;
            iB = -1;
            rVar = null;
            obj2 = null;
        } else {
            f2 f2Var = this.f81355t0;
            Object obj3 = f2Var.f80829b.f72270a;
            f2Var.f80828a.h(obj3, this.f81344o);
            iB = this.f81355t0.f80828a.b(obj3);
            obj2 = obj3;
            obj = this.f81355t0.f80828a.n(currentMediaItemIndex, this.f95244a).f95271a;
            rVar = this.f95244a.f95273c;
        }
        int i10 = iB;
        long jQ1 = q9.o0.q1(j10);
        long jQ12 = this.f81355t0.f80829b.b() ? q9.o0.q1(N0(this.f81355t0)) : jQ1;
        f0.b bVar = this.f81355t0.f80829b;
        return new a0.e(obj, currentMediaItemIndex, rVar, obj2, i10, jQ1, jQ12, bVar.f72271b, bVar.f72272c);
    }

    private a0.e M0(int i10, f2 f2Var, int i11) {
        int i12;
        Object obj;
        n9.r rVar;
        Object obj2;
        int i13;
        long jN0;
        long jN02;
        e0.b bVar = new e0.b();
        if (f2Var.f80828a.q()) {
            i12 = i11;
            obj = null;
            rVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = f2Var.f80829b.f72270a;
            f2Var.f80828a.h(obj3, bVar);
            int i14 = bVar.f95256c;
            int iB = f2Var.f80828a.b(obj3);
            Object obj4 = f2Var.f80828a.n(i14, this.f95244a).f95271a;
            rVar = this.f95244a.f95273c;
            obj2 = obj3;
            i13 = iB;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (f2Var.f80829b.b()) {
                f0.b bVar2 = f2Var.f80829b;
                jN0 = bVar.b(bVar2.f72271b, bVar2.f72272c);
                jN02 = N0(f2Var);
            } else {
                jN0 = f2Var.f80829b.f72274e != -1 ? N0(this.f81355t0) : bVar.f95258e + bVar.f95257d;
                jN02 = jN0;
            }
        } else if (f2Var.f80829b.b()) {
            jN0 = f2Var.f80846s;
            jN02 = N0(f2Var);
        } else {
            jN0 = bVar.f95258e + f2Var.f80846s;
            jN02 = jN0;
        }
        long jQ1 = q9.o0.q1(jN0);
        long jQ12 = q9.o0.q1(jN02);
        f0.b bVar3 = f2Var.f80829b;
        return new a0.e(obj, i12, rVar, obj2, i13, jQ1, jQ12, bVar3.f72271b, bVar3.f72272c);
    }

    private static long N0(f2 f2Var) {
        e0.c cVar = new e0.c();
        e0.b bVar = new e0.b();
        f2Var.f80828a.h(f2Var.f80829b.f72270a, bVar);
        return f2Var.f80830c == -9223372036854775807L ? f2Var.f80828a.n(bVar.f95256c, cVar).c() : bVar.n() + f2Var.f80830c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(j1.e eVar) {
        boolean z10;
        long jW0;
        int i10 = this.K - eVar.f81147c;
        this.K = i10;
        boolean z11 = true;
        if (eVar.f81148d) {
            this.L = eVar.f81149e;
            this.M = true;
        }
        if (i10 == 0) {
            n9.e0 e0Var = eVar.f81146b.f80828a;
            if (!this.f81355t0.f80828a.q() && e0Var.q()) {
                this.f81357u0 = -1;
                this.f81361w0 = 0L;
                this.f81359v0 = 0;
            }
            if (!e0Var.q()) {
                List listF = ((h2) e0Var).F();
                q9.a.g(listF.size() == this.f81346p.size());
                for (int i11 = 0; i11 < listF.size(); i11++) {
                    ((e) this.f81346p.get(i11)).a((n9.e0) listF.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.M) {
                if (eVar.f81146b.f80829b.equals(this.f81355t0.f80829b) && eVar.f81146b.f80831d == this.f81355t0.f80846s) {
                    z11 = false;
                }
                if (z11) {
                    if (e0Var.q() || eVar.f81146b.f80829b.b()) {
                        jW0 = eVar.f81146b.f80831d;
                    } else {
                        f2 f2Var = eVar.f81146b;
                        jW0 = W0(e0Var, f2Var.f80829b, f2Var.f80831d);
                    }
                    j10 = jW0;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.M = false;
            k1(eVar.f81146b, 1, z10, this.L, j10, -1, false);
        }
    }

    private static f2 Q0(f2 f2Var, int i10) {
        f2 f2VarH = f2Var.h(i10);
        return (i10 == 1 || i10 == 4) ? f2VarH.b(false) : f2VarH;
    }

    private f2 R0(f2 f2Var, n9.e0 e0Var, Pair pair) {
        q9.a.a(e0Var.q() || pair != null);
        n9.e0 e0Var2 = f2Var.f80828a;
        long jG0 = G0(f2Var);
        f2 f2VarJ = f2Var.j(e0Var);
        if (e0Var.q()) {
            f0.b bVarL = f2.l();
            long jP0 = q9.o0.P0(this.f81361w0);
            f2 f2VarC = f2VarJ.d(bVarL, jP0, jP0, jP0, 0L, ga.m1.f72378d, this.f81318b, ImmutableList.of()).c(bVarL);
            f2VarC.f80844q = f2VarC.f80846s;
            return f2VarC;
        }
        Object obj = f2VarJ.f80829b.f72270a;
        boolean zEquals = obj.equals(((Pair) q9.o0.i(pair)).first);
        f0.b bVar = !zEquals ? new f0.b(pair.first) : f2VarJ.f80829b;
        long jLongValue = ((Long) pair.second).longValue();
        long jP02 = q9.o0.P0(jG0);
        if (!e0Var2.q()) {
            jP02 -= e0Var2.h(obj, this.f81344o).n();
        }
        if (!zEquals || jLongValue < jP02) {
            f0.b bVar2 = bVar;
            q9.a.g(!bVar2.b());
            f2 f2VarC2 = f2VarJ.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? ga.m1.f72378d : f2VarJ.f80835h, !zEquals ? this.f81318b : f2VarJ.f80836i, !zEquals ? ImmutableList.of() : f2VarJ.f80837j).c(bVar2);
            f2VarC2.f80844q = jLongValue;
            return f2VarC2;
        }
        if (jLongValue != jP02) {
            f0.b bVar3 = bVar;
            q9.a.g(!bVar3.b());
            long jMax = Math.max(0L, f2VarJ.f80845r - (jLongValue - jP02));
            long j10 = f2VarJ.f80844q;
            if (f2VarJ.f80838k.equals(f2VarJ.f80829b)) {
                j10 = jLongValue + jMax;
            }
            f2 f2VarD = f2VarJ.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, f2VarJ.f80835h, f2VarJ.f80836i, f2VarJ.f80837j);
            f2VarD.f80844q = j10;
            return f2VarD;
        }
        int iB = e0Var.b(f2VarJ.f80838k.f72270a);
        if (iB != -1 && e0Var.f(iB, this.f81344o).f95256c == e0Var.h(bVar.f72270a, this.f81344o).f95256c) {
            return f2VarJ;
        }
        e0Var.h(bVar.f72270a, this.f81344o);
        long jB = bVar.b() ? this.f81344o.b(bVar.f72271b, bVar.f72272c) : this.f81344o.f95257d;
        f0.b bVar4 = bVar;
        f2 f2VarC3 = f2VarJ.d(bVar4, f2VarJ.f80846s, f2VarJ.f80846s, f2VarJ.f80831d, jB - f2VarJ.f80846s, f2VarJ.f80835h, f2VarJ.f80836i, f2VarJ.f80837j).c(bVar4);
        f2VarC3.f80844q = jB;
        return f2VarC3;
    }

    private Pair S0(n9.e0 e0Var, int i10, long j10) {
        if (e0Var.q()) {
            this.f81357u0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f81361w0 = j10;
            this.f81359v0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= e0Var.p()) {
            i10 = e0Var.a(this.J);
            j10 = e0Var.n(i10, this.f95244a).b();
        }
        return e0Var.j(this.f95244a, this.f81344o, i10, q9.o0.P0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(final int i10, final int i11) {
        if (i10 == this.f81325e0.b() && i11 == this.f81325e0.a()) {
            return;
        }
        this.f81325e0 = new q9.f0(i10, i11);
        this.f81340m.k(24, new t.a() { // from class: io.bidmachine.media3.exoplayer.t
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((a0.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        Z0(2, 14, new q9.f0(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0(int i10, final int i11) {
        n1();
        Z0(1, 10, Integer.valueOf(i11));
        Z0(2, 10, Integer.valueOf(i11));
        this.f81340m.k(21, new t.a() { // from class: io.bidmachine.media3.exoplayer.k0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((a0.d) obj).onAudioSessionIdChanged(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(boolean z10) {
        if (this.f81347p0) {
            return;
        }
        if (!z10) {
            j1(this.f81355t0.f80839l, 1);
            return;
        }
        f2 f2Var = this.f81355t0;
        if (f2Var.f80841n == 3) {
            j1(f2Var.f80839l, 1);
        }
    }

    private long W0(n9.e0 e0Var, f0.b bVar, long j10) {
        e0Var.h(bVar.f72270a, this.f81344o);
        return j10 + this.f81344o.n();
    }

    private void X0(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f81346p.remove(i12);
        }
        this.O = this.O.cloneAndRemove(i10, i11);
    }

    private void Y0() {
        if (this.Z != null) {
            D0(this.A).m(10000).l(null).k();
            this.Z.g(this.f81364z);
            this.Z = null;
        }
        TextureView textureView = this.f81319b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f81364z) {
                q9.u.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f81319b0.setSurfaceTextureListener(null);
            }
            this.f81319b0 = null;
        }
        SurfaceHolder surfaceHolder = this.Y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f81364z);
            this.Y = null;
        }
    }

    private void Z0(int i10, int i11, Object obj) {
        for (i2 i2Var : this.f81328g) {
            if (i10 == -1 || i2Var.getTrackType() == i10) {
                D0(i2Var).m(i11).l(obj).k();
            }
        }
        for (i2 i2Var2 : this.f81330h) {
            if (i2Var2 != null && (i10 == -1 || i2Var2.getTrackType() == i10)) {
                D0(i2Var2).m(i11).l(obj).k();
            }
        }
    }

    private void a1(int i10, Object obj) {
        Z0(-1, i10, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c1(java.util.List r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r1 = r16
            io.bidmachine.media3.exoplayer.f2 r2 = r14.f81355t0
            int r2 = r14.I0(r2)
            long r3 = r14.getCurrentPosition()
            int r5 = r14.K
            r6 = 1
            int r5 = r5 + r6
            r14.K = r5
            java.util.List r5 = r14.f81346p
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L24
            java.util.List r5 = r14.f81346p
            int r5 = r5.size()
            r14.X0(r7, r5)
        L24:
            java.util.List r9 = r14.v0(r7, r15)
            n9.e0 r5 = r14.B0()
            boolean r8 = r5.q()
            if (r8 != 0) goto L38
            int r8 = r5.p()
            if (r1 >= r8) goto L3b
        L38:
            r10 = r17
            goto L43
        L3b:
            n9.p r2 = new n9.p
            r10 = r17
            r2.<init>(r5, r1, r10)
            throw r2
        L43:
            r8 = -1
            if (r19 == 0) goto L53
            boolean r1 = r14.J
            int r1 = r5.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L51:
            r10 = r1
            goto L5a
        L53:
            if (r1 != r8) goto L58
            r10 = r2
            r2 = r3
            goto L5a
        L58:
            r2 = r10
            goto L51
        L5a:
            io.bidmachine.media3.exoplayer.f2 r1 = r14.f81355t0
            android.util.Pair r4 = r14.S0(r5, r10, r2)
            io.bidmachine.media3.exoplayer.f2 r1 = r14.R0(r1, r5, r4)
            int r4 = r1.f80832e
            if (r10 == r8) goto L7a
            if (r4 == r6) goto L7a
            boolean r4 = r5.q()
            if (r4 != 0) goto L79
            int r4 = r5.p()
            if (r10 < r4) goto L77
            goto L79
        L77:
            r4 = 2
            goto L7a
        L79:
            r4 = 4
        L7a:
            io.bidmachine.media3.exoplayer.f2 r1 = Q0(r1, r4)
            io.bidmachine.media3.exoplayer.j1 r8 = r14.f81338l
            long r11 = q9.o0.P0(r2)
            ga.e1 r13 = r14.O
            r8.a1(r9, r10, r11, r13)
            io.bidmachine.media3.exoplayer.f2 r2 = r14.f81355t0
            ga.f0$b r2 = r2.f80829b
            java.lang.Object r2 = r2.f72270a
            ga.f0$b r3 = r1.f80829b
            java.lang.Object r3 = r3.f72270a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La5
            io.bidmachine.media3.exoplayer.f2 r2 = r14.f81355t0
            n9.e0 r2 = r2.f80828a
            boolean r2 = r2.q()
            if (r2 != 0) goto La5
            r3 = r6
            goto La6
        La5:
            r3 = r7
        La6:
            long r5 = r14.H0(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r14
            r0.k1(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.v0.c1(java.util.List, int, long, boolean):void");
    }

    private void d1(SurfaceHolder surfaceHolder) {
        this.f81317a0 = false;
        this.Y = surfaceHolder;
        surfaceHolder.addCallback(this.f81364z);
        Surface surface = this.Y.getSurface();
        if (surface == null || !surface.isValid()) {
            T0(0, 0);
        } else {
            Rect surfaceFrame = this.Y.getSurfaceFrame();
            T0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        f1(surface);
        this.X = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(Object obj) {
        Object obj2 = this.W;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zP1 = this.f81338l.p1(obj, z10 ? this.F : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.W;
            Surface surface = this.X;
            if (obj3 == surface) {
                surface.release();
                this.X = null;
            }
        }
        this.W = obj;
        if (zP1) {
            return;
        }
        h1(s.d(new u9.c0(3), 1003));
    }

    private void h1(s sVar) {
        f2 f2Var = this.f81355t0;
        f2 f2VarC = f2Var.c(f2Var.f80829b);
        f2VarC.f80844q = f2VarC.f80846s;
        f2VarC.f80845r = 0L;
        f2 f2VarQ0 = Q0(f2VarC, 1);
        if (sVar != null) {
            f2VarQ0 = f2VarQ0.f(sVar);
        }
        this.K++;
        this.f81338l.z1();
        k1(f2VarQ0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void i1() {
        a0.b bVar = this.R;
        a0.b bVarO = q9.o0.O(this.f81326f, this.f81320c);
        this.R = bVarO;
        if (bVarO.equals(bVar)) {
            return;
        }
        this.f81340m.h(13, new t.a() { // from class: io.bidmachine.media3.exoplayer.i0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((a0.d) obj).n(this.f81089a.R);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(boolean z10, int i10) {
        int iZ0 = z0(z10);
        f2 f2VarA = this.f81355t0;
        if (f2VarA.f80839l == z10 && f2VarA.f80841n == iZ0 && f2VarA.f80840m == i10) {
            return;
        }
        this.K++;
        if (f2VarA.f80843p) {
            f2VarA = f2VarA.a();
        }
        f2 f2VarE = f2VarA.e(z10, i10, iZ0);
        this.f81338l.d1(z10, i10, iZ0);
        k1(f2VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void k1(final f2 f2Var, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        f2 f2Var2 = this.f81355t0;
        this.f81355t0 = f2Var;
        boolean zEquals = f2Var2.f80828a.equals(f2Var.f80828a);
        Pair pairE0 = E0(f2Var, f2Var2, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairE0.first).booleanValue();
        final int iIntValue = ((Integer) pairE0.second).intValue();
        if (zBooleanValue) {
            rVar = f2Var.f80828a.q() ? null : f2Var.f80828a.n(f2Var.f80828a.h(f2Var.f80829b.f72270a, this.f81344o).f95256c, this.f95244a).f95273c;
            this.f81353s0 = n9.t.I;
        }
        if (zBooleanValue || !f2Var2.f80837j.equals(f2Var.f80837j)) {
            this.f81353s0 = this.f81353s0.a().M(f2Var.f80837j).J();
        }
        n9.t tVarW0 = w0();
        boolean zEquals2 = tVarW0.equals(this.S);
        this.S = tVarW0;
        boolean z12 = f2Var2.f80839l != f2Var.f80839l;
        boolean z13 = f2Var2.f80832e != f2Var.f80832e;
        if (z13 || z12) {
            m1();
        }
        boolean z14 = f2Var2.f80834g;
        boolean z15 = f2Var.f80834g;
        boolean z16 = z14 != z15;
        if (z16) {
            l1(z15);
        }
        if (!zEquals) {
            this.f81340m.h(0, new t.a() { // from class: io.bidmachine.media3.exoplayer.n0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    a0.d dVar = (a0.d) obj;
                    dVar.x(f2Var.f80828a, i10);
                }
            });
        }
        if (z10) {
            final a0.e eVarM0 = M0(i11, f2Var2, i12);
            final a0.e eVarL0 = L0(j10);
            this.f81340m.h(11, new t.a() { // from class: io.bidmachine.media3.exoplayer.s0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    v0.H(i11, eVarM0, eVarL0, (a0.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f81340m.h(1, new t.a() { // from class: io.bidmachine.media3.exoplayer.t0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).t(rVar, iIntValue);
                }
            });
        }
        if (f2Var2.f80833f != f2Var.f80833f) {
            this.f81340m.h(10, new t.a() { // from class: io.bidmachine.media3.exoplayer.u0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).F(f2Var.f80833f);
                }
            });
            if (f2Var.f80833f != null) {
                this.f81340m.h(10, new t.a() { // from class: io.bidmachine.media3.exoplayer.u
                    @Override // q9.t.a
                    public final void invoke(Object obj) {
                        ((a0.d) obj).y(f2Var.f80833f);
                    }
                });
            }
        }
        ja.x xVar = f2Var2.f80836i;
        ja.x xVar2 = f2Var.f80836i;
        if (xVar != xVar2) {
            this.f81332i.i(xVar2.f85699e);
            this.f81340m.h(2, new t.a() { // from class: io.bidmachine.media3.exoplayer.v
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).r(f2Var.f80836i.f85698d);
                }
            });
        }
        if (!zEquals2) {
            final n9.t tVar = this.S;
            this.f81340m.h(14, new t.a() { // from class: io.bidmachine.media3.exoplayer.w
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).m(tVar);
                }
            });
        }
        if (z16) {
            this.f81340m.h(3, new t.a() { // from class: io.bidmachine.media3.exoplayer.x
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    v0.z(f2Var, (a0.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f81340m.h(-1, new t.a() { // from class: io.bidmachine.media3.exoplayer.y
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    f2 f2Var3 = f2Var;
                    ((a0.d) obj).onPlayerStateChanged(f2Var3.f80839l, f2Var3.f80832e);
                }
            });
        }
        if (z13) {
            this.f81340m.h(4, new t.a() { // from class: io.bidmachine.media3.exoplayer.z
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onPlaybackStateChanged(f2Var.f80832e);
                }
            });
        }
        if (z12 || f2Var2.f80840m != f2Var.f80840m) {
            this.f81340m.h(5, new t.a() { // from class: io.bidmachine.media3.exoplayer.o0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    f2 f2Var3 = f2Var;
                    ((a0.d) obj).onPlayWhenReadyChanged(f2Var3.f80839l, f2Var3.f80840m);
                }
            });
        }
        if (f2Var2.f80841n != f2Var.f80841n) {
            this.f81340m.h(6, new t.a() { // from class: io.bidmachine.media3.exoplayer.p0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onPlaybackSuppressionReasonChanged(f2Var.f80841n);
                }
            });
        }
        if (f2Var2.n() != f2Var.n()) {
            this.f81340m.h(7, new t.a() { // from class: io.bidmachine.media3.exoplayer.q0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onIsPlayingChanged(f2Var.n());
                }
            });
        }
        if (!f2Var2.f80842o.equals(f2Var.f80842o)) {
            this.f81340m.h(12, new t.a() { // from class: io.bidmachine.media3.exoplayer.r0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).j(f2Var.f80842o);
                }
            });
        }
        i1();
        this.f81340m.f();
        if (f2Var2.f80843p != f2Var.f80843p) {
            Iterator it = this.f81342n.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.a) it.next()).onSleepingForOffloadChanged(f2Var.f80843p);
            }
        }
    }

    private void l1(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.D.d(getPlayWhenReady() && !P0());
                this.E.d(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.D.d(false);
        this.E.d(false);
    }

    private void n1() {
        this.f81322d.b();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String strG = q9.o0.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.f81339l0) {
                throw new IllegalStateException(strG);
            }
            q9.u.i("ExoPlayerImpl", strG, this.f81341m0 ? null : new IllegalStateException());
            this.f81341m0 = true;
        }
    }

    private List v0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            e2.c cVar = new e2.c((ga.f0) list.get(i11), this.f81348q);
            arrayList.add(cVar);
            this.f81346p.add(i11 + i10, new e(cVar.f80819b, cVar.f80818a));
        }
        this.O = this.O.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n9.t w0() {
        n9.e0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return this.f81353s0;
        }
        return this.f81353s0.a().L(currentTimeline.n(getCurrentMediaItemIndex(), this.f95244a).f95273c.f95458e).J();
    }

    public static /* synthetic */ void z(f2 f2Var, a0.d dVar) {
        dVar.onLoadingChanged(f2Var.f80834g);
        dVar.onIsLoadingChanged(f2Var.f80834g);
    }

    private int z0(boolean z10) {
        r2 r2Var = this.G;
        if (r2Var == null || r2Var.a()) {
            return (this.f81355t0.f80841n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    public q9.h F0() {
        return this.f81363y;
    }

    public Looper J0() {
        return this.f81338l.G();
    }

    @Override // n9.a0
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public s getPlayerError() {
        n1();
        return this.f81355t0.f80833f;
    }

    public boolean P0() {
        n1();
        return this.f81355t0.f80843p;
    }

    @Override // n9.a0
    public void b(n9.z zVar) {
        n1();
        if (zVar == null) {
            zVar = n9.z.f95676d;
        }
        if (this.f81355t0.f80842o.equals(zVar)) {
            return;
        }
        f2 f2VarG = this.f81355t0.g(zVar);
        this.K++;
        this.f81338l.f1(zVar);
        k1(f2VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public void b1(List list, boolean z10) {
        n1();
        c1(list, -1, -9223372036854775807L, z10);
    }

    @Override // n9.a0
    public void c(a0.d dVar) {
        this.f81340m.c((a0.d) q9.a.e(dVar));
    }

    @Override // n9.a0
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        n1();
        y0(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // n9.a0
    public void clearVideoTextureView(TextureView textureView) {
        n1();
        if (textureView == null || textureView != this.f81319b0) {
            return;
        }
        x0();
    }

    @Override // n9.a0
    public void d(a0.d dVar) {
        n1();
        this.f81340m.j((a0.d) q9.a.e(dVar));
    }

    @Override // n9.a0
    public void e(final n9.h0 h0Var) {
        n1();
        if (!this.f81332i.h() || h0Var.equals(this.f81332i.c())) {
            return;
        }
        this.f81332i.m(h0Var);
        this.f81340m.k(19, new t.a() { // from class: io.bidmachine.media3.exoplayer.m0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((a0.d) obj).M(h0Var);
            }
        });
    }

    public void g1(SurfaceHolder surfaceHolder) {
        n1();
        if (surfaceHolder == null) {
            x0();
            return;
        }
        Y0();
        this.f81317a0 = true;
        this.Y = surfaceHolder;
        surfaceHolder.addCallback(this.f81364z);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            f1(null);
            T0(0, 0);
        } else {
            f1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            T0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // n9.a0
    public Looper getApplicationLooper() {
        return this.f81354t;
    }

    @Override // n9.a0
    public a0.b getAvailableCommands() {
        n1();
        return this.R;
    }

    @Override // n9.a0
    public long getContentBufferedPosition() {
        n1();
        if (this.f81355t0.f80828a.q()) {
            return this.f81361w0;
        }
        f2 f2Var = this.f81355t0;
        if (f2Var.f80838k.f72273d != f2Var.f80829b.f72273d) {
            return f2Var.f80828a.n(getCurrentMediaItemIndex(), this.f95244a).d();
        }
        long j10 = f2Var.f80844q;
        if (this.f81355t0.f80838k.b()) {
            f2 f2Var2 = this.f81355t0;
            e0.b bVarH = f2Var2.f80828a.h(f2Var2.f80838k.f72270a, this.f81344o);
            long jF = bVarH.f(this.f81355t0.f80838k.f72271b);
            j10 = jF == Long.MIN_VALUE ? bVarH.f95257d : jF;
        }
        f2 f2Var3 = this.f81355t0;
        return q9.o0.q1(W0(f2Var3.f80828a, f2Var3.f80838k, j10));
    }

    @Override // n9.a0
    public long getContentPosition() {
        n1();
        return G0(this.f81355t0);
    }

    @Override // n9.a0
    public int getCurrentAdGroupIndex() {
        n1();
        if (isPlayingAd()) {
            return this.f81355t0.f80829b.f72271b;
        }
        return -1;
    }

    @Override // n9.a0
    public int getCurrentAdIndexInAdGroup() {
        n1();
        if (isPlayingAd()) {
            return this.f81355t0.f80829b.f72272c;
        }
        return -1;
    }

    @Override // n9.a0
    public p9.b getCurrentCues() {
        n1();
        return this.f81337k0;
    }

    @Override // n9.a0
    public int getCurrentMediaItemIndex() {
        n1();
        int iI0 = I0(this.f81355t0);
        if (iI0 == -1) {
            return 0;
        }
        return iI0;
    }

    @Override // n9.a0
    public int getCurrentPeriodIndex() {
        n1();
        if (this.f81355t0.f80828a.q()) {
            return this.f81359v0;
        }
        f2 f2Var = this.f81355t0;
        return f2Var.f80828a.b(f2Var.f80829b.f72270a);
    }

    @Override // n9.a0
    public long getCurrentPosition() {
        n1();
        return q9.o0.q1(H0(this.f81355t0));
    }

    @Override // n9.a0
    public n9.e0 getCurrentTimeline() {
        n1();
        return this.f81355t0.f80828a;
    }

    @Override // n9.a0
    public n9.i0 getCurrentTracks() {
        n1();
        return this.f81355t0.f80836i.f85698d;
    }

    @Override // n9.a0
    public long getDuration() {
        n1();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        f2 f2Var = this.f81355t0;
        f0.b bVar = f2Var.f80829b;
        f2Var.f80828a.h(bVar.f72270a, this.f81344o);
        return q9.o0.q1(this.f81344o.b(bVar.f72271b, bVar.f72272c));
    }

    @Override // n9.a0
    public long getMaxSeekToPreviousPosition() {
        n1();
        return this.f81362x;
    }

    @Override // n9.a0
    public n9.t getMediaMetadata() {
        n1();
        return this.S;
    }

    @Override // n9.a0
    public boolean getPlayWhenReady() {
        n1();
        return this.f81355t0.f80839l;
    }

    @Override // n9.a0
    public n9.z getPlaybackParameters() {
        n1();
        return this.f81355t0.f80842o;
    }

    @Override // n9.a0
    public int getPlaybackState() {
        n1();
        return this.f81355t0.f80832e;
    }

    @Override // n9.a0
    public int getPlaybackSuppressionReason() {
        n1();
        return this.f81355t0.f80841n;
    }

    @Override // n9.a0
    public int getRepeatMode() {
        n1();
        return this.I;
    }

    @Override // n9.a0
    public long getSeekBackIncrement() {
        n1();
        return this.f81358v;
    }

    @Override // n9.a0
    public long getSeekForwardIncrement() {
        n1();
        return this.f81360w;
    }

    @Override // n9.a0
    public boolean getShuffleModeEnabled() {
        n1();
        return this.J;
    }

    @Override // n9.a0
    public long getTotalBufferedDuration() {
        n1();
        return q9.o0.q1(this.f81355t0.f80845r);
    }

    @Override // n9.a0
    public n9.h0 getTrackSelectionParameters() {
        n1();
        return this.f81332i.c();
    }

    @Override // n9.a0
    public n9.n0 getVideoSize() {
        n1();
        return this.f81351r0;
    }

    @Override // n9.a0
    public float getVolume() {
        n1();
        return this.f81333i0;
    }

    @Override // n9.a0
    public boolean isPlayingAd() {
        n1();
        return this.f81355t0.f80829b.b();
    }

    @Override // n9.e
    protected void k(int i10, long j10, int i11, boolean z10) {
        n1();
        if (i10 == -1) {
            return;
        }
        q9.a.a(i10 >= 0);
        n9.e0 e0Var = this.f81355t0.f80828a;
        if (e0Var.q() || i10 < e0Var.p()) {
            this.f81352s.notifySeekStarted();
            this.K++;
            if (isPlayingAd()) {
                q9.u.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                j1.e eVar = new j1.e(this.f81355t0);
                eVar.b(1);
                this.f81336k.a(eVar);
                return;
            }
            f2 f2VarQ0 = this.f81355t0;
            int i12 = f2VarQ0.f80832e;
            if (i12 == 3 || (i12 == 4 && !e0Var.q())) {
                f2VarQ0 = Q0(this.f81355t0, 2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            f2 f2VarR0 = R0(f2VarQ0, e0Var, S0(e0Var, i10, j10));
            this.f81338l.M0(e0Var, i10, q9.o0.P0(j10));
            k1(f2VarR0, 0, true, 1, H0(f2VarR0), currentMediaItemIndex, z10);
        }
    }

    @Override // n9.a0
    public void prepare() {
        n1();
        f2 f2Var = this.f81355t0;
        if (f2Var.f80832e != 1) {
            return;
        }
        f2 f2VarF = f2Var.f(null);
        f2 f2VarQ0 = Q0(f2VarF, f2VarF.f80828a.q() ? 4 : 2);
        this.K++;
        this.f81338l.u0();
        k1(f2VarQ0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void release() {
        q9.u.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + q9.o0.f98841e + "] [" + n9.s.b() + C4240b4.j.f42674e);
        n1();
        this.B.d(false);
        p2 p2Var = this.C;
        if (p2Var != null) {
            p2Var.l();
        }
        this.D.d(false);
        this.E.d(false);
        r2 r2Var = this.G;
        if (r2Var != null) {
            r2Var.disable();
        }
        if (!this.f81338l.w0()) {
            this.f81340m.k(10, new t.a() { // from class: io.bidmachine.media3.exoplayer.j0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).y(s.d(new u9.c0(1), 1003));
                }
            });
        }
        this.f81340m.i();
        this.f81334j.removeCallbacksAndMessages(null);
        this.f81356u.c(this.f81352s);
        f2 f2Var = this.f81355t0;
        if (f2Var.f80843p) {
            this.f81355t0 = f2Var.a();
        }
        f2 f2VarQ0 = Q0(this.f81355t0, 1);
        this.f81355t0 = f2VarQ0;
        f2 f2VarC = f2VarQ0.c(f2VarQ0.f80829b);
        this.f81355t0 = f2VarC;
        f2VarC.f80844q = f2VarC.f80846s;
        this.f81355t0.f80845r = 0L;
        this.f81352s.release();
        Y0();
        Surface surface = this.X;
        if (surface != null) {
            surface.release();
            this.X = null;
        }
        if (this.f81345o0) {
            androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.e(null));
            throw null;
        }
        this.f81337k0 = p9.b.f98111c;
        this.f81347p0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        n1();
        Z0(4, 15, imageOutput);
    }

    @Override // n9.a0
    public void setMediaItems(List list, boolean z10) {
        n1();
        b1(C0(list), z10);
    }

    @Override // n9.a0
    public void setPlayWhenReady(boolean z10) {
        n1();
        j1(z10, 1);
    }

    @Override // n9.a0
    public void setRepeatMode(final int i10) {
        n1();
        if (this.I != i10) {
            this.I = i10;
            this.f81338l.i1(i10);
            this.f81340m.h(8, new t.a() { // from class: io.bidmachine.media3.exoplayer.g0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onRepeatModeChanged(i10);
                }
            });
            i1();
            this.f81340m.f();
        }
    }

    @Override // n9.a0
    public void setShuffleModeEnabled(final boolean z10) {
        n1();
        if (this.J != z10) {
            this.J = z10;
            this.f81338l.l1(z10);
            this.f81340m.h(9, new t.a() { // from class: io.bidmachine.media3.exoplayer.l0
                @Override // q9.t.a
                public final void invoke(Object obj) {
                    ((a0.d) obj).onShuffleModeEnabledChanged(z10);
                }
            });
            i1();
            this.f81340m.f();
        }
    }

    @Override // n9.a0
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        n1();
        if (surfaceView instanceof ma.q) {
            Y0();
            f1(surfaceView);
            d1(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof na.l)) {
                g1(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            Y0();
            this.Z = (na.l) surfaceView;
            D0(this.A).m(10000).l(this.Z).k();
            this.Z.d(this.f81364z);
            f1(this.Z.getVideoSurface());
            d1(surfaceView.getHolder());
        }
    }

    @Override // n9.a0
    public void setVideoTextureView(TextureView textureView) {
        n1();
        if (textureView == null) {
            x0();
            return;
        }
        Y0();
        this.f81319b0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            q9.u.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f81364z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            f1(null);
            T0(0, 0);
        } else {
            e1(surfaceTexture);
            T0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // n9.a0
    public void setVolume(float f10) {
        n1();
        final float fO = q9.o0.o(f10, 0.0f, 1.0f);
        if (this.f81333i0 == fO) {
            return;
        }
        this.f81333i0 = fO;
        this.f81338l.r1(fO);
        this.f81340m.k(22, new t.a() { // from class: io.bidmachine.media3.exoplayer.e0
            @Override // q9.t.a
            public final void invoke(Object obj) {
                ((a0.d) obj).onVolumeChanged(fO);
            }
        });
    }

    @Override // n9.a0
    public void stop() {
        n1();
        h1(null);
        this.f81337k0 = new p9.b(ImmutableList.of(), this.f81355t0.f80846s);
    }

    public void t0(v9.c cVar) {
        this.f81352s.q((v9.c) q9.a.e(cVar));
    }

    public void u0(ExoPlayer.a aVar) {
        this.f81342n.add(aVar);
    }

    public void x0() {
        n1();
        Y0();
        f1(null);
        T0(0, 0);
    }

    public void y0(SurfaceHolder surfaceHolder) {
        n1();
        if (surfaceHolder == null || surfaceHolder != this.Y) {
            return;
        }
        x0();
    }
}
