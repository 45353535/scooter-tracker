package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class SchemaManager extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f24564d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int f24565e = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Migration f24566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Migration f24567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Migration f24568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Migration f24569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Migration f24570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Migration f24571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Migration f24572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List f24573m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24575c;

    public interface Migration {
        void upgrade(SQLiteDatabase sQLiteDatabase);
    }

    static {
        Migration migration = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.c(sQLiteDatabase);
            }
        };
        f24566f = migration;
        Migration migration2 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.m(sQLiteDatabase);
            }
        };
        f24567g = migration2;
        Migration migration3 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f24568h = migration3;
        Migration migration4 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.n(sQLiteDatabase);
            }
        };
        f24569i = migration4;
        Migration migration5 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.f(sQLiteDatabase);
            }
        };
        f24570j = migration5;
        Migration migration6 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.h0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f24571k = migration6;
        Migration migration7 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.i0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.d(sQLiteDatabase);
            }
        };
        f24572l = migration7;
        f24573m = Arrays.asList(migration, migration2, migration3, migration4, migration5, migration6, migration7);
    }

    SchemaManager(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f24575c = false;
        this.f24574b = i10;
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f24564d);
    }

    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void o(SQLiteDatabase sQLiteDatabase) {
        if (this.f24575c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    private void p(SQLiteDatabase sQLiteDatabase, int i10) {
        o(sQLiteDatabase);
        q(sQLiteDatabase, 0, i10);
    }

    private void q(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f24573m;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                ((Migration) f24573m.get(i10)).upgrade(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f24575c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        p(sQLiteDatabase, this.f24574b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        p(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        o(sQLiteDatabase);
        q(sQLiteDatabase, i10, i11);
    }
}
