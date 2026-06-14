package com.unity3d.ads.core.domain.events;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/events/EventObservers;", "", "operativeEventObserver", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "diagnosticEventObserver", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "transactionEventObserver", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "(Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;)V", "getDiagnosticEventObserver", "()Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "getOperativeEventObserver", "()Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "getTransactionEventObserver", "()Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventObservers {

    @NotNull
    private final DiagnosticEventObserver diagnosticEventObserver;

    @NotNull
    private final OperativeEventObserver operativeEventObserver;

    @NotNull
    private final TransactionEventObserver transactionEventObserver;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.EventObservers$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {16, 17}, m = "invoke")
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
            return EventObservers.this.invoke(this);
        }
    }

    public EventObservers(@NotNull OperativeEventObserver operativeEventObserver, @NotNull DiagnosticEventObserver diagnosticEventObserver, @NotNull TransactionEventObserver transactionEventObserver) {
        Intrinsics.checkNotNullParameter(operativeEventObserver, "operativeEventObserver");
        Intrinsics.checkNotNullParameter(diagnosticEventObserver, "diagnosticEventObserver");
        Intrinsics.checkNotNullParameter(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    @NotNull
    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    @NotNull
    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    @NotNull
    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = (com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r0 = (com.unity3d.ads.core.domain.events.EventObservers) r0
            kotlin.d.b(r6)
            goto L5f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            kotlin.d.b(r6)
            goto L51
        L40:
            kotlin.d.b(r6)
            com.unity3d.ads.core.domain.events.OperativeEventObserver r6 = r5.operativeEventObserver
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L50
            goto L5d
        L50:
            r2 = r5
        L51:
            com.unity3d.ads.core.domain.events.DiagnosticEventObserver r6 = r2.diagnosticEventObserver
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            r0 = r2
        L5f:
            com.unity3d.ads.core.domain.events.TransactionEventObserver r6 = r0.transactionEventObserver
            r6.invoke()
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.EventObservers.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
