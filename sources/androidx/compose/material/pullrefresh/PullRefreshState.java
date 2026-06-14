package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C4240b4;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0002J\b\u00107\u001a\u00020\tH\u0002J\u0015\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0000¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0014H\u0000¢\u0006\u0002\b?J\u0015\u0010@\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\bCR+\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R+\u0010\u001f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001b\u0010#\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010'\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0013\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000fR\u0011\u0010/\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010\u000fR\u0014\u00101\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u000f¨\u0006D"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "animationScope", "Lkotlinx/coroutines/CoroutineScope;", "onRefreshState", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "refreshingOffset", "", "threshold", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "<set-?>", "_position", "get_position", "()F", "set_position", "(F)V", "_position$delegate", "Landroidx/compose/runtime/MutableState;", "", "_refreshing", "get_refreshing", "()Z", "set_refreshing", "(Z)V", "_refreshing$delegate", "_refreshingOffset", "get_refreshingOffset", "set_refreshingOffset", "_refreshingOffset$delegate", "_threshold", "get_threshold", "set_threshold", "_threshold$delegate", "adjustedDistancePulled", "getAdjustedDistancePulled", "adjustedDistancePulled$delegate", "Landroidx/compose/runtime/State;", "distancePulled", "getDistancePulled", "setDistancePulled", "distancePulled$delegate", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", C4240b4.i.L, "getPosition$material_release", "progress", "getProgress", "refreshing", "getRefreshing$material_release", "getThreshold$material_release", "animateIndicatorTo", "Lkotlinx/coroutines/Job;", "offset", "calculateIndicatorPosition", "onPull", "pullDelta", "onPull$material_release", "onRelease", "velocity", "onRelease$material_release", "setRefreshing", "setRefreshing$material_release", "setRefreshingOffset", "setRefreshingOffset$material_release", "setThreshold", "setThreshold$material_release", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
public final class PullRefreshState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: _position$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _position;

    /* JADX INFO: renamed from: _refreshing$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _refreshing;

    /* JADX INFO: renamed from: _refreshingOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _refreshingOffset;

    /* JADX INFO: renamed from: _threshold$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _threshold;

    /* JADX INFO: renamed from: adjustedDistancePulled$delegate, reason: from kotlin metadata */
    @NotNull
    private final State adjustedDistancePulled;

    @NotNull
    private final CoroutineScope animationScope;

    /* JADX INFO: renamed from: distancePulled$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState distancePulled;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @NotNull
    private final State<Function0<Unit>> onRefreshState;

    /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {185}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ float $offset;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {186}, m = "invokeSuspend")
        static final class C00931 extends k implements Function1<Continuation, Object> {
            final /* synthetic */ float $offset;
            int label;
            final /* synthetic */ PullRefreshState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00931(PullRefreshState pullRefreshState, float f10, Continuation continuation) {
                super(1, continuation);
                this.this$0 = pullRefreshState;
                this.$offset = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@NotNull Continuation continuation) {
                return new C00931(this.this$0, this.$offset, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    float f10 = this.this$0.get_position();
                    float f11 = this.$offset;
                    final PullRefreshState pullRefreshState = this.this$0;
                    Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState.animateIndicatorTo.1.1.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Float f12, Float f13) {
                            invoke(f12.floatValue(), f13.floatValue());
                            return Unit.f93236a;
                        }

                        public final void invoke(float f12, float f13) {
                            pullRefreshState.set_position(f12);
                        }
                    };
                    this.label = 1;
                    if (SuspendAnimationKt.animate$default(f10, f11, 0.0f, null, function2, this, 12, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation continuation) {
                return ((C00931) create(continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f10, Continuation continuation) {
            super(2, continuation);
            this.$offset = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return PullRefreshState.this.new AnonymousClass1(this.$offset, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutatorMutex mutatorMutex = PullRefreshState.this.mutatorMutex;
                C00931 c00931 = new C00931(PullRefreshState.this, this.$offset, null);
                this.label = 1;
                if (MutatorMutex.mutate$default(mutatorMutex, null, c00931, this, 1, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(@NotNull CoroutineScope animationScope, @NotNull State<? extends Function0<Unit>> onRefreshState, float f10, float f11) {
        Intrinsics.checkNotNullParameter(animationScope, "animationScope");
        Intrinsics.checkNotNullParameter(onRefreshState, "onRefreshState");
        this.animationScope = animationScope;
        this.onRefreshState = onRefreshState;
        this.adjustedDistancePulled = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$adjustedDistancePulled$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(this.this$0.getDistancePulled() * 0.5f);
            }
        });
        this._refreshing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this._position = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.distancePulled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this._threshold = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f11), null, 2, null);
        this._refreshingOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f10), null, 2, null);
        this.mutatorMutex = new MutatorMutex();
    }

    private final Job animateIndicatorTo(float offset) {
        return i.d(this.animationScope, null, null, new AnonymousClass1(offset, null), 3, null);
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) {
            return getAdjustedDistancePulled();
        }
        float fM = g.m(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThreshold$material_release() + (getThreshold$material_release() * (fM - (((float) Math.pow(fM, 2)) / 4)));
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final float getDistancePulled() {
        return ((Number) this.distancePulled.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final float get_position() {
        return ((Number) this._position.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float get_refreshingOffset() {
        return ((Number) this._refreshingOffset.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float get_threshold() {
        return ((Number) this._threshold.getValue()).floatValue();
    }

    private final void setDistancePulled(float f10) {
        this.distancePulled.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f10) {
        this._position.setValue(Float.valueOf(f10));
    }

    private final void set_refreshing(boolean z10) {
        this._refreshing.setValue(Boolean.valueOf(z10));
    }

    private final void set_refreshingOffset(float f10) {
        this._refreshingOffset.setValue(Float.valueOf(f10));
    }

    private final void set_threshold(float f10) {
        this._threshold.setValue(Float.valueOf(f10));
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    public final float onPull$material_release(float pullDelta) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float fD = g.d(getDistancePulled() + pullDelta, 0.0f);
        float distancePulled = fD - getDistancePulled();
        setDistancePulled(fD);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material_release(float velocity) {
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material_release()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if (getDistancePulled() == 0.0f || velocity < 0.0f) {
            velocity = 0.0f;
        }
        setDistancePulled(0.0f);
        return velocity;
    }

    public final void setRefreshing$material_release(boolean refreshing) {
        if (get_refreshing() != refreshing) {
            set_refreshing(refreshing);
            setDistancePulled(0.0f);
            animateIndicatorTo(refreshing ? get_refreshingOffset() : 0.0f);
        }
    }

    public final void setRefreshingOffset$material_release(float refreshingOffset) {
        if (get_refreshingOffset() == refreshingOffset) {
            return;
        }
        set_refreshingOffset(refreshingOffset);
        if (getRefreshing$material_release()) {
            animateIndicatorTo(refreshingOffset);
        }
    }

    public final void setThreshold$material_release(float threshold) {
        set_threshold(threshold);
    }
}
