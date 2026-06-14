package androidx.compose.ui.draw;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "drawBehind", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "onBuildDrawCache", "drawWithCache", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawWithContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DrawModifierKt {
    @NotNull
    public static final Modifier drawBehind(@NotNull Modifier modifier, @NotNull Function1<? super DrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        return modifier.then(new DrawBehindElement(onDraw));
    }

    @NotNull
    public static final Modifier drawWithCache(@NotNull Modifier modifier, @NotNull final Function1<? super CacheDrawScope, DrawResult> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.draw.DrawModifierKt$drawWithCache$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("drawWithCache");
                inspectorInfo.getProperties().set("onBuildDrawCache", onBuildDrawCache);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.draw.DrawModifierKt.drawWithCache.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                composer.startReplaceableGroup(-1689569019);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1689569019, i10, -1, "androidx.compose.ui.draw.drawWithCache.<anonymous> (DrawModifier.kt:140)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CacheDrawScope();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = composed.then(new DrawContentCacheModifier((CacheDrawScope) objRememberedValue, onBuildDrawCache));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    @NotNull
    public static final Modifier drawWithContent(@NotNull Modifier modifier, @NotNull Function1<? super ContentDrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        return modifier.then(new DrawWithContentElement(onDraw));
    }
}
