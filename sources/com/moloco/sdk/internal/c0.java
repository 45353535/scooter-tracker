package com.moloco.sdk.internal;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f54143a = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c0.b();
        }
    });

    public static final Unit a(kotlinx.serialization.json.e Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.g(true);
        Json.f(true);
        return Unit.f93236a;
    }

    public static final kotlinx.serialization.json.b b() {
        return kotlinx.serialization.json.v.b(null, new Function1() { // from class: com.moloco.sdk.internal.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c0.a((kotlinx.serialization.json.e) obj);
            }
        }, 1, null);
    }

    public static final kotlinx.serialization.json.b c() {
        return d();
    }

    public static final kotlinx.serialization.json.b d() {
        return (kotlinx.serialization.json.b) f54143a.getValue();
    }
}
