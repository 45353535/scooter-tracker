package com.yandex.div.storage.util;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/io/Closeable;", "", "closeSilently", "(Ljava/io/Closeable;)V", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "endTransactionSilently", "(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", "div-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class SqlExtensionsKt {
    public static final void closeSilently(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void endTransactionSilently(@NotNull DatabaseOpenHelper.Database database) {
        try {
            database.endTransaction();
        } catch (IllegalStateException unused) {
        }
    }
}
