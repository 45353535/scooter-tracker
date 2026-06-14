package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f101203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final b f101204j;

    public j(@NonNull sg.bigo.ads.ad.interstitial.e.b.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        super(aVar, list, bVar);
        this.f101203i = sg.bigo.ads.common.utils.e.a(this.f101197d, 72);
        this.f101204j = new b(sg.bigo.ads.common.utils.e.a(this.f101197d, 8), this.f101201h, this.f101200g);
    }

    private List<View> a(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @Nullable View view6) {
        c();
        this.f101194a.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        arrayList.add(view3);
        arrayList.add(view4);
        arrayList.add(view5);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.f101197d);
        linearLayout.setOrientation(0);
        this.f101194a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view2, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view3, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.f101197d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f101197d, 12);
        this.f101194a.addView(linearLayout2, layoutParams);
        linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view4, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view5, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        if (view6 != null) {
            arrayList.add(view6);
            linearLayout2.addView(view6, new LinearLayout.LayoutParams(this.f101203i, -2));
        } else {
            linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(this.f101203i, -2));
        }
        linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    @Nullable
    protected final List<View> a(@NonNull a aVar) {
        int size = this.f101195b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f101199f = true;
            View viewA = sg.bigo.ads.common.utils.a.a(this.f101197d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f101194a, false);
            a(this.f101204j);
            this.f101194a.setOrientation(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(viewA);
            a(20, 16, 20, 16);
            this.f101194a.addView(viewA, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(this.f101197d, 60)));
            return arrayList;
        }
        if (size == 2) {
            this.f101199f = true;
            Context context = this.f101197d;
            int i10 = R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1;
            View viewA2 = sg.bigo.ads.common.utils.a.a(context, i10, this.f101194a, false);
            View viewA3 = sg.bigo.ads.common.utils.a.a(this.f101197d, i10, this.f101194a, false);
            a(this.f101204j);
            this.f101194a.setOrientation(1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(viewA2);
            arrayList2.add(viewA3);
            a(20, 16, 20, 16);
            int iA = sg.bigo.ads.common.utils.e.a(this.f101197d, 60);
            this.f101194a.addView(viewA2, new LinearLayout.LayoutParams(-1, iA));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iA);
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f101197d, 20);
            this.f101194a.addView(viewA3, layoutParams);
            return arrayList2;
        }
        if (size == 3) {
            Context context2 = this.f101197d;
            int i11 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
            View viewA4 = sg.bigo.ads.common.utils.a.a(context2, i11, this.f101194a, false);
            View viewA5 = sg.bigo.ads.common.utils.a.a(this.f101197d, i11, this.f101194a, false);
            View viewA6 = sg.bigo.ads.common.utils.a.a(this.f101197d, i11, this.f101194a, false);
            c();
            this.f101194a.setOrientation(0);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(viewA4);
            arrayList3.add(viewA5);
            arrayList3.add(viewA6);
            a(0, 0, 0, 16);
            this.f101194a.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f101194a.addView(viewA4, new LinearLayout.LayoutParams(this.f101203i, -2));
            this.f101194a.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f101194a.addView(viewA5, new LinearLayout.LayoutParams(this.f101203i, -2));
            this.f101194a.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f101194a.addView(viewA6, new LinearLayout.LayoutParams(this.f101203i, -2));
            this.f101194a.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            return arrayList3;
        }
        if (size != 4) {
            if (size != 5) {
                Context context3 = this.f101197d;
                int i12 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
                return a(sg.bigo.ads.common.utils.a.a(context3, i12, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i12, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i12, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i12, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i12, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i12, this.f101194a, false));
            }
            Context context4 = this.f101197d;
            int i13 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
            return a(sg.bigo.ads.common.utils.a.a(context4, i13, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i13, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i13, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i13, this.f101194a, false), sg.bigo.ads.common.utils.a.a(this.f101197d, i13, this.f101194a, false), null);
        }
        Context context5 = this.f101197d;
        int i14 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
        View viewA7 = sg.bigo.ads.common.utils.a.a(context5, i14, this.f101194a, false);
        View viewA8 = sg.bigo.ads.common.utils.a.a(this.f101197d, i14, this.f101194a, false);
        View viewA9 = sg.bigo.ads.common.utils.a.a(this.f101197d, i14, this.f101194a, false);
        View viewA10 = sg.bigo.ads.common.utils.a.a(this.f101197d, i14, this.f101194a, false);
        c();
        this.f101194a.setOrientation(1);
        this.f101194a.setGravity(1);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(viewA7);
        arrayList4.add(viewA8);
        arrayList4.add(viewA9);
        arrayList4.add(viewA10);
        arrayList4.add(viewA10);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.f101197d);
        linearLayout.setOrientation(0);
        this.f101194a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(viewA7, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(viewA8, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.f101197d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f101197d, 12);
        this.f101194a.addView(linearLayout2, layoutParams2);
        linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(viewA9, new LinearLayout.LayoutParams(this.f101203i, -1));
        linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(viewA10, new LinearLayout.LayoutParams(this.f101203i, -2));
        linearLayout2.addView(new Space(this.f101197d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList4;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    protected final b a() {
        float fA = sg.bigo.ads.common.utils.e.a(this.f101197d, 8);
        return new b(fA, fA, fA, fA, new Rect(0, sg.bigo.ads.common.utils.e.a(this.f101197d, 12), 0, 0), this.f101201h, null, this.f101200g);
    }
}
