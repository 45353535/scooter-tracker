package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.rawjson.RawJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/storage/database/StorageStatements;", "", "<init>", "()V", "T", "", "", "asSqlList", "(Ljava/util/Collection;)Ljava/lang/String;", "", "Lcom/yandex/div/storage/rawjson/RawJson;", "rawJsons", "Lkotlin/Function1;", "", "onFailedTransactions", "Lcom/yandex/div/storage/database/StorageStatement;", "replaceRawJsons", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/StorageStatement;", "", "elementIds", "deleteRawJsons", "(Ljava/util/Set;)Lcom/yandex/div/storage/database/StorageStatement;", "Lcom/yandex/div/storage/database/ReadState;", "reader", "readRawJsons", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/StorageStatement;", "dropAllTables", "()Lcom/yandex/div/storage/database/StorageStatement;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StorageStatements {

    @NotNull
    public static final StorageStatements INSTANCE = new StorageStatements();

    private StorageStatements() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String asSqlList(Collection<? extends T> collection) {
        return CollectionsKt.joinToString$default(collection, "', '", "('", "')", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StorageStatement replaceRawJsons$default(StorageStatements storageStatements, List list, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1<List<? extends String>, Unit>() { // from class: com.yandex.div.storage.database.StorageStatements.replaceRawJsons.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list2) {
                    invoke2((List<String>) list2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<String> list2) {
                    throw new SQLException("Insertion failed for raw jsons with ids: " + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, null, 63, null));
                }
            };
        }
        return storageStatements.replaceRawJsons(list, function1);
    }

    @NotNull
    public final StorageStatement deleteRawJsons(@NotNull final Set<String> elementIds) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements.deleteRawJsons.1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                compiler.compileStatement("DELETE FROM raw_json WHERE raw_json_id IN " + StorageStatements.INSTANCE.asSqlList(elementIds)).executeUpdateDelete();
            }

            @NotNull
            public String toString() {
                return "Deleting raw jsons with ids: " + elementIds;
            }
        };
    }

    @NotNull
    public final StorageStatement dropAllTables() {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements.dropAllTables.1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) throws IOException {
                ArrayList arrayList = new ArrayList();
                ReadState readStateCompileQuery = compiler.compileQuery("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
                try {
                    Cursor cursor = readStateCompileQuery.getCursor();
                    if (!cursor.moveToFirst()) {
                        c.a(readStateCompileQuery, null);
                        return;
                    }
                    do {
                        arrayList.add(cursor.getString(cursor.getColumnIndexOrThrow("name")));
                    } while (cursor.moveToNext());
                    Unit unit = Unit.f93236a;
                    c.a(readStateCompileQuery, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        compiler.compileStatement("DROP TABLE IF EXISTS " + ((String) it.next())).execute();
                    }
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Drop all database tables";
            }
        };
    }

    @NotNull
    public final StorageStatement readRawJsons(@NotNull final Function1<? super ReadState, Unit> reader) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements.readRawJsons.1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) throws IOException {
                ReadState readStateCompileQuery = compiler.compileQuery("SELECT * FROM raw_json", new String[0]);
                try {
                    reader.invoke(readStateCompileQuery);
                    c.a(readStateCompileQuery, null);
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Selecting all raw jsons";
            }
        };
    }

    @NotNull
    public final StorageStatement replaceRawJsons(@NotNull List<? extends RawJson> rawJsons, @NotNull Function1<? super List<String>, Unit> onFailedTransactions) {
        return new StorageStatement(rawJsons, onFailedTransactions) { // from class: com.yandex.div.storage.database.StorageStatements.replaceRawJsons.2
            final /* synthetic */ Function1<List<String>, Unit> $onFailedTransactions;
            final /* synthetic */ List<RawJson> $rawJsons;

            /* JADX INFO: renamed from: cardIdsString$delegate, reason: from kotlin metadata */
            @NotNull
            private final Lazy cardIdsString;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$rawJsons = rawJsons;
                this.$onFailedTransactions = onFailedTransactions;
                this.cardIdsString = i.b(l.f94211d, new Function0<String>() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return CollectionsKt.joinToString$default(rawJsons, null, null, null, 0, null, new Function1<RawJson, CharSequence>() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final CharSequence invoke(@NotNull RawJson rawJson) {
                                return rawJson.getId();
                            }
                        }, 31, null);
                    }
                });
            }

            private final String getCardIdsString() {
                return (String) this.cardIdsString.getValue();
            }

            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                ArrayList arrayList = new ArrayList();
                SQLiteStatement sQLiteStatementCompileStatement = compiler.compileStatement("INSERT OR REPLACE INTO raw_json VALUES (?, ?)");
                for (RawJson rawJson : this.$rawJsons) {
                    sQLiteStatementCompileStatement.bindString(1, rawJson.getId());
                    byte[] bytes = rawJson.getData().toString().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    sQLiteStatementCompileStatement.bindBlob(2, bytes);
                    Long lValueOf = Long.valueOf(sQLiteStatementCompileStatement.executeInsert());
                    if (lValueOf.longValue() >= 0) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        arrayList.add(rawJson.getId());
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.$onFailedTransactions.invoke(arrayList);
            }

            @NotNull
            public String toString() {
                return "Replace raw jsons (" + getCardIdsString() + ')';
            }
        };
    }
}
