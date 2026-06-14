package com.yandex.div.storage.analytics;

import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import com.yandex.div.storage.util.LazyProvider;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\b\u001a\u00020\u00078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "", "Lkf/a;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "externalErrorTransformer", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "templateContainer", "Lcom/yandex/div/json/ParsingErrorLogger;", "parsingErrorLogger", "<init>", "(Lkf/a;Lcom/yandex/div/storage/templates/TemplatesContainer;Lcom/yandex/div/json/ParsingErrorLogger;)V", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "Lcom/yandex/div/json/ParsingErrorLogger;", "errorTransformer", "Lkf/a;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CardErrorLoggerFactory {

    @NotNull
    private final a errorTransformer;

    @NotNull
    private final ParsingErrorLogger parsingErrorLogger;

    @NotNull
    private final TemplatesContainer templateContainer;

    public CardErrorLoggerFactory(@Nullable final a aVar, @NotNull TemplatesContainer templatesContainer, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.parsingErrorLogger = parsingErrorLogger;
        this.errorTransformer = new LazyProvider(new Function0<CardErrorTransformer>() { // from class: com.yandex.div.storage.analytics.CardErrorLoggerFactory$errorTransformer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CardErrorTransformer invoke() {
                a aVar2 = aVar;
                return aVar2 == null ? new TemplateCardErrorTransformer(this.templateContainer, this.parsingErrorLogger) : new CardErrorTransformer.Composite(aVar2.get(), new TemplateCardErrorTransformer(this.templateContainer, this.parsingErrorLogger));
            }
        });
    }
}
