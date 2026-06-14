package com.yandex.div.data;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import k8.ts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/DivParsingEnvironment;", "Lcom/yandex/div/json/TemplateParsingEnvironment;", "Lk8/ts;", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "templateProvider", "<init>", "(Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/templates/CachingTemplateProvider;)V", "templates", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "getTemplates", "()Lcom/yandex/div/json/templates/CachingTemplateProvider;", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "templateFactory", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "getTemplateFactory", "()Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivParsingEnvironment extends TemplateParsingEnvironment<ts> {

    @NotNull
    private final TemplateParsingEnvironment.TemplateFactory<ts> templateFactory;

    @NotNull
    private final CachingTemplateProvider<ts> templates;

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingErrorLogger, (i10 & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.INSTANCE.empty()) : cachingTemplateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ts templateFactory$lambda$0(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
        return ts.f91500a.a(parsingEnvironment, z10, jSONObject);
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment
    @NotNull
    public TemplateParsingEnvironment.TemplateFactory<ts> getTemplateFactory() {
        return this.templateFactory;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public CachingTemplateProvider<ts> getTemplates() {
        return this.templates;
    }

    public DivParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<ts> cachingTemplateProvider) {
        super(parsingErrorLogger, cachingTemplateProvider);
        this.templates = cachingTemplateProvider;
        this.templateFactory = new TemplateParsingEnvironment.TemplateFactory() { // from class: v7.a
            @Override // com.yandex.div.json.TemplateParsingEnvironment.TemplateFactory
            public final Object create(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
                return DivParsingEnvironment.templateFactory$lambda$0(parsingEnvironment, z10, jSONObject);
            }
        };
    }
}
