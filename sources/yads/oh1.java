package yads;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class oh1 {
    public static String a() {
        String lowerCase = StringsKt.W(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
