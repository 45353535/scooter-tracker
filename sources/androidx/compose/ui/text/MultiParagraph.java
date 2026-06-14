package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nBY\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017BY\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u001aB\\\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001dB,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u000e\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010@\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010A\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0005J\u0016\u0010B\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0007J\u000e\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u0018\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00052\b\b\u0002\u0010G\u001a\u00020\u0007J\u000e\u0010H\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\tJ\u000e\u0010K\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010L\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010M\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010N\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010O\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010P\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u001b\u0010Q\u001a\u00020\u00052\u0006\u0010R\u001a\u00020Sø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u000e\u0010V\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005J\u0016\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u0005J\u001e\u0010[\u001a\u00020\\2\u0006\u0010?\u001a\u00020\u0005ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u000e\u0010_\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0005J]\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\b\b\u0002\u0010f\u001a\u00020\t2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010j2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010l2\b\b\u0002\u0010m\u001a\u00020nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ=\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\b\b\u0002\u0010q\u001a\u00020r2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010jø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010tJU\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\b\b\u0002\u0010q\u001a\u00020r2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010j2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010l2\b\b\u0002\u0010m\u001a\u00020nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020a2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0010\u0010x\u001a\u00020a2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0010\u0010y\u001a\u00020a2\u0006\u0010E\u001a\u00020\u0005H\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010-\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u00103\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010&R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006z"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "maxLines", "", "ellipsis", "", "width", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text_release", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", C4240b4.i.L, "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;

    @NotNull
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;

    @NotNull
    private final List<ParagraphInfo> paragraphInfoList;

    @NotNull
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i10, z10);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return multiParagraph.getLineEnd(i10, z10);
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m3394paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Color.INSTANCE.m1640getUnspecified0d7_KjU();
        }
        multiParagraph.m3399paintRPmYEkk(canvas, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : textDecoration);
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m3395painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        multiParagraph.m3400painthn5TExg(canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? DrawScope.INSTANCE.m2070getDefaultBlendMode0nO6VwU() : i10);
    }

    private final void requireIndexInRange(int offset) {
        if (offset < 0 || offset >= getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        if (offset < 0 || offset > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
        }
    }

    private final void requireLineIndexInRange(int lineIndex) {
        if (lineIndex < 0 || lineIndex >= this.lineCount) {
            throw new IllegalArgumentException(("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')').toString());
        }
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    @NotNull
    public final Rect getCursorRect(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    @NotNull
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.last((List) this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final int getLineForOffset(int offset) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset >= getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : offset < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForVerticalPosition(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(vertical <= 0.0f ? 0 : vertical >= this.height ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    public final float getLineHeight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineLeft(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineTop(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineWidth(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m3396getOffsetForPositionk4lQ0M(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(Offset.m1372getYimpl(position) <= 0.0f ? 0 : Offset.m1372getYimpl(position) >= this.height ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m1372getYimpl(position)));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo3368getOffsetForPositionk4lQ0M(paragraphInfo.m3402toLocalMKHz9U(position)));
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    @NotNull
    public final Path getPathForRange(int start, int end) {
        if (start < 0 || start > end || end > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("Start(" + start + ") or End(" + end + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
        }
        if (start == end) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        int size = this.paragraphInfoList.size();
        for (int iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, start); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= end) {
                break;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                h1.c(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
            }
        }
        return Path;
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m3397getWordBoundaryjx7JFs(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.m3401toGlobalGEjPoXI(paragraphInfo.getParagraph().mo3369getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m3398paintLG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo paragraphInfo = list.get(i10);
            paragraphInfo.getParagraph().mo3370paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final void m3399paintRPmYEkk(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration decoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            ParagraphInfo paragraphInfo = list.get(i10);
            Canvas canvas2 = canvas;
            long j10 = color;
            paragraphInfo.getParagraph().mo3371paintRPmYEkk(canvas2, j10, shadow, decoration);
            canvas2.translate(0.0f, paragraphInfo.getParagraph().getHeight());
            i10++;
            canvas = canvas2;
            color = j10;
        }
        canvas.restore();
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m3400painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        AndroidMultiParagraphDrawKt.m3714drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j10, i10, z10);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10) {
        boolean z11;
        int iM3918getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i10;
        if (Constraints.m3921getMinWidthimpl(j10) == 0 && Constraints.m3920getMinHeightimpl(j10) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i11 = 0;
            float f10 = 0.0f;
            int i12 = 0;
            while (i12 < size) {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i12);
                ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
                int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10);
                if (Constraints.m3914getHasBoundedHeightimpl(j10)) {
                    iM3918getMaxHeightimpl = g.e(Constraints.m3918getMaxHeightimpl(j10) - ParagraphKt.ceilToInt(f10), 0);
                } else {
                    iM3918getMaxHeightimpl = Constraints.m3918getMaxHeightimpl(j10);
                }
                Paragraph paragraphM3405Paragraph_EkL_Y = ParagraphKt.m3405Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, iM3919getMaxWidthimpl, 0, iM3918getMaxHeightimpl, 5, null), this.maxLines - i11, z10);
                float height = f10 + paragraphM3405Paragraph_EkL_Y.getHeight();
                int lineCount = i11 + paragraphM3405Paragraph_EkL_Y.getLineCount();
                arrayList.add(new ParagraphInfo(paragraphM3405Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i11, lineCount, f10, height));
                if (paragraphM3405Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i12 != CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release()))) {
                    z11 = true;
                    i11 = lineCount;
                    f10 = height;
                    break;
                } else {
                    i12++;
                    i11 = lineCount;
                    f10 = height;
                }
            }
            z11 = false;
            this.height = f10;
            this.lineCount = i11;
            this.didExceedMaxLines = z11;
            this.paragraphInfoList = arrayList;
            this.width = Constraints.m3919getMaxWidthimpl(j10);
            List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i13);
                List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    Rect rect = placeholderRects.get(i14);
                    arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
                }
                CollectionsKt.addAll(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
                int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i15 = 0; i15 < size4; i15++) {
                    arrayList4.add(null);
                }
                arrayList2 = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
            }
            this.placeholderRects = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z10, null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z10, f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(@NotNull MultiParagraphIntrinsics intrinsics, int i10, boolean z10, float f10) {
        this(intrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z10, null);
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 4) != 0 ? CollectionsKt.emptyList() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z10, f10, density, resourceLoader);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i10, boolean z10, float f10, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z10, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 32) != 0 ? CollectionsKt.emptyList() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, float f10, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i10, boolean z10) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z10, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j10, density, resolver, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10, null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j10, i10, z10, null);
    }
}
