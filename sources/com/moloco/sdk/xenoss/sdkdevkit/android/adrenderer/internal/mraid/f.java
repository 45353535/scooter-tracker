package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Function9 f56413d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Function0 f56415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static g f56416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f56417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Function0 f56418i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b f56420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a f56421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static com.moloco.sdk.acm.recorder.a f56422m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f56410a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f56411b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f56412c = new WeakReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Function2 f56414e = a.f56424b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Function0 f56419j = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.y();
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f56423n = 8;

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f56424b = new a();

        public final Function10 a(Composer composer, int i10) {
            composer.startReplaceableGroup(-631904177);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-631904177, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivityDataHolder.closeButton.<anonymous> (MraidActivity.kt:315)");
            }
            Function10 function10B = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function10B;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final Unit y() {
        return Unit.f93236a;
    }

    public final g a() {
        return f56416g;
    }

    public final void b(Activity activity) {
        f56412c = new WeakReference(activity);
    }

    public final void c(com.moloco.sdk.acm.recorder.a aVar) {
        f56422m = aVar;
    }

    public final void d(g gVar) {
        f56416g = gVar;
    }

    public final void e(q qVar) {
        f56411b = new WeakReference(qVar);
    }

    public final void f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar) {
        f56421l = aVar;
    }

    public final void g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar) {
        f56420k = bVar;
    }

    public final void h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var) {
        f56417h = g0Var;
    }

    public final void i(Function0 function0) {
        f56415f = function0;
    }

    public final void j(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        f56414e = function2;
    }

    public final void k(Function9 function9) {
        f56413d = function9;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a l() {
        return f56421l;
    }

    public final void m(Function0 function0) {
        f56418i = function0;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b n() {
        return f56420k;
    }

    public final void o(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        f56419j = function0;
    }

    public final Function2 p() {
        return f56414e;
    }

    public final com.moloco.sdk.acm.recorder.a q() {
        return f56422m;
    }

    public final Function9 r() {
        return f56413d;
    }

    public final Function0 s() {
        return f56415f;
    }

    public final Function0 t() {
        return f56418i;
    }

    public final Function0 u() {
        return f56419j;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 v() {
        return f56417h;
    }

    public final Activity w() {
        return (Activity) f56412c.get();
    }

    public final q x() {
        return (q) f56411b.get();
    }
}
