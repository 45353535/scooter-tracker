package com.yandex.div.core.expression;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/json/ParsingException;", "", "isExpressionResolveFail", "(Lcom/yandex/div/json/ParsingException;)Z", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ExpressionFallbacksHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpressionResolveFail(ParsingException parsingException) {
        return parsingException.getReason() == ParsingExceptionReason.MISSING_VARIABLE || parsingException.getReason() == ParsingExceptionReason.INVALID_VALUE || parsingException.getReason() == ParsingExceptionReason.TYPE_MISMATCH;
    }
}
