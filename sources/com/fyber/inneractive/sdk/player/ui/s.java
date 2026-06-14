package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.v;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f23411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f23412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f23413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewGroup f23417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f23418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f23419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h1 f23420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f23421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f23422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f23423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f23424x;

    public s(Context context, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context);
        this.f23414n = -1;
        this.f23415o = -1;
        this.f23416p = false;
        this.f23419s = new h1(0, 0);
        this.f23424x = new h1(0, 0);
        IAlog.a("%sctor called", IAlog.a(this));
        int tickFractions = getTickFractions();
        this.f23410j = tickFractions;
        this.f23409i = getMaxTickFactor();
        this.f23411k = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f23422v = rVar;
        this.f23423w = str;
    }

    public abstract void a(int i10, int i11);

    public abstract void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2);

    public abstract void a(boolean z10);

    public void a(boolean z10, int i10, int i11) {
        this.f23414n = i10;
        this.f23415o = i11;
        this.f23416p = z10;
    }

    public abstract void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar);

    public abstract void a(boolean z10, String str);

    public abstract void b(boolean z10);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean b() {
        return this.f23417q.getVisibility() == 0 || this.f23418r.getChildCount() > 0;
    }

    public abstract void c(boolean z10);

    public abstract void d(boolean z10);

    public void destroy() {
        h();
        setVisibility(8);
        if (this.f23362g != null) {
            this.f23362g = null;
        }
        IAlog.a("%sdestroyed called", IAlog.a(this));
    }

    public abstract void e(boolean z10);

    public abstract void f();

    public abstract void f(boolean z10);

    public abstract void g();

    public abstract void g(boolean z10);

    public ViewGroup getDefaultEndCardContainer() {
        return this.f23417q;
    }

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public ViewGroup getTextureHost() {
        return this.f23412l;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.f23415o;
    }

    public int getVideoWidth() {
        return this.f23414n;
    }

    public abstract void h();

    public abstract boolean i();

    public abstract void j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        a(this.f23424x, size, size2);
        h1 h1Var = this.f23424x;
        int i12 = h1Var.f23872a;
        if (i12 <= 0 || h1Var.f23873b <= 0) {
            h1Var.f23872a = size;
            h1Var.f23873b = size2;
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(this.f23424x.f23873b, 1073741824);
            i10 = iMakeMeasureSpec;
        }
        if (!this.f23419s.equals(this.f23424x)) {
            h1 h1Var2 = this.f23419s;
            h1 h1Var3 = this.f23424x;
            h1Var2.getClass();
            h1Var2.f23872a = h1Var3.f23872a;
            h1Var2.f23873b = h1Var3.f23873b;
            o();
        }
        super.onMeasure(i10, i11);
    }

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z10);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    public void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            n nVar = this.f23362g;
            com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) dVar.f();
            fVar.a(bVar, nVar);
            ViewGroup viewGroup = fVar.f20657c;
            v.a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            dVar.a(dVar.f20650e, dVar.f20648c);
        }
    }

    public final void a(View view, int i10) {
        if (view != null) {
            view.setOnTouchListener(new r(new GestureDetector(view.getContext(), new q(this, view, new int[2], i10))));
        }
    }
}
