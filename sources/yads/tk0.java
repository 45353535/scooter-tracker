package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class tk0 implements wh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh1 f116270a = new vh1();

    @Override // yads.wh1
    public final vh1 a(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        vh1 vh1Var = this.f116270a;
        vh1Var.f117010a = iMakeMeasureSpec;
        vh1Var.f117011b = iMakeMeasureSpec;
        return vh1Var;
    }
}
