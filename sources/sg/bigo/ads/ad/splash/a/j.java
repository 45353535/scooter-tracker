package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ad.splash.a.c;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final m f102033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final m f102034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected sg.bigo.ads.ad.splash.b f102035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f102036d = c.a.f101953a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    sg.bigo.ads.api.core.f f102037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f102038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private View f102039g;

    public j(@NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @NonNull m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        this.f102035c = bVar;
        this.f102033a = mVar;
        this.f102034b = mVar2;
        this.f102037e = fVar;
        this.f102038f = fVar.f102174a.i();
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
        VideoController videoController;
        if (this.f102036d == c.a.f101954b && (videoController = this.f102035c.f102047z.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ad.splash.a.j.1
                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onMuteChange(boolean z10) {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoEnd() {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPause() {
                    j.this.f102035c.B();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPlay() {
                    j.this.f102035c.C();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoStart() {
                }
            });
        }
        sg.bigo.ads.api.core.f fVar = this.f102035c.D;
        final String strL = fVar == null ? "" : fVar.f102175b.l();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.j.2
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
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f102036d = c.a.f101956d;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f102036d;
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final AtomicBoolean i() {
        return new AtomicBoolean(false);
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void j() {
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void a(v vVar) {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10) {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        int i11;
        if (z10) {
            View view = this.f102039g;
            if (view == null) {
                this.f102036d = c.a.f101954b;
                sg.bigo.ads.ad.b.b bVar = this.f102035c.f102047z;
                if (bVar != null) {
                    n nVar = (n) bVar.f();
                    String title = null;
                    this.f102039g = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), sg.bigo.ads.ad.splash.a.b(this.f102033a) ? R.layout.bigo_ad_splash_style_halfscreen_vpaid : R.layout.bigo_ad_splash_style_fullscreen_vpaid, null, false);
                    viewGroup.addView(this.f102039g, 1, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup.setTag(11);
                    MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
                    if (mediaView != null) {
                        mediaView.setImageBlurBorder(false);
                    }
                    AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
                    ArrayList arrayList = new ArrayList();
                    boolean zB = sg.bigo.ads.ad.splash.a.b(this.f102033a);
                    final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
                    if (imageView != null) {
                        imageView.setTag(1);
                        if (zB) {
                            sg.bigo.ads.api.b bVar2 = this.f102037e.f102176c;
                            if ((bVar2 instanceof SplashAdRequest) && (i11 = ((SplashAdRequest) bVar2).f102100i) != 0) {
                                imageView.setImageResource(i11);
                            }
                        } else {
                            String strC = nVar.av() != null ? nVar.av().c() : null;
                            if (!q.a((CharSequence) strC) && URLUtil.isNetworkUrl(strC)) {
                                sg.bigo.ads.common.p.e.b(this.f102035c.f100335b.f102178e, null, strC, nVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.j.3
                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(int i12, @NonNull String str, String str2) {
                                    }

                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                                        if (j.this.f102036d == c.a.f101954b) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                    }
                                });
                            }
                        }
                    }
                    TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
                    if (textView != null) {
                        textView.setTag(2);
                        if (zB) {
                            sg.bigo.ads.api.b bVar3 = this.f102037e.f102176c;
                            if (bVar3 instanceof SplashAdRequest) {
                                title = ((SplashAdRequest) bVar3).f102101j;
                            }
                        } else {
                            title = bVar.getTitle();
                        }
                        if (!TextUtils.isEmpty(title)) {
                            textView.setText(title);
                        }
                    }
                    TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
                    TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
                    if (textView2 != null && textView3 != null) {
                        if (q.a((CharSequence) this.f102038f)) {
                            textView2.setVisibility(8);
                        } else {
                            textView3.setText(R.string.bigo_ad_tag);
                            textView2.setText(this.f102038f);
                            textView2.setPadding(sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1));
                        }
                    }
                    sg.bigo.ads.core.adview.h hVar = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.splash.a.j.4
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i12, int i13, int i14, int i15, int i16, int i17) {
                        }
                    };
                    View viewFindViewById = viewGroup.findViewById(R.id.layout_contain_view);
                    int iA = this.f102034b.a("video_play_page.click_type");
                    if (mediaView != null) {
                        mediaView.b().a(this.f102034b.a("video_play_page.media_view_clickable_switch") == 1);
                    }
                    if (viewFindViewById != null) {
                        viewFindViewById.setTag(9);
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, this.f102034b.a("video_play_page.other_space_clickable_switch") == 1 ? bVar : hVar, iA);
                    }
                    bVar.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
                    if (mediaView != null && sg.bigo.ads.ad.splash.a.b()) {
                        mediaView.getLayoutParams().width = -2;
                        mediaView.getLayoutParams().height = -1;
                    }
                    View viewFindViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
                    if (viewFindViewById2 != null) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById2, 8, hVar, iA);
                    }
                    if (viewFindViewById != null) {
                        sg.bigo.ads.ad.splash.a.a(viewGroup, viewFindViewById, this.f102034b.a("video_play_page.below_area_dp"), this.f102034b.a("video_play_page.below_area_clickable") == 1, this.f102034b.a("video_play_page.up_area_dp"), this.f102034b.a("video_play_page.up_area_clickable") == 1, 8, iA, bVar);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f102036d = c.a.f101954b;
            view.setVisibility(0);
            return;
        }
        View view2 = this.f102039g;
        if (view2 != null) {
            this.f102036d = c.a.f101955c;
            view2.setVisibility(8);
            this.f102036d = c.a.f101956d;
        }
    }
}
