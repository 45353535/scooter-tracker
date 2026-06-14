package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f57321a = ColorKt.Color$default(71, 118, 238, 0, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f57322b = Color.INSTANCE.m1641getWhite0d7_KjU();

    public static final class a implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f57323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f57324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f57325d;

        public a(String str, Integer num, long j10) {
            this.f57323b = str;
            this.f57324c = num;
            this.f57325d = j10;
        }

        public final void a(RowScope Button, Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-469621531, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton.<anonymous> (DEC.kt:232)");
            }
            String str = this.f57323b;
            if (str == null) {
                str = "";
            }
            Integer num = this.f57324c;
            TextUnit textUnitM4122boximpl = num != null ? TextUnit.m4122boximpl(TextUnitKt.getSp(num.intValue())) : null;
            composer.startReplaceableGroup(-1245054604);
            long jM3524getFontSizeXSAIIZE = textUnitM4122boximpl == null ? MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getButton().m3524getFontSizeXSAIIZE() : textUnitM4122boximpl.getPackedValue();
            composer.endReplaceableGroup();
            TextKt.m1192TextfLXpl1I(str, null, this.f57325d, jM3524getFontSizeXSAIIZE, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m3905getEllipsisgIe3tQ8(), false, 1, null, null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.f93236a;
        }
    }

    public static final float a(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final Unit b(Modifier modifier, String str, Function0 function0, s0 s0Var, int i10, int i11, Composer composer, int i12) {
        d(modifier, str, function0, s0Var, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final Unit c(String str, Function0 function0, Integer num, Integer num2, List list, boolean z10, long j10, long j11, int i10, boolean z11, int i11, int i12, Composer composer, int i13) {
        e(str, function0, num, num2, list, z10, j10, j11, i10, z11, composer, i11 | 1, i12);
        return Unit.f93236a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0600  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.Modifier r44, final java.lang.String r45, final kotlin.jvm.functions.Function0 r46, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0 r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 1566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.d(androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(final String str, final Function0 onClick, final Integer num, final Integer num2, final List list, final boolean z10, final long j10, final long j11, final int i10, boolean z11, Composer composer, final int i11, final int i12) {
        int i13;
        int i14;
        long j12;
        int i15;
        Composer composer2;
        State stateAnimateFloat;
        List listListOf;
        Modifier modifierM463sizeVpY3zN4;
        Composer composer3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1721864917);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = i11 | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i16 = i13;
        if ((i12 & 4) != 0) {
            i16 |= 384;
        } else if ((i11 & 384) == 0) {
            i16 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i16 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i16 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i16 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i16 |= composerStartRestartGroup.changed(list) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i11 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i16 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((i12 & 64) != 0) {
            i16 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i16 |= composerStartRestartGroup.changed(j10) ? 1048576 : 524288;
        }
        if ((128 & i12) != 0) {
            i14 = i16 | 12582912;
            i15 = 256;
            j12 = j11;
        } else {
            i14 = i16;
            j12 = j11;
            if ((i11 & 12582912) == 0) {
                i14 |= composerStartRestartGroup.changed(j12) ? 8388608 : 4194304;
            }
            i15 = 256;
        }
        if ((i15 & i12) != 0) {
            i14 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            i14 |= composerStartRestartGroup.changed(i10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i17 = i12 & 512;
        if (i17 != 0) {
            i14 |= C.ENCODING_PCM_32BIT;
        } else if ((i11 & C.ENCODING_PCM_32BIT) == 0) {
            i14 |= composerStartRestartGroup.changed(z11) ? 536870912 : 268435456;
        }
        if ((i14 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            boolean z12 = i17 != 0 ? false : z11;
            if (ComposerKt.isTraceInProgress()) {
                z11 = z12;
                ComposerKt.traceEventStart(1721864917, i14, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton (DEC.kt:178)");
            } else {
                z11 = z12;
            }
            if (z11) {
                composerStartRestartGroup.startReplaceableGroup(-1672214241);
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0), 0.0f, 360.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                composer2 = composerStartRestartGroup;
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1671861771);
                composer2.startReplaceableGroup(2024280284);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                stateAnimateFloat = (MutableState) objRememberedValue;
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            double radians = Math.toRadians(a(stateAnimateFloat));
            Composer composer4 = composer2;
            long jOffset = OffsetKt.Offset(((float) Math.cos(radians)) * 300.0f, ((float) Math.sin(radians)) * 300.0f);
            double d10 = radians + 3.141592653589793d;
            long jOffset2 = OffsetKt.Offset(((float) Math.cos(d10)) * 300.0f, ((float) Math.sin(d10)) * 300.0f);
            if (list == null || list.isEmpty()) {
                long j13 = f57321a;
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1594boximpl(j13), Color.m1594boximpl(j13)});
            } else {
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1594boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.first(list)))), Color.m1594boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.last(list))))});
            }
            Brush brushM1561linearGradientmHitzGk$default = Brush.Companion.m1561linearGradientmHitzGk$default(Brush.INSTANCE, listListOf, jOffset, jOffset2, 0, 8, (Object) null);
            RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
            ButtonColors buttonColorsM927buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m927buttonColorsro_MJ88(j12, j10, 0L, 0L, composer4, ((i14 >> 21) & 14) | ((i14 >> 15) & 112) | (ButtonDefaults.$stable << 12), 12);
            BorderStroke borderStroke = z10 ? new BorderStroke(Dp.m3951constructorimpl(i10), brushM1561linearGradientmHitzGk$default, null) : null;
            if (num == null || (modifierM463sizeVpY3zN4 = SizeKt.m463sizeVpY3zN4(Modifier.INSTANCE, Dp.m3951constructorimpl(num.intValue()), Dp.m3951constructorimpl(num.intValue() * 0.33f))) == null) {
                modifierM463sizeVpY3zN4 = Modifier.INSTANCE;
            }
            ButtonKt.Button(onClick, modifierM463sizeVpY3zN4, false, null, null, circleShape, borderStroke, buttonColorsM927buttonColorsro_MJ88, null, ComposableLambdaKt.composableLambda(composer4, -469621531, true, new a(str, num2, j10)), composer4, ((i14 >> 3) & 14) | C.ENCODING_PCM_32BIT, 284);
            composer3 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final boolean z13 = z11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.c(str, onClick, num, num2, list, z10, j10, j11, i10, z13, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
