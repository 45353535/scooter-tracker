package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\"\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010)J\u0011\u0010-\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106R\"\u00107\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010A\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00103R\u0011\u0010I\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010U\u001a\u00020R8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bV\u0010PR\u001a\u0010Z\u001a\u00020X8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bY\u0010TR\u0011\u0010\\\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\b[\u0010PR\u001a\u0010^\u001a\u00020X8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b]\u0010TR\u0014\u0010`\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u00103R\u0011\u0010b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\ba\u0010@R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0011\u0010g\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bg\u00103R\u0013\u0010j\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bh\u0010i\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/node/SemanticsModifierNode;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/SemanticsModifierNode;ZLandroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "mergedConfig", "", "mergeConfig", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "includeReplacedSemantics", "includeFakeNodes", "", "getChildren", "(ZZ)Ljava/util/List;", "", "list", "findOneLayerOfMergingSemanticsNodes", "(Ljava/util/List;)Ljava/util/List;", "unmergedChildren", "emitFakeNodes", "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "properties", "fakeSemanticsNode-ypyhhiA", "(Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "fakeSemanticsNode", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getAlignmentLinePosition", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "unmergedChildren$ui_release", "(Z)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/node/SemanticsModifierNode;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "isFake", "isFake$ui_release", "setFake$ui_release", "(Z)V", "fakeNodeParent", "Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "id", "I", "getId", "()I", "isMergingSemanticsOfDescendants", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "root", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getPositionInWindow-F1C5BW0", "positionInWindow", "isTransparent$ui_release", "isTransparent", "getConfig", "config", "()Ljava/util/List;", "children", "getReplacedChildren$ui_release", "replacedChildren", "isRoot", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SemanticsNode {
    public static final int $stable = 8;

    @Nullable
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;

    @NotNull
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;

    @NotNull
    private final SemanticsModifierNode outerSemanticsNode;

    @NotNull
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(@NotNull SemanticsModifierNode outerSemanticsNode, boolean z10, @NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(outerSemanticsNode, "outerSemanticsNode");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.outerSemanticsNode = outerSemanticsNode;
        this.mergingEnabled = z10;
        this.layoutNode = layoutNode;
        this.unmergedConfig = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemanticsNode);
        this.id = layoutNode.getSemanticsId();
    }

    private final void emitFakeNodes(List<SemanticsNode> unmergedChildren) {
        final Role role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(m3357fakeSemanticsNodeypyhhiA(role, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver fakeSemanticsNode) {
                    Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
                    SemanticsPropertiesKt.m3364setRolekuIjeqM(fakeSemanticsNode, role.getValue());
                }
            }));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            final String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
            if (str != null) {
                unmergedChildren.add(0, m3357fakeSemanticsNodeypyhhiA(null, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
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
                    public final void invoke2(@NotNull SemanticsPropertyReceiver fakeSemanticsNode) {
                        Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
                        SemanticsPropertiesKt.setContentDescription(fakeSemanticsNode, str);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m3357fakeSemanticsNodeypyhhiA(Role role, Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(properties), false, new LayoutNode(true, role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this)));
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list) {
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i10);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void mergeConfig(SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i10);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                mergedConfig.mergeChild$ui_release(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(mergedConfig);
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z10);
    }

    @Nullable
    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        SemanticsModifierNode outerMergingSemantics = this.unmergedConfig.getIsMergingSemanticsOfDescendants() ? SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode) : null;
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.m3103requireCoordinator64DMado(outerMergingSemantics, NodeKind.m3199constructorimpl(8));
    }

    public final int getAlignmentLinePosition(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        Rect rectBoundsInRoot;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null && (rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui_release)) != null) {
                return rectBoundsInRoot;
            }
        }
        return Rect.INSTANCE.getZero();
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        Rect rectBoundsInWindow;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null && (rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(nodeCoordinatorFindCoordinatorToGetBounds$ui_release)) != null) {
                return rectBoundsInWindow;
            }
        }
        return Rect.INSTANCE.getZero();
    }

    @NotNull
    public final List<SemanticsNode> getChildren() {
        return getChildren(!this.mergingEnabled, false);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        if (!isMergingSemanticsOfDescendants()) {
            return this.unmergedConfig;
        }
        SemanticsConfiguration semanticsConfigurationCopy = this.unmergedConfig.copy();
        mergeConfig(semanticsConfigurationCopy);
        return semanticsConfigurationCopy;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: getOuterSemanticsNode$ui_release, reason: from getter */
    public final SemanticsModifierNode getOuterSemanticsNode() {
        return this.outerSemanticsNode;
    }

    @Nullable
    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNodeFindClosestParentNode = this.mergingEnabled ? SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode it) {
                SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
                Intrinsics.checkNotNullParameter(it, "it");
                SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(it);
                boolean z10 = false;
                if (outerSemantics != null && (semanticsConfigurationCollapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) != null && semanticsConfigurationCollapsedSemanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }) : null;
        if (layoutNodeFindClosestParentNode == null) {
            layoutNodeFindClosestParentNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull LayoutNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(it) != null);
                }
            });
        }
        SemanticsModifierNode outerSemantics = layoutNodeFindClosestParentNode != null ? SemanticsNodeKt.getOuterSemantics(layoutNodeFindClosestParentNode) : null;
        if (outerSemantics == null) {
            return null;
        }
        return new SemanticsNode(outerSemantics, this.mergingEnabled, null, 4, null);
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m3358getPositionInRootF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.INSTANCE.m1387getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m3359getPositionInWindowF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInWindow(nodeCoordinatorFindCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.INSTANCE.m1387getZeroF1C5BW0();
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, true);
    }

    @Nullable
    public final RootForTest getRoot() {
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            return owner.getRootForTest();
        }
        return null;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3360getSizeYbymL2g() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        return nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null ? nodeCoordinatorFindCoordinatorToGetBounds$ui_release.mo3015getSizeYbymL2g() : IntSize.INSTANCE.m4116getZeroYbymL2g();
    }

    @NotNull
    public final Rect getTouchBoundsInRoot() {
        SemanticsModifierNode outerMergingSemantics;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode)) == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(outerMergingSemantics);
    }

    @NotNull
    /* JADX INFO: renamed from: getUnmergedConfig$ui_release, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: isFake$ui_release, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final void setFake$ui_release(boolean z10) {
        this.isFake = z10;
    }

    @NotNull
    public final List<SemanticsNode> unmergedChildren$ui_release(boolean includeFakeNodes) {
        if (this.isFake) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List listFindOneLayerOfSemanticsWrappers$default = SemanticsNodeKt.findOneLayerOfSemanticsWrappers$default(this.layoutNode, null, 1, null);
        int size = listFindOneLayerOfSemanticsWrappers$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new SemanticsNode((SemanticsModifierNode) listFindOneLayerOfSemanticsWrappers$default.get(i10), this.mergingEnabled, null, 4, null));
        }
        if (includeFakeNodes) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final List<SemanticsNode> getChildren(boolean includeReplacedSemantics, boolean includeFakeNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return CollectionsKt.emptyList();
        }
        if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, 1, null);
        }
        return unmergedChildren$ui_release(includeFakeNodes);
    }

    public /* synthetic */ SemanticsNode(SemanticsModifierNode semanticsModifierNode, boolean z10, LayoutNode layoutNode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(semanticsModifierNode, z10, (i10 & 4) != 0 ? DelegatableNodeKt.requireLayoutNode(semanticsModifierNode) : layoutNode);
    }
}
