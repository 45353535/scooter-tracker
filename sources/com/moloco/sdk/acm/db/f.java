package com.moloco.sdk.acm.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.moloco.sdk.acm.db.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements com.moloco.sdk.acm.db.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f53974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f53975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.a f53976c = new com.moloco.sdk.acm.db.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EntityInsertionAdapter f53977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedSQLiteStatement f53978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SharedSQLiteStatement f53979f;

    public class a extends EntityInsertionAdapter {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, com.moloco.sdk.acm.db.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.c());
            if (bVar.d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.d());
            }
            supportSQLiteStatement.bindLong(3, bVar.f());
            String strB = f.this.f53976c.b(bVar.b());
            if (strB == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, strB);
            }
            if (bVar.a() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, bVar.a().longValue());
            }
            String strC = f.this.f53976c.c(bVar.e());
            if (strC == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, strC);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public class b extends EntityInsertionAdapter {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, com.moloco.sdk.acm.db.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.c());
            if (bVar.d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.d());
            }
            supportSQLiteStatement.bindLong(3, bVar.f());
            String strB = f.this.f53976c.b(bVar.b());
            if (strB == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, strB);
            }
            if (bVar.a() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, bVar.a().longValue());
            }
            String strC = f.this.f53976c.c(bVar.e());
            if (strC == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, strC);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM events";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM sqlite_sequence WHERE name='events'";
        }
    }

    public class e implements Callable {
        public e() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            SupportSQLiteStatement supportSQLiteStatementAcquire = f.this.f53979f.acquire();
            f.this.f53974a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                f.this.f53974a.setTransactionSuccessful();
                return Unit.f93236a;
            } finally {
                f.this.f53974a.endTransaction();
                f.this.f53979f.release(supportSQLiteStatementAcquire);
            }
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.acm.db.f$f, reason: collision with other inner class name */
    public class CallableC0655f implements Callable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f53985b;

        public CallableC0655f(List list) {
            this.f53985b = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
            sbNewStringBuilder.append("DELETE FROM events WHERE id IN (");
            StringUtil.appendPlaceholders(sbNewStringBuilder, this.f53985b.size());
            sbNewStringBuilder.append(")");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = f.this.f53974a.compileStatement(sbNewStringBuilder.toString());
            Iterator it = this.f53985b.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                supportSQLiteStatementCompileStatement.bindLong(i10, ((Long) it.next()).longValue());
                i10++;
            }
            f.this.f53974a.beginTransaction();
            try {
                supportSQLiteStatementCompileStatement.executeUpdateDelete();
                f.this.f53974a.setTransactionSuccessful();
                return Unit.f93236a;
            } finally {
                f.this.f53974a.endTransaction();
            }
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f53974a = roomDatabase;
        this.f53975b = new a(roomDatabase);
        this.f53977d = new b(roomDatabase);
        this.f53978e = new c(roomDatabase);
        this.f53979f = new d(roomDatabase);
    }

    public static List f() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.moloco.sdk.acm.db.d
    public Object b(Continuation continuation) {
        return CoroutinesRoom.execute(this.f53974a, true, new e(), continuation);
    }

    @Override // com.moloco.sdk.acm.db.d
    public long c(com.moloco.sdk.acm.db.b bVar) {
        this.f53974a.assertNotSuspendingTransaction();
        this.f53974a.beginTransaction();
        try {
            long jInsertAndReturnId = this.f53975b.insertAndReturnId(bVar);
            this.f53974a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.f53974a.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public Object d(List list, Continuation continuation) {
        return CoroutinesRoom.execute(this.f53974a, true, new CallableC0655f(list), continuation);
    }

    public final /* synthetic */ Object h(Continuation continuation) {
        return d.a.a(this, continuation);
    }

    @Override // com.moloco.sdk.acm.db.d
    public Object a(Continuation continuation) {
        return RoomDatabaseKt.withTransaction(this.f53974a, new Function1() { // from class: com.moloco.sdk.acm.db.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f53973b.h((Continuation) obj);
            }
        }, continuation);
    }

    @Override // com.moloco.sdk.acm.db.d
    public List b() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM events LIMIT 900", 0);
        this.f53974a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f53974a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tags");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new com.moloco.sdk.acm.db.b(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.f53976c.a(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5)), this.f53976c.d(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6))));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
