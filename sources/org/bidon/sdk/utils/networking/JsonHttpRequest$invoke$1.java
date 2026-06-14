package org.bidon.sdk.utils.networking;

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
@e(c = "org.bidon.sdk.utils.networking.JsonHttpRequest", f = "JsonHttpRequest.kt", l = {30, 64}, m = "invoke-yxL6bBk")
final class JsonHttpRequest$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonHttpRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonHttpRequest$invoke$1(JsonHttpRequest jsonHttpRequest, Continuation continuation) {
        super(continuation);
        this.this$0 = jsonHttpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8681invokeyxL6bBk = this.this$0.m8681invokeyxL6bBk(null, null, null, null, this);
        return objM8681invokeyxL6bBk == b.g() ? objM8681invokeyxL6bBk : Result.a(objM8681invokeyxL6bBk);
    }
}
