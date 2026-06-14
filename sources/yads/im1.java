package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class im1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl1 f112052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xu1 f112053b;

    public /* synthetic */ im1() {
        this(new yl1(), new xu1());
    }

    public final xs2 a(CustomizableMediaView customizableMediaView, ai1 ai1Var, g41 g41Var, b62 b62Var, mm1 mm1Var) {
        Context context = customizableMediaView.getContext();
        this.f112053b.getClass();
        su1 su1Var = (su1) ev1.f110476c.a(context).f110479b.remove(ai1Var);
        if (su1Var == null) {
            su1Var = new su1(context, (zk3) null, 6);
        }
        ju1 ju1Var = su1Var.f115951l;
        ju1Var.f112464a.add(g41Var);
        ju1Var.f112465b.add(b62Var);
        ju1Var.f112466c.add(b62Var);
        this.f112052a.getClass();
        if (!aq0.a(customizableMediaView.getContext(), zp0.f118752e)) {
            customizableMediaView.removeAllViews();
        }
        customizableMediaView.addView(su1Var, new FrameLayout.LayoutParams(-1, -1));
        return new xs2(customizableMediaView, mm1Var, new oh3(new uu1(su1Var)));
    }

    public im1(yl1 yl1Var, xu1 xu1Var) {
        this.f112052a = yl1Var;
        this.f112053b = xu1Var;
    }
}
