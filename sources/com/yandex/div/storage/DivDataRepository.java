package com.yandex.div.storage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository;", "", "ActionOnError", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivDataRepository {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "", "(Ljava/lang/String;I)V", "ABORT_TRANSACTION", "SKIP_ELEMENT", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ActionOnError {
        ABORT_TRANSACTION,
        SKIP_ELEMENT
    }
}
