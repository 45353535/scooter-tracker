package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes10.dex */
public class l extends a<com.mbridge.msdk.foundation.entity.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f48364a;

    private l(f fVar) {
        super(fVar);
    }

    public static l a(f fVar) {
        if (f48364a == null) {
            synchronized (l.class) {
                try {
                    if (f48364a == null) {
                        f48364a = new l(fVar);
                    }
                } finally {
                }
            }
        }
        return f48364a;
    }

    public synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    public synchronized void a(String str, String str2, int i10) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Reporting.Key.PLACEMENT_ID, str);
        contentValues.put("unitId", str2);
        contentValues.put("ad_type", Integer.valueOf(i10));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    public synchronized List<com.mbridge.msdk.foundation.entity.i> a(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursorRawQuery;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = ?", new String[]{String.valueOf(i10)});
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (cursorRawQuery.getCount() > 0) {
                                arrayList = new ArrayList(cursorRawQuery.getCount());
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(new com.mbridge.msdk.foundation.entity.i(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Reporting.Key.PLACEMENT_ID)), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unitId")), i10));
                                    } catch (Exception e10) {
                                        e = e10;
                                        cursor = cursorRawQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            cursorRawQuery = cursor;
                                            arrayList2 = arrayList;
                                            try {
                                                cursorRawQuery.close();
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            arrayList2 = arrayList;
                                        }
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
            arrayList = null;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return arrayList2;
    }
}
