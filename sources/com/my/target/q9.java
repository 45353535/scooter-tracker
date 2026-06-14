package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import com.my.target.n9;

/* JADX INFO: loaded from: classes11.dex */
public class q9 extends o9 {
    public q9(View view, View view2, n9.a aVar, View view3, aa aaVar, Context context) {
        super(view, view2, aVar, view3, aaVar, context);
    }

    private void a(int i10, int i11) {
        this.f60476q.setVisibility(8);
        this.f60477r.setVisibility(8);
        this.f60473n.setVisibility(8);
        this.f60463d.setVisibility(0);
        if (a(i10)) {
            this.f60478s.setVisibility(0);
            kb.a(this.f60478s, i10, i11, Integer.MIN_VALUE);
            this.f60474o.setVisibility(8);
            View view = this.K;
            int iA = i10 - kb.a(view != null ? view.getMeasuredWidth() : 0, this.f60468i.getMeasuredWidth());
            kb.a(this.f60463d, iA, iA, Integer.MIN_VALUE);
        } else {
            this.f60478s.setVisibility(8);
            this.f60474o.setVisibility(0);
            kb.a(this.f60463d, i10, i11, Integer.MIN_VALUE);
        }
        kb.a(this.f60474o, this.f60463d.getMeasuredWidth(), this.f60463d.getMeasuredHeight(), 1073741824);
    }

