package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5086f7 extends SQLiteOpenHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicLogger f77150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5257ln f77151c;

    public C5086f7(Context context, String str, C5257ln c5257ln, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, D5.f75655b);
        this.f77151c = c5257ln;
        this.f77149a = str;
        this.f77150b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f77150b.error(th2, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f77149a);
            Vj vj = AbstractC5452tj.f78304a;
            vj.getClass();
            vj.a(new C5477uj("db_read_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f77150b.error(th2, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f77149a);
            Vj vj = AbstractC5452tj.f78304a;
            vj.getClass();
            vj.a(new C5477uj("db_write_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f77151c.f77719a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        C5257ln c5257ln = this.f77151c;
        if (i10 <= i11) {
            c5257ln.getClass();
            return;
        }
        try {
            c5257ln.f77720b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c5257ln.f77719a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C5257ln c5257ln = this.f77151c;
        c5257ln.getClass();
        try {
            InterfaceC5282mn interfaceC5282mn = c5257ln.f77722d;
            if (interfaceC5282mn == null || interfaceC5282mn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c5257ln.f77720b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c5257ln.f77719a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        boolean z10;
        C5257ln c5257ln = this.f77151c;
        c5257ln.getClass();
        if (i11 > i10) {
            for (int i12 = i10 + 1; i12 <= i11; i12++) {
                try {
                    Collection collection = (Collection) c5257ln.f77721c.f78497a.get(Integer.valueOf(i12));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || (!c5257ln.f77722d.a(sQLiteDatabase))) {
            try {
                c5257ln.f77720b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c5257ln.f77719a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
