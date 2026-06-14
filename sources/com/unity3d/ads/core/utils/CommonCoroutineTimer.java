package com.unity3d.ads.core.utils;

import eg.k0;
import eg.m1;
import eg.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/utils/CommonCoroutineTimer;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "delayStartMillis", "repeatMillis", "Lkotlin/Function0;", "", "action", "Lkotlinx/coroutines/Job;", "start", "(JJLkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Leg/s;", "job", "Leg/s;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonCoroutineTimer implements CoroutineTimer {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final s job;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function0<Unit> $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j10, Function0<Unit> function0, long j11, Continuation continuation) {
            super(2, continuation);
            this.$delayStartMillis = j10;
            this.$action = function0;
            this.$repeatMillis = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                long j10 = this.$delayStartMillis;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (k0.a(j10, this) != objG) {
                }
                return objG;
            }
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            d.b(obj);
            while (i.i(coroutineScope)) {
                this.$action.invoke();
                long j11 = this.$repeatMillis;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (k0.a(j11, this) == objG) {
                    return objG;
                }
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public CommonCoroutineTimer(@NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        s sVarB = m1.b(null, 1, null);
        this.job = sVarB;
        this.scope = i.a(dispatcher.plus(sVarB));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    @NotNull
    public Job start(long delayStartMillis, long repeatMillis, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return eg.i.d(this.scope, this.dispatcher, null, new AnonymousClass1(delayStartMillis, action, repeatMillis, null), 2, null);
    }
}
