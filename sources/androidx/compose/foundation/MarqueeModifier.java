package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import eg.g;
import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B0\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0011\u0010;\u001a\u000208H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010<J\f\u0010=\u001a\u000208*\u00020>H\u0016J)\u0010?\u001a\u00020@*\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GR4\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00102\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b3\u0010\u0012R\u0019\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/foundation/MarqueeModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/focus/FocusEventModifier;", "iterations", "", "delayMillis", "initialDelayMillis", "velocity", "Landroidx/compose/ui/unit/Dp;", "density", "Landroidx/compose/ui/unit/Density;", "(IIIFLandroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "getAnimationMode-ZbEOnfQ", "()I", "setAnimationMode-97h66l8", "(I)V", "animationMode$delegate", "Landroidx/compose/runtime/MutableState;", "containerWidth", "getContainerWidth", "setContainerWidth", "containerWidth$delegate", "contentWidth", "getContentWidth", "setContentWidth", "contentWidth$delegate", "direction", "", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "offset", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "setSpacing", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "spacing$delegate", "spacingPx", "getSpacingPx", "spacingPx$delegate", "Landroidx/compose/runtime/State;", "F", "onFocusEvent", "", "focusState", "Landroidx/compose/ui/focus/FocusState;", "runAnimation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MarqueeModifier implements Modifier.Element, LayoutModifier, DrawModifier, FocusEventModifier {

    /* JADX INFO: renamed from: animationMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animationMode;

    /* JADX INFO: renamed from: containerWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState containerWidth;

    /* JADX INFO: renamed from: contentWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState contentWidth;
    private final int delayMillis;

    @NotNull
    private final Density density;
    private final float direction;

    /* JADX INFO: renamed from: hasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState hasFocus;
    private final int initialDelayMillis;
    private final int iterations;

    @NotNull
    private final Animatable<Float, AnimationVector1D> offset;

    /* JADX INFO: renamed from: spacing$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState spacing;

    /* JADX INFO: renamed from: spacingPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final State spacingPx;
    private final float velocity;

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2", f = "BasicMarquee.kt", l = {272}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2$2", f = "BasicMarquee.kt", l = {285, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 289, 289}, m = "invokeSuspend")
        static final class C00242 extends k implements Function2<Float, Continuation, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00242(MarqueeModifier marqueeModifier, Continuation continuation) {
                super(2, continuation);
                this.this$0 = marqueeModifier;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00242 c00242 = new C00242(this.this$0, continuation);
                c00242.L$0 = obj;
                return c00242;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@Nullable Float f10, @Nullable Continuation continuation) {
                return ((C00242) create(f10, continuation)).invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
            
                if (r0.snapTo(r1, r20) != r8) goto L31;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 217
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifier.AnonymousClass2.C00242.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return MarqueeModifier.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                final MarqueeModifier marqueeModifier = MarqueeModifier.this;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Float>() { // from class: androidx.compose.foundation.MarqueeModifier.runAnimation.2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final Float invoke() {
                        if (marqueeModifier.getContentWidth() <= marqueeModifier.getContainerWidth()) {
                            return null;
                        }
                        if (!MarqueeAnimationMode.m223equalsimpl0(marqueeModifier.m231getAnimationModeZbEOnfQ(), MarqueeAnimationMode.INSTANCE.m230getWhileFocusedZbEOnfQ()) || marqueeModifier.getHasFocus()) {
                            return Float.valueOf(marqueeModifier.getContentWidth() + marqueeModifier.getSpacingPx());
                        }
                        return null;
                    }
                });
                C00242 c00242 = new C00242(MarqueeModifier.this, null);
                this.label = 1;
                if (i.l(flowSnapshotFlow, c00242, this) == objG) {
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

    public /* synthetic */ MarqueeModifier(int i10, int i11, int i12, float f10, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, f10, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getContainerWidth() {
        return ((Number) this.containerWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getContentWidth() {
        return ((Number) this.contentWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx.getValue()).intValue();
    }

    private final void setContainerWidth(int i10) {
        this.containerWidth.setValue(Integer.valueOf(i10));
    }

    private final void setContentWidth(int i10) {
        this.contentWidth.setValue(Integer.valueOf(i10));
    }

    private final void setHasFocus(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        float fFloatValue = this.offset.getValue().floatValue();
        float f10 = this.direction;
        float f11 = fFloatValue * f10;
        boolean z10 = f10 != 1.0f ? this.offset.getValue().floatValue() < ((float) getContainerWidth()) : this.offset.getValue().floatValue() < ((float) getContentWidth());
        boolean z11 = this.direction != 1.0f ? this.offset.getValue().floatValue() > ((float) getSpacingPx()) : this.offset.getValue().floatValue() > ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()));
        float contentWidth = this.direction == 1.0f ? getContentWidth() + getSpacingPx() : (-getContentWidth()) - getSpacingPx();
        float fM1437getHeightimpl = Size.m1437getHeightimpl(contentDrawScope.mo2040getSizeNHjbRc());
        int iM1593getIntersectrtfAjoo = ClipOp.INSTANCE.m1593getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2049clipRectN_I0leg(f11, 0.0f, f11 + getContainerWidth(), fM1437getHeightimpl, iM1593getIntersectrtfAjoo);
        if (z10) {
            contentDrawScope.drawContent();
        }
        if (z11) {
            contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m231getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode.getValue()).getValue();
    }

    @NotNull
    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing.getValue();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(Constraints.m3910copyZbe2FdA$default(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m3933constrainWidthK40F9xA(j10, placeableMo3011measureBRTryo0.getWidth()));
        setContentWidth(placeableMo3011measureBRTryo0.getWidth());
        return MeasureScope.CC.p(measure, getContainerWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.MarqueeModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeWithLayer$default(layout, placeableMo3011measureBRTryo0, zf.a.d((-((Number) this.offset.getValue()).floatValue()) * this.direction), 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifier
    public void onFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        setHasFocus(focusState.getHasFocus());
    }

    @Nullable
    public final Object runAnimation(@NotNull Continuation continuation) {
        if (this.iterations <= 0) {
            return Unit.f93236a;
        }
        Object objG = g.g(FixedMotionDurationScale.INSTANCE, new AnonymousClass2(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m232setAnimationMode97h66l8(int i10) {
        this.animationMode.setValue(MarqueeAnimationMode.m220boximpl(i10));
    }

    public final void setSpacing(@NotNull MarqueeSpacing marqueeSpacing) {
        Intrinsics.checkNotNullParameter(marqueeSpacing, "<set-?>");
        this.spacing.setValue(marqueeSpacing);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    private MarqueeModifier(int i10, int i11, int i12, float f10, Density density) {
        this.iterations = i10;
        this.delayMillis = i11;
        this.initialDelayMillis = i12;
        this.velocity = f10;
        this.density = density;
        this.contentWidth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.containerWidth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BasicMarqueeKt.getDefaultMarqueeSpacing(), null, 2, null);
        this.animationMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m220boximpl(MarqueeAnimationMode.INSTANCE.m229getImmediatelyZbEOnfQ()), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.direction = Math.signum(f10);
        this.spacingPx = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.MarqueeModifier$spacingPx$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                MarqueeSpacing spacing = this.this$0.getSpacing();
                MarqueeModifier marqueeModifier = this.this$0;
                return Integer.valueOf(spacing.calculateSpacing(marqueeModifier.density, marqueeModifier.getContentWidth(), marqueeModifier.getContainerWidth()));
            }
        });
    }
}
