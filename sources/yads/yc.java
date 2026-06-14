package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class yc implements wh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f118145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tf0 f118146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wf0 f118147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f118148d;

    public /* synthetic */ yc(Context context, boolean z10, int i10) {
        this(context, (i10 & 2) != 0 ? false : z10, new tf0(), new wf0());
    }

    @Override // yads.wh1
    public final vh1 a(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode != 0) {
            Context context = this.f118148d;
            cj3 cj3Var = qi3.f115019a;
            int iMin = context.getResources().getDisplayMetrics().widthPixels;
            wf0 wf0Var = this.f118147c;
            Context context2 = this.f118148d;
            wf0Var.getClass();
            int iA = wf0.a(context2, 420.0f);
            int i12 = this.f118148d.getResources().getConfiguration().orientation;
            if (this.f118146b.a(this.f118148d) != sf0.f115779b || i12 != 1) {
                iMin = (int) Math.min(iMin, iA);
            }
            i10 = View.MeasureSpec.makeMeasureSpec((int) Math.min(iMin, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z10 = this.f118145a;
            int iC = qi3.c(this.f118148d);
            wf0 wf0Var2 = this.f118147c;
            Context context3 = this.f118148d;
            wf0Var2.getClass();
            int iA2 = wf0.a(context3, 350.0f);
            if (!z10) {
                iC = (int) Math.min(iC, iA2);
            }
            i11 = View.MeasureSpec.makeMeasureSpec((int) Math.min(iC, size2), 1073741824);
        }
        vh1 vh1Var = new vh1();
        vh1Var.f117011b = i11;
        vh1Var.f117010a = i10;
        return vh1Var;
    }

    public yc(Context context, boolean z10, tf0 tf0Var, wf0 wf0Var) {
        this.f118145a = z10;
        this.f118146b = tf0Var;
        this.f118147c = wf0Var;
        this.f118148d = context.getApplicationContext();
    }
}
