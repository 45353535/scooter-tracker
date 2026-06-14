package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001kB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030\rR\u00020\u0000\u0012\u0004\u0012\u00020\u000e0\fH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u0017*\u00020\u0016H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u0017*\u00020\u001bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u0016*\u00020\u001bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u0016*\u00020!H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010 \u001a\u00020\u0016*\u00020\u0017H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010$J\u001a\u0010)\u001a\u00020&*\u00020%H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020!*\u00020\u0016H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010#J\u001a\u0010+\u001a\u00020!*\u00020\u001bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0014\u0010/\u001a\u00020.*\u00020-H\u0097\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020%*\u00020&H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010(J\u001a\u00105\u001a\u00020\u001b*\u00020\u0016H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u001b*\u00020!H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00104J\u001d\u00105\u001a\u00020\u001b*\u00020\u0017H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J=\u0010D\u001a\u00028\u0000\"\u0004\b\u0000\u0010?2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B\u0012\u0006\u0012\u0004\u0018\u00010C0@H\u0096@ø\u0001\u0001¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010L\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\rR\u00020\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010N\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\rR\u00020\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010JR\u001f\u0010P\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bP\u0010QR(\u0010S\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010>\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010[\u001a\u00020Z8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010\u0007\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bc\u0010bR\u0014\u0010g\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001d\u0010j\u001a\u00020%8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bh\u0010i\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006l"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "density", "<init>", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "", "block", "forEachCurrentPointerHandler", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "dispatchPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "()V", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/runtime/collection/MutableVector;", "pointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "dispatchingPointerHandlers", "lastPointerEvent", "boundsSize", "J", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope$annotations", "", "interceptOutOfBoundsChildEvents", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "getDensity", "()F", "getFontScale", "fontScale", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private long boundsSize;

    @NotNull
    private CoroutineScope coroutineScope;

    @NotNull
    private PointerEvent currentEvent;

    @NotNull
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;

    @Nullable
    private PointerEvent lastPointerEvent;

    @NotNull
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;

    @NotNull
    private final ViewConfiguration viewConfiguration;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\t*\u00020\rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b*\u00020\rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\b*\u00020\u0013H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0012\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u0013*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u0013*\u00020\rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0014\u0010!\u001a\u00020 *\u00020\u001fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010'\u001a\u00020\r*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\r*\u00020\u0013H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010&J\u001d\u0010'\u001a\u00020\r*\u00020\tH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J \u00107\u001a\u00020.2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0096@ø\u0001\u0001¢\u0006\u0004\b9\u0010:JG\u0010A\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010;2\u0006\u0010=\u001a\u00020<2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010?0>H\u0096@ø\u0001\u0001¢\u0006\u0004\bA\u0010BJE\u0010C\u001a\u00028\u0001\"\u0004\b\u0001\u0010;2\u0006\u0010=\u001a\u00020<2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010?0>H\u0096@ø\u0001\u0001¢\u0006\u0004\bC\u0010BR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0014\u0010V\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001d\u0010Z\u001a\u00020W8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001d\u0010`\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b_\u0010Y\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;Lkotlin/coroutines/Continuation;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/input/pointer/PointerEvent;", "event", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "", "offerPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "", "cause", MenuActionType.CANCEL, "(Ljava/lang/Throwable;)V", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "withTimeoutOrNull", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CancellableContinuation;", "pointerAwaiter", "Lkotlinx/coroutines/CancellableContinuation;", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDensity", "()F", "density", "getFontScale", "fontScale", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation {
        private final /* synthetic */ SuspendingPointerInputFilter $$delegate_0;

        @NotNull
        private PointerEventPass awaitPass;

        @NotNull
        private final Continuation completion;

        @NotNull
        private final CoroutineContext context;

        @Nullable
        private CancellableContinuation pointerAwaiter;
        final /* synthetic */ SuspendingPointerInputFilter this$0;

        public PointerEventHandlerCoroutine(@NotNull SuspendingPointerInputFilter suspendingPointerInputFilter, Continuation completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.this$0 = suspendingPointerInputFilter;
            this.completion = completion;
            this.$$delegate_0 = suspendingPointerInputFilter;
            this.awaitPass = PointerEventPass.Main;
            this.context = kotlin.coroutines.e.f93267b;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @Nullable
        public Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation continuation) {
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
            eVar.I();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = eVar;
            Object objC = eVar.C();
            if (objC == pf.b.g()) {
                g.c(continuation);
            }
            return objC;
        }

        public final void cancel(@Nullable Throwable cause) {
            CancellableContinuation cancellableContinuation = this.pointerAwaiter;
            if (cancellableContinuation != null) {
                cancellableContinuation.a(cause);
            }
            this.pointerAwaiter = null;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public PointerEvent getCurrentEvent() {
            return this.this$0.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo2821getExtendedTouchPaddingNHjbRc() {
            return this.this$0.mo2928getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo2822getSizeYbymL2g() {
            return this.this$0.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public ViewConfiguration getViewConfiguration() {
            return this.this$0.getViewConfiguration();
        }

        public final void offerPointerEvent(@NotNull PointerEvent event, @NotNull PointerEventPass pass) {
            CancellableContinuation cancellableContinuation;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass != this.awaitPass || (cancellableContinuation = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            cancellableContinuation.resumeWith(Result.b(event));
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            MutableVector mutableVector = this.this$0.pointerHandlers;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.this$0;
            synchronized (mutableVector) {
                suspendingPointerInputFilter.pointerHandlers.remove(this);
                Unit unit = Unit.f93236a;
            }
            this.completion.resumeWith(result);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo301roundToPxR2X_6o(long j10) {
            return this.$$delegate_0.mo301roundToPxR2X_6o(j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo302roundToPx0680j_4(float f10) {
            return this.$$delegate_0.mo302roundToPx0680j_4(f10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo303toDpGaN1DYA(long j10) {
            return this.$$delegate_0.mo303toDpGaN1DYA(j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo304toDpu2uoSUM(float f10) {
            return this.$$delegate_0.mo304toDpu2uoSUM(f10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo306toDpSizekrfVVM(long j10) {
            return this.$$delegate_0.mo306toDpSizekrfVVM(j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo307toPxR2X_6o(long j10) {
            return this.$$delegate_0.mo307toPxR2X_6o(j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo308toPx0680j_4(float f10) {
            return this.$$delegate_0.mo308toPx0680j_4(f10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @NotNull
        public Rect toRect(@NotNull DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo309toSizeXkaWNTQ(long j10) {
            return this.$$delegate_0.mo309toSizeXkaWNTQ(j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo310toSp0xMU5do(float f10) {
            return this.$$delegate_0.mo310toSp0xMU5do(f10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo311toSpkPz2Gy4(float f10) {
            return this.$$delegate_0.mo311toSpkPz2Gy4(f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeout(long r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r15
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r11, r15)
            L18:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r12 = r0.L$0
                kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12
                kotlin.d.b(r15)     // Catch: java.lang.Throwable -> L2e
                goto L76
            L2e:
                r0 = move-exception
                r13 = r0
                goto L7a
            L31:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L39:
                kotlin.d.b(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L58
                kotlinx.coroutines.CancellableContinuation r15 = r11.pointerAwaiter
                if (r15 == 0) goto L58
                kotlin.Result$Companion r2 = kotlin.Result.f93230c
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = kotlin.d.a(r2)
                java.lang.Object r2 = kotlin.Result.b(r2)
                r15.resumeWith(r2)
            L58:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r15 = r11.this$0
                kotlinx.coroutines.CoroutineScope r5 = r15.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 r8 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                kotlinx.coroutines.Job r12 = eg.g.d(r5, r6, r7, r8, r9, r10)
                r0.L$0 = r12     // Catch: java.lang.Throwable -> L2e
                r0.label = r3     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch: java.lang.Throwable -> L2e
                if (r15 != r1) goto L76
                return r1
            L76:
                kotlinx.coroutines.Job.a.a(r12, r4, r3, r4)
                return r15
            L7a:
                kotlinx.coroutines.Job.a.a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                return r8
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.d.b(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                java.lang.Object r5 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                if (r5 != r1) goto L3d
                return r1
            L3d:
                return r5
            L3e:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeoutOrNull(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo305toDpu2uoSUM(int i10) {
            return this.$$delegate_0.mo305toDpu2uoSUM(i10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo312toSpkPz2Gy4(int i10) {
            return this.$$delegate_0.mo312toSpkPz2Gy4(i10);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SuspendingPointerInputFilter(ViewConfiguration viewConfiguration, Density density, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewConfiguration, (i10 & 2) != 0 ? DensityKt.Density$default(1.0f, 0.0f, 2, null) : density);
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pass) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
            mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
        }
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$0[pass.ordinal()];
            if (i10 == 1 || i10 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content = mutableVector3.getContent();
                    int i11 = 0;
                    do {
                        content[i11].offerPointerEvent(pointerEvent, pass);
                        i11++;
                    } while (i11 < size2);
                }
            } else if (i10 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i12 = size - 1;
                PointerEventHandlerCoroutine<?>[] content2 = mutableVector.getContent();
                do {
                    content2[i12].offerPointerEvent(pointerEvent, pass);
                    i12--;
                } while (i12 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pass, Function1<? super PointerEventHandlerCoroutine<?>, Unit> block) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
                z.b(1);
            } catch (Throwable th2) {
                z.b(1);
                z.a(1);
                throw th2;
            }
        }
        z.a(1);
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$0[pass.ordinal()];
            if (i10 == 1 || i10 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content = mutableVector3.getContent();
                    int i11 = 0;
                    do {
                        block.invoke(content[i11]);
                        i11++;
                    } while (i11 < size2);
                }
            } else if (i10 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i12 = size - 1;
                PointerEventHandlerCoroutine<?>[] content2 = mutableVector.getContent();
                do {
                    block.invoke(content2[i12]);
                    i12--;
                } while (i12 >= 0);
            }
        } finally {
            z.b(1);
            this.dispatchingPointerHandlers.clear();
            z.a(1);
        }
    }

    public static /* synthetic */ void getCoroutineScope$annotations() {
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @Nullable
    public <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, eVar);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            Continuation continuationB = of.c.b(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.f93230c;
            continuationB.resumeWith(Result.b(Unit.f93236a));
        }
        eVar.v(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                pointerEventHandlerCoroutine.cancel(th2);
            }
        });
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo2928getExtendedTouchPaddingNHjbRc() {
        long jMo309toSizeXkaWNTQ = mo309toSizeXkaWNTQ(getViewConfiguration().mo3130getMinimumTouchTargetSizeMYxV2XQ());
        long jM2926getSizeYbymL2g = m2926getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m1440getWidthimpl(jMo309toSizeXkaWNTQ) - IntSize.m4111getWidthimpl(jM2926getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m1437getHeightimpl(jMo309toSizeXkaWNTQ) - IntSize.m4110getHeightimpl(jM2926getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter, androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    @NotNull
    public PointerInputFilter getPointerInputFilter() {
        return this;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (changes.get(i10).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    PointerInputChange pointerInputChange = changes2.get(i11);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo2927onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.boundsSize = bounds;
        if (pass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        dispatchPointerEvent(pointerEvent, pass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo301roundToPxR2X_6o(long j10) {
        return this.$$delegate_0.mo301roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo302roundToPx0680j_4(float f10) {
        return this.$$delegate_0.mo302roundToPx0680j_4(f10);
    }

    public final void setCoroutineScope(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.coroutineScope = coroutineScope;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z10) {
        this.interceptOutOfBoundsChildEvents = z10;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo303toDpGaN1DYA(long j10) {
        return this.$$delegate_0.mo303toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo304toDpu2uoSUM(float f10) {
        return this.$$delegate_0.mo304toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo306toDpSizekrfVVM(long j10) {
        return this.$$delegate_0.mo306toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo307toPxR2X_6o(long j10) {
        return this.$$delegate_0.mo307toPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo308toPx0680j_4(float f10) {
        return this.$$delegate_0.mo308toPx0680j_4(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo309toSizeXkaWNTQ(long j10) {
        return this.$$delegate_0.mo309toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo310toSp0xMU5do(float f10) {
        return this.$$delegate_0.mo310toSp0xMU5do(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo311toSpkPz2Gy4(float f10) {
        return this.$$delegate_0.mo311toSpkPz2Gy4(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo305toDpu2uoSUM(int i10) {
        return this.$$delegate_0.mo305toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo312toSpkPz2Gy4(int i10) {
        return this.$$delegate_0.mo312toSpkPz2Gy4(i10);
    }

    public SuspendingPointerInputFilter(@NotNull ViewConfiguration viewConfiguration, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density, "density");
        this.viewConfiguration = viewConfiguration;
        this.$$delegate_0 = density;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.INSTANCE.m4116getZeroYbymL2g();
        this.coroutineScope = x0.f69181b;
    }
}
