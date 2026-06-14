package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.appodeal.ads.Appodeal;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.impl.H2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u008b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001f\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", "primary", "primaryVariant", C4240b4.i.Y, "secondaryVariant", H2.f75840g, "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorsKt {

    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Colors invoke() {
            return ColorsKt.m984lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, Appodeal.ALL, null);
        }
    });

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m979contentColorFor4WTKRHQ(@NotNull Colors contentColorFor, long j10) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        return Color.m1605equalsimpl0(j10, contentColorFor.m962getPrimary0d7_KjU()) ? contentColorFor.m959getOnPrimary0d7_KjU() : Color.m1605equalsimpl0(j10, contentColorFor.m963getPrimaryVariant0d7_KjU()) ? contentColorFor.m959getOnPrimary0d7_KjU() : Color.m1605equalsimpl0(j10, contentColorFor.m964getSecondary0d7_KjU()) ? contentColorFor.m960getOnSecondary0d7_KjU() : Color.m1605equalsimpl0(j10, contentColorFor.m965getSecondaryVariant0d7_KjU()) ? contentColorFor.m960getOnSecondary0d7_KjU() : Color.m1605equalsimpl0(j10, contentColorFor.m955getBackground0d7_KjU()) ? contentColorFor.m957getOnBackground0d7_KjU() : Color.m1605equalsimpl0(j10, contentColorFor.m966getSurface0d7_KjU()) ? contentColorFor.m961getOnSurface0d7_KjU() : Color.m1605equalsimpl0(j10, contentColorFor.m956getError0d7_KjU()) ? contentColorFor.m958getOnError0d7_KjU() : Color.INSTANCE.m1640getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m980contentColorForek8zF_U(long j10, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i10, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long jM979contentColorFor4WTKRHQ = m979contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j10);
        if (jM979contentColorFor4WTKRHQ == Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
            jM979contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM979contentColorFor4WTKRHQ;
    }

    @NotNull
    /* JADX INFO: renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m981darkColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new Colors(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, false, null);
    }

    /* JADX INFO: renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m982darkColors2qZNXz8$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jColor = (i10 & 1) != 0 ? ColorKt.Color(4290479868L) : j10;
        long jColor2 = (i10 & 2) != 0 ? ColorKt.Color(4281794739L) : j11;
        long jColor3 = (i10 & 4) != 0 ? ColorKt.Color(4278442694L) : j12;
        long j22 = (i10 & 8) != 0 ? jColor3 : j13;
        long jColor4 = (i10 & 16) != 0 ? ColorKt.Color(4279374354L) : j14;
        long jColor5 = (i10 & 32) != 0 ? ColorKt.Color(4279374354L) : j15;
        long jColor6 = (i10 & 64) != 0 ? ColorKt.Color(4291782265L) : j16;
        long jM1630getBlack0d7_KjU = (i10 & 128) != 0 ? Color.INSTANCE.m1630getBlack0d7_KjU() : j17;
        long jM1630getBlack0d7_KjU2 = (i10 & 256) != 0 ? Color.INSTANCE.m1630getBlack0d7_KjU() : j18;
        long jM1641getWhite0d7_KjU = (i10 & 512) != 0 ? Color.INSTANCE.m1641getWhite0d7_KjU() : j19;
        long jM1641getWhite0d7_KjU2 = (i10 & 1024) != 0 ? Color.INSTANCE.m1641getWhite0d7_KjU() : j20;
        if ((i10 & 2048) != 0) {
            j21 = Color.INSTANCE.m1630getBlack0d7_KjU();
        }
        return m981darkColors2qZNXz8(jColor, jColor2, jColor3, j22, jColor4, jColor5, jColor6, jM1630getBlack0d7_KjU, jM1630getBlack0d7_KjU2, jM1641getWhite0d7_KjU, jM1641getWhite0d7_KjU2, j21);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        return colors.isLight() ? colors.m962getPrimary0d7_KjU() : colors.m966getSurface0d7_KjU();
    }

    @NotNull
    /* JADX INFO: renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m983lightColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new Colors(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    /* JADX INFO: renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m984lightColors2qZNXz8$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jColor = (i10 & 1) != 0 ? ColorKt.Color(4284612846L) : j10;
        long jColor2 = (i10 & 2) != 0 ? ColorKt.Color(4281794739L) : j11;
        long jColor3 = (i10 & 4) != 0 ? ColorKt.Color(4278442694L) : j12;
        long jColor4 = (i10 & 8) != 0 ? ColorKt.Color(4278290310L) : j13;
        long jM1641getWhite0d7_KjU = (i10 & 16) != 0 ? Color.INSTANCE.m1641getWhite0d7_KjU() : j14;
        long jM1641getWhite0d7_KjU2 = (i10 & 32) != 0 ? Color.INSTANCE.m1641getWhite0d7_KjU() : j15;
        long jColor5 = (i10 & 64) != 0 ? ColorKt.Color(4289724448L) : j16;
        long jM1641getWhite0d7_KjU3 = (i10 & 128) != 0 ? Color.INSTANCE.m1641getWhite0d7_KjU() : j17;
        long j22 = jColor;
        long jM1630getBlack0d7_KjU = (i10 & 256) != 0 ? Color.INSTANCE.m1630getBlack0d7_KjU() : j18;
        long jM1630getBlack0d7_KjU2 = (i10 & 512) != 0 ? Color.INSTANCE.m1630getBlack0d7_KjU() : j19;
        long jM1630getBlack0d7_KjU3 = (i10 & 1024) != 0 ? Color.INSTANCE.m1630getBlack0d7_KjU() : j20;
        if ((i10 & 2048) != 0) {
            j21 = Color.INSTANCE.m1641getWhite0d7_KjU();
        }
        return m983lightColors2qZNXz8(j22, jColor2, jColor3, jColor4, jM1641getWhite0d7_KjU, jM1641getWhite0d7_KjU2, jColor5, jM1641getWhite0d7_KjU3, jM1630getBlack0d7_KjU, jM1630getBlack0d7_KjU2, jM1630getBlack0d7_KjU3, j21);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m974setPrimary8_81llA$material_release(other.m962getPrimary0d7_KjU());
        colors.m975setPrimaryVariant8_81llA$material_release(other.m963getPrimaryVariant0d7_KjU());
        colors.m976setSecondary8_81llA$material_release(other.m964getSecondary0d7_KjU());
        colors.m977setSecondaryVariant8_81llA$material_release(other.m965getSecondaryVariant0d7_KjU());
        colors.m967setBackground8_81llA$material_release(other.m955getBackground0d7_KjU());
        colors.m978setSurface8_81llA$material_release(other.m966getSurface0d7_KjU());
        colors.m968setError8_81llA$material_release(other.m956getError0d7_KjU());
        colors.m971setOnPrimary8_81llA$material_release(other.m959getOnPrimary0d7_KjU());
        colors.m972setOnSecondary8_81llA$material_release(other.m960getOnSecondary0d7_KjU());
        colors.m969setOnBackground8_81llA$material_release(other.m957getOnBackground0d7_KjU());
        colors.m973setOnSurface8_81llA$material_release(other.m961getOnSurface0d7_KjU());
        colors.m970setOnError8_81llA$material_release(other.m958getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}
