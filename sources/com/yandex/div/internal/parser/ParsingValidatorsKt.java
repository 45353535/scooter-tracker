package com.yandex.div.internal.parser;

import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "regex", "", "doesMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ParsingValidatorsKt {
    public static final boolean doesMatch(@NotNull String str, @NotNull String str2) {
        return Pattern.matches(str2, str);
    }
}
