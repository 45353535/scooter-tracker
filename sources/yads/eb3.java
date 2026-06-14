package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f110300a = 0;

    static {
        dn0.a("goog.exo.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i10, String str) throws i30 {
        try {
        } catch (SQLException e10) {
            throw new i30(e10);
        }
        if (!w83.a(sQLiteDatabase, "ExoPlayerVersions")) {
            return -1;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i10), str}, null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                cursorQuery.close();
                return -1;
            }
            cursorQuery.moveToNext();
            int i11 = cursorQuery.getInt(0);
            cursorQuery.close();
            return i11;
        } finally {
        }
        throw new i30(e10);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws i30 {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e10) {
            throw new i30(e10);
        }
    }
}
