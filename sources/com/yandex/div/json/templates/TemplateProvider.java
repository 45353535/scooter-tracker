package com.yandex.div.json.templates;

import com.taurusx.tax.f.y;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingException;
import g8.a;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f*\u000e\b\u0000\u0010\u0001 \u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0001\fJ\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/json/templates/TemplateProvider;", "T", "Lcom/yandex/div/data/EntityTemplate;", "", "get", "templateId", "", "(Ljava/lang/String;)Lcom/yandex/div/data/EntityTemplate;", "getOrThrow", "json", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/yandex/div/data/EntityTemplate;", y.f66058y, "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TemplateProvider<T extends EntityTemplate<?>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\f\b\u0001\u0010\u0005*\u0006\u0012\u0002\b\u00030\u0006J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\f\b\u0001\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00050\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/json/templates/TemplateProvider$Companion;", "", "()V", "empty", "Lcom/yandex/div/json/templates/TemplateProvider;", "T", "Lcom/yandex/div/data/EntityTemplate;", "wrap", "map", "", "", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final <T extends EntityTemplate<?>> TemplateProvider<T> empty() {
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$empty$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                @Nullable
                public EntityTemplate get(@NotNull String templateId) {
                    return null;
                }

                @Override // com.yandex.div.json.templates.TemplateProvider
                public /* synthetic */ EntityTemplate getOrThrow(String str, JSONObject jSONObject) {
                    return a.a(this, str, jSONObject);
                }
            };
        }

        @NotNull
        public final <T extends EntityTemplate<?>> TemplateProvider<T> wrap(@NotNull final Map<String, ? extends T> map) {
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$wrap$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                @Nullable
                public EntityTemplate get(@NotNull String templateId) {
                    return (EntityTemplate) map.get(templateId);
                }

                @Override // com.yandex.div.json.templates.TemplateProvider
                public /* synthetic */ EntityTemplate getOrThrow(String str, JSONObject jSONObject) {
                    return a.a(this, str, jSONObject);
                }
            };
        }
    }

    @Nullable
    T get(@NotNull String templateId);

    @NotNull
    T getOrThrow(@NotNull String templateId, @NotNull JSONObject json) throws ParsingException;
}
