package com.yandex.div.storage.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer;", "", "Composite", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CardErrorTransformer {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer$Composite;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "", "transformers", "<init>", "([Lcom/yandex/div/storage/util/CardErrorTransformer;)V", "[Lcom/yandex/div/storage/util/CardErrorTransformer;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Composite implements CardErrorTransformer {

        @NotNull
        private final CardErrorTransformer[] transformers;

        public Composite(@NotNull CardErrorTransformer... cardErrorTransformerArr) {
            this.transformers = cardErrorTransformerArr;
        }
    }
}
