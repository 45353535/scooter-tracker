package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Landroidx/work/CoroutineWorker;", "Lcom/unity3d/services/core/di/IServiceComponent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "logger", "Lcom/unity3d/ads/core/log/Logger;", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "logger$delegate", "Lkotlin/Lazy;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "getRequestPolicy", "()Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "setRequestPolicy", "(Lcom/unity3d/ads/gatewayclient/RequestPolicy;)V", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "getUniversalRequestDataSource", "()Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource$delegate", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "getWorkerParams", "()Landroidx/work/WorkerParameters;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;
    public RequestPolicy requestPolicy;

    /* JADX INFO: renamed from: universalRequestDataSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy universalRequestDataSource;

    /* JADX INFO: renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy universalRequestEventSender;

    @NotNull
    private final WorkerParameters workerParams;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", f = "UniversalRequestJob.kt", l = {27, 30, 33}, m = "doWork$suspendImpl")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UniversalRequestJob.doWork$suspendImpl(UniversalRequestJob.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.workerParams = workerParams;
        l lVar = l.f94211d;
        final String str = "";
        this.universalRequestEventSender = i.b(lVar, new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(UniversalRequestEventSender.class));
            }
        });
        this.universalRequestDataSource = i.b(lVar, new Function0<UniversalRequestDataSource>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UniversalRequestDataSource invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(UniversalRequestDataSource.class));
            }
        });
        this.logger = i.b(lVar, new Function0<Logger>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Logger invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(Logger.class));
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        if (r9.remove(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob r8, kotlin.coroutines.Continuation r9) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull Continuation continuation) {
        return doWork$suspendImpl(this, continuation);
    }

    @NotNull
    protected final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    @NotNull
    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requestPolicy");
        return null;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    protected final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource.getValue();
    }

    @NotNull
    protected final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }

    @NotNull
    protected final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(@NotNull RequestPolicy requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }
}
