package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.adapters.bigo.BigoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002^_B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J<\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u001e\u0010)\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0004\b)\u0010*J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010-J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u001b¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J*\u00108\u001a\u0002072\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020603ø\u0001\u0000¢\u0006\u0004\b8\u00109J*\u0010;\u001a\u00020:2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000b¢\u0006\u0004\b=\u00102J\r\u0010>\u001a\u00020\u000b¢\u0006\u0004\b>\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R$\u0010@\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010\u0005\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010Q\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0018\u0010S\u001a\u00060RR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010U\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010PR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010MR\u0016\u0010Z\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010MR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010]\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "node", BigoAdapter.SLOT_ID, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "subcompose", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "nodeState", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;)V", "Landroidx/compose/runtime/Composition;", "existing", "container", "Landroidx/compose/runtime/CompositionContext;", "parent", "composable", "subcomposeInto", "(Landroidx/compose/runtime/Composition;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "", FirebaseAnalytics.Param.INDEX, "getSlotIdAtIndex", "(I)Ljava/lang/Object;", "takeNodeFromReusables", "(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;", "createNodeAt", "(I)Landroidx/compose/ui/node/LayoutNode;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move", "(III)V", "block", "ignoreRemeasureRequests", "(Lkotlin/jvm/functions/Function0;)V", "", "Landroidx/compose/ui/layout/Measurable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "startIndex", "disposeOrReuseStartingFromIndex", "(I)V", "makeSureStateIsConsistent", "()V", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren", "disposeCurrentNodes", "Landroidx/compose/ui/node/LayoutNode;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "value", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "currentIndex", "I", "", "nodeToNodeState", "Ljava/util/Map;", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "precomposeMap", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableSlotIdsSet", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableCount", "precomposedCount", "", "NoIntrinsicsMessage", "Ljava/lang/String;", "NodeState", "Scope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutNodeSubcompositionsState {

    @NotNull
    private final String NoIntrinsicsMessage;

    @Nullable
    private CompositionContext compositionContext;
    private int currentIndex;

    @NotNull
    private final Map<LayoutNode, NodeState> nodeToNodeState;

    @NotNull
    private final Map<Object, LayoutNode> precomposeMap;
    private int precomposedCount;
    private int reusableCount;

    @NotNull
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet;

    @NotNull
    private final LayoutNode root;

    @NotNull
    private final Scope scope;

    @NotNull
    private final Map<Object, LayoutNode> slotIdToNode;

    @NotNull
    private SubcomposeSlotReusePolicy slotReusePolicy;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", BigoAdapter.SLOT_ID, "", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;

        @NotNull
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @NotNull
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public /* synthetic */ MeasureResult layout(int i10, int i11, Map map, Function1 function1) {
            return MeasureScope.CC.a(this, i10, i11, map, function1);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo301roundToPxR2X_6o(long j10) {
            return androidx.compose.ui.unit.a.a(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo302roundToPx0680j_4(float f10) {
            return androidx.compose.ui.unit.a.b(this, f10);
        }

        public void setDensity(float f10) {
            this.density = f10;
        }

        public void setFontScale(float f10) {
            this.fontScale = f10;
        }

        public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @NotNull
        public List<Measurable> subcompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return LayoutNodeSubcompositionsState.this.subcompose(slotId, content);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo303toDpGaN1DYA(long j10) {
            return androidx.compose.ui.unit.a.c(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo304toDpu2uoSUM(float f10) {
            return androidx.compose.ui.unit.a.d(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo306toDpSizekrfVVM(long j10) {
            return androidx.compose.ui.unit.a.f(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo307toPxR2X_6o(long j10) {
            return androidx.compose.ui.unit.a.g(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo308toPx0680j_4(float f10) {
            return androidx.compose.ui.unit.a.h(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return androidx.compose.ui.unit.a.i(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo309toSizeXkaWNTQ(long j10) {
            return androidx.compose.ui.unit.a.j(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo310toSp0xMU5do(float f10) {
            return androidx.compose.ui.unit.a.k(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo311toSpkPz2Gy4(float f10) {
            return androidx.compose.ui.unit.a.l(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo305toDpu2uoSUM(int i10) {
            return androidx.compose.ui.unit.a.e(this, i10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo312toSpkPz2Gy4(int i10) {
            return androidx.compose.ui.unit.a.m(this, i10);
        }
    }

    public LayoutNodeSubcompositionsState(@NotNull LayoutNode root, @NotNull SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.root = root;
        this.slotReusePolicy = slotReusePolicy;
        this.nodeToNodeState = new LinkedHashMap();
        this.slotIdToNode = new LinkedHashMap();
        this.scope = new Scope();
        this.precomposeMap = new LinkedHashMap();
        this.reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, 0 == true ? 1 : 0);
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final LayoutNode createNodeAt(int index) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(index, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    private final Object getSlotIdAtIndex(int index) {
        NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(index));
        Intrinsics.checkNotNull(nodeState);
        return nodeState.getSlotId();
    }

    private final void ignoreRemeasureRequests(Function0<Unit> block) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        block.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int from, int to, int count) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(from, to, count);
        layoutNode.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        layoutNodeSubcompositionsState.move(i10, i11, i12);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final Composition subcomposeInto(Composition existing, LayoutNode container, CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> composable) {
        if (existing == null || existing.getDisposed()) {
            existing = Wrapper_androidKt.createSubcomposition(container, parent);
        }
        existing.setContent(composable);
        return existing;
    }

    private final LayoutNode takeNodeFromReusables(Object slotId) {
        int i10;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i11 = size - this.reusableCount;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(getSlotIdAtIndex(i13), slotId)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i12));
                Intrinsics.checkNotNull(nodeState);
                NodeState nodeState2 = nodeState;
                if (this.slotReusePolicy.areCompatible(slotId, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(slotId);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            move(i13, i11, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i11);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        Intrinsics.checkNotNull(nodeState3);
        NodeState nodeState4 = nodeState3;
        nodeState4.setActive(true);
        nodeState4.setForceRecompose(true);
        Snapshot.INSTANCE.sendApplyNotifications();
        return layoutNode;
    }

    @NotNull
    public final MeasurePolicy createMeasurePolicy(@NotNull final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasurePolicy.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measure.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measure.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measure.getFontScale());
                LayoutNodeSubcompositionsState.this.currentIndex = 0;
                final MeasureResult measureResultInvoke = block.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m3907boximpl(j10));
                final int i10 = LayoutNodeSubcompositionsState.this.currentIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    @NotNull
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResultInvoke.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResultInvoke.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResultInvoke.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState.currentIndex = i10;
                        measureResultInvoke.placeChildren();
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                        layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                    }
                };
            }
        };
    }

    public final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            Composition composition = ((NodeState) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.removeAll$ui_release();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    public final void disposeOrReuseStartingFromIndex(int startIndex) {
        boolean z10 = false;
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i10 = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i10));
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                boolean z11 = false;
                while (size >= startIndex) {
                    try {
                        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(size);
                        NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                        Intrinsics.checkNotNull(nodeState);
                        NodeState nodeState2 = nodeState;
                        Object slotId = nodeState2.getSlotId();
                        if (this.reusableSlotIdsSet.contains(slotId)) {
                            layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                            this.reusableCount++;
                            if (nodeState2.getActive()) {
                                nodeState2.setActive(false);
                                z11 = true;
                            }
                        } else {
                            LayoutNode layoutNode2 = this.root;
                            layoutNode2.ignoreRemeasureRequests = true;
                            this.nodeToNodeState.remove(layoutNode);
                            Composition composition = nodeState2.getComposition();
                            if (composition != null) {
                                composition.dispose();
                            }
                            this.root.removeAt$ui_release(size, 1);
                            layoutNode2.ignoreRemeasureRequests = false;
                        }
                        this.slotIdToNode.remove(slotId);
                        size--;
                    } catch (Throwable th2) {
                        snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        throw th2;
                    }
                }
                Unit unit = Unit.f93236a;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                z10 = z11;
            } catch (Throwable th3) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
        if (z10) {
            Snapshot.INSTANCE.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        Iterator<Map.Entry<LayoutNode, NodeState>> it = this.nodeToNodeState.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setForceRecompose(true);
        }
        if (this.root.getMeasurePending$ui_release()) {
            return;
        }
        LayoutNode.requestRemeasure$ui_release$default(this.root, false, 1, null);
    }

    @Nullable
    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    @NotNull
    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        if (this.nodeToNodeState.size() != this.root.getFoldedChildren$ui_release().size()) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + this.root.getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((this.root.getFoldedChildren$ui_release().size() - this.reusableCount) - this.precomposedCount >= 0) {
            if (this.precomposeMap.size() == this.precomposedCount) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + this.root.getFoldedChildren$ui_release().size() + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
    }

    @NotNull
    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(@Nullable final Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(slotId)) {
            Map<Object, LayoutNode> map = this.precomposeMap;
            LayoutNode layoutNodeTakeNodeFromReusables = map.get(slotId);
            if (layoutNodeTakeNodeFromReusables == null) {
                layoutNodeTakeNodeFromReusables = takeNodeFromReusables(slotId);
                if (layoutNodeTakeNodeFromReusables != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNodeTakeNodeFromReusables), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeTakeNodeFromReusables = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                map.put(slotId, layoutNodeTakeNodeFromReusables);
            }
            subcompose(layoutNodeTakeNodeFromReusables, slotId, content);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.remove(slotId);
                if (layoutNode != null) {
                    if (LayoutNodeSubcompositionsState.this.precomposedCount <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    int iIndexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
                    if (iIndexOf < LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) {
                        throw new IllegalStateException("Check failed.");
                    }
                    LayoutNodeSubcompositionsState.this.reusableCount++;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    layoutNodeSubcompositionsState.precomposedCount--;
                    int size = (LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) - LayoutNodeSubcompositionsState.this.reusableCount;
                    LayoutNodeSubcompositionsState.this.move(iIndexOf, size, 1);
                    LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(size);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                List<LayoutNode> children$ui_release;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(slotId);
                if (layoutNode == null || (children$ui_release = layoutNode.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* JADX INFO: renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo3023premeasure0kLqBqw(int index, long constraints) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(slotId);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return;
                }
                int size = layoutNode.getChildren$ui_release().size();
                if (index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index (" + index + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode.getIsPlaced()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode).mo3250measureAndLayout0kLqBqw(layoutNode.getChildren$ui_release().get(index), constraints);
                layoutNode2.ignoreRemeasureRequests = false;
            }
        };
    }

    public final void setCompositionContext(@Nullable CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(@NotNull SubcomposeSlotReusePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.slotReusePolicy != value) {
            this.slotReusePolicy = value;
            disposeOrReuseStartingFromIndex(0);
        }
    }

    @NotNull
    public final List<Measurable> subcompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState;
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        if (layoutState$ui_release != LayoutNode.LayoutState.Measuring && layoutState$ui_release != LayoutNode.LayoutState.LayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        Map<Object, LayoutNode> map = this.slotIdToNode;
        LayoutNode layoutNodeRemove = map.get(slotId);
        if (layoutNodeRemove == null) {
            layoutNodeRemove = this.precomposeMap.remove(slotId);
            if (layoutNodeRemove != null) {
                int i10 = this.precomposedCount;
                if (i10 <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.precomposedCount = i10 - 1;
            } else {
                layoutNodeRemove = takeNodeFromReusables(slotId);
                if (layoutNodeRemove == null) {
                    layoutNodeRemove = createNodeAt(this.currentIndex);
                }
            }
            map.put(slotId, layoutNodeRemove);
        }
        LayoutNode layoutNode = layoutNodeRemove;
        int iIndexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
        int i11 = this.currentIndex;
        if (iIndexOf < i11) {
            throw new IllegalArgumentException(("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
        }
        if (i11 != iIndexOf) {
            layoutNodeSubcompositionsState = this;
            move$default(layoutNodeSubcompositionsState, iIndexOf, i11, 0, 4, null);
        } else {
            layoutNodeSubcompositionsState = this;
        }
        layoutNodeSubcompositionsState.currentIndex++;
        subcompose(layoutNode, slotId, content);
        return layoutNode.getChildMeasurables$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B.\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R'\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", BigoAdapter.SLOT_ID, "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "composition", "Landroidx/compose/runtime/Composition;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composition;)V", "<set-?>", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "getActive", "()Z", "setActive", "(Z)V", "active$delegate", "Landroidx/compose/runtime/MutableState;", "getComposition", "()Landroidx/compose/runtime/Composition;", "setComposition", "(Landroidx/compose/runtime/Composition;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "forceRecompose", "getForceRecompose", "setForceRecompose", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class NodeState {

        /* JADX INFO: renamed from: active$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState active;

        @Nullable
        private Composition composition;

        @NotNull
        private Function2<? super Composer, ? super Integer, Unit> content;
        private boolean forceRecompose;

        @Nullable
        private Object slotId;

        public NodeState(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composition composition) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.slotId = obj;
            this.content = content;
            this.composition = composition;
            this.active = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean getActive() {
            return ((Boolean) this.active.getValue()).booleanValue();
        }

        @Nullable
        public final Composition getComposition() {
            return this.composition;
        }

        @NotNull
        public final Function2<Composer, Integer, Unit> getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        @Nullable
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActive(boolean z10) {
            this.active.setValue(Boolean.valueOf(z10));
        }

        public final void setComposition(@Nullable Composition composition) {
            this.composition = composition;
        }

        public final void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            this.content = function2;
        }

        public final void setForceRecompose(boolean z10) {
            this.forceRecompose = z10;
        }

        public final void setSlotId(@Nullable Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, Function2 function2, Composition composition, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i10 & 4) != 0 ? null : composition);
        }
    }

    private final void subcompose(LayoutNode node, Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
        Map<LayoutNode, NodeState> map = this.nodeToNodeState;
        NodeState nodeState = map.get(node);
        if (nodeState == null) {
            NodeState nodeState2 = new NodeState(slotId, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m3001getLambda1$ui_release(), null, 4, null);
            map.put(node, nodeState2);
            nodeState = nodeState2;
        }
        NodeState nodeState3 = nodeState;
        Composition composition = nodeState3.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState3.getContent() != content || hasInvalidations || nodeState3.getForceRecompose()) {
            nodeState3.setContent(content);
            subcompose(node, nodeState3);
            nodeState3.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode node, final NodeState nodeState) {
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                final Function2<Composer, Integer, Unit> content = nodeState.getContent();
                Composition composition = nodeState.getComposition();
                CompositionContext compositionContext = this.compositionContext;
                if (compositionContext != null) {
                    nodeState.setComposition(subcomposeInto(composition, node, compositionContext, ComposableLambdaKt.composableLambdaInstance(-34810602, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.f93236a;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer, int i10) {
                            if ((i10 & 11) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-34810602, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:445)");
                            }
                            boolean active = nodeState.getActive();
                            Function2<Composer, Integer, Unit> function2 = content;
                            composer.startReusableGroup(207, Boolean.valueOf(active));
                            boolean zChanged = composer.changed(active);
                            if (active) {
                                function2.invoke(composer, 0);
                            } else {
                                composer.deactivateToEndGroup(zChanged);
                            }
                            composer.endReusableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    })));
                    layoutNode.ignoreRemeasureRequests = false;
                    Unit unit = Unit.f93236a;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set");
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }
}
