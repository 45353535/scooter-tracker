package io.appmetrica.analytics.coreutils.internal;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"replaceFirstCharWithTitleCase", "", CommonUrlParts.LOCALE, "Ljava/util/Locale;", "core-utils_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StringExtensionsKt {
    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.d(cCharAt, locale) : String.valueOf(cCharAt)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }
}
