package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\f\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0013H\u0003\u001a\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019H\u0003\u001a1\u0010\u001a\u001a\u0004\u0018\u00010\u0013*\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010\u001e\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a=\u0010#\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a=\u0010'\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010&\u001a\f\u0010)\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a7\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "activeNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "bottomRight", "collectAccessibleChildren", "", "Landroidx/compose/ui/node/DelegatableNode;", "accessibleChildren", "Landroidx/compose/runtime/collection/MutableVector;", "findBestCandidate", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "findChildCorrespondingToFocusEnter", "onFound", "Lkotlin/Function1;", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "searchChildren", "searchChildren-4C6V_qg", "topLeft", "twoDimensionalFocusSearch", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TwoDimensionalFocusSearchKt {

    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";

    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
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

    @ExperimentalComposeUiApi
    private static final FocusTargetModifierNode activeNode(FocusTargetModifierNode focusTargetModifierNode) {
        if (focusTargetModifierNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Check failed.");
        }
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetModifierNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            return focusTargetModifierNodeFindActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild);
    }

    /* JADX INFO: renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m1330beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i10, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i10, rect)) {
            return false;
        }
        if (!beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i10, rect)) {
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        return FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s()) || FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance$15(rect2, i10, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i10, rect);
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            return rect2.getLeft() >= rect.getRight();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
            return rect2.getRight() <= rect.getLeft();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
            return rect2.getTop() >= rect.getBottom();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
            return rect2.getBottom() <= rect.getTop();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$15(Rect rect, int i10, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f10;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            if (FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection);
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f10 = top - bottom;
            return Math.max(0.0f, f10);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f10 = top2 - bottom2;
        return Math.max(0.0f, f10);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i10, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f10;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            if (FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection);
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f10 = bottom - bottom2;
            return Math.max(1.0f, f10);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f10 = top - top2;
        return Math.max(1.0f, f10);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    @ExperimentalComposeUiApi
    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetModifierNode> mutableVector) {
        MutableVector<FocusRequesterModifierNode> focusRequesterNodes$ui_release;
        int size;
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM3199constructorimpl) != 0 && (child2 instanceof FocusTargetModifierNode)) {
                        FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) child2;
                        if (focusTargetModifierNode.getIsAttached()) {
                            if (focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                mutableVector.add(focusTargetModifierNode);
                                break;
                            }
                            FocusRequester focusRequesterInvoke = focusTargetModifierNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m1292boximpl(FocusDirection.INSTANCE.m1304getEnterdhqQ8s()));
                            FocusRequester.Companion companion = FocusRequester.INSTANCE;
                            if (Intrinsics.areEqual(focusRequesterInvoke, companion.getDefault())) {
                                focusRequesterInvoke = null;
                            }
                            FocusRequester focusRequester = focusRequesterInvoke;
                            if (focusRequester != null) {
                                if (!Intrinsics.areEqual(focusRequester, companion.getCancel()) && (size = (focusRequesterNodes$ui_release = focusRequester.getFocusRequesterNodes$ui_release()).getSize()) > 0) {
                                    FocusRequesterModifierNode[] content = focusRequesterNodes$ui_release.getContent();
                                    int i10 = 0;
                                    do {
                                        collectAccessibleChildren(content[i10], mutableVector);
                                        i10++;
                                    } while (i10 < size);
                                }
                            }
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetModifierNode m1331findBestCandidate4WY_MpI(MutableVector<FocusTargetModifierNode> mutableVector, Rect rect, int i10) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            rectTranslate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
            rectTranslate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            rectTranslate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (size > 0) {
            FocusTargetModifierNode[] content = mutableVector.getContent();
            int i11 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = content[i11];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2)) {
                    Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetModifierNode2);
                    if (m1334isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i10)) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        rectTranslate = rectFocusRect;
                    }
                }
                i11++;
            } while (i11 < size);
        }
        return focusTargetModifierNode;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m1332findChildCorrespondingToFocusEnterOMvw8(@NotNull FocusTargetModifierNode findChildCorrespondingToFocusEnter, int i10, @NotNull Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Rect rectBottomRight;
        Intrinsics.checkNotNullParameter(findChildCorrespondingToFocusEnter, "$this$findChildCorrespondingToFocusEnter");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusRequester focusRequesterInvoke = findChildCorrespondingToFocusEnter.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m1292boximpl(i10));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (Intrinsics.areEqual(focusRequesterInvoke, companion.getDefault())) {
            focusRequesterInvoke = null;
        }
        FocusRequester focusRequester = focusRequesterInvoke;
        if (focusRequester != null) {
            if (Intrinsics.areEqual(focusRequester, companion.getCancel())) {
                return false;
            }
            return focusRequester.findFocusTarget$ui_release(onFound);
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        collectAccessibleChildren(findChildCorrespondingToFocusEnter, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) (mutableVector.isEmpty() ? null : mutableVector.getContent()[0]);
            if (focusTargetModifierNode != null) {
                return onFound.invoke(focusTargetModifierNode).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion2 = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion2.m1304getEnterdhqQ8s())) {
            i10 = companion2.m1311getRightdhqQ8s();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion2.m1311getRightdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion2.m1303getDowndhqQ8s())) {
            rectBottomRight = topLeft(FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter));
        } else {
            if (!(FocusDirection.m1295equalsimpl0(i10, companion2.m1307getLeftdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion2.m1312getUpdhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            rectBottomRight = bottomRight(FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter));
        }
        FocusTargetModifierNode focusTargetModifierNodeM1331findBestCandidate4WY_MpI = m1331findBestCandidate4WY_MpI(mutableVector, rectBottomRight, i10);
        if (focusTargetModifierNodeM1331findBestCandidate4WY_MpI != null) {
            return onFound.invoke(focusTargetModifierNodeM1331findBestCandidate4WY_MpI).booleanValue();
        }
        return false;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1333generateAndSearchChildren4C6V_qg(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i10, final Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m1335searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1291searchBeyondBoundsOMvw8(focusTargetModifierNode, i10, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Boolean invoke(@NotNull BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds) {
                Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
                boolean zM1335searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m1335searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i10, function1);
                Boolean boolValueOf = Boolean.valueOf(zM1335searchChildren4C6V_qg);
                if (zM1335searchChildren4C6V_qg || !searchBeyondBounds.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m1334isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i10, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i10, rect3) && !m1330beamBeatsI7lrPNg(rect3, rect, rect2, i10)) {
            return !m1330beamBeatsI7lrPNg(rect3, rect2, rect, i10) && isBetterCandidate_I7lrPNg$weightedDistance(i10, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i10, rect3, rect2);
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i10, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f10;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            if (FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection);
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f10 = top - bottom;
            return Math.max(0.0f, f10);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f10 = top2 - bottom2;
        return Math.max(0.0f, f10);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i10, Rect rect2) {
        float f10;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
            f10 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f10);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            f10 = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f10);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f10));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i10, Rect rect, Rect rect2) {
        long jAbs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i10, rect));
        long jAbs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i10, rect));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m1335searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i10, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        FocusTargetModifierNode focusTargetModifierNodeM1331findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM3199constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM3199constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        while (mutableVector.isNotEmpty() && (focusTargetModifierNodeM1331findBestCandidate4WY_MpI = m1331findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetModifierNode2), i10)) != null) {
            if (focusTargetModifierNodeM1331findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetModifierNodeM1331findBestCandidate4WY_MpI).booleanValue();
            }
            FocusRequester focusRequesterInvoke = focusTargetModifierNodeM1331findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m1292boximpl(i10));
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (Intrinsics.areEqual(focusRequesterInvoke, companion.getDefault())) {
                focusRequesterInvoke = null;
            }
            FocusRequester focusRequester = focusRequesterInvoke;
            if (focusRequester != null) {
                if (Intrinsics.areEqual(focusRequester, companion.getCancel())) {
                    return false;
                }
                return focusRequester.findFocusTarget$ui_release(function1);
            }
            if (m1333generateAndSearchChildren4C6V_qg(focusTargetModifierNodeM1331findBestCandidate4WY_MpI, focusTargetModifierNode2, i10, function1)) {
                return true;
            }
            mutableVector.remove(focusTargetModifierNodeM1331findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @ExperimentalComposeUiApi
    @Nullable
    /* JADX INFO: renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final Boolean m1336twoDimensionalFocusSearchOMvw8(@NotNull FocusTargetModifierNode twoDimensionalFocusSearch, int i10, @NotNull Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusStateImpl focusStateImpl = twoDimensionalFocusSearch.getFocusStateImpl();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[focusStateImpl.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(m1332findChildCorrespondingToFocusEnterOMvw8(twoDimensionalFocusSearch, i10, onFound));
            }
            if (i11 == 4) {
                return twoDimensionalFocusSearch.fetchFocusProperties$ui_release().getCanFocus() ? onFound.invoke(twoDimensionalFocusSearch) : Boolean.FALSE;
            }
            throw new m();
        }
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(twoDimensionalFocusSearch);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild);
        }
        int i12 = iArr[activeChild.getFocusStateImpl().ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(m1333generateAndSearchChildren4C6V_qg(twoDimensionalFocusSearch, activeChild, i10, onFound));
            }
            if (i12 != 4) {
                throw new m();
            }
            throw new IllegalStateException(NoActiveChild);
        }
        Boolean boolM1336twoDimensionalFocusSearchOMvw8 = m1336twoDimensionalFocusSearchOMvw8(activeChild, i10, onFound);
        if (!Intrinsics.areEqual(boolM1336twoDimensionalFocusSearchOMvw8, Boolean.FALSE)) {
            return boolM1336twoDimensionalFocusSearchOMvw8;
        }
        FocusRequester focusRequesterInvoke = activeChild.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m1292boximpl(i10));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (Intrinsics.areEqual(focusRequesterInvoke, companion.getDefault())) {
            focusRequesterInvoke = null;
        }
        FocusRequester focusRequester = focusRequesterInvoke;
        if (focusRequester == null) {
            return Boolean.valueOf(m1333generateAndSearchChildren4C6V_qg(twoDimensionalFocusSearch, activeNode(activeChild), i10, onFound));
        }
        if (Intrinsics.areEqual(focusRequester, companion.getCancel())) {
            return null;
        }
        return Boolean.valueOf(focusRequester.findFocusTarget$ui_release(onFound));
    }
}
