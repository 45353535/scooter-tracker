package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001av\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001al\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0013\u001a>\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u00142 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0087\u0004¢\u0006\u0004\b\u001f\u0010 \u001a\u0086\u0001\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00042\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {ExifInterface.LATITUDE_SOUTH, "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/ContentTransform;", "transitionSpec", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "label", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "content", "AnimatedContent", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "", "clip", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "Landroidx/compose/animation/SizeTransform;", "SizeTransform", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/animation/SizeTransform;", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "exit", "with", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/core/Transition;", "", "contentKey", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(final S r17, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r18, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r19, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment r20, @org.jetbrains.annotations.Nullable java.lang.String r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalAnimationApi
    @NotNull
    public static final SizeTransform SizeTransform(boolean z10, @NotNull Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        return new SizeTransformImpl(z10, sizeAnimationSpec);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt.SizeTransform.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m29invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m29invokeTemP2vQ(long j10, long j11) {
                    return AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m4103boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
                }
            };
        }
        return SizeTransform(z10, function2);
    }

    @ExperimentalAnimationApi
    @NotNull
    public static final ContentTransform with(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    @Composable
    @ExperimentalAnimationApi
    public static final /* synthetic */ void AnimatedContent(final Object obj, Modifier modifier, Function1 function1, Alignment alignment, final Function4 content, Composer composer, final int i10, final int i11) {
        int i12;
        final Alignment alignment2;
        final Function1 function12;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2124549995);
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
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(function1) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(alignment) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(content) ? 16384 : 8192;
        }
        if ((46811 & i12) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function12 = function1;
            alignment2 = alignment;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Function1 function13 = i14 != 0 ? new Function1() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final ContentTransform invoke(@NotNull AnimatedContentScope animatedContentScope) {
                    Intrinsics.checkNotNullParameter(animatedContentScope, "$this$null");
                    return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m62scaleInL8ZKhE$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                }
            } : function1;
            Alignment topStart = i15 != 0 ? Alignment.INSTANCE.getTopStart() : alignment;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2124549995, i12, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:148)");
            }
            int i16 = (i12 & 8) | 24576 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752);
            Modifier modifier3 = modifier;
            AnimatedContent(obj, modifier3, (Function1<? super AnimatedContentScope<Object>, ContentTransform>) function13, topStart, "AnimatedContent", (Function4<? super AnimatedVisibilityScope, ? super Object, ? super Composer, ? super Integer, Unit>) content, composerStartRestartGroup, i16, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            alignment2 = topStart;
            function12 = function13;
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i17) {
                AnimatedContentKt.AnimatedContent(obj, modifier2, function12, alignment2, content, composer2, i10 | 1, i11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0254 A[LOOP:2: B:138:0x0252->B:139:0x0254, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<S> r19, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r20, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r21, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment r22, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r23, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }
}
