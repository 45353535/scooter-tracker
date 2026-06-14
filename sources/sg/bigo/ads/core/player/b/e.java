package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.HashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.player.b.c;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends f implements c.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private int F;
    private boolean G;
    private long H;
    private String I;
    private String J;
    private boolean K;
    private boolean L;
    private View M;
    private b N;
    private final TextureView.SurfaceTextureListener O;
    private final View.OnClickListener P;
    private Runnable Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f104636a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f104637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f104638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f104639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private ImageView f104640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f104641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdImageView f104642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f104643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ProgressBar f104644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f104645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f104646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f104647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f104648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f104649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f104650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f104651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f104652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Runnable f104653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f104654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f104655z;

    public e(Context context, int i10, int i11, @NonNull sg.bigo.ads.api.c.b bVar, @Nullable sg.bigo.ads.core.a.a aVar) {
        sg.bigo.ads.core.a.a aVar2;
        super(context, bVar, aVar);
        this.f104646q = new c();
        this.f104647r = 0;
        this.f104648s = 0;
        this.f104649t = true;
        this.f104655z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.E = false;
        this.H = 0L;
        this.I = "";
        this.J = "";
        this.K = true;
        this.L = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: sg.bigo.ads.core.player.b.e.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f104657b = SystemClock.elapsedRealtime();

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureAvailable");
                sg.bigo.ads.common.n.d.a(e.this.f104654y);
                e.this.a(13, SystemClock.elapsedRealtime() - this.f104657b, 0);
                e.this.H = SystemClock.elapsedRealtime();
                e.this.f104646q.a(new Surface(surfaceTexture));
                sg.bigo.ads.core.a.a aVar3 = e.this.f104666e;
                if (aVar3 != null && aVar3.aZ()) {
                    e.this.f104646q.a(e.this.f104643n);
                    e.d(e.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is not ready, begin to load backup image");
                sg.bigo.ads.core.a.a aVar4 = e.this.f104666e;
                if (aVar4 == null || aVar4.bh() == null) {
                    e.g(e.this);
                    return;
                }
                Pair<Bitmap, String> pairBh = e.this.f104666e.bh();
                if (pairBh != null) {
                    e.this.a(pairBh.first);
                    if (e.this.N != null) {
                        e.this.N.a((Bitmap) pairBh.first);
                    }
                }
                e.this.w();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                sg.bigo.ads.common.t.a.b("VideoPlayView", "onSurfaceTextureDestroyed");
                e.this.d(false);
                c cVar = e.this.f104646q;
                try {
                    if (!c.f104607h.get()) {
                        cVar.f104608a.reset();
                    }
                    sg.bigo.ads.common.n.d.a(cVar.f104614g);
                } catch (IllegalStateException e10) {
                    c.a aVar3 = cVar.f104610c;
                    if (aVar3 != null) {
                        aVar3.a(11, Log.getStackTraceString(e10), cVar.f104615i);
                    }
                    sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "reset IllegalStateException");
                }
                cVar.f104613f = false;
                cVar.f104612e = false;
                if (!e.this.f104650u) {
                    e eVar = e.this;
                    eVar.f104668g = false;
                    if (eVar.f104647r > 0) {
                        e eVar2 = e.this;
                        eVar2.f104648s = eVar2.f104647r;
                    }
                }
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureSizeChanged");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.O = surfaceTextureListener;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (view.getId()) {
                    case 200011:
                        e.this.o();
                        break;
                    case 200012:
                        if (!e.this.G || !e.this.C) {
                            e.this.v();
                        }
                        break;
                }
            }
        };
        this.P = onClickListener;
        this.f104636a = 0;
        this.Q = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.5
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f104641l != null) {
                    e.this.f104641l.setVisibility(8);
                }
            }
        };
        this.J = aVar != null ? aVar.aT() : "";
        if (aVar != null && aVar.bq() != null) {
            this.I = aVar.bq().f104180b;
        }
        w();
        this.f104652w = bVar.f102151f;
        this.f104650u = bVar.f102150e;
        this.f104637h = i10;
        this.f104638i = i11;
        int i12 = bVar.f102146a;
        this.f104651v = bVar.f102147b;
        g gVar = new g(this.f104664c, i10, i11, i12);
        this.f104639j = gVar;
        u.a(gVar, this, null, -1);
        this.f104639j.setSurfaceTextureListener(surfaceTextureListener);
        sg.bigo.ads.core.a.a aVar3 = this.f104666e;
        if (aVar3 != null && aVar3.x() != 2 && y()) {
            sg.bigo.ads.common.n.d.a(this.f104654y);
            if (this.f104654y == null) {
                this.f104654y = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        sg.bigo.ads.core.a.a aVar4 = e.this.f104666e;
                        sg.bigo.ads.core.d.b.a(aVar4, aVar4 != null ? aVar4.aK() : "", 13, "onSurfaceTextureAvailable not called", 0);
                        e.this.a("AdVideoTooLate", new int[]{10311});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, this.f104654y, this.f104652w);
        }
        if (!bVar.f102152g && (aVar2 = this.f104666e) != null && !TextUtils.isEmpty(aVar2.aN())) {
            a(o.b(getContext().getApplicationContext(), this.f104666e.aN()));
        }
        this.f104649t = this.f104646q.a(bVar.f102149d);
        if (!bVar.f102148c) {
            int iB = sg.bigo.ads.common.utils.a.b(this.f104664c, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f104664c);
            this.f104640k = imageView;
            imageView.setId(200011);
            this.f104640k.setOnClickListener(onClickListener);
            this.f104640k.setPadding(iB, iB, iB, iB);
            this.f104640k.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f104664c, this.f104649t ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
            int iB2 = sg.bigo.ads.common.utils.a.b(this.f104664c, R.dimen.bigo_ad_volume_size) + (iB * 2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.f104640k.setVisibility(0);
            u.a(this.f104640k, this, layoutParams, -1);
        }
        sg.bigo.ads.core.a.a aVar4 = this.f104666e;
        boolean z10 = aVar4 != null && aVar4.aO();
        this.G = z10;
        if (z10) {
            z();
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f104664c, R.dimen.bigo_ad_replay_size);
        sg.bigo.ads.core.a.a aVar5 = this.f104666e;
        if (aVar5 != null && aVar5.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f104664c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f104664c);
        this.f104641l = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f104664c, R.drawable.bigo_ad_ic_media_play));
        this.f104641l.setVisibility(this.f104650u ? 0 : 8);
        u.a(this.f104641l, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        this.f104646q.f104610c = this;
        setId(200012);
        setOnClickListener(onClickListener);
        b(0);
    }

    private void A() {
        if (this.f104644o == null) {
            z();
        }
        this.f104644o.setVisibility(8);
    }

    private void B() {
        if (this.f104645p == null) {
            this.f104645p = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = this.f104645p;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        sg.bigo.ads.core.a.a aVar;
        int i10;
        sg.bigo.ads.core.a.a aVar2 = this.f104666e;
        if (aVar2 == null) {
            return;
        }
        Pair<Bitmap, String> pairBh = aVar2.bh();
        if (this.f104666e.aZ()) {
            aVar = this.f104666e;
            i10 = 0;
        } else if (pairBh == null) {
            aVar = this.f104666e;
            i10 = 5;
        } else if (Objects.equals(pairBh.second, this.I)) {
            aVar = this.f104666e;
            i10 = 1;
        } else {
            if (!Objects.equals(pairBh.second, this.J)) {
                return;
            }
            aVar = this.f104666e;
            i10 = 2;
        }
        aVar.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f104646q.g();
        this.f104646q.d();
        this.f104646q.e();
    }

    private boolean y() {
        return this.f104652w > 0;
    }

    private void z() {
        Context context = getContext();
        ProgressBar progressBar = new ProgressBar(context);
        this.f104644o = progressBar;
        progressBar.setBackgroundColor(sg.bigo.ads.common.utils.a.c(context, android.R.color.transparent));
        s.a(context, this.f104644o, R.drawable.bigo_ad_progressbar_white);
        this.f104644o.setVisibility(8);
        u.a(this.f104644o, this, new FrameLayout.LayoutParams(-2, -2, 17), -1);
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "destroy player");
        d(false);
        x();
        setOnEventListener(null);
        this.f104644o = null;
        sg.bigo.ads.common.n.d.a(this.f104653x);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onPlay");
        this.f104650u = false;
        int i10 = this.f104648s;
        if (i10 > 0) {
            this.f104646q.a(i10);
            this.f104648s = -1;
        }
        a("AdVideoPlaying", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void g() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", C4240b4.i.f42653t0);
        a("AdVideoPaused", (int[]) null);
    }

    public final int getAdDuration() {
        return this.f104646q.f();
    }

    public final int getAdRemainingTime() {
        return this.f104646q.c();
    }

    public final ImageView getCoverView() {
        return this.f104642m;
    }

    public final int getCurrentPos() {
        return this.f104647r;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final int getPlayStatus() {
        return this.f104646q.f104611d;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void h() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onStop");
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void j() {
        this.f104650u = true;
        AdImageView adImageView = this.f104642m;
        if (adImageView != null) {
            adImageView.setVisibility(0);
        }
        this.f104641l.setVisibility(this.f104651v ? 8 : 0);
        this.f104641l.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f104664c, R.drawable.bigo_ad_ic_media_play));
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onCompletion play");
        d(false);
        a("AdVideoComplete", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void j_() {
        a("AdVideoStart", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void k() {
        a("AdSizeChange", (int[]) null);
    }

    public final void l() {
        g gVar;
        if (this.f104666e == null || (gVar = this.f104639j) == null || !gVar.isAvailable() || this.L || this.f104666e.bh() == null || this.f104666e.bb()) {
            return;
        }
        Bitmap bitmap = (Bitmap) this.f104666e.bh().first;
        this.L = true;
        B();
        a(bitmap);
        c cVar = this.f104646q;
        a("AdBackupImgReady", new int[]{(cVar == null || TextUtils.isEmpty(cVar.f104609b)) ? 0 : 1});
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean n() {
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onDetachedFromWindow called");
        d(false);
        this.f104644o = null;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility != VISIBLE");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility == VISIBLE");
            d(true);
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i10) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        super.onWindowVisibilityChanged(i10);
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onWindowVisibilityChanged: ".concat(String.valueOf(i10)));
        View view2 = this.M;
        if (view2 != null) {
            if (i10 == 0) {
                u.b(view2);
                view = this.f104639j;
                layoutParams = null;
            } else {
                u.b(this.f104639j);
                view = this.M;
                layoutParams = new FrameLayout.LayoutParams(this.f104637h, this.f104638i);
            }
            u.a(view, this, layoutParams, 0);
        }
    }

    public final void setIVideoPlayerViewListener(b bVar) {
        this.N = bVar;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void setMute(boolean z10) {
        if (this.f104649t == z10) {
            this.A = false;
            return;
        }
        boolean zA = this.f104646q.a(z10);
        this.f104649t = zA;
        ImageView imageView = this.f104640k;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f104664c, zA ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        if (!this.A && !this.B) {
            a("AdVolumeChange", new int[]{this.f104649t ? 0 : 100});
        } else {
            this.A = false;
            this.B = false;
        }
    }

    public final void setPlayInfo$505cff1c(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "setPlayInfo path=" + str + ",position=0");
        this.f104643n = str;
        this.f104647r = 0;
    }

    public final void setSeekPos(int i10) {
        this.f104648s = i10;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void setStatPrepareEventOnce(boolean z10) {
        this.K = z10;
    }

    static /* synthetic */ void d(e eVar) {
        if (eVar.y()) {
            sg.bigo.ads.common.n.d.a(eVar.f104653x);
            if (eVar.f104653x == null) {
                eVar.f104653x = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        e.this.a("AdVideoTooLate", new int[]{10107});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, eVar.f104653x, eVar.f104652w);
        }
    }

    static /* synthetic */ void g(e eVar) {
        if (eVar.f104645p == null) {
            eVar.f104645p = sg.bigo.ads.common.utils.a.a(eVar.getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = eVar.f104645p;
        if (view != null) {
            u.a(view, eVar, new FrameLayout.LayoutParams(-2, -2, 17), -1);
            eVar.f104645p.setVisibility(0);
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final boolean c() {
        return this.f104649t;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean e() {
        return this.f104646q.f104612e;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void i() {
        String str;
        int adRemainingTime = getAdRemainingTime();
        if (this.G && (str = this.f104643n) != null && !str.startsWith("file:")) {
            if (this.D == adRemainingTime) {
                if (!this.E) {
                    if (this.f104644o == null) {
                        z();
                    }
                    this.f104644o.setVisibility(0);
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffering");
                    this.C = true;
                    a("AdVideoBuffering", (int[]) null);
                }
                this.E = true;
            } else {
                if (this.E) {
                    A();
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffered");
                    this.C = false;
                    a("AdVideoBuffered", (int[]) null);
                }
                this.E = false;
            }
            this.D = adRemainingTime;
        }
        if (this.F <= 0) {
            int adDuration = getAdDuration();
            this.F = adDuration;
            if (adDuration <= 0) {
                return;
            }
        }
        int i10 = this.F;
        if (adRemainingTime > i10) {
            adRemainingTime = i10;
        }
        this.f104647r = adRemainingTime;
        a("AdRemainingTimeChange", new int[]{adRemainingTime, i10, (int) ((adRemainingTime * 100.0f) / i10)});
    }

    public final void m() {
        g gVar;
        if (this.f104666e == null || (gVar = this.f104639j) == null || this.L || !gVar.isAvailable() || this.f104666e.bb()) {
            return;
        }
        this.L = true;
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is download success, update media player datasource:  " + this.f104666e.c(getContext()));
        this.f104646q.a(this.f104666e.c(getContext().getApplicationContext()));
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        c cVar = this.f104646q;
        if (cVar.f104612e && cVar.b()) {
            this.f104655z = false;
            if (this.G) {
                A();
            }
            this.E = false;
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "pauseAd called");
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void b() {
        if (this.f104668g || this.f104650u) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "tryStartAd, video is completed play, unregister it from list");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "try start play video ad");
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, long j10, int i11) {
        sg.bigo.ads.core.a.a aVar = this.f104666e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i10, j10, i11);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(int i10, String str, int i11) {
        sg.bigo.ads.core.a.a aVar = this.f104666e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i10, str, i11);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(MediaPlayer mediaPlayer, int i10) {
        sg.bigo.ads.common.n.d.a(this.f104653x);
        A();
        B();
        boolean z10 = this.f104637h == 0 && this.f104638i == 0;
        this.f104637h = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f104638i = videoHeight;
        if (this.L || (z10 && this.f104637h > 0 && videoHeight > 0)) {
            g gVar = this.f104639j;
            gVar.f104675a = this.f104637h;
            gVar.f104676b = videoHeight;
            gVar.requestLayout();
        }
        new HashMap();
        if (this.H > 0) {
            a(10, SystemClock.elapsedRealtime() - this.H, i10);
            this.H = 0L;
        }
        if (this.K) {
            b(18);
        }
        if (this.f104655z || y()) {
            this.f104655z = false;
            b();
        } else {
            if (this.f104668g || this.f104650u) {
                return;
            }
            d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(T t10) {
        if (t10 == 0) {
            return;
        }
        if (this.f104642m == null) {
            AdImageView adImageView = new AdImageView(this.f104664c);
            this.f104642m = adImageView;
            adImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        u.a(this.f104642m, this, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        boolean z10 = false;
        if (t10 instanceof String) {
            String str = (String) t10;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f104642m.setVisibility(0);
            AdImageView adImageView2 = this.f104642m;
            sg.bigo.ads.core.a.a aVar = this.f104666e;
            if (aVar != null && aVar.al()) {
                z10 = true;
            }
            adImageView2.a(str, z10);
            return;
        }
        if (t10 instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) t10;
            this.f104642m.setVisibility(0);
            this.f104642m.setImageBitmap(bitmap);
            ImageView imageView = this.f104640k;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.f104639j.f104675a = bitmap.getWidth();
            this.f104639j.f104676b = bitmap.getHeight();
            this.f104639j.requestLayout();
        }
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void a(boolean z10) {
        super.a(z10);
        this.f104668g = false;
        if (this.f104646q.f104612e) {
            if (!sg.bigo.ads.common.aa.b.a(getContext().getApplicationContext())) {
                sg.bigo.ads.common.t.a.b("VideoPlayView", "screen is off, start ad cancel");
                return;
            }
            if (this.f104646q.a()) {
                this.F = getAdDuration();
                sg.bigo.ads.core.a.a aVar = this.f104666e;
                if (aVar != null) {
                    aVar.j(0);
                }
            }
            AdImageView adImageView = this.f104642m;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            this.f104641l.setVisibility(8);
            d(true);
            return;
        }
        StringBuilder sb2 = new StringBuilder("incorrect status, the player is not prepared");
        sb2.append(z10 ? " wating to play" : ", start ad failed");
        sg.bigo.ads.common.t.a.b("VideoPlayView", sb2.toString());
        this.f104655z = z10;
        int i10 = this.f104636a;
        if (i10 < 8) {
            int i11 = i10 + 1;
            this.f104636a = i11;
            if (i11 == 8) {
                sg.bigo.ads.core.d.b.a(this.f104666e, 3003, 10107, "Not prepared, src path = " + this.f104643n);
            }
        }
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i10) {
        sg.bigo.ads.common.t.a.a("VideoPlayView", "onInfo called, whatInfo = ".concat(String.valueOf(i10)));
        if (i10 == 3) {
            sg.bigo.ads.common.t.a.a("VideoPlayView", "player pushed first video frame for rendering, video started");
            AdImageView adImageView = this.f104642m;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            ImageView imageView = this.f104640k;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f104646q.e();
            this.f104646q = new c();
        }
        sg.bigo.ads.common.t.a.a(2, "VideoPlayView", "An error occurred during the video playback: ".concat(String.valueOf(i10)));
        a("AdError", new int[]{i10, i11});
        if (i10 == -38) {
            sg.bigo.ads.common.t.a.a(0, "VideoPlayView", "onError code = -38, now reset status and init again.Range=" + this.f104647r);
            this.f104646q.a(this.f104643n);
            return true;
        }
        sg.bigo.ads.common.t.a.a(0, "VideoPlayView", "onError code = " + i10 + ", now reset status and init again.Range=" + this.f104647r);
        if (this.f104646q.c() != 0) {
            return true;
        }
        c cVar = this.f104646q;
        if (cVar.f104615i >= 3) {
            return true;
        }
        cVar.b(15);
        return true;
    }
}
