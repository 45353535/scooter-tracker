package yads;

import android.view.View;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes4.dex */
public final class z02 implements l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm f118484a;

    public z02(cm cmVar) {
        this.f118484a = cmVar;
    }

    @Override // yads.l00
    public final void a(i5 i5Var) {
        this.f118484a.D.a(i5Var);
    }

    @Override // yads.l00
    public final void closeNativeAd() {
        cm cmVar = this.f118484a;
        zh0 zh0Var = cmVar.I;
        eb1 eb1Var = cmVar.C;
        zh0Var.getClass();
        View viewFindViewWithTag = eb1Var.findViewWithTag("rootDivkitView");
        Div2View div2View = viewFindViewWithTag instanceof Div2View ? (Div2View) viewFindViewWithTag : null;
        if (div2View != null) {
            div2View.setVariable("is_banner_closed", "closed");
        }
        cmVar.D.a();
    }

    @Override // yads.l00
    public final void onAdClicked() {
    }

    @Override // yads.l00
    public final void onLeftApplication() {
        this.f118484a.D.c();
    }

    @Override // yads.l00
    public final void onReturnedToApplication() {
        this.f118484a.D.d();
    }
}
