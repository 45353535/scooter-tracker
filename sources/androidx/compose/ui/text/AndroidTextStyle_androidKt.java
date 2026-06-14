package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"DefaultIncludeFontPadding", "", "createPlatformTextStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = true;

    @NotNull
    public static final PlatformTextStyle createPlatformTextStyle(@Nullable PlatformSpanStyle platformSpanStyle, @Nullable PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @NotNull
    public static final PlatformSpanStyle lerp(@NotNull PlatformSpanStyle start, @NotNull PlatformSpanStyle stop, float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return start;
    }

    @NotNull
    public static final PlatformParagraphStyle lerp(@NotNull PlatformParagraphStyle start, @NotNull PlatformParagraphStyle stop, float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return start.getIncludeFontPadding() == stop.getIncludeFontPadding() ? start : new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(EmojiSupportMatch.m3384boximpl(start.getEmojiSupportMatch()), EmojiSupportMatch.m3384boximpl(stop.getEmojiSupportMatch()), f10)).getValue(), ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(start.getIncludeFontPadding()), Boolean.valueOf(stop.getIncludeFontPadding()), f10)).booleanValue(), (DefaultConstructorMarker) null);
    }
}
