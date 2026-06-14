package io.bidmachine.nativead.view;

import ac.i;
import ac.j;
import ac.l;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import bc.b;
import bc.d;
import c9.g;
import dc.t;
import io.bidmachine.core.h;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.nativead.view.a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.f0;
import pd.z;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, VideoPlayerActivity.c {
    public static final C0985a D = new C0985a(null);
    public static VideoPlayerActivity.c E;
    private boolean A;
    private t B;
    private final Lazy C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f81845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f81846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f81847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f81848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f81849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ProgressBar f81850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f81851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f9.a f81852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaPlayer f81853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextureView f81854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Timer f81855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f81856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f81857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f81858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f81859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f81860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f81861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f81862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f81863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile boolean f81864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f81865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f81866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f81867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f81868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f81869z;

    /* JADX INFO: renamed from: io.bidmachine.nativead.view.a$a, reason: collision with other inner class name */
    public static final class C0985a {
        public /* synthetic */ C0985a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0985a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c implements d.a {
        c() {
        }

        @Override // bc.d.a
        public void a(bc.d task, Uri videoFileUri) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
            io.bidmachine.core.a.d("MediaView video is loaded");
            l nativeMediaData = a.this.getNativeMediaData();
            if (nativeMediaData != null) {
                nativeMediaData.g(videoFileUri);
            }
            a.this.R();
        }

        @Override // bc.d.a
        public void b(bc.d task) {
            Intrinsics.checkNotNullParameter(task, "task");
            io.bidmachine.core.a.d("MediaView video is not loaded");
            a.this.c0(t.Image);
            a.this.f81863t = false;
        }
    }

    public static final class d implements b.a {
        d() {
        }

        @Override // bc.b.a
        public void a(bc.b task, Uri videoFileUri, g vastRequest) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
            Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
            io.bidmachine.core.a.d("MediaView video is loaded");
            l nativeMediaData = a.this.getNativeMediaData();
            if (nativeMediaData != null) {
                nativeMediaData.g(videoFileUri);
            }
            l nativeMediaData2 = a.this.getNativeMediaData();
            if (nativeMediaData2 != null) {
                nativeMediaData2.c(vastRequest);
            }
            a.this.R();
        }

        @Override // bc.b.a
        public void b(bc.b task) {
            Intrinsics.checkNotNullParameter(task, "task");
            io.bidmachine.core.a.d("MediaView video is not loaded");
            a.this.c0(t.Image);
            a.this.f81863t = false;
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ec.b invoke() {
            ec.a aVar = ec.a.f69047a;
            Context context = a.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return aVar.a(h9.a.b(context));
        }
    }

    public static final class f extends TimerTask {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(a this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.Q();
            if (this$0.f81865v) {
                this$0.Y();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String i(int i10) {
            return "Video started: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j(int i10) {
            return "Video at first quartile: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String k(int i10) {
            return "Video at midpoint: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l(int i10) {
            return "Video at third quartile: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(a this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.Z();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final int currentPosition;
            try {
                if (a.this.f81864u) {
                    a.this.z();
                    return;
                }
                if (!a.this.L()) {
                    final a aVar = a.this;
                    h.U(new Runnable() { // from class: dc.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.f.h(aVar);
                        }
                    });
                    return;
                }
                try {
                    MediaPlayer mediaPlayer = a.this.f81853j;
                    if (mediaPlayer != null && a.this.M() && !a.this.f81864u && mediaPlayer.isPlaying()) {
                        if (a.this.f81866w == 0) {
                            a.this.f81866w = mediaPlayer.getDuration();
                        }
                        if (a.this.f81866w != 0 && (currentPosition = (mediaPlayer.getCurrentPosition() * 100) / a.this.f81866w) >= a.this.f81867x * 25) {
                            if (a.this.f81867x == 0) {
                                io.bidmachine.core.a.a(new ce.b() { // from class: dc.h
                                    @Override // ce.b
                                    public final Object get() {
                                        return a.f.i(currentPosition);
                                    }
                                });
                                a.this.T(c9.a.start);
                            } else if (a.this.f81867x == 1) {
                                io.bidmachine.core.a.a(new ce.b() { // from class: dc.i
                                    @Override // ce.b
                                    public final Object get() {
                                        return a.f.j(currentPosition);
                                    }
                                });
                                a.this.T(c9.a.firstQuartile);
                            } else if (a.this.f81867x == 2) {
                                io.bidmachine.core.a.a(new ce.b() { // from class: dc.j
                                    @Override // ce.b
                                    public final Object get() {
                                        return a.f.k(currentPosition);
                                    }
                                });
                                a.this.T(c9.a.midpoint);
                            } else if (a.this.f81867x == 3) {
                                io.bidmachine.core.a.a(new ce.b() { // from class: dc.k
                                    @Override // ce.b
                                    public final Object get() {
                                        return a.f.l(currentPosition);
                                    }
                                });
                                a.this.T(c9.a.thirdQuartile);
                            }
                            a.this.f81867x++;
                        }
                    }
                    io.bidmachine.core.a.d("MediaView is on screen");
                    final a aVar2 = a.this;
                    h.U(new Runnable() { // from class: dc.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.f.m(aVar2);
                        }
                    });
                } catch (IllegalStateException unused) {
                    a.this.z();
                }
            } catch (Throwable unused2) {
                a.this.z();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f81862s = false;
            this$0.y();
            this$0.c0(t.Image);
            this$0.Y();
            this$0.f81864u = true;
            this$0.f81863t = false;
            this$0.S();
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
        }
    }

    private final void B() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        this.f81849f = imageView;
        addView(imageView);
    }

    private final MediaPlayer C() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnVideoSizeChangedListener(this);
        mediaPlayer.setAudioStreamType(3);
        this.f81853j = mediaPlayer;
        d0();
        return mediaPlayer;
    }

    private final void D() {
        Context context = getContext();
        float fA = h.A(context);
        int iD = zf.a.d(40 * fA);
        int iD2 = zf.a.d(8 * fA);
        f9.a aVar = new f9.a(context);
        aVar.h(b9.a.f5837a, b9.a.f5839c);
        aVar.setPadding(iD2, iD2, iD2, iD2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iD, iD);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        aVar.setLayoutParams(layoutParams);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: dc.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.nativead.view.a.E(this.f68622b, view);
            }
        });
        this.f81852i = aVar;
        a0();
        addView(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.M()) {
            if (this$0.f81858o) {
                MediaPlayer mediaPlayer = this$0.f81853j;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(1.0f, 1.0f);
                }
                this$0.f81858o = false;
            } else {
                MediaPlayer mediaPlayer2 = this$0.f81853j;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                }
                this$0.f81858o = true;
            }
            this$0.a0();
        }
    }

    private final void F(Object obj) {
        Uri uriJ;
        int iD = zf.a.d(50 * h.A(getContext()));
        String path = null;
        ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleLarge);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iD, iD);
        layoutParams.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams);
        Integer numT = f0.t("#6b000000");
        if (numT != null) {
            progressBar.setBackgroundColor(numT.intValue());
        }
        progressBar.setVisibility(4);
        this.f81850g = progressBar;
        addView(progressBar);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_media_play);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iD, iD);
        layoutParams2.addRule(13, -1);
        imageView.setLayoutParams(layoutParams2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: dc.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.nativead.view.a.G(this.f68618b, view);
            }
        });
        imageView.setVisibility(4);
        this.f81851h = imageView;
        addView(imageView);
        final TextureView textureView = new TextureView(getContext());
        textureView.setSurfaceTextureListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        textureView.setLayoutParams(layoutParams3);
        textureView.setOnClickListener(new View.OnClickListener() { // from class: dc.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.nativead.view.a.H(this.f68619b, textureView, view);
            }
        });
        this.f81854k = textureView;
        addView(textureView);
        D();
        C();
        i iVar = this.f81845b;
        l lVar = this.f81846c;
        if (lVar != null && (uriJ = lVar.j()) != null) {
            path = uriJ.getPath();
        }
        if (path != null && new File(path).exists()) {
            this.f81862s = true;
            return;
        }
        if (iVar != null) {
            c0(t.Loading);
            String videoUrl = iVar.getVideoUrl();
            String videoAdm = iVar.getVideoAdm();
            if (videoUrl != null && !StringsKt.y0(videoUrl)) {
                J(new bc.d(obj, getRepository(), new c(), videoUrl, null, 16, null));
                return;
            }
            if (videoAdm == null || StringsKt.y0(videoAdm)) {
                return;
            }
            d dVar = new d();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            J(new bc.b(context, obj, getRepository(), dVar, videoAdm, null, 32, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81862s = true;
        this$0.Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(a this$0, TextureView this_apply, View view) {
        Uri uriJ;
        String path;
        MediaPlayer mediaPlayer;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        l lVar = this$0.f81846c;
        if (lVar == null || (uriJ = lVar.j()) == null || (path = uriJ.getPath()) == null || (mediaPlayer = this$0.f81853j) == null) {
            return;
        }
        io.bidmachine.core.a.d("Video has been clicked");
        E = this$0;
        this$0.f81865v = true;
        int currentPosition = (this$0.M() && mediaPlayer.isPlaying()) ? mediaPlayer.getCurrentPosition() : 0;
        this$0.Q();
        h.i0(this_apply.getContext(), VideoPlayerActivity.e(this_apply.getContext(), path, currentPosition));
    }

    private final void I(Object obj) {
        if (!this.f81848e) {
            this.f81848e = true;
            B();
            if (this.f81863t) {
                F(obj);
            } else {
                c0(t.Image);
            }
        }
        l lVar = this.f81846c;
        ImageView imageView = this.f81849f;
        if (lVar == null || imageView == null) {
            return;
        }
        cc.a.d(getContext(), imageView, lVar.i(), lVar.b());
    }

    private final void J(Runnable runnable) {
        cc.b.a().execute(runnable);
    }

    private final void K(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h.h0((String) it.next(), cc.b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L() {
        return getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M() {
        return (this.f81864u || this.f81853j == null) ? false : true;
    }

    private final void N() {
        if (this.f81857n) {
            return;
        }
        T(c9.a.complete);
        this.f81857n = true;
        io.bidmachine.core.a.d("MediaView: video finished");
    }

    private final void O() {
        if (this.f81856m) {
            return;
        }
        U();
        this.f81856m = true;
        io.bidmachine.core.a.d("MediaView: video started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        try {
            MediaPlayer mediaPlayer = this.f81853j;
            if (mediaPlayer == null) {
                return;
            }
            if (M() && mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
            if (this.B != t.Loading) {
                c0(t.Paused);
            }
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        Uri uriJ;
        try {
            l lVar = this.f81846c;
            if (lVar == null || (uriJ = lVar.j()) == null || this.f81859p || this.f81860q || this.f81864u) {
                return;
            }
            MediaPlayer mediaPlayer = this.f81853j;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), uriJ);
                mediaPlayer.prepareAsync();
            }
            this.f81860q = true;
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
        }
    }

    private final void S() {
        g gVarA;
        l lVar = this.f81846c;
        if (lVar == null || (gVarA = lVar.a()) == null) {
            return;
        }
        gVarA.X(c9.j.f6611l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(c9.a aVar) {
        j jVar;
        g gVarA;
        VastAd vastAdM;
        Map mapR;
        l lVar = this.f81846c;
        if (lVar != null && (gVarA = lVar.a()) != null && (vastAdM = gVarA.M()) != null && (mapR = vastAdM.r()) != null) {
            K((List) mapR.get(aVar));
        }
        if (aVar != c9.a.complete || (jVar = this.f81847d) == null) {
            return;
        }
        jVar.f();
    }

    private final void U() {
        g gVarA;
        VastAd vastAdM;
        List listP;
        l lVar = this.f81846c;
        if (lVar == null || (gVarA = lVar.a()) == null || (vastAdM = gVarA.M()) == null || (listP = vastAdM.p()) == null) {
            return;
        }
        K(listP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        try {
            MediaPlayer mediaPlayerC = this.f81853j;
            if (mediaPlayerC == null) {
                mediaPlayerC = C();
            }
            if (!this.f81859p) {
                R();
            }
            if (M() && this.f81859p && this.f81861r && L()) {
                if (!mediaPlayerC.isPlaying()) {
                    mediaPlayerC.start();
                    O();
                    if (this.f81855l == null) {
                        X();
                    }
                }
                if (mediaPlayerC.getCurrentPosition() > 0) {
                    t tVar = this.B;
                    t tVar2 = t.Playing;
                    if (tVar != tVar2) {
                        c0(tVar2);
                    }
                }
            }
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
            z();
        }
    }

    private final void a0() {
        if (this.f81858o) {
            f9.a aVar = this.f81852i;
            if (aVar != null) {
                aVar.setImage(b9.a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII="));
                return;
            }
            return;
        }
        f9.a aVar2 = this.f81852i;
        if (aVar2 != null) {
            aVar2.setImage(b9.a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg=="));
        }
    }

    private final void b0() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0 || !this.A || this.f81868y == 0 || this.f81869z == 0) {
            return;
        }
        this.A = false;
        TextureView textureView = this.f81854k;
        if (textureView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
        int i10 = this.f81868y;
        int i11 = this.f81869z;
        if (i10 > i11) {
            layoutParams.width = width;
            layoutParams.height = (width * i11) / i10;
        } else {
            layoutParams.width = (i10 * height) / i11;
            layoutParams.height = height;
        }
        textureView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(t tVar) {
        this.B = tVar;
        int i10 = b.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 == 1) {
            ImageView imageView = this.f81849f;
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.bringToFront();
            }
            if (this.f81863t) {
                TextureView textureView = this.f81854k;
                if (textureView != null) {
                    textureView.setVisibility(4);
                }
                ProgressBar progressBar = this.f81850g;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                ImageView imageView2 = this.f81851h;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
                f9.a aVar = this.f81852i;
                if (aVar == null) {
                    return;
                }
                aVar.setVisibility(4);
                return;
            }
            return;
        }
        if (i10 == 2) {
            ImageView imageView3 = this.f81849f;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                imageView3.bringToFront();
            }
            if (this.f81863t) {
                ProgressBar progressBar2 = this.f81850g;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
                ProgressBar progressBar3 = this.f81850g;
                if (progressBar3 != null) {
                    progressBar3.bringToFront();
                }
                TextureView textureView2 = this.f81854k;
                if (textureView2 != null) {
                    textureView2.setVisibility(4);
                }
                ImageView imageView4 = this.f81851h;
                if (imageView4 != null) {
                    imageView4.setVisibility(4);
                }
                f9.a aVar2 = this.f81852i;
                if (aVar2 == null) {
                    return;
                }
                aVar2.setVisibility(4);
                return;
            }
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            ImageView imageView5 = this.f81849f;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                imageView5.bringToFront();
            }
            if (this.f81863t) {
                ImageView imageView6 = this.f81851h;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                }
                ImageView imageView7 = this.f81851h;
                if (imageView7 != null) {
                    imageView7.bringToFront();
                }
                TextureView textureView3 = this.f81854k;
                if (textureView3 != null) {
                    textureView3.setVisibility(4);
                }
                ProgressBar progressBar4 = this.f81850g;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(4);
                }
                f9.a aVar3 = this.f81852i;
                if (aVar3 == null) {
                    return;
                }
                aVar3.setVisibility(4);
                return;
            }
            return;
        }
        ImageView imageView8 = this.f81849f;
        if (imageView8 != null) {
            imageView8.setVisibility(4);
        }
        if (this.f81863t) {
            TextureView textureView4 = this.f81854k;
            if (textureView4 != null) {
                textureView4.setVisibility(0);
            }
            TextureView textureView5 = this.f81854k;
            if (textureView5 != null) {
                textureView5.bringToFront();
            }
            f9.a aVar4 = this.f81852i;
            if (aVar4 != null) {
                aVar4.setVisibility(0);
            }
            f9.a aVar5 = this.f81852i;
            if (aVar5 != null) {
                aVar5.bringToFront();
            }
            a0();
            ProgressBar progressBar5 = this.f81850g;
            if (progressBar5 != null) {
                progressBar5.setVisibility(4);
            }
            ImageView imageView9 = this.f81851h;
            if (imageView9 == null) {
                return;
            }
            imageView9.setVisibility(4);
        }
    }

    private final void d0() {
        if (M()) {
            if (this.f81858o) {
                MediaPlayer mediaPlayer = this.f81853j;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                    return;
                }
                return;
            }
            MediaPlayer mediaPlayer2 = this.f81853j;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setVolume(1.0f, 1.0f);
            }
        }
    }

    private final void e0() {
        MediaPlayer mediaPlayer;
        N();
        Y();
        Q();
        if (M() && (mediaPlayer = this.f81853j) != null) {
            mediaPlayer.seekTo(0);
        }
        this.f81865v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f0(int i10, boolean z10) {
        return "MediaView videoPlayerActivityClosed, position: " + i10 + ", finished: " + z10;
    }

    private final ec.b getRepository() {
        return (ec.b) this.C.getValue();
    }

    private final void x(Object obj, i iVar, l lVar, j jVar) {
        String videoUrl;
        String videoAdm;
        this.f81845b = iVar;
        this.f81846c = lVar;
        this.f81847d = jVar;
        if (lVar.j() != null || (((videoUrl = iVar.getVideoUrl()) != null && !StringsKt.y0(videoUrl)) || ((videoAdm = iVar.getVideoAdm()) != null && !StringsKt.y0(videoAdm)))) {
            this.f81863t = true;
        }
        I(obj);
    }

    private final void y() {
        MediaPlayer mediaPlayer = this.f81853j;
        if (mediaPlayer == null) {
            return;
        }
        this.f81853j = null;
        try {
            if (!this.f81864u) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.reset();
            }
            mediaPlayer.setOnCompletionListener(null);
            mediaPlayer.setOnErrorListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setOnVideoSizeChangedListener(null);
            mediaPlayer.release();
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        h.U(new Runnable() { // from class: dc.b
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.nativead.view.a.A(this.f68617b);
            }
        });
    }

    public final void P() {
        io.bidmachine.core.a.d("MediaView: onViewAppearOnScreen");
        this.f81861r = true;
        if (this.f81862s) {
            Z();
        } else if (this.B != t.Loading) {
            c0(t.Paused);
        }
    }

    public final void V() {
        new Thread(new Runnable() { // from class: dc.e
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.nativead.view.a.W(this.f68621b);
            }
        }).start();
    }

    public final void X() {
        if (this.f81863t) {
            Timer timer = new Timer();
            this.f81855l = timer;
            timer.schedule(new f(), 0L, 500);
        }
    }

    public final void Y() {
        Timer timer = this.f81855l;
        if (timer != null) {
            timer.cancel();
        }
        this.f81855l = null;
    }

    @Override // io.bidmachine.nativead.view.VideoPlayerActivity.c
    public void a(final int i10, final boolean z10) {
        MediaPlayer mediaPlayer;
        io.bidmachine.core.a.a(new ce.b() { // from class: dc.a
            @Override // ce.b
            public final Object get() {
                return io.bidmachine.nativead.view.a.f0(i10, z10);
            }
        });
        try {
            if (z10) {
                e0();
            } else if (M() && (mediaPlayer = this.f81853j) != null) {
                mediaPlayer.seekTo(i10);
            }
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
        }
        E = null;
    }

    @Nullable
    public final i getNativeData() {
        return this.f81845b;
    }

    @Nullable
    public final j getNativeInteractor() {
        return this.f81847d;
    }

    @Nullable
    public final l getNativeMediaData() {
        return this.f81846c;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        e0();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        io.bidmachine.core.a.d("MediaView: onError");
        z();
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, measuredWidth);
        } else if (mode != 1073741824) {
            size = measuredWidth;
        }
        int i12 = (int) (size * 0.5625f);
        if (mode2 != 1073741824 || size2 >= i12) {
            size2 = i12;
        } else {
            size = (int) (size2 * 1.7777778f);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        io.bidmachine.core.a.d("MediaView: onPrepared");
        this.f81859p = true;
        if (this.f81862s) {
            Z();
        } else {
            c0(t.Paused);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        try {
            MediaPlayer mediaPlayerC = this.f81853j;
            if (mediaPlayerC == null) {
                mediaPlayerC = C();
            }
            mediaPlayerC.setSurface(new Surface(surfaceTexture));
            R();
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
            c0(t.Image);
            this.f81863t = false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.f81868y = i10;
        this.f81869z = i11;
        this.A = true;
        b0();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        if (i10 != 0) {
            Q();
        } else if (this.f81862s) {
            Z();
        }
        super.onWindowVisibilityChanged(i10);
    }

    public final void setInitialized(boolean z10) {
        this.f81848e = z10;
    }

    public final void setNativeAdObject(@NotNull ac.g nativeAdObject) {
        Intrinsics.checkNotNullParameter(nativeAdObject, "nativeAdObject");
        z zVarG = nativeAdObject.G();
        Intrinsics.checkNotNullExpressionValue(zVarG, "nativeAdObject.tag");
        x(zVarG, nativeAdObject, nativeAdObject, nativeAdObject);
    }

    public final void setNativeData(@Nullable i iVar) {
        this.f81845b = iVar;
    }

    public final void setNativeInteractor(@Nullable j jVar) {
        this.f81847d = jVar;
    }

    public final void setNativeMediaData(@Nullable l lVar) {
        this.f81846c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81858o = true;
        this.A = true;
        this.B = t.Image;
        this.C = lf.i.a(new e());
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }
}
