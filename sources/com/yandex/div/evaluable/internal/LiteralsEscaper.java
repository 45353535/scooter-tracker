package com.yandex.div.evaluable.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/evaluable/internal/LiteralsEscaper;", "", "<init>", "()V", "", TypedValues.Custom.S_STRING, "", FirebaseAnalytics.Param.INDEX, "countConsecutiveBackslashes", "(Ljava/lang/String;I)I", "", "possibleLiterals", "escapeLiteral", "(Ljava/lang/String;I[Ljava/lang/String;)Ljava/lang/String;", "literal", TypedValues.TransitionType.S_FROM, "", "isPossibleEscapeLiteral", "(Ljava/lang/String;Ljava/lang/String;I)Z", "escapingLiterals", "process", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "ESCAPE_LITERALS", "[Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LiteralsEscaper {

    @NotNull
    public static final LiteralsEscaper INSTANCE = new LiteralsEscaper();

    @NotNull
    private static final String[] ESCAPE_LITERALS = {"'", "@{"};

    private LiteralsEscaper() {
    }

    private final int countConsecutiveBackslashes(String string, int index) {
        int i10 = index;
        while (i10 < string.length() && string.charAt(i10) == '\\') {
            i10++;
        }
        return i10 - index;
    }

    private final String escapeLiteral(String string, int index, String[] possibleLiterals) {
        int i10 = 2;
        Exception exc = null;
        byte b10 = 0;
        if (index != string.length() && string.charAt(index) != ' ') {
            for (String str : possibleLiterals) {
                if (isPossibleEscapeLiteral(str, string, index)) {
                    return str;
                }
            }
            throw new EvaluableException("Incorrect string escape", null, 2, null);
        }
        String str2 = "Error tokenizing '" + string + "'.";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alone backslash at ");
        sb2.append(index - 1);
        throw new EvaluableException(str2, new TokenizingException(sb2.toString(), exc, i10, b10 == true ? 1 : 0));
    }

    private final boolean isPossibleEscapeLiteral(String literal, String string, int from) {
        int length = literal.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = from + i10;
            if (i11 >= string.length() || string.charAt(i11) != literal.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String process$default(LiteralsEscaper literalsEscaper, String str, String[] strArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            strArr = ESCAPE_LITERALS;
        }
        return literalsEscaper.process(str, strArr);
    }

    @NotNull
    public final String process(@NotNull String string, @NotNull String[] escapingLiterals) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(escapingLiterals, "escapingLiterals");
        if (!StringsKt.f0(string, IOUtils.DIR_SEPARATOR_WINDOWS, false, 2, null)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(string.length());
        int length = 0;
        while (length < string.length()) {
            if (string.charAt(length) != '\\') {
                sb2.append(string.charAt(length));
                length++;
            } else {
                int iCountConsecutiveBackslashes = countConsecutiveBackslashes(string, length);
                length += iCountConsecutiveBackslashes;
                int i10 = iCountConsecutiveBackslashes / 2;
                for (int i11 = 0; i11 < i10; i11++) {
                    sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                }
                if (iCountConsecutiveBackslashes % 2 == 1) {
                    String strEscapeLiteral = escapeLiteral(string, length, escapingLiterals);
                    sb2.append(strEscapeLiteral);
                    length += strEscapeLiteral.length();
                }
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "literalBuilder.toString()");
        return string2;
    }
}
