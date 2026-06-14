package u4;

import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements u4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f105230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EntityInsertAdapter f105231b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EntityInsertAdapter f105232c = new b();

    class a extends EntityInsertAdapter {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, v4.b bVar) {
            sQLiteStatement.mo4251bindLong(1, bVar.f());
            sQLiteStatement.mo4251bindLong(2, bVar.c());
            sQLiteStatement.mo4250bindDouble(3, bVar.b());
            sQLiteStatement.mo4250bindDouble(4, bVar.g());
            sQLiteStatement.mo4250bindDouble(5, bVar.a());
            sQLiteStatement.mo4251bindLong(6, bVar.h());
            if (bVar.i() == null) {
                sQLiteStatement.mo4252bindNull(7);
            } else {
                sQLiteStatement.mo4253bindText(7, bVar.i());
            }
            if (bVar.d() == null) {
                sQLiteStatement.mo4252bindNull(8);
            } else {
                sQLiteStatement.mo4253bindText(8, bVar.d());
            }
            sQLiteStatement.mo4251bindLong(9, bVar.j());
            sQLiteStatement.mo4251bindLong(10, bVar.e());
            if (bVar.k() == null) {
                sQLiteStatement.mo4252bindNull(11);
            } else {
                sQLiteStatement.mo4253bindText(11, bVar.k());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        protected String createQuery() {
            return "INSERT OR ABORT INTO `tracking` (`id`,`duration`,`distance`,`maximum`,`average`,`speeding`,`start_address`,`end_address`,`start_date`,`end_date`,`title`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class b extends EntityInsertAdapter {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, v4.a aVar) {
            sQLiteStatement.mo4251bindLong(1, aVar.a());
            sQLiteStatement.mo4251bindLong(2, aVar.g());
            sQLiteStatement.mo4251bindLong(3, aVar.h());
            sQLiteStatement.mo4251bindLong(4, aVar.c());
            sQLiteStatement.mo4251bindLong(5, aVar.f());
            sQLiteStatement.mo4250bindDouble(6, aVar.d());
            sQLiteStatement.mo4250bindDouble(7, aVar.b());
            sQLiteStatement.mo4250bindDouble(8, aVar.e());
        }

        @Override // androidx.room.EntityInsertAdapter
        protected String createQuery() {
            return "INSERT OR ABORT INTO `route` (`id`,`tracking_id`,`type`,`line`,`timestamp`,`longitude`,`latitude`,`speed`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.f105230a = roomDatabase;
    }

    public static /* synthetic */ List k(int i10, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM route WHERE tracking_id = ?");
        try {
            sQLiteStatementPrepare.mo4251bindLong(1, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tracking_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "line");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "longitude");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "latitude");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speed");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                v4.a aVar = new v4.a(sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getDouble(columnIndexOrThrow6), sQLiteStatementPrepare.getDouble(columnIndexOrThrow7), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow8));
                aVar.i((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                aVar.j((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ v4.b l(int i10, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM tracking WHERE id = ?");
        try {
            sQLiteStatementPrepare.mo4251bindLong(1, i10);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "distance");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "maximum");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "average");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speeding");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start_address");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end_address");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start_date");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end_date");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            v4.b bVar = null;
            if (sQLiteStatementPrepare.step()) {
                v4.b bVar2 = new v4.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                bVar2.l((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                bVar = bVar2;
            }
            return bVar;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object m(String str, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i10 = 1;
        try {
            if (list == null) {
                sQLiteStatementPrepare.mo4252bindNull(1);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Integer) it.next()) == null) {
                        sQLiteStatementPrepare.mo4252bindNull(i10);
                    } else {
                        sQLiteStatementPrepare.mo4251bindLong(i10, r0.intValue());
                    }
                    i10++;
                }
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object o(int i10, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM tracking WHERE id = ?");
        try {
            sQLiteStatementPrepare.mo4251bindLong(1, i10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object q(String str, int i10, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE tracking SET title = ? WHERE id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo4252bindNull(1);
            } else {
                sQLiteStatementPrepare.mo4253bindText(1, str);
            }
            sQLiteStatementPrepare.mo4251bindLong(2, i10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object r(int i10, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM route WHERE tracking_id = ?");
        try {
            sQLiteStatementPrepare.mo4251bindLong(1, i10);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ List s(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM tracking ORDER BY end_date DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "distance");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "maximum");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "average");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speeding");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start_address");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end_address");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start_date");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end_date");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i10 = columnIndexOrThrow2;
                int i11 = columnIndexOrThrow3;
                v4.b bVar = new v4.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.getLong(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                bVar.l((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                arrayList.add(bVar);
                columnIndexOrThrow2 = i10;
                columnIndexOrThrow3 = i11;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object t(String str, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i10 = 1;
        try {
            if (list == null) {
                sQLiteStatementPrepare.mo4252bindNull(1);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Integer) it.next()) == null) {
                        sQLiteStatementPrepare.mo4252bindNull(i10);
                    } else {
                        sQLiteStatementPrepare.mo4251bindLong(i10, r0.intValue());
                    }
                    i10++;
                }
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    public static List u() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long v(v4.a aVar, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f105232c.insertAndReturnId(sQLiteConnection, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long w(v4.b bVar, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f105231b.insertAndReturnId(sQLiteConnection, bVar));
    }

    @Override // u4.a
    public void a(final List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM tracking WHERE id IN (");
        StringUtil.appendPlaceholders(sb2, list == null ? 1 : list.size());
        sb2.append(")");
        final String string = sb2.toString();
        DBUtil.performBlocking(this.f105230a, false, true, new Function1() { // from class: u4.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.t(string, list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public LiveData b() {
        return this.f105230a.getInvalidationTracker().createLiveData(new String[]{"tracking"}, false, new Function1() { // from class: u4.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.s((SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public void c(final int i10) {
        DBUtil.performBlocking(this.f105230a, false, true, new Function1() { // from class: u4.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.r(i10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public void d(final int i10, final String str) {
        DBUtil.performBlocking(this.f105230a, false, true, new Function1() { // from class: u4.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.q(str, i10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public LiveData e(final int i10) {
        return this.f105230a.getInvalidationTracker().createLiveData(new String[]{"tracking"}, false, new Function1() { // from class: u4.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.l(i10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public LiveData f(final int i10) {
        return this.f105230a.getInvalidationTracker().createLiveData(new String[]{"route"}, false, new Function1() { // from class: u4.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.k(i10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public void g(final int i10) {
        DBUtil.performBlocking(this.f105230a, false, true, new Function1() { // from class: u4.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.o(i10, (SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public long h(final v4.a aVar) {
        return ((Long) DBUtil.performBlocking(this.f105230a, false, true, new Function1() { // from class: u4.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f105216b.v(aVar, (SQLiteConnection) obj);
            }
        })).longValue();
    }

    @Override // u4.a
    public void i(final List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM route WHERE tracking_id IN (");
        StringUtil.appendPlaceholders(sb2, list == null ? 1 : list.size());
        sb2.append(")");
        final String string = sb2.toString();
        DBUtil.performBlocking(this.f105230a, false, true, new Function1() { // from class: u4.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.m(string, list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // u4.a
    public long j(final v4.b bVar) {
        return ((Long) DBUtil.performBlocking(this.f105230a, false, true, new Function1() { // from class: u4.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f105225b.w(bVar, (SQLiteConnection) obj);
            }
        })).longValue();
    }
}
