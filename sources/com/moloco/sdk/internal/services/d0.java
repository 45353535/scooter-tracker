package com.moloco.sdk.internal.services;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f55528c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f55529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f55530b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55531r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55532s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f55533t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55535v;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55533t = obj;
            this.f55535v |= Integer.MIN_VALUE;
            return d0.this.a(null, null, null, null, this);
        }
    }

    public d0(t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        this.f55529a = externalLinkHandler;
        this.f55530b = customUserEventBuilderService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        if (r1.emit(r3, r8) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.moloco.sdk.internal.services.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r18, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a r19, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r r20, kotlinx.coroutines.flow.MutableSharedFlow r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.d0.a(java.lang.String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r, kotlinx.coroutines.flow.MutableSharedFlow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.c0
    public Object b(String str, MutableSharedFlow mutableSharedFlow, Continuation continuation) {
        t0 t0Var = this.f55529a;
        if (str == null) {
            str = "";
        }
        if (!t0Var.a(str) || mutableSharedFlow == null) {
            return Unit.f93236a;
        }
        Unit unit = Unit.f93236a;
        Object objEmit = mutableSharedFlow.emit(unit, continuation);
        return objEmit == pf.b.g() ? objEmit : unit;
    }
}
