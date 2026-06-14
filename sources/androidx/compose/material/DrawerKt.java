package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0091\u0001\u0010 \u001a\u00020\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0091\u0001\u0010#\u001a\u00020\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a'\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\u0006\u0010,\u001a\u00020\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001aA\u00105\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\f\u00102\u001a\b\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010*\u001a\u00020\u0018H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u0017\u00106\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107\"\u0017\u00108\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u00107\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020$098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010<\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, d2 = {"Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "Landroidx/compose/material/BottomDrawerState;", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalDrawer", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "", "a", "b", POBCTAOverlayData.KEY_CTA_POS, "calculateFraction", "(FFF)F", "color", "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "BottomDrawerScrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "Scrim", "EndDrawerPadding", "F", "DrawerVelocityThreshold", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomDrawerOpenFraction", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float EndDrawerPadding = Dp.m3951constructorimpl(56);
    private static final float DrawerVelocityThreshold = Dp.m3951constructorimpl(400);

    @NotNull
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1003BottomDrawerGs3lGvM(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r27, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomDrawerState r28, boolean r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r30, float r31, long r32, long r34, long r36, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1003BottomDrawerGs3lGvM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m1004BottomDrawerScrim3JVO9M(final long j10, final Function0<Unit> function0, final boolean z10, Composer composer, final int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(-513067266);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513067266, i11, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:642)");
            }
            if (j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
                final State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 48, 12);
                final String strM1122getString4foXLRw = Strings_androidKt.m1122getString4foXLRw(Strings.INSTANCE.m1115getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1298948652);
                if (z10) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    boolean zChanged2 = composerStartRestartGroup.changed(strM1122getString4foXLRw) | composerStartRestartGroup.changed(function0);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
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
                                SemanticsPropertiesKt.setContentDescription(semantics, strM1122getString4foXLRw);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                } else {
                    modifierSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                Color colorM1594boximpl = Color.m1594boximpl(j10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged3 = composerStartRestartGroup.changed(colorM1594boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            b.K(Canvas, j10, 0L, 0L, DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$2(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                DrawerKt.m1004BottomDrawerScrim3JVO9M(j10, function0, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomDrawerScrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1005ModalDrawerGs3lGvM(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.material.DrawerState r27, boolean r28, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r29, float r30, long r31, long r33, long r35, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1005ModalDrawerGs3lGvM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m1006ScrimBx497Mc(final boolean z10, final Function0<Unit> function0, final Function0<Float> function02, final long j10, Composer composer, final int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1983403750);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:677)");
            }
            final String strM1122getString4foXLRw = Strings_androidKt.m1122getString4foXLRw(Strings.INSTANCE.m1115getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1010554804);
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(function0);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(strM1122getString4foXLRw) | composerStartRestartGroup.changed(function0);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
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
                            SemanticsPropertiesKt.setContentDescription(semantics, strM1122getString4foXLRw);
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
            } else {
                modifierSemantics = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            Color colorM1594boximpl = Color.m1594boximpl(j10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged3 = composerStartRestartGroup.changed(colorM1594boximpl) | composerStartRestartGroup.changed(function02);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        b.K(Canvas, j10, 0L, 0L, function02.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                DrawerKt.m1006ScrimBx497Mc(z10, function0, function02, j10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f10, float f11, float f12) {
        return g.m((f12 - f10) / (f11 - f10), 0.0f, 1.0f);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState rememberBottomDrawerState(@NotNull final BottomDrawerValue initialValue, @Nullable final Function1<? super BottomDrawerValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-598115156);
        if ((i11 & 2) != 0) {
            function1 = new Function1<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt.rememberBottomDrawerState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BottomDrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-598115156, i10, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:345)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.Companion.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(initialValue) | composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<BottomDrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final BottomDrawerState invoke() {
                    return new BottomDrawerState(initialValue, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m1261rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull final DrawerValue initialValue, @Nullable final Function1<? super DrawerValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1435874229);
        if ((i11 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt.rememberDrawerState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i10, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:328)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(initialValue) | composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final DrawerState invoke() {
                    return new DrawerState(initialValue, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m1261rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }
}
