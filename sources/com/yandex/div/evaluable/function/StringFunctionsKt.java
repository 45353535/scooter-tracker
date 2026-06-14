package com.yandex.div.evaluable.function;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"buildRepeatableString", "", "evaluationContext", "Lcom/yandex/div/evaluable/EvaluationContext;", "expressionContext", "Lcom/yandex/div/evaluable/ExpressionContext;", SessionDescription.ATTR_LENGTH, "", "repeatable", "buildRepeatableString-zb-MA7A", "(Lcom/yandex/div/evaluable/EvaluationContext;Lcom/yandex/div/evaluable/Evaluable;ILjava/lang/String;)Ljava/lang/String;", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class StringFunctionsKt {
    @NotNull
    /* JADX INFO: renamed from: buildRepeatableString-zb-MA7A, reason: not valid java name */
    public static final String m7629buildRepeatableStringzbMA7A(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, int i10, @NotNull String repeatable) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(repeatable, "repeatable");
        if (repeatable.length() == 0 || i10 <= 0) {
            if (repeatable.length() != 0) {
                return "";
            }
            evaluationContext.getWarningSender().mo7588sendBIH1yYw(expressionContext, "String for padding is empty.");
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10);
        Iterator it = g.v(0, i10).iterator();
        while (it.hasNext()) {
            sb2.append(repeatable.charAt(((IntIterator) it).nextInt() % repeatable.length()));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return string;
    }
}
