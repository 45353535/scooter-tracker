package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"bringIntoViewResponder", "Landroidx/compose/ui/Modifier;", "responder", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "completelyOverlaps", "", "Landroidx/compose/ui/geometry/Rect;", "other", "localRectOf", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "rect", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BringIntoViewResponderKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier bringIntoViewResponder(@NotNull Modifier modifier, @NotNull final BringIntoViewResponder responder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(responder, "responder");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderKt$bringIntoViewResponder$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("bringIntoViewResponder");
                inspectorInfo.getProperties().set("responder", responder);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderKt.bringIntoViewResponder.2
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
                composer.startReplaceableGroup(-852052847);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-852052847, i10, -1, "androidx.compose.foundation.relocation.bringIntoViewResponder.<anonymous> (BringIntoViewResponder.kt:104)");
                }
                BringIntoViewParent bringIntoViewParentRememberDefaultBringIntoViewParent = BringIntoViewResponder_androidKt.rememberDefaultBringIntoViewParent(composer, 0);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(bringIntoViewParentRememberDefaultBringIntoViewParent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new BringIntoViewResponderModifier(bringIntoViewParentRememberDefaultBringIntoViewParent);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                BringIntoViewResponderModifier bringIntoViewResponderModifier = (BringIntoViewResponderModifier) objRememberedValue;
                bringIntoViewResponderModifier.setResponder(responder);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return bringIntoViewResponderModifier;
            }
        });
    }

    private static final boolean completelyOverlaps(Rect rect, Rect rect2) {
        return rect.getLeft() <= rect2.getLeft() && rect.getTop() <= rect2.getTop() && rect.getRight() >= rect2.getRight() && rect.getBottom() >= rect2.getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect localRectOf(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, Rect rect) {
        return rect.m1408translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m1406getTopLeftF1C5BW0());
    }
}
