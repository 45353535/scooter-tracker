package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.n9;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o9 extends ViewGroup implements n9, View.OnClickListener {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public View K;
    public int L;
    public int M;
    public int N;
    public int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f60460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa f60461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2 f60462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f60463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f60464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n9.a f60465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g2 f60466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f60467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ma f60468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ma f60469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f60470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProgressBar f60471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f60472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f60473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f60474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Button f60475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f60476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f60477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f60478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ub f60479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bitmap f60480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bitmap f60481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bitmap f60482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bitmap f60483x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bitmap f60484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f60485z;

    public o9(View view, View view2, n9.a aVar, View view3, aa aaVar, Context context) {
        super(context);
        this.f60465f = aVar;
        this.K = view3;
        this.f60464e = view2;
        this.f60463d = view;
        this.f60461b = aaVar;
        int iA = aaVar.a(aa.f59157j);
        this.D = iA;
        int iA2 = aaVar.a(aa.V);
        this.J = iA2;
        this.G = aaVar.a(aa.T);
        this.H = aaVar.a(aa.H);
        this.I = aaVar.a(aa.W);
        this.E = aaVar.a(aa.Y);
        x2 x2Var = new x2(context);
        this.f60462c = x2Var;
        x2Var.setVisibility(8);
        x2Var.setOnClickListener(this);
        x2Var.setPadding(iA);
        g2 g2Var = new g2(context);
        this.f60466g = g2Var;
        g2Var.setVisibility(8);
        g2Var.setOnClickListener(this);
        kb.a(g2Var, -2013265920, -1, -1, aaVar.a(aa.f59152e), aaVar.a(aa.f59153f));
        Button button = new Button(context);
        this.f60467h = button;
        button.setTextColor(-1);
        button.setLines(aaVar.a(aa.f59154g));
        button.setTextSize(1, aaVar.a(aa.f59155h));
        button.setMaxWidth(aaVar.a(aa.f59151d));
        button.setOnClickListener(this);
        button.setBackgroundColor(0);
        button.setIncludeFontPadding(false);
        int iA3 = aaVar.a(aa.f59156i);
        this.f60485z = iA3;
        this.A = aaVar.a(aa.f59160m);
        this.B = aaVar.a(aa.f59161n);
        int iA4 = aaVar.a(aa.f59165r);
        this.C = iA4;
        this.N = aaVar.a(aa.f59162o);
        this.F = aaVar.a(aa.f59163p);
        i iVar = new i(context);
        this.f60470k = iVar;
        iVar.setFixedHeight(iA4);
        this.f60482w = q4.c(context);
        this.f60483x = q4.d(context);
        this.f60484y = q4.b(context);
        this.f60480u = q4.f(context);
        this.f60481v = q4.e(context);
        ma maVar = new ma(context);
        this.f60468i = maVar;
        ProgressBar progressBar = new ProgressBar(context, null, android.R.attr.progressBarStyleLarge);
        this.f60471l = progressBar;
        progressBar.setVisibility(8);
        View view4 = new View(context);
        this.f60472m = view4;
        view4.setBackgroundColor(-1728053248);
        view4.setVisibility(8);
        View view5 = new View(context);
        this.f60474o = view5;
        View view6 = new View(context);
        this.f60473n = view6;
        TextView textView = new TextView(context);
        this.f60476q = textView;
        textView.setTextSize(1, aaVar.a(aa.f59166s));
        textView.setTextColor(-1);
        textView.setMaxLines(aaVar.a(aa.f59167t));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.f60477r = textView2;
        textView2.setTextSize(1, aaVar.a(aa.f59168u));
        textView2.setTextColor(-1);
        textView2.setMaxLines(aaVar.a(aa.f59169v));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        Button button2 = new Button(context);
        this.f60475p = button2;
        button2.setLines(1);
        button2.setTextSize(1, aaVar.a(aa.f59170w));
        button2.setEllipsize(truncateAt);
        button2.setIncludeFontPadding(false);
        button2.setMinimumWidth(iA2);
        button2.setPadding(iA3, 0, iA3, 0);
        TextView textView3 = new TextView(context);
        this.f60478s = textView3;
        textView3.setPadding(aaVar.a(aa.f59172y), 0, 0, 0);
        textView3.setTextColor(-1);
        textView3.setMaxLines(aaVar.a(aa.B));
        textView3.setIncludeFontPadding(false);
        textView3.setTextSize(1, aaVar.a(aa.X));
        ub ubVar = new ub(context);
        this.f60479t = ubVar;
        x2 x2Var2 = new x2(context);
        this.f60460a = x2Var2;
        x2Var2.setPadding(iA);
        ma maVar2 = new ma(context);
        this.f60469j = maVar2;
        kb.a(this, "ad_view");
        kb.a(textView, "title");
        kb.a(textView2, "description");
        kb.a(maVar, "image");
        kb.a(button2, "cta");
        kb.a(x2Var, "dismiss");
        kb.a(g2Var, "play");
        kb.a(maVar2, "ads_logo");
        kb.a(view4, "media_dim");
        kb.a(view6, "top_dim");
        kb.a(view5, "bot_dim");
        kb.a(textView3, "age_bordering");
        kb.a(iVar, "ad_choices");
        kb.b(x2Var2, "sound_button");
        if (view3 != null) {
            addView(view3);
        }
        addView(maVar);
        addView(view4);
        addView(view5);
        addView(view6);
        addView(view);
        addView(x2Var);
        addView(textView);
        addView(textView2);
        addView(button2);
        addView(textView3);
        addView(maVar2);
        addView(iVar);
        addView(ubVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, android.widget.Button] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, com.my.target.ma] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, android.view.View$OnClickListener, com.my.target.o9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void setClickArea(@NonNull d1 d1Var) {
        if (d1Var.f59463m) {
            setOnClickListener(this);
            this.f60475p.setOnClickListener(this);
            return;
        }
        setOnClickListener(d1Var.f59462l ? this : 0);
        this.f60475p.setEnabled(d1Var.f59457g);
        this.f60475p.setOnClickListener(d1Var.f59457g ? this : 0);
        this.f60476q.setOnClickListener(d1Var.f59451a ? this : 0);
        this.f60478s.setOnClickListener((d1Var.f59458h || d1Var.f59459i) ? this : 0);
        this.f60477r.setOnClickListener(d1Var.f59452b ? this : 0);
        this.f60468i.setOnClickListener(d1Var.f59454d ? this : 0);
    }

    @Override // com.my.target.n9
    public View a() {
        return this;
    }

    @Override // com.my.target.n9
    public void b() {
        this.f60462c.setVisibility(0);
        this.f60479t.setVisibility(8);
    }

    @Override // com.my.target.n9
    public void c(boolean z10) {
        this.f60472m.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.my.target.n9
    public void d() {
        this.f60466g.setVisibility(8);
        this.f60467h.setVisibility(8);
    }

    @Override // com.my.target.n9
    public void e() {
        this.f60460a.setVisibility(8);
    }

    @Override // com.my.target.n9
    @NonNull
    public View getCloseButton() {
        return this.f60462c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f60462c) {
            this.f60465f.l();
            return;
        }
        if (view == this.f60460a) {
            this.f60465f.g();
            return;
        }
        if (view == this.f60466g || view == this.f60467h) {
            this.f60465f.b(this.O);
            return;
        }
        if (view == this.K) {
            this.f60465f.n();
            return;
        }
        if (view == this.f60472m) {
            this.f60465f.i();
            return;
        }
        if (view == this.f60469j) {
            this.f60465f.m();
            return;
        }
        if (view == this.f60470k) {
            this.f60465f.c();
            return;
        }
        Button button = this.f60475p;
        if (view == button && button.isEnabled()) {
            this.f60465f.a(null, 2);
        } else {
            this.f60465f.a(null, 1);
        }
    }

    @Override // com.my.target.n9
    public void setBackgroundImage(@Nullable ImageData imageData) {
        this.f60468i.setImageData(imageData);
    }

    @Override // com.my.target.n9
    public void setBanner(@NonNull o4 o4Var) {
        m9 m9VarT = o4Var.T();
        setBackgroundColor(m9VarT.a());
        int iJ = m9VarT.j();
        this.f60476q.setTextColor(m9VarT.k());
        this.f60477r.setTextColor(iJ);
        if (TextUtils.isEmpty(o4Var.c()) && TextUtils.isEmpty(o4Var.b())) {
            this.f60478s.setVisibility(8);
        } else {
            String strB = o4Var.b();
            if (!TextUtils.isEmpty(o4Var.c()) && !TextUtils.isEmpty(o4Var.b())) {
                strB = strB + " ";
            }
            String str = strB + o4Var.c();
            this.f60478s.setVisibility(0);
            this.f60478s.setText(str);
        }
        ImageData imageDataM = o4Var.M();
        if (imageDataM == null || imageDataM.getData() == null) {
            Bitmap bitmapA = l0.a(this.f60461b.a(aa.f59165r));
            if (bitmapA != null) {
                this.f60462c.a(bitmapA, false);
            }
        } else {
            this.f60462c.a(imageDataM.getData(), true);
        }
        kb.b(this.f60475p, m9VarT.d(), m9VarT.f(), this.N);
        this.f60475p.setTextColor(m9VarT.j());
        this.f60475p.setText(o4Var.i());
        this.f60476q.setText(o4Var.A());
        this.f60477r.setText(o4Var.k());
        ImageData imageDataP = o4Var.P();
        if (imageDataP != null && imageDataP.getBitmap() != null) {
            this.f60469j.setImageData(imageDataP);
            this.f60469j.setOnClickListener(this);
        }
        c cVarA = o4Var.a();
        if (cVarA != null) {
            this.f60470k.setImageBitmap(cVarA.c().getBitmap());
            this.f60470k.setOnClickListener(this);
        } else {
            this.f60470k.setVisibility(8);
        }
        setClickArea(o4Var.g());
    }

    @Override // com.my.target.n9
    public void setPanelColor(int i10) {
        this.f60474o.setBackgroundColor(i10);
        this.f60473n.setBackgroundColor(i10);
    }

    @Override // com.my.target.n9
    public void setSoundState(boolean z10) {
        if (z10) {
            this.f60460a.a(this.f60480u, false);
            this.f60460a.setContentDescription("sound_on");
        } else {
            this.f60460a.a(this.f60481v, false);
            this.f60460a.setContentDescription("sound_off");
        }
    }

    @Override // com.my.target.n9
    public void a(int i10, String str) {
        this.f60466g.setVisibility(0);
        if (i10 == 1) {
            this.f60466g.setImageBitmap(this.f60484y);
            this.O = 1;
        } else if (i10 == 2) {
            this.f60466g.setImageBitmap(this.f60483x);
            this.O = 2;
        } else {
            this.f60466g.setImageBitmap(this.f60482w);
            this.O = 0;
        }
        if (str == null) {
            this.f60467h.setVisibility(8);
        } else {
            this.f60467h.setVisibility(0);
            this.f60467h.setText(str);
        }
    }

    @Override // com.my.target.n9
    public void c() {
        this.f60479t.setVisibility(8);
    }

    @Override // com.my.target.n9
    public void b(boolean z10) {
        this.f60471l.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.my.target.n9
    public void a(boolean z10) {
        this.f60468i.setVisibility(z10 ? 0 : 4);
    }

    @Override // com.my.target.n9
    public void a(int i10, float f10) {
        this.f60479t.setDigit(i10);
        this.f60479t.setProgress(f10);
    }

    public boolean a(int i10) {
        View view = this.K;
        return ((double) kb.a(view != null ? view.getMeasuredWidth() : 0, this.f60468i.getMeasuredWidth())) * 1.6d <= ((double) i10);
    }
}
