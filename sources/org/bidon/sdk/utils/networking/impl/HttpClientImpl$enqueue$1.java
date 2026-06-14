package org.bidon.sdk.utils.networking.impl;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.utils.networking.impl.HttpClientImpl", f = "HttpClientImpl.kt", l = {72, 73}, m = "enqueue-BWLJW6A")
final class HttpClientImpl$enqueue$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientImpl$enqueue$1(HttpClientImpl httpClientImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = httpClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8679enqueueBWLJW6A = this.this$0.mo8679enqueueBWLJW6A(null, null, null, this);
        return objMo8679enqueueBWLJW6A == b.g() ? objMo8679enqueueBWLJW6A : Result.a(objMo8679enqueueBWLJW6A);
    }
}
