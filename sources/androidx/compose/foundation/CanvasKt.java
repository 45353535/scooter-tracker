package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "Canvas", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "contentDescription", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CanvasKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Canvas(@NotNull final Modifier modifier, @NotNull final Function1<? super DrawScope, Unit> onDraw, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        Composer composerStartRestartGroup = composer.startRestartGroup(-932836462);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onDraw) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-932836462, i10, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            SpacerKt.Spacer(DrawModifierKt.drawBehind(modifier, onDraw), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.CanvasKt.Canvas.1
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
                CanvasKt.Canvas(modifier, onDraw, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalFoundationApi
    public static final void Canvas(@NotNull final Modifier modifier, @NotNull final String contentDescription, @NotNull final Function1<? super DrawScope, Unit> onDraw, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162737955);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(contentDescription) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onDraw) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162737955, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:63)");
            }
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifier, onDraw);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(contentDescription);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.CanvasKt$Canvas$2$1
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
                        SemanticsPropertiesKt.setContentDescription(semantics, contentDescription);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SemanticsModifierKt.semantics$default(modifierDrawBehind, false, (Function1) objRememberedValue, 1, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.CanvasKt.Canvas.3
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
                CanvasKt.Canvas(modifier, contentDescription, onDraw, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }
}
