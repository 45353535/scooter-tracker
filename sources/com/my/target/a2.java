package com.my.target;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a2 f59081e = new a2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f59082f = new a("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f59083a = new LruCache(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f59084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f59085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59086d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f59087a = SystemClock.elapsedRealtime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f59088b;

        public a(String str) {
            this.f59088b = str;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f59089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f59090b;

        public b(String str, String str2) {
            this.f59089a = str;
            this.f59090b = str2;
        }
    }

    public static String a(long j10, String str) {
        if (str.isEmpty()) {
            return "";
        }
        String str2 = ":2:" + j10;
        return str.replace(StringUtils.COMMA, str2 + StringUtils.COMMA) + str2;
    }

    public a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return f59082f;
        }
        return new a(str);
    }

    public synchronized void a(long j10) {
        if (this.f59086d) {
            return;
        }
        this.f59084b = j10 * 1000;
        this.f59085c = SystemClock.elapsedRealtime();
        this.f59086d = true;
    }

    public synchronized void a(List list, long j10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strR = ((com.my.target.b) it.next()).r();
            this.f59083a.put(strR, strR + ":1:" + j10);
        }
    }

    public synchronized b a(a aVar) {
        String strJoin;
        String str;
        String str2;
        try {
            Map mapSnapshot = this.f59083a.snapshot();
            if (mapSnapshot.isEmpty()) {
                str = "";
                strJoin = "";
            } else {
                String strJoin2 = TextUtils.join(StringUtils.COMMA, mapSnapshot.keySet());
                strJoin = TextUtils.join(StringUtils.COMMA, mapSnapshot.values());
                str = strJoin2;
            }
            String strA = a(this.f59086d ? ((this.f59084b + aVar.f59087a) - this.f59085c) / 1000 : 0L, aVar.f59088b);
            if (!strJoin.isEmpty() && !strA.isEmpty()) {
                str2 = strJoin + StringUtils.COMMA + strA;
            } else {
                str2 = strJoin + strA;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new b(str, str2);
    }
}
