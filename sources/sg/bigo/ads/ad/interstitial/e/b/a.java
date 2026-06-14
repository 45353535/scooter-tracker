package sg.bigo.ads.ad.interstitial.e.b;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ad.b.b;
import sg.bigo.ads.ad.interstitial.e.d;
import sg.bigo.ads.ad.interstitial.e.j;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RealtimeBlurLinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f101138a;

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    public static void a(List<NativeAd> list, List<NativeAd> list2, List<NativeAd> list3, @NonNull List<NativeAd> list4, int i10) {
        if (list3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<NativeAd> arrayList2 = new ArrayList();
        for (NativeAd nativeAd : list3) {
            if (!(nativeAd instanceof b) || ((b) nativeAd).p()) {
                arrayList.add(nativeAd);
            } else {
                arrayList2.add(nativeAd);
            }
        }
        for (NativeAd nativeAd2 : arrayList2) {
            if (list.size() < i10) {
                list.add(nativeAd2);
                list4.add(nativeAd2);
            } else {
                list2.add(nativeAd2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && list.size() < i10) {
            NativeAd nativeAd3 = (NativeAd) it.next();
            list.add(nativeAd3);
            list4.add(nativeAd3);
            it.remove();
        }
        list2.addAll(arrayList);
        list4.addAll(list2);
    }

    public final d getIconAdsRenderStyle() {
        return this.f101138a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d dVar = this.f101138a;
        if ((dVar instanceof j) && dVar.b() == 4) {
            int defaultSize = (int) ((r0 * 2) + (((View.getDefaultSize(Integer.MIN_VALUE, i10) - (((j) this.f101138a).f101203i * 3.0f)) / 4.0f) * 3.0f));
            setMeasuredDimension(defaultSize, getMeasuredHeight());
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824);
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                measureChildWithMargins(getChildAt(i12), iMakeMeasureSpec, 0, i11, 0);
            }
        }
    }

    private a(@NonNull Context context, byte b10) {
        this(context, (char) 0);
    }

    private a(@NonNull Context context, char c10) {
        super(context, null, 0);
    }
}
