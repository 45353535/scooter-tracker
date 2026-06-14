package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
final class InfiniteTransition$run$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<Float, Continuation, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        @Nullable
        public final Object invoke(float f10, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(Float.valueOf(f10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.F$0 > 0.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f10, Continuation continuation) {
            return invoke(f10.floatValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, Continuation continuation) {
        super(2, continuation);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.$toolingOverride, this.this$0, continuation);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    /* JADX WARN: Path cross not found for [B:11:0x0040, B:16:0x005d], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x005d, B:11:0x0040], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r1 r8
  0x0056: PHI (r1v2 kotlin.jvm.internal.s0) = (r1v3 kotlin.jvm.internal.s0), (r1v5 kotlin.jvm.internal.s0) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r8v3 kotlinx.coroutines.CoroutineScope) = (r8v4 kotlinx.coroutines.CoroutineScope), (r8v5 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.s0 r1 = (kotlin.jvm.internal.s0) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.d.b(r8)
            r8 = r4
            goto L40
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.s0 r1 = (kotlin.jvm.internal.s0) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.d.b(r8)
            r8 = r4
            goto L56
        L30:
            kotlin.d.b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f93329b = r4
        L40:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r5 = r7.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r6 = r7.this$0
            r4.<init>()
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r4 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r7)
            if (r4 != r0) goto L56
            goto L78
        L56:
            float r4 = r1.f93329b
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L40
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r4.<init>()
            kotlinx.coroutines.flow.Flow r4 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r4)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r6 = 0
            r5.<init>(r6)
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r4 = hg.i.y(r4, r5, r7)
            if (r4 != r0) goto L40
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InfiniteTransition$run$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
