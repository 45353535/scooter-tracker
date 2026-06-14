package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"drawMultiParagraph", "", "Landroidx/compose/ui/text/MultiParagraph;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawMultiParagraph-7AXcY_I", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "drawParagraphs", "drawParagraphs-7AXcY_I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidMultiParagraphDrawKt {
    /* JADX INFO: renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m3714drawMultiParagraph7AXcY_I(@NotNull MultiParagraph drawMultiParagraph, @NotNull Canvas canvas, @NotNull Brush brush, float f10, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i10) {
        Intrinsics.checkNotNullParameter(drawMultiParagraph, "$this$drawMultiParagraph");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        canvas.save();
        if (drawMultiParagraph.getParagraphInfoList$ui_text_release().size() <= 1 || (brush instanceof SolidColor)) {
            m3716drawParagraphs7AXcY_I(drawMultiParagraph, canvas, brush, f10, shadow, textDecoration, drawStyle, i10);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = drawMultiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i11);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderMo1579createShaderuvyYCjk = ((ShaderBrush) brush).mo1579createShaderuvyYCjk(SizeKt.Size(fMax, height));
            Matrix matrix = new Matrix();
            shaderMo1579createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = drawMultiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i12);
                paragraphInfo2.getParagraph().mo3372painthn5TExg(canvas, BrushKt.ShaderBrush(shaderMo1579createShaderuvyYCjk), f10, shadow, textDecoration, drawStyle, i10);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderMo1579createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m3715drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        m3714drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? BlendMode.INSTANCE.m1554getSrcOver0nO6VwU() : i10);
    }

    /* JADX INFO: renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m3716drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i11 = 0; i11 < size; i11++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i11);
            paragraphInfo.getParagraph().mo3372painthn5TExg(canvas, brush, f10, shadow, textDecoration, drawStyle, i10);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
