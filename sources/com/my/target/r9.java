package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.n9;

/* JADX INFO: loaded from: classes11.dex */
public class r9 extends o9 {
    public r9(View view, View view2, n9.a aVar, View view3, aa aaVar, Context context) {
        super(view, view2, aVar, view3, aaVar, context);
        addView(this.f60460a);
        addView(this.f60466g);
        addView(this.f60467h);
        addView(this.f60471l);
        addView(view2);
    }

    private void a(int i10, int i11) {
        this.f60476q.setVisibility(8);
        this.f60477r.setVisibility(8);
        this.f60473n.setVisibility(8);
        this.f60463d.setVisibility(0);
        if (a(i10)) {
            this.f60478s.setVisibility(0);
            this.f60474o.setVisibility(8);
            kb.a(this.f60478s, i10, i11, Integer.MIN_VALUE);
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
        View view = this.K;
        if (((double) kb.a(view != null ? view.getMeasuredHeight() : 0, this.f60468i.getMeasuredHeight())) * 1.6d > i11) {
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
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f60464e.getVisibility() == 0) {
            kb.e(this.f60464e, i13 - i11, i10);
        }
        if (i12 - i10 < i13 - i11) {
            b(i10, i11, i12, i13);
        } else {
            a(i10, i11, i12, i13);
        }
        View view = this.K;
        if (view == null) {
            view = this.f60468i;
        }
        int left = view.getLeft();
        View view2 = this.K;
        if (view2 == null) {
            view2 = this.f60468i;
        }
        int top = view2.getTop();
        View view3 = this.K;
        int iA = kb.a(view3 != null ? view3.getRight() : 0, this.f60468i.getRight());
        View view4 = this.K;
        int iA2 = kb.a(view4 != null ? view4.getBottom() : 0, this.f60468i.getBottom());
        if (this.f60471l.getVisibility() == 0) {
            kb.a(this.f60471l, left, top, iA, iA2);
        }
        if (this.f60466g.getVisibility() != 0) {
            return;
        }
        if (this.f60467h.getVisibility() != 0) {
            kb.a(this.f60466g, left, top, iA, iA2);
            return;
        }
        int measuredWidth = left + (((iA - left) - ((this.f60466g.getMeasuredWidth() + this.f60485z) + this.f60467h.getMeasuredWidth())) / 2);
        int measuredHeight = top + (((iA2 - top) - this.f60466g.getMeasuredHeight()) / 2);
        kb.c(this.f60466g, measuredHeight, measuredWidth);
        kb.c(this.f60467h, measuredHeight, this.f60466g.getRight() + this.f60485z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
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
            android.view.View r2 = r5.K
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            com.my.target.kb.a(r2, r0, r1, r3)
            com.my.target.ma r2 = r5.f60468i
            com.my.target.kb.a(r2, r0, r1, r3)
            android.view.View r2 = r5.f60472m
            r4 = 1073741824(0x40000000, float:2.0)
            com.my.target.kb.a(r2, r0, r1, r4)
            com.my.target.ma r0 = r5.f60469j
            int r1 = r5.F
            com.my.target.kb.a(r0, r1, r1, r3)
            com.my.target.x2 r0 = r5.f60460a
            int r1 = r5.C
            int r2 = r5.D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.my.target.kb.a(r0, r1, r1, r4)
            com.my.target.x2 r0 = r5.f60462c
            int r1 = r5.C
            int r2 = r5.D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.my.target.kb.a(r0, r1, r1, r4)
            com.my.target.ub r0 = r5.f60479t
            int r1 = r5.C
            com.my.target.kb.a(r0, r1, r1, r4)
            com.my.target.i r0 = r5.f60470k
            int r1 = r5.C
            int r2 = r5.D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.my.target.kb.a(r0, r1, r1, r4)
            if (r6 >= r7) goto L7d
            r5.b(r6, r7)
            goto L80
        L7d:
            r5.a(r6, r7)
        L80:
            com.my.target.g2 r0 = r5.f60466g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Laa
            com.my.target.g2 r0 = r5.f60466g
            int r1 = r5.A
            com.my.target.kb.a(r0, r1, r1, r4)
            android.widget.Button r0 = r5.f60467h
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Laa
            android.widget.Button r0 = r5.f60467h
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            com.my.target.g2 r2 = r5.f60466g
            int r2 = r2.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            r0.measure(r1, r2)
        Laa:
            android.widget.ProgressBar r0 = r5.f60471l
            int r1 = r5.A
            com.my.target.kb.a(r0, r1, r1, r4)
            android.view.View r0 = r5.f60464e
            int r1 = r5.B
            com.my.target.kb.a(r0, r6, r1, r4)
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.r9.onMeasure(int, int):void");
    }

    @Override // com.my.target.o9, com.my.target.n9
    public void setBanner(@NonNull o4 o4Var) {
        ImageData imageDataS;
        Bitmap bitmap;
        super.setBanner(o4Var);
        s5 s5VarV = o4Var.V();
        if (s5VarV == null) {
            return;
        }
        this.f60464e.setVisibility(0);
        this.f60460a.setVisibility(0);
        this.f60460a.setOnClickListener(this);
        if (s5VarV.g0()) {
            this.f60460a.a(this.f60481v, false);
            this.f60460a.setContentDescription("sound_off");
        } else {
            this.f60460a.a(this.f60480u, false);
            this.f60460a.setContentDescription("sound_on");
        }
        this.f60466g.setImageBitmap(this.f60482w);
        this.O = 0;
        View view = this.K;
        if (view != null) {
            view.setOnClickListener(this);
        }
        this.f60472m.setOnClickListener(this);
        VideoData videoData = (VideoData) s5VarV.k0();
        ImageData imageDataV = s5VarV.V();
        if (videoData != null) {
            this.L = videoData.getWidth();
            this.M = videoData.getHeight();
        }
        if ((this.L <= 0 || this.M <= 0) && imageDataV != null) {
            this.L = imageDataV.getWidth();
            this.M = imageDataV.getHeight();
        }
        if ((this.L <= 0 || this.M <= 0) && (imageDataS = o4Var.s()) != null) {
            this.L = imageDataS.getWidth();
            int height = imageDataS.getHeight();
            this.M = height;
            if ((this.L <= 0 || height <= 0) && (bitmap = imageDataS.getBitmap()) != null) {
                this.L = bitmap.getWidth();
                this.M = bitmap.getHeight();
            }
        }
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
            View view = this.K;
            kb.a(view, i10, i11, (view != null ? view.getMeasuredWidth() : 0) + i10, i13);
            View view2 = this.K;
            if (view2 == null) {
                view2 = this.f60468i;
            }
            int left2 = view2.getLeft();
            View view3 = this.K;
            if (view3 == null) {
                view3 = this.f60468i;
            }
            int right = view3.getRight();
            View view4 = this.K;
            if (view4 == null) {
                view4 = this.f60468i;
            }
            int bottom = view4.getBottom();
            View view5 = this.K;
            if (view5 == null) {
                view5 = this.f60468i;
            }
            int top = view5.getTop();
            int i16 = this.H;
            int iA = kb.a(right, this.f60468i.getRight()) + this.H;
            int iA2 = kb.a(this.f60469j.getMeasuredHeight(), this.f60478s.getMeasuredHeight());
            int i17 = this.D;
            kb.a(i16, iA, iA2 + i17, i17, this.f60469j, this.f60478s);
            this.f60472m.layout(left2, top, right, bottom);
            this.f60463d.layout(kb.a(right, this.f60468i.getRight()), i11, i12, i13);
            this.f60473n.layout(0, 0, 0, 0);
            int iMax = Math.max(this.f60468i.getRight(), right);
            int i18 = this.H - this.D;
            kb.d(this.f60460a, i13 - i18, iMax - i18);
            this.f60465f.a(false);
            kb.c(this.f60474o, i13, this.f60463d.getLeft());
            if (this.f60462c.getVisibility() == 0) {
                left = (this.f60462c.getLeft() - this.f60485z) + this.D;
            } else if (this.f60479t.getVisibility() == 0) {
                left = this.f60479t.getLeft() - this.f60485z;
            } else {
                left = i12 - this.H;
            }
            kb.b(this.f60470k, this.H, left);
            return;
        }
        ma maVar2 = this.f60469j;
        int i19 = this.H;
        kb.c(maVar2, i19, i19);
        kb.e(this.f60463d, i13 - i11, i10);
        kb.a(this.f60468i, i10, i11, i12, i13);
        kb.a(this.K, i10, i11, i12, i13);
        this.f60472m.layout(this.f60468i.getLeft(), this.f60468i.getTop(), this.f60468i.getRight(), this.f60468i.getBottom());
        this.f60473n.layout(0, 0, 0, 0);
        kb.c(this.f60474o, this.f60463d.getTop(), this.f60463d.getLeft());
        int top2 = this.f60463d.getTop();
        int i20 = this.f60485z;
        int i21 = this.D;
        kb.d(this.f60460a, top2 - (i20 - i21), i12 - (this.H - i21));
        kb.d(this.f60470k, this.f60460a.getTop() - (this.f60485z - this.D), i12 - this.H);
        this.f60465f.a(true);
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
        kb.a(this.K, i10, i11, i12, i13);
        if (this.f60468i.getMeasuredWidth() > 0 && this.f60468i.getMeasuredHeight() > 0) {
            kb.a(this.f60468i, i10, i11, i12, i13);
        }
        View view = this.K;
        int left = view != null ? view.getLeft() : 0;
        View view2 = this.K;
        int top2 = view2 != null ? view2.getTop() : 0;
        View view3 = this.K;
        int iA = kb.a(view3 != null ? view3.getRight() : 0, this.f60468i.getRight());
        View view4 = this.K;
        int iA2 = kb.a(view4 != null ? view4.getBottom() : 0, this.f60468i.getBottom());
        this.f60472m.layout(left, top2, iA, iA2);
        int measuredHeight = this.f60477r.getMeasuredHeight() + (this.f60485z / 2);
        if (this.f60476q.getVisibility() == 0) {
            measuredHeight += this.f60485z + this.f60476q.getMeasuredHeight();
        }
        int i16 = this.f60485z;
        int i17 = i12 - i10;
        int measuredWidth = i16 + (((i17 - (i16 * 2)) - this.f60476q.getMeasuredWidth()) / 2);
        int i18 = this.f60485z;
        int measuredWidth2 = i18 + (((i17 - (i18 * 2)) - this.f60477r.getMeasuredWidth()) / 2);
        int iA3 = kb.a(this.f60468i.getBottom(), iA2);
        if (measuredHeight < this.f60475p.getTop() - iA3) {
            int top3 = iA3 + (((this.f60475p.getTop() - iA3) - measuredHeight) / 2);
            kb.c(this.f60476q, top3, measuredWidth);
            kb.c(this.f60477r, kb.a(top3, this.f60476q.getBottom() + this.I), measuredWidth2);
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
        int iMin = Math.min(this.f60474o.getTop(), Math.max(iA2, this.f60468i.getBottom()));
        int i20 = this.f60485z - this.D;
        kb.d(this.f60460a, iMin - i20, i12 - i20);
        this.f60465f.a(((double) (this.f60468i.getBottom() - this.f60474o.getTop())) > ((double) this.f60468i.getMeasuredHeight()) * 0.1d);
        if (this.f60464e.getVisibility() == 0) {
            i13 = this.f60464e.getTop();
        }
        i iVar = this.f60470k;
        int i21 = this.f60485z;
        kb.d(iVar, i13 - i21, i12 - i21);
        ma maVar = this.f60469j;
        int i22 = this.f60485z;
        kb.e(maVar, i13 - i22, i22);
    }
}
