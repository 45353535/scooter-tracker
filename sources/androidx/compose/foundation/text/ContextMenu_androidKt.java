package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"ContextMenuArea", "", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContextMenu_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ContextMenuArea(@NotNull final TextFieldSelectionManager manager, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i10 & 112) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(content) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:23)");
            }
            content.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.1
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                ContextMenu_androidKt.ContextMenuArea(manager, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ContextMenuArea(@NotNull final SelectionManager manager, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(605522716);
        if ((i10 & 112) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(content) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:31)");
            }
            content.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.2
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                ContextMenu_androidKt.ContextMenuArea(manager, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }
}
