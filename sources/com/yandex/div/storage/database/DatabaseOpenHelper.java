package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/DatabaseOpenHelper;", "", "readableDatabase", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "getReadableDatabase", "()Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "writableDatabase", "getWritableDatabase", "CreateCallback", "Database", "UpgradeCallback", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DatabaseOpenHelper {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/DatabaseOpenHelper$CreateCallback;", "", "onCreate", "", "db", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface CreateCallback {
        void onCreate(@NotNull Database db2);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "Ljava/io/Closeable;", "", "sql", "", "execSQL", "(Ljava/lang/String;)V", "query", "", "selectionArgs", "Landroid/database/Cursor;", "rawQuery", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "beginTransaction", "()V", "setTransactionSuccessful", "endTransaction", "Landroid/database/sqlite/SQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Database extends Closeable {
        void beginTransaction();

        @NotNull
        SQLiteStatement compileStatement(@NotNull String sql);

        void endTransaction();

        void execSQL(@NotNull String sql);

        @NotNull
        Cursor rawQuery(@NotNull String query, @Nullable String[] selectionArgs);

        void setTransactionSuccessful();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/database/DatabaseOpenHelper$UpgradeCallback;", "", "onUpgrade", "", "db", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "oldVersion", "", "newVersion", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface UpgradeCallback {
        void onUpgrade(@NotNull Database db2, int oldVersion, int newVersion);
    }

    @NotNull
    Database getReadableDatabase();

    @NotNull
    Database getWritableDatabase();
}
