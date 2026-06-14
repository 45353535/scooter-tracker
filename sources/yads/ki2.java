package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ki2 implements wh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f112714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh1 f112715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei f112716c;

    public ki2(float f10) {
        this(f10, new vh1());
    }

    @Override // yads.wh1
    public final vh1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int iRound = Math.round(size / this.f112716c.f110379a);
            if (mode2 == Integer.MIN_VALUE) {
                iRound = (int) Math.min(size2, iRound);
            }
            i11 = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int iRound2 = Math.round(size2 * this.f112716c.f110379a);
            if (mode == Integer.MIN_VALUE) {
                iRound2 = (int) Math.min(size, iRound2);
            }
            i10 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            float f10 = size;
            float f11 = size2;
            if (f10 / f11 > this.f112714a) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.round(f11 * this.f112716c.f110379a), 1073741824);
                i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int iRound3 = Math.round(f10 / this.f112716c.f110379a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i11 = View.MeasureSpec.makeMeasureSpec(iRound3, 1073741824);
                i10 = iMakeMeasureSpec;
            }
        }
        vh1 vh1Var = this.f112715b;
        vh1Var.f117010a = i10;
        vh1Var.f117011b = i11;
        return vh1Var;
    }

    public /* synthetic */ ki2(float f10, vh1 vh1Var) {
        this(f10, vh1Var, new ei(f10));
    }

    public ki2(float f10, vh1 vh1Var, ei eiVar) {
        this.f112714a = f10;
        this.f112715b = vh1Var;
        this.f112716c = eiVar;
    }
}
