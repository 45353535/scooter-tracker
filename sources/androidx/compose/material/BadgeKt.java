package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001aK\u0010\b\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001aP\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015\"\u0017\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001d\u0010\u001b\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u001d\u0010\u001d\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u001d\u0010\u001f\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", "content", "BadgedBox", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/RowScope;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Badge", "Landroidx/compose/ui/unit/Dp;", "BadgeRadius", "F", "getBadgeRadius", "()F", "BadgeWithContentRadius", "getBadgeWithContentRadius", "Landroidx/compose/ui/unit/TextUnit;", "BadgeContentFontSize", "J", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeHorizontalOffset", "getBadgeHorizontalOffset", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BadgeKt {
    private static final float BadgeHorizontalOffset;
    private static final float BadgeRadius;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentRadius = Dp.m3951constructorimpl(8);
    private static final long BadgeContentFontSize = TextUnitKt.getSp(10);
    private static final float BadgeWithContentHorizontalOffset = Dp.m3951constructorimpl(-Dp.m3951constructorimpl(6));

    static {
        float f10 = 4;
        BadgeRadius = Dp.m3951constructorimpl(f10);
        BadgeWithContentHorizontalPadding = Dp.m3951constructorimpl(f10);
        BadgeHorizontalOffset = Dp.m3951constructorimpl(-Dp.m3951constructorimpl(f10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m908BadgeeopBjH0(@Nullable Modifier modifier, long j10, long j11, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        final int i12;
        long jM956getError0d7_KjU;
        long jM980contentColorForek8zF_U;
        int i13;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133484502);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                jM956getError0d7_KjU = j10;
                int i15 = composerStartRestartGroup.changed(jM956getError0d7_KjU) ? 32 : 16;
                i12 |= i15;
            } else {
                jM956getError0d7_KjU = j10;
            }
            i12 |= i15;
        } else {
            jM956getError0d7_KjU = j10;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM980contentColorForek8zF_U = j11;
                int i16 = composerStartRestartGroup.changed(jM980contentColorForek8zF_U) ? 256 : 128;
                i12 |= i16;
            } else {
                jM980contentColorForek8zF_U = j11;
            }
            i12 |= i16;
        } else {
            jM980contentColorForek8zF_U = j11;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
            function32 = function3;
            i13 = 0;
        } else {
            i13 = 0;
            if ((i10 & 7168) == 0) {
                function32 = function3;
                i12 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
            } else {
                function32 = function3;
            }
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 2) != 0) {
                    jM956getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m956getError0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM980contentColorForek8zF_U = ColorsKt.m980contentColorForek8zF_U(jM956getError0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    function32 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133484502, i12, -1, "androidx.compose.material.Badge (Badge.kt:129)");
            }
            float f10 = function32 != null ? BadgeWithContentRadius : BadgeRadius;
            RoundedCornerShape roundedCornerShapeM690RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m690RoundedCornerShape0680j_4(f10);
            float f11 = f10 * 2;
            Modifier modifierM420paddingVpY3zN4$default = PaddingKt.m420paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m169backgroundbw27NRU(SizeKt.m445defaultMinSizeVpY3zN4(modifier2, Dp.m3951constructorimpl(f11), Dp.m3951constructorimpl(f11)), jM956getError0d7_KjU, roundedCornerShapeM690RoundedCornerShape0680j_4), roundedCornerShapeM690RoundedCornerShape0680j_4), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM420paddingVpY3zN4$default);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i13));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(521574215);
            if (function32 != null) {
                ProvidedValue[] providedValueArr = new ProvidedValue[1];
                providedValueArr[i13] = ContentColorKt.getLocalContentColor().provides(Color.m1594boximpl(jM980contentColorForek8zF_U));
                final int i18 = 6;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i19) {
                        if ((i19 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1784526485, i19, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
                        }
                        TextStyle textStyleM3511copyCXVQc50$default = TextStyle.m3511copyCXVQc50$default(MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton(), 0L, BadgeKt.BadgeContentFontSize, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194301, null);
                        final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                        final RowScope rowScope = rowScopeInstance;
                        final int i20 = i18;
                        final int i21 = i12;
                        TextKt.ProvideTextStyle(textStyleM3511copyCXVQc50$default, ComposableLambdaKt.composableLambda(composer2, 915155142, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.f93236a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i22) {
                                if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(915155142, i22, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:160)");
                                }
                                function33.invoke(rowScope, composer3, Integer.valueOf((i20 & 14) | ((i21 >> 6) & 112)));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 56);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function32;
        final Modifier modifier3 = modifier2;
        final long j12 = jM956getError0d7_KjU;
        final long j13 = jM980contentColorForek8zF_U;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
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

            public final void invoke(@Nullable Composer composer2, int i19) {
                BadgeKt.m908BadgeeopBjH0(modifier3, j12, j13, function33, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BadgedBox(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r20, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BadgeKt.BadgedBox(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getBadgeHorizontalOffset() {
        return BadgeHorizontalOffset;
    }

    public static final float getBadgeRadius() {
        return BadgeRadius;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentRadius() {
        return BadgeWithContentRadius;
    }
}
