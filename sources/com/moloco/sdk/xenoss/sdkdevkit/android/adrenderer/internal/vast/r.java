package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f57669a = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) obj2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator f57670b = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj2);
        }
    };

    public static final int a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar2) {
        return f57669a.compare(nVar.f(), nVar2.f());
    }

    public static final int b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var2) {
        Intrinsics.checkNotNull(a0Var2);
        int iQ = q(a0Var2);
        Intrinsics.checkNotNull(a0Var);
        return Intrinsics.compare(iQ, q(a0Var));
    }

    public static final Double c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, double d10, Long l10) {
        Double d11 = d(sVar, l10);
        if (d11 != null) {
            return Double.valueOf(d11.doubleValue() - d10);
        }
        return null;
    }

    public static final Double d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, Long l10) {
        if (l10 == null) {
            return null;
        }
        Double dValueOf = sVar.b() != null ? Double.valueOf(sVar.b().intValue()) : (sVar.d() == null || sVar.f() == null) ? null : Double.valueOf(((double) (sVar.d().intValue() - sVar.f().intValue())) / 2.0d);
        if (dValueOf != null) {
            return Double.valueOf((dValueOf.doubleValue() / ((double) 8192)) * (l10.longValue() / 1000.0d));
        }
        return null;
    }

    public static final Double e(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((((double) num.intValue()) * ((double) num2.intValue())) - (((double) num3.intValue()) * ((double) num4.intValue())));
    }

    public static final Comparator f() {
        return f57670b;
    }

    public static final Comparator g(double d10, Long l10, Integer num, Integer num2) {
        return new c(d10, l10, num, num2);
    }

    public static final Comparator h(Integer num, Integer num2) {
        return new b(num, num2);
    }

    public static final Pair i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2) {
        Object obj;
        Object next;
        Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(r.p((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) obj2));
            }
        };
        Iterator it = gVar.e().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                break;
            }
        }
        boolean z10 = next != null;
        Iterator it2 = gVar2.e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((Boolean) function1.invoke(next2)).booleanValue()) {
                obj = next2;
                break;
            }
        }
        return TuplesKt.to(Boolean.valueOf(z10), Boolean.valueOf(obj != null));
    }

    public static final Pair k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, double d10, Long l10) {
        return n(c(sVar, d10, l10), c(sVar2, d10, l10));
    }

    public static final Pair m(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, Integer num, Integer num2) {
        return n(e(sVar.h(), sVar.c(), num, num2), e(sVar2.h(), sVar2.c(), num, num2));
    }

    public static final Pair n(Double d10, Double d11) {
        if (d10 == null || d11 == null) {
            return TuplesKt.to(Boolean.valueOf(d10 != null), Boolean.valueOf(d11 != null));
        }
        if (Intrinsics.areEqual(d10, d11)) {
            Boolean bool = Boolean.TRUE;
            return TuplesKt.to(bool, bool);
        }
        if (Math.abs(d10.doubleValue()) == Math.abs(d11.doubleValue())) {
            return TuplesKt.to(Boolean.valueOf(d10.doubleValue() < 0.0d), Boolean.valueOf(d11.doubleValue() < 0.0d));
        }
        return Double.compare(Math.abs(d10.doubleValue()), Math.abs(d11.doubleValue())) < 0 ? TuplesKt.to(Boolean.TRUE, Boolean.FALSE) : TuplesKt.to(Boolean.FALSE, Boolean.TRUE);
    }

    public static final Unit o(t0 t0Var, t0 t0Var2, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.component2()).booleanValue();
        if (zBooleanValue) {
            t0Var.f93331b++;
        }
        if (zBooleanValue2) {
            t0Var2.f93331b++;
        }
        return Unit.f93236a;
    }

    public static final boolean p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof a0.c;
    }

    public static final int q(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var) {
        if (a0Var instanceof a0.a) {
            return 4;
        }
        if (a0Var instanceof a0.c) {
            return ((a0.c) a0Var).a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f57579c ? 3 : 2;
        }
        if (a0Var instanceof a0.b) {
            return 1;
        }
        throw new lf.m();
    }

    public static final Double r(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((((double) num.intValue()) / ((double) num2.intValue())) - (((double) num3.intValue()) / ((double) num4.intValue())));
    }

    public static final Comparator s() {
        return f57669a;
    }

    public static final Pair t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        return n(e(gVar.f(), gVar.d(), num, num2), e(gVar2.f(), gVar2.d(), num, num2));
    }

    public static final Pair u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, double d10, Long l10, Integer num, Integer num2) {
        final t0 t0Var = new t0();
        final t0 t0Var2 = new t0();
        Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.w(t0Var, t0Var2, (Pair) obj);
            }
        };
        function1.invoke(m(sVar, sVar2, num, num2));
        function1.invoke(v(sVar, sVar2, num, num2));
        function1.invoke(k(sVar, sVar2, d10, l10));
        return TuplesKt.to(Integer.valueOf(t0Var.f93331b), Integer.valueOf(t0Var2.f93331b));
    }

    public static final Pair v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2, Integer num, Integer num2) {
        return n(r(sVar.h(), sVar.c(), num, num2), r(sVar2.h(), sVar2.c(), num, num2));
    }

    public static final Unit w(t0 t0Var, t0 t0Var2, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.component2()).booleanValue();
        if (zBooleanValue) {
            t0Var.f93331b++;
        }
        if (zBooleanValue2) {
            t0Var2.f93331b++;
        }
        return Unit.f93236a;
    }

    public static final Pair x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        return n(r(gVar.f(), gVar.d(), num, num2), r(gVar2.f(), gVar2.d(), num, num2));
    }

    public static final Pair y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        final t0 t0Var = new t0();
        final t0 t0Var2 = new t0();
        Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.o(t0Var, t0Var2, (Pair) obj);
            }
        };
        function1.invoke(t(gVar, gVar2, num, num2));
        function1.invoke(x(gVar, gVar2, num, num2));
        function1.invoke(i(gVar, gVar2));
        return TuplesKt.to(Integer.valueOf(t0Var.f93331b), Integer.valueOf(t0Var2.f93331b));
    }
}
