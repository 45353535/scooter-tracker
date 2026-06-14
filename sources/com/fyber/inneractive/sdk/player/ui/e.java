package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends RelativeLayout implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f23356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f23358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UnitDisplayType f23359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f23362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23363h;

    public e(Context context) {
        super(context, null, 0);
        this.f23356a = new g1();
        this.f23357b = 0;
        this.f23360e = false;
        this.f23361f = false;
        this.f23363h = false;
        this.f23357b = Math.min(com.fyber.inneractive.sdk.util.o.e(), com.fyber.inneractive.sdk.util.o.d());
    }

    public abstract void a(h1 h1Var, int i10, int i11);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean a() {
        return false;
    }

    public void c() {
        this.f23363h = true;
    }

    public void d() {
        this.f23363h = false;
    }

    public final void e() {
        boolean globalVisibleRect = isShown() && hasWindowFocus() && this.f23361f && !this.f23363h;
        if (globalVisibleRect) {
            globalVisibleRect = getGlobalVisibleRect(new Rect());
        }
        if (globalVisibleRect == this.f23360e || this.f23362g == null) {
            return;
        }
        IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(globalVisibleRect));
        this.f23360e = globalVisibleRect;
        this.f23362g.a(globalVisibleRect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f23361f));
        this.f23361f = true;
        n nVar = this.f23362g;
        if (nVar != null) {
            nVar.a();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f23361f));
        this.f23361f = false;
        n nVar = this.f23362g;
        if (nVar != null) {
            nVar.c();
        }
        e();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i10));
            e();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(new d(this, z10), 500L);
    }

    public void setListener(n nVar) {
        this.f23362g = nVar;
    }

    public void setUnitConfig(s0 s0Var) {
        this.f23358c = s0Var;
        r0 r0Var = (r0) s0Var;
        this.f23359d = r0Var.f20437e == null ? r0Var.f20438f.f20498j : UnitDisplayType.DEFAULT;
    }
}
