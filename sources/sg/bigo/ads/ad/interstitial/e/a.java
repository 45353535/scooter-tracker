package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final RealtimeBlurLinearLayout f101107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewFlow f101108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final int f101109c;

    private a(RealtimeBlurLinearLayout realtimeBlurLinearLayout, int i10) {
        this.f101107a = realtimeBlurLinearLayout;
        this.f101108b = (ViewFlow) realtimeBlurLinearLayout.findViewById(R.id.inter_icon_ads_view_flow);
        this.f101109c = i10;
    }

    @NonNull
    public static a a(Context context, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar, @NonNull List<NativeAd> list, List<NativeAd> list2) {
        int iA;
        boolean z10;
        d eVar;
        a aVar = new a((RealtimeBlurLinearLayout) sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_interstitial_icon_view_flow, null, false), (int) bVar.k());
        aVar.f101108b.setViewStyle(3);
        aVar.f101108b.setDividerWidth(0);
        if (!bVar.a()) {
            switch (bVar.e()) {
                case 1:
                case 3:
                    aVar.f101108b.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, 20));
                    break;
                case 2:
                case 4:
                    aVar.f101108b.setContentMaxWidthSpace(0);
                    break;
                case 5:
                case 6:
                    aVar.f101108b.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, 47));
                    ((ViewGroup.MarginLayoutParams) aVar.f101108b.getLayoutParams()).bottomMargin = 0;
                    break;
            }
        } else {
            aVar.f101108b.setContentMaxWidthSpace(0);
            ((LinearLayout.LayoutParams) aVar.f101108b.getLayoutParams()).bottomMargin = 0;
        }
        list2.clear();
        while (!sg.bigo.ads.common.utils.k.a((Collection) list)) {
            sg.bigo.ads.ad.interstitial.e.b.a aVar2 = new sg.bigo.ads.ad.interstitial.e.b.a(context);
            if (!sg.bigo.ads.common.utils.k.a((Collection) list)) {
                if (bVar.a()) {
                    z10 = false;
                    iA = 1;
                } else {
                    iA = sg.bigo.ads.ad.interstitial.e.a.b.a(bVar);
                    z10 = true;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                sg.bigo.ads.ad.interstitial.e.b.a.a(arrayList, arrayList2, list, list2, iA);
                if (iA == 1) {
                    list2.addAll(arrayList2);
                    arrayList2.clear();
                }
                if (bVar.a()) {
                    eVar = new k(aVar2, arrayList, bVar);
                } else {
                    int iE = bVar.e();
                    eVar = iE != 2 ? iE != 3 ? iE != 4 ? iE != 5 ? iE != 6 ? new e(aVar2, arrayList, bVar) : new j(aVar2, arrayList, bVar) : new i(aVar2, arrayList, bVar) : new h(aVar2, arrayList, bVar) : new g(aVar2, arrayList, bVar) : new f(aVar2, arrayList, bVar);
                }
                eVar.a(aVar, z10);
                aVar2.f101138a = eVar;
                list = arrayList2;
            }
            ViewFlow.b bVar2 = new ViewFlow.b();
            ((ViewGroup.LayoutParams) bVar2).width = -1;
            ((ViewGroup.LayoutParams) bVar2).height = -2;
            bVar2.f102998e = 48;
            bVar2.f102997d = 3;
            aVar.f101108b.addView(aVar2, bVar2);
        }
        return aVar;
    }
}
