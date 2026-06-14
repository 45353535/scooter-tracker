package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class P4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76219a = 2000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76220b = "number";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76221c = "global_number";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76222d = "number_of_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76223e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f76224f = "value";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f76225g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f76226h = "time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f76227i = "session_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f76228j = "error_environment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f76229k = "session_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f76230l = "app_environment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f76231m = "app_environment_revision";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f76232n = "truncated";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f76233o = "custom_type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f76234p = "encrypting_mode";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f76235q = "profile_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f76236r = "first_occurrence_status";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f76237s = "source";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f76238t = "attribution_id_changed";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f76239u = "open_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f76240v = HandleInvocationsFromAdViewer.KEY_EXTRAS;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f76241w = "reports";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C5291n7 f76242x = new C5291n7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C5266m7 c5266m7) {
        Long l10;
        EnumC5168ib enumC5168ib;
        Long l11;
        Long l12;
        Long l13 = c5266m7.f77738a;
        if (l13 == null || l13.longValue() < RealConnection.IDLE_CONNECTION_HEALTHY_NS || c5266m7.f77739b == null || (l10 = c5266m7.f77740c) == null || l10.longValue() < 0 || (enumC5168ib = c5266m7.f77741d) == null || enumC5168ib == EnumC5168ib.EVENT_TYPE_UNDEFINED || (l11 = c5266m7.f77742e) == null || l11.longValue() < 0 || (l12 = c5266m7.f77743f) == null || l12.longValue() < 0) {
            return false;
        }
        Long l14 = c5266m7.f77744g.f77650d;
        if (l14 != null && l14.longValue() < 0) {
            return false;
        }
        Integer num = c5266m7.f77744g.f77655i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursorQuery = sQLiteDatabase2.query(this.f76241w, null, null, null, null, null, null, String.valueOf(this.f76219a));
                while (cursorQuery.moveToNext()) {
                    try {
                        C5266m7 c5266m7A = a(cursorQuery);
                        if (c5266m7A != null && a(c5266m7A)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f76242x.fromModel(c5266m7A));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursorQuery = cursor;
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f76241w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursorQuery.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f76241w);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[PHI: r4
  0x0115: PHI (r4v8 io.appmetrica.analytics.impl.t9) = (r4v7 io.appmetrica.analytics.impl.t9), (r4v9 io.appmetrica.analytics.impl.t9), (r4v10 io.appmetrica.analytics.impl.t9) binds: [B:38:0x0120, B:32:0x0113, B:35:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5266m7 a(android.database.Cursor r32) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.P4.a(android.database.Cursor):io.appmetrica.analytics.impl.m7");
    }
}
