package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a{\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00182\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00182\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00182\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\f\u0010!\u001a\u00020\u0001*\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "ellipsis", "", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ceilToInt", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @NotNull
    public static final Paragraph Paragraph(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i10, boolean z10, float f10, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(text, style, spanStyles, placeholders, i10, z10, f10, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        List list4 = list2;
        if ((i11 & 16) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            z10 = false;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, i12, z10, f10, density, resourceLoader);
    }

    @NotNull
    /* JADX INFO: renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final Paragraph m3403ParagraphUdtVg6A(@NotNull String text, @NotNull TextStyle style, long j10, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3721ActualParagraphO3s9Psw(text, style, spanStyles, placeholders, i10, z10, j10, density, fontFamilyResolver);
    }

    @NotNull
    /* JADX INFO: renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final Paragraph m3405Paragraph_EkL_Y(@NotNull ParagraphIntrinsics paragraphIntrinsics, long j10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3720ActualParagraphhBUhpc(paragraphIntrinsics, i10, z10, j10);
    }

    /* JADX INFO: renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m3406Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        return m3405Paragraph_EkL_Y(paragraphIntrinsics, j10, i10, z10);
    }

    public static final int ceilToInt(float f10) {
        return (int) Math.ceil(f10);
    }

    @NotNull
    public static final Paragraph Paragraph(@NotNull String text, @NotNull TextStyle style, float f10, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3721ActualParagraphO3s9Psw(text, style, spanStyles, placeholders, i10, z10, ConstraintsKt.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null), density, fontFamilyResolver);
    }

    @NotNull
    public static final Paragraph Paragraph(@NotNull ParagraphIntrinsics paragraphIntrinsics, int i10, boolean z10, float f10) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3720ActualParagraphhBUhpc(paragraphIntrinsics, i10, z10, ConstraintsKt.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i10, boolean z10, float f10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Paragraph(paragraphIntrinsics, i10, z10, f10);
    }
}
