package com.yandex.div.serialization;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.data.EntityTemplate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ'\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/serialization/TemplateDeserializer;", "D", "T", "Lcom/yandex/div/data/EntityTemplate;", "Lcom/yandex/div/serialization/Deserializer;", "deserialize", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/serialization/ParsingContext;", "data", "(Lcom/yandex/div/serialization/ParsingContext;Ljava/lang/Object;)Lcom/yandex/div/data/EntityTemplate;", "parent", "(Lcom/yandex/div/serialization/ParsingContext;Lcom/yandex/div/data/EntityTemplate;Ljava/lang/Object;)Lcom/yandex/div/data/EntityTemplate;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TemplateDeserializer<D, T extends EntityTemplate<?>> extends Deserializer<D, T> {
    @NotNull
    T deserialize(@NotNull ParsingContext context, @Nullable T parent, D data);

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    T deserialize(@NotNull ParsingContext context, D data);
}
