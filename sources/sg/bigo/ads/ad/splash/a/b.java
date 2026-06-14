package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.splash.a.c;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public class b implements h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static Bitmap f101916j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    n f101917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final m f101918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    protected final m f101919c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    n f101921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    n f101922f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    protected sg.bigo.ads.ad.splash.b f101924h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    sg.bigo.ads.api.core.f f101926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f101927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f101928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private View f101929n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    AtomicBoolean f101920d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicBoolean f101923g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f101925i = c.a.f101953a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f101930o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<v> f101931p = new ArrayList();

    public b(@NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @Nullable m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        this.f101924h = bVar;
        this.f101918b = mVar;
        this.f101919c = mVar2;
        this.f101926k = fVar;
        this.f101927l = fVar.f102174a.i();
    }

    private void l() {
        n nVar = this.f101921e;
        if (nVar != null) {
            nVar.b();
            this.f101921e = null;
        }
        if (this.f101928m != null) {
            this.f101928m = null;
        }
    }

    private void m() {
        this.f101925i = c.a.f101956d;
        n nVar = this.f101917a;
        if (nVar != null) {
            nVar.b();
        }
        n nVar2 = this.f101922f;
        if (nVar2 != null) {
            nVar2.b();
        }
        l();
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
        VideoController videoController;
        if (this.f101925i == c.a.f101954b && (videoController = this.f101924h.f102047z.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ad.splash.a.b.1
                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onMuteChange(boolean z10) {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoEnd() {
                    if (!b.this.f101924h.F()) {
                        b.this.f101924h.D();
                    }
                    sg.bigo.ads.ad.splash.b bVar = b.this.f101924h;
                    m mVar = bVar.C;
                    if (mVar == null || mVar.a("endpage.endpage_timing", 0) != 2) {
                        return;
                    }
                    bVar.a(8, 1);
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPause() {
                    b.this.f101924h.B();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPlay() {
                    b.this.f101924h.C();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoStart() {
                    if (b.this.f101923g.compareAndSet(true, false)) {
                        b.this.h();
                        n nVar = b.this.f101917a;
                        if (nVar != null) {
                            nVar.b();
                            b.this.f101917a = null;
                        }
                        b.this.f101924h.A();
                        n nVar2 = b.this.f101922f;
                        if (nVar2 != null) {
                            nVar2.b();
                            b.this.f101922f = null;
                        }
                    }
                }
            });
            videoController.setBackupLoadCallback(new VideoController.a() { // from class: sg.bigo.ads.ad.splash.a.b.5
                @Override // sg.bigo.ads.api.VideoController.a
                public final void i(boolean z10) {
                    sg.bigo.ads.common.t.a.a(0, 4, "SplashAd", "backup image loaded when show default backup style, so cancel this timer");
                    n nVar = b.this.f101921e;
                    if (nVar != null) {
                        nVar.b();
                        b.this.f101921e = null;
                    }
                    n nVar2 = b.this.f101917a;
                    if (nVar2 != null) {
                        nVar2.b();
                        b.this.f101917a = null;
                    }
                    b.this.f101924h.A();
                    n nVar3 = b.this.f101922f;
                    if (nVar3 != null) {
                        nVar3.b();
                        b.this.f101922f = null;
                    }
                }
            });
        }
        h();
        sg.bigo.ads.api.core.f fVar = this.f101924h.D;
        final String strL = fVar == null ? "" : fVar.f102175b.l();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.12
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.controller.c.a.a(strL);
                sg.bigo.ads.common.x.a.j(strL);
                String str = strL;
                sg.bigo.ads.common.x.a.a(str, sg.bigo.ads.common.x.a.i(str) + 1);
                sg.bigo.ads.common.x.a.a(strL, System.currentTimeMillis());
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
        l();
        this.f101920d.set(true);
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void c() {
        m();
        f101916j = null;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f101925i;
    }

    @LayoutRes
    protected int e() {
        return (this.f101919c != null && f()) ? sg.bigo.ads.ad.splash.a.b(this.f101918b) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen_immersive : sg.bigo.ads.ad.splash.a.a(this.f101918b);
    }

    protected final boolean f() {
        m mVar = this.f101919c;
        return mVar != null && 2 == mVar.a("video_play_page.ad_component_layout", 1);
    }

    protected boolean g() {
        return true;
    }

    protected final void h() {
        int iA;
        int iMax;
        int iB;
        final int iA2;
        n nVar = this.f101921e;
        if (nVar != null) {
            nVar.b();
            this.f101921e = null;
        }
        final int i10 = -1;
        if (this.f101923g.get() && this.f101924h.f().bh() == null) {
            m mVar = this.f101919c;
            if (mVar != null && (iA2 = w.a(mVar.a("video_play_page.time_for_auto_click", -1))) > 0) {
                n nVar2 = new n(((long) iA2) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.9
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        if (b.this.f101920d.compareAndSet(false, true)) {
                            sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click after " + iA2 + "s");
                            b.this.f101924h.H();
                        }
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j10) {
                    }
                };
                this.f101921e = nVar2;
                nVar2.c();
            }
            m mVar2 = this.f101919c;
            if (mVar2 == null || (iB = w.b(mVar2.a("video_play_page.time_for_show_backup", -1))) <= 0) {
                return;
            }
            n nVar3 = new n(((long) iB) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.2
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    b.this.f101924h.a(10, 13);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.f101922f = nVar3;
            nVar3.c();
            return;
        }
        m mVar3 = this.f101919c;
        if (mVar3 == null || (iA = mVar3.a("video_play_page.auto_click")) < 2 || iA > 7) {
            return;
        }
        if (iA <= 5) {
            i10 = iA;
        } else if (iA == 7 && (iMax = Math.max(0, this.f101918b.a("splash_duration"))) > 0 && this.f101917a != null) {
            i10 = iMax - 1;
        }
        if (i10 >= 0) {
            n nVar4 = new n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.10
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (b.this.f101920d.compareAndSet(false, true)) {
                        sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click after " + i10 + "s");
                        b.this.f101924h.H();
                    }
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.f101921e = nVar4;
            nVar4.c();
        } else if (iA == 6) {
            this.f101928m = new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f101920d.compareAndSet(false, true)) {
                        sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click after ");
                        b.this.f101924h.H();
                    }
                }
            };
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final AtomicBoolean i() {
        return this.f101923g;
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void j() {
        Runnable runnable = this.f101928m;
        if (runnable != null) {
            runnable.run();
            this.f101928m = null;
        }
    }

    final void k() {
        this.f101930o = 2;
        Iterator<v> it = this.f101931p.iterator();
        while (it.hasNext()) {
            it.next().a();
            it.remove();
        }
    }

    protected void a(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
        boolean zG = g();
        if (viewGroup2 != null) {
            if (zG) {
                sg.bigo.ads.ad.splash.a.a(viewGroup2, i10);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
    }

    final void a(@NonNull sg.bigo.ads.ad.b.b bVar, final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(bVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.8.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void a(v vVar) {
        if (vVar == null) {
            return;
        }
        if (f101916j != null) {
            vVar.a();
            return;
        }
        this.f101931p.add(vVar);
        if (this.f101930o == 1) {
            return;
        }
        sg.bigo.ads.api.core.n nVar = (sg.bigo.ads.api.core.n) this.f101924h.f102047z.f();
        if (!nVar.aR()) {
            String strAT = nVar.aT();
            if (q.a((CharSequence) strAT)) {
                k();
                return;
            } else {
                this.f101930o = 1;
                sg.bigo.ads.common.p.e.a(this.f101924h.f100335b.f102178e, strAT, nVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.b.4
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str, String str2) {
                        b.this.k();
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        b.f101916j = bitmap;
                        b.this.k();
                    }
                });
                return;
            }
        }
        String strB = o.b(this.f101924h.f100335b.f102178e, nVar.aN());
        if (q.a((CharSequence) strB)) {
            k();
            return;
        }
        this.f101930o = 1;
        final String path = Uri.parse(strB).getPath();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.f101916j = sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), b.this.f101924h.f100335b.f102178e);
                b.this.k();
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void a(boolean z10) {
        if (!z10) {
            n nVar = this.f101921e;
            if (nVar != null) {
                nVar.d();
            }
            n nVar2 = this.f101922f;
            if (nVar2 != null) {
                nVar2.d();
                return;
            }
            return;
        }
        n nVar3 = this.f101921e;
        if (nVar3 != null && nVar3.e()) {
            this.f101921e.c();
        }
        n nVar4 = this.f101922f;
        if (nVar4 == null || !nVar4.e()) {
            return;
        }
        this.f101922f.c();
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        View view;
        boolean z11;
        String title;
        int i14;
        if (z10) {
            View view2 = this.f101929n;
            if (view2 == null) {
                this.f101925i = c.a.f101954b;
                sg.bigo.ads.api.core.n nVar = (sg.bigo.ads.api.core.n) this.f101924h.f102047z.f();
                if (nVar.w() == 2 && !nVar.aZ()) {
                    this.f101923g.set(true);
                }
                this.f101929n = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), e(), null, false);
                viewGroup.addView(this.f101929n, 1, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.setTag(11);
                MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
                if (mediaView != null) {
                    mediaView.setImageBlurBorder(false);
                }
                AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
                final sg.bigo.ads.ad.b.b bVar = this.f101924h.f102047z;
                List<View> arrayList = new ArrayList<>();
                boolean zB = sg.bigo.ads.ad.splash.a.b(this.f101918b);
                final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
                if (imageView != null) {
                    imageView.setTag(1);
                    if (zB) {
                        sg.bigo.ads.api.b bVar2 = this.f101926k.f102176c;
                        if ((bVar2 instanceof SplashAdRequest) && (i14 = ((SplashAdRequest) bVar2).f102100i) != 0) {
                            imageView.setImageResource(i14);
                        }
                        i11 = 2;
                    } else {
                        String strC = nVar.av() != null ? nVar.av().c() : null;
                        if (q.a((CharSequence) strC) || !URLUtil.isNetworkUrl(strC)) {
                            i11 = 2;
                            a(bVar, imageView);
                        } else {
                            i11 = 2;
                            sg.bigo.ads.common.p.e.b(this.f101924h.f100335b.f102178e, null, strC, nVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.b.6
                                @Override // sg.bigo.ads.common.p.g
                                public final void a(int i15, @NonNull String str, String str2) {
                                    b bVar3 = b.this;
                                    if (bVar3.f101925i == c.a.f101954b) {
                                        bVar3.a(bVar, imageView);
                                    }
                                }

                                @Override // sg.bigo.ads.common.p.g
                                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                                    if (b.this.f101925i == c.a.f101954b) {
                                        imageView.setImageBitmap(bitmap);
                                    }
                                }
                            });
                        }
                    }
                } else {
                    i11 = 2;
                }
                TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
                if (textView != null) {
                    textView.setTag(Integer.valueOf(i11));
                    if (zB) {
                        sg.bigo.ads.api.b bVar3 = this.f101926k.f102176c;
                        title = bVar3 instanceof SplashAdRequest ? ((SplashAdRequest) bVar3).f102101j : null;
                    } else {
                        title = bVar.getTitle();
                    }
                    if (!TextUtils.isEmpty(title)) {
                        textView.setText(title);
                    }
                }
                TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
                TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
                if (q.a((CharSequence) this.f101927l)) {
                    textView2.setVisibility(8);
                    i12 = 8;
                } else {
                    textView3.setText(R.string.bigo_ad_tag);
                    textView2.setText(this.f101927l);
                    i12 = 8;
                    textView2.setPadding(sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1));
                }
                Button button = (Button) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta);
                if (button != null) {
                    button.setTag(7);
                    if (!TextUtils.isEmpty(bVar.getCallToAction())) {
                        button.setText(bVar.getCallToAction());
                    }
                    arrayList.add(button);
                    if (sg.bigo.ads.ad.splash.a.b()) {
                        button.getLayoutParams().width = sg.bigo.ads.common.utils.e.a(button.getContext(), 333);
                    }
                    Drawable background = button.getBackground();
                    m mVar = this.f101919c;
                    if (mVar != null && (background instanceof GradientDrawable)) {
                        ((GradientDrawable) background).setColor(r.a(bVar, mVar.a("video_play_page.cta_color"), null));
                    }
                }
                TextView textView4 = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_description);
                if (textView4 != null) {
                    textView4.setTag(6);
                    String description = bVar.getDescription();
                    if (!TextUtils.isEmpty(description)) {
                        textView4.setText(description);
                    }
                    arrayList.add(textView4);
                }
                TextView textView5 = (TextView) viewGroup.findViewById(R.id.inter_warning);
                if (textView5 != null) {
                    textView5.setTag(Integer.valueOf(i12));
                    String warning = bVar.getWarning();
                    if (!TextUtils.isEmpty(warning)) {
                        textView5.setText(warning);
                    }
                    arrayList.add(textView5);
                }
                ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.splash_rating_star);
                if (imageView2 != null) {
                    String creativeId = bVar.getCreativeId();
                    if (creativeId == null) {
                        creativeId = "";
                    }
                    Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(imageView2.getContext(), (sg.bigo.ads.ad.b.e.a(creativeId, 4) * 0.5f) + 3.5f, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
                    if (bitmapA != null) {
                        imageView2.setTag(26);
                        imageView2.setImageBitmap(bitmapA);
                    }
                }
                bVar.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
                if (mediaView != null) {
                    if (sg.bigo.ads.ad.splash.a.b()) {
                        mediaView.getLayoutParams().width = -2;
                        mediaView.getLayoutParams().height = -1;
                    }
                    if (bVar.getCreativeType() == NativeAd.CreativeType.VIDEO) {
                        mediaView.b().a(false);
                    }
                }
                if (this.f101919c != null) {
                    sg.bigo.ads.core.adview.h hVar = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.splash.a.b.7
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i15, int i16, int i17, int i18, int i19, int i20) {
                        }
                    };
                    View viewFindViewById = viewGroup.findViewById(R.id.layout_contain_view);
                    int iA = this.f101919c.a("video_play_page.click_type");
                    if (mediaView != null) {
                        if (this.f101919c.c("video_play_page.media_view_clickable_switch")) {
                            sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, i12, bVar, iA);
                        } else {
                            sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, i12, hVar, iA);
                        }
                        if (viewFindViewById != null) {
                            viewFindViewById.setTag(9);
                        }
                        if (this.f101919c.c("video_play_page.other_space_clickable_switch")) {
                            mediaView.setOtherClickAreaClick(true);
                            i13 = 8;
                            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 8, bVar, iA);
                            if (viewFindViewById != null) {
                                sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, bVar, iA);
                            }
                        } else {
                            i13 = 8;
                            mediaView.setOtherClickAreaClick(false);
                            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 8, hVar, iA);
                            if (viewFindViewById != null) {
                                sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, hVar, iA);
                            }
                        }
                    } else {
                        i13 = i12;
                    }
                    if (button != null) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, button, i13, bVar, iA);
                    }
                    if (imageView != null) {
                        if (zB) {
                            sg.bigo.ads.ad.b.a.a(viewGroup, imageView, i13, hVar, iA);
                        } else {
                            sg.bigo.ads.ad.b.a.a(viewGroup, imageView, i13, bVar, iA);
                        }
                    }
                    if (textView != null) {
                        if (zB) {
                            sg.bigo.ads.ad.b.a.a(viewGroup, textView, i13, hVar, iA);
                        } else {
                            sg.bigo.ads.ad.b.a.a(viewGroup, textView, i13, bVar, iA);
                        }
                    }
                    View viewFindViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
                    if (viewFindViewById2 != null) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById2, i13, hVar, iA);
                    }
                    View viewFindViewById3 = viewGroup.findViewById(R.id.layout_ad_component);
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setTag(18);
                        if (this.f101919c.c("video_play_page.ad_component_clickable_switch")) {
                            sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById3, 8, bVar, iA);
                        } else {
                            sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById3, 8, hVar, iA);
                        }
                    }
                    if (viewFindViewById != null) {
                        int iA2 = this.f101919c.a("video_play_page.below_area_dp");
                        if (this.f101919c.a("video_play_page.below_area_clickable") == 1) {
                            view = viewFindViewById;
                            z11 = true;
                        } else {
                            view = viewFindViewById;
                            z11 = false;
                        }
                        sg.bigo.ads.ad.splash.a.a(viewGroup, view, iA2, z11, this.f101919c.a("video_play_page.up_area_dp"), this.f101919c.a("video_play_page.up_area_clickable") == 1, 8, iA, bVar);
                    }
                } else {
                    int iA3 = this.f101918b.a("splash_clickable_area");
                    if (iA3 == 1) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 1, bVar, 0);
                    } else if (iA3 == i11 && mediaView != null) {
                        mediaView.setOnTouchListener(null);
                    }
                }
                int iA4 = this.f101918b.a("splash_cta_type");
                m mVar2 = this.f101919c;
                if (mVar2 != null) {
                    int iA5 = mVar2.a("video_play_page.is_cta_show_animation");
                    if (iA5 <= 0 || iA5 > 6) {
                        iA5 = 1;
                    }
                    iA4 = iA5 - 1;
                }
                if (iA4 == 5 && button != null) {
                    button.setTextSize(2, 15.0f);
                    button.setBackground(null);
                    View viewFindViewById4 = viewGroup.findViewById(R.id.splash_footer_bg);
                    if (viewFindViewById4 != null) {
                        viewFindViewById4.setVisibility(0);
                        viewFindViewById4.setTag(14);
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById4, this.f101919c != null ? 8 : 1, bVar, 0);
                    }
                }
                a(viewGroup, iA4);
                return;
            }
            this.f101925i = c.a.f101954b;
            view2.setVisibility(0);
            return;
        }
        View view3 = this.f101929n;
        if (view3 != null) {
            this.f101925i = c.a.f101955c;
            view3.setVisibility(8);
            m();
        }
    }
}
