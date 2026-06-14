package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements com.fyber.inneractive.sdk.player.controller.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f23684a;

    public o(p pVar) {
        this.f23684a = pVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
        this.f23684a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void k() {
        this.f23684a.K();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onCompleted() {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        p pVar = this.f23684a;
        VideoContentListener videoContentListener = pVar.f23687n;
        if (videoContentListener == null || (mVar = pVar.f23686m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f23360e) {
            return;
        }
        videoContentListener.onCompleted();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        p pVar = this.f23684a;
        VideoContentListener videoContentListener = pVar.f23687n;
        if (videoContentListener == null || (mVar = pVar.f23686m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f23360e) {
            return;
        }
        videoContentListener.onPlayerError();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i10, int i11) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        p pVar = this.f23684a;
        VideoContentListener videoContentListener = pVar.f23687n;
        if (videoContentListener == null || (mVar = pVar.f23686m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f23360e) {
            return;
        }
        videoContentListener.onProgress(i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.ignite.m p() {
        return com.fyber.inneractive.sdk.ignite.m.NONE;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void u() {
        this.f23684a.K();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) {
        p pVar = this.f23684a;
        pVar.getClass();
        IAlog.a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.a(pVar));
        ViewGroup viewGroup = this.f23684a.f23689p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        p pVar2 = this.f23684a;
        if (!pVar2.f23694u) {
            com.fyber.inneractive.sdk.network.b0.a(pVar2.f23689p.getContext(), str, str2, this.f23684a.f20622b);
            p pVar3 = this.f23684a;
            pVar3.f23694u = true;
            IAlog.a("%s reporting auto redirect", IAlog.a(pVar3));
            return;
        }
        IAlog.a("%s redirect already reported for this ad", IAlog.a(pVar2));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view != null) {
            Context contextC = this.f23684a.c(view);
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(contextC, str);
            this.f23684a.a(contextC, false, Float.NaN, Float.NaN);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        p pVar = this.f23684a;
        if (pVar.f23686m.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f23888a;
        } else {
            context = this.f23684a.f23686m.getContext();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f23684a.f20622b;
        return pVar.a(context, (xVar == null || (eVar = ((t0) xVar).f21036b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).O) == null) ? null : bVar.f21162b, g1Var, gVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // com.fyber.inneractive.sdk.player.controller.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.util.d0 a(java.lang.String r10, com.fyber.inneractive.sdk.util.g1 r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 == 0) goto L1d
            com.fyber.inneractive.sdk.renderers.p r0 = r9.f23684a
            com.fyber.inneractive.sdk.flow.x r0 = r0.f20622b
            if (r0 == 0) goto L1d
            com.fyber.inneractive.sdk.flow.t0 r0 = (com.fyber.inneractive.sdk.flow.t0) r0
            com.fyber.inneractive.sdk.response.e r10 = r0.f21036b
            if (r10 == 0) goto L1c
            com.fyber.inneractive.sdk.response.g r10 = (com.fyber.inneractive.sdk.response.g) r10
            com.fyber.inneractive.sdk.model.vast.b r10 = r10.O
            if (r10 == 0) goto L1c
            java.lang.String r10 = r10.f21162b
            goto L1d
        L1c:
            r10 = r1
        L1d:
            com.fyber.inneractive.sdk.renderers.p r0 = r9.f23684a
            com.fyber.inneractive.sdk.ui.controller.b r2 = r0.f23662k
            com.fyber.inneractive.sdk.player.controller.b r2 = (com.fyber.inneractive.sdk.player.controller.b) r2
            if (r2 != 0) goto L2b
            com.fyber.inneractive.sdk.renderers.d0 r0 = r0.f23690q
            if (r0 == 0) goto L2b
            com.fyber.inneractive.sdk.player.controller.z r2 = r0.f23659a
        L2b:
            if (r2 == 0) goto L34
            com.fyber.inneractive.sdk.player.controller.z r2 = (com.fyber.inneractive.sdk.player.controller.z) r2
            com.fyber.inneractive.sdk.flow.endcard.k r0 = r2.j()
            goto L35
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto L3d
            com.fyber.inneractive.sdk.flow.endcard.m r0 = r0.f20665b
            com.fyber.inneractive.sdk.flow.endcard.b r1 = r0.a()
        L3d:
            boolean r0 = r1 instanceof com.fyber.inneractive.sdk.flow.endcard.c
            if (r0 == 0) goto L4f
            com.fyber.inneractive.sdk.flow.endcard.c r1 = (com.fyber.inneractive.sdk.flow.endcard.c) r1
            com.fyber.inneractive.sdk.model.vast.c r0 = r1.f20652g
            java.lang.String r0 = r0.f21183g
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4f
            r4 = r0
            goto L50
        L4f:
            r4 = r10
        L50:
            com.fyber.inneractive.sdk.renderers.p r2 = r9.f23684a
            android.view.ViewGroup r10 = r2.f23689p
            android.content.Context r3 = r2.c(r10)
            if (r12 == 0) goto L5e
            com.fyber.inneractive.sdk.util.g r10 = com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD
        L5c:
            r6 = r10
            goto L61
        L5e:
            com.fyber.inneractive.sdk.util.g r10 = com.fyber.inneractive.sdk.util.g.VAST_ENDCARD
            goto L5c
        L61:
            r7 = 0
            r8 = 0
            r5 = r11
            com.fyber.inneractive.sdk.util.d0 r10 = r2.a(r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.o.a(java.lang.String, com.fyber.inneractive.sdk.util.g1, boolean):com.fyber.inneractive.sdk.util.d0");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        p pVar = this.f23684a;
        if (pVar.f20623c != null) {
            pVar.a(pVar.c(view), false, Float.NaN, Float.NaN);
        }
    }
}
