package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.ironsource.C4240b4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zr implements bs {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f118773e = {"id", C4240b4.i.W, "metadata"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30 f118774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f118775b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f118776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f118777d;

    public zr(fm0 fm0Var) {
        this.f118774a = fm0Var;
    }

    @Override // yads.bs
    public final boolean a() {
        SQLiteDatabase readableDatabase = this.f118774a.getReadableDatabase();
        String str = this.f118776c;
        str.getClass();
        return eb3.a(readableDatabase, 1, str) != -1;
    }

    @Override // yads.bs
    public final void b() throws i30 {
        j30 j30Var = this.f118774a;
        String str = this.f118776c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = j30Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i10 = eb3.f110300a;
                try {
                    if (w83.a(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e10) {
                    throw new i30(e10);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e11) {
            throw new i30(e11);
        }
    }

    @Override // yads.bs
    public final void a(long j10) {
        String hexString = Long.toHexString(j10);
        this.f118776c = hexString;
        this.f118777d = "ExoPlayerCacheIndex" + hexString;
    }

    @Override // yads.bs
    public final void a(HashMap map, SparseArray sparseArray) throws i30 {
        if (this.f118775b.size() == 0) {
            try {
                SQLiteDatabase readableDatabase = this.f118774a.getReadableDatabase();
                String str = this.f118776c;
                str.getClass();
                if (eb3.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.f118774a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        String str2 = this.f118776c;
                        str2.getClass();
                        eb3.a(writableDatabase, 1, str2, 1);
                        String str3 = this.f118777d;
                        str3.getClass();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str3));
                        writableDatabase.execSQL("CREATE TABLE " + this.f118777d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                SQLiteDatabase readableDatabase2 = this.f118774a.getReadableDatabase();
                String str4 = this.f118777d;
                str4.getClass();
                Cursor cursorQuery = readableDatabase2.query(str4, f118773e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i10 = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new yr(i10, string, cs.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i10, string);
                    } finally {
                    }
                }
                cursorQuery.close();
                return;
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new i30(e10);
            }
        }
        throw new IllegalStateException();
    }

    @Override // yads.bs
    public final void b(HashMap map) throws i30 {
        try {
            SQLiteDatabase writableDatabase = this.f118774a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                String str = this.f118776c;
                str.getClass();
                eb3.a(writableDatabase, 1, str, 1);
                String str2 = this.f118777d;
                str2.getClass();
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.execSQL("CREATE TABLE " + this.f118777d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                for (yr yrVar : map.values()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    wb0 wb0Var = yrVar.f118332e;
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    Set<Map.Entry> setEntrySet = wb0Var.f117385b.entrySet();
                    dataOutputStream.writeInt(setEntrySet.size());
                    for (Map.Entry entry : setEntrySet) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        byte[] bArr = (byte[]) entry.getValue();
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", Integer.valueOf(yrVar.f118328a));
                    contentValues.put(C4240b4.i.W, yrVar.f118329b);
                    contentValues.put("metadata", byteArray);
                    String str3 = this.f118777d;
                    str3.getClass();
                    writableDatabase.replaceOrThrow(str3, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                this.f118775b.clear();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e10) {
            throw new i30(e10);
        }
    }

    @Override // yads.bs
    public final void a(yr yrVar, boolean z10) {
        if (z10) {
            this.f118775b.delete(yrVar.f118328a);
        } else {
            this.f118775b.put(yrVar.f118328a, null);
        }
    }

    @Override // yads.bs
    public final void a(yr yrVar) {
        this.f118775b.put(yrVar.f118328a, yrVar);
    }

    @Override // yads.bs
    public final void a(HashMap map) throws i30 {
        if (this.f118775b.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f118774a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < this.f118775b.size(); i10++) {
                try {
                    yr yrVar = (yr) this.f118775b.valueAt(i10);
                    if (yrVar == null) {
                        int iKeyAt = this.f118775b.keyAt(i10);
                        String str = this.f118777d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        wb0 wb0Var = yrVar.f118332e;
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry> setEntrySet = wb0Var.f117385b.entrySet();
                        dataOutputStream.writeInt(setEntrySet.size());
                        for (Map.Entry entry : setEntrySet) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            byte[] bArr = (byte[]) entry.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(yrVar.f118328a));
                        contentValues.put(C4240b4.i.W, yrVar.f118329b);
                        contentValues.put("metadata", byteArray);
                        String str2 = this.f118777d;
                        str2.getClass();
                        writableDatabase.replaceOrThrow(str2, null, contentValues);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.f118775b.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new i30(e10);
        }
    }
}
