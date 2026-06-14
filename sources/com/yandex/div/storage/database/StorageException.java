package com.yandex.div.storage.database;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/storage/database/StorageException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PglCryptUtils.KEY_MESSAGE, "", "cause", "", "cardId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class StorageException extends Exception {

    @Nullable
    private final String cardId;

    public StorageException(@Nullable String str, @Nullable Throwable th2, @Nullable String str2) {
        super(str, th2);
        this.cardId = str2;
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
    }
}
