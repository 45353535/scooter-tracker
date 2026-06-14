package com.appodeal.ads.modules.common.internal.service.impl;

import com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter;
import eg.i;
import eg.o0;
import hg.l0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInitializationAwaiter;", "<init>", "()V", "", "releaseAwaiter", "", "timeout", "launchAwaitingAsync", "(J)V", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AwaitingState", "OutcomeState", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ServiceInitializationAwaiterImpl implements ServiceInitializationAwaiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Deferred f13765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f13766b = l0.a(AwaitingState.NotLaunched);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl$AwaitingState;", "", "NotLaunched", "InProgress", "Completed", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AwaitingState {
        public static final AwaitingState Completed;
        public static final AwaitingState InProgress;
        public static final AwaitingState NotLaunched;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ AwaitingState[] f13767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13768b;

        static {
            AwaitingState awaitingState = new AwaitingState("NotLaunched", 0);
            NotLaunched = awaitingState;
            AwaitingState awaitingState2 = new AwaitingState("InProgress", 1);
            InProgress = awaitingState2;
            AwaitingState awaitingState3 = new AwaitingState("Completed", 2);
            Completed = awaitingState3;
            AwaitingState[] awaitingStateArr = {awaitingState, awaitingState2, awaitingState3};
            f13767a = awaitingStateArr;
            f13768b = qf.a.a(awaitingStateArr);
        }

        public AwaitingState(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return f13768b;
        }

        public static AwaitingState valueOf(String str) {
            return (AwaitingState) Enum.valueOf(AwaitingState.class, str);
        }

        public static AwaitingState[] values() {
            return (AwaitingState[]) f13767a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl$OutcomeState;", "", "Completed", "TimedOut", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutcomeState {
        public static final OutcomeState Completed;
        public static final OutcomeState TimedOut;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ OutcomeState[] f13769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13770b;

        static {
            OutcomeState outcomeState = new OutcomeState("Completed", 0);
            Completed = outcomeState;
            OutcomeState outcomeState2 = new OutcomeState("TimedOut", 1);
            TimedOut = outcomeState2;
            OutcomeState[] outcomeStateArr = {outcomeState, outcomeState2};
            f13769a = outcomeStateArr;
            f13770b = qf.a.a(outcomeStateArr);
        }

        public OutcomeState(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return f13770b;
        }

        public static OutcomeState valueOf(String str) {
            return (OutcomeState) Enum.valueOf(OutcomeState.class, str);
        }

        public static OutcomeState[] values() {
            return (OutcomeState[]) f13769a.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OutcomeState.values().length];
            try {
                iArr[OutcomeState.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OutcomeState.TimedOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object await(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.modules.common.internal.service.impl.a
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.modules.common.internal.service.impl.a r0 = (com.appodeal.ads.modules.common.internal.service.impl.a) r0
            int r1 = r0.f13774d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13774d = r1
            goto L18
        L13:
            com.appodeal.ads.modules.common.internal.service.impl.a r0 = new com.appodeal.ads.modules.common.internal.service.impl.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13772b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13774d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl r0 = r0.f13771a
            kotlin.d.b(r6)
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.d.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow r6 = r5.f13766b
            java.lang.Object r6 = r6.getValue()
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$AwaitingState r2 = com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.AwaitingState.NotLaunched
            if (r6 != r2) goto L44
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L44:
            kotlinx.coroutines.Deferred r6 = r5.f13765a
            if (r6 == 0) goto L77
            r0.f13771a = r5
            r0.f13774d = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r5
        L54:
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$OutcomeState r6 = (com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.OutcomeState) r6
            if (r6 == 0) goto L78
            int[] r1 = com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r1[r6]
            if (r6 == r4) goto L6e
            r1 = 2
            if (r6 != r1) goto L68
            java.lang.String r6 = "Timed out"
            goto L70
        L68:
            lf.m r6 = new lf.m
            r6.<init>()
            throw r6
        L6e:
            java.lang.String r6 = "Finished successfully"
        L70:
            java.lang.String r1 = "ServiceInitializationAwaiter"
            r2 = 4
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r1, r6, r3, r2, r3)
            goto L78
        L77:
            r0 = r5
        L78:
            r0.f13765a = r3
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.await(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter
    public void launchAwaitingAsync(long timeout) {
        i.d(kotlinx.coroutines.i.a(o0.a()), null, null, new e(this, timeout, null), 3, null);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter
    public void releaseAwaiter() {
        this.f13766b.setValue(AwaitingState.Completed);
    }
}
