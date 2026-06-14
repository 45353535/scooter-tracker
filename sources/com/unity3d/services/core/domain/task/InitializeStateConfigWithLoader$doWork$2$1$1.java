package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
final class InitializeStateConfigWithLoader$doWork$2$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Ref$ObjectRef $config;
    final /* synthetic */ Ref$ObjectRef $configurationLoader;
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$1$1(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, Continuation continuation) {
        super(2, continuation);
        this.$configurationLoader = ref$ObjectRef;
        this.$config = ref$ObjectRef2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Exception {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        IConfigurationLoader iConfigurationLoader = (IConfigurationLoader) this.$configurationLoader.f93280b;
        final Ref$ObjectRef ref$ObjectRef = this.$config;
        final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
        final InitializeStateConfigWithLoader.Params params = this.$params;
        iConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1.1
            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onError(@NotNull String errorMsg) throws InitializationException {
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                Metric metricNewEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                Intrinsics.checkNotNullExpressionValue(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(errorMsg), params.getConfig());
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onSuccess(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                ref$ObjectRef.f93280b = configuration;
                configuration.saveToDisk();
                initializeStateConfigWithLoader.tokenStorage.setInitToken(((Configuration) ref$ObjectRef.f93280b).getUnifiedAuctionToken());
            }
        });
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