    private void b(int i10, int i11) {
        this.f60463d.setVisibility(0);
        this.f60473n.setVisibility(0);
        this.f60474o.setVisibility(0);
        this.f60478s.setVisibility(8);
        kb.a(this.f60463d, i10 - this.C, i11, Integer.MIN_VALUE);
        kb.a(this.f60473n, i10, this.f60463d.getMeasuredHeight(), 1073741824);
        if (((double) this.f60468i.getMeasuredHeight()) * 1.6d > i11) {
            this.f60476q.setVisibility(8);
            if (!TextUtils.isEmpty(this.f60477r.getText())) {
                this.f60477r.setVisibility(0);
            }
        } else {
            if (TextUtils.isEmpty(this.f60476q.getText())) {
                this.f60476q.setVisibility(8);
            } else {
                this.f60476q.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.f60477r.getText())) {
                this.f60477r.setVisibility(8);
            } else {
                this.f60477r.setVisibility(0);
            }
        }
        int i12 = this.f60485z;
        int i13 = i12 * 2;
        this.f60475p.measure(View.MeasureSpec.makeMeasureSpec(((i10 - (i12 * 4)) - this.f60470k.getMeasuredWidth()) - this.f60469j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        int i14 = i10 - i13;
        int i15 = i11 - i13;
        kb.a(this.f60476q, i14, i15, Integer.MIN_VALUE);
        kb.a(this.f60477r, i14, i15, Integer.MIN_VALUE);
        kb.a(this.f60474o, i10, i11, 1073741824);
        ub ubVar = this.f60479t;
        int i16 = this.C;
        kb.a(ubVar, i16, i16, 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (i12 - i10 < i13 - i11) {
            b(i10, i11, i12, i13);
        } else {
            a(i10, i11, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = r5.L
            if (r0 <= 0) goto L30
            int r1 = r5.M
            if (r1 <= 0) goto L30
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = r0 / r1
            float r3 = (float) r6
            float r0 = r3 / r0
            float r4 = (float) r7
            float r1 = r4 / r1
            float r1 = java.lang.Math.min(r0, r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L2c
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2c
            float r3 = r3 / r2
            int r0 = (int) r3
            r1 = r0
            r0 = r6
            goto L32
        L2c:
            float r4 = r4 * r2
            int r0 = (int) r4
        L2e:
            r1 = r7
            goto L32
        L30:
            r0 = r6
            goto L2e
        L32:
            com.my.target.ma r2 = r5.f60468i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            com.my.target.kb.a(r2, r0, r1, r3)
            com.my.target.ma r0 = r5.f60469j
            int r1 = r5.F
            com.my.target.kb.a(r0, r1, r1, r3)
            com.my.target.x2 r0 = r5.f60462c
            int r1 = r5.C
            int r2 = r5.D
            int r2 = r2 * 2
            int r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            com.my.target.kb.a(r0, r1, r1, r2)
            com.my.target.ub r0 = r5.f60479t
            int r1 = r5.C
            com.my.target.kb.a(r0, r1, r1, r2)
            com.my.target.i r0 = r5.f60470k
            int r1 = r5.C
            int r3 = r5.D
            int r3 = r3 * 2
            int r1 = r1 + r3
            com.my.target.kb.a(r0, r1, r1, r2)
            if (r6 >= r7) goto L67
            r5.b(r6, r7)
            goto L6a
        L67:
            r5.a(r6, r7)
        L6a:
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.q9.onMeasure(int, int):void");
    }

    @Override // com.my.target.o9, com.my.target.n9
    public void setBanner(@NonNull o4 o4Var) {
        super.setBanner(o4Var);
        View view = this.K;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f60472m.setVisibility(8);
    }

    private void a(int i10, int i11, int i12, int i13) {
        int left;
        if (this.f60462c.getVisibility() == 0) {
            x2 x2Var = this.f60462c;
            int i14 = this.H - this.D;
            kb.b(x2Var, i11 + i14, (i12 - i10) - i14);
        } else {
            ub ubVar = this.f60479t;
            int i15 = this.H;
            kb.b(ubVar, i11 + i15, (i12 - i10) - i15);
        }
        if (a(i12 - i10)) {
            ma maVar = this.f60468i;
            kb.a(maVar, i10, i11, maVar.getMeasuredWidth() + i10, i13);
            kb.a(this.H, this.f60468i.getRight() + this.H, kb.a(this.f60469j.getMeasuredHeight(), this.f60478s.getMeasuredHeight()) + this.D, this.D, this.f60469j, this.f60478s);
            View view = this.K;
            kb.a(view, i10, i11, (view != null ? view.getMeasuredWidth() : 0) + i10, i13);
            this.f60463d.layout(this.f60468i.getRight(), i11, i12, i13);
            this.f60473n.layout(0, 0, 0, 0);
            this.f60465f.a(false);
            if (this.f60462c.getVisibility() == 0) {
                left = (this.f60462c.getLeft() - this.f60485z) + this.D;
            } else if (this.f60479t.getVisibility() == 0) {
                left = this.f60479t.getLeft() - this.f60485z;
            } else {
                left = i12 - this.H;
            }
            kb.b(this.f60470k, this.H, left);
            kb.b(this.f60470k, this.H, left);
            return;
        }
        ma maVar2 = this.f60469j;
        int i16 = this.H;
        kb.c(maVar2, i16, i16);
        kb.e(this.f60463d, i13 - i11, i10);
        kb.a(this.f60468i, i10, i11, i12, i13);
        kb.a(this.K, i10, i11, i12, i13);
        this.f60472m.layout(this.f60468i.getLeft(), this.f60468i.getTop(), this.f60468i.getRight(), this.f60468i.getBottom());
        this.f60473n.layout(0, 0, 0, 0);
        kb.c(this.f60474o, this.f60463d.getTop(), this.f60463d.getLeft());
        this.f60465f.a(true);
        kb.d(this.f60470k, this.f60463d.getTop() - this.f60485z, i12 - this.H);
    }

    private void b(int i10, int i11, int i12, int i13) {
        int top;
        if (this.f60462c.getVisibility() == 0) {
            x2 x2Var = this.f60462c;
            int i14 = this.f60485z - this.D;
            kb.b(x2Var, i11 + i14, (i12 - i10) - i14);
        } else {
            ub ubVar = this.f60479t;
            int i15 = this.f60485z;
            kb.b(ubVar, i11 + i15, (i12 - i10) - i15);
        }
        kb.c(this.f60463d, i11, i10);
        Button button = this.f60475p;
        kb.a(button, 0, (i13 - this.E) - button.getMeasuredHeight(), i12, i13 - this.E);
        kb.a(this.f60468i, i10, i11, i12, i13);
        int measuredHeight = this.f60477r.getMeasuredHeight() + (this.f60485z / 2);
        if (this.f60476q.getVisibility() == 0) {
            measuredHeight += this.f60485z + this.f60476q.getMeasuredHeight();
        }
        int i16 = this.f60485z;
        int i17 = i12 - i10;
        int measuredWidth = i16 + (((i17 - (i16 * 2)) - this.f60476q.getMeasuredWidth()) / 2);
        int i18 = this.f60485z;
        int measuredWidth2 = i18 + (((i17 - (i18 * 2)) - this.f60477r.getMeasuredWidth()) / 2);
        int bottom = this.f60468i.getBottom();
        if (measuredHeight < this.f60475p.getTop() - bottom) {
            int top2 = bottom + (((this.f60475p.getTop() - bottom) - measuredHeight) / 2);
            kb.c(this.f60476q, top2, measuredWidth);
            kb.c(this.f60477r, kb.a(top2, this.f60476q.getBottom() + this.I), measuredWidth2);
        } else {
            kb.e(this.f60477r, this.f60475p.getTop() - this.f60485z, measuredWidth2);
            this.f60476q.layout(0, 0, 0, 0);
        }
        if (this.f60476q.getTop() > 0) {
            top = this.f60476q.getTop();
        } else if (this.f60477r.getTop() > 0) {
            top = this.f60477r.getTop();
        } else {
            top = this.f60475p.getTop();
        }
        int i19 = top - this.f60485z;
        kb.c(this.f60473n, this.f60463d.getTop(), this.f60463d.getLeft());
        kb.c(this.f60474o, i19, i10);
        this.f60465f.a(((double) (this.f60468i.getBottom() - this.f60474o.getTop())) > ((double) this.f60468i.getMeasuredHeight()) * 0.1d);
        i iVar = this.f60470k;
        int i20 = this.f60485z;
        kb.d(iVar, i13 - i20, i12 - i20);
        ma maVar = this.f60469j;
        int i21 = this.f60485z;
        kb.e(maVar, i13 - i21, i21);
    }
}
