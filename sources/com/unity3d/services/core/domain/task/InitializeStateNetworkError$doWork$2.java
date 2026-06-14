package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import eg.x1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
final class InitializeStateNetworkError$doWork$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objB;
        InitializeStateNetworkError initializeStateNetworkError;
        Object objG = b.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                d.b(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                Result.Companion companion = Result.f93230c;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object objE = x1.e(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (objE == objG) {
                    return objG;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = objE;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                d.b(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (((Unit) obj) == null) {
            ConnectivityMonitor.removeListener(initializeStateNetworkError);
            throw new Exception("No connected events within the timeout!");
        }
        objB = Result.b(Unit.f93236a);
        if (Result.j(objB)) {
            objB = Result.b(objB);
        } else {
            Throwable thG = Result.g(objB);
            if (thG != null) {
                objB = Result.b(d.a(thG));
            }
        }
        return Result.a(objB);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateNetworkError$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
