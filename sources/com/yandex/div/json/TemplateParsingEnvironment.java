package com.yandex.div.json;

import com.ironsource.D5;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import h8.a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0002#$B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment;", "Lcom/yandex/div/json/JsonTemplate;", "T", "Lcom/yandex/div/json/ParsingEnvironment;", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "mainTemplateProvider", "<init>", "(Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/templates/CachingTemplateProvider;)V", "Lorg/json/JSONObject;", "json", "", "parseTemplates", "(Lorg/json/JSONObject;)V", "", "", "parseTemplatesWithResult", "(Lorg/json/JSONObject;)Ljava/util/Map;", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateParsingResult;", "parseTemplatesWithResultAndDependencies", "(Lorg/json/JSONObject;)Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateParsingResult;", "Lcom/yandex/div/json/ParsingErrorLogger;", "getLogger", "()Lcom/yandex/div/json/ParsingErrorLogger;", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "Lcom/yandex/div/json/templates/TemplateProvider;", "templates", "Lcom/yandex/div/json/templates/TemplateProvider;", "getTemplates", "()Lcom/yandex/div/json/templates/TemplateProvider;", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "getTemplateFactory", "()Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "templateFactory", "TemplateFactory", "TemplateParsingResult", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final CachingTemplateProvider<T> mainTemplateProvider;

    @NotNull
    private final TemplateProvider<T> templates;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J%\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "T", "", "create", D5.f40568o, "Lcom/yandex/div/json/ParsingEnvironment;", "topLevel", "", "json", "Lorg/json/JSONObject;", "(Lcom/yandex/div/json/ParsingEnvironment;ZLorg/json/JSONObject;)Ljava/lang/Object;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TemplateFactory<T> {
        T create(@NotNull ParsingEnvironment env, boolean topLevel, @NotNull JSONObject json) throws JSONException;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u0003¢\u0006\u0004\b\b\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateParsingResult;", "T", "", "", "", "parsedTemplates", "", "templateDependencies", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "getParsedTemplates", "()Ljava/util/Map;", "getTemplateDependencies", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TemplateParsingResult<T> {

        @NotNull
        private final Map<String, T> parsedTemplates;

        @NotNull
        private final Map<String, Set<String>> templateDependencies;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateParsingResult(@NotNull Map<String, ? extends T> map, @NotNull Map<String, ? extends Set<String>> map2) {
            this.parsedTemplates = map;
            this.templateDependencies = map2;
        }

        @NotNull
        public final Map<String, T> getParsedTemplates() {
            return this.parsedTemplates;
        }
    }

    public TemplateParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<T> cachingTemplateProvider) {
        this.logger = parsingErrorLogger;
        this.mainTemplateProvider = cachingTemplateProvider;
        this.templates = cachingTemplateProvider;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public /* synthetic */ boolean getAllowPropertyOverride() {
        return a.a(this);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public abstract TemplateFactory<T> getTemplateFactory();

    public final void parseTemplates(@NotNull JSONObject json) {
        this.mainTemplateProvider.putAll(parseTemplatesWithResult(json));
    }

    @NotNull
    public final Map<String, T> parseTemplatesWithResult(@NotNull JSONObject json) {
        return parseTemplatesWithResultAndDependencies(json).getParsedTemplates();
    }

    @NotNull
    public final TemplateParsingResult<T> parseTemplatesWithResultAndDependencies(@NotNull JSONObject json) {
        Map<String, T> mapArrayMap = CollectionsKt.arrayMap();
        Map mapArrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> mapSort = JsonTopologicalSorting.INSTANCE.sort(this, json);
            this.mainTemplateProvider.takeSnapshot(mapArrayMap);
            TemplateProvider templateProviderWrap = TemplateProvider.INSTANCE.wrap(mapArrayMap);
            for (Map.Entry<String, Set<String>> entry : mapSort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    mapArrayMap.put(key, getTemplateFactory().create(new ParsingEnvironmentImpl(templateProviderWrap, new TemplateParsingErrorLogger(getLogger(), key)), true, json.getJSONObject(key)));
                    if (!value.isEmpty()) {
                        mapArrayMap2.put(key, value);
                    }
                } catch (ParsingException e10) {
                    getLogger().logTemplateError(e10, key);
                }
            }
        } catch (Exception e11) {
            getLogger().logError(e11);
        }
        return new TemplateParsingResult<>(mapArrayMap, mapArrayMap2);
    }
}
