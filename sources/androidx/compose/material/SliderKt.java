package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt;
import androidx.compose.material.Strings;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bg.b;
import com.amazon.device.ads.DtbConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import eg.i;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.y;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0015\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aM\u0010\u001b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001am\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0003¢\u0006\u0004\b#\u0010$\u001aI\u0010+\u001a\u00020\u0003*\u00020%2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aU\u0010.\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0003¢\u0006\u0004\b.\u0010/\u001a5\u00103\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0002¢\u0006\u0004\b3\u00104\u001a;\u0010>\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u0000\u0018\u00010:*\u0002052\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010@\u001a7\u0010F\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0000H\u0002¢\u0006\u0004\bF\u0010G\u001aC\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0000H\u0002¢\u0006\u0004\bF\u0010I\u001a'\u0010M\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0000H\u0002¢\u0006\u0004\bM\u0010N\u001aU\u0010S\u001a\u00020\u00032\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00000Q2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\bS\u0010T\u001ac\u0010U\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bU\u0010V\u001aq\u0010^\u001a\u00020\u0005*\u00020\u00052\u0006\u0010X\u001a\u00020W2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u00072\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00000Z2\u0018\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020Z2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00000Q2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b^\u0010_\u001a3\u0010b\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u00100\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u0000H\u0082@ø\u0001\u0001¢\u0006\u0004\bb\u0010c\u001a\u009f\u0001\u0010h\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000Z2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000Z2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020Z2\u001e\u0010g\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030f0ZH\u0002¢\u0006\u0004\bh\u0010i\"\u001d\u0010j\u001a\u00020&8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0017\u0010n\u001a\u00020&8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bn\u0010k\"\u0017\u0010o\u001a\u00020&8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bo\u0010k\"\u0017\u0010p\u001a\u00020&8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bp\u0010k\"\u001d\u0010q\u001a\u00020&8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0017\u0010s\u001a\u00020&8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bs\u0010k\"\u0017\u0010t\u001a\u00020&8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bt\u0010k\"\u0014\u0010u\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v\"\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00000w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006z"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lbg/b;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "Slider", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLbg/b;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lbg/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLbg/b;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "positionFraction", "", "tickFractions", "width", "SliderImpl", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "RangeSliderImpl", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Dp;", "offset", "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "SliderThumb", "thumbPx", "trackStrokeWidth", "Track", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "current", "minPx", "maxPx", "snapValueToTick", "(FLjava/util/List;FF)F", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "(I)Ljava/util/List;", "a1", "b1", "x1", "a2", "b2", "scale", "(FFFFF)F", "x", "(FFLbg/b;FF)Lbg/b;", "a", "b", POBCTAOverlayData.KEY_CTA_POS, "calcFraction", "(FFF)F", "scaleToOffset", "trackRange", "Landroidx/compose/runtime/MutableState;", "valueState", "CorrectValueSideEffect", "(Lkotlin/jvm/functions/Function1;Lbg/b;Lbg/b;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lbg/b;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "isRtl", "Landroidx/compose/runtime/State;", "rawOffset", "gestureEndAction", "pressOffset", "sliderTapModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;", TypedValues.AttributesType.S_TARGET, "velocity", "animateToTarget", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "rangeSliderPressDragModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZFLbg/b;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "ThumbRadius", "F", "getThumbRadius", "()F", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SliderKt {

    @NotNull
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;

    @NotNull
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m3951constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m3951constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m3951constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m3951constructorimpl(6);
    private static final float TrackHeight = Dp.m3951constructorimpl(4);

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C15232 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<b, Unit>> $onValueChangeState;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ int $steps;
        final /* synthetic */ List<Float> $tickFractions;
        final /* synthetic */ b $value;
        final /* synthetic */ b $valueRange;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class C00812 extends y implements Function1<Float, Float> {
            final /* synthetic */ s0 $maxPx;
            final /* synthetic */ s0 $minPx;
            final /* synthetic */ b $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00812(b bVar, s0 s0Var, s0 s0Var2) {
                super(1, Intrinsics.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = bVar;
                this.$minPx = s0Var;
                this.$maxPx = s0Var2;
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(C15232.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass3 extends y implements Function1<Float, Float> {
            final /* synthetic */ s0 $maxPx;
            final /* synthetic */ s0 $minPx;
            final /* synthetic */ b $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(b bVar, s0 s0Var, s0 s0Var2) {
                super(1, Intrinsics.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = bVar;
                this.$minPx = s0Var;
                this.$maxPx = s0Var2;
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(C15232.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C15232(b bVar, b bVar2, int i10, State<? extends Function1<? super b, Unit>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z10, int i11, Function0<Unit> function0, List<Float> list, SliderColors sliderColors) {
            super(3);
            this.$valueRange = bVar;
            this.$value = bVar2;
            this.$$dirty = i10;
            this.$onValueChangeState = state;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$enabled = z10;
            this.$steps = i11;
            this.$onValueChangeFinished = function0;
            this.$tickFractions = list;
            this.$colors = sliderColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(b bVar, s0 s0Var, s0 s0Var2, float f10) {
            return SliderKt.scale(((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue(), f10, s0Var.f93329b, s0Var2.f93329b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b invoke$scaleToUserValue(s0 s0Var, s0 s0Var2, b bVar, b bVar2) {
            return SliderKt.scale(s0Var.f93329b, s0Var2.f93329b, bVar2, ((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.f93236a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((((i10 & 14) == 0 ? (composer.changed(BoxWithConstraints) ? 4 : 2) | i10 : i10) & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652589923, i10, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:313)");
            }
            boolean z10 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(BoxWithConstraints.getConstraints());
            final s0 s0Var = new s0();
            final s0 s0Var2 = new s0();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            s0Var.f93329b = fM3919getMaxWidthimpl - density.mo308toPx0680j_4(SliderKt.getThumbRadius());
            s0Var2.f93329b = density.mo308toPx0680j_4(SliderKt.getThumbRadius());
            b bVar = this.$value;
            b bVar2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(bVar2, s0Var2, s0Var, ((Number) bVar.getStart()).floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            b bVar3 = this.$value;
            b bVar4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(bVar4, s0Var2, s0Var, ((Number) bVar3.getEndInclusive()).floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            SliderKt.CorrectValueSideEffect(new C00812(this.$valueRange, s0Var2, s0Var), this.$valueRange, g.b(s0Var2.f93329b, s0Var.f93329b), mutableState, ((Number) this.$value.getStart()).floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            SliderKt.CorrectValueSideEffect(new AnonymousClass3(this.$valueRange, s0Var2, s0Var), this.$valueRange, g.b(s0Var2.f93329b, s0Var.f93329b), mutableState2, ((Number) this.$value.getEndInclusive()).floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            final List<Float> list = this.$tickFractions;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            final State<Function1<b, Unit>> state = this.$onValueChangeState;
            final b bVar5 = this.$valueRange;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", l = {360}, m = "invokeSuspend")
                static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ boolean $isStart;
                    final /* synthetic */ s0 $maxPx;
                    final /* synthetic */ s0 $minPx;
                    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                    final /* synthetic */ State<Function1<b, Unit>> $onValueChangeState;
                    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
                    final /* synthetic */ MutableState<Float> $rawOffsetStart;
                    final /* synthetic */ float $target;
                    final /* synthetic */ b $valueRange;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(float f10, float f11, Function0<Unit> function0, boolean z10, MutableState<Float> mutableState, MutableState<Float> mutableState2, State<? extends Function1<? super b, Unit>> state, s0 s0Var, s0 s0Var2, b bVar, Continuation continuation) {
                        super(2, continuation);
                        this.$current = f10;
                        this.$target = f11;
                        this.$onValueChangeFinished = function0;
                        this.$isStart = z10;
                        this.$rawOffsetStart = mutableState;
                        this.$rawOffsetEnd = mutableState2;
                        this.$onValueChangeState = state;
                        this.$minPx = s0Var;
                        this.$maxPx = s0Var2;
                        this.$valueRange = bVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            Float fC = kotlin.coroutines.jvm.internal.b.c(this.$target);
                            TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                            Float fC2 = kotlin.coroutines.jvm.internal.b.c(0.0f);
                            final boolean z10 = this.$isStart;
                            final MutableState<Float> mutableState = this.$rawOffsetStart;
                            final MutableState<Float> mutableState2 = this.$rawOffsetEnd;
                            final State<Function1<b, Unit>> state = this.$onValueChangeState;
                            final s0 s0Var = this.$minPx;
                            final s0 s0Var2 = this.$maxPx;
                            final b bVar = this.$valueRange;
                            Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                                    invoke2(animatable);
                                    return Unit.f93236a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    (z10 ? mutableState : mutableState2).setValue(animateTo.getValue());
                                    state.getValue().invoke(SliderKt.C15232.invoke$scaleToUserValue(s0Var, s0Var2, bVar, g.b(mutableState.getValue().floatValue(), mutableState2.getValue().floatValue())));
                                }
                            };
                            this.label = 1;
                            if (animatableAnimatable$default.animateTo(fC, tweenSpec, fC2, function1, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d.b(obj);
                        }
                        Function0<Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.f93236a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.f93236a;
                }

                public final void invoke(boolean z11) {
                    float fFloatValue = (z11 ? mutableState : mutableState2).getValue().floatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(fFloatValue, list, s0Var2.f93329b, s0Var.f93329b);
                    if (fFloatValue != fSnapValueToTick) {
                        i.d(coroutineScope, null, null, new AnonymousClass1(fFloatValue, fSnapValueToTick, function0, z11, mutableState, mutableState2, state, s0Var2, s0Var, bVar5, null), 3, null);
                        return;
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }, composer, 0);
            Object obj = this.$valueRange;
            Object objValueOf = Float.valueOf(s0Var2.f93329b);
            Object objValueOf2 = Float.valueOf(s0Var.f93329b);
            final b bVar6 = this.$value;
            final State<Function1<b, Unit>> state2 = this.$onValueChangeState;
            Object[] objArr = {mutableState, mutableState2, obj, objValueOf, objValueOf2, bVar6, state2};
            final b bVar7 = this.$valueRange;
            composer.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i11 = 0; i11 < 7; i11++) {
                zChanged |= composer.changed(objArr[i11]);
            }
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function2<Boolean, Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f10) {
                        invoke(bool.booleanValue(), f10.floatValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(boolean z11, float f10) {
                        b bVarB;
                        if (z11) {
                            MutableState<Float> mutableState3 = mutableState;
                            mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f10));
                            mutableState2.setValue(Float.valueOf(SliderKt.C15232.invoke$scaleToOffset(bVar7, s0Var2, s0Var, ((Number) bVar6.getEndInclusive()).floatValue())));
                            float fFloatValue = mutableState2.getValue().floatValue();
                            bVarB = g.b(g.m(mutableState.getValue().floatValue(), s0Var2.f93329b, fFloatValue), fFloatValue);
                        } else {
                            MutableState<Float> mutableState4 = mutableState2;
                            mutableState4.setValue(Float.valueOf(mutableState4.getValue().floatValue() + f10));
                            mutableState.setValue(Float.valueOf(SliderKt.C15232.invoke$scaleToOffset(bVar7, s0Var2, s0Var, ((Number) bVar6.getStart()).floatValue())));
                            float fFloatValue2 = mutableState.getValue().floatValue();
                            bVarB = g.b(fFloatValue2, g.m(mutableState2.getValue().floatValue(), fFloatValue2, s0Var.f93329b));
                        }
                        state2.getValue().invoke(SliderKt.C15232.invoke$scaleToUserValue(s0Var2, s0Var, bVar7, bVarB));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(objRememberedValue4, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierRangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z10, fM3919getMaxWidthimpl, this.$valueRange, stateRememberUpdatedState, stateRememberUpdatedState2);
            final float fM = g.m(((Number) this.$value.getStart()).floatValue(), ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$value.getEndInclusive()).floatValue());
            final float fM2 = g.m(((Number) this.$value.getEndInclusive()).floatValue(), ((Number) this.$value.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue());
            float fCalcFraction = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), fM);
            float fCalcFraction2 = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), fM2);
            int iFloor = (int) Math.floor(this.$steps * fCalcFraction2);
            int iFloor2 = (int) Math.floor(this.$steps * (1.0f - fCalcFraction));
            boolean z11 = this.$enabled;
            Object obj2 = this.$onValueChangeState;
            Object objValueOf3 = Float.valueOf(fM2);
            final State<Function1<b, Unit>> state3 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged2 = composer.changed(obj2) | composer.changed(objValueOf3);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                        invoke(f10.floatValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(float f10) {
                        state3.getValue().invoke(g.b(f10, fM2));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics = SliderKt.sliderSemantics(companion2, fM, z11, (Function1) objRememberedValue5, this.$onValueChangeFinished, g.b(((Number) this.$valueRange.getStart()).floatValue(), fM2), iFloor);
            boolean z12 = this.$enabled;
            Object obj3 = this.$onValueChangeState;
            Object objValueOf4 = Float.valueOf(fM);
            final State<Function1<b, Unit>> state4 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged3 = composer.changed(obj3) | composer.changed(objValueOf4);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                        invoke(f10.floatValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(float f10) {
                        state4.getValue().invoke(g.b(fM, f10));
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics2 = SliderKt.sliderSemantics(companion2, fM2, z12, (Function1) objRememberedValue6, this.$onValueChangeFinished, g.b(fM, ((Number) this.$valueRange.getEndInclusive()).floatValue()), iFloor2);
            boolean z13 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f10 = s0Var.f93329b - s0Var2.f93329b;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i12 = this.$$dirty;
            SliderKt.RangeSliderImpl(z13, fCalcFraction, fCalcFraction2, list2, sliderColors, f10, mutableInteractionSource, mutableInteractionSource2, modifierRangeSliderPressDragModifier, modifierSliderSemantics, modifierSliderSemantics2, composer, ((i12 >> 9) & 14) | 14159872 | ((i12 >> 9) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C15253 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
        final /* synthetic */ List<Float> $tickFractions;
        final /* synthetic */ float $value;
        final /* synthetic */ b $valueRange;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$2, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass2 extends y implements Function1<Float, Float> {
            final /* synthetic */ s0 $maxPx;
            final /* synthetic */ s0 $minPx;
            final /* synthetic */ b $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(b bVar, s0 s0Var, s0 s0Var2) {
                super(1, Intrinsics.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = bVar;
                this.$minPx = s0Var;
                this.$maxPx = s0Var2;
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(C15253.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C15253(b bVar, int i10, float f10, MutableInteractionSource mutableInteractionSource, boolean z10, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
            super(3);
            this.$valueRange = bVar;
            this.$$dirty = i10;
            this.$value = f10;
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z10;
            this.$tickFractions = list;
            this.$colors = sliderColors;
            this.$onValueChangeState = state;
            this.$onValueChangeFinished = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(b bVar, s0 s0Var, s0 s0Var2, float f10) {
            return SliderKt.scale(((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue(), f10, s0Var.f93329b, s0Var2.f93329b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToUserValue(s0 s0Var, s0 s0Var2, b bVar, float f10) {
            return SliderKt.scale(s0Var.f93329b, s0Var2.f93329b, f10, ((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.f93236a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i10) {
            int i11;
            Continuation continuation;
            final MutableState mutableState;
            MutableState mutableState2;
            s0 s0Var;
            s0 s0Var2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                i11 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085116814, i10, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:174)");
            }
            boolean z10 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(BoxWithConstraints.getConstraints());
            final s0 s0Var3 = new s0();
            final s0 s0Var4 = new s0();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            s0Var3.f93329b = Math.max(fM3919getMaxWidthimpl - density.mo308toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
            s0Var4.f93329b = Math.min(density.mo308toPx0680j_4(SliderKt.getThumbRadius()), s0Var3.f93329b);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            float f10 = this.$value;
            b bVar = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(bVar, s0Var4, s0Var3, f10)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState4 = (MutableState) objRememberedValue3;
            Object objValueOf = Float.valueOf(s0Var4.f93329b);
            Object objValueOf2 = Float.valueOf(s0Var3.f93329b);
            final b bVar2 = this.$valueRange;
            final State<Function1<Float, Unit>> state = this.$onValueChangeState;
            composer.startReplaceableGroup(1618982084);
            boolean zChanged = composer.changed(objValueOf) | composer.changed(objValueOf2) | composer.changed(bVar2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                continuation = null;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                s0Var = s0Var4;
                s0Var2 = s0Var3;
                objRememberedValue4 = new SliderDraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f11) {
                        invoke(f11.floatValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(float f11) {
                        MutableState<Float> mutableState5 = mutableState;
                        mutableState5.setValue(Float.valueOf(mutableState5.getValue().floatValue() + f11 + mutableState4.getValue().floatValue()));
                        mutableState4.setValue(Float.valueOf(0.0f));
                        state.getValue().invoke(Float.valueOf(SliderKt.C15253.invoke$scaleToUserValue(s0Var4, s0Var3, bVar2, g.m(mutableState.getValue().floatValue(), s0Var4.f93329b, s0Var3.f93329b))));
                    }
                });
                composer.updateRememberedValue(objRememberedValue4);
            } else {
                s0Var2 = s0Var3;
                continuation = null;
                mutableState2 = mutableState4;
                mutableState = mutableState3;
                s0Var = s0Var4;
            }
            composer.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState = (SliderDraggableState) objRememberedValue4;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, s0Var, s0Var2);
            b bVar3 = this.$valueRange;
            b bVarB = g.b(s0Var.f93329b, s0Var2.f93329b);
            float f11 = this.$value;
            int i12 = this.$$dirty;
            SliderKt.CorrectValueSideEffect(anonymousClass2, bVar3, bVarB, mutableState, f11, composer, ((i12 >> 9) & 112) | 3072 | ((i12 << 12) & 57344));
            final s0 s0Var5 = s0Var;
            final List<Float> list = this.$tickFractions;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            final s0 s0Var6 = s0Var2;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", l = {212}, m = "invokeSuspend")
                static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ SliderDraggableState $draggableState;
                    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                    final /* synthetic */ float $target;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SliderDraggableState sliderDraggableState, float f10, float f11, float f12, Function0<Unit> function0, Continuation continuation) {
                        super(2, continuation);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f10;
                        this.$target = f11;
                        this.$velocity = f12;
                        this.$onValueChangeFinished = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            SliderDraggableState sliderDraggableState = this.$draggableState;
                            float f10 = this.$current;
                            float f11 = this.$target;
                            float f12 = this.$velocity;
                            this.label = 1;
                            if (SliderKt.animateToTarget(sliderDraggableState, f10, f11, f12, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d.b(obj);
                        }
                        Function0<Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.f93236a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f12) {
                    invoke(f12.floatValue());
                    return Unit.f93236a;
                }

                public final void invoke(float f12) {
                    Function0<Unit> function02;
                    float fFloatValue = mutableState.getValue().floatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(fFloatValue, list, s0Var5.f93329b, s0Var6.f93329b);
                    if (fFloatValue != fSnapValueToTick) {
                        i.d(coroutineScope, null, null, new AnonymousClass1(sliderDraggableState, fFloatValue, fSnapValueToTick, f12, function0, null), 3, null);
                    } else {
                        if (sliderDraggableState.isDragging() || (function02 = function0) == null) {
                            return;
                        }
                        function02.invoke();
                    }
                }
            }, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Continuation continuation2 = continuation;
            Modifier modifierSliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState, this.$interactionSource, fM3919getMaxWidthimpl, z10, mutableState, stateRememberUpdatedState, mutableState2, this.$enabled);
            Orientation orientation = Orientation.Horizontal;
            boolean zIsDragging = sliderDraggableState.isDragging();
            boolean z11 = this.$enabled;
            boolean z12 = z10;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(stateRememberUpdatedState);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new SliderKt$Slider$3$drag$1$1(stateRememberUpdatedState, continuation2);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierDraggable$default = DraggableKt.draggable$default(companion2, sliderDraggableState, orientation, z11, mutableInteractionSource, zIsDragging, null, (Function3) objRememberedValue5, z12, 32, null);
            float fCalcFraction = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), g.m(this.$value, ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue()));
            boolean z13 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f12 = s0Var6.f93329b - s0Var5.f93329b;
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            Modifier modifierThen = modifierSliderTapModifier.then(modifierDraggable$default);
            int i13 = this.$$dirty;
            SliderKt.SliderImpl(z13, fCalcFraction, list2, sliderColors, f12, mutableInteractionSource2, modifierThen, composer, ((i13 >> 6) & 458752) | ((i13 >> 9) & 14) | 512 | ((i13 >> 15) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$animateToTarget$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {954}, m = "invokeSuspend")
    static final class C15282 extends k implements Function2<DragScope, Continuation, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15282(float f10, float f11, float f12, Continuation continuation) {
            super(2, continuation);
            this.$current = f10;
            this.$target = f11;
            this.$velocity = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15282 c15282 = new C15282(this.$current, this.$target, this.$velocity, continuation);
            c15282.L$0 = obj;
            return c15282;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
            return ((C15282) create(dragScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final s0 s0Var = new s0();
                float f10 = this.$current;
                s0Var.f93329b = f10;
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f10, 0.0f, 2, null);
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.$target);
                TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                Float fC2 = kotlin.coroutines.jvm.internal.b.c(this.$velocity);
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.animateToTarget.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        dragScope.dragBy(animateTo.getValue().floatValue() - s0Var.f93329b);
                        s0Var.f93329b = animateTo.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (animatableAnimatable$default.animateTo(fC, tweenSpec, fC2, function1, this) == objG) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {982}, m = "invokeSuspend")
    static final class C15291 extends k implements Function2<PointerInputScope, Continuation, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {983}, m = "invokeSuspend")
        static final class C00831 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {984, 994, 1013}, m = "invokeSuspend")
            static final class C00841 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {1030}, m = "invokeSuspend")
                static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ Ref$BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref$BooleanRef ref$BooleanRef, DragInteraction dragInteraction, Continuation continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = ref$BooleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.f93279b);
                            DragInteraction dragInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == objG) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00841(boolean z10, float f10, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation continuation) {
                    super(2, continuation);
                    this.$isRtl = z10;
                    this.$maxPx = f10;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    C00841 c00841 = new C00841(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    c00841.L$0 = obj;
                    return c00841;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((C00841) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:52:0x0172, code lost:
                
                    if (r1 != r6) goto L54;
                 */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
                @Override // kotlin.coroutines.jvm.internal.a
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
                    /*
                        Method dump skipped, instruction units count: 437
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.C15291.C00831.C00841.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00831(PointerInputScope pointerInputScope, boolean z10, float f10, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$isRtl = z10;
                this.$maxPx = f10;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00831 c00831 = new C00831(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                c00831.L$0 = obj;
                return c00831;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00841 c00841 = new C00841(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00841, this) == objG) {
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
                return ((C00831) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C15291(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2<? super Boolean, ? super Float, Unit>> state3, boolean z10, float f10, State<? extends Function1<? super Boolean, Unit>> state4, Continuation continuation) {
            super(2, continuation);
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$rawOffsetStart = state;
            this.$rawOffsetEnd = state2;
            this.$onDrag = state3;
            this.$isRtl = z10;
            this.$maxPx = f10;
            this.$gestureEndAction = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15291 c15291 = new C15291(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
            c15291.L$0 = obj;
            return c15291;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((C15291) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                C00831 c00831 = new C00831((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (kotlinx.coroutines.i.g(c00831, this) == objG) {
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
    }

    static {
        float fM3951constructorimpl = Dp.m3951constructorimpl(48);
        SliderHeight = fM3951constructorimpl;
        float fM3951constructorimpl2 = Dp.m3951constructorimpl(144);
        SliderMinWidth = fM3951constructorimpl2;
        DefaultSliderConstraints = SizeKt.m449heightInVpY3zN4$default(SizeKt.m468widthInVpY3zN4$default(Modifier.INSTANCE, fM3951constructorimpl2, 0.0f, 2, null), 0.0f, fM3951constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void CorrectValueSideEffect(final Function1<? super Float, Float> function1, final b bVar, final b bVar2, final MutableState<Float> mutableState, final float f10, Composer composer, final int i10) {
        float f11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-743965752);
        int i11 = (i10 & 14) == 0 ? (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(bVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(bVar2) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            f11 = f10;
            i11 |= composerStartRestartGroup.changed(f11) ? 16384 : 8192;
        } else {
            f11 = f10;
        }
        if ((i11 & 46811) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i10, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:831)");
            }
            Object[] objArr = {bVar, function1, Float.valueOf(f11), mutableState, bVar2};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i12 = 0; i12 < 5; i12++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i12]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final float f12 = f11;
                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        float fFloatValue = (((Number) bVar.getEndInclusive()).floatValue() - ((Number) bVar.getStart()).floatValue()) / 1000;
                        float fFloatValue2 = function1.invoke(Float.valueOf(f12)).floatValue();
                        if (Math.abs(fFloatValue2 - mutableState.getValue().floatValue()) <= fFloatValue || !bVar2.contains(mutableState.getValue())) {
                            return;
                        }
                        mutableState.setValue(Float.valueOf(fFloatValue2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.CorrectValueSideEffect.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                SliderKt.CorrectValueSideEffect(function1, bVar, bVar2, mutableState, f10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0269 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull final bg.b r40, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super bg.b, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r42, boolean r43, @org.jetbrains.annotations.Nullable bg.b r44, int r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r46, @org.jetbrains.annotations.Nullable androidx.compose.material.SliderColors r47, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(bg.b, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, bg.b, int, kotlin.jvm.functions.Function0, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(final boolean z10, final float f10, final float f11, final List<Float> list, final SliderColors sliderColors, final float f12, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i10, final int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-278895713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278895713, i10, i11, "androidx.compose.material.RangeSliderImpl (Slider.kt:615)");
        }
        Strings.Companion companion = Strings.INSTANCE;
        final String strM1122getString4foXLRw = Strings_androidKt.m1122getString4foXLRw(companion.m1121getSliderRangeStartUdPEhr4(), composerStartRestartGroup, 6);
        final String strM1122getString4foXLRw2 = Strings_androidKt.m1122getString4foXLRw(companion.m1120getSliderRangeEndUdPEhr4(), composerStartRestartGroup, 6);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
        if (!s.a(composerStartRestartGroup.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion3.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo308toPx0680j_4 = density2.mo308toPx0680j_4(TrackHeight);
        float f13 = ThumbRadius;
        float fMo308toPx0680j_42 = density2.mo308toPx0680j_4(f13);
        float fMo304toDpu2uoSUM = density2.mo304toDpu2uoSUM(f12);
        float fM3951constructorimpl = Dp.m3951constructorimpl(f13 * 2);
        float fM3951constructorimpl2 = Dp.m3951constructorimpl(fMo304toDpu2uoSUM * f10);
        float fM3951constructorimpl3 = Dp.m3951constructorimpl(fMo304toDpu2uoSUM * f11);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        int i12 = i10 >> 9;
        int i13 = i10 << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z10, f10, f11, list, fMo308toPx0680j_42, fMo308toPx0680j_4, composerStartRestartGroup, (i12 & 112) | 262144 | (i13 & 896) | (i13 & 7168) | (i13 & 57344));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(strM1122getString4foXLRw);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semantics, strM1122getString4foXLRw);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i14 = i10 & 57344;
        int i15 = (i10 << 15) & 458752;
        m1100SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue), true, mutableInteractionSource).then(modifier2), fM3951constructorimpl2, mutableInteractionSource, sliderColors, z10, fM3951constructorimpl, composerStartRestartGroup, 1572870 | (i12 & 7168) | i14 | i15);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(strM1122getString4foXLRw2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semantics, strM1122getString4foXLRw2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        m1100SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue2), true, mutableInteractionSource2).then(modifier3), fM3951constructorimpl3, mutableInteractionSource2, sliderColors, z10, fM3951constructorimpl, composerStartRestartGroup, 1572870 | ((i10 >> 12) & 7168) | i14 | i15);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i16) {
                SliderKt.RangeSliderImpl(z10, f10, f11, list, sliderColors, f12, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Slider(final float r38, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r40, boolean r41, @org.jetbrains.annotations.Nullable bg.b r42, int r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r44, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r45, @org.jetbrains.annotations.Nullable androidx.compose.material.SliderColors r46, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, bg.b, int, kotlin.jvm.functions.Function0, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SliderImpl(final boolean z10, final float f10, final List<Float> list, final SliderColors sliderColors, final float f11, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1679682785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i10, -1, "androidx.compose.material.SliderImpl (Slider.kt:578)");
        }
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
        if (!s.a(composerStartRestartGroup.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo308toPx0680j_4 = density2.mo308toPx0680j_4(TrackHeight);
        float f12 = ThumbRadius;
        float fMo308toPx0680j_42 = density2.mo308toPx0680j_4(f12);
        float fMo304toDpu2uoSUM = density2.mo304toDpu2uoSUM(f11);
        float fM3951constructorimpl = Dp.m3951constructorimpl(f12 * 2);
        float fM3951constructorimpl2 = Dp.m3951constructorimpl(fMo304toDpu2uoSUM * f10);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        int i11 = i10 >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z10, 0.0f, f10, list, fMo308toPx0680j_42, fMo308toPx0680j_4, composerStartRestartGroup, (i11 & 112) | 265222 | ((i10 << 6) & 896) | ((i10 << 9) & 57344));
        m1100SliderThumbPcYyNuk(boxScopeInstance, companion2, fM3951constructorimpl2, mutableInteractionSource, sliderColors, z10, fM3951constructorimpl, composerStartRestartGroup, (i11 & 7168) | 1572918 | ((i10 << 3) & 57344) | ((i10 << 15) & 458752));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.SliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                SliderKt.SliderImpl(z10, f10, list, sliderColors, f11, mutableInteractionSource, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1100SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f10, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z10, final float f11, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(428907178);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f11) ? 1048576 : 524288;
        }
        if ((2995931 & i11) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i11, -1, "androidx.compose.material.SliderThumb (Slider.kt:683)");
            }
            Modifier modifierM422paddingqDBjuR0$default = PaddingKt.m422paddingqDBjuR0$default(Modifier.INSTANCE, f10, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM422paddingqDBjuR0$default, companion.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlign);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i12 = i11 >> 9;
            int i13 = i12 & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableInteractionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i13 | 64);
            SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU(ShadowKt.m1288shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m463sizeVpY3zN4(modifier, f11, f11), mutableInteractionSource, RippleKt.m1216rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z10 ? !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation : Dp.m3951constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z10, composerStartRestartGroup, ((i11 >> 15) & 14) | (i12 & 112)).getValue().m1614unboximpl(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i14) {
                SliderKt.m1100SliderThumbPcYyNuk(boxScope, modifier, f10, mutableInteractionSource, sliderColors, z10, f11, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z10, final float f10, final float f11, final List<Float> list, final float f12, final float f13, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1833126050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i10, -1, "androidx.compose.material.Track (Slider.kt:729)");
        }
        int i11 = ((i10 >> 6) & 14) | 48 | ((i10 << 3) & 896);
        final State<Color> stateTrackColor = sliderColors.trackColor(z10, false, composerStartRestartGroup, i11);
        final State<Color> stateTrackColor2 = sliderColors.trackColor(z10, true, composerStartRestartGroup, i11);
        final State<Color> stateTickColor = sliderColors.tickColor(z10, false, composerStartRestartGroup, i11);
        final State<Color> stateTickColor2 = sliderColors.tickColor(z10, true, composerStartRestartGroup, i11);
        CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SliderKt.Track.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                boolean z11 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long jOffset = OffsetKt.Offset(f12, Offset.m1372getYimpl(Canvas.mo2039getCenterF1C5BW0()));
                long jOffset2 = OffsetKt.Offset(Size.m1440getWidthimpl(Canvas.mo2040getSizeNHjbRc()) - f12, Offset.m1372getYimpl(Canvas.mo2039getCenterF1C5BW0()));
                long j10 = jOffset2;
                if (!z11) {
                    jOffset2 = jOffset;
                }
                if (z11) {
                    j10 = jOffset;
                }
                long jM1614unboximpl = stateTrackColor.getValue().m1614unboximpl();
                float f14 = f13;
                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                androidx.compose.ui.graphics.drawscope.b.C(Canvas, jM1614unboximpl, jOffset2, j10, f14, companion.m1928getRoundKaPHkGw(), null, 0.0f, null, 0, DtbConstants.DEFAULT_PLAYER_HEIGHT, null);
                long j11 = j10;
                long j12 = jOffset2;
                androidx.compose.ui.graphics.drawscope.b.C(Canvas, stateTrackColor2.getValue().m1614unboximpl(), OffsetKt.Offset(Offset.m1371getXimpl(jOffset2) + ((Offset.m1371getXimpl(j10) - Offset.m1371getXimpl(jOffset2)) * f10), Offset.m1372getYimpl(Canvas.mo2039getCenterF1C5BW0())), OffsetKt.Offset(Offset.m1371getXimpl(jOffset2) + ((Offset.m1371getXimpl(j10) - Offset.m1371getXimpl(jOffset2)) * f11), Offset.m1372getYimpl(Canvas.mo2039getCenterF1C5BW0())), f13, companion.m1928getRoundKaPHkGw(), null, 0.0f, null, 0, DtbConstants.DEFAULT_PLAYER_HEIGHT, null);
                List<Float> list2 = list;
                float f15 = f11;
                float f16 = f10;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Boolean boolValueOf = Boolean.valueOf(fFloatValue > f15 || fFloatValue < f16);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                State<Color> state = stateTickColor;
                State<Color> state2 = stateTickColor2;
                float f17 = f13;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Offset.m1360boximpl(OffsetKt.Offset(Offset.m1371getXimpl(OffsetKt.m1394lerpWko1d7g(j12, j11, ((Number) it.next()).floatValue())), Offset.m1372getYimpl(Canvas.mo2039getCenterF1C5BW0()))));
                    }
                    long j13 = j12;
                    j11 = j11;
                    androidx.compose.ui.graphics.drawscope.b.H(Canvas, arrayList2, PointMode.INSTANCE.m1880getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m1614unboximpl(), f17, StrokeCap.INSTANCE.m1928getRoundKaPHkGw(), null, 0.0f, null, 0, DtbConstants.DEFAULT_PLAYER_HEIGHT, null);
                    j12 = j13;
                }
            }
        }, composerStartRestartGroup, i10 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Track.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                SliderKt.Track(modifier, sliderColors, z10, f10, f11, list, f12, f13, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f10, float f11, float f12, Continuation continuation) {
        Object objA = androidx.compose.foundation.gestures.a.a(draggableState, null, new C15282(f10, f11, f12, null), continuation, 1, null);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1103awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.s0 r8 = (kotlin.jvm.internal.s0) r8
            kotlin.d.b(r12)
            goto L55
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.d.b(r12)
            kotlin.jvm.internal.s0 r12 = new kotlin.jvm.internal.s0
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m998awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7 = r12
            r12 = r8
            r8 = r7
        L55:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L64
            float r8 = r8.f93329b
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.c(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.to(r12, r8)
            return r8
        L64:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m1103awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f10, float f11, float f12) {
        float f13 = f11 - f10;
        return g.m(f13 == 0.0f ? 0.0f : (f12 - f10) / f13, 0.0f, 1.0f);
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z10, boolean z11, float f10, b bVar, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z10 ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f10), Boolean.valueOf(z11), bVar}, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) new C15291(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z11, f10, state3, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f10, float f11, float f12, float f13, float f14) {
        return MathHelpersKt.lerp(f13, f14, calcFraction(f10, f11, f12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f10, final boolean z10, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, final b bVar, final int i10) {
        final float fM = g.m(f10, ((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (!z10) {
                    SemanticsPropertiesKt.disabled(semantics);
                }
                final b bVar2 = bVar;
                final int i11 = i10;
                final float f11 = fM;
                final Function1<Float, Unit> function12 = function1;
                final Function0<Unit> function02 = function0;
                SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f12) {
                        return invoke(f12.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f12) {
                        int i12;
                        float fM2 = g.m(f12, ((Number) bVar2.getStart()).floatValue(), ((Number) bVar2.getEndInclusive()).floatValue());
                        int i13 = i11;
                        boolean z11 = false;
                        if (i13 > 0 && (i12 = i13 + 1) >= 0) {
                            float fAbs = fM2;
                            float f13 = fAbs;
                            int i14 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(((Number) bVar2.getStart()).floatValue(), ((Number) bVar2.getEndInclusive()).floatValue(), i14 / (i11 + 1));
                                float f14 = fLerp - fM2;
                                if (Math.abs(f14) <= fAbs) {
                                    fAbs = Math.abs(f14);
                                    f13 = fLerp;
                                }
                                if (i14 == i12) {
                                    break;
                                }
                                i14++;
                            }
                            fM2 = f13;
                        }
                        if (fM2 != f11) {
                            function12.invoke(Float.valueOf(fM2));
                            Function0<Unit> function03 = function02;
                            if (function03 != null) {
                                function03.invoke();
                            }
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                    }
                }, 1, null);
            }
        }, 1, null), f10, bVar, i10);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f10, boolean z10, Function1 function1, Function0 function0, b bVar, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i11 & 16) != 0) {
            bVar = g.b(0.0f, 1.0f);
        }
        b bVar2 = bVar;
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return sliderSemantics(modifier, f10, z10, function1, function02, bVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f10, final boolean z10, final State<Float> state, final State<? extends Function1<? super Float, Unit>> state2, final MutableState<Float> mutableState, final boolean z11) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", draggableState);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Float.valueOf(f10));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", l = {EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE}, m = "invokeSuspend")
            static final class AnonymousClass1 extends k implements Function2<PointerInputScope, Continuation, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {914}, m = "invokeSuspend")
                static final class C00861 extends k implements Function3<PressGestureScope, Offset, Continuation, Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00861(boolean z10, float f10, MutableState<Float> mutableState, State<Float> state, Continuation continuation) {
                        super(3, continuation);
                        this.$isRtl = z10;
                        this.$maxPx = f10;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation continuation) {
                        return m1104invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m1104invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j10, @Nullable Continuation continuation) {
                        C00861 c00861 = new C00861(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                        c00861.L$0 = pressGestureScope;
                        c00861.J$0 = j10;
                        return c00861.invokeSuspend(Unit.f93236a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        try {
                            if (i10 == 0) {
                                d.b(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j10 = this.J$0;
                                this.$pressOffset.setValue(kotlin.coroutines.jvm.internal.b.c((this.$isRtl ? this.$maxPx - Offset.m1371getXimpl(j10) : Offset.m1371getXimpl(j10)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                d.b(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(kotlin.coroutines.jvm.internal.b.c(0.0f));
                        }
                        return Unit.f93236a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z10, float f10, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state2, Continuation continuation) {
                    super(2, continuation);
                    this.$isRtl = z10;
                    this.$maxPx = f10;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        d.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00861 c00861 = new C00861(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final CoroutineScope coroutineScope = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<Function1<Float, Unit>> state = this.$gestureEndAction;
                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2.1.2

                            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", l = {921}, m = "invokeSuspend")
                            static final class C00881 extends k implements Function2<CoroutineScope, Continuation, Object> {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
                                int label;

                                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                                static final class C00891 extends k implements Function2<DragScope, Continuation, Object> {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    C00891(Continuation continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.a
                                    @NotNull
                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                        C00891 c00891 = new C00891(continuation);
                                        c00891.L$0 = obj;
                                        return c00891;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
                                        return ((C00891) create(dragScope, continuation)).invokeSuspend(Unit.f93236a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.a
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        pf.b.g();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        d.b(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return Unit.f93236a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C00881(DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state, Continuation continuation) {
                                    super(2, continuation);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                @NotNull
                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                    return new C00881(this.$draggableState, this.$gestureEndAction, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object objG = pf.b.g();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        d.b(obj);
                                        DraggableState draggableState = this.$draggableState;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C00891 c00891 = new C00891(null);
                                        this.label = 1;
                                        if (draggableState.drag(mutatePriority, c00891, this) == objG) {
                                            return objG;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        d.b(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.b.c(0.0f));
                                    return Unit.f93236a;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                    return ((C00881) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m1105invokek4lQ0M(offset.getPackedValue());
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1105invokek4lQ0M(long j10) {
                                i.d(coroutineScope, null, null, new C00881(draggableState, state, null), 3, null);
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00861, function1, this, 3, null) == objG) {
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
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1945228890);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1945228890, i10, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:904)");
                }
                if (z11) {
                    composer.startReplaceableGroup(773894976);
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f10), Boolean.valueOf(z10)}, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) new AnonymousClass1(z10, f10, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return composed;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f10, List<Float> list, float f11, float f12) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f11, f12, ((Number) next).floatValue()) - f10);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f11, f12, ((Number) next2).floatValue()) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f13 = (Float) obj;
        return f13 != null ? MathHelpersKt.lerp(f11, f12, f13.floatValue()) : f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> stepsToTickFractions(int i10) {
        if (i10 == 0) {
            return CollectionsKt.emptyList();
        }
        int i11 = i10 + 2;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(i12 / (i10 + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b scale(float f10, float f11, b bVar, float f12, float f13) {
        return g.b(scale(f10, f11, ((Number) bVar.getStart()).floatValue(), f12, f13), scale(f10, f11, ((Number) bVar.getEndInclusive()).floatValue(), f12, f13));
    }
}
