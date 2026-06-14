package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function0 f56517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Function0 f56518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n f56519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r f56520r;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56521r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56522s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f56524u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56522s = obj;
            this.f56524u |= Integer.MIN_VALUE;
            return v.this.r0(this);
        }
    }

    public /* synthetic */ v(Context context, String str, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z10, t0 t0Var, m mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, function0, function02, function03, function1, z10, t0Var, mVar, (i10 & 512) != 0 ? null : nVar, (i10 & 1024) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a() : rVar);
    }

    public static final Unit q0(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        function0.invoke();
        if (nVar != null) {
            nVar.a(url);
        }
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l
    public void J() {
        super.J();
        this.f56517o.invoke();
    }

    public final WebView c() {
        return C().c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void m(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f56520r.m(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void p(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f56520r.p(buttonType);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l
    public void p0() {
        super.p0();
        this.f56518p.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r0(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v.a
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v.a) r0
            int r1 = r0.f56524u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56524u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f56522s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f56524u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f56521r
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v) r0
            kotlin.d.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.d.b(r5)
            r0.f56521r = r4
            r0.f56524u = r3
            java.lang.Object r5 = r4.e0(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            boolean r5 = r5 instanceof com.moloco.sdk.internal.h0.b
            if (r5 == 0) goto L51
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m r5 = r0.C()
            android.webkit.WebView r5 = r5.c()
            return r5
        L51:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v.r0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, String adm, Function0 onNeedToDetachAdViewBeforeExpand, Function0 onExpandAdViewClosed, final Function0 onShowListenerClick, Function1 onError, boolean z10, t0 externalLinkHandler, m mraidBridge, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r buttonTracker) {
        super(context, adm, a0.f56370c, onShowListenerClick, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.q0(onShowListenerClick, nVar, (String) obj);
            }
        }, onError, externalLinkHandler, z10, mraidBridge);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(onNeedToDetachAdViewBeforeExpand, "onNeedToDetachAdViewBeforeExpand");
        Intrinsics.checkNotNullParameter(onExpandAdViewClosed, "onExpandAdViewClosed");
        Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(mraidBridge, "mraidBridge");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.f56517o = onNeedToDetachAdViewBeforeExpand;
        this.f56518p = onExpandAdViewClosed;
        this.f56519q = nVar;
        this.f56520r = buttonTracker;
    }
}
