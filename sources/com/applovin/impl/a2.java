package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b1;
import com.applovin.impl.d6;
import com.applovin.impl.m8;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class a2 extends w1 implements AppLovinCommunicatorSubscriber {
    private final b2 M;
    private MediaPlayer N;
    private final View O;
    protected final AppLovinVideoView P;
    protected final com.applovin.impl.a Q;
    protected final com.applovin.impl.adview.g R;
    protected i0 S;
    protected final ImageView T;
    protected com.applovin.impl.adview.l U;
    protected final ProgressBar V;
    protected ProgressBar W;
    protected ImageView X;
    private final e Y;
    private final d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Handler f8188a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Handler f8189b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected final b1 f8190c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected final b1 f8191d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final boolean f8192e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected boolean f8193f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected long f8194g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f8195h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f8196i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected boolean f8197j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f8198k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AtomicBoolean f8199l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f8200m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private long f8201n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private long f8202o0;

    class a implements b1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8203a;

        a(int i10) {
            this.f8203a = i10;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            if (a2.this.S != null) {
                long seconds = ((long) this.f8203a) - TimeUnit.MILLISECONDS.toSeconds(r0.P.getCurrentPosition());
                if (seconds <= 0) {
                    a2.this.f11177v = true;
                } else if (a2.this.Q()) {
                    a2.this.S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return a2.this.Q();
        }
    }

    class b implements b1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f8205a;

        b(Integer num) {
            this.f8205a = num;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            a2 a2Var = a2.this;
            if (a2Var.f8197j0) {
                a2Var.V.setVisibility(8);
            } else {
                a2.this.V.setProgress((int) ((a2Var.P.getCurrentPosition() / a2.this.f8194g0) * this.f8205a.intValue()));
            }
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return !a2.this.f8197j0;
        }
    }

    class c implements b1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f8208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f8209c;

        c(long j10, Integer num, Long l10) {
            this.f8207a = j10;
            this.f8208b = num;
            this.f8209c = l10;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            a2.this.W.setProgress((int) ((a2.this.f11173r / this.f8207a) * this.f8208b.intValue()));
            a2.this.f11173r += this.f8209c.longValue();
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return a2.this.f11173r < this.f8207a;
        }
    }

    private class d implements m8.a {
        private d() {
        }

        @Override // com.applovin.impl.m8.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            a2.this.a("video_button");
        }

        @Override // com.applovin.impl.m8.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            a2.this.a(lVar.getAndClearLastClickEvent());
        }

        @Override // com.applovin.impl.m8.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            a2.this.J = true;
        }

        @Override // com.applovin.impl.m8.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            a2.this.T();
        }

        /* synthetic */ d(a2 a2Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.m8.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            k7.a(uri, a2.this.b().getController(), a2.this.f11157b);
        }

        @Override // com.applovin.impl.m8.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            k7.c(uri, a2.this.b().getController().g(), a2.this.f11157b);
        }
    }

    private class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            a2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "Video completed");
            }
            a2.this.f8198k0 = true;
            a2 a2Var = a2.this;
            if (!a2Var.f11175t) {
                a2Var.S();
            } else if (a2Var.h()) {
                a2.this.A();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            a2.this.g("Video view error (" + i10 + StringUtils.COMMA + i11 + ")");
            a2.this.P.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i10 + ", " + i11 + ")");
            }
            if (i10 == 701) {
                a2.this.R();
                return false;
            }
            if (i10 != 3) {
                if (i10 != 702) {
                    return false;
                }
                a2.this.E();
                return false;
            }
            a2.this.f8190c0.b();
            a2 a2Var = a2.this;
            if (a2Var.R != null) {
                a2Var.P();
            }
            a2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            a2.this.N = mediaPlayer;
            mediaPlayer.setOnInfoListener(a2.this.Y);
            mediaPlayer.setOnErrorListener(a2.this.Y);
            float f10 = !a2.this.f8193f0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            a2.this.f11176u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            a2.this.d(mediaPlayer.getDuration());
            a2.this.O();
            com.applovin.impl.sdk.o oVar = a2.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + a2.this.N);
            }
        }

        /* synthetic */ e(a2 a2Var, a aVar) {
            this();
        }
    }

    private class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a2 a2Var = a2.this;
            if (view == a2Var.R) {
                a2Var.T();
                return;
            }
            if (view == a2Var.T) {
                a2Var.U();
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f11158c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(a2 a2Var, a aVar) {
            this();
        }
    }

    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new b2(this.f11156a, this.f11159d, this.f11157b);
        a aVar = null;
        this.X = null;
        e eVar = new e(this, aVar);
        this.Y = eVar;
        d dVar = new d(this, aVar);
        this.Z = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f8188a0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f8189b0 = handler2;
        b1 b1Var = new b1(handler, this.f11157b);
        this.f8190c0 = b1Var;
        this.f8191d0 = new b1(handler2, this.f11157b);
        boolean zC0 = this.f11156a.C0();
        this.f8192e0 = zC0;
        this.f8193f0 = n7.e(this.f11157b);
        this.f8196i0 = -1;
        this.f8199l0 = new AtomicBoolean();
        this.f8200m0 = new AtomicBoolean();
        this.f8201n0 = -2L;
        this.f8202o0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        bVar.h().putString("video_view_address", e8.a(appLovinVideoView));
        View view = new View(activity);
        this.O = view;
        boolean z10 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) kVar.a(x4.f11369m1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.f11296e0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.f11296e0, activity, eVar));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.z8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return a2.a(view2, motionEvent);
                }
            });
        }
        f fVar = new f(this, aVar);
        if (bVar.d0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.U(), activity);
            this.R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.R = null;
        }
        if (a(this.f8193f0, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            e(this.f8193f0);
        } else {
            this.T = null;
        }
        String strA0 = bVar.a0();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA0)) {
            m8 m8Var = new m8(kVar);
            m8Var.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.Z(), bVar, m8Var, activity);
            this.U = lVar;
            lVar.a(strA0);
        } else {
            this.U = null;
        }
        if (zC0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) kVar.a(x4.f11352k2)).intValue(), R.attr.progressBarStyleLarge);
            this.Q = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.Q = null;
        }
        int iC = c();
        if (((Boolean) kVar.a(x4.U1)).booleanValue() && iC > 0) {
            z10 = true;
        }
        if (this.S == null && z10) {
            this.S = new i0(activity);
            int iS = bVar.s();
            this.S.setTextColor(iS);
            this.S.setTextSize(((Integer) kVar.a(x4.T1)).intValue());
            this.S.setFinishedStrokeColor(iS);
            this.S.setFinishedStrokeWidth(((Integer) kVar.a(x4.S1)).intValue());
            this.S.setMax(iC);
            this.S.setProgress(iC);
            b1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iC));
        }
        if (!bVar.k0()) {
            this.V = null;
            return;
        }
        Long l10 = (Long) kVar.a(x4.f11325h2);
        Integer num = (Integer) kVar.a(x4.f11334i2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.V = progressBar;
        a(progressBar, bVar.j0(), num.intValue());
        b1Var.a("PROGRESS_BAR", l10.longValue(), new b(num));
    }

    private void M() {
        com.applovin.impl.adview.l lVar;
        d8 d8VarB0 = this.f11156a.b0();
        if (d8VarB0 == null || !d8VarB0.j() || this.f8197j0 || (lVar = this.U) == null) {
            return;
        }
        final boolean z10 = lVar.getVisibility() == 4;
        final long jH = d8VarB0.h();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.t8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11019b.b(z10, jH);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.f8197j0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f11157b.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f8196i0 < 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f8196i0 + "ms for MediaPlayer: " + this.N);
        }
        this.P.seekTo(this.f8196i0);
        this.P.start();
        this.f8190c0.b();
        this.f8196i0 = -1;
        a(new Runnable() { // from class: com.applovin.impl.s8
            @Override // java.lang.Runnable
            public final void run() {
                this.f10423b.I();
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.f8200m0.compareAndSet(false, true)) {
            a(this.R, this.f11156a.d0(), new Runnable() { // from class: com.applovin.impl.w8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11231b.J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z10) {
        if (o0.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f11159d.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.T.setScaleType(ImageView.ScaleType.FIT_XY);
                this.T.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.T, z10 ? this.f11156a.G() : this.f11156a.Y(), this.f11157b);
    }

    private void f(boolean z10) {
        this.f8195h0 = C();
        if (z10) {
            this.P.pause();
        } else {
            this.P.stopPlayback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        o8.a(this.U, str, "AppLovinFullscreenActivity", this.f11157b);
    }

    @Override // com.applovin.impl.w1
    protected void A() {
        this.M.a(this.f11167l);
        this.f11172q = SystemClock.elapsedRealtime();
    }

    protected void O() {
        long jP;
        long millis;
        if (this.f11156a.O() >= 0 || this.f11156a.P() >= 0) {
            if (this.f11156a.O() >= 0) {
                jP = this.f11156a.O();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f11156a;
                long j10 = this.f8194g0;
                long j11 = j10 > 0 ? j10 : 0L;
                if (aVar.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f11156a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) aVar.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                    j11 += millis;
                }
                jP = (long) (j11 * (((double) this.f11156a.P()) / 100.0d));
            }
            c(jP);
        }
    }

    protected boolean Q() {
        return (this.f11177v || this.f8197j0 || !this.P.isPlaying()) ? false : true;
    }

    protected void R() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.c9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8515b.K();
            }
        });
    }

    public void S() {
        a2 a2Var;
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f11156a.d1());
        long jM = this.f11156a.M();
        if (jM > 0) {
            this.f11173r = 0L;
            Long l10 = (Long) this.f11157b.a(x4.f11394p2);
            Integer num = (Integer) this.f11157b.a(x4.f11418s2);
            ProgressBar progressBar = new ProgressBar(this.f11159d, null, R.attr.progressBarStyleHorizontal);
            this.W = progressBar;
            a(progressBar, this.f11156a.L(), num.intValue());
            a2Var = this;
            this.f8191d0.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), a2Var.new c(jM, num, l10));
            a2Var.f8191d0.b();
        } else {
            a2Var = this;
        }
        a2Var.M.a(a2Var.f11166k, a2Var.f11165j, b(), a2Var.W);
        a("javascript:al_onPoststitialShow(" + a2Var.f11180y + StringUtils.COMMA + a2Var.f11181z + ");", a2Var.f11156a.x());
        if (a2Var.f11166k != null) {
            if (a2Var.f11156a.r() >= 0) {
                a(a2Var.f11166k, a2Var.f11156a.r(), new Runnable() { // from class: com.applovin.impl.x8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11484b.L();
                    }
                });
            } else {
                a2Var.f11166k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = a2Var.f11166k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = a2Var.f11165j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = a2Var.f11165j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = a2Var.W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        a2Var.f11156a.getAdEventTracker().b(b(), arrayList);
        p();
        a2Var.f8197j0 = true;
    }

    public void T() {
        this.f8201n0 = SystemClock.elapsedRealtime() - this.f8202o0;
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.f8201n0 + "ms");
        }
        D();
    }

    protected void U() {
        MediaPlayer mediaPlayer = this.N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f8193f0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = !this.f8193f0;
            this.f8193f0 = z10;
            e(z10);
            a(this.f8193f0, 0L);
        } catch (Throwable unused) {
        }
    }

    protected void d(long j10) {
        this.f8194g0 = j10;
    }

    protected void g(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f11156a);
        }
        if (this.f8199l0.compareAndSet(false, true)) {
            if (((Boolean) this.f11157b.a(x4.O0)).booleanValue()) {
                this.f11157b.G().d(this.f11156a, com.applovin.impl.sdk.k.o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
            if (appLovinAdDisplayListener instanceof l2) {
                ((l2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f11156a instanceof o7 ? "handleVastVideoError" : "handleVideoError";
            this.f11157b.D().a(str2, str, this.f11156a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f11157b.g().a(d2.F, this.f11156a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.w1
    protected void m() {
        super.a(C(), this.f8192e0, F(), this.f8201n0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f11156a.getAdIdNumber() && this.f8192e0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !r0.a(i10)) || this.f8198k0 || this.P.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.w1
    public void r() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f11157b.a(x4.f11446v6)).booleanValue()) {
                o8.b(this.U);
                this.U = null;
            }
            if (this.f8192e0) {
                AppLovinCommunicator.getInstance(this.f11159d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th2);
        }
        super.r();
    }

    @Override // com.applovin.impl.w1
    public void v() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f8196i0 = this.P.getCurrentPosition();
        this.P.pause();
        this.f8190c0.c();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f8196i0 + "ms");
        }
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
            final com.applovin.impl.a aVar2 = this.Q;
            Objects.requireNonNull(aVar2);
            a(new Runnable() { // from class: com.applovin.impl.b9
                @Override // java.lang.Runnable
                public final void run() {
                    aVar2.b();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f8201n0 = -1L;
        this.f8202o0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f11172q = SystemClock.elapsedRealtime();
    }

    protected int C() {
        long currentPosition = this.P.getCurrentPosition();
        if (this.f8198k0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f8194g0) * 100.0f) : this.f8195h0;
    }

    public void D() {
        this.f11180y++;
        if (this.f11156a.u()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            S();
        }
    }

    protected void E() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.u8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11079b.H();
            }
        });
    }

    protected boolean F() {
        if (this.J && this.f11156a.a1()) {
            return true;
        }
        return G();
    }

    protected boolean G() {
        return C() >= this.f11156a.f0();
    }

    @Override // com.applovin.impl.w1
    public void b(boolean z10) {
        super.b(z10);
        if (z10) {
            b(0L);
            if (this.f8197j0) {
                this.f8191d0.b();
                return;
            }
            return;
        }
        if (this.f8197j0) {
            this.f8191d0.c();
        } else {
            v();
        }
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        this.M.a(this.U);
        this.M.a((View) this.R);
        if (!h() || this.f8197j0) {
            A();
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        String str;
        this.M.a(this.T, this.R, this.U, this.Q, this.V, this.S, this.P, this.O, b(), this.f11165j, this.X, viewGroup);
        if (o0.g() && (str = this.f11157b.n0().getExtraParameters().get("audio_focus_request")) != null) {
            this.P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f11157b.a(x4.X5)).booleanValue() || !a(!this.f8192e0)) {
            this.P.setVideoURI(this.f11156a.l0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.f11165j;
            if (kVar != null) {
                kVar.b();
            }
            this.P.start();
            if (this.f8192e0) {
                R();
            }
            b().renderAd(this.f11156a);
            if (this.R != null) {
                this.f11157b.q0().a(new r6(this.f11157b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.y8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11561b.P();
                    }
                }), d6.b.TIMEOUT, this.f11156a.e0(), true);
            }
            super.c(this.f8193f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10, long j10) {
        if (z10) {
            e8.a(this.U, j10, (Runnable) null);
        } else {
            e8.b(this.U, j10, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void b(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.a9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8237b.N();
            }
        }, j10);
    }

    @Override // com.applovin.impl.w1
    protected void a(final String str, long j10) {
        super.a(str, j10);
        if (this.U == null || j10 < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.v8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11141b.h(str);
            }
        }, j10);
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        if (o0.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        this.f8190c0.a();
        this.f8191d0.a();
        this.f8188a0.removeCallbacksAndMessages(null);
        this.f8189b0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f11157b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f11156a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    protected void a(MotionEvent motionEvent) {
        Context context;
        if (this.f11156a.B0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriC0 = this.f11156a.c0();
            if (uriC0 != null) {
                if (!((Boolean) this.f11157b.a(x4.f11447w)).booleanValue() || (context = this.f11159d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.k.o();
                }
                this.f11157b.k().trackAndLaunchVideoClick(this.f11156a, uriC0, motionEvent, this, context);
                t2.a(this.E, this.f11156a);
                this.f11181z++;
                return;
            }
            return;
        }
        M();
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(x4.Z1)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(x4.f11263a2)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) kVar.a(x4.f11280c2)).booleanValue();
    }
}
