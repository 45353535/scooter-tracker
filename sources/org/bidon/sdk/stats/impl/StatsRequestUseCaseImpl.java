package org.bidon.sdk.stats.impl;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.DataBinderType;
import org.bidon.sdk.stats.usecases.StatsRequestUseCase;
import org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/stats/impl/StatsRequestUseCaseImpl;", "Lorg/bidon/sdk/stats/usecases/StatsRequestUseCase;", "createRequestBody", "Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;", "<init>", "(Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;)V", "binders", "", "Lorg/bidon/sdk/databinders/DataBinderType;", "invoke", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "statsRequestBody", "Lorg/bidon/sdk/stats/models/StatsRequestBody;", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "invoke-0E7RQCE", "(Lorg/bidon/sdk/stats/models/StatsRequestBody;Lorg/bidon/sdk/adapter/DemandAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatsRequestUseCaseImpl implements StatsRequestUseCase {

    @NotNull
    private final List<DataBinderType> binders;

    @NotNull
    private final CreateRequestBodyUseCase createRequestBody;

    public StatsRequestUseCaseImpl(@NotNull CreateRequestBodyUseCase createRequestBody) {
        Intrinsics.checkNotNullParameter(createRequestBody, "createRequestBody");
        this.createRequestBody = createRequestBody;
        this.binders = CollectionsKt.listOf((Object[]) new DataBinderType[]{DataBinderType.Device, DataBinderType.App, DataBinderType.Token, DataBinderType.Session, DataBinderType.User, DataBinderType.Segment, DataBinderType.Reg, DataBinderType.Test});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // org.bidon.sdk.stats.usecases.StatsRequestUseCase
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo8678invoke0E7RQCE(@org.jetbrains.annotations.Nullable org.bidon.sdk.stats.models.StatsRequestBody r6, @org.jetbrains.annotations.NotNull org.bidon.sdk.adapter.DemandAd r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl$invoke$1 r0 = (org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl$invoke$1 r0 = new org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl$invoke$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.d.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L29
            org.bidon.sdk.utils.SdkDispatchers r8 = org.bidon.sdk.utils.SdkDispatchers.INSTANCE     // Catch: java.lang.Throwable -> L29
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.getIO()     // Catch: java.lang.Throwable -> L29
            org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl$invoke$2$1 r2 = new org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl$invoke$2$1     // Catch: java.lang.Throwable -> L29
            r4 = 0
            r2.<init>(r5, r6, r7, r4)     // Catch: java.lang.Throwable -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = eg.g.g(r8, r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r8 != r1) goto L4d
            return r1
        L4d:
            kotlin.Result r8 = (kotlin.Result) r8     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r8.l()     // Catch: java.lang.Throwable -> L29
            return r6
        L54:
            kotlin.Result$Companion r7 = kotlin.Result.f93230c
            java.lang.Object r6 = kotlin.d.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl.mo8678invoke0E7RQCE(org.bidon.sdk.stats.models.StatsRequestBody, org.bidon.sdk.adapter.DemandAd, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
