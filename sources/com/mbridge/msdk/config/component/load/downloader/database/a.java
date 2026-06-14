package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.ironsource.V5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;

/* JADX INFO: loaded from: classes10.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.d f47037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f47038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47039c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f47040d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    class RunnableC0498a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f47041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f47043c;

        RunnableC0498a(c.a aVar, String str, String str2) {
            this.f47041a = aVar;
            this.f47042b = str;
            this.f47043c = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v12, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r0v14 */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Cursor cursorRawQuery;
            c.a aVar;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d)) {
                a aVar2 = a.this;
                aVar2.f47040d = aVar2.f47037a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = null;
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d)) {
                ?? IsOpen = a.this.f47040d.isOpen();
                try {
                    if (IsOpen != 0) {
                        try {
                            cursorRawQuery = a.this.f47040d.rawQuery("SELECT * FROM " + a.this.f47039c + " WHERE " + TaxBrowserActivity.f66923n + " = ? AND " + V5.c.f41893c + " = ?", new String[]{this.f47042b, this.f47043c});
                            if (cursorRawQuery != null) {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(cursorRawQuery);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (MBridgeConstans.DEBUG) {
                                        e.printStackTrace();
                                    }
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    aVar = this.f47041a;
                                    if (aVar == null) {
                                        return;
                                    }
                                }
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            aVar = this.f47041a;
                            if (aVar == null) {
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                            IsOpen = 0;
                            if (IsOpen != 0) {
                                IsOpen.close();
                            }
                            c.a aVar3 = this.f47041a;
                            if (aVar3 != null) {
                                aVar3.a(null);
                            }
                            throw th;
                        }
                        aVar.a(bVarA);
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f47041a)) {
                this.f47041a.a(null);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f47045a;

        b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f47045a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d)) {
                a aVar = a.this;
                aVar.f47040d = aVar.f47037a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d) || !a.this.f47040d.isOpen()) {
                return;
            }
            try {
                try {
                    a.this.f47040d.beginTransaction();
                    a.this.f47040d.insert(a.this.f47039c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47045a));
                    a.this.f47040d.setTransactionSuccessful();
                } finally {
                    try {
                        if (a.this.f47040d.inTransaction()) {
                            a.this.f47040d.endTransaction();
                        }
                    } catch (Throwable th2) {
                        q0.b(IDatabaseHelper.TAG, th2.getMessage());
                    }
                }
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
                try {
                    if (a.this.f47040d.inTransaction()) {
                        a.this.f47040d.endTransaction();
                    }
                } catch (Throwable th3) {
                    q0.b(IDatabaseHelper.TAG, th3.getMessage());
                }
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f47047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47048b;

        c(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
            this.f47047a = bVar;
            this.f47048b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d)) {
                a aVar = a.this;
                aVar.f47040d = aVar.f47037a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d) || !a.this.f47040d.isOpen()) {
                return;
            }
            try {
                a.this.f47040d.update(a.this.f47039c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47047a), "URL = ? AND filePath = ?", new String[]{this.f47047a.c(), this.f47048b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f47050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f47052c;

        d(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str, String str2) {
            this.f47050a = bVar;
            this.f47051b = str;
            this.f47052c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d)) {
                a aVar = a.this;
                aVar.f47040d = aVar.f47037a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d) || !a.this.f47040d.isOpen()) {
                return;
            }
            try {
                a.this.f47040d.update(a.this.f47039c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47050a), "URL = ? AND filePath = ?", new String[]{this.f47051b, this.f47052c});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f47054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47055b;

        e(String str, String str2) {
            this.f47054a = str;
            this.f47055b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d)) {
                a aVar = a.this;
                aVar.f47040d = aVar.f47037a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d) || !a.this.f47040d.isOpen()) {
                return;
            }
            try {
                a.this.f47040d.execSQL("DELETE FROM " + a.this.f47039c + " WHERE " + TaxBrowserActivity.f66923n + " = ? AND " + V5.c.f41893c + " = ?", new Object[]{this.f47054a, this.f47055b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f47057a;

        f(String str) {
            this.f47057a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d)) {
                a aVar = a.this;
                aVar.f47040d = aVar.f47037a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f47040d) || !a.this.f47040d.isOpen()) {
                return;
            }
            try {
                a.this.f47040d.execSQL("DELETE FROM " + a.this.f47039c + " WHERE " + TaxBrowserActivity.f66923n + " = ?", new Object[]{this.f47057a});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public a(Handler handler, com.mbridge.msdk.config.component.load.downloader.database.d dVar) {
        this.f47038b = handler;
        this.f47037a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str, String str2) {
        this.f47038b.post(new e(str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str) {
        this.f47038b.post(new f(str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, c.a aVar) {
        this.f47038b.post(new RunnableC0498a(aVar, str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f47038b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f47038b.post(new c(bVar, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f47038b.post(new d(bVar, str, str2));
    }
}
