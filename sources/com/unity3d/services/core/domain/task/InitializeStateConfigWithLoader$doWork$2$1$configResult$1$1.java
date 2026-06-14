package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import eg.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", l = {69}, m = "invokeSuspend")
final class InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 extends k implements Function2<Integer, Continuation, Object> {
    final /* synthetic */ Ref$ObjectRef $config;
    final /* synthetic */ Ref$ObjectRef $configurationLoader;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Ref$ObjectRef $config;
        final /* synthetic */ Ref$ObjectRef $configurationLoader;
        int label;
        final /* synthetic */ InitializeStateConfigWithLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, Continuation continuation) {
            super(2, continuation);
            this.$configurationLoader = ref$ObjectRef;
            this.$config = ref$ObjectRef2;
            this.this$0 = initializeStateConfigWithLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, continuation);
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
            iConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1.1
                @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                public void onError(@NotNull String errorMsg) throws AbortRetryException {
                    Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                    SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                    Metric metricNewEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                    Intrinsics.checkNotNullExpressionValue(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                    sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                    throw new AbortRetryException(errorMsg);
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$configurationLoader = ref$ObjectRef;
        this.$config = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(this.this$0, this.$configurationLoader, this.$config, continuation);
        initializeStateConfigWithLoader$doWork$2$1$configResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateConfigWithLoader$doWork$2$1$configResult$1$1;
    }

    @Nullable
    public final Object invoke(int i10, @Nullable Continuation continuation) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            CoroutineDispatcher io2 = this.this$0.dispatchers.getIo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, null);
            this.label = 1;
            if (g.g(io2, anonymousClass1, this) == objG) {
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
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation continuation) {
        return invoke(num.intValue(), continuation);
    }
}
