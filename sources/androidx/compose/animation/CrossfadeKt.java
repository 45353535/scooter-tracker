package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aZ\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001aj\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "", "label", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "content", "Crossfade", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "", "contentKey", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CrossfadeKt {
    @Composable
    public static final <T> void Crossfade(final T t10, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @Nullable String str, @NotNull final Function3<? super T, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        final FiniteAnimationSpec<Float> finiteAnimationSpec2;
        final String str2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-310686752);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(t10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 128;
        }
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i12 |= composerStartRestartGroup.changed(content) ? 16384 : 8192;
        }
        if (i14 == 4 && (46811 & i12) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            finiteAnimationSpec2 = finiteAnimationSpec;
            str2 = str;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            FiniteAnimationSpec<Float> finiteAnimationSpecTween$default = i14 != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec;
            String str3 = i15 != 0 ? "Crossfade" : str;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            Transition transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(t10, str3, composerStartRestartGroup, (i12 & 14) | ((i12 >> 6) & 112), 0);
            int i16 = (i12 & 112) | 512 | (i12 & 57344);
            FiniteAnimationSpec<Float> finiteAnimationSpec3 = finiteAnimationSpecTween$default;
            Modifier modifier3 = modifier;
            Crossfade(transitionUpdateTransition, modifier3, finiteAnimationSpec3, (Function1) null, content, composerStartRestartGroup, i16, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            finiteAnimationSpec2 = finiteAnimationSpec3;
            str2 = str3;
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.1
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

            public final void invoke(@Nullable Composer composer2, int i17) {
                CrossfadeKt.Crossfade(t10, modifier2, finiteAnimationSpec2, str2, content, composer2, i10 | 1, i11);
            }
        });
    }

    @Composable
    public static final /* synthetic */ void Crossfade(final Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 content, Composer composer, final int i10, final int i11) {
        int i12;
        final Function3 function3;
        final Modifier modifier2;
        final FiniteAnimationSpec finiteAnimationSpec2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(523603005);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(content) ? 2048 : 1024;
        }
        if (i14 == 4 && (i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function3 = content;
            finiteAnimationSpec2 = finiteAnimationSpec;
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i14 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            FiniteAnimationSpec finiteAnimationSpec3 = finiteAnimationSpec;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, composerStartRestartGroup, i12 & 14, 2), modifier3, (FiniteAnimationSpec<Float>) finiteAnimationSpec3, (Function1) null, content, composerStartRestartGroup, (i12 & 112) | 512 | ((i12 << 3) & 57344), 4);
            function3 = content;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpec3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i15) {
                CrossfadeKt.Crossfade(obj, modifier2, finiteAnimationSpec2, function3, composer2, i10 | 1, i11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void Crossfade(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<T> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, @org.jetbrains.annotations.Nullable androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r18, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
