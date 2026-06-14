package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", l = {71}, m = "invokeSuspend")
final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            HttpClient httpClient = this.this$0.httpClient;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            obj = HttpClient.DefaultImpls.execute$default(httpClient, httpRequest, false, this, 2, null);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return ((HttpResponse) obj).getBody().toString();
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
