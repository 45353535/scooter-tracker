package com.yandex.div.internal.parser;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/json/ParsingException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "suppressMissingValueOrThrow", "(Lcom/yandex/div/json/ParsingException;)V", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class JsonTemplateParserKt {
    public static final void suppressMissingValueOrThrow(@NotNull ParsingException parsingException) {
        if (parsingException.getReason() != ParsingExceptionReason.MISSING_VALUE) {
            throw parsingException;
        }
    }
}
