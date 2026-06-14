package f1;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import f1.ja;
import f1.lg;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements x, SurfaceHolder.Callback, lg.b, ja.b, df {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaPlayer f69761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceView f69762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0 f69763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t6 f69764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function4 f69765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineDispatcher f69766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f69767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f69768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f69769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f69770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f69771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f69772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f69773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceHolder f69774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g8 f69775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ja f69776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lg f69777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f69778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f69779t;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0 {
        public a(Object obj) {
            super(0, obj, f.class, "startMediaPlayer", "startMediaPlayer$ChartboostMonetization_9_10_2_productionRelease()V", 0);
        }

        public final void a() {
            ((f) this.receiver).o();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public f(MediaPlayer mediaPlayer, SurfaceView surfaceView, n0 n0Var, t6 uiPoster, Function3 videoProgressFactory, Function4 videoBufferFactory, CoroutineDispatcher coroutineDispatcher, m fileCache) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        Intrinsics.checkNotNullParameter(videoBufferFactory, "videoBufferFactory");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        this.f69761b = mediaPlayer;
        this.f69762c = surfaceView;
        this.f69763d = n0Var;
        this.f69764e = uiPoster;
        this.f69765f = videoBufferFactory;
        this.f69766g = coroutineDispatcher;
        this.f69767h = fileCache;
        this.f69774o = surfaceView != null ? surfaceView.getHolder() : null;
        this.f69777r = (lg) videoProgressFactory.invoke(this.f69763d, this, uiPoster);
    }

    private final void e(int i10, int i11) {
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer == null) {
            return;
        }
        SurfaceView surfaceView = this.f69762c;
        int videoHeight = mediaPlayer.getVideoHeight();
        MediaPlayer mediaPlayer2 = this.f69761b;
        g4.a(surfaceView, mediaPlayer2 != null ? mediaPlayer2.getVideoWidth() : 1, videoHeight, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    @Override // f1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f1.c9 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "asset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "asset() - asset: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 2
            r2 = 0
            f1.eg.e(r0, r2, r1, r2)
            android.media.MediaPlayer r0 = r4.f69761b
            if (r0 == 0) goto L42
            kotlin.jvm.functions.Function4 r0 = r4.f69765f
            kotlinx.coroutines.CoroutineDispatcher r1 = r4.f69766g
            f1.m r3 = r4.f69767h
            java.lang.Object r5 = r0.invoke(r5, r4, r1, r3)
            f1.ja r5 = (f1.ja) r5
            r4.f69776q = r5
            if (r5 == 0) goto L34
            f1.g8 r5 = r5.f()
            goto L35
        L34:
            r5 = r2
        L35:
            r4.f69775p = r5
            android.view.SurfaceHolder r5 = r4.f69774o
            if (r5 == 0) goto L40
            r5.addCallback(r4)
            kotlin.Unit r2 = kotlin.Unit.f93236a
        L40:
            if (r2 != 0) goto L4d
        L42:
            f1.n0 r5 = r4.f69763d
            if (r5 == 0) goto L4d
            java.lang.String r0 = "Missing media player during startMediaPlayer"
            r5.a(r0)
            kotlin.Unit r5 = kotlin.Unit.f93236a
        L4d:
            r5 = 0
            r4.f69778s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.f.a(f1.c9):void");
    }

    public final void b(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        this.f69772m = false;
        int duration = mp.getDuration();
        SurfaceView surfaceView = this.f69762c;
        int width = surfaceView != null ? surfaceView.getWidth() : 0;
        SurfaceView surfaceView2 = this.f69762c;
        e(width, surfaceView2 != null ? surfaceView2.getHeight() : 0);
        n0 n0Var = this.f69763d;
        if (n0Var != null) {
            n0Var.b(duration);
        }
        this.f69769j = true;
        ja jaVar = this.f69776q;
        if (jaVar != null) {
            jaVar.b(duration);
        }
        if (this.f69770k) {
            o();
        }
    }

    @Override // f1.df
    public void c() {
        this.f69773n = true;
    }

    @Override // f1.ja.b
    public void d() {
        this.f69770k = true;
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        m();
        MediaPlayer mediaPlayer2 = this.f69761b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.prepareAsync();
        }
        n0 n0Var = this.f69763d;
        if (n0Var != null) {
            n0Var.d();
        }
    }

    @Override // f1.x
    public void f() {
        this.f69779t = 0.0f;
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @Override // f1.x
    public float g() {
        return this.f69779t;
    }

    @Override // f1.x
    public boolean h() {
        return this.f69778s;
    }

    public final void i() {
        if (!this.f69770k || this.f69772m) {
            return;
        }
        ja jaVar = this.f69776q;
        if (jaVar != null) {
            jaVar.a();
        }
        this.f69772m = false;
        n0 n0Var = this.f69763d;
        if (n0Var != null) {
            n0Var.c();
        }
        pause();
        ja jaVar2 = this.f69776q;
        if (jaVar2 != null) {
            jaVar2.e();
        }
    }

    public final void j() {
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.f69763d = null;
        this.f69761b = null;
        this.f69774o = null;
        this.f69762c = null;
        this.f69776q = null;
    }

    public final void k() {
        this.f69777r.a();
    }

    public final void l() {
        lg.a.a(this.f69777r, 0L, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: IOException -> 0x0015, TryCatch #0 {IOException -> 0x0015, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:9:0x000f, B:19:0x0029, B:14:0x001a, B:16:0x001e), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r3 = this;
            r0 = 0
            f1.g8 r1 = r3.f69775p     // Catch: java.io.IOException -> L15
            if (r1 == 0) goto L1a
            java.io.FileDescriptor r1 = r1.b()     // Catch: java.io.IOException -> L15
            if (r1 == 0) goto L1a
            android.media.MediaPlayer r2 = r3.f69761b     // Catch: java.io.IOException -> L15
            if (r2 == 0) goto L17
            r2.setDataSource(r1)     // Catch: java.io.IOException -> L15
            kotlin.Unit r1 = kotlin.Unit.f93236a     // Catch: java.io.IOException -> L15
            goto L18
        L15:
            r1 = move-exception
            goto L30
        L17:
            r1 = r0
        L18:
            if (r1 != 0) goto L27
        L1a:
            f1.n0 r1 = r3.f69763d     // Catch: java.io.IOException -> L15
            if (r1 == 0) goto L26
            java.lang.String r2 = "Missing video asset"
            r1.a(r2)     // Catch: java.io.IOException -> L15
            kotlin.Unit r1 = kotlin.Unit.f93236a     // Catch: java.io.IOException -> L15
            goto L27
        L26:
            r1 = r0
        L27:
            if (r1 != 0) goto L44
            java.lang.String r1 = "MediaPlayer missing callback on error"
            r2 = 2
            f1.eg.j(r1, r0, r2, r0)     // Catch: java.io.IOException -> L15
            return
        L30:
            f1.n0 r2 = r3.f69763d
            if (r2 == 0) goto L3d
            java.lang.String r0 = r1.toString()
            r2.a(r0)
            kotlin.Unit r0 = kotlin.Unit.f93236a
        L3d:
            if (r0 != 0) goto L44
            java.lang.String r0 = "MediaPlayer missing callback on IOException"
            f1.eg.i(r0, r1)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.f.m():void");
    }

    public final void n() {
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: f1.b
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.f69407b.b(mediaPlayer2);
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: f1.c
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i10, int i11) {
                    return f.d(this.f69487b, mediaPlayer2, i10, i11);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: f1.d
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    f.c(this.f69553b, mediaPlayer2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: f1.e
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                    return f.f(this.f69692b, mediaPlayer2, i10, i11);
                }
            });
        }
    }

    public final void o() {
        Unit unit;
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
                this.f69778s = true;
                l();
                n0 n0Var = this.f69763d;
                if (n0Var != null) {
                    n0Var.a();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(this.f69768i, 3);
                } else {
                    mediaPlayer.seekTo((int) this.f69768i);
                }
                unit = Unit.f93236a;
            } catch (IllegalStateException e10) {
                n0 n0Var2 = this.f69763d;
                if (n0Var2 != null) {
                    n0Var2.a(e10.toString());
                    unit = Unit.f93236a;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        n0 n0Var3 = this.f69763d;
        if (n0Var3 != null) {
            n0Var3.a("Missing video player during startVideoPlayer");
            Unit unit2 = Unit.f93236a;
        }
    }

    public final void p() {
        this.f69764e.a(500L, new a(this));
    }

    @Override // f1.x
    public void pause() {
        eg.e("pause()", null, 2, null);
        if (this.f69769j && this.f69770k) {
            ja jaVar = this.f69776q;
            if (jaVar != null) {
                jaVar.g();
            }
            k();
            try {
                MediaPlayer mediaPlayer = this.f69761b;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Exception e10) {
                n0 n0Var = this.f69763d;
                if (n0Var != null) {
                    n0Var.a(e10.toString());
                }
            }
            this.f69768i = a();
            this.f69770k = false;
            this.f69771l = true;
        }
    }

    @Override // f1.x
    public void play() {
        eg.e("play()", null, 2, null);
        if (this.f69769j && !this.f69770k) {
            p();
        }
        this.f69770k = true;
        this.f69771l = this.f69773n;
        this.f69773n = false;
    }

    @Override // f1.x
    public void stop() throws IOException {
        eg.e("stop()", null, 2, null);
        if (this.f69769j) {
            ja jaVar = this.f69776q;
            if (jaVar != null) {
                jaVar.g();
            }
            this.f69776q = null;
            this.f69768i = 0L;
            k();
            try {
                MediaPlayer mediaPlayer = this.f69761b;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
            } catch (Exception e10) {
                n0 n0Var = this.f69763d;
                if (n0Var != null) {
                    n0Var.a(e10.toString());
                }
            }
            this.f69770k = false;
            this.f69771l = false;
            g8 g8Var = this.f69775p;
            if (g8Var != null) {
                g8Var.a();
            }
            this.f69775p = null;
            j();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f69771l) {
            MediaPlayer mediaPlayer = this.f69761b;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(holder);
            }
            play();
            return;
        }
        try {
            n();
            m();
            MediaPlayer mediaPlayer2 = this.f69761b;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.f69761b;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDisplay(holder);
            }
        } catch (Exception e10) {
            eg.i("SurfaceCreated exception", e10);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(null);
        }
    }

    public static final void c(f this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f69768i < ((double) mediaPlayer.getDuration()) - (((double) mediaPlayer.getDuration()) * 0.05d)) {
            this$0.i();
            return;
        }
        n0 n0Var = this$0.f69763d;
        if (n0Var != null) {
            n0Var.b();
        }
    }

    public final void g(int i10, int i11) {
        eg.j("MediaPlayer error: " + ("error: " + i10 + " extra: " + i11), null, 2, null);
        if (this.f69769j) {
            i();
        }
    }

    public static final boolean f(f this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g(i10, i11);
        return true;
    }

    public static final boolean d(f this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((i10 != 805 && i10 != 804) || i11 != -1004) {
            return true;
        }
        this$0.i();
        return true;
    }

    @Override // f1.x
    public void b() {
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    public /* synthetic */ f(MediaPlayer mediaPlayer, SurfaceView surfaceView, n0 n0Var, t6 t6Var, Function3 function3, Function4 function4, CoroutineDispatcher coroutineDispatcher, m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new MediaPlayer() : mediaPlayer, surfaceView, n0Var, t6Var, function3, function4, (i10 & 64) != 0 ? eg.o0.c() : coroutineDispatcher, mVar);
    }

    @Override // f1.lg.b
    public long a() {
        MediaPlayer mediaPlayer = this.f69761b;
        if (mediaPlayer == null) {
            return 0L;
        }
        long currentPosition = mediaPlayer.getCurrentPosition();
        this.f69768i = currentPosition;
        return currentPosition;
    }

    @Override // f1.a9
    public void a(int i10, int i11) {
        e(i11, i10);
    }
}
