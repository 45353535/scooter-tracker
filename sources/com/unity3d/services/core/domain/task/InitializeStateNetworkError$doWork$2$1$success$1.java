package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", l = {82}, m = "invokeSuspend")
final class InitializeStateNetworkError$doWork$2$1$success$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$2$1$success$1(InitializeStateNetworkError initializeStateNetworkError, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateNetworkError$doWork$2$1$success$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            InitializeStateNetworkError initializeStateNetworkError = this.this$0;
            this.L$0 = initializeStateNetworkError;
            this.label = 1;
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(b.d(this), 1);
            eVar.I();
            initializeStateNetworkError.startListening(eVar);
            Object objC = eVar.C();
            if (objC == b.g()) {
                g.c(this);
            }
            if (objC == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateNetworkError$doWork$2$1$success$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
