package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.timepicker.TimeModel;
import com.my.target.common.views.StarsRatingView;
import com.my.target.j5;
import com.my.target.y4;

/* JADX INFO: loaded from: classes11.dex */
public class l9 extends ViewGroup implements i5 {
    public y4.a A;
    public int B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f60063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g9 f60064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f60065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2 f60066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f60067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f60068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f60069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f60070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StarsRatingView f60071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Button f60072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f60073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kb f60074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f60075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ub f60076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y2 f60077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g2 f60078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f60079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f60080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f60081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FrameLayout f60082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f60083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f60084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bitmap f60085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bitmap f60086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f60087y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j5.a f60088z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j5.a aVar;
            y4.a aVar2;
            l9 l9Var = l9.this;
            if (view == l9Var.f60063a) {
                y4.a aVar3 = l9Var.A;
                if (aVar3 != null) {
                    aVar3.o();
                }
                l9.this.e();
                return;
            }
            if (view == l9Var.f60065c) {
                if (!l9Var.f60064b.e() || (aVar2 = l9.this.A) == null) {
                    return;
                }
                aVar2.c();
                return;
            }
            if (view != l9Var.f60066d) {
                if (view != l9Var.f60067e || (aVar = l9Var.f60088z) == null) {
                    return;
                }
                aVar.c();
                return;
            }
            if (l9Var.A != null) {
                if (l9Var.b()) {
                    l9.this.A.i();
                } else {
                    l9.this.A.o();
                }
            }
            l9.this.e();
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l9 l9Var = l9.this;
            int i10 = l9Var.B;
            if (i10 == 2 || i10 == 0) {
                l9Var.e();
            }
        }
    }

    public final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j5.a aVar;
            int i10 = view == l9.this.f60072j ? 2 : 1;
            if (!view.isEnabled() || (aVar = l9.this.f60088z) == null) {
                return;
            }
            aVar.a(i10);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l9 l9Var = l9.this;
            l9Var.removeCallbacks(l9Var.f60068f);
            l9 l9Var2 = l9.this;
            int i10 = l9Var2.B;
            if (i10 == 2) {
                l9Var2.e();
                l9 l9Var3 = l9.this;
                l9Var3.postDelayed(l9Var3.f60068f, 4000L);
            } else if (i10 == 0 || i10 == 3) {
                l9Var2.g();
                l9 l9Var4 = l9.this;
                l9Var4.postDelayed(l9Var4.f60068f, 4000L);
            }
        }
    }

    public l9(Context context, boolean z10) {
        super(context);
        TextView textView = new TextView(context);
        this.f60073k = textView;
        TextView textView2 = new TextView(context);
        this.f60070h = textView2;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f60071i = starsRatingView;
        Button button = new Button(context);
        this.f60072j = button;
        TextView textView3 = new TextView(context);
        this.f60081s = textView3;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60082t = frameLayout;
        g2 g2Var = new g2(context);
        this.f60065c = g2Var;
        g2 g2Var2 = new g2(context);
        this.f60066d = g2Var2;
        g2 g2Var3 = new g2(context);
        this.f60078p = g2Var3;
        TextView textView4 = new TextView(context);
        this.f60075m = textView4;
        g9 g9Var = new g9(context, kb.e(context), false, z10);
        this.f60064b = g9Var;
        ub ubVar = new ub(context);
        this.f60076n = ubVar;
        y2 y2Var = new y2(context);
        this.f60077o = y2Var;
        this.f60063a = new LinearLayout(context);
        kb kbVarE = kb.e(context);
        this.f60074l = kbVarE;
        this.f60068f = new b();
        this.f60079q = new d();
        this.f60080r = new a();
        this.f60067e = new i(context);
        kb.b(textView, "dismiss_button");
        kb.b(textView2, "title_text");
        kb.b(starsRatingView, "stars_view");
        kb.b(button, "cta_button");
        kb.b(textView3, "replay_text");
        kb.b(frameLayout, "shadow");
        kb.b(g2Var, "pause_button");
        kb.b(g2Var2, "play_button");
        kb.b(g2Var3, "replay_button");
        kb.b(textView4, "domain_text");
        kb.b(g9Var, "media_view");
        kb.b(ubVar, "video_progress_wheel");
        kb.b(y2Var, "sound_button");
        this.f60087y = kbVarE.b(28);
        this.f60083u = kbVarE.b(16);
        this.f60084v = kbVarE.b(4);
        this.f60085w = q4.f(context);
        this.f60086x = q4.e(context);
        this.f60069g = new c();
        f();
    }

    public final /* synthetic */ void a(View view) {
        y4.a aVar = this.A;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.my.target.i5
    public boolean b() {
        return this.f60064b.d();
    }

    @Override // com.my.target.j5
    public void c() {
        this.f60073k.setText(this.G);
        this.f60073k.setTextSize(2, 16.0f);
        this.f60073k.setVisibility(0);
        this.f60073k.setTextColor(-1);
        this.f60073k.setEnabled(true);
        TextView textView = this.f60073k;
        int i10 = this.f60083u;
        textView.setPadding(i10, i10, i10, i10);
        kb.a(this.f60073k, -2013265920, -1, -1, this.f60074l.b(1), this.f60074l.b(4));
        this.I = true;
    }

    @Override // com.my.target.i5
    public void d() {
        this.f60076n.setVisibility(8);
        j();
    }

    @Override // com.my.target.i5
    public void destroy() {
        this.f60064b.a();
    }

    public void e() {
        this.B = 0;
        this.f60063a.setVisibility(8);
        this.f60066d.setVisibility(8);
        this.f60065c.setVisibility(8);
        this.f60082t.setVisibility(8);
    }

    public final void f() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i10 = this.f60083u;
        this.f60064b.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f60064b.c();
        this.f60082t.setBackgroundColor(-1728053248);
        this.f60082t.setVisibility(8);
        this.f60073k.setTextSize(2, 16.0f);
        this.f60073k.setTransformationMethod(null);
        TextView textView = this.f60073k;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f60073k.setVisibility(8);
        this.f60073k.setTextAlignment(4);
        this.f60073k.setTextColor(-1);
        kb.a(this.f60073k, -2013265920, -1, -1, this.f60074l.b(1), this.f60074l.b(4));
        this.f60070h.setMaxLines(2);
        this.f60070h.setEllipsize(truncateAt);
        this.f60070h.setTextSize(2, 18.0f);
        this.f60070h.setTextColor(-1);
        kb.a(this.f60072j, -2013265920, -1, -1, this.f60074l.b(1), this.f60074l.b(4));
        this.f60072j.setTextColor(-1);
        this.f60072j.setTransformationMethod(null);
        this.f60072j.setGravity(1);
        this.f60072j.setTextSize(2, 16.0f);
        this.f60072j.setMinimumWidth(this.f60074l.b(100));
        this.f60072j.setPadding(i10, i10, i10, i10);
        this.f60070h.setShadowLayer(this.f60074l.b(1), this.f60074l.b(1), this.f60074l.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f60075m.setTextColor(-3355444);
        this.f60075m.setMaxEms(10);
        this.f60075m.setShadowLayer(this.f60074l.b(1), this.f60074l.b(1), this.f60074l.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f60063a.setOnClickListener(this.f60080r);
        this.f60063a.setGravity(17);
        this.f60063a.setVisibility(8);
        this.f60063a.setPadding(this.f60074l.b(8), 0, this.f60074l.b(8), 0);
        this.f60081s.setSingleLine();
        this.f60081s.setEllipsize(truncateAt);
        TextView textView2 = this.f60081s;
        textView2.setTypeface(textView2.getTypeface(), 1);
        this.f60081s.setTextColor(-1);
        this.f60081s.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f60074l.b(4);
        this.f60078p.setPadding(this.f60074l.b(16), this.f60074l.b(16), this.f60074l.b(16), this.f60074l.b(16));
        this.f60065c.setOnClickListener(this.f60080r);
        this.f60065c.setVisibility(8);
        this.f60065c.setPadding(this.f60074l.b(16), this.f60074l.b(16), this.f60074l.b(16), this.f60074l.b(16));
        this.f60066d.setOnClickListener(this.f60080r);
        this.f60066d.setVisibility(8);
        this.f60066d.setPadding(this.f60074l.b(16), this.f60074l.b(16), this.f60074l.b(16), this.f60074l.b(16));
        Bitmap bitmapC = q4.c(getContext());
        if (bitmapC != null) {
            this.f60066d.setImageBitmap(bitmapC);
        }
        Bitmap bitmapB = q4.b(getContext());
        if (bitmapB != null) {
            this.f60065c.setImageBitmap(bitmapB);
        }
        kb.a(this.f60065c, -2013265920, -1, -1, this.f60074l.b(1), this.f60074l.b(4));
        kb.a(this.f60066d, -2013265920, -1, -1, this.f60074l.b(1), this.f60074l.b(4));
        kb.a(this.f60078p, -2013265920, -1, -1, this.f60074l.b(1), this.f60074l.b(4));
        this.f60071i.setStarSize(this.f60074l.b(12));
        this.f60076n.setVisibility(8);
        this.f60067e.setFixedHeight(this.f60087y);
        addView(this.f60064b);
        addView(this.f60082t);
        addView(this.f60077o);
        addView(this.f60073k);
        addView(this.f60076n);
        addView(this.f60063a);
        addView(this.f60065c);
        addView(this.f60066d);
        addView(this.f60071i);
        addView(this.f60075m);
        addView(this.f60072j);
        addView(this.f60070h);
        addView(this.f60067e);
        this.f60063a.addView(this.f60078p);
        this.f60063a.addView(this.f60081s, layoutParams);
    }

    public void g() {
        this.B = 2;
        this.f60063a.setVisibility(8);
        this.f60066d.setVisibility(8);
        this.f60065c.setVisibility(0);
        this.f60082t.setVisibility(8);
    }

    @Override // com.my.target.j5
    @NonNull
    public View getCloseButton() {
        return this.f60073k;
    }

    @Override // com.my.target.i5
    @NonNull
    public g9 getPromoMediaView() {
        return this.f60064b;
    }

    @Override // com.my.target.j5
    @NonNull
    public View getView() {
        return this;
    }

    public final void h() {
        this.B = 1;
        this.f60063a.setVisibility(8);
        this.f60066d.setVisibility(0);
        this.f60065c.setVisibility(8);
        this.f60082t.setVisibility(0);
    }

    public final void i() {
        this.f60063a.setVisibility(8);
        this.f60066d.setVisibility(8);
        if (this.B != 2) {
            this.f60065c.setVisibility(8);
        }
    }

    @Override // com.my.target.i5
    public boolean isPlaying() {
        return this.f60064b.e();
    }

    public final void j() {
        this.B = 4;
        if (this.F) {
            this.f60063a.setVisibility(0);
            this.f60082t.setVisibility(0);
        }
        this.f60066d.setVisibility(8);
        this.f60065c.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = this.f60064b.getMeasuredWidth();
        int measuredHeight = this.f60064b.getMeasuredHeight();
        int i16 = (i14 - measuredWidth) >> 1;
        int i17 = (i15 - measuredHeight) >> 1;
        this.f60064b.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
        this.f60082t.layout(this.f60064b.getLeft(), this.f60064b.getTop(), this.f60064b.getRight(), this.f60064b.getBottom());
        int measuredWidth2 = this.f60066d.getMeasuredWidth();
        int i18 = i12 >> 1;
        int i19 = measuredWidth2 >> 1;
        int i20 = i13 >> 1;
        int measuredHeight2 = this.f60066d.getMeasuredHeight() >> 1;
        this.f60066d.layout(i18 - i19, i20 - measuredHeight2, i19 + i18, measuredHeight2 + i20);
        int measuredWidth3 = this.f60065c.getMeasuredWidth();
        int i21 = measuredWidth3 >> 1;
        int measuredHeight3 = this.f60065c.getMeasuredHeight() >> 1;
        this.f60065c.layout(i18 - i21, i20 - measuredHeight3, i21 + i18, measuredHeight3 + i20);
        int measuredWidth4 = this.f60063a.getMeasuredWidth();
        int i22 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f60063a.getMeasuredHeight() >> 1;
        this.f60063a.layout(i18 - i22, i20 - measuredHeight4, i18 + i22, i20 + measuredHeight4);
        TextView textView = this.f60073k;
        int i23 = this.f60083u;
        textView.layout(i23, i23, textView.getMeasuredWidth() + i23, this.f60083u + this.f60073k.getMeasuredHeight());
        if (i14 <= i15) {
            this.f60077o.layout(((this.f60064b.getRight() - this.f60083u) - this.f60077o.getMeasuredWidth()) + this.f60077o.getPadding(), ((this.f60064b.getBottom() - this.f60083u) - this.f60077o.getMeasuredHeight()) + this.f60077o.getPadding(), (this.f60064b.getRight() - this.f60083u) + this.f60077o.getPadding(), (this.f60064b.getBottom() - this.f60083u) + this.f60077o.getPadding());
            this.f60067e.layout((this.f60064b.getRight() - this.f60083u) - this.f60067e.getMeasuredWidth(), this.f60064b.getTop() + this.f60083u, this.f60064b.getRight() - this.f60083u, this.f60064b.getTop() + this.f60083u + this.f60067e.getMeasuredHeight());
            int i24 = this.f60083u;
            int measuredHeight5 = this.f60070h.getMeasuredHeight() + this.f60071i.getMeasuredHeight() + this.f60075m.getMeasuredHeight() + this.f60072j.getMeasuredHeight();
            int bottom = getBottom() - this.f60064b.getBottom();
            if ((i24 * 3) + measuredHeight5 > bottom) {
                i24 = (bottom - measuredHeight5) / 3;
            }
            TextView textView2 = this.f60070h;
            int i25 = i14 >> 1;
            textView2.layout(i25 - (textView2.getMeasuredWidth() >> 1), this.f60064b.getBottom() + i24, (this.f60070h.getMeasuredWidth() >> 1) + i25, this.f60064b.getBottom() + i24 + this.f60070h.getMeasuredHeight());
            StarsRatingView starsRatingView = this.f60071i;
            starsRatingView.layout(i25 - (starsRatingView.getMeasuredWidth() >> 1), this.f60070h.getBottom() + i24, (this.f60071i.getMeasuredWidth() >> 1) + i25, this.f60070h.getBottom() + i24 + this.f60071i.getMeasuredHeight());
            TextView textView3 = this.f60075m;
            textView3.layout(i25 - (textView3.getMeasuredWidth() >> 1), this.f60070h.getBottom() + i24, (this.f60075m.getMeasuredWidth() >> 1) + i25, this.f60070h.getBottom() + i24 + this.f60075m.getMeasuredHeight());
            Button button = this.f60072j;
            button.layout(i25 - (button.getMeasuredWidth() >> 1), this.f60071i.getBottom() + i24, i25 + (this.f60072j.getMeasuredWidth() >> 1), this.f60071i.getBottom() + i24 + this.f60072j.getMeasuredHeight());
            this.f60076n.layout(this.f60083u, (this.f60064b.getBottom() - this.f60083u) - this.f60076n.getMeasuredHeight(), this.f60083u + this.f60076n.getMeasuredWidth(), this.f60064b.getBottom() - this.f60083u);
            return;
        }
        int iMax = Math.max(this.f60072j.getMeasuredHeight(), Math.max(this.f60070h.getMeasuredHeight(), this.f60071i.getMeasuredHeight()));
        Button button2 = this.f60072j;
        int measuredWidth5 = (i14 - this.f60083u) - button2.getMeasuredWidth();
        int measuredHeight6 = ((i15 - this.f60083u) - this.f60072j.getMeasuredHeight()) - ((iMax - this.f60072j.getMeasuredHeight()) >> 1);
        int i26 = this.f60083u;
        button2.layout(measuredWidth5, measuredHeight6, i14 - i26, (i15 - i26) - ((iMax - this.f60072j.getMeasuredHeight()) >> 1));
        this.f60077o.layout((this.f60072j.getRight() - this.f60077o.getMeasuredWidth()) + this.f60077o.getPadding(), (((this.f60064b.getBottom() - (this.f60083u << 1)) - this.f60077o.getMeasuredHeight()) - iMax) + this.f60077o.getPadding(), this.f60072j.getRight() + this.f60077o.getPadding(), ((this.f60064b.getBottom() - (this.f60083u << 1)) - iMax) + this.f60077o.getPadding());
        this.f60067e.layout(this.f60072j.getRight() - this.f60067e.getMeasuredWidth(), this.f60083u, this.f60072j.getRight(), this.f60083u + this.f60067e.getMeasuredHeight());
        StarsRatingView starsRatingView2 = this.f60071i;
        int left = (this.f60072j.getLeft() - this.f60083u) - this.f60071i.getMeasuredWidth();
        int measuredHeight7 = ((i15 - this.f60083u) - this.f60071i.getMeasuredHeight()) - ((iMax - this.f60071i.getMeasuredHeight()) >> 1);
        int left2 = this.f60072j.getLeft();
        int i27 = this.f60083u;
        starsRatingView2.layout(left, measuredHeight7, left2 - i27, (i15 - i27) - ((iMax - this.f60071i.getMeasuredHeight()) >> 1));
        TextView textView4 = this.f60075m;
        int left3 = (this.f60072j.getLeft() - this.f60083u) - this.f60075m.getMeasuredWidth();
        int measuredHeight8 = ((i15 - this.f60083u) - this.f60075m.getMeasuredHeight()) - ((iMax - this.f60075m.getMeasuredHeight()) >> 1);
        int left4 = this.f60072j.getLeft();
        int i28 = this.f60083u;
        textView4.layout(left3, measuredHeight8, left4 - i28, (i15 - i28) - ((iMax - this.f60075m.getMeasuredHeight()) >> 1));
        int iMin = Math.min(this.f60071i.getLeft(), this.f60075m.getLeft());
        TextView textView5 = this.f60070h;
        int measuredWidth6 = (iMin - this.f60083u) - textView5.getMeasuredWidth();
        int measuredHeight9 = ((i15 - this.f60083u) - this.f60070h.getMeasuredHeight()) - ((iMax - this.f60070h.getMeasuredHeight()) >> 1);
        int i29 = this.f60083u;
        textView5.layout(measuredWidth6, measuredHeight9, iMin - i29, (i15 - i29) - ((iMax - this.f60070h.getMeasuredHeight()) >> 1));
        ub ubVar = this.f60076n;
        int i30 = this.f60083u;
        ubVar.layout(i30, ((i15 - i30) - ubVar.getMeasuredHeight()) - ((iMax - this.f60076n.getMeasuredHeight()) >> 1), this.f60083u + this.f60076n.getMeasuredWidth(), (i15 - this.f60083u) - ((iMax - this.f60076n.getMeasuredHeight()) >> 1));
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f60077o.measure(View.MeasureSpec.makeMeasureSpec(this.f60087y, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f60087y, 1073741824));
        this.f60076n.measure(View.MeasureSpec.makeMeasureSpec(this.f60087y, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f60087y, 1073741824));
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f60064b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i12 = this.f60083u << 1;
        int i13 = size - i12;
        int i14 = size2 - i12;
        this.f60073k.measure(View.MeasureSpec.makeMeasureSpec(i13 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60067e.measure(View.MeasureSpec.makeMeasureSpec(this.f60087y, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f60087y, Integer.MIN_VALUE));
        this.f60065c.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60066d.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60063a.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60071i.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60082t.measure(View.MeasureSpec.makeMeasureSpec(this.f60064b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f60064b.getMeasuredHeight(), 1073741824));
        this.f60072j.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60070h.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60075m.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.f60072j.getMeasuredWidth();
            int measuredWidth2 = this.f60070h.getMeasuredWidth();
            if (this.f60076n.getMeasuredWidth() + measuredWidth2 + Math.max(this.f60071i.getMeasuredWidth(), this.f60075m.getMeasuredWidth()) + measuredWidth + (this.f60083u * 3) > i13) {
                int measuredWidth3 = (i13 - this.f60076n.getMeasuredWidth()) - (this.f60083u * 3);
                int i15 = measuredWidth3 / 3;
                this.f60072j.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                this.f60071i.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                this.f60075m.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                this.f60070h.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.f60072j.getMeasuredWidth()) - this.f60075m.getMeasuredWidth()) - this.f60071i.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
            }
        } else {
            int measuredHeight = this.f60070h.getMeasuredHeight() + this.f60071i.getMeasuredHeight() + this.f60075m.getMeasuredHeight() + this.f60072j.getMeasuredHeight();
            int measuredHeight2 = (size2 - this.f60064b.getMeasuredHeight()) / 2;
            int i16 = this.f60083u;
            if (measuredHeight + (i16 * 3) > measuredHeight2) {
                int i17 = i16 / 2;
                this.f60072j.setPadding(i16, i17, i16, i17);
                this.f60072j.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.i5
    public void pause() {
        int i10 = this.B;
        if (i10 == 0 || i10 == 2) {
            h();
            this.f60064b.f();
        }
    }

    @Override // com.my.target.i5
    public void resume() {
        this.f60064b.g();
    }

    @Override // com.my.target.j5
    public void setBanner(@NonNull o4 o4Var) {
        this.f60064b.b(o4Var, 1);
        s5 s5VarV = o4Var.V();
        if (s5VarV == null) {
            return;
        }
        this.f60076n.setMax(o4Var.o());
        this.F = s5VarV.c0();
        this.E = o4Var.O();
        this.f60072j.setText(o4Var.i());
        this.f60070h.setText(o4Var.A());
        if ("store".equals(o4Var.t())) {
            if (o4Var.w() > 0.0f) {
                this.f60071i.setVisibility(0);
                this.f60071i.setRating(o4Var.w());
            } else {
                this.f60071i.setVisibility(8);
            }
            this.f60075m.setVisibility(8);
        } else {
            this.f60071i.setVisibility(8);
            this.f60075m.setVisibility(0);
            this.f60075m.setText(o4Var.n());
        }
        this.G = s5VarV.N();
        this.H = s5VarV.O();
        this.f60073k.setText(this.G);
        if (s5VarV.a0() && s5VarV.h0()) {
            if (s5VarV.M() > 0.0f) {
                this.D = s5VarV.M();
                this.f60073k.setEnabled(false);
                this.f60073k.setTextColor(-3355444);
                TextView textView = this.f60073k;
                int i10 = this.f60084v;
                textView.setPadding(i10, i10, i10, i10);
                kb.a(this.f60073k, -2013265920, -2013265920, -3355444, this.f60074l.b(1), this.f60074l.b(4));
                this.f60073k.setTextSize(2, 12.0f);
            } else {
                TextView textView2 = this.f60073k;
                int i11 = this.f60083u;
                textView2.setPadding(i11, i11, i11, i11);
                this.f60073k.setVisibility(0);
            }
        }
        this.f60081s.setText(s5VarV.W());
        Bitmap bitmapD = q4.d(getContext());
        if (bitmapD != null) {
            this.f60078p.setImageBitmap(bitmapD);
        }
        if (s5VarV.h0()) {
            c(true);
            e();
        } else {
            h();
        }
        this.C = s5VarV.o();
        y2 y2Var = this.f60077o;
        y2Var.setOnClickListener(new View.OnClickListener() { // from class: k5.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86045b.a(view);
            }
        });
        if (s5VarV.g0()) {
            y2Var.a(this.f60086x, false);
            y2Var.setContentDescription("sound_off");
        } else {
            y2Var.a(this.f60085w, false);
            y2Var.setContentDescription("sound_on");
        }
        com.my.target.c cVarA = o4Var.a();
        if (cVarA != null) {
            a(cVarA);
        } else {
            this.f60067e.setVisibility(8);
        }
    }

    @Override // com.my.target.j5
    public void setClickArea(@NonNull d1 d1Var) {
        gb.a("PromoStyle1View: Apply click area " + d1Var.a() + " to view");
        setOnClickListener((d1Var.f59462l || d1Var.f59463m) ? this.f60069g : null);
        this.f60072j.setOnClickListener((d1Var.f59457g || d1Var.f59463m) ? this.f60069g : null);
        this.f60070h.setOnClickListener((d1Var.f59451a || d1Var.f59463m) ? this.f60069g : null);
        this.f60071i.setOnClickListener((d1Var.f59455e || d1Var.f59463m) ? this.f60069g : null);
        this.f60075m.setOnClickListener((d1Var.f59460j || d1Var.f59463m) ? this.f60069g : null);
        this.f60064b.getClickableLayout().setOnClickListener((d1Var.f59464n || d1Var.f59463m) ? this.f60069g : this.f60079q);
    }

    @Override // com.my.target.j5
    public void setInterstitialPromoViewListener(@Nullable j5.a aVar) {
        this.f60088z = aVar;
    }

    @Override // com.my.target.i5
    public void setMediaListener(@Nullable y4.a aVar) {
        this.A = aVar;
        this.f60064b.setInterstitialPromoViewListener(aVar);
    }

    @Override // com.my.target.i5
    public void setTimeChanged(float f10) {
        if (!this.I && this.E) {
            float f11 = this.D;
            if (f11 > 0.0f && f11 >= f10) {
                if (this.f60073k.getVisibility() != 0) {
                    this.f60073k.setVisibility(0);
                }
                if (this.H != null) {
                    int iCeil = (int) Math.ceil(this.D - f10);
                    String strValueOf = String.valueOf(iCeil);
                    if (this.D > 9.0f && iCeil <= 9) {
                        strValueOf = "0" + strValueOf;
                    }
                    this.f60073k.setText(this.H.replace(TimeModel.NUMBER_FORMAT, strValueOf));
                }
            }
        }
        if (this.f60076n.getVisibility() != 0) {
            this.f60076n.setVisibility(0);
        }
        this.f60076n.setProgress(f10 / this.C);
        this.f60076n.setDigit((int) Math.ceil(this.C - f10));
    }

    @Override // com.my.target.i5
    public final void b(boolean z10) {
        y2 y2Var = this.f60077o;
        if (z10) {
            y2Var.a(this.f60086x, false);
            y2Var.setContentDescription("sound_off");
        } else {
            y2Var.a(this.f60085w, false);
            y2Var.setContentDescription("sound_on");
        }
    }

    @Override // com.my.target.i5
    public void a(o4 o4Var) {
        this.f60064b.setOnClickListener(null);
        this.f60077o.setVisibility(8);
        this.f60064b.b(o4Var);
        c();
        this.B = 4;
        this.f60063a.setVisibility(8);
        this.f60066d.setVisibility(8);
        this.f60065c.setVisibility(8);
        this.f60082t.setVisibility(8);
        this.f60076n.setVisibility(8);
    }

    @Override // com.my.target.i5
    public void c(boolean z10) {
        this.f60064b.a(z10);
        e();
    }

    @Override // com.my.target.i5
    public void a(boolean z10) {
        this.f60064b.b(true);
    }

    @Override // com.my.target.i5
    public void a(int i10) {
        this.f60064b.a(i10);
    }

    @Override // com.my.target.i5
    public void a() {
        this.f60064b.i();
        i();
    }

    private void a(com.my.target.c cVar) {
        this.f60067e.setImageBitmap(cVar.c().getBitmap());
        this.f60067e.setOnClickListener(this.f60080r);
    }
}
