package com.moloco.sdk.publisher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco", f = "Moloco.kt", l = {504, 508}, m = "clearState$moloco_sdk_release")
public final class Moloco$clearState$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Moloco this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$clearState$1(Moloco moloco, Continuation continuation) {
        super(continuation);
        this.this$0 = moloco;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearState$moloco_sdk_release(this);
    }
}
