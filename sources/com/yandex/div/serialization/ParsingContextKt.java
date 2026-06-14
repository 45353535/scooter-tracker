package com.yandex.div.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"(\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/yandex/div/serialization/ParsingContext;", "collectingErrors", "(Lcom/yandex/div/serialization/ParsingContext;)Lcom/yandex/div/serialization/ParsingContext;", "restrictPropertyOverride", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCollectedErrors", "(Lcom/yandex/div/serialization/ParsingContext;)Ljava/util/List;", "getCollectedErrors$annotations", "(Lcom/yandex/div/serialization/ParsingContext;)V", "collectedErrors", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ParsingContextKt {
    @NotNull
    public static final ParsingContext collectingErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? parsingContext : new ErrorCollectingParsingContext(parsingContext);
    }

    @NotNull
    public static final List<Exception> getCollectedErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? ((ErrorCollectingParsingContext) parsingContext).getErrors() : parsingContext instanceof ParsingContextWrapper ? getCollectedErrors(((ParsingContextWrapper) parsingContext).getBaseContext()) : CollectionsKt.emptyList();
    }

    @NotNull
    public static final ParsingContext restrictPropertyOverride(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof OverrideRestrictingParsingContext ? parsingContext : new OverrideRestrictingParsingContext(parsingContext);
    }
}
