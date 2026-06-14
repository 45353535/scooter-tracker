package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
public final class C2253Lt {
    public static byte[] A02;
    public static final String[] A03;
    public String A00;
    public final InterfaceC18214m A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-91, -123, -53, -66, -54, -62, 125, -79, -94, -75, -79, 125, -83, -81, -90, -86, -98, -81, -74, 125, -88, -94, -74, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, -55, -62, -53, -60, -47, -59, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, -55, -66, -48, -47, -68, -47, -52, -46, -64, -59, -68, -47, -58, -54, -62, -48, -47, -66, -54, -51, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -122, -98, -83, -96, -100, -81, -96, 123, -81, -100, -99, -89, -96, 123, -25, -11, -14, -13, -61, -9, -28, -27, -17, -24, -61, -20, -23, -61, -24, -5, -20, -10, -9, -10, -61, Ascii.DEL, -78, -87, -118, -90, -101, -77, -97, -84, 125, -101, -99, -94, -97, UnsignedBytes.MAX_POWER_OF_TWO, -93, -90, -97, -121, -97, -82, -101, -98, -101, -82, -101, 13, 2, Ascii.DC4, Ascii.NAK, 0, Ascii.NAK, Ascii.DLE, Ascii.SYN, 4, 9, 0, Ascii.NAK, 10, Ascii.SO, 6, Ascii.DC4, Ascii.NAK, 2, Ascii.SO, 17, -24, -31, -22, -29, -16, -28, -89, -102, -90, -98, -96, -109, -97, -105, 82, 111, 82, 113};
    }

    static {
        A03();
        A03 = new String[]{A01(181, 4, 13), A01(175, 6, 80), A01(ModuleDescriptor.MODULE_VERSION, 20, 117)};
    }

    public C2253Lt(InterfaceC18214m interfaceC18214m) {
        this.A01 = interfaceC18214m;
    }

    private Cursor A00() {
        C3M.A01(this.A00);
        return this.A01.getReadableDatabase().query(this.A00, A03, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(129, 26, 14) + str;
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(108, 21, 119) + str);
    }

    public final Map<String, C2252Ls> A05() throws C18204l {
        try {
            Cursor cursorA00 = A00();
            try {
                HashMap map = new HashMap(cursorA00.getCount());
                while (cursorA00.moveToNext()) {
                    map.put((String) C3M.A01(cursorA00.getString(0)), new C2252Ls(cursorA00.getLong(1), cursorA00.getLong(2)));
                }
                if (cursorA00 != null) {
                    cursorA00.close();
                }
                return map;
            } finally {
            }
        } catch (SQLException e10) {
            throw new C18204l(e10);
        }
    }

    public final void A06(long j10) throws C18204l {
        try {
            String hexString = Long.toHexString(j10);
            String hexUid = A02(hexString);
            this.A00 = hexUid;
            if (AbstractC18234o.A00(this.A01.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC18234o.A04(writableDatabase, 2, hexString, 1);
                    String hexUid2 = this.A00;
                    A04(writableDatabase, hexUid2);
                    StringBuilder sb2 = new StringBuilder();
                    String hexUid3 = A01(95, 13, 47);
                    StringBuilder sbAppend = sb2.append(hexUid3);
                    String hexUid4 = this.A00;
                    StringBuilder sbAppend2 = sbAppend.append(hexUid4);
                    String hexUid5 = A01(0, 1, 89);
                    StringBuilder sbAppend3 = sbAppend2.append(hexUid5);
                    String hexUid6 = A01(1, 94, 49);
                    writableDatabase.execSQL(sbAppend3.append(hexUid6).toString());
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        } catch (SQLException e10) {
            throw new C18204l(e10);
        }
    }

    public final void A07(String str) throws C18204l {
        C3M.A01(this.A00);
        try {
            this.A01.getWritableDatabase().delete(this.A00, A01(185, 8, 6), new String[]{str});
        } catch (SQLException e10) {
            throw new C18204l(e10);
        }
    }

    public final void A08(String str, long j10, long j11) throws C18204l {
        C3M.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(181, 4, 13), str);
            contentValues.put(A01(175, 6, 80), Long.valueOf(j10));
            contentValues.put(A01(ModuleDescriptor.MODULE_VERSION, 20, 117), Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.A00, null, contentValues);
        } catch (SQLException e10) {
            throw new C18204l(e10);
        }
    }

    public final void A09(Set<String> set) throws C18204l {
        C3M.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.A00, A01(185, 8, 6), new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new C18204l(e10);
        }
    }
}
