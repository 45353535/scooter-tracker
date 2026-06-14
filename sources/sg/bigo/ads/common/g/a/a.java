package sg.bigo.ads.common.g.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.g.a.c;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c f102418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static AtomicBoolean f102419b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    static SQLiteDatabase f102420c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1261a {
        void a();

        void a(String str);
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f102420c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } catch (SQLException unused) {
            sg.bigo.ads.common.t.a.a(0, "DbHelper", "Failed: ".concat(String.valueOf(contentValues)));
            return 0;
        }
    }

    public static int b(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f102420c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long a(String str, ContentValues contentValues) {
        b();
        if (f102420c != null && !sg.bigo.ads.common.x.a.q()) {
            try {
                return f102420c.insert(str, null, contentValues);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static long b(String str, ContentValues contentValues) {
        b();
        if (f102420c != null && !sg.bigo.ads.common.x.a.q()) {
            try {
                return f102420c.insertWithOnConflict(str, null, contentValues, 5);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static Cursor a(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f102420c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void b() {
        Runnable runnablePoll;
        c cVar = f102418a;
        if (cVar == null || f102419b.get()) {
            return;
        }
        while (true) {
            synchronized (cVar.f102426b) {
                runnablePoll = cVar.f102425a.poll();
            }
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }

    public static Cursor a(String str, String str2, String[] strArr, String str3, int i10) {
        b();
        SQLiteDatabase sQLiteDatabase = f102420c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, str3, Integer.toString(i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a() {
        t.a();
    }

    public static void a(@NonNull Context context) {
        f102419b.set(false);
        f102418a = null;
        a(context, (InterfaceC1261a) null);
    }

    public static void a(@NonNull Context context, @Nullable String str) {
        File databasePath = context.getDatabasePath("bigo_ads_sdk.db");
        sg.bigo.ads.common.t.a.a(0, "DbHelper", String.format("exception path:%s exists:%s isfile:%s read:%s write:%s exec:%s hidden:%s errormsg:%s", databasePath.getPath(), Boolean.valueOf(databasePath.exists()), Boolean.valueOf(databasePath.isFile()), Boolean.valueOf(databasePath.canRead()), Boolean.valueOf(databasePath.canWrite()), Boolean.valueOf(databasePath.canExecute()), Boolean.valueOf(databasePath.isHidden()), str));
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase start");
        context.deleteDatabase("bigo_ads_sdk.db");
        b.a();
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase end");
    }

    public static void a(@NonNull final Context context, final InterfaceC1261a interfaceC1261a) {
        c cVar = new c();
        f102418a = cVar;
        c.a aVar = new c.a(new Runnable() { // from class: sg.bigo.ads.common.g.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init start");
                try {
                    a.f102420c = b.a(context).getWritableDatabase();
                } catch (Throwable th2) {
                    a.a(context, Log.getStackTraceString(th2));
                    try {
                        a.f102420c = b.a(context).getWritableDatabase();
                    } catch (Throwable th3) {
                        sg.bigo.ads.common.t.a.a(0, "DbHelper", "can't get db final," + th3.getMessage());
                        a.f102420c = null;
                    }
                }
                a.f102419b.set(true);
                a.f102418a = null;
                InterfaceC1261a interfaceC1261a2 = interfaceC1261a;
                if (interfaceC1261a2 != null) {
                    if (a.f102420c != null) {
                        interfaceC1261a2.a();
                    } else {
                        interfaceC1261a2.a("");
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init end");
            }
        });
        Runnable runnable = aVar.f102432b;
        synchronized (cVar.f102426b) {
            cVar.f102425a.add(runnable);
        }
        cVar.f102427c.execute(new Runnable() { // from class: sg.bigo.ads.common.g.a.c.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ a f102428a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Runnable f102429b;

            AnonymousClass1(a aVar2, Runnable runnable2) {
                aVar = aVar2;
                runnable = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aVar.run();
                runnable.run();
                synchronized (c.this.f102426b) {
                    c.this.f102425a.remove(runnable);
                }
            }
        });
    }
}
