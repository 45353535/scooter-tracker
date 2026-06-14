package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmImpressionOccurred;", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "signalLoaded", "", "(Lcom/unity3d/ads/core/data/model/AdObject;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidOmImpressionOccurred implements OmImpressionOccurred {

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred", f = "AndroidOmImpressionOccurred.kt", l = {15}, m = "invoke")
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
            return AndroidOmImpressionOccurred.this.invoke(null, false, this);
        }
    }

    public AndroidOmImpressionOccurred(@NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.AdObject r12, boolean r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r12 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r12 = (com.unity3d.ads.core.data.model.AdObject) r12
            java.lang.Object r13 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred r13 = (com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred) r13
            kotlin.d.b(r14)
        L30:
            r7 = r12
            goto L52
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            kotlin.d.b(r14)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r14 = r11.openMeasurementRepository
            com.google.protobuf.ByteString r2 = r12.getOpportunityId()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r14 = r14.impressionOccurred(r2, r13, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            r13 = r11
            goto L30
        L52:
            com.unity3d.ads.core.data.model.OMResult r14 = (com.unity3d.ads.core.data.model.OMResult) r14
            boolean r12 = r14 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r12 == 0) goto L67
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r13.sendDiagnosticEvent
            r9 = 46
            r10 = 0
            java.lang.String r3 = "om_impression_occurred_success"
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L9c
        L67:
            boolean r12 = r14 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r12 == 0) goto L9c
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r13.sendDiagnosticEvent
            java.util.Map r12 = kotlin.collections.MapsKt.createMapBuilder()
            com.unity3d.ads.core.data.model.OMResult$Failure r14 = (com.unity3d.ads.core.data.model.OMResult.Failure) r14
            java.lang.String r13 = r14.getReason()
            java.lang.String r0 = "reason"
            r12.put(r0, r13)
            java.lang.String r13 = r14.getReasonDebug()
            if (r13 == 0) goto L8b
            java.lang.String r13 = "reason_debug"
            java.lang.String r14 = r14.getReasonDebug()
            r12.put(r13, r14)
        L8b:
            kotlin.Unit r13 = kotlin.Unit.f93236a
            java.util.Map r5 = kotlin.collections.MapsKt.build(r12)
            r9 = 42
            r10 = 0
            java.lang.String r3 = "om_impression_occurred_failure"
            r4 = 0
            r6 = 0
            r8 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L9c:
            kotlin.Unit r12 = kotlin.Unit.f93236a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.invoke(com.unity3d.ads.core.data.model.AdObject, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
