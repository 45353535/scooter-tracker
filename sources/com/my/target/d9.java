package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.my.target.common.models.ImageData;
import com.my.target.j5;
import com.my.target.y4;

/* JADX INFO: loaded from: classes11.dex */
public class d9 extends RelativeLayout implements i5 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f59516v = kb.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8 f59517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f59518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma f59519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb f59520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g9 f59521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p8 f59522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y2 f59523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ub f59524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kb f59525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y2 f59526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f59527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bitmap f59528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bitmap f59529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f59530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f59531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f59532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f59533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f59534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j5.a f59535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f59536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y4.a f59537u;

    public d9(Context context, e9 e9Var) {
        super(context);
        boolean z10 = (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
        kb kbVarE = kb.e(context);
        this.f59525i = kbVarE;
        ma maVar = new ma(context);
        this.f59519c = maVar;
        pb pbVarB = e9Var.b(kbVarE, z10);
        this.f59520d = pbVarB;
        g9 g9VarA = e9Var.a(kbVarE, z10);
        this.f59521e = g9VarA;
        int i10 = f59516v;
        g9VarA.setId(i10);
        y2 y2Var = new y2(context);
        this.f59523g = y2Var;
        ub ubVar = new ub(context);
        this.f59524h = ubVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14, -1);
        p8 p8Var = new p8(context, kbVarE);
        this.f59522f = p8Var;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12, -1);
        p8Var.setLayoutParams(layoutParams3);
        y2 y2Var2 = new y2(context);
        this.f59526j = y2Var2;
        this.f59528l = q4.f(context);
        this.f59529m = q4.e(context);
        this.f59517a = new m8() { // from class: k5.a0
            @Override // com.my.target.m8
            public final void a(View view, int i11) {
                this.f85986a.a(view, i11);
            }
        };
        this.f59518b = new View.OnClickListener() { // from class: k5.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85991b.c(view);
            }
        };
        this.f59530n = kbVarE.b(64);
        this.f59531o = kbVarE.b(20);
        i iVar = new i(context);
        this.f59527k = iVar;
        int iB = kbVarE.b(28);
        this.f59534r = iB;
        iVar.setFixedHeight(iB);
        kb.b(maVar, "icon_image");
        kb.b(y2Var2, "sound_button");
        kb.b(pbVarB, "vertical_view");
        kb.b(g9VarA, "media_view");
        kb.b(p8Var, "panel_view");
        kb.b(y2Var, "close_button");
        kb.b(ubVar, "progress_wheel");
        addView(p8Var, 0);
        addView(maVar, 0);
        addView(pbVarB, 0, layoutParams);
        addView(g9VarA, 0, layoutParams2);
        addView(y2Var2);
        addView(iVar);
        addView(y2Var);
        addView(ubVar);
        this.f59532p = kbVarE.b(28);
        this.f59533q = kbVarE.b(10);
    }

    @Override // com.my.target.i5
    public void a(o4 o4Var) {
        this.f59526j.setVisibility(8);
        this.f59523g.setVisibility(0);
        a(false);
        this.f59521e.b(o4Var);
    }

    @Override // com.my.target.i5
    public boolean b() {
        return this.f59521e.d();
    }

    @Override // com.my.target.i5
    public void c(boolean z10) {
        this.f59522f.a(this.f59526j);
        this.f59521e.a(z10);
    }

    @Override // com.my.target.i5
    public void d() {
    }

    @Override // com.my.target.i5
    public void destroy() {
        this.f59521e.a();
    }

    public final /* synthetic */ void e() {
        this.f59522f.b(this.f59526j);
    }

    @Override // com.my.target.j5
    @NonNull
    public View getCloseButton() {
        return this.f59523g;
    }

    @Override // com.my.target.i5
    @NonNull
    public g9 getPromoMediaView() {
        return this.f59521e;
    }

    @Override // com.my.target.j5
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.my.target.i5
    public boolean isPlaying() {
        return this.f59521e.e();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        y2 y2Var = this.f59523g;
        y2Var.layout(i12 - y2Var.getMeasuredWidth(), 0, i12, this.f59523g.getMeasuredHeight());
        ub ubVar = this.f59524h;
        int i14 = this.f59533q;
        ubVar.layout(i14, i14, ubVar.getMeasuredWidth() + this.f59533q, this.f59524h.getMeasuredHeight() + this.f59533q);
        kb.a(this.f59527k, this.f59523g.getLeft() - this.f59527k.getMeasuredWidth(), this.f59523g.getTop(), this.f59523g.getLeft(), this.f59523g.getBottom());
        if (i13 <= i12) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            int measuredWidth = (i12 - this.f59521e.getMeasuredWidth()) / 2;
            int measuredHeight = (i13 - this.f59521e.getMeasuredHeight()) / 2;
            g9 g9Var = this.f59521e;
            g9Var.layout(measuredWidth, measuredHeight, g9Var.getMeasuredWidth() + measuredWidth, this.f59521e.getMeasuredHeight() + measuredHeight);
            this.f59519c.layout(0, 0, 0, 0);
            this.f59520d.layout(0, 0, 0, 0);
            p8 p8Var = this.f59522f;
            p8Var.layout(0, i13 - p8Var.getMeasuredHeight(), i12, i13);
            y2 y2Var2 = this.f59526j;
            y2Var2.layout(i12 - y2Var2.getMeasuredWidth(), this.f59522f.getTop() - this.f59526j.getMeasuredHeight(), i12, this.f59522f.getTop());
            if (this.f59521e.e()) {
                this.f59522f.b(this.f59526j);
                return;
            }
            return;
        }
        if (this.f59526j.getTranslationY() > 0.0f) {
            this.f59526j.setTranslationY(0.0f);
        }
        setBackgroundColor(-1);
        int measuredWidth2 = (i12 - this.f59521e.getMeasuredWidth()) / 2;
        g9 g9Var2 = this.f59521e;
        g9Var2.layout(measuredWidth2, 0, g9Var2.getMeasuredWidth() + measuredWidth2, this.f59521e.getMeasuredHeight());
        this.f59520d.layout(0, this.f59521e.getBottom(), i12, i13);
        int bottom = this.f59531o;
        if (this.f59521e.getMeasuredHeight() != 0) {
            bottom = this.f59521e.getBottom() - (this.f59519c.getMeasuredHeight() / 2);
        }
        ma maVar = this.f59519c;
        int i15 = this.f59531o;
        maVar.layout(i15, bottom, maVar.getMeasuredWidth() + i15, this.f59519c.getMeasuredHeight() + bottom);
        this.f59522f.layout(0, 0, 0, 0);
        y2 y2Var3 = this.f59526j;
        y2Var3.layout(i12 - y2Var3.getMeasuredWidth(), this.f59521e.getBottom() - this.f59526j.getMeasuredHeight(), i12, this.f59521e.getBottom());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        this.f59526j.measure(i10, i11);
        this.f59523g.measure(i10, i11);
        this.f59524h.measure(View.MeasureSpec.makeMeasureSpec(this.f59532p, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f59532p, 1073741824));
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        i iVar = this.f59527k;
        int i12 = this.f59534r;
        kb.a(iVar, i12, i12, 1073741824);
        if (size2 > size) {
            this.f59521e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f59520d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - this.f59521e.getMeasuredHeight(), Integer.MIN_VALUE));
            this.f59519c.measure(View.MeasureSpec.makeMeasureSpec(this.f59530n, Integer.MIN_VALUE), iMakeMeasureSpec2);
            this.f59522f.setVisibility(8);
        } else {
            this.f59522f.setVisibility(0);
            this.f59521e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f59522f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), iMakeMeasureSpec2);
        }
        setMeasuredDimension(i10, i11);
    }

    @Override // com.my.target.i5
    public void pause() {
        this.f59522f.e(this.f59526j);
        this.f59521e.f();
    }

    @Override // com.my.target.i5
    public void resume() {
        this.f59522f.a(this.f59526j);
        this.f59521e.g();
    }

    @Override // com.my.target.j5
    public void setBanner(@NonNull o4 o4Var) {
        int width;
        int height;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f59532p, this.f59525i.b(28));
        layoutParams.addRule(9);
        layoutParams.topMargin = this.f59525i.b(10);
        layoutParams.leftMargin = this.f59525i.b(10);
        this.f59524h.setLayoutParams(layoutParams);
        this.f59524h.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        this.f59523g.setVisibility(8);
        this.f59523g.setLayoutParams(layoutParams2);
        s5 s5VarV = o4Var.V();
        if (s5VarV == null) {
            this.f59526j.setVisibility(8);
        }
        Point pointB = kb.b(getContext());
        boolean z10 = pointB.x + pointB.y < 1280 || b(o4Var);
        this.f59522f.a();
        this.f59522f.setBanner(o4Var);
        this.f59520d.a(pointB.x, pointB.y, z10);
        this.f59520d.setBanner(o4Var);
        this.f59521e.c();
        this.f59521e.b(o4Var, 0);
        ImageData imageDataM = o4Var.M();
        if (imageDataM == null || imageDataM.getData() == null) {
            Bitmap bitmapA = l0.a(this.f59534r);
            if (bitmapA != null) {
                this.f59523g.a(bitmapA, false);
            }
        } else {
            this.f59523g.a(imageDataM.getData(), true);
        }
        ImageData imageDataQ = o4Var.q();
        if (imageDataQ != null) {
            width = imageDataQ.getWidth();
            height = imageDataQ.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = this.f59525i.b(4);
        if (width != 0 && height != 0) {
            int iB = (int) (this.f59525i.b(64) * (height / width));
            layoutParams3.width = this.f59530n;
            layoutParams3.height = iB;
            if (!z10) {
                layoutParams3.bottomMargin = (-iB) / 2;
            }
        }
        layoutParams3.addRule(8, f59516v);
        layoutParams3.setMarginStart(this.f59525i.b(20));
        this.f59519c.setLayoutParams(layoutParams3);
        if (imageDataQ != null) {
            this.f59519c.setImageBitmap(imageDataQ.getData());
        }
        if (s5VarV != null && s5VarV.h0()) {
            c(true);
            post(new Runnable() { // from class: k5.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86161b.e();
                }
            });
        }
        if (s5VarV != null) {
            this.f59536t = s5VarV.o();
            if (s5VarV.g0()) {
                this.f59526j.a(this.f59529m, false);
                this.f59526j.setContentDescription("sound_off");
            } else {
                this.f59526j.a(this.f59528l, false);
                this.f59526j.setContentDescription("sound_on");
            }
        }
        this.f59526j.setOnClickListener(new View.OnClickListener() { // from class: k5.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86168b.b(view);
            }
        });
        c cVarA = o4Var.a();
        if (cVarA != null) {
            a(cVarA);
        } else {
            this.f59527k.setVisibility(8);
        }
    }

    @Override // com.my.target.j5
    public void setClickArea(@NonNull d1 d1Var) {
        gb.a("PromoDefaultStyleView: Apply click area " + d1Var.a() + " to view");
        this.f59519c.setOnClickListener((d1Var.f59453c || d1Var.f59463m) ? this.f59518b : null);
        this.f59521e.getImageView().setOnClickListener((d1Var.f59463m || d1Var.f59454d) ? this.f59518b : null);
        if (d1Var.f59463m || d1Var.f59464n) {
            this.f59521e.getClickableLayout().setOnClickListener(this.f59518b);
        } else {
            this.f59521e.b();
        }
        this.f59520d.a(d1Var, this.f59517a);
        this.f59522f.a(d1Var, this.f59517a);
    }

    @Override // com.my.target.j5
    public void setInterstitialPromoViewListener(@Nullable j5.a aVar) {
        this.f59535s = aVar;
    }

    @Override // com.my.target.i5
    public void setMediaListener(y4.a aVar) {
        this.f59537u = aVar;
        this.f59521e.setInterstitialPromoViewListener(aVar);
        this.f59521e.h();
    }

    @Override // com.my.target.i5
    public void setTimeChanged(float f10) {
        this.f59524h.setVisibility(0);
        float f11 = this.f59536t;
        if (f11 > 0.0f) {
            this.f59524h.setProgress(f10 / f11);
        }
        this.f59524h.setDigit((int) ((this.f59536t - f10) + 1.0f));
    }

    @Override // com.my.target.i5
    public final void b(boolean z10) {
        if (z10) {
            this.f59526j.a(this.f59529m, false);
            this.f59526j.setContentDescription("sound_off");
        } else {
            this.f59526j.a(this.f59528l, false);
            this.f59526j.setContentDescription("sound_on");
        }
    }

    @Override // com.my.target.j5
    public void c() {
        this.f59523g.setVisibility(0);
    }

    public void c(View view) {
        a(view, 1);
    }

    @Override // com.my.target.i5
    public void a(boolean z10) {
        this.f59524h.setVisibility(8);
        this.f59522f.e(this.f59526j);
        this.f59521e.b(z10);
    }

    public final /* synthetic */ void b(View view) {
        y4.a aVar = this.f59537u;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.my.target.i5
    public void a(int i10) {
        this.f59521e.a(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.my.target.o4 r3) {
        /*
            r2 = this;
            com.my.target.s5 r0 = r3.V()
            r1 = 0
            if (r0 == 0) goto L18
            com.my.target.t5 r3 = r0.k0()
            com.my.target.common.models.VideoData r3 = (com.my.target.common.models.VideoData) r3
            if (r3 == 0) goto L27
            int r0 = r3.getHeight()
            int r3 = r3.getWidth()
            goto L29
        L18:
            com.my.target.common.models.ImageData r3 = r3.s()
            if (r3 == 0) goto L27
            int r0 = r3.getHeight()
            int r3 = r3.getWidth()
            goto L29
        L27:
            r3 = r1
            r0 = r3
        L29:
            if (r0 <= 0) goto L3e
            if (r3 > 0) goto L2e
            goto L3e
        L2e:
            if (r0 > r3) goto L3c
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            r0 = 1068708659(0x3fb33333, float:1.4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L3b
            goto L3c
        L3b:
            return r1
        L3c:
            r3 = 1
            return r3
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.d9.b(com.my.target.o4):boolean");
    }

    @Override // com.my.target.i5
    public void a() {
        this.f59521e.i();
    }

    public final void a(c cVar) {
        this.f59527k.setImageBitmap(cVar.c().getBitmap());
        this.f59527k.setOnClickListener(new View.OnClickListener() { // from class: k5.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86004b.a(view);
            }
        });
    }

    public final /* synthetic */ void a(View view) {
        j5.a aVar = this.f59535s;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void a(View view, int i10) {
        j5.a aVar;
        if (!view.isEnabled() || (aVar = this.f59535s) == null) {
            return;
        }
        aVar.a(i10);
    }
}
