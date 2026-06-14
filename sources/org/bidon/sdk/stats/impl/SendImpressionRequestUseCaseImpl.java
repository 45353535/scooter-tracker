package org.bidon.sdk.stats.impl;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.DataBinderType;
import org.bidon.sdk.stats.usecases.SendImpressionRequestUseCase;
import org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/stats/impl/SendImpressionRequestUseCaseImpl;", "Lorg/bidon/sdk/stats/usecases/SendImpressionRequestUseCase;", "createRequestBody", "Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;", "<init>", "(Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;)V", "binders", "", "Lorg/bidon/sdk/databinders/DataBinderType;", "invoke", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "urlPath", "", "bodyKey", "body", "Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "invoke-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Lorg/bidon/sdk/stats/models/ImpressionRequestBody;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendImpressionRequestUseCaseImpl implements SendImpressionRequestUseCase {

    @NotNull
    private final List<DataBinderType> binders;

    @NotNull
    private final CreateRequestBodyUseCase createRequestBody;

    public SendImpressionRequestUseCaseImpl(@NotNull CreateRequestBodyUseCase createRequestBody) {
        Intrinsics.checkNotNullParameter(createRequestBody, "createRequestBody");
        this.createRequestBody = createRequestBody;
        this.binders = CollectionsKt.listOf((Object[]) new DataBinderType[]{DataBinderType.Device, DataBinderType.Session, DataBinderType.App, DataBinderType.User, DataBinderType.Token, DataBinderType.Segment, DataBinderType.Reg, DataBinderType.Test});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // org.bidon.sdk.stats.usecases.SendImpressionRequestUseCase
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo8676invokeyxL6bBk(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull org.bidon.sdk.stats.models.ImpressionRequestBody r14, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$1
            if (r1 == 0) goto L15
            r1 = r0
            org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$1 r1 = (org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$1 r1 = new org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$1
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r9 = pf.b.g()
            int r2 = r1.label
            r10 = 1
            if (r2 == 0) goto L33
            if (r2 != r10) goto L2b
            kotlin.d.b(r0)
            goto L50
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            kotlin.d.b(r0)
            org.bidon.sdk.utils.SdkDispatchers r0 = org.bidon.sdk.utils.SdkDispatchers.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.getIO()
            org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$2 r2 = new org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$2
            r8 = 0
            r3 = r11
            r7 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.label = r10
            java.lang.Object r0 = eg.g.g(r0, r2, r1)
            if (r0 != r9) goto L50
            return r9
        L50:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl.mo8676invokeyxL6bBk(java.lang.String, java.lang.String, org.bidon.sdk.stats.models.ImpressionRequestBody, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
