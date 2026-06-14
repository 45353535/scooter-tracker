package com.yandex.div.storage.analytics;

import com.taurusx.tax.f.y;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/storage/analytics/TemplateCardErrorTransformer;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "templateContainer", "Lcom/yandex/div/json/ParsingErrorLogger;", "internalLogger", "<init>", "(Lcom/yandex/div/storage/templates/TemplatesContainer;Lcom/yandex/div/json/ParsingErrorLogger;)V", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "Lcom/yandex/div/json/ParsingErrorLogger;", y.f66058y, "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class TemplateCardErrorTransformer implements CardErrorTransformer {

    @NotNull
    private final ParsingErrorLogger internalLogger;

    @NotNull
    private final TemplatesContainer templateContainer;

    public TemplateCardErrorTransformer(@NotNull TemplatesContainer templatesContainer, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.internalLogger = parsingErrorLogger;
    }
}
