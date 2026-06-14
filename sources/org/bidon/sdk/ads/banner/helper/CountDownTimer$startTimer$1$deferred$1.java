package org.bidon.sdk.ads.banner.helper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.ads.banner.helper.CountDownTimer$startTimer$1$deferred$1", f = "CountDownTimer.kt", l = {31, 32}, m = "invokeSuspend")
final class CountDownTimer$startTimer$1$deferred$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ long $timeoutMs;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;
    final /* synthetic */ CountDownTimer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountDownTimer$startTimer$1$deferred$1(long j10, CountDownTimer countDownTimer, Continuation continuation) {
        super(2, continuation);
        this.$timeoutMs = j10;
        this.this$0 = countDownTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new CountDownTimer$startTimer$1$deferred$1(this.$timeoutMs, this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (hg.i.y(r12, r9, r11) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r11.label
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 == r5) goto L27
            if (r1 != r4) goto L1f
            int r1 = r11.I$2
            int r6 = r11.I$1
            int r7 = r11.I$0
            java.lang.Object r8 = r11.L$0
            org.bidon.sdk.ads.banner.helper.CountDownTimer r8 = (org.bidon.sdk.ads.banner.helper.CountDownTimer) r8
            kotlin.d.b(r12)
        L1d:
            r12 = r7
            goto L74
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            int r1 = r11.I$2
            int r6 = r11.I$1
            int r7 = r11.I$0
            java.lang.Object r8 = r11.L$0
            org.bidon.sdk.ads.banner.helper.CountDownTimer r8 = (org.bidon.sdk.ads.banner.helper.CountDownTimer) r8
            kotlin.d.b(r12)
            goto L55
        L35:
            kotlin.d.b(r12)
            long r6 = r11.$timeoutMs
            long r6 = r6 / r2
            int r12 = (int) r6
            org.bidon.sdk.ads.banner.helper.CountDownTimer r1 = r11.this$0
            r6 = 0
        L3f:
            if (r6 >= r12) goto L96
            r11.L$0 = r1
            r11.I$0 = r12
            r11.I$1 = r6
            r11.I$2 = r6
            r11.label = r5
            java.lang.Object r7 = eg.k0.a(r2, r11)
            if (r7 != r0) goto L52
            goto L73
        L52:
            r7 = r12
            r8 = r1
            r1 = r6
        L55:
            org.bidon.sdk.ads.banner.helper.impl.ActivityLifecycleObserver r12 = org.bidon.sdk.ads.banner.helper.CountDownTimer.access$getActivityLifecycleObserver$p(r8)
            kotlinx.coroutines.flow.MutableStateFlow r12 = r12.getLifecycleFlow()
            org.bidon.sdk.ads.banner.helper.CountDownTimer$startTimer$1$deferred$1$1$1 r9 = new org.bidon.sdk.ads.banner.helper.CountDownTimer$startTimer$1$deferred$1$1$1
            r10 = 0
            r9.<init>(r10)
            r11.L$0 = r8
            r11.I$0 = r7
            r11.I$1 = r6
            r11.I$2 = r1
            r11.label = r4
            java.lang.Object r12 = hg.i.y(r12, r9, r11)
            if (r12 != r0) goto L1d
        L73:
            return r0
        L74:
            int r1 = r1 + r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Tick "
            r7.append(r9)
            r7.append(r1)
            java.lang.String r1 = "/"
            r7.append(r1)
            r7.append(r12)
            java.lang.String r1 = r7.toString()
            java.lang.String r7 = "CountDownTimer"
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r7, r1)
            int r6 = r6 + r5
            r1 = r8
            goto L3f
        L96:
            kotlin.Unit r12 = kotlin.Unit.f93236a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.ads.banner.helper.CountDownTimer$startTimer$1$deferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CountDownTimer$startTimer$1$deferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
