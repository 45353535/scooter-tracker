package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.splash.a.c;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final sg.bigo.ads.ad.splash.b f101903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewGroup f101904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final m f101906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final ViewGroup f101907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f101908f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.splash.b bVar, @Nullable m mVar) {
        int i10;
        int i11;
        AdOptionsView adOptionsView;
        sg.bigo.ads.ad.b.b bVar2;
        int i12;
        int i13;
        char c10;
        this.f101905c = c.a.f101953a;
        this.f101906d = mVar;
        this.f101907e = viewGroup;
        this.f101903a = bVar;
        ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), (mVar == null || mVar.a("endpage.guide_click") != 4) ? R.layout.bigo_ad_splash_endpage1 : R.layout.bigo_ad_splash_endpage1_slide, null, false);
        this.f101904b = viewGroup2;
        this.f101905c = c.a.f101955c;
        ArrayList arrayList = new ArrayList();
        final ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.inter_icon);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.inter_description);
        Button button = (Button) viewGroup2.findViewById(R.id.bigo_ad_splash_btn_cta);
        AdOptionsView adOptionsView2 = (AdOptionsView) viewGroup2.findViewById(R.id.inter_options);
        sg.bigo.ads.ad.b.b bVar3 = bVar.f102047z;
        b.d popPage = bVar3.getPopPage();
        if (textView != null) {
            i10 = 4;
            textView.setTag(2);
            i11 = 1;
            sg.bigo.ads.ad.splash.a.a(textView, bVar3.getTitle(), popPage == null ? "" : popPage.b());
            arrayList.add(textView);
        } else {
            i10 = 4;
            i11 = 1;
        }
        if (textView2 != null) {
            textView2.setTag(6);
            sg.bigo.ads.ad.splash.a.a(textView2, bVar3.getDescription(), popPage == null ? "" : popPage.c());
            arrayList.add(textView2);
        }
        if (button != null) {
            button.setTag(7);
            sg.bigo.ads.ad.splash.a.a(button, bVar3.getCallToAction(), "");
            arrayList.add(button);
            if (mVar != null) {
                int iA = r.a(bVar3, mVar.a("endpage.cta_color"), null);
                if (button.getBackground() instanceof GradientDrawable) {
                    ((GradientDrawable) button.getBackground()).setColor(iA);
                }
            }
        }
        if (adOptionsView2 != null) {
            adOptionsView2.setTag(Integer.valueOf(i10));
            adOptionsView2.a(bVar3.f(), ((sg.bigo.ads.core.a.a) bVar3.f()).l());
        }
        if (imageView != null) {
            String strC = ((sg.bigo.ads.core.a.a) bVar3.f()).av() != null ? ((sg.bigo.ads.core.a.a) bVar3.f()).av().c() : null;
            imageView.setTag(Integer.valueOf(i11));
            if (q.a((CharSequence) strC) || !URLUtil.isNetworkUrl(strC)) {
                a(imageView);
            } else {
                sg.bigo.ads.common.p.e.b(bVar.f100335b.f102178e, null, strC, ((sg.bigo.ads.core.a.a) bVar3.f()).al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.a.1
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i14, @NonNull String str, String str2) {
                        a.this.a(imageView);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
        }
        View viewFindViewById = viewGroup2.findViewById(R.id.layout_contain_view);
        if (viewFindViewById == null || mVar == null) {
            adOptionsView = adOptionsView2;
            bVar2 = bVar3;
            i12 = i10;
            i13 = 1;
        } else {
            int i14 = i11;
            int iA2 = mVar.a("endpage.click_type", i14);
            adOptionsView = adOptionsView2;
            sg.bigo.ads.ad.splash.a.a(viewGroup2, viewFindViewById, mVar.a("endpage.below_area_dp"), mVar.a("endpage.below_area_clickable") == i14 ? i14 : 0, mVar.a("endpage.up_area_dp"), mVar.a("endpage.up_area_clickable") == i14, 9, iA2, bVar3);
            i13 = iA2;
            bVar2 = bVar3;
            i12 = i10;
            if (imageView != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, imageView, i12, bVar2, i13);
            }
        }
        if (mVar == null || 1 != mVar.a("endpage.other_space_clickable_switch", 1)) {
            c10 = 0;
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, i12, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.splash.a.a.2
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i15, int i16, int i17, int i18, int i19, int i20) {
                }
            }, 0);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, i12, bVar2, i13);
            c10 = 0;
        }
        bVar2.H = 9;
        View[] viewArr = new View[1];
        viewArr[c10] = viewGroup2;
        bVar2.a(viewGroup, (MediaView) null, imageView, adOptionsView, (List<View>) arrayList, 9, viewArr);
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f101905c = c.a.f101956d;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f101905c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(this.f101903a.f102047z, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.a.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10) {
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        g gVar;
        if (!this.f101908f) {
            this.f101908f = true;
            this.f101907e.removeViewAt(1);
            this.f101907e.addView(this.f101904b, 1, new ViewGroup.LayoutParams(-1, -1));
            this.f101904b.setVisibility(8);
        }
        this.f101905c = z10 ? c.a.f101954b : c.a.f101955c;
        this.f101904b.setVisibility(z10 ? 0 : 8);
        if (z10) {
            sg.bigo.ads.ad.splash.a.f101875b = true;
            m mVar = this.f101906d;
            int iA = mVar != null ? mVar.a("endpage.guide_click") : 0;
            ViewGroup viewGroup2 = (ViewGroup) this.f101904b.findViewById(R.id.bigo_ad_splash_btn_cta_container);
            Button button = (Button) this.f101904b.findViewById(R.id.bigo_ad_splash_btn_cta);
            if (viewGroup2 != null) {
                if (iA == 4 && button != null) {
                    button.setTextSize(2, 15.0f);
                    button.setBackground(null);
                    View viewFindViewById = this.f101904b.findViewById(R.id.splash_footer_bg);
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(0);
                        viewFindViewById.setTag(14);
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, this.f101903a.f102047z, 0);
                    }
                }
                sg.bigo.ads.ad.splash.a.b(viewGroup2, iA);
            }
            View viewFindViewById2 = this.f101904b.findViewById(R.id.layout_playable_loading);
            if (viewFindViewById2 != null && (gVar = this.f101903a.f102046y) != null && gVar.f101995g != 0) {
                m mVar2 = this.f101906d;
                int i11 = (sg.bigo.ads.api.a.i.f102116a.p().a() && 2 == (mVar2 != null ? mVar2.a("endpage.ad_component_layout") : 1)) ? 1 : 0;
                viewFindViewById2.setVisibility(i11 == 0 ? 4 : 0);
                i = i11;
            }
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f101903a.f102047z.f(), i != 0 ? 4 : 1, i10);
        }
    }
}
