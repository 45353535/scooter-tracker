package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class R6 extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f76336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S6 f76337b;

    public R6(S6 s62, C5058e5 c5058e5) {
        this.f76337b = s62;
        this.f76336a = c5058e5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f76337b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f76337b.f76403j.iterator();
            while (it2.hasNext()) {
                ((X8) it2.next()).a(arrayList2);
            }
            ((C5388r5) this.f76336a.f77077p).e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList<ContentValues> arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (S6.a(this.f76337b)) {
                            wait();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f76337b.f76398e) {
                arrayList = new ArrayList(this.f76337b.f76399f);
                this.f76337b.f76399f.clear();
            }
            S6 s62 = this.f76337b;
            s62.getClass();
            if (!arrayList.isEmpty()) {
                s62.f76395b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = s62.f76396c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            for (ContentValues contentValues : arrayList) {
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                s62.f76402i.incrementAndGet();
                                s62.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            s62.f76402i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                s62.f76395b.unlock();
            }
            a(arrayList);
        }
    }
}
