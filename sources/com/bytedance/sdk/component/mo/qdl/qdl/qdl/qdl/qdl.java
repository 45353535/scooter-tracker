package com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.mo.qdl.jpc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends lnr {
    private final Context lnr;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mml;
    protected List<String> qdl;

    public qdl(Context context, com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        super(context);
        this.qdl = new ArrayList();
        this.lnr = context;
        this.mml = qdlVar;
        if (qdlVar == null) {
            this.mml = com.bytedance.sdk.component.mo.qdl.mml.ud.qdl.lnr();
        }
    }

    public byte lnr() {
        return (byte) 2;
    }

    public byte mml() {
        return (byte) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0027: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int qdl() {
        /*
            r10 = this;
            r1 = 0
            r0 = 0
            android.content.Context r2 = r10.mzz()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            java.lang.String r3 = r10.ud()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            java.lang.String r4 = "count(1)"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            if (r1 == 0) goto L25
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            if (r1 == 0) goto L34
        L27:
            r1.close()     // Catch: java.lang.Exception -> L34
            goto L34
        L2b:
            if (r1 == 0) goto L30
            r1.close()     // Catch: java.lang.Exception -> L30
        L30:
            throw r0
        L31:
            if (r1 == 0) goto L34
            goto L27
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl.qdl():int");
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr
    public String ud() {
        com.bytedance.sdk.component.mo.qdl.qdl.mzz mzzVarMml = jpc.wd().mml();
        if (mzzVarMml != null) {
            return mzzVarMml.ud();
        }
        return null;
    }

    public void ud(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar : list) {
            linkedList.add(qdlVar.lnr());
            com.bytedance.sdk.component.mo.qdl.lnr.qdl.to(qdlVar);
        }
        ud();
        linkedList.size();
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), "DELETE FROM " + ud() + " WHERE " + qdl("id", linkedList, 1000, true));
        lnr(linkedList);
    }

    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i10, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b10;
        Cursor cursorQdl;
        long jQdl = com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl(i10, mzz());
        ud();
        if (jQdl <= 0) {
            jQdl = 1;
        } else if (jQdl > 100) {
            jQdl = 100;
        }
        String str4 = str + " DESC limit " + jQdl;
        ArrayList arrayList = new ArrayList();
        this.qdl.clear();
        long jYt = jpc.wd().yt();
        if (jYt > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jYt)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && mml() == 3) {
            str3 = "id";
            b10 = 3;
            cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), new String[]{"id", "value", "encrypt", AppsFlyerProperties.CHANNEL}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b10 = 3;
            cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorQdl;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i11 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && mml() == b10) ? cursor.getInt(cursor.getColumnIndex(AppsFlyerProperties.CHANNEL)) : 0;
                        if (i11 == 1) {
                            try {
                                string2 = mzzVarJtx.qdl(string2);
                            } catch (Throwable th2) {
                                th = th2;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.qdl.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl qdlVar = new com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl(string, jSONObject);
                            qdlVar.qdl(mml());
                            qdlVar.ud(lnr());
                            if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && mml() == b10) {
                                qdlVar.qdl(i12);
                            }
                            com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(jSONObject, qdlVar);
                            arrayList.add(qdlVar);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.qdl.isEmpty()) {
                        qdl(this.qdl);
                        this.qdl.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        ud();
        arrayList.size();
        return arrayList;
    }

    private void ud(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            ud();
        }
    }

    public static String ud(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(String str) {
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar = this.mml;
        if (qdlVar == null) {
            return new ArrayList();
        }
        return qdl(qdlVar.ud(), str);
    }

    protected void qdl(List<String> list) {
        ud();
        list.size();
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), "DELETE FROM " + ud() + " WHERE " + qdl("id", list, 1000, true));
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.tid(), list.size());
        lnr(list);
    }

    public void qdl(int i10, long j10) {
        ud(i10, j10);
    }

    public boolean qdl(int i10) {
        if (this.mml == null) {
            return false;
        }
        int iQdl = qdl();
        int iQdl2 = this.mml.qdl();
        ud();
        return (com.bytedance.sdk.component.mo.qdl.lnr.qdl.lnr() && (i10 == 1 || i10 == 2)) ? iQdl > 0 : iQdl >= iQdl2;
    }

    private static String qdl(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int iMin = Math.min(i10, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i11 = size / iMin;
        } else {
            i11 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * iMin;
            String strQdl = qdl(TextUtils.join("','", list.subList(i13, Math.min(i13 + iMin, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            sb2.append(str);
            sb2.append(str2);
            sb2.append("('");
            sb2.append(strQdl);
            sb2.append("')");
        }
        return qdl(sb2.toString(), str + str2 + "('')");
    }

    private static String qdl(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
