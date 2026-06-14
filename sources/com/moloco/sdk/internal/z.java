package com.moloco.sdk.internal;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f55779a = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return z.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f55780b = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return z.d();
        }
    });

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u(new Function0() { // from class: com.moloco.sdk.internal.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.c();
            }
        }, null, null, 6, null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u b(boolean z10) {
        if (z10) {
            return null;
        }
        return h();
    }

    public static final Unit c() {
        return Unit.f93236a;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u d() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u(new Function0() { // from class: com.moloco.sdk.internal.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.e();
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.f();
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.g();
            }
        });
    }

    public static final Unit e() {
        return Unit.f93236a;
    }

    public static final Unit f() {
        return Unit.f93236a;
    }

    public static final Unit g() {
        return Unit.f93236a;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u h() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u) f55779a.getValue();
    }
}
