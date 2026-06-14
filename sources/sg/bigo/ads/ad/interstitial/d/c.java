package sg.bigo.ads.ad.interstitial.d;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public class c extends b {
    public c(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    protected final void F() {
        super.F();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).f100951y;
        if (realtimeBlurLinearLayout != null) {
            ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += -sg.bigo.ads.common.utils.e.a(((b) this).f100951y.getContext(), 60);
                ((b) this).f100951y.requestLayout();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    protected int z() {
        return R.id.inter_component_20;
    }
}
