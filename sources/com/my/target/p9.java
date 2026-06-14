package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.my.target.n9;

/* JADX INFO: loaded from: classes11.dex */
public class p9 extends o9 {
    public final int P;

    public p9(boolean z10, View view, View view2, n9.a aVar, View view3, aa aaVar, Context context) {
        super(view, view2, aVar, view3, aaVar, context);
        if (z10) {
            this.P = 0;
        } else {
            this.P = 1;
        }
    }

    public final void a(int i10, int i11) {
        this.f60476q.setVisibility(8);
        this.f60477r.setVisibility(8);
        this.f60473n.setVisibility(8);
        this.f60463d.setVisibility(0);
        this.f60474o.setVisibility(0);
        kb.a(this.f60463d, i10, i11, Integer.MIN_VALUE);
        kb.a(this.f60474o, this.f60463d.getMeasuredWidth(), this.f60463d.getMeasuredHeight(), 1073741824);
    }

    public final void b(int i10, int i11) {
        this.f60463d.setVisibility(0);
        this.f60473n.setVisibility(0);
        kb.a(this.f60463d, i10 - this.C, i11, Integer.MIN_VALUE);
        kb.a(this.f60473n, i10, this.f60463d.getMeasuredHeight(), 1073741824);
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
        if (this.P != 0) {
            this.f60474o.setVisibility(8);
            return;
        }
        int i12 = this.f60485z;
        int i13 = i12 * 2;
        this.f60475p.measure(View.MeasureSpec.makeMeasureSpec(((i10 - (i12 * 4)) - this.f60470k.getMeasuredWidth()) - this.f60469j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        int i14 = i10 - i13;
        int i15 = i11 - i13;
        kb.a(this.f60476q, i14, i15, Integer.MIN_VALUE);
        kb.a(this.f60477r, i14, i15, Integer.MIN_VALUE);
        this.f60474o.setVisibility(0);
        kb.a(this.f60474o, i10, i11, 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (i12 - i10 < i13 - i11) {
            b(i10, i11, i12, i13);
        } else {
            a(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size < size2) {
            b(size, size2);
            int i12 = this.P;
            if (i12 == 1) {
                kb.a(this.K, size, (size2 - this.f60473n.getMeasuredHeight()) - (this.f60485z * 2), Integer.MIN_VALUE);
            } else if (i12 == 0) {
                kb.a(this.K, size, ((((size2 - this.f60463d.getMeasuredHeight()) - this.f60476q.getMeasuredHeight()) - this.f60475p.getMeasuredHeight()) - this.f60477r.getMeasuredHeight()) - (this.f60485z * 8), Integer.MIN_VALUE);
            }
        } else {
            a(size, size2);
            kb.a(this.K, size, (size2 - this.f60463d.getMeasuredHeight()) - (this.f60485z * 2), 1073741824);
        }
        ub ubVar = this.f60479t;
        int i13 = this.C;
        kb.a(ubVar, i13, i13, 1073741824);
        x2 x2Var = this.f60462c;
        int i14 = this.C + (this.D * 2);
        kb.a(x2Var, i14, i14, 1073741824);
        i iVar = this.f60470k;
        int i15 = this.C + (this.D * 2);
        kb.a(iVar, i15, i15, 1073741824);
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.o9, com.my.target.n9
    public void setBanner(@NonNull o4 o4Var) {
        super.setBanner(o4Var);
        this.f60465f.a(true);
        View view = this.K;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (this.f60462c.getVisibility() == 0) {
            x2 x2Var = this.f60462c;
            int i14 = this.H - this.D;
            kb.b(x2Var, i11 + i14, (i12 - i10) - i14);
        } else {
            ub ubVar = this.f60479t;
            int i15 = this.H;
            kb.b(ubVar, i11 + i15, (i12 - i10) - i15);
        }
        kb.e(this.f60463d, i13, i10);
        kb.e(this.K, this.f60463d.getTop(), 0);
        this.f60473n.layout(0, 0, 0, 0);
        View view = this.f60474o;
        View view2 = this.K;
        if (view2 != null) {
            i13 = view2.getBottom();
        }
        kb.c(view, i13, 0);
        kb.d(this.f60470k, this.f60463d.getTop() - this.f60485z, i12 - this.H);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.p9.b(int, int, int, int):void");
    }
}
