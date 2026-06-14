package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f7765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f7766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f7767c;

    private a() {
    }

    public static a a() {
        if (f7765a == null) {
            synchronized (a.class) {
                try {
                    if (f7765a == null) {
                        f7765a = new a();
                    }
                } finally {
                }
            }
        }
        return f7765a;
    }

    private void b() {
        if (this.f7766b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f7767c = new b(context).getWritableDatabase();
        } finally {
        }
        this.f7766b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f7766b;
        if (bVar != null) {
            bVar.a(this.f7767c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f7766b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f7767c, str);
    }
}
