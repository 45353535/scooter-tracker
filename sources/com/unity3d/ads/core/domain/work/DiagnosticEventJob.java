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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "diagnosticEventRequestWorkModifier", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "getDiagnosticEventRequestWorkModifier", "()Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "diagnosticEventRequestWorkModifier$delegate", "Lkotlin/Lazy;", "getDiagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetDiagnosticRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getDiagnosticRequestPolicy$delegate", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {

    /* JADX INFO: renamed from: diagnosticEventRequestWorkModifier$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy diagnosticEventRequestWorkModifier;

    /* JADX INFO: renamed from: getDiagnosticRequestPolicy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getDiagnosticRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", f = "DiagnosticEventJob.kt", l = {23, 26, 28}, m = "doWork")
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
            return DiagnosticEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        l lVar = l.f94211d;
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy = i.b(lVar, new Function0<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
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
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier = i.b(lVar, new Function0<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DiagnosticEventRequestWorkModifier invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, v0.b(DiagnosticEventRequestWorkModifier.class));
            }
        });
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
