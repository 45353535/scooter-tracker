package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverNode;
import androidx.compose.ui.node.ObserverNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0005¢\u0006\u0002\u0010\u0004J5\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u001bH\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u001bH\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u0017H\u0000¢\u0006\u0002\b%J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u0017H\u0016J\r\u0010(\u001a\u00020\u0017H\u0000¢\u0006\u0002\b)R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverNode;", "Landroidx/compose/ui/modifier/ModifierLocalNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "beyondBoundsLayoutParent", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent$ui_release", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "focusStateImpl", "Landroidx/compose/ui/focus/FocusStateImpl;", "getFocusStateImpl$ui_release", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusStateImpl$ui_release", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "isProcessingCustomEnter", "", "isProcessingCustomExit", "fetchCustomEnter", "", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusRequester;", "fetchCustomEnter-aToIllA$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "fetchCustomExit", "fetchCustomExit-aToIllA$ui_release", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "invalidateFocus", "invalidateFocus$ui_release", "onObservedReadsChanged", "onReset", "scheduleInvalidationForFocusEvents", "scheduleInvalidationForFocusEvents$ui_release", "FocusTargetModifierElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusTargetModifierNode extends Modifier.Node implements ObserverNode, ModifierLocalNode {
    public static final int $stable = 8;

    @NotNull
    private FocusStateImpl focusStateImpl = FocusStateImpl.Inactive;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "()V", "create", "equals", "", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetModifierElement extends ModifierNodeElement<FocusTargetModifierNode> {

        @NotNull
        public static final FocusTargetModifierElement INSTANCE = new FocusTargetModifierElement();

        private FocusTargetModifierElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
            inspectorInfo.setName("focusTarget");
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
            return new FocusTargetModifierNode();
        }
    }

    /* JADX INFO: renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m1321fetchCustomEnteraToIllA$ui_release(int focusDirection, @NotNull Function1<? super FocusRequester, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            FocusRequester focusRequesterInvoke = fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m1292boximpl(focusDirection));
            if (focusRequesterInvoke != FocusRequester.INSTANCE.getDefault()) {
                block.invoke(focusRequesterInvoke);
            }
        } finally {
            z.b(1);
            this.isProcessingCustomEnter = false;
            z.a(1);
        }
    }

    /* JADX INFO: renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m1322fetchCustomExitaToIllA$ui_release(int focusDirection, @NotNull Function1<? super FocusRequester, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            FocusRequester focusRequesterInvoke = fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m1292boximpl(focusDirection));
            if (focusRequesterInvoke != FocusRequester.INSTANCE.getDefault()) {
                block.invoke(focusRequesterInvoke);
            }
        } finally {
            z.b(1);
            this.isProcessingCustomExit = false;
            z.a(1);
        }
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(2048) | NodeKind.m3199constructorimpl(1024);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3199constructorimpl) != 0) {
                        if ((NodeKind.m3199constructorimpl(1024) & parent.getKindSet()) != 0) {
                            return focusPropertiesImpl;
                        }
                        if (!(parent instanceof FocusPropertiesModifierNode)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        ((FocusPropertiesModifierNode) parent).modifyFocusProperties(focusPropertiesImpl);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return focusPropertiesImpl;
    }

    @Nullable
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent$ui_release() {
        return (BeyondBoundsLayout) getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.b.a(this, modifierLocal);
    }

    @NotNull
    public final FocusState getFocusState() {
        return this.focusStateImpl;
    }

    @NotNull
    /* JADX INFO: renamed from: getFocusStateImpl$ui_release, reason: from getter */
    public final FocusStateImpl getFocusStateImpl() {
        return this.focusStateImpl;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return androidx.compose.ui.modifier.b.b(this);
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        FocusState focusState = getFocusState();
        if (focusState != FocusStateImpl.Active && focusState != FocusStateImpl.Captured) {
            if (focusState == FocusStateImpl.ActiveParent) {
                return;
            }
            FocusStateImpl focusStateImpl = FocusStateImpl.Active;
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ObserverNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTargetModifierNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                ref$ObjectRef.f93280b = this.fetchFocusProperties$ui_release();
            }
        });
        Object obj = ref$ObjectRef.f93280b;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
            focusProperties = null;
        } else {
            focusProperties = (FocusProperties) obj;
        }
        if (focusProperties.getCanFocus()) {
            return;
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    @Override // androidx.compose.ui.node.ObserverNode
    public void onObservedReadsChanged() {
        FocusState focusState = getFocusState();
        invalidateFocus$ui_release();
        if (Intrinsics.areEqual(focusState, getFocusState())) {
            return;
        }
        FocusEventModifierNodeKt.refreshFocusEventNodes(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        FocusState focusState = getFocusState();
        if (focusState == FocusStateImpl.Active || focusState == FocusStateImpl.Captured) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            return;
        }
        if (focusState == FocusStateImpl.ActiveParent) {
            scheduleInvalidationForFocusEvents$ui_release();
            this.focusStateImpl = FocusStateImpl.Inactive;
        } else if (focusState == FocusStateImpl.Inactive) {
            scheduleInvalidationForFocusEvents$ui_release();
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        androidx.compose.ui.modifier.b.c(this, modifierLocal, obj);
    }

    public final void scheduleInvalidationForFocusEvents$ui_release() {
        NodeChain nodes;
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(4096) | NodeKind.m3199constructorimpl(1024);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3199constructorimpl) != 0 && (NodeKind.m3199constructorimpl(1024) & parent.getKindSet()) == 0) {
                        if (!(parent instanceof FocusEventModifierNode)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        DelegatableNodeKt.requireOwner(this).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public final void setFocusStateImpl$ui_release(@NotNull FocusStateImpl focusStateImpl) {
        Intrinsics.checkNotNullParameter(focusStateImpl, "<set-?>");
        this.focusStateImpl = focusStateImpl;
    }
}
