package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001ak\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0085\u0001\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0014\b\u0002\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001ao\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u0002032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a)\u00106\u001a\u000207*\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"DefaultTextBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultTextBlendMode", "()I", "I", "clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextPainterKt {
    private static final int DefaultTextBlendMode = BlendMode.INSTANCE.m1554getSrcOver0nO6VwU();

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m3897equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m3906getVisiblegIe3tQ8())) {
            return;
        }
        c.d(drawTransform, 0.0f, 0.0f, IntSize.m4111getWidthimpl(textLayoutResult.getSize()), IntSize.m4110getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m3482drawTextJFhB2K4(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull AnnotatedString text, long j10, @NotNull TextStyle style, int i10, boolean z10, int i11, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, long j11, int i12) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        TextLayoutResult textLayoutResultM3479measurexDpz5zY$default = TextMeasurer.m3479measurexDpz5zY$default(textMeasurer, text, style, i10, z10, i11, placeholders, m3490textLayoutConstraintsv_w8tDc(drawText, j11, j10), drawText.getLayoutDirection(), drawText, null, false, 1536, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10));
        clip(transform, textLayoutResultM3479measurexDpz5zY$default);
        textLayoutResultM3479measurexDpz5zY$default.getMultiParagraph().m3398paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2070getDefaultBlendMode0nO6VwU() : i12);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m3484drawTextLVfH_YU(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, @NotNull Brush brush, long j10, float f10, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i10) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10));
        clip(transform, textLayoutResult);
        textLayoutResult.getMultiParagraph().m3400painthn5TExg(drawText.getDrawContext().getCanvas(), brush, !Float.isNaN(f10) ? f10 : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i10);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m3486drawTextTPWCCtM(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull String text, long j10, @NotNull TextStyle style, int i10, boolean z10, int i11, long j11, int i12) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        TextLayoutResult textLayoutResultM3479measurexDpz5zY$default = TextMeasurer.m3479measurexDpz5zY$default(textMeasurer, new AnnotatedString(text, null, null, 6, null), style, i10, z10, i11, null, m3490textLayoutConstraintsv_w8tDc(drawText, j11, j10), drawText.getLayoutDirection(), drawText, null, false, 1568, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10));
        clip(transform, textLayoutResultM3479measurexDpz5zY$default);
        textLayoutResultM3479measurexDpz5zY$default.getMultiParagraph().m3398paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2070getDefaultBlendMode0nO6VwU() : i12);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m3488drawTextd8rzKo(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, long j10, long j11, float f10, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i10) {
        float alpha;
        int i11;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        Canvas canvas;
        MultiParagraph multiParagraph;
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Shadow shadow3 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle3 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1371getXimpl(j11), Offset.m1372getYimpl(j11));
        clip(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush == null || j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
            MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
            Canvas canvas2 = drawText.getDrawContext().getCanvas();
            if (j10 == Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
                j10 = textLayoutResult.getLayoutInput().getStyle().m3523getColor0d7_KjU();
            }
            multiParagraph2.m3398paintLG529CI(canvas2, TextDrawStyleKt.m3875modulateDxMtmZc(j10, f10), shadow3, textDecoration3, drawStyle3, i10);
        } else {
            MultiParagraph multiParagraph3 = textLayoutResult.getMultiParagraph();
            Canvas canvas3 = drawText.getDrawContext().getCanvas();
            if (Float.isNaN(f10)) {
                alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                i11 = i10;
                shadow2 = shadow3;
                textDecoration2 = textDecoration3;
                drawStyle2 = drawStyle3;
                canvas = canvas3;
                multiParagraph = multiParagraph3;
            } else {
                alpha = f10;
                canvas = canvas3;
                multiParagraph = multiParagraph3;
                i11 = i10;
                shadow2 = shadow3;
                textDecoration2 = textDecoration3;
                drawStyle2 = drawStyle3;
            }
            multiParagraph.m3400painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i11);
        }
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    public static final int getDefaultTextBlendMode() {
        return DefaultTextBlendMode;
    }

    /* JADX INFO: renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m3490textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j10, long j11) {
        int iD;
        int iD2;
        int iD3;
        Size.Companion companion = Size.INSTANCE;
        int iD4 = 0;
        if (j10 == companion.m1448getUnspecifiedNHjbRc() || Float.isNaN(Size.m1440getWidthimpl(j10))) {
            iD = zf.a.d((float) Math.ceil(Size.m1440getWidthimpl(drawScope.mo2040getSizeNHjbRc()) - Offset.m1371getXimpl(j11)));
            iD2 = 0;
        } else {
            iD2 = zf.a.d((float) Math.ceil(Size.m1440getWidthimpl(j10)));
            iD = iD2;
        }
        if (j10 == companion.m1448getUnspecifiedNHjbRc() || Float.isNaN(Size.m1437getHeightimpl(j10))) {
            iD3 = zf.a.d((float) Math.ceil(Size.m1437getHeightimpl(drawScope.mo2040getSizeNHjbRc()) - Offset.m1372getYimpl(j11)));
        } else {
            iD4 = zf.a.d((float) Math.ceil(Size.m1437getHeightimpl(j10)));
            iD3 = iD4;
        }
        return ConstraintsKt.Constraints(iD2, iD, iD4, iD3);
    }
}
