package org.bidon.sdk.config.impl;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.BidonInitializerImpl", f = "BidonInitializerImpl.kt", l = {130, 144, 151}, m = "init-BWLJW6A")
final class BidonInitializerImpl$init$1 extends kotlin.coroutines.jvm.internal.d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BidonInitializerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BidonInitializerImpl$init$1(BidonInitializerImpl bidonInitializerImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = bidonInitializerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8673initBWLJW6A = this.this$0.m8673initBWLJW6A(null, null, 0L, this);
        return objM8673initBWLJW6A == pf.b.g() ? objM8673initBWLJW6A : Result.a(objM8673initBWLJW6A);
    }
}
