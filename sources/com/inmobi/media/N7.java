package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class N7 {
    public final L7 A;
    public final F7 B;
    public final MutableSharedFlow C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f37402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f37403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f37404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f37405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f37406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f37407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f37408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f37409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f37410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f37411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f37412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f37413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MutableSharedFlow f37414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final G1 f37415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f37416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExoPlayer f37417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f37418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f37419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f37420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EnumC4034sg f37421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f37422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Job f37423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K2 f37424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4074u6 f37425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S7 f37426y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3927o8 f37427z;

    public N7(Context context, AdConfig.HybridNativeConfig hybridNativeConfig, CoroutineScope coroutineScope, HtmlVideoPlayerRequest htmlVideoPlayerRequest, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(htmlVideoPlayerRequest, "htmlVideoPlayerRequest");
        this.f37402a = htmlVideoPlayerRequest;
        this.f37403b = interfaceC3878m9;
        this.f37404c = P4.a(coroutineScope, new K7(eg.c0.J8, this));
        CoroutineScope coroutineScopeA = P4.a(coroutineScope);
        this.f37405d = coroutineScopeA;
        HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.f37406e = config;
        this.f37407f = new AtomicBoolean(false);
        this.f37408g = new AtomicBoolean(false);
        this.f37409h = new AtomicBoolean(false);
        List listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "synchronizedList(...)");
        this.f37412k = listSynchronizedList;
        EnumC4034sg enumC4034sg = EnumC4034sg.f39532a;
        this.f37413l = new AtomicReference(enumC4034sg);
        MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
        this.f37414m = mutableSharedFlowB;
        G1 g12 = new G1(context);
        this.f37415n = g12;
        this.f37416o = new ProgressBar(context);
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        this.f37417p = exoPlayerBuild;
        List listSynchronizedList2 = DesugarCollections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList2, "synchronizedList(...)");
        this.f37420s = listSynchronizedList2;
        this.f37421t = enumC4034sg;
        K2 k22 = (K2) K2.f37184h.getValue();
        k22.f37190f.incrementAndGet();
        this.f37424w = k22;
        this.f37425x = new C4074u6(exoPlayerBuild, hybridNativeConfig, coroutineScopeA, config.getPlaybackInterval(), mutableSharedFlowB, config.getTrackPercentages());
        Context context2 = g12.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f37426y = new S7(context2, coroutineScopeA, exoPlayerBuild, config.getMuted(), mutableSharedFlowB);
        this.f37427z = new C3927o8(coroutineScopeA, exoPlayerBuild, g12, interfaceC3878m9);
        this.A = new L7(this);
        this.B = new F7(this);
        this.C = mutableSharedFlowB;
    }

    public final void a(Rl rl) {
        eg.i.d(this.f37404c, null, null, new G7(this, rl, null), 3, null);
    }

    public final EnumC4034sg b() {
        Object obj = this.f37413l.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (EnumC4034sg) obj;
    }

    public final void c() {
        if (!this.f37409h.get() && b() == EnumC4034sg.f39535d) {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                eg.i.d(this.f37404c, null, null, new D7(null, this), 3, null);
                return;
            }
            this.f37417p.pause();
            this.f37425x.a();
            S7 s72 = this.f37426y;
            s72.f37696b.setVolume(0.0f);
            s72.f37698d.a();
            this.f37413l.set(EnumC4034sg.f39536e);
            a(new Om(this.f37417p.getCurrentPosition()));
        }
    }

    public final void d() {
        if (this.f37409h.get()) {
            return;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f37403b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (b() != EnumC4034sg.f39536e && b() != EnumC4034sg.f39534c && b() != EnumC4034sg.f39537f) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37403b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            eg.i.d(this.f37404c, null, null, new E7(null, this), 3, null);
            return;
        }
        if (b() == EnumC4034sg.f39537f) {
            this.f37417p.seekTo(0L);
            this.f37413l.set(EnumC4034sg.f39534c);
        }
        S7 s72 = this.f37426y;
        if (s72.f37699e) {
            s72.a();
            s72.f37698d.a();
        } else {
            P4.a(s72.f37695a, new R7(s72, null));
        }
        C4074u6 c4074u6 = this.f37425x;
        if (!c4074u6.f39641d.getAndSet(true)) {
            CoroutineScope coroutineScope = c4074u6.f39639b;
            long j10 = c4074u6.f39648k;
            C4024s6 action = new C4024s6(c4074u6, null);
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            c4074u6.f39642e = eg.i.d(coroutineScope, eg.o0.c().w(), null, new C3(j10, null, action), 2, null);
            CoroutineScope coroutineScope2 = c4074u6.f39639b;
            long j11 = c4074u6.f39649l;
            C4049t6 action2 = new C4049t6(c4074u6, null);
            Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            Intrinsics.checkNotNullParameter(action2, "action");
            c4074u6.f39643f = eg.i.d(coroutineScope2, eg.o0.c().w(), null, new C3(j11, null, action2), 2, null);
        }
        this.f37417p.play();
        this.f37413l.set(EnumC4034sg.f39535d);
        a(new C3768hn(this.f37417p.getCurrentPosition()));
    }

    public final void e() {
        if (this.f37409h.get()) {
            return;
        }
        String str = this.f37418q;
        if (str != null) {
            for (HtmlVideoFile htmlVideoFile : this.f37420s) {
                if (Intrinsics.areEqual(htmlVideoFile.getUrl(), str)) {
                    break;
                }
            }
            htmlVideoFile = null;
        } else {
            htmlVideoFile = null;
        }
        if (htmlVideoFile == null) {
            InterfaceC3878m9 interfaceC3878m9 = this.f37403b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.f37408g.get()) {
            this.f37408g.set(true);
            Job jobD = eg.i.d(this.f37404c, null, null, new C4075u7(new C4150x7(this.C), null, this), 3, null);
            List activeJobs = this.f37412k;
            Intrinsics.checkNotNullParameter(jobD, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(jobD);
        }
        if (!this.f37407f.get()) {
            this.f37407f.set(true);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.f37417p.addListener(this.B);
            } else {
                eg.i.d(this.f37404c, null, null, new C4025s7(null, this), 3, null);
            }
        }
        if (this.f37406e.getAutoplay()) {
            d();
        }
    }

    public final void f() {
        if (this.f37409h.get()) {
            return;
        }
        if (b() == EnumC4034sg.f39535d) {
            c();
        }
        if (this.f37407f.get()) {
            this.f37407f.set(false);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.f37417p.removeListener(this.B);
            } else {
                eg.i.d(this.f37404c, null, null, new I7(null, this), 3, null);
            }
        }
        this.f37425x.a();
        this.f37408g.set(false);
        P4.a(this.f37412k);
    }

    public final void a(RelativeLayout parentView) {
        InterfaceC3878m9 interfaceC3878m9;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (this.f37409h.get()) {
            return;
        }
        this.f37419r = new WeakReference(parentView);
        C3927o8 c3927o8 = this.f37427z;
        L7 surfaceViewabilityListener = this.A;
        c3927o8.getClass();
        Intrinsics.checkNotNullParameter(surfaceViewabilityListener, "surfaceViewabilityListener");
        P4.a(c3927o8.f39169a, new C3877m8(c3927o8, surfaceViewabilityListener, null));
        G1 g12 = this.f37415n;
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        VideoViewPosition videoViewPosition2 = this.f37406e.getVideoViewPosition();
        if (this.f37406e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? videoViewPosition2.getX() : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? videoViewPosition2.getY() : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (J5.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (J5.b() * videoViewPosition2.getHeight()) : -2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.f37406e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        g12.setLayoutParams(layoutParams);
        this.f37415n.setOnPositionChangeListener(new B7(this));
        ViewParent parent = this.f37416o.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f37416o);
        }
        ProgressBar progressBar = this.f37416o;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.f37415n.addView(this.f37416o, 0);
        } else {
            eg.i.d(this.f37404c, null, null, new J7(null, this), 3, null);
        }
        G1 g13 = this.f37415n;
        if (ViewCompat.isAttachedToWindow(g13)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37403b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(C3977q8.f39362a);
        } else {
            g13.addOnAttachStateChangeListener(new A7(g13, this));
        }
        parentView.addView(this.f37415n, 0);
        if (b() == EnumC4034sg.f39534c || (interfaceC3878m9 = this.f37403b) == null) {
            return;
        }
        ((C3903n9) interfaceC3878m9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final HtmlVideoPlaybackState a() {
        String str;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        int iOrdinal = b().ordinal();
        if (iOrdinal == 2) {
            EnumC3802j8[] enumC3802j8Arr = EnumC3802j8.f38802a;
            str = C4240b4.i.f42650s;
        } else if (iOrdinal == 3) {
            EnumC3802j8[] enumC3802j8Arr2 = EnumC3802j8.f38802a;
            str = C4240b4.i.f42625f0;
        } else if (iOrdinal == 4) {
            EnumC3802j8[] enumC3802j8Arr3 = EnumC3802j8.f38802a;
            str = C4240b4.i.f42623e0;
        } else if (iOrdinal == 5) {
            EnumC3802j8[] enumC3802j8Arr4 = EnumC3802j8.f38802a;
            str = C4240b4.i.f42629h0;
        } else if (iOrdinal != 6) {
            EnumC3802j8[] enumC3802j8Arr5 = EnumC3802j8.f38802a;
            str = "loading";
        } else {
            EnumC3802j8[] enumC3802j8Arr6 = EnumC3802j8.f38802a;
            str = C4240b4.i.f42652t;
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(this.f37417p.getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(this.f37417p.getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.f37426y.f37699e);
        return htmlVideoPlaybackState;
    }

    public final void a(VideoViewPosition newVideoViewPosition) {
        Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
        if (this.f37409h.get()) {
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            eg.i.d(this.f37404c, null, null, new M7(null, this, newVideoViewPosition), 3, null);
            return;
        }
        TransitionManager.beginDelayedTransition(this.f37415n);
        this.f37406e.setVideoViewPosition(newVideoViewPosition);
        int iB = (int) (J5.b() * newVideoViewPosition.getWidth());
        int iB2 = (int) (J5.b() * newVideoViewPosition.getHeight());
        G1 g12 = this.f37415n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f37406e.getVideoViewPosition() != null) {
            layoutParams.setMargins(newVideoViewPosition.getX(), newVideoViewPosition.getY(), 0, 0);
        }
        g12.setLayoutParams(layoutParams);
        if (this.f37410i > 0 && this.f37411j > 0) {
            G1 g13 = this.f37415n;
            int i10 = this.f37410i;
            int i11 = this.f37411j;
            g13.getClass();
            if (i10 > 0 && i11 > 0) {
                g13.f36915a = i10 / i11;
                g13.requestLayout();
            }
        }
        this.f37415n.requestLayout();
    }

    public final void a(AbstractC3676e8 abstractC3676e8) {
        Surface surface;
        if (abstractC3676e8 instanceof C3702f8) {
            C3702f8 c3702f8 = (C3702f8) abstractC3676e8;
            this.f37418q = c3702f8.f38561a;
            this.f37423v = null;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                eg.i.d(this.f37404c, null, null, new C4200z7(null, this, c3702f8), 3, null);
                return;
            }
            this.f37413l.set(EnumC4034sg.f39534c);
            this.f37417p.seekTo(0L);
            C3927o8 c3927o8 = this.f37427z;
            if (!c3927o8.f39175g && (surface = c3927o8.f39173e) != null) {
                c3927o8.f39175g = true;
                c3927o8.f39170b.setVideoSurface(surface);
            }
            HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
            htmlVideoPlaybackState.setDuration(c3702f8.f38562b / 1000.0f);
            htmlVideoPlaybackState.setVideoUrl(c3702f8.f38561a);
            htmlVideoPlaybackState.setLatency(Long.valueOf(System.currentTimeMillis() - this.f37422u));
            htmlVideoPlaybackState.setMuted(this.f37426y.f37699e);
            EnumC3802j8[] enumC3802j8Arr = EnumC3802j8.f38802a;
            htmlVideoPlaybackState.setState(C4240b4.i.f42650s);
            htmlVideoPlaybackState.setTime(this.f37417p.getCurrentPosition() / 1000.0f);
            a(new C3728g8(htmlVideoPlaybackState, c3702f8.f38563c));
            return;
        }
        if (abstractC3676e8 instanceof C3625c8) {
            this.f37413l.set(EnumC4034sg.f39538g);
            this.f37423v = null;
            a(new C3599b8(this.f37402a, ((C3625c8) abstractC3676e8).f38331a.f36594a.f38033a));
            return;
        }
        throw new lf.m();
    }
}
