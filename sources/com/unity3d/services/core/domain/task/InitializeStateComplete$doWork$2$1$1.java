package com.unity3d.services.core.domain.task;

import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
final class InitializeStateComplete$doWork$2$1$1 extends k implements Function2<ByteStringStoreOuterClass.ByteStringStore, Continuation, Object> {
    /* synthetic */ Object L$0;
    int label;

    InitializeStateComplete$doWork$2$1$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(continuation);
        initializeStateComplete$doWork$2$1$1.L$0 = obj;
        return initializeStateComplete$doWork$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @Nullable Continuation continuation) {
        return ((InitializeStateComplete$doWork$2$1$1) create(byteStringStore, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().clear().build();
        Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "it.toBuilder().clear().build()");
        return byteStringStoreBuild;
    }
}
