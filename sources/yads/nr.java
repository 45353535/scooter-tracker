package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class nr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f114000c = {"name", SessionDescription.ATTR_LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30 f114001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f114002b;

    public nr(fm0 fm0Var) {
        this.f114001a = fm0Var;
    }

    public final HashMap a() throws i30 {
        try {
            this.f114002b.getClass();
            Cursor cursorQuery = this.f114001a.getReadableDatabase().query(this.f114002b, f114000c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new mr(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }

    public final void a(long j10) throws i30 {
        try {
            String hexString = Long.toHexString(j10);
            this.f114002b = "ExoPlayerCacheFileMetadata" + hexString;
            if (eb3.a(this.f114001a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f114001a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    eb3.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f114002b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f114002b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }

    public final void a(Set set) throws i30 {
        this.f114002b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f114001a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f114002b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            throw new i30(th3);
        }
    }

    public final void a(String str, long j10, long j11) throws i30 {
        this.f114002b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f114001a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(SessionDescription.ATTR_LENGTH, Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f114002b, null, contentValues);
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }
}
