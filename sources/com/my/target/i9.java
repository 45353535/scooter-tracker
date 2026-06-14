package com.my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import com.my.target.h9;

/* JADX INFO: loaded from: classes11.dex */
public class i9 extends ViewGroup implements h9, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f59848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la f59849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f59850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f59851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f59852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f59853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f59854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f59855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h9.a f59856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f59857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f59858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f59859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f59860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f59861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f59862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f59863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aa f59864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f59865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f59866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f59867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f59868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f59869v;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59870a;

        static {
            int[] iArr = new int[b.values().length];
            f59870a = iArr;
            try {
                iArr[b.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59870a[b.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59870a[b.LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        PORTRAIT,
        LANDSCAPE,
        SQUARE
    }

    public i9(aa aaVar, Context context, h9.a aVar) {
        super(context);
        this.f59868u = b.PORTRAIT;
        this.f59856i = aVar;
        this.f59864q = aaVar;
        this.f59857j = aaVar.a(aa.F);
        this.f59858k = aaVar.a(aa.G);
        this.f59867t = aaVar.a(aa.H);
        this.f59859l = aaVar.a(aa.I);
        this.f59860m = aaVar.a(aa.f59162o);
        this.f59861n = aaVar.a(aa.f59161n);
        int iA = aaVar.a(aa.N);
        this.f59865r = iA;
        int iA2 = aaVar.a(aa.U);
        this.f59862o = iA2;
        this.f59863p = aaVar.a(aa.T);
        this.f59866s = kb.a(iA, context);
        ma maVar = new ma(context);
        this.f59848a = maVar;
        la laVar = new la(context);
        this.f59849b = laVar;
        TextView textView = new TextView(context);
        this.f59850c = textView;
        textView.setMaxLines(1);
        textView.setTextSize(1, aaVar.a(aa.J));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.f59851d = textView2;
        textView2.setTextSize(1, aaVar.a(aa.L));
        textView2.setMaxLines(aaVar.a(aa.M));
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        TextView textView3 = new TextView(context);
        this.f59852e = textView3;
        float f10 = iA;
        textView3.setTextSize(1, f10);
        textView3.setEllipsize(truncateAt);
        textView3.setLines(1);
        textView3.setIncludeFontPadding(false);
        TextView textView4 = new TextView(context);
        this.f59853f = textView4;
        textView4.setTextSize(1, f10);
        textView4.setIncludeFontPadding(false);
        Button button = new Button(context);
        this.f59855h = button;
        button.setLines(1);
        button.setTextSize(1, aaVar.a(aa.f59170w));
        button.setEllipsize(truncateAt);
        button.setMinimumWidth(iA2);
        button.setIncludeFontPadding(false);
        int iA3 = aaVar.a(aa.f59171x);
        int i10 = iA3 * 2;
        button.setPadding(i10, iA3, i10, iA3);
        TextView textView5 = new TextView(context);
        this.f59854g = textView5;
        textView5.setPadding(aaVar.a(aa.f59172y), 0, 0, 0);
        textView5.setTextColor(-1);
        textView5.setMaxLines(aaVar.a(aa.B));
        textView5.setIncludeFontPadding(false);
        textView5.setTextSize(1, aaVar.a(aa.C));
        kb.a(maVar, "panel_icon");
        kb.a(textView, "panel_title");
        kb.a(textView2, "panel_description");
        kb.a(textView3, "panel_domain");
        kb.a(textView4, "panel_rating");
        kb.a(button, "panel_cta");
        kb.a(textView5, "age_bordering");
        addView(maVar);
        addView(laVar);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
        addView(button);
        addView(textView5);
    }

    private void setClickArea(@NonNull d1 d1Var) {
        if (d1Var.f59463m) {
            setOnClickListener(this);
            this.f59855h.setOnClickListener(this);
            return;
        }
        if (d1Var.f59457g) {
            this.f59855h.setOnClickListener(this);
        } else {
            this.f59855h.setEnabled(false);
        }
        if (d1Var.f59462l) {
            setOnClickListener(this);
        } else {
            setOnClickListener(null);
        }
        if (d1Var.f59451a) {
            this.f59850c.setOnClickListener(this);
        } else {
            this.f59850c.setOnClickListener(null);
        }
        if (d1Var.f59453c) {
            this.f59848a.setOnClickListener(this);
        } else {
            this.f59848a.setOnClickListener(null);
        }
        if (d1Var.f59452b) {
            this.f59851d.setOnClickListener(this);
        } else {
            this.f59851d.setOnClickListener(null);
        }
        if (d1Var.f59455e) {
            this.f59853f.setOnClickListener(this);
            this.f59849b.setOnClickListener(this);
        } else {
            this.f59853f.setOnClickListener(null);
            this.f59849b.setOnClickListener(null);
        }
        if (d1Var.f59460j) {
            this.f59852e.setOnClickListener(this);
        } else {
            this.f59852e.setOnClickListener(null);
        }
        if (d1Var.f59458h) {
            this.f59854g.setOnClickListener(this);
        } else {
            this.f59854g.setOnClickListener(null);
        }
    }

    @Override // com.my.target.h9
    public View a() {
        return this;
    }

    public final void b(int i10, int i11, int i12) {
        this.f59850c.setGravity(GravityCompat.START);
        this.f59851d.setVisibility(8);
        this.f59855h.setVisibility(0);
        this.f59850c.setTextSize(this.f59864q.a(aa.K));
        this.f59854g.setVisibility(0);
        TextView textView = this.f59850c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f59850c.setTextSize(1, this.f59864q.a(aa.J));
        this.f59855h.measure(View.MeasureSpec.makeMeasureSpec(i11 / 3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f59863p, 1073741824));
        kb.a(this.f59854g, i11, i12, Integer.MIN_VALUE);
        int measuredWidth = i11 - ((((this.f59848a.getMeasuredWidth() + this.f59855h.getMeasuredWidth()) + (this.f59858k * 2)) + this.f59854g.getMeasuredWidth()) + this.f59859l);
        kb.a(this.f59850c, measuredWidth, i12, Integer.MIN_VALUE);
        kb.a(this.f59852e, measuredWidth, i12, Integer.MIN_VALUE);
        int measuredHeight = this.f59855h.getMeasuredHeight() + (this.f59867t * 2);
        if (this.f59869v) {
            measuredHeight += this.f59861n;
        }
        setMeasuredDimension(i10, measuredHeight);
    }

    public final void c(int i10, int i11, int i12) {
        this.f59850c.setGravity(GravityCompat.START);
        this.f59851d.setVisibility(8);
        this.f59855h.setVisibility(8);
        this.f59854g.setVisibility(0);
        TextView textView = this.f59850c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f59850c.setTextSize(1, this.f59864q.a(aa.J));
        kb.a(this.f59854g, i11, i12, Integer.MIN_VALUE);
        kb.a(this.f59850c, ((i11 - this.f59848a.getMeasuredWidth()) - (this.f59858k * 2)) - this.f59854g.getMeasuredWidth(), this.f59848a.getMeasuredHeight() - (this.f59859l * 2), Integer.MIN_VALUE);
        setMeasuredDimension(i10, kb.a(this.f59848a.getMeasuredHeight() + (this.f59858k * 2), this.f59850c.getMeasuredHeight() + kb.a(this.f59865r, this.f59852e.getMeasuredHeight()) + this.f59858k));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f59856i.a(null, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight = this.f59852e.getMeasuredHeight();
        int measuredHeight2 = this.f59849b.getMeasuredHeight();
        int i14 = a.f59870a[this.f59868u.ordinal()];
        if (i14 == 1) {
            a(i10, i11, i12, i13);
        } else if (i14 != 3) {
            a(i11, measuredHeight, measuredHeight2);
        } else {
            a(i10, i11, i12, i13, measuredHeight, measuredHeight2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.f59858k * 2;
        int i13 = size - i12;
        int i14 = size2 - i12;
        if (i13 == i14) {
            this.f59868u = b.SQUARE;
        } else if (i13 > i14) {
            this.f59868u = b.LANDSCAPE;
        } else {
            this.f59868u = b.PORTRAIT;
        }
        ma maVar = this.f59848a;
        int i15 = this.f59857j;
        kb.a(maVar, i15, i15, 1073741824);
        if (this.f59853f.getVisibility() != 8) {
            kb.a(this.f59853f, (i13 - this.f59848a.getMeasuredWidth()) - this.f59859l, i14, Integer.MIN_VALUE);
            la laVar = this.f59849b;
            int i16 = this.f59866s;
            kb.a(laVar, i16, i16, 1073741824);
        }
        if (this.f59852e.getVisibility() != 8) {
            kb.a(this.f59852e, (i13 - this.f59848a.getMeasuredWidth()) - (this.f59858k * 2), i14, Integer.MIN_VALUE);
        }
        b bVar = this.f59868u;
        if (bVar == b.SQUARE) {
            int i17 = this.f59867t * 2;
            a(size - i17, i13 - i17);
        } else if (bVar == b.LANDSCAPE) {
            b(size, i13, i14);
        } else {
            c(size, i13, i14);
        }
    }

    @Override // com.my.target.h9
    public void setBanner(@NonNull o4 o4Var) {
        m9 m9VarT = o4Var.T();
        int iJ = m9VarT.j();
        this.f59850c.setTextColor(m9VarT.k());
        this.f59851d.setTextColor(iJ);
        this.f59852e.setTextColor(iJ);
        this.f59853f.setTextColor(iJ);
        this.f59849b.setColor(iJ);
        this.f59869v = o4Var.V() != null;
        this.f59848a.setImageData(o4Var.q());
        this.f59850c.setText(o4Var.A());
        this.f59851d.setText(o4Var.k());
        if (o4Var.t().equals("store")) {
            this.f59852e.setVisibility(8);
            if (o4Var.w() > 0.0f) {
                this.f59853f.setVisibility(0);
                String strValueOf = String.valueOf(o4Var.w());
                if (strValueOf.length() > 3) {
                    strValueOf = strValueOf.substring(0, 3);
                }
                this.f59853f.setText(strValueOf);
            } else {
                this.f59853f.setVisibility(8);
            }
        } else {
            this.f59853f.setVisibility(8);
            this.f59852e.setVisibility(0);
            this.f59852e.setText(o4Var.n());
            this.f59852e.setTextColor(m9VarT.g());
        }
        this.f59855h.setText(o4Var.i());
        kb.b(this.f59855h, m9VarT.d(), m9VarT.f(), this.f59860m);
        this.f59855h.setTextColor(m9VarT.j());
        setClickArea(o4Var.g());
        this.f59854g.setText(o4Var.c());
    }

    public final void a(int i10, int i11) {
        this.f59850c.setGravity(1);
        this.f59851d.setGravity(1);
        this.f59851d.setVisibility(0);
        this.f59855h.setVisibility(0);
        this.f59854g.setVisibility(8);
        this.f59850c.setTypeface(Typeface.defaultFromStyle(0));
        this.f59850c.setTextSize(1, this.f59864q.a(aa.K));
        this.f59855h.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f59863p, 1073741824));
        kb.a(this.f59850c, i11, i11, Integer.MIN_VALUE);
        kb.a(this.f59851d, i11, i11, Integer.MIN_VALUE);
        setMeasuredDimension(i10, i10);
    }

    public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
        ma maVar = this.f59848a;
        int i16 = i13 - i11;
        int i17 = this.f59867t;
        kb.e(maVar, i16 - i17, i17);
        Button button = this.f59855h;
        int i18 = this.f59867t;
        kb.d(button, i16 - i18, (i12 - i10) - i18);
        int right = this.f59848a.getRight() + this.f59858k;
        int iA = kb.a(this.f59853f.getMeasuredHeight(), i15, i14);
        int iA2 = kb.a(this.f59848a.getTop(), this.f59859l) + ((((this.f59848a.getMeasuredHeight() - this.f59850c.getMeasuredHeight()) - this.f59859l) - iA) / 2);
        TextView textView = this.f59850c;
        textView.layout(right, iA2, textView.getMeasuredWidth() + right, this.f59850c.getMeasuredHeight() + iA2);
        kb.a(this.f59850c.getBottom() + this.f59859l, right, this.f59850c.getBottom() + this.f59859l + iA, this.f59858k / 4, this.f59849b, this.f59853f, this.f59852e);
        kb.e(this.f59854g, this.f59850c.getBottom(), this.f59850c.getRight() + (this.f59858k / 2));
    }

    public final void a(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int measuredHeight = this.f59848a.getMeasuredHeight();
        if (measuredHeight > 0) {
            i15 = 1;
            i14 = measuredHeight;
        } else {
            i14 = 0;
            i15 = 0;
        }
        int measuredHeight2 = this.f59850c.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            i15++;
            i14 += measuredHeight2;
        }
        int measuredHeight3 = this.f59851d.getMeasuredHeight();
        if (measuredHeight3 > 0) {
            i15++;
            i14 += measuredHeight3;
        }
        int iMax = Math.max(this.f59849b.getMeasuredHeight(), this.f59852e.getMeasuredHeight());
        if (iMax > 0) {
            i15++;
            i14 += iMax;
        }
        int measuredHeight4 = this.f59855h.getMeasuredHeight();
        if (measuredHeight4 > 0) {
            i15++;
            i14 += measuredHeight4;
        }
        int i16 = (i13 - i11) - i14;
        int iA = kb.a(this.f59859l, this.f59858k, i16 / i15);
        int i17 = (i16 - (i15 * iA)) / 2;
        int i18 = i12 - i10;
        kb.a(this.f59848a, 0, i17, i18, measuredHeight + i17);
        int iA2 = kb.a(i17, this.f59848a.getBottom() + iA);
        kb.a(this.f59850c, 0, iA2, i18, measuredHeight2 + iA2);
        int iA3 = kb.a(iA2, this.f59850c.getBottom() + iA);
        kb.a(this.f59851d, 0, iA3, i18, measuredHeight3 + iA3);
        int iA4 = kb.a(iA3, this.f59851d.getBottom() + iA);
        int measuredWidth = ((i18 - this.f59853f.getMeasuredWidth()) - this.f59849b.getMeasuredWidth()) - this.f59852e.getMeasuredWidth();
        int i19 = this.f59859l;
        kb.a(iA4, (measuredWidth - (i19 * 2)) / 2, iMax + iA4, i19, this.f59849b, this.f59853f, this.f59852e);
        int iA5 = kb.a(iA4, this.f59852e.getBottom(), this.f59849b.getBottom()) + iA;
        kb.a(this.f59855h, 0, iA5, i18, measuredHeight4 + iA5);
    }

    public final void a(int i10, int i11, int i12) {
        ma maVar = this.f59848a;
        int i13 = this.f59858k;
        kb.c(maVar, i13, i13);
        int right = this.f59848a.getRight() + (this.f59858k / 2);
        int iA = kb.a(this.f59853f.getMeasuredHeight(), i12, i11);
        int iA2 = kb.a(i10 + this.f59858k, this.f59848a.getTop());
        if (this.f59848a.getMeasuredHeight() > 0) {
            iA2 += (((this.f59848a.getMeasuredHeight() - this.f59850c.getMeasuredHeight()) - this.f59859l) - iA) / 2;
        }
        TextView textView = this.f59850c;
        textView.layout(right, iA2, textView.getMeasuredWidth() + right, this.f59850c.getMeasuredHeight() + iA2);
        kb.a(this.f59850c.getBottom() + this.f59859l, right, this.f59850c.getBottom() + this.f59859l + iA, this.f59858k / 4, this.f59849b, this.f59853f, this.f59852e);
        kb.e(this.f59854g, this.f59850c.getBottom(), this.f59850c.getRight() + this.f59859l);
    }
}
