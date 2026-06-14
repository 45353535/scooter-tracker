package com.yandex.div.internal.parser;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.json.ParsingErrorLogger;
import e8.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/internal/parser/TemplateParsingErrorLogger;", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "templateId", "", "(Lcom/yandex/div/json/ParsingErrorLogger;Ljava/lang/String;)V", "logError", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/Exception;", "Lkotlin/Exception;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final String templateId;

    public TemplateParsingErrorLogger(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull String str) {
        this.logger = parsingErrorLogger;
        this.templateId = str;
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    public void logError(@NotNull Exception e10) {
        this.logger.logTemplateError(e10, this.templateId);
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    public /* synthetic */ void logTemplateError(Exception exc, String str) {
        c.a(this, exc, str);
    }
}
