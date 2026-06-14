package com.mbridge.msdk.foundation.download.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DatabaseHelper implements IDatabaseHelper {
    private volatile SQLiteDatabase database;
    private final IDatabaseOpenHelper databaseOpenHelper;
    private final Handler handler;
    private final String tableName = GlobalComponent.getInstance().getDatabaseTableName();

    public DatabaseHelper(Context context, Handler handler, IDatabaseOpenHelper iDatabaseOpenHelper) {
        this.handler = handler;
        this.databaseOpenHelper = iDatabaseOpenHelper;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void clear() {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.9
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    return;
                }
                try {
                    if (DatabaseHelper.this.database.isOpen()) {
                        try {
                            DatabaseHelper.this.database.beginTransaction();
                            DatabaseHelper.this.database.delete(DatabaseHelper.this.tableName, null, null);
                            DatabaseHelper.this.database.setTransactionSuccessful();
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                e10.printStackTrace();
                            }
                            try {
                                if (DatabaseHelper.this.database.inTransaction()) {
                                    DatabaseHelper.this.database.endTransaction();
                                }
                            } catch (Throwable th2) {
                                q0.b(IDatabaseHelper.TAG, th2.getMessage());
                            }
                        }
                    }
                } finally {
                    try {
                        if (DatabaseHelper.this.database.inTransaction()) {
                            DatabaseHelper.this.database.endTransaction();
                        }
                    } catch (Throwable th3) {
                        q0.b(IDatabaseHelper.TAG, th3.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void find(final String str, final String str2, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
            /* JADX WARN: Type inference failed for: r0v12, types: [android.database.Cursor] */
            /* JADX WARN: Type inference failed for: r0v14 */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Cursor cursorRawQuery;
                IDatabaseHelper.IDatabaseListener iDatabaseListener2;
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                DownloadModel downloadModelCreate = null;
                if (!Objects.isNull(DatabaseHelper.this.database)) {
                    ?? IsOpen = DatabaseHelper.this.database.isOpen();
                    try {
                        if (IsOpen != 0) {
                            try {
                                cursorRawQuery = DatabaseHelper.this.database.rawQuery("SELECT * FROM " + DatabaseHelper.this.tableName + " WHERE " + DownloadModel.DOWNLOAD_ID + " = ? AND " + DownloadModel.DIRECTORY_PATH + " = ?", new String[]{str, str2});
                                if (cursorRawQuery != null) {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            downloadModelCreate = DownloadModel.create(cursorRawQuery);
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        iDatabaseListener2 = iDatabaseListener;
                                        if (iDatabaseListener2 == null) {
                                            return;
                                        }
                                    }
                                }
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                iDatabaseListener2 = iDatabaseListener;
                                if (iDatabaseListener2 == null) {
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
                                IDatabaseHelper.IDatabaseListener iDatabaseListener3 = iDatabaseListener;
                                if (iDatabaseListener3 != null) {
                                    iDatabaseListener3.onDatabase(null);
                                }
                                throw th;
                            }
                            iDatabaseListener2.onDatabase(downloadModelCreate);
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (Objects.isNotNull(iDatabaseListener)) {
                    iDatabaseListener.onDatabase(null);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> findAll() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    cursorRawQuery = rawQuery("SELECT * FROM " + this.tableName, null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            arrayList.add(DownloadModel.create(cursorRawQuery));
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                        return arrayList;
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        } catch (Throwable unused) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void findByDownloadUrl(final String str, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.2
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() throws java.lang.Throwable {
                /*
                    r4 = this;
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    if (r0 == 0) goto L19
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r0)
                    android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r0, r1)
                L19:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    r1 = 0
                    if (r0 != 0) goto Lab
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = r0.isOpen()
                    if (r0 != 0) goto L34
                    goto Lab
                L34:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    r0.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = "SELECT * FROM "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = " WHERE "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = "download_url"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = " = ?"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r3 = r3     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    android.database.Cursor r0 = r2.rawQuery(r0, r3)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    if (r0 == 0) goto L7b
                    boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
                    if (r2 == 0) goto L7b
                    com.mbridge.msdk.foundation.download.database.DownloadModel r1 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
                    goto L7b
                L77:
                    r2 = move-exception
                    goto L9e
                L79:
                    r2 = move-exception
                    goto L8a
                L7b:
                    if (r0 == 0) goto L80
                    r0.close()
                L80:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lb8
                    goto L9a
                L85:
                    r2 = move-exception
                    r0 = r1
                    goto L9e
                L88:
                    r2 = move-exception
                    r0 = r1
                L8a:
                    boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L77
                    if (r3 == 0) goto L91
                    r2.printStackTrace()     // Catch: java.lang.Throwable -> L77
                L91:
                    if (r0 == 0) goto L96
                    r0.close()
                L96:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lb8
                L9a:
                    r0.onDatabase(r1)
                    goto Lb8
                L9e:
                    if (r0 == 0) goto La3
                    r0.close()
                La3:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Laa
                    r0.onDatabase(r1)
                Laa:
                    throw r2
                Lab:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lb8
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r1)
                Lb8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass2.run():void");
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> getUnwantedModels(long j10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
                if (cursorRawQuery != null) {
                }
            }
            if (!Objects.isNull(this.database) && this.database.isOpen()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                cursorRawQuery = this.database.rawQuery("SELECT * FROM " + this.tableName + " WHERE " + DownloadModel.LAST_MODIFIED_TIME + " <= ?", new String[]{String.valueOf(jCurrentTimeMillis)});
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(DownloadModel.create(cursorRawQuery));
                    } while (cursorRawQuery.moveToNext());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void insert(final DownloadModel downloadModel) {
        this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    try {
                        DatabaseHelper.this.database.beginTransaction();
                        DatabaseHelper.this.database.insert(DatabaseHelper.this.tableName, null, DownloadModel.create(downloadModel));
                        DatabaseHelper.this.database.setTransactionSuccessful();
                    } finally {
                        try {
                            if (DatabaseHelper.this.database.inTransaction()) {
                                DatabaseHelper.this.database.endTransaction();
                            }
                        } catch (Throwable th2) {
                            q0.b(IDatabaseHelper.TAG, th2.getMessage());
                        }
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                    try {
                        if (DatabaseHelper.this.database.inTransaction()) {
                            DatabaseHelper.this.database.endTransaction();
                        }
                    } catch (Throwable th3) {
                        q0.b(IDatabaseHelper.TAG, th3.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public Cursor rawQuery(String str, String[] strArr) {
        boolean zInTransaction;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    this.database.beginTransaction();
                    Cursor cursorRawQuery = this.database.rawQuery(str, strArr);
                    this.database.setTransactionSuccessful();
                    try {
                        if (this.database.inTransaction()) {
                            this.database.endTransaction();
                            return cursorRawQuery;
                        }
                    } catch (Throwable th2) {
                        if (MBridgeConstans.DEBUG) {
                            th2.printStackTrace();
                        }
                    }
                    return cursorRawQuery;
                }
                try {
                    if (zInTransaction) {
                        return null;
                    }
                } catch (Throwable th3) {
                }
                return null;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th4) {
                    if (MBridgeConstans.DEBUG) {
                        th4.printStackTrace();
                    }
                }
                return null;
            }
        } finally {
            try {
                if (this.database.inTransaction()) {
                    this.database.endTransaction();
                }
            } catch (Throwable th32) {
                if (MBridgeConstans.DEBUG) {
                    th32.printStackTrace();
                }
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str, final String str2) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.6
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE " + DownloadModel.DOWNLOAD_ID + " = ? AND " + DownloadModel.DIRECTORY_PATH + " = ?", new Object[]{str, str2});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void update(final DownloadModel downloadModel, final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{downloadModel.getDownloadId(), str});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateProgress(final String str, final String str2, final DownloadModel downloadModel) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{str, str2});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateUnzipResource(final String str, String str2, long j10) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.8
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DownloadModel.DOWNLOAD_ID, str);
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, contentValues, "download_id = ?", new String[]{str});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.7
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE " + DownloadModel.DOWNLOAD_ID + " = ?", new Object[]{str});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }
}
