package sg.bigo.ads.ad.interstitial.multi_img;

import android.view.View;
import android.widget.TextView;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static int a(int i10) {
        return i10;
    }

    public static void a(final View view, TextView textView, int i10, final boolean[] zArr, final boolean z10, final long j10) {
        if (k.a(zArr) || zArr.length < 2) {
            return;
        }
        sg.bigo.ads.ad.interstitial.d.a(textView, i10, new b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.e.1
            @Override // sg.bigo.ads.common.w.b.a
            public final long a() {
                return j10;
            }

            @Override // sg.bigo.ads.common.w.b.a
            public final void b(int i11) {
                boolean[] zArr2 = zArr;
                zArr2[1] = true;
                e.a(view, zArr2[0], true, z10);
            }
        });
    }

    public static void a(View view, boolean z10, boolean z11, boolean z12) {
        if (z12 && z10 && z11 && view != null) {
            sg.bigo.ads.ad.interstitial.c.e(view);
        }
    }
}
