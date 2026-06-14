package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\bJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/DefaultButtonElevation;", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "elevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultButtonElevation implements ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    /* JADX INFO: renamed from: androidx.compose.material.DefaultButtonElevation$elevation$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {RtspMessageChannel.DEFAULT_RTSP_PORT}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
        final /* synthetic */ float $target;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Animatable<Dp, AnimationVector1D> animatable, float f10, Continuation continuation) {
            super(2, continuation);
            this.$animatable = animatable;
            this.$target = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$animatable, this.$target, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
                Dp dpM3949boximpl = Dp.m3949boximpl(this.$target);
                this.label = 1;
                if (animatable.snapTo(dpM3949boximpl, this) == objG) {
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.DefaultButtonElevation$elevation$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {564}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ float $target;
        int label;
        final /* synthetic */ DefaultButtonElevation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Animatable<Dp, AnimationVector1D> animatable, DefaultButtonElevation defaultButtonElevation, float f10, Interaction interaction, Continuation continuation) {
            super(2, continuation);
            this.$animatable = animatable;
            this.this$0 = defaultButtonElevation;
            this.$target = f10;
            this.$interaction = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass3(this.$animatable, this.this$0, this.$target, this.$interaction, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                float fM3965unboximpl = this.$animatable.getTargetValue().m3965unboximpl();
                Interaction focus = null;
                if (Dp.m3956equalsimpl0(fM3965unboximpl, this.this$0.pressedElevation)) {
                    focus = new PressInteraction.Press(Offset.INSTANCE.m1387getZeroF1C5BW0(), null);
                } else if (Dp.m3956equalsimpl0(fM3965unboximpl, this.this$0.hoveredElevation)) {
                    focus = new HoverInteraction.Enter();
                } else if (Dp.m3956equalsimpl0(fM3965unboximpl, this.this$0.focusedElevation)) {
                    focus = new FocusInteraction.Focus();
                }
                Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
                float f10 = this.$target;
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (ElevationKt.m1018animateElevationrAjV9yQ(animatable, f10, focus, interaction, this) == objG) {
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
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public /* synthetic */ DefaultButtonElevation(float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14);
    }

    @Override // androidx.compose.material.ButtonElevation
    @Composable
    @NotNull
    public State<Dp> elevation(boolean z10, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1588756907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588756907, i10, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:505)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        int i11 = (i10 >> 3) & 14;
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(interactionSource) | composer.changed(snapshotStateList);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue2, composer, i11 | 64);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f10 = !z10 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            Object animatable = new Animatable(Dp.m3949boximpl(f10), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, 4, null);
            composer.updateRememberedValue(animatable);
            objRememberedValue3 = animatable;
        }
        composer.endReplaceableGroup();
        Animatable animatable2 = (Animatable) objRememberedValue3;
        if (z10) {
            composer.startReplaceableGroup(-1598807146);
            EffectsKt.LaunchedEffect(Dp.m3949boximpl(f10), new AnonymousClass3(animatable2, this, f10, interaction, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1598807317);
            EffectsKt.LaunchedEffect(Dp.m3949boximpl(f10), new AnonymousClass2(animatable2, f10, null), composer, 64);
            composer.endReplaceableGroup();
        }
        State<Dp> stateAsState = animatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    private DefaultButtonElevation(float f10, float f11, float f12, float f13, float f14) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.disabledElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
    }
}
