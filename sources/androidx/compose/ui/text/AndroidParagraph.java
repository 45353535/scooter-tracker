package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import lf.i;
import lf.l;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bj\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016B(\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0019JJ\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r2\u0006\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002J+\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\rø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010f\u001a\u00020<2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010g\u001a\u00020<2\u0006\u0010e\u001a\u00020\rH\u0016J\u0018\u0010h\u001a\u00020(2\u0006\u0010e\u001a\u00020\r2\u0006\u0010i\u001a\u00020\u000fH\u0016J\u0015\u0010j\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\blJ\u0015\u0010m\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0015\u0010p\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\bqJ\u0018\u0010r\u001a\u00020\r2\u0006\u0010k\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u000fH\u0016J\u0010\u0010t\u001a\u00020\r2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010u\u001a\u00020\r2\u0006\u0010v\u001a\u00020(H\u0016J\u0010\u0010w\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010x\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010y\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010z\u001a\u00020\r2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010{\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010|\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u001f\u0010}\u001a\u00020\r2\u0006\u0010~\u001a\u00020\u007fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020d2\u0006\u0010e\u001a\u00020\rH\u0016J\u001c\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\r2\u0007\u0010\u0086\u0001\u001a\u00020\rH\u0016J\"\u0010M\u001a\u00020]2\u0006\u0010e\u001a\u00020\rH\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\rH\u0016J\u0013\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0002Jc\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020(2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001JD\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001JZ\u0010\u008a\u0001\u001a\u00020[2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u0001*\u000200H\u0002¢\u0006\u0003\u0010£\u0001R\u001c\u0010\u001a\u001a\u00020\u001b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0014\u00107\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010*R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@8@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010\u001d\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020E8@X\u0081\u0004¢\u0006\f\u0012\u0004\bF\u0010\u001d\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010*R\u001b\u0010K\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bM\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "ellipsis", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "charSequence", "", "getCharSequence$ui_text_release$annotations", "()V", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getConstraints-msEJaDk", "()J", "J", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "getEllipsis", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "textLocale", "Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "width", "getWidth", "wordBoundary", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "getWordBoundary", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lkotlin/Lazy;", "constructTextLayout", "alignment", "justificationMode", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "fillBoundingBoxes", "", SessionDescription.ATTR_RANGE, "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineAscent", "lineIndex", "getLineAscent$ui_text_release", "getLineBaseline", "getLineBaseline$ui_text_release", "getLineBottom", "getLineDescent", "getLineDescent$ui_text_release", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", C4240b4.i.L, "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "getShaderBrushSpans", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidParagraph implements Paragraph {

    @NotNull
    private final CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;

    @NotNull
    private final TextLayout layout;
    private final int maxLines;

    @NotNull
    private final AndroidParagraphIntrinsics paragraphIntrinsics;

    @NotNull
    private final List<Rect> placeholderRects;

    /* JADX INFO: renamed from: wordBoundary$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wordBoundary;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, boolean z10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i10, z10, j10);
    }

    private final TextLayout constructTextLayout(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle) {
        return new TextLayout(this.charSequence, getWidth(), getTextPaint$ui_text_release(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] brushSpans = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
        Intrinsics.checkNotNullExpressionValue(brushSpans, "brushSpans");
        return brushSpans.length == 0 ? new ShaderBrushSpan[0] : brushSpans;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary.getValue();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final void m3366fillBoundingBoxes8ffj60Q(long range, @NotNull float[] array, int arrayStart) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.layout.fillBoundingBoxes(TextRange.m3501getMinimpl(range), TextRange.m3500getMaximpl(range), array, arrayStart);
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getBidiRunDirection(int offset) {
        return this.layout.isRtlCharAt(offset) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getBoundingBox(int offset) {
        RectF boundingBox = this.layout.getBoundingBox(offset);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @NotNull
    /* JADX INFO: renamed from: getCharSequence$ui_text_release, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getCursorRect(int offset) {
        if (offset >= 0 && offset <= this.charSequence.length()) {
            float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
            int lineForOffset = this.layout.getLineForOffset(offset);
            return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
        }
        throw new AssertionError("offset(" + offset + ") is out of bounds (0," + this.charSequence.length());
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null) : TextLayout.getSecondaryHorizontal$default(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int lineIndex) {
        return this.layout.getLineAscent(lineIndex);
    }

    public final float getLineBaseline$ui_text_release(int lineIndex) {
        return this.layout.getLineBaseline(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int lineIndex) {
        return this.layout.getLineBottom(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int lineIndex) {
        return this.layout.getLineDescent(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.getLineVisibleEnd(lineIndex) : this.layout.getLineEnd(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float vertical) {
        return this.layout.getLineForVertical((int) vertical);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int lineIndex) {
        return this.layout.getLineHeight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int lineIndex) {
        return this.layout.getLineTop(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo3368getOffsetForPositionk4lQ0M(long position) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m1372getYimpl(position)), Offset.m1371getXimpl(position));
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getParagraphDirection(int offset) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(offset)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @NotNull
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Path getPathForRange(int start, int end) {
        if (start >= 0 && start <= end && end <= this.charSequence.length()) {
            android.graphics.Path path = new android.graphics.Path();
            this.layout.getSelectionPath(start, end, path);
            return AndroidPath_androidKt.asComposePath(path);
        }
        throw new AssertionError("Start(" + start + ") or End(" + end + ") is out of Range(0.." + this.charSequence.length() + "), or start > end!");
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @NotNull
    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m3919getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo3369getWordBoundaryjx7JFs(int offset) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(offset), getWordBoundary().getWordEnd(offset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int lineIndex) {
        return this.layout.isLineEllipsized(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public void mo3370paintLG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iM3724getBlendMode0nO6VwU = getTextPaint$ui_text_release().m3724getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m3727setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m3725setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m3725setBlendModes9anfk8(iM3724getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo3371paintRPmYEkk(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m3727setColor8_81llA(color);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo3372painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        int iM3724getBlendMode0nO6VwU = getTextPaint$ui_text_release().m3724getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m3726setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), alpha);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m3725setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m3725setBlendModes9anfk8(iM3724getBlendMode0nO6VwU);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i10, boolean z10, long j10, FontFamily.Resolver resolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i10, z10, j10, resolver, density);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, boolean z10, long j10) {
        CharSequence charSequence$ui_text_release;
        final ?? r02;
        List<Rect> listEmptyList;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        ?? r03;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i10;
        this.ellipsis = z10;
        this.constraints = j10;
        if (Constraints.m3920getMinHeightimpl(j10) != 0 || Constraints.m3921getMinWidthimpl(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 >= 1) {
            TextStyle style = androidParagraphIntrinsics.getStyle();
            if (AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, z10)) {
                charSequence$ui_text_release = AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence());
            } else {
                charSequence$ui_text_release = androidParagraphIntrinsics.getCharSequence();
            }
            this.charSequence = charSequence$ui_text_release;
            int iM3378toLayoutAlignAMY3VfE = AndroidParagraph_androidKt.m3378toLayoutAlignAMY3VfE(style.m3531getTextAlignbuA522U());
            TextAlign textAlignM3531getTextAlignbuA522U = style.m3531getTextAlignbuA522U();
            ?? M3853equalsimpl0 = textAlignM3531getTextAlignbuA522U == null ? 0 : TextAlign.m3853equalsimpl0(textAlignM3531getTextAlignbuA522U.getValue(), TextAlign.INSTANCE.m3859getJustifye0LSkKk());
            int iM3380toLayoutHyphenationFrequency0_XeFpE = AndroidParagraph_androidKt.m3380toLayoutHyphenationFrequency0_XeFpE(style.getParagraphStyle().getHyphens());
            LineBreak lineBreakM3529getLineBreakLgCVezo = style.m3529getLineBreakLgCVezo();
            int iM3379toLayoutBreakStrategyu6PBz3U = AndroidParagraph_androidKt.m3379toLayoutBreakStrategyu6PBz3U(lineBreakM3529getLineBreakLgCVezo != null ? LineBreak.Strategy.m3790boximpl(LineBreak.m3781getStrategyfcGXIks(lineBreakM3529getLineBreakLgCVezo.getMask())) : null);
            LineBreak lineBreakM3529getLineBreakLgCVezo2 = style.m3529getLineBreakLgCVezo();
            int iM3381toLayoutLineBreakStyle4a2g8L8 = AndroidParagraph_androidKt.m3381toLayoutLineBreakStyle4a2g8L8(lineBreakM3529getLineBreakLgCVezo2 != null ? LineBreak.Strictness.m3800boximpl(LineBreak.m3782getStrictnessusljTpc(lineBreakM3529getLineBreakLgCVezo2.getMask())) : null);
            LineBreak lineBreakM3529getLineBreakLgCVezo3 = style.m3529getLineBreakLgCVezo();
            int iM3382toLayoutLineBreakWordStylegvcdTPQ = AndroidParagraph_androidKt.m3382toLayoutLineBreakWordStylegvcdTPQ(lineBreakM3529getLineBreakLgCVezo3 != null ? LineBreak.WordBreak.m3811boximpl(LineBreak.m3783getWordBreakjp8hJ3c(lineBreakM3529getLineBreakLgCVezo3.getMask())) : null);
            TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
            TextLayout textLayoutConstructTextLayout = constructTextLayout(iM3378toLayoutAlignAMY3VfE, M3853equalsimpl0, truncateAt, i10, iM3380toLayoutHyphenationFrequency0_XeFpE, iM3379toLayoutBreakStrategyu6PBz3U, iM3381toLayoutLineBreakStyle4a2g8L8, iM3382toLayoutLineBreakWordStylegvcdTPQ);
            if (z10 && textLayoutConstructTextLayout.getHeight() > Constraints.m3918getMaxHeightimpl(j10) && i10 > 1) {
                int iNumberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(textLayoutConstructTextLayout, Constraints.m3918getMaxHeightimpl(j10));
                if (iNumberOfLinesThatFitMaxHeight < 0 || iNumberOfLinesThatFitMaxHeight == i10) {
                    r03 = this;
                } else {
                    int iE = g.e(iNumberOfLinesThatFitMaxHeight, 1);
                    ?? r04 = this;
                    textLayoutConstructTextLayout = r04.constructTextLayout(iM3378toLayoutAlignAMY3VfE, M3853equalsimpl0, truncateAt, iE, iM3380toLayoutHyphenationFrequency0_XeFpE, iM3379toLayoutBreakStrategyu6PBz3U, iM3381toLayoutLineBreakStyle4a2g8L8, iM3382toLayoutLineBreakWordStylegvcdTPQ);
                    r03 = r04;
                }
                r03.layout = textLayoutConstructTextLayout;
                r02 = r03;
            } else {
                ?? r05 = this;
                r05.layout = textLayoutConstructTextLayout;
                r02 = r05;
            }
            r02.getTextPaint$ui_text_release().m3726setBrush12SF9DM(style.getBrush(), SizeKt.Size(r02.getWidth(), r02.getHeight()), style.getAlpha());
            for (ShaderBrushSpan shaderBrushSpan : r02.getShaderBrushSpans(r02.layout)) {
                shaderBrushSpan.m3745setSizeuvyYCjk(SizeKt.Size(r02.getWidth(), r02.getHeight()));
            }
            CharSequence charSequence = r02.charSequence;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(0, charSequence.length(), PlaceholderSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                    int spanStart = spanned.getSpanStart(placeholderSpan);
                    int spanEnd = spanned.getSpanEnd(placeholderSpan);
                    int lineForOffset = r02.layout.getLineForOffset(spanStart);
                    boolean z11 = lineForOffset >= r02.maxLines;
                    boolean z12 = r02.layout.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > r02.layout.getLineEllipsisOffset(lineForOffset);
                    boolean z13 = spanEnd > r02.layout.getLineEnd(lineForOffset);
                    if (z12 || z13 || z11) {
                        rect = null;
                    } else {
                        int i11 = WhenMappings.$EnumSwitchMapping$0[r02.getBidiRunDirection(spanStart).ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new m();
                            }
                            horizontalPosition = r02.getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                        } else {
                            horizontalPosition = r02.getHorizontalPosition(spanStart, true);
                        }
                        float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                        TextLayout textLayout = r02.layout;
                        switch (placeholderSpan.getVerticalAlign()) {
                            case 0:
                                lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 1:
                                lineTop = textLayout.getLineTop(lineForOffset);
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 2:
                                lineBaseline = textLayout.getLineBottom(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 3:
                                lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 4:
                                heightPx2 = placeholderSpan.getFontMetrics().ascent;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = heightPx2 + lineBaseline2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 5:
                                lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = heightPx2 + lineBaseline2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    arrayList.add(rect);
                }
                listEmptyList = arrayList;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            r02.placeholderRects = listEmptyList;
            r02.wordBoundary = i.b(l.f94211d, new Function0<WordBoundary>() { // from class: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final WordBoundary invoke() {
                    return new WordBoundary(this.this$0.getTextLocale$ui_text_release(), this.this$0.layout.getText());
                }
            });
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0");
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, boolean z10, long j10, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i10, z10, j10, null);
    }
}
