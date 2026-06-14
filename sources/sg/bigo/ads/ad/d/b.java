package sg.bigo.ads.ad.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.banner.c;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.m;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public class b extends m implements c.a {
    protected b(@NonNull Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        ((o) this.f101384y).B.f100271q = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean U() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        return R.layout.bigo_ad_activity_popup_banner;
    }

    @Override // sg.bigo.ads.ad.banner.c.a
    public final void a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = i10 + sg.bigo.ads.common.utils.e.a(this.L, 10);
        int measuredWidth = this.A.getMeasuredWidth();
        int iMin = Math.min(Math.max((i11 - measuredWidth) - sg.bigo.ads.common.utils.e.a(this.L, 10), 0), (this.L.getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.e.a(this.L, 80)) - measuredWidth);
        layoutParams.leftMargin = iMin;
        layoutParams.setMarginStart(iMin);
        this.A.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public final void ah() {
        super.ah();
        this.L.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final void g(@LayoutRes int i10) {
        super.g(i10);
        T t10 = this.f101384y;
        if (t10 != 0) {
            ((o) t10).B.f100271q = this;
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton != null) {
                adCountDownButton.setShowCloseButtonInCountdown(false);
                this.A.setTakeoverTickEvent(false);
                this.A.a(((o) this.f101384y).A(), (AdCountDownButton.b) null);
            }
        }
        final View viewP = p(R.id.inter_container);
        final View viewP2 = p(R.id.inter_banner_container);
        u.a(viewP, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.d.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                sg.bigo.ads.common.w.b.a(sg.bigo.ads.common.utils.b.a(2), viewP);
                sg.bigo.ads.common.utils.b.a(viewP2);
            }
        });
    }
}
