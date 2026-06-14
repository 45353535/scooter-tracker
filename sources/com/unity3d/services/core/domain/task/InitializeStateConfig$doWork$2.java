package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {32}, m = "invokeSuspend")
final class InitializeStateConfig$doWork$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, Continuation continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objB;
        Configuration configuration;
        Object objMo7466invokegIAlus;
        Object objG = b.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                d.b(obj);
                InitializeStateConfig.Params params = this.$params;
                InitializeStateConfig initializeStateConfig = this.this$0;
                Result.Companion companion = Result.f93230c;
                DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                try {
                    InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo7466invokegIAlus = initializeStateConfigWithLoader.mo7466invokegIAlus((BaseParams) params2, (Continuation) this);
                    if (objMo7466invokegIAlus == objG) {
                        return objG;
                    }
                    configuration = configuration2;
                } catch (NetworkIOException e10) {
                    e = e10;
                    configuration = configuration2;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                configuration = (Configuration) this.L$0;
                try {
                    d.b(obj);
                    objMo7466invokegIAlus = ((Result) obj).l();
                } catch (NetworkIOException e11) {
                    e = e11;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            }
            d.b(objMo7466invokegIAlus);
            objB = Result.b((Configuration) objMo7466invokegIAlus);
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
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
        return ((InitializeStateConfig$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
