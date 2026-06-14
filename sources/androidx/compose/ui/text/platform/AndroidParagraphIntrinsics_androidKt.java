package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a+\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u001a\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-9GRLPo0", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidParagraphIntrinsics_androidKt {
    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : EmojiSupportMatch.m3384boximpl(paragraphSyle.getEmojiSupportMatch())) == null ? false : EmojiSupportMatch.m3387equalsimpl0(r1.getValue(), EmojiSupportMatch.INSTANCE.m3392getNone_3YsG6Y()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m3718resolveTextDirectionHeuristics9GRLPo0(@org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextDirection r6, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.intl.LocaleList r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.getValue()
            goto Ld
        L7:
            androidx.compose.ui.text.style.TextDirection$Companion r6 = androidx.compose.ui.text.style.TextDirection.INSTANCE
            int r6 = r6.m3870getContents_7Xco()
        Ld:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.INSTANCE
            int r1 = r0.m3871getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3866equalsimpl0(r6, r1)
            r2 = 2
            if (r1 == 0) goto L1b
            return r2
        L1b:
            int r1 = r0.m3872getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3866equalsimpl0(r6, r1)
            r3 = 3
            if (r1 == 0) goto L27
            return r3
        L27:
            int r1 = r0.m3873getLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3866equalsimpl0(r6, r1)
            r4 = 0
            if (r1 == 0) goto L33
            return r4
        L33:
            int r1 = r0.m3874getRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3866equalsimpl0(r6, r1)
            r5 = 1
            if (r1 == 0) goto L3f
            return r5
        L3f:
            int r0 = r0.m3870getContents_7Xco()
            boolean r6 = androidx.compose.ui.text.style.TextDirection.m3866equalsimpl0(r6, r0)
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L60
            androidx.compose.ui.text.intl.Locale r6 = r7.get(r4)
            androidx.compose.ui.text.intl.PlatformLocale r6 = r6.getPlatformLocale()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            androidx.compose.ui.text.intl.AndroidLocale r6 = (androidx.compose.ui.text.intl.AndroidLocale) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L64
        L60:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L64:
            int r6 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L6e
            if (r6 == r5) goto L6d
            return r2
        L6d:
            return r3
        L6e:
            return r2
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m3718resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0$default, reason: not valid java name */
    public static /* synthetic */ int m3719resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textDirection = null;
        }
        if ((i10 & 2) != 0) {
            localeList = null;
        }
        return m3718resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
