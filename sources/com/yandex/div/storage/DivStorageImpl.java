package com.yandex.div.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.Migration;
import com.yandex.div.storage.database.ReadState;
import com.yandex.div.storage.database.SingleTransactionDataSavePerformer;
import com.yandex.div.storage.database.StorageStatementExecutor;
import com.yandex.div.storage.database.StorageStatements;
import com.yandex.div.storage.rawjson.RawJson;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kf.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 X2\u00020\u0001:\u0002XYB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0013¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010H\u0013¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u0019*\u00060\u0015j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u001f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0010H\u0013¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020#*\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0006H\u0012¢\u0006\u0004\b$\u0010%J\u0013\u0010(\u001a\u00020'*\u00020&H\u0012¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001cH\u0017¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020#H\u0017¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001cH\u0017¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001cH\u0017¢\u0006\u0004\b3\u0010-J%\u00108\u001a\u0002072\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b8\u00109J#\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0:2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0017¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020=2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010H\u0017¢\u0006\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010F\u001a\u00020E8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020L8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bM\u0010NR2\u0010R\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0P\u0012\u0004\u0012\u00020Q0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020Q8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl;", "Lcom/yandex/div/storage/DivStorage;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/storage/database/DatabaseOpenHelperProvider;", "openHelperProvider", "", "databaseNamePrefix", "<init>", "(Landroid/content/Context;Lcom/yandex/div/storage/database/DatabaseOpenHelperProvider;Ljava/lang/String;)V", "", "rawJsonIds", "", "Lcom/yandex/div/storage/rawjson/RawJson;", "collectsRawJsons", "(Ljava/util/Set;)Ljava/util/List;", "Lkotlin/Function1;", "", "predicate", "collectsRawJsonsIdsFor", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Set;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "actionDesc", "cardId", "Lcom/yandex/div/storage/DivStorageErrorException;", "toStorageException", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/storage/DivStorageErrorException;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "Landroid/database/Cursor;", "func", "Lcom/yandex/div/storage/database/ReadState;", "readStateFor", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/ReadState;", "columnName", "", "indexOf", "(Landroid/database/Cursor;Ljava/lang/String;)I", "", "Lorg/json/JSONObject;", "toJSONObject", "([B)Lorg/json/JSONObject;", "db", "", "onCreate", "(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", "oldVersion", "newVersion", "onUpgrade", "(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", "createTables", "dropTables", "rawJsons", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lcom/yandex/div/storage/database/ExecutionResult;", "saveRawJsons", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/database/ExecutionResult;", "Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "readRawJsons", "(Ljava/util/Set;)Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "Lcom/yandex/div/storage/DivStorage$RemoveResult;", "removeRawJsons", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/DivStorage$RemoveResult;", "dbName", "Ljava/lang/String;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper;", "openHelper", "Lcom/yandex/div/storage/database/DatabaseOpenHelper;", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "statementExecutor", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "getStatementExecutor", "()Lcom/yandex/div/storage/database/StorageStatementExecutor;", "getStatementExecutor$annotations", "()V", "Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "dataSaveUseCase", "Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "", "Lkotlin/Pair;", "Lcom/yandex/div/storage/database/Migration;", "migrations", "Ljava/util/Map;", "getMigrations", "()Ljava/util/Map;", "defaultDropAllMigration", "Lcom/yandex/div/storage/database/Migration;", y.f66058y, "CursorDrivenRawJson", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivStorageImpl implements DivStorage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SingleTransactionDataSavePerformer dataSaveUseCase;

    @NotNull
    private final String dbName;

    @NotNull
    private final Migration defaultDropAllMigration;

    @NotNull
    private final Map<Pair<Integer, Integer>, Migration> migrations;

    @NotNull
    private final DatabaseOpenHelper openHelper;

    @NotNull
    private final StorageStatementExecutor statementExecutor;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0006H\u0002¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$Companion;", "", "()V", "asSqlList", "", "T", "", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> String asSqlList(Collection<? extends T> collection) {
            return CollectionsKt.joinToString$default(collection, "', '", "('", "')", 0, null, null, 56, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$CursorDrivenRawJson;", "Lcom/yandex/div/storage/rawjson/RawJson;", "Ljava/io/Closeable;", "cursor", "Landroid/database/Cursor;", "(Lcom/yandex/div/storage/DivStorageImpl;Landroid/database/Cursor;)V", "getCursor", "()Landroid/database/Cursor;", "cursorInvalid", "", "data", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "data$delegate", "Lkotlin/Lazy;", "id", "", "getId", "()Ljava/lang/String;", "close", "", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class CursorDrivenRawJson implements RawJson, Closeable, AutoCloseable {

        @NotNull
        private final Cursor cursor;
        private boolean cursorInvalid;

        /* JADX INFO: renamed from: data$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy data;

        @NotNull
        private final String id;

        public CursorDrivenRawJson(@NotNull Cursor cursor) {
            this.cursor = cursor;
            this.id = cursor.getString(DivStorageImpl.this.indexOf(cursor, "raw_json_id"));
            this.data = i.b(l.f94211d, new Function0<JSONObject>() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawJson$data$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final JSONObject invoke() {
                    if (this.this$0.cursorInvalid) {
                        throw new IllegalStateException("Data no longer valid!");
                    }
                    return divStorageImpl.toJSONObject(this.this$0.getCursor().getBlob(divStorageImpl.indexOf(this.this$0.getCursor(), "raw_json_data")));
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.cursorInvalid = true;
        }

        @NotNull
        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public JSONObject getData() {
            return (JSONObject) this.data.getValue();
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public String getId() {
            return this.id;
        }
    }

    public DivStorageImpl(@NotNull Context context, @NotNull DatabaseOpenHelperProvider databaseOpenHelperProvider, @NotNull String str) {
        String str2;
        if (str.length() == 0) {
            str2 = "div-storage.db";
        } else {
            str2 = str + "-div-storage.db";
        }
        String str3 = str2;
        this.dbName = str3;
        this.openHelper = databaseOpenHelperProvider.provide(context, str3, 3, new DivStorageImpl$openHelper$1(this), new DivStorageImpl$openHelper$2(this));
        this.statementExecutor = new StorageStatementExecutor(new Function0<DatabaseOpenHelper.Database>() { // from class: com.yandex.div.storage.DivStorageImpl$statementExecutor$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DatabaseOpenHelper.Database invoke() {
                return this.this$0.openHelper.getWritableDatabase();
            }
        });
        this.dataSaveUseCase = new SingleTransactionDataSavePerformer(getStatementExecutor());
        this.migrations = MapsKt.mapOf(TuplesKt.to(TuplesKt.to(2, 3), new Migration() { // from class: i8.c
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.migrations$lambda$0(database);
            }
        }));
        this.defaultDropAllMigration = new Migration() { // from class: i8.d
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.defaultDropAllMigration$lambda$1(this.f73971a, database);
            }
        };
    }

    @AnyThread
    private List<RawJson> collectsRawJsons(final Set<String> rawJsonIds) throws IOException, SQLException {
        ArrayList arrayList = new ArrayList(rawJsonIds.size());
        ReadState stateFor = readStateFor(new Function1<DatabaseOpenHelper.Database, Cursor>() { // from class: com.yandex.div.storage.DivStorageImpl.collectsRawJsons.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Cursor invoke(@NotNull DatabaseOpenHelper.Database database) {
                return database.rawQuery("\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n " + DivStorageImpl.INSTANCE.asSqlList(rawJsonIds), new String[0]);
            }
        });
        try {
            Cursor cursor = stateFor.getCursor();
            if (cursor.getCount() != 0 && cursor.moveToFirst()) {
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = new CursorDrivenRawJson(cursor);
                    arrayList.add(new RawJson.Ready(cursorDrivenRawJson.getId(), cursorDrivenRawJson.getData()));
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
            Unit unit = Unit.f93236a;
            c.a(stateFor, null);
            return arrayList;
        } finally {
        }
    }

    @AnyThread
    private Set<String> collectsRawJsonsIdsFor(final Function1<? super RawJson, Boolean> predicate) throws SQLException {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        getStatementExecutor().execute(StorageStatements.INSTANCE.readRawJsons(new Function1<ReadState, Unit>() { // from class: com.yandex.div.storage.DivStorageImpl.collectsRawJsonsIdsFor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ReadState readState) {
                invoke2(readState);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ReadState readState) {
                Cursor cursor = readState.getCursor();
                if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
                    return;
                }
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = DivStorageImpl.this.new CursorDrivenRawJson(cursor);
                    if (predicate.invoke(cursorDrivenRawJson).booleanValue()) {
                        linkedHashSet.add(cursorDrivenRawJson.getId());
                    }
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
        }));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultDropAllMigration$lambda$1(DivStorageImpl divStorageImpl, DatabaseOpenHelper.Database database) {
        divStorageImpl.dropTables(database);
        divStorageImpl.createTables(database);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalStateException("Column '" + str + "' not found in cursor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrations$lambda$0(DatabaseOpenHelper.Database database) {
        try {
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e10) {
            throw new SQLException("Create \"raw_json\" table", e10);
        }
    }

    @AnyThread
    private ReadState readStateFor(final Function1<? super DatabaseOpenHelper.Database, ? extends Cursor> func) {
        final DatabaseOpenHelper.Database readableDatabase = this.openHelper.getReadableDatabase();
        return new ReadState(new Function0<Unit>() { // from class: com.yandex.div.storage.DivStorageImpl.readStateFor.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SqlExtensionsKt.closeSilently(readableDatabase);
            }
        }, new a() { // from class: i8.b
            @Override // kf.a
            public final Object get() {
                return DivStorageImpl.readStateFor$lambda$12(readableDatabase, func);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor readStateFor$lambda$12(DatabaseOpenHelper.Database database, Function1 function1) {
        return (Cursor) function1.invoke(database);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject toJSONObject(byte[] bArr) {
        return new JSONObject(new String(bArr, StandardCharsets.UTF_8));
    }

    private DivStorageErrorException toStorageException(Exception exc, String str, String str2) {
        return new DivStorageErrorException("Unexpected exception on database access: " + str, exc, str2);
    }

    static /* synthetic */ DivStorageErrorException toStorageException$default(DivStorageImpl divStorageImpl, Exception exc, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toStorageException");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return divStorageImpl.toStorageException(exc, str, str2);
    }

    @VisibleForTesting
    public void createTables(@NotNull DatabaseOpenHelper.Database db2) throws SQLException {
        try {
            db2.execSQL("\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)");
            db2.execSQL("\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))");
            db2.execSQL("\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)");
            db2.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e10) {
            throw new SQLException("Create tables", e10);
        }
    }

    @VisibleForTesting
    public void dropTables(@NotNull final DatabaseOpenHelper.Database db2) throws SQLException {
        new StorageStatementExecutor(new Function0<DatabaseOpenHelper.Database>() { // from class: com.yandex.div.storage.DivStorageImpl.dropTables.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DatabaseOpenHelper.Database invoke() {
                return db2;
            }
        }).execute(StorageStatements.INSTANCE.dropAllTables());
    }

    @NotNull
    public Map<Pair<Integer, Integer>, Migration> getMigrations() {
        return this.migrations;
    }

    @NotNull
    public StorageStatementExecutor getStatementExecutor() {
        return this.statementExecutor;
    }

    @VisibleForTesting
    public void onCreate(@NotNull DatabaseOpenHelper.Database db2) {
        createTables(db2);
    }

    @VisibleForTesting
    public void onUpgrade(@NotNull DatabaseOpenHelper.Database db2, int oldVersion, int newVersion) {
        KAssert kAssert = KAssert.INSTANCE;
        Integer numValueOf = Integer.valueOf(newVersion);
        if (Assert.isEnabled()) {
            Assert.assertEquals("", numValueOf, 3);
        }
        if (oldVersion == 3) {
            return;
        }
        Migration migration = getMigrations().get(TuplesKt.to(Integer.valueOf(oldVersion), Integer.valueOf(newVersion)));
        if (migration == null) {
            migration = this.defaultDropAllMigration;
        }
        try {
            migration.migrate(db2);
        } catch (SQLException e10) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Migration from " + oldVersion + " to " + newVersion + " throws exception", e10);
            }
            this.defaultDropAllMigration.migrate(db2);
        }
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public DivStorage.LoadDataResult<RawJson> readRawJsons(@NotNull Set<String> rawJsonIds) throws IOException {
        String str = "Read raw jsons with ids: " + rawJsonIds;
        ArrayList arrayList = new ArrayList();
        List<RawJson> listEmptyList = CollectionsKt.emptyList();
        try {
            listEmptyList = collectsRawJsons(rawJsonIds);
        } catch (SQLException e10) {
            arrayList.add(toStorageException$default(this, e10, str, null, 2, null));
        } catch (IllegalStateException e11) {
            arrayList.add(toStorageException$default(this, e11, str, null, 2, null));
        }
        return new DivStorage.LoadDataResult<>(listEmptyList, arrayList);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public DivStorage.RemoveResult removeRawJsons(@NotNull Function1<? super RawJson, Boolean> predicate) {
        Set<String> setCollectsRawJsonsIdsFor = collectsRawJsonsIdsFor(predicate);
        return new DivStorage.RemoveResult(setCollectsRawJsonsIdsFor, getStatementExecutor().execute(DivDataRepository.ActionOnError.SKIP_ELEMENT, StorageStatements.INSTANCE.deleteRawJsons(setCollectsRawJsonsIdsFor)).getErrors());
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError) {
        return this.dataSaveUseCase.saveRawJsons(rawJsons, actionOnError);
    }
}
