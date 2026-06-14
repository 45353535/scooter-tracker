package com.inmobi.media;

import com.inmobi.media.AbstractC3667e;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3667e {
    public static final boolean a() {
        return true;
    }

    public static void a(final M0 process, final Eg eg2, Long l10, final Function0 shouldProcess) {
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(shouldProcess, "shouldProcess");
        Lazy lazy = E0.f36762a;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        Function0 execute = new Function0() { // from class: w3.v6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3667e.a(shouldProcess, process, eg2);
            }
        };
        Intrinsics.checkNotNullParameter(execute, "execute");
        CoroutineScope coroutineScopeA = E0.f36766e;
        if (coroutineScopeA == null) {
            coroutineScopeA = kotlinx.coroutines.i.a(eg.o0.a().plus(eg.m1.b(null, 1, null)));
            E0.f36766e = coroutineScopeA;
        }
        eg.i.d(coroutineScopeA, null, null, new D0(jLongValue, execute, null), 3, null);
    }

    public static final Unit a(Function0 function0, M0 m02, Eg eg2) {
        try {
            if (((Boolean) function0.invoke()).booleanValue()) {
                Object objA = m02.a();
                if (eg2 != null) {
                    eg2.a(objA);
                }
            } else if (eg2 != null) {
                eg2.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e10) {
            if (eg2 != null) {
                eg2.onError(e10);
            }
        }
        return Unit.f93236a;
    }
}
