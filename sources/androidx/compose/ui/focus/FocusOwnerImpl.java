package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001d\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001d\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u000203H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\u001d\u00105\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u0010.J\u000e\u00107\u001a\u0004\u0018\u000108*\u000209H\u0002J\\\u0010:\u001a\u00020\u0005\"\n\b\u0000\u0010;\u0018\u0001*\u000209*\u0002H;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H;0=2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\u00050\u0003H\u0083\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier$annotations", "()V", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getRootFocusNode$ui_release$annotations", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetModifierNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "clearFocus", "force", "", "refreshFocusEvents", "dispatchKeyEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchRotaryEvent", "event", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "wrapAroundFocus", "wrapAroundFocus-3ESFkO8", "lastLocalKeyInputNode", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "traverseAncestors", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusOwnerImpl implements FocusOwner {

    @NotNull
    private final FocusInvalidationManager focusInvalidationManager;
    public LayoutDirection layoutDirection;

    @NotNull
    private final Modifier modifier;

    @NotNull
    private FocusTargetModifierNode rootFocusNode;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusOwnerImpl(@NotNull Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.rootFocusNode = new FocusTargetModifierNode();
        this.focusInvalidationManager = new FocusInvalidationManager(onRequestApplyChangesListener);
        this.modifier = new ModifierNodeElement<FocusTargetModifierNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(@Nullable Object other) {
                return other == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.getRootFocusNode().hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
                inspectorInfo.setName("RootFocusTarget");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            @NotNull
            public FocusTargetModifierNode update(@NotNull FocusTargetModifierNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
                return node;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            @NotNull
            public FocusTargetModifierNode create() {
                return this.this$0.getRootFocusNode();
            }
        };
    }

    public static /* synthetic */ void getModifier$annotations() {
    }

    public static /* synthetic */ void getRootFocusNode$ui_release$annotations() {
    }

    private final KeyInputModifierNode lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024) | NodeKind.m3199constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node node = delegatableNode.getNode();
        Object obj = null;
        if ((node.getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM3199constructorimpl) != 0) {
                    if ((NodeKind.m3199constructorimpl(1024) & child.getKindSet()) != 0) {
                        return (KeyInputModifierNode) obj;
                    }
                    if (!(child instanceof KeyInputModifierNode)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    obj = child;
                }
            }
        }
        return (KeyInputModifierNode) obj;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: traverseAncestors-Y-YKmho, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m1315traverseAncestorsYYKmho(T t10, int i10, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        int size;
        List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(t10, i10);
        if (!(listAncestors instanceof List)) {
            listAncestors = null;
        }
        if (listAncestors != null && listAncestors.size() - 1 >= 0) {
            while (true) {
                int i11 = size - 1;
                function1.invoke(listAncestors.get(size));
                if (i11 < 0) {
                    break;
                } else {
                    size = i11;
                }
            }
        }
        function1.invoke(t10);
        function12.invoke(t10);
        if (listAncestors != null) {
            int size2 = listAncestors.size();
            for (int i12 = 0; i12 < size2; i12++) {
                function12.invoke(listAncestors.get(i12));
            }
        }
    }

    /* JADX INFO: renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m1316wrapAroundFocus3ESFkO8(int focusDirection) {
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (FocusDirection.m1295equalsimpl0(focusDirection, companion.m1308getNextdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(focusDirection, companion.m1310getPreviousdhqQ8s())) {
                clearFocus(false);
                if (this.rootFocusNode.getFocusState().isFocused()) {
                    return mo1313moveFocus3ESFkO8(focusDirection);
                }
                return false;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        clearFocus(force, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo1314dispatchKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        int size;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.");
        }
        KeyInputModifierNode keyInputModifierNodeLastLocalKeyInputNode = lastLocalKeyInputNode(focusTargetModifierNodeFindActiveFocusNode);
        if (keyInputModifierNodeLastLocalKeyInputNode == null) {
            Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNodeFindActiveFocusNode, NodeKind.m3199constructorimpl(8192));
            if (!(nodeNearestAncestor instanceof KeyInputModifierNode)) {
                nodeNearestAncestor = null;
            }
            keyInputModifierNodeLastLocalKeyInputNode = (KeyInputModifierNode) nodeNearestAncestor;
        }
        if (keyInputModifierNodeLastLocalKeyInputNode != null) {
            List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(keyInputModifierNodeLastLocalKeyInputNode, NodeKind.m3199constructorimpl(8192));
            List<Modifier.Node> list = listAncestors instanceof List ? listAncestors : null;
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i10 = size - 1;
                    if (((KeyInputModifierNode) list.get(size)).mo2800onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            if (keyInputModifierNodeLastLocalKeyInputNode.mo2800onPreKeyEventZmokQxo(keyEvent) || keyInputModifierNodeLastLocalKeyInputNode.mo2799onKeyEventZmokQxo(keyEvent)) {
                return true;
            }
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((KeyInputModifierNode) list.get(i11)).mo2799onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        Intrinsics.checkNotNullParameter(event, "event");
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            Object objNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNodeFindActiveFocusNode, NodeKind.m3199constructorimpl(16384));
            if (!(objNearestAncestor instanceof RotaryInputModifierNode)) {
                objNearestAncestor = null;
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) objNearestAncestor;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            List<Modifier.Node> listAncestors = DelegatableNodeKt.ancestors(rotaryInputModifierNode, NodeKind.m3199constructorimpl(16384));
            List<Modifier.Node> list = listAncestors instanceof List ? listAncestors : null;
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i10 = size - 1;
                    if (((RotaryInputModifierNode) list.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            if (rotaryInputModifierNode.onPreRotaryScrollEvent(event) || rotaryInputModifierNode.onRotaryScrollEvent(event)) {
                return true;
            }
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((RotaryInputModifierNode) list.get(i11)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @Nullable
    public Rect getFocusRect() {
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(focusTargetModifierNodeFindActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @NotNull
    /* JADX INFO: renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetModifierNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public boolean mo1313moveFocus3ESFkO8(int focusDirection) {
        final FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetModifierNodeFindActiveFocusNode == null) {
            return false;
        }
        FocusRequester focusRequesterM1323customFocusSearchOMvw8 = FocusTraversalKt.m1323customFocusSearchOMvw8(focusTargetModifierNodeFindActiveFocusNode, focusDirection, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (Intrinsics.areEqual(focusRequesterM1323customFocusSearchOMvw8, companion.getCancel())) {
            return false;
        }
        return Intrinsics.areEqual(focusRequesterM1323customFocusSearchOMvw8, companion.getDefault()) ? FocusTraversalKt.m1324focusSearchsMXa3k8(this.rootFocusNode, focusDirection, getLayoutDirection(), new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull FocusTargetModifierNode destination) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (Intrinsics.areEqual(destination, focusTargetModifierNodeFindActiveFocusNode)) {
                    return Boolean.FALSE;
                }
                Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(destination, NodeKind.m3199constructorimpl(1024));
                if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
                    nodeNearestAncestor = null;
                }
                if (((FocusTargetModifierNode) nodeNearestAncestor) != null) {
                    return Boolean.valueOf(FocusTransactionsKt.requestFocus(destination));
                }
                throw new IllegalStateException("Focus search landed at the root.");
            }
        }) || m1316wrapAroundFocus3ESFkO8(focusDirection) : focusRequesterM1323customFocusSearchOMvw8.findFocusTarget$ui_release(new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull FocusTargetModifierNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
            }
        });
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusTargetModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setRootFocusNode$ui_release(@NotNull FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<set-?>");
        this.rootFocusNode = focusTargetModifierNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusStateImpl() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean force, boolean refreshFocusEvents) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusStateImpl2 = this.rootFocusNode.getFocusStateImpl();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents)) {
            FocusTargetModifierNode focusTargetModifierNode = this.rootFocusNode;
            int i10 = WhenMappings.$EnumSwitchMapping$0[focusStateImpl2.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else {
                if (i10 != 4) {
                    throw new m();
                }
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(focusStateImpl);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }
}
