package org.bidon.sdk.stats.impl;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.DataBinderType;
import org.bidon.sdk.stats.usecases.SendWinLossRequestUseCase;
import org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/stats/impl/SendWinLossRequestUseCaseImpl;", "Lorg/bidon/sdk/stats/usecases/SendWinLossRequestUseCase;", "createRequestBody", "Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;", "<init>", "(Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;)V", "binders", "", "Lorg/bidon/sdk/databinders/DataBinderType;", "invoke", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "data", "Lorg/bidon/sdk/stats/usecases/WinLossRequestData;", "invoke-gIAlu-s", "(Lorg/bidon/sdk/stats/usecases/WinLossRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendWinLossRequestUseCaseImpl implements SendWinLossRequestUseCase {

    @NotNull
    private final List<DataBinderType> binders;

    @NotNull
    private final CreateRequestBodyUseCase createRequestBody;

    public SendWinLossRequestUseCaseImpl(@NotNull CreateRequestBodyUseCase createRequestBody) {
        Intrinsics.checkNotNullParameter(createRequestBody, "createRequestBody");
        this.createRequestBody = createRequestBody;
        this.binders = CollectionsKt.listOf((Object[]) new DataBinderType[]{DataBinderType.Device, DataBinderType.Session, DataBinderType.App, DataBinderType.User, DataBinderType.Token, DataBinderType.Segment, DataBinderType.Reg, DataBinderType.Test});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // org.bidon.sdk.stats.usecases.SendWinLossRequestUseCase
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo8677invokegIAlus(@org.jetbrains.annotations.NotNull org.bidon.sdk.stats.usecases.WinLossRequestData r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$1 r0 = (org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$1 r0 = new org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            org.bidon.sdk.utils.SdkDispatchers r7 = org.bidon.sdk.utils.SdkDispatchers.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.getIO()
            org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$2 r2 = new org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$2
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.label = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl.mo8677invokegIAlus(org.bidon.sdk.stats.usecases.WinLossRequestData, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
