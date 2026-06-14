package com.inmobi.media;

import com.inmobi.media.AbstractC3642d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3642d {
    public static void a(final Function0 execute) {
        Intrinsics.checkNotNullParameter(execute, "execute");
        Lazy lazy = E0.f36762a;
        Function0 execute2 = new Function0() { // from class: w3.t6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3642d.b(execute);
            }
        };
        Intrinsics.checkNotNullParameter(execute2, "execute");
        CoroutineScope coroutineScopeA = E0.f36767f;
        if (coroutineScopeA == null) {
            Intrinsics.checkNotNullParameter("AdQualityComponent-aqBeacon", "name");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("AdQualityComponent-aqBeacon", false));
            Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            coroutineScopeA = kotlinx.coroutines.i.a(eg.w0.c(executorServiceNewSingleThreadExecutor).plus(eg.m1.b(null, 1, null)));
            E0.f36767f = coroutineScopeA;
        }
        eg.i.d(coroutineScopeA, null, null, new C0(execute2, null), 3, null);
    }

    public static final Unit b(Function0 function0) {
        function0.invoke();
        return Unit.f93236a;
    }
}
