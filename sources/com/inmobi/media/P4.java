package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public abstract class P4 {
    public static final CoroutineScope a(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        return kotlinx.coroutines.i.a(coroutineScope.getCoroutineContext().plus(kotlinx.coroutines.z.a((Job) coroutineScope.getCoroutineContext().get(Job.N8))));
    }

    public static final CoroutineScope a(CoroutineScope coroutineScope, eg.c0 c0Var) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.N8);
        eg.s sVarA = job != null ? eg.m1.a(job) : eg.m1.b(null, 1, null);
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(sVarA.plus(eg.o0.c().w()).plus(c0Var));
        return coroutineScopeA == null ? kotlinx.coroutines.i.a(sVarA.plus(eg.o0.c().w())) : coroutineScopeA;
    }

    public static final Job a(CoroutineScope coroutineScope, Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return eg.i.d(coroutineScope, eg.o0.c(), null, block, 2, null);
    }

    public static final void a(MutableSharedFlow mutableSharedFlow, CoroutineScope scope, AbstractC3603bc abstractC3603bc) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        eg.i.d(scope, null, null, new O4(mutableSharedFlow, abstractC3603bc, null), 3, null);
    }

    public static final void a(kotlinx.coroutines.e eVar, Object obj) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar.isActive()) {
            try {
                eVar.resumeWith(Result.b(obj));
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Job.a.a((Job) it.next(), null, 1, null);
        }
        list.clear();
    }
}
