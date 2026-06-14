package com.fyber.inneractive.sdk.player.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.h1;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends s {
    public final t0 A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f23365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f23366z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.content.Context r22, com.fyber.inneractive.sdk.player.ui.a r23, com.fyber.inneractive.sdk.player.n r24, com.fyber.inneractive.sdk.config.global.r r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.ui.i.<init>(android.content.Context, com.fyber.inneractive.sdk.player.ui.a, com.fyber.inneractive.sdk.player.n, com.fyber.inneractive.sdk.config.global.r, java.lang.String):void");
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        p pVar = this.f23366z;
        return pVar != null && pVar.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z10) {
        this.f23365y.b(z10);
        if (a(this.f23366z)) {
            this.f23366z.b(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z10) {
        this.f23365y.c(z10);
        if (a(this.f23366z)) {
            this.f23366z.c(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z10) {
        this.f23365y.d(z10);
        if (a(this.f23366z)) {
            this.f23366z.d(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z10) {
        if (a(this.f23366z)) {
            this.f23366z.e(z10);
        } else {
            this.f23365y.e(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z10) {
        this.f23365y.f(z10);
        if (a(this.f23366z)) {
            this.f23366z.f(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z10) {
        if (a(this.f23366z)) {
            this.f23366z.g(z10);
        } else {
            this.f23365y.g(z10);
        }
    }

    public InneractiveAdRequest getAdRequest() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f21035a;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.response.e getAdResponse() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f21036b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.f23365y.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return a(this.f23366z) ? this.f23366z.getTrackingFriendlyView() : this.f23365y.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return a(this.f23366z) ? this.f23366z.getTrackingFriendlyViewObstructionPurposeOther() : this.f23365y.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        this.f23365y.h();
        if (a(this.f23366z)) {
            this.f23366z.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean i() {
        return a(this.f23366z) ? this.f23366z.L.f23392n : this.f23365y.i();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        this.f23365y.j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        this.f23365y.k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return a(this.f23366z) ? this.f23366z.L.f23391m : this.f23365y.l();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        this.f23365y.m();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        this.f23365y.n();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f23365y.o();
        this.f23420t = this.f23365y.f23420t;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        this.f23365y.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.f23365y.setListener(nVar);
        if (a(this.f23366z)) {
            this.f23366z.setListener(nVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z10) {
        this.f23365y.setMuteButtonState(z10);
        if (a(this.f23366z)) {
            this.f23366z.setMuteButtonState(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        this.f23365y.setRemainingTime(str);
        if (a(this.f23366z)) {
            this.f23366z.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        this.f23365y.setSkipText(str);
        if (a(this.f23366z)) {
            this.f23366z.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setUnitConfig(s0 s0Var) {
        super.setUnitConfig(s0Var);
        this.f23365y.setUnitConfig(s0Var);
        if (a(this.f23366z)) {
            this.f23366z.setUnitConfig(s0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup viewGroup;
        p pVar;
        this.f23365y.a(dVar, bVar);
        if (!a(this.f23366z) || (viewGroup = this.f23417q) == null || viewGroup.getVisibility() != 0 || (pVar = this.f23366z) == null) {
            return;
        }
        pVar.destroy();
        this.f23366z = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f() {
        o oVar = this.f23365y;
        oVar.p();
        oVar.B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        this.f23365y.g();
        if (a(this.f23366z)) {
            this.f23366z.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar) {
        if (!a(this.f23366z)) {
            this.f23365y.a(z10, mVar);
        } else {
            this.f23366z.a(z10, mVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, String str) {
        this.f23365y.a(z10, str);
        if (a(this.f23366z)) {
            this.f23366z.a(z10, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, int i10, int i11) {
        this.f23414n = i10;
        this.f23415o = i11;
        this.f23416p = z10;
        o oVar = this.f23365y;
        oVar.f23414n = i10;
        oVar.f23415o = i11;
        oVar.f23416p = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        this.f23365y.a(bVar, bVar2);
        p pVar = this.f23366z;
        if (pVar != null) {
            pVar.destroy();
            this.f23366z = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10) {
        if (a(this.f23366z)) {
            this.f23366z.a(z10);
        } else {
            this.f23365y.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i10, int i11) {
        this.f23365y.a(i10, i11);
        if (a(this.f23366z)) {
            this.f23366z.a(i10, i11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i10, int i11) {
        this.f23365y.a(h1Var, i10, i11);
    }

    public static boolean a(p pVar) {
        return (pVar == null || pVar.L.f23386h || !pVar.a()) ? false : true;
    }
}
