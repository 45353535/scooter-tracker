package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class sh1 implements wh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f115802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f115803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f115804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vh1 f115805d;

    public /* synthetic */ sh1(View view, float f10, Context context) {
        this(view, f10, context, new vh1());
    }

    @Override // yads.wh1
    public final vh1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        Context context = this.f115804c;
        cj3 cj3Var = qi3.f115019a;
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f115803b);
        ViewGroup.LayoutParams layoutParams = this.f115802a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f115805d.f117010a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, iRound), 0.0d), mode);
        vh1 vh1Var = this.f115805d;
        vh1Var.f117011b = i11;
        return vh1Var;
    }

    public sh1(View view, float f10, Context context, vh1 vh1Var) {
        this.f115802a = view;
        this.f115803b = f10;
        this.f115804c = context;
        this.f115805d = vh1Var;
    }
}
