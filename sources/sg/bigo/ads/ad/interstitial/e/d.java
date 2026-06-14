package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.e.a.b;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final sg.bigo.ads.ad.interstitial.e.b.a f101194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final List<NativeAd> f101195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final sg.bigo.ads.ad.interstitial.e.a.b f101196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    protected final Context f101197d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final b.a f101200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final float f101201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f101202i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f101199f = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    protected final b f101198e = a();

    public d(@NonNull sg.bigo.ads.ad.interstitial.e.b.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        this.f101194a = aVar;
        this.f101195b = list;
        this.f101196c = bVar;
        this.f101197d = aVar.getContext();
        this.f101200g = bVar.c();
        this.f101201h = sg.bigo.ads.common.utils.e.a(r2, 1);
        this.f101202i = sg.bigo.ads.common.utils.e.a(r2, 4);
    }

    @Nullable
    protected abstract List<View> a(@NonNull a aVar);

    protected abstract b a();

    protected final void a(int i10, int i11, int i12, int i13) {
        this.f101194a.setPadding(sg.bigo.ads.common.utils.e.a(this.f101197d, i10), sg.bigo.ads.common.utils.e.a(this.f101197d, i11), sg.bigo.ads.common.utils.e.a(this.f101197d, i12), sg.bigo.ads.common.utils.e.a(this.f101197d, i13));
    }

    public final int b() {
        return this.f101195b.size();
    }

    protected final void c() {
        a(this.f101194a, (b) null);
    }

    protected final void a(@NonNull View view) {
        a(view, (b) null);
    }

    protected final void b(@NonNull View view) {
        view.setPadding(sg.bigo.ads.common.utils.e.a(this.f101197d, 12), sg.bigo.ads.common.utils.e.a(this.f101197d, 0), sg.bigo.ads.common.utils.e.a(this.f101197d, 12), sg.bigo.ads.common.utils.e.a(this.f101197d, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(@NonNull View view, @Nullable b bVar) {
        if (bVar == null) {
            bVar = this.f101198e;
        }
        if (bVar == null || view == 0) {
            return;
        }
        Drawable drawableA = bVar.a();
        if (drawableA != null) {
            view.setBackground(drawableA);
            view.setPadding(0, 0, 0, 0);
        } else if (view instanceof sg.bigo.ads.common.view.a.c) {
            ((sg.bigo.ads.common.view.a.c) view).setBlurStyle(bVar);
        }
    }

    protected void a(TextView textView) {
    }

    public final void a(@NonNull a aVar, boolean z10) {
        this.f101194a.removeAllViews();
        List<View> listA = a(aVar);
        if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
            return;
        }
        for (int i10 = 0; i10 < listA.size() && i10 < this.f101195b.size(); i10++) {
            View view = listA.get(i10);
            NativeAd nativeAd = this.f101195b.get(i10);
            if (view != null && nativeAd != null) {
                ArrayList arrayList = new ArrayList();
                RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(R.id.inter_icon_ads_icon_item_layout);
                if (roundedFrameLayout != null) {
                    roundedFrameLayout.setStrokeWidth(this.f101201h);
                    roundedFrameLayout.setStrokeColor(this.f101200g.f101131j);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.inter_icon_ads_item_icon);
                if (imageView != null) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setTag(1);
                    arrayList.add(imageView);
                    imageView.setBackgroundColor(this.f101200g.f101130i);
                    imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(imageView.getContext(), R.drawable.bigo_ad_icon_default));
                }
                TextView textView = (TextView) view.findViewById(R.id.inter_icon_ads_item_title);
                if (textView != null) {
                    if (z10) {
                        textView.setTextColor(this.f101200g.f101125d);
                    }
                    textView.setText(nativeAd.getTitle());
                    textView.setTag(2);
                    arrayList.add(textView);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.inter_icon_ads_item_sponsored);
                if (textView2 != null) {
                    if (z10) {
                        textView2.setTextColor(this.f101200g.f101125d);
                    }
                    textView2.setText(nativeAd.getSponsored());
                    textView2.setTag(3);
                    a(textView2);
                    arrayList.add(textView2);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.inter_icon_ads_item_desc);
                if (textView3 != null) {
                    if (z10) {
                        textView3.setTextColor(this.f101200g.f101125d);
                    }
                    textView3.setText(nativeAd.getDescription());
                    textView3.setTag(6);
                    arrayList.add(textView3);
                }
                Button button = (Button) view.findViewById(R.id.inter_icon_ads_item_btn_cta);
                if (button != null) {
                    button.setText(nativeAd.getCallToAction());
                    button.setTag(7);
                    arrayList.add(button);
                    float f10 = this.f101202i;
                    b.a aVar2 = this.f101200g;
                    button.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, aVar2.f101132k, aVar2.f101133l, this.f101201h));
                }
                ViewGroup viewGroup = listA.size() == 1 ? this.f101194a : (ViewGroup) view;
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    sg.bigo.ads.ad.b.b bVar = (sg.bigo.ads.ad.b.b) nativeAd;
                    bVar.H = this.f101196c.l();
                    if (this.f101199f) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 1, bVar, this.f101196c.l());
                    }
                }
                nativeAd.registerViewForInteraction(viewGroup, (MediaView) null, imageView, (AdOptionsView) null, arrayList);
            }
        }
    }

    protected final void a(@Nullable b bVar) {
        a(this.f101194a, bVar);
    }
}
