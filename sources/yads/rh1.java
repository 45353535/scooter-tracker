package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class rh1 implements wh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f115447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f115448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f115449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vh1 f115450d;

    public /* synthetic */ rh1(View view, float f10, Context context) {
        this(view, f10, context, new vh1());
    }

    @Override // yads.wh1
    public final vh1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int iRound = Math.round(qi3.c(this.f115449c) * this.f115448b);
        ViewGroup.LayoutParams layoutParams = this.f115447a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = (int) Math.max(Math.min(size, iRound), 0.0d);
        vh1 vh1Var = this.f115450d;
        vh1Var.f117010a = i10;
        vh1Var.f117011b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f115450d;
    }

    public rh1(View view, float f10, Context context, vh1 vh1Var) {
        this.f115447a = view;
        this.f115448b = f10;
        this.f115449c = context;
        this.f115450d = vh1Var;
    }
}
