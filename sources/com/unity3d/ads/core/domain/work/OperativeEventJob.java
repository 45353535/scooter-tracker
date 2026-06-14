package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/work/OperativeEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "getOperativeRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetOperativeRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getOperativeRequestPolicy$delegate", "Lkotlin/Lazy;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {

    /* JADX INFO: renamed from: getOperativeRequestPolicy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getOperativeRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.work.OperativeEventJob", f = "OperativeEventJob.kt", l = {20}, m = "doWork")
    static final class AnonymousClass1 extends d {
        Object L$0;
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
            return OperativeEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        l lVar = l.f94211d;
        final String str = ServiceProvider.NAMED_OPERATIVE_REQ;
        this.getOperativeRequestPolicy = i.b(lVar, new Function0<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(GetRequestPolicy.class));
            }
        });
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.domain.work.OperativeEventJob.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.OperativeEventJob.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.work.OperativeEventJob r0 = (com.unity3d.ads.core.domain.work.OperativeEventJob) r0
            kotlin.d.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.d.b(r5)
            com.unity3d.ads.core.domain.GetRequestPolicy r5 = r4.getGetOperativeRequestPolicy()     // Catch: java.lang.Throwable -> L54
            com.unity3d.ads.gatewayclient.RequestPolicy r5 = r5.invoke()     // Catch: java.lang.Throwable -> L54
            r4.setRequestPolicy(r5)     // Catch: java.lang.Throwable -> L54
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L54
            r0.label = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r5 = super.doWork(r0)     // Catch: java.lang.Throwable -> L54
            if (r5 != r1) goto L50
            return r1
        L50:
            r0 = r4
        L51:
            androidx.work.ListenableWorker$Result r5 = (androidx.work.ListenableWorker.Result) r5     // Catch: java.lang.Throwable -> L2d
            return r5
        L54:
            r5 = move-exception
            r0 = r4
        L56:
            com.unity3d.ads.core.log.Logger r0 = r0.getLogger()
            java.lang.String r1 = "OperativeEventJob failed to process work"
            r0.trace(r1, r5)
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.failure()
            java.lang.String r0 = "failure()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.OperativeEventJob.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
