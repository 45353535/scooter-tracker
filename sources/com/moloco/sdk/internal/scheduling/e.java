package com.moloco.sdk.internal.scheduling;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CoroutineScope f55265a = i.a(c.a().a());

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55266r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function0 f55267s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f55267s = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f55267s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55266r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f55267s.invoke();
            return Unit.f93236a;
        }
    }

    public static final Job a(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return eg.i.d(f55265a, null, null, new a(block, null), 3, null);
    }
}
