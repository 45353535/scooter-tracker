package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9 f65455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8 f65456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f65457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c4 f65458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f65459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aa f65460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4 f65461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f65462h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f65463i = new AtomicLong();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n9 f65464j = new n9(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o9 f65465k = new o9(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p9 f65466l = new p9(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q9 f65467m = new q9(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v9 f65468n = new v9(this);

    public w9(k9 k9Var, m8 m8Var, ThreadPoolExecutor threadPoolExecutor, c4 c4Var, lb lbVar, aa aaVar, d4 d4Var) {
        this.f65455a = k9Var;
        this.f65456b = m8Var;
        this.f65457c = threadPoolExecutor;
        this.f65458d = c4Var;
        this.f65459e = lbVar;
        this.f65460f = aaVar;
        this.f65461g = d4Var;
    }

    public final void a() {
        if (this.f65463i.compareAndSet(0L, SystemClock.uptimeMillis())) {
            k9 k9Var = this.f65455a;
            p9 p9Var = this.f65466l;
            synchronized (k9Var) {
                k9Var.f64825c.add(p9Var);
            }
            ((g6) this.f65459e.a()).a(this.f65464j);
            ((g6) this.f65459e.a()).a();
            m8 m8Var = this.f65456b;
            m8Var.f64912a.post(new u9(this));
        }
    }

    public final void b(g9 g9Var) {
        j9 j9VarA = a(g9Var.f64550a);
        long jUptimeMillis = (this.f65463i.get() + j9VarA.f64755f) - SystemClock.uptimeMillis();
        if (jUptimeMillis > 0) {
            a(jUptimeMillis);
            return;
        }
        k9 k9Var = this.f65455a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        k9Var.getClass();
        long j10 = g9Var.f64551b;
        k9.a(j10, jCurrentTimeMillis);
        SQLiteDatabase sQLiteDatabaseA = k9Var.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            int iA = k9.a(sQLiteDatabaseA, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(iA + 1));
            sQLiteDatabaseA.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            q9 q9Var = this.f65467m;
            Runnable runnable = (Runnable) this.f65460f.a(g9Var, j9VarA, q9Var);
            if (runnable != null) {
                this.f65457c.execute(runnable);
            } else if (q9Var != null) {
                q9Var.a(g9Var, 0);
            }
        } catch (Throwable th2) {
            sQLiteDatabaseA.endTransaction();
            throw th2;
        }
    }

    public final j9 a(h9 h9Var) {
        j9 j9Var;
        Map mapB;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f65462h) {
            try {
                Pair pair = (Pair) this.f65462h.get(h9Var.f64622a);
                j9Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (j9) pair.first;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (j9Var != null) {
            return j9Var;
        }
        this.f65461g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        if (analyticsConfigH != null && (mapB = analyticsConfigH.b()) != null && (analyticsCategoryConfig = (AnalyticsCategoryConfig) mapB.get(h9Var.f64622a)) != null) {
            j9Var = new j9(h9Var.f64623b, analyticsCategoryConfig);
        }
        if (j9Var == null) {
            j9Var = h9Var.f64623b;
        }
        synchronized (this.f65462h) {
            this.f65462h.put(h9Var.f64622a, new Pair(j9Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return j9Var;
    }

    public final void b() {
        this.f65456b.f64912a.removeCallbacks(this.f65465k);
        if (!((g6) this.f65459e.a()).b()) {
            this.f65461g.getClass();
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            a(analyticsConfigH != null ? Math.max(300000L, vi.e(analyticsConfigH.f())) : 300000L);
        } else {
            int iMax = Math.max(1, ((Integer) this.f65458d.a()).intValue());
            this.f65461g.getClass();
            AnalyticsConfig analyticsConfigH2 = MetaData.E().h();
            try {
                this.f65455a.a(this.f65468n, analyticsConfigH2 != null ? Math.max(1, analyticsConfigH2.g()) : 1, iMax);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(g9 g9Var) {
        this.f65461g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        if (analyticsConfigH == null || analyticsConfigH.k()) {
            return;
        }
        j9 j9VarA = a(g9Var.f64550a);
        if (Math.random() >= j9VarA.f64750a) {
            return;
        }
        if (j9VarA.f64753d) {
            m8 m8Var = this.f65456b;
            m8Var.f64912a.post(new s9(this, g9Var, j9VarA));
        } else if (((g6) this.f65459e.a()).b()) {
            long jUptimeMillis = (this.f65463i.get() + j9VarA.f64755f) - SystemClock.uptimeMillis();
            if (jUptimeMillis > 0) {
                m8 m8Var2 = this.f65456b;
                m8Var2.f64912a.postDelayed(new t9(this, g9Var, j9VarA), jUptimeMillis);
            } else {
                Runnable runnable = (Runnable) this.f65460f.a(g9Var, j9VarA, null);
                if (runnable != null) {
                    this.f65457c.execute(runnable);
                }
            }
        }
    }

    public final void a(long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        this.f65456b.f64912a.postDelayed(this.f65465k, j10);
    }

    public final void a(g9 g9Var, int i10, long j10) {
        if (i10 == 1) {
            k9 k9Var = this.f65455a;
            k9Var.getClass();
            long j11 = g9Var.f64551b;
            k9.a(j11, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j10));
            k9Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j11)});
            a(0L);
            return;
        }
        this.f65461g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        int iMax = analyticsConfigH != null ? Math.max(1, analyticsConfigH.g()) : 1;
        k9 k9Var2 = this.f65455a;
        k9Var2.getClass();
        long j12 = g9Var.f64551b;
        k9.a(j12, j10);
        SQLiteDatabase sQLiteDatabaseA = k9Var2.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            if (k9.a(sQLiteDatabaseA, j12) >= iMax) {
                sQLiteDatabaseA.delete("events", "rowid = ?", new String[]{String.valueOf(j12)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j10));
                sQLiteDatabaseA.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j12)});
            }
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            this.f65461g.getClass();
            AnalyticsConfig analyticsConfigH2 = MetaData.E().h();
            a(analyticsConfigH2 != null ? Math.max(1000L, analyticsConfigH2.h()) : 1000L);
        } catch (Throwable th2) {
            sQLiteDatabaseA.endTransaction();
            throw th2;
        }
    }
}
