package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\t0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/GenericFontFamily;", "(Landroidx/compose/ui/text/font/GenericFontFamily;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "nativeTypeface", "Landroid/graphics/Typeface;", "buildStyledTypeface", "kotlin.jvm.PlatformType", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "buildStyledTypeface-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "getNativeTypeface", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {

    @NotNull
    private final FontFamily fontFamily;

    @NotNull
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(@NotNull GenericFontFamily fontFamily) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        Typeface typefaceCreate = Typeface.create(fontFamily.getName(), 0);
        Intrinsics.checkNotNull(typefaceCreate);
        this.nativeTypeface = typefaceCreate;
    }

    /* JADX INFO: renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m3713buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int fontStyle) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m3543getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle)) : TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m3588equalsimpl0(fontStyle, FontStyle.INSTANCE.m3592getItalic_LCdwA()));
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo3712getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int fontStyle, int synthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface typefaceM3713buildStyledTypefaceFO1MlWM = m3713buildStyledTypefaceFO1MlWM(fontWeight, fontStyle);
        Intrinsics.checkNotNullExpressionValue(typefaceM3713buildStyledTypefaceFO1MlWM, "buildStyledTypeface(fontWeight, fontStyle)");
        return typefaceM3713buildStyledTypefaceFO1MlWM;
    }
}
