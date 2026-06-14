package com.unity3d.ads.core.extensions;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gg.v;
import gg.y;
import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ab\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "timeoutMillis", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Lkotlin/Function2;", "Lkotlin/Function0;", "", "Lkotlin/coroutines/Continuation;", "", "block", "timeoutAfter", "(Lkotlinx/coroutines/flow/Flow;JZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowExtensionsKt {

    /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lgg/v;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<v, Continuation, Object> {
        final /* synthetic */ boolean $active;
        final /* synthetic */ Function2<Function0<Unit>, Continuation, Object> $block;
        final /* synthetic */ Flow $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
        static final class C08411 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ v $$this$channelFlow;
            final /* synthetic */ Flow $this_timeoutAfter;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08411(Flow flow, v vVar, Continuation continuation) {
                super(2, continuation);
                this.$this_timeoutAfter = flow;
                this.$$this$channelFlow = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C08411(this.$this_timeoutAfter, this.$$this$channelFlow, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    Flow flow = this.$this_timeoutAfter;
                    final v vVar = this.$$this$channelFlow;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(T t10, @NotNull Continuation continuation) {
                            Object objW = vVar.w(t10, continuation);
                            return objW == b.g() ? objW : Unit.f93236a;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                y.a.a(this.$$this$channelFlow, null, 1, null);
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((C08411) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass2 extends a implements Function0<Unit> {
            AnonymousClass2(Object obj) {
                super(0, obj, v.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                y.a.a((v) this.receiver, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(long j10, boolean z10, Function2<? super Function0<Unit>, ? super Continuation, ? extends Object> function2, Flow flow, Continuation continuation) {
            super(2, continuation);
            this.$timeoutMillis = j10;
            this.$active = z10;
            this.$block = function2;
            this.$this_timeoutAfter = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull v vVar, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            if (r12.invoke(r4, r11) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r11.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.d.b(r12)
                goto L5d
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                java.lang.Object r1 = r11.L$0
                gg.v r1 = (gg.v) r1
                kotlin.d.b(r12)
                goto L47
            L23:
                kotlin.d.b(r12)
                java.lang.Object r12 = r11.L$0
                r5 = r12
                gg.v r5 = (gg.v) r5
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
                kotlinx.coroutines.flow.Flow r12 = r11.$this_timeoutAfter
                r8.<init>(r12, r5, r2)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                eg.g.d(r5, r6, r7, r8, r9, r10)
                long r6 = r11.$timeoutMillis
                r11.L$0 = r5
                r11.label = r4
                java.lang.Object r12 = eg.k0.a(r6, r11)
                if (r12 != r0) goto L46
                goto L5c
            L46:
                r1 = r5
            L47:
                boolean r12 = r11.$active
                if (r12 == 0) goto L5d
                kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.coroutines.Continuation, java.lang.Object> r12 = r11.$block
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r4 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
                r4.<init>(r1)
                r11.L$0 = r2
                r11.label = r3
                java.lang.Object r12 = r12.invoke(r4, r11)
                if (r12 != r0) goto L5d
            L5c:
                return r0
            L5d:
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> Flow timeoutAfter(@NotNull Flow flow, long j10, boolean z10, @NotNull Function2<? super Function0<Unit>, ? super Continuation, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return i.j(new AnonymousClass1(j10, z10, block, flow, null));
    }

    public static /* synthetic */ Flow timeoutAfter$default(Flow flow, long j10, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(flow, j10, z10, function2);
    }
}
