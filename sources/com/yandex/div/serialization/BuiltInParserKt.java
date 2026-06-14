package com.yandex.div.serialization;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import k8.my;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/serialization/ParsingContext;", "builtInParsingContext", "Lcom/yandex/div/serialization/ParsingContext;", "getBuiltInParsingContext", "()Lcom/yandex/div/serialization/ParsingContext;", "Lk8/my;", "builtInParserComponent", "Lk8/my;", "getBuiltInParserComponent", "()Lk8/my;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class BuiltInParserKt {

    @NotNull
    private static final ParsingContext builtInParsingContext = new ParsingContext() { // from class: com.yandex.div.serialization.BuiltInParserKt$builtInParsingContext$1

        @NotNull
        private final TemplateProvider<JsonTemplate<?>> templates = TemplateProvider.INSTANCE.empty();

        @NotNull
        private final ParsingErrorLogger logger = ParsingErrorLogger.LOG;

        @Override // com.yandex.div.serialization.ParsingContext
        public /* synthetic */ boolean getAllowPropertyOverride() {
            return h8.a.a(this);
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public ParsingErrorLogger getLogger() {
            return this.logger;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public TemplateProvider<JsonTemplate<?>> getTemplates() {
            return this.templates;
        }
    };

    @NotNull
    private static final my builtInParserComponent = new my();

    @NotNull
    public static final my getBuiltInParserComponent() {
        return builtInParserComponent;
    }

    @NotNull
    public static final ParsingContext getBuiltInParsingContext() {
        return builtInParsingContext;
    }
}
