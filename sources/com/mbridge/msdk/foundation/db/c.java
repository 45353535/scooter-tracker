package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f48331a;

    private c(f fVar) {
        super(fVar);
    }

    public static c a(f fVar) {
        if (f48331a == null) {
            synchronized (c.class) {
                try {
                    if (f48331a == null) {
                        f48331a = new c(fVar);
                    }
                } finally {
                }
            }
        }
        return f48331a;
    }

    public void b(String str, String str2, String str3) {
        if (a(str, str3)) {
            try {
                getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1, show_time = ? WHERE rid = ? AND unitid = ? AND state = ?", new Object[]{Long.valueOf(System.currentTimeMillis()), str, str3, "1"});
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public long a(String str, String str2, String str3, int i10) {
        if (!a(str, str3)) {
            return -1L;
        }
        new ContentValues().put("state", Integer.valueOf(i10));
        return getWritableDatabase().update("CacheCampaign", r3, "rid= ? AND unitid = ? AND state = 0", new String[]{str, str3});
    }

    public synchronized boolean a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT rid FROM CacheCampaign WHERE rid= ? AND unitid = ? ", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public synchronized void a(String str, int i10) {
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            String str2 = "unitid = ? AND ( (ts + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= ?)";
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                writableDatabase.delete("CacheCampaign", str2, new String[]{str, String.valueOf(i10)});
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            q0.b("CacheCampaignDao", e11.getLocalizedMessage());
        }
    }

    public synchronized void a(String str, String str2, String str3) {
        try {
        } catch (Exception e10) {
            q0.b("CampaignDao", e10.getLocalizedMessage());
        }
        if (a(str2, str)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                writableDatabase.delete("CacheCampaign", "unitid = ? AND rid = ? ", new String[]{str, str2});
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return;
        }
        return;
    }

    public long a(List<CampaignEx> list, String str) {
        CampaignEx campaignEx;
        if (list != null) {
            try {
                if (list.size() == 0 || TextUtils.isEmpty(str) || (campaignEx = list.get(0)) == null) {
                    return 0L;
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("rid", campaignEx.getRequestId());
                contentValues.put("lrid", campaignEx.getLocalRequestId());
                contentValues.put("unitid", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(it.next()));
                }
                contentValues.put("campaigns", jSONArray.toString());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime == 0) {
                    candidateCacheTime = campaignEx.getPlctb();
                    if (candidateCacheTime == 0) {
                        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                        if (gVarD == null) {
                            gVarD = com.mbridge.msdk.setting.h.b().a();
                        }
                        candidateCacheTime = gVarD.b0();
                    }
                }
                try {
                    if (s0.a().a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND lrid= ? AND unitid = ? AND state = 1", new String[]{campaignEx.getRequestId(), campaignEx.getLocalRequestId(), str});
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e11) {
                e11.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(String str, long j10) {
        return a(str, 0, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0109 A[EXC_TOP_SPLITTER, PHI: r5
  0x0109: PHI (r5v4 android.database.Cursor) = (r5v3 android.database.Cursor), (r5v5 android.database.Cursor) binds: [B:32:0x0107, B:27:0x00ff] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.mbridge.msdk.foundation.cache.b> a(java.lang.String r5, int r6, long r7) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.c.a(java.lang.String, int, long):java.util.List");
    }
}
