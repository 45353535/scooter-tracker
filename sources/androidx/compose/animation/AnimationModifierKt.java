package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aB\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animationSpec", "Lkotlin/Function2;", "", "finishedListener", "animateContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimationModifierKt {
    @NotNull
    public static final Modifier animateContentSize(@NotNull Modifier modifier, @NotNull final FiniteAnimationSpec<IntSize> animationSpec, @Nullable final Function2<? super IntSize, ? super IntSize, Unit> function2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("animateContentSize");
                inspectorInfo.getProperties().set("animationSpec", animationSpec);
                inspectorInfo.getProperties().set("finishedListener", function2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.AnimationModifierKt.animateContentSize.2
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
                composer.startReplaceableGroup(-843180607);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-843180607, i10, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
                }
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                FiniteAnimationSpec<IntSize> finiteAnimationSpec = animationSpec;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(coroutineScope);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SizeAnimationModifier(finiteAnimationSpec, coroutineScope);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) objRememberedValue2;
                sizeAnimationModifier.setListener(function2);
                Modifier modifierThen = ClipKt.clipToBounds(composed).then(sizeAnimationModifier);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, function2);
    }
}
