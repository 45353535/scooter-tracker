package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 101, 109}, m = "invokeSuspend")
final class InitializeStateConfigWithLoader$doWork$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, continuation);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ea A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
