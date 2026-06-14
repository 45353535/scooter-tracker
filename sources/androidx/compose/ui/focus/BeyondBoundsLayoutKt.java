package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "block", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "searchBeyondBounds", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BeyondBoundsLayoutKt {
    @ExperimentalComposeUiApi
    @Nullable
    /* JADX INFO: renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m1291searchBeyondBoundsOMvw8(@NotNull FocusTargetModifierNode searchBeyondBounds, int i10, @NotNull Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        int iM2997getBeforehoxUOeE;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent$ui_release = searchBeyondBounds.getBeyondBoundsLayoutParent$ui_release();
        if (beyondBoundsLayoutParent$ui_release == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
            iM2997getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m2995getAbovehoxUOeE();
        } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
            iM2997getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m2998getBelowhoxUOeE();
        } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            iM2997getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m2999getLefthoxUOeE();
        } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
            iM2997getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3000getRighthoxUOeE();
        } else if (FocusDirection.m1295equalsimpl0(i10, companion.m1308getNextdhqQ8s())) {
            iM2997getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m2996getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m1295equalsimpl0(i10, companion.m1310getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iM2997getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m2997getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent$ui_release.mo617layouto7g1Pn8(iM2997getBeforehoxUOeE, block);
    }
}
