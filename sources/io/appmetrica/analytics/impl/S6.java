package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f76394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f76395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5086f7 f76396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R6 f76397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f76398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f76399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f76400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5058e5 f76401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f76402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f76403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final O6 f76404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C5291n7 f76405l;

    static {
        HashSet hashSet = new HashSet();
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public S6(C5058e5 c5058e5, C5086f7 c5086f7, O6 o62, C5291n7 c5291n7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f76394a = reentrantReadWriteLock.readLock();
        this.f76395b = reentrantReadWriteLock.writeLock();
        this.f76398e = new Object();
        this.f76399f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f76402i = atomicLong;
        this.f76403j = new ArrayList();
        this.f76396c = c5086f7;
        this.f76400g = c5058e5.getContext();
        this.f76401h = c5058e5;
        this.f76404k = o62;
        this.f76405l = c5291n7;
        atomicLong.set(c());
        R6 r62 = new R6(this, c5058e5);
        this.f76397d = r62;
        r62.setName(a(c5058e5));
    }

    public final long a(Set set) {
        this.f76394a.lock();
        Cursor cursorRawQuery = null;
        long j10 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f76396c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb2.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i10 > 0) {
                        sb2.append(" OR ");
                    }
                    sb2.append("type == " + num);
                    i10++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb2.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        no.a(cursorRawQuery);
        this.f76394a.unlock();
        return j10;
    }

    public final long b() {
        this.f76394a.lock();
        try {
            return this.f76402i.get();
        } finally {
            this.f76394a.unlock();
        }
    }

    public final long c() {
        SQLiteDatabase readableDatabase;
        this.f76394a.lock();
        try {
            readableDatabase = this.f76396c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        this.f76394a.unlock();
        return jQueryRowsCount;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f76394a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f76396c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f76394a.unlock();
        no.a(cursorRawQuery);
        no.a(cursorRawQuery2);
    }

    public final void e() {
        this.f76397d.start();
    }

    public final void a(X8 x82) {
        this.f76403j.add(x82);
    }

    public static String a(La la2) {
        return "DatabaseWorker [" + la2.b().e() + C4240b4.j.f42674e;
    }

    public final void a(long j10, EnumC4971al enumC4971al, long j11) {
        JSONObject jSONObject;
        boolean zB;
        B7 b72 = new B7(null, 1, 0 == true ? 1 : 0);
        C5351ph c5351ph = (C5351ph) this.f76401h.f77072k.a();
        Long lValueOf = Long.valueOf(j10);
        Long lValueOf2 = Long.valueOf(j11);
        try {
            jSONObject = new JSONObject().put("dId", c5351ph.getDeviceId()).put("uId", c5351ph.getUuid()).put("appVer", c5351ph.getAppVersion()).put(RemoteConfigConstants.RequestFieldKey.APP_BUILD, c5351ph.getAppBuildNumber()).put("kitBuildType", c5351ph.getAnalyticsSdkBuildType()).put("osVer", c5351ph.getOsVersion()).put("osApiLev", c5351ph.getOsApiLevel()).put(com.ironsource.N6.f41413q, c5351ph.getLocale()).put("root", c5351ph.getDeviceRootStatus()).put("app_debuggable", ((U5) c5351ph).f76556a).put(CommonUrlParts.APP_FRAMEWORK, c5351ph.getAppFramework()).put("attribution_id", c5351ph.f77997r).put("analyticsSdkVersionName", c5351ph.getAnalyticsSdkVersionName()).put("kitBuildNumber", c5351ph.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(Kn.a());
        C5022ck c5022ck = AbstractC4996bk.f76918a;
        synchronized (c5022ck) {
            zB = c5022ck.f76978b.b(true);
        }
        ContentValues contentValuesA = b72.fromModel(new A7(lValueOf, enumC4971al, string, new C5590z7(lValueOf2, lValueOf3, Boolean.valueOf(zB))));
        if (contentValuesA == null) {
            return;
        }
        this.f76395b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f76396c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesA);
            }
        } catch (Throwable unused2) {
        }
        this.f76395b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f76398e) {
            this.f76399f.add(contentValues);
        }
        synchronized (this.f76397d) {
            this.f76397d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f76395b.lock();
            if (this.f76402i.get() > ((C5351ph) this.f76401h.f77072k.a()).f78001v && (writableDatabase = this.f76396c.getWritableDatabase()) != null) {
                int iA = a(writableDatabase);
                this.f76402i.addAndGet(-iA);
                if (iA != 0) {
                    Iterator it = this.f76403j.iterator();
                    while (it.hasNext()) {
                        ((X8) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f76395b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f76404k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", D9.f75665i), TextUtils.join(", ", D9.f75666j), 10), 2, this.f76401h.f77063b.f76663b, true).f76118b;
        } catch (Throwable th2) {
            Vj vj = AbstractC5452tj.f78304a;
            vj.getClass();
            vj.a(new C5477uj("deleteExcessiveReports exception", th2));
            return 0;
        }
    }

    public final void a(long j10, int i10, int i11, boolean z10) {
        if (i11 <= 0) {
            return;
        }
        this.f76395b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j10), "session_type", Integer.toString(i10), "id", "events", Integer.toString(i11 - 1));
            SQLiteDatabase writableDatabase = this.f76396c.getWritableDatabase();
            if (writableDatabase != null) {
                M6 m6A = this.f76404k.a(writableDatabase, str, 1, this.f76401h.f77063b.f76663b, z10);
                if (m6A.f76117a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = m6A.f76117a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f76403j.iterator();
                    while (it2.hasNext()) {
                        ((X8) it2.next()).b(arrayList);
                    }
                }
                List list = m6A.f76117a;
                if (list != null) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        a((ContentValues) list.get(i12), "Event removed from db");
                    }
                }
                this.f76402i.addAndGet(-m6A.f76118b);
            }
        } catch (Throwable unused) {
        }
        this.f76395b.unlock();
    }

    public final ContentValues a(long j10, EnumC4971al enumC4971al) {
        ContentValues contentValues = new ContentValues();
        this.f76394a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f76396c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j10), Integer.valueOf(enumC4971al.f76850a)), null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        no.a(cursorRawQuery);
        this.f76394a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb2 = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb2.append(sb2.length() > 0 ? " AND " : "");
            sb2.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb2.toString())) {
            return null;
        }
        return sb2.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (D9.f75660d.contains(EnumC5168ib.a(asInteger != null ? asInteger.intValue() : -1))) {
            C5266m7 c5266m7A = new C5291n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f76401h.f77074m;
            EnumC5168ib enumC5168ib = c5266m7A.f77741d;
            C5241l7 c5241l7 = c5266m7A.f77744g;
            publicLogger.info(Vf.a(str, enumC5168ib, c5241l7.f77648b, c5241l7.f77649c), new Object[0]);
        }
    }

    public static boolean a(S6 s62) {
        boolean zIsEmpty;
        synchronized (s62.f76398e) {
            zIsEmpty = s62.f76399f.isEmpty();
        }
        return zIsEmpty;
    }
}
