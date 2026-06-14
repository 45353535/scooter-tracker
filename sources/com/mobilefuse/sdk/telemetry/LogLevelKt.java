package com.mobilefuse.sdk.telemetry;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002¨\u0006\u0006"}, d2 = {"contains", "", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", "childLevel", "toLowerCase", "", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class LogLevelKt {
    public static final boolean contains(@NotNull LogLevel contains, @NotNull LogLevel childLevel) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Intrinsics.checkNotNullParameter(childLevel, "childLevel");
        if (childLevel == contains) {
            return true;
        }
        while (childLevel != null) {
            if (childLevel == contains) {
                return true;
            }
            childLevel = childLevel.getParent();
        }
        return false;
    }

    @NotNull
    public static final String toLowerCase(@NotNull LogLevel toLowerCase) {
        Intrinsics.checkNotNullParameter(toLowerCase, "$this$toLowerCase");
        String string = toLowerCase.toString();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
