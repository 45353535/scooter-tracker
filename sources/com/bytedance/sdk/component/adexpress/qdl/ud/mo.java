package com.bytedance.sdk.component.adexpress.qdl.ud;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    public static int qdl = 20;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile mo f16463ud;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.qdl.lnr.lnr> mzz;
    private final Object mml = new Object();
    private AtomicBoolean mo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private LruCache<String, com.bytedance.sdk.component.adexpress.qdl.lnr.ud> f16464wd = new LruCache<String, com.bytedance.sdk.component.adexpress.qdl.lnr.ud>(qdl) { // from class: com.bytedance.sdk.component.adexpress.qdl.ud.mo.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVar) {
            return 1;
        }
    };
    private Set<String> lnr = DesugarCollections.synchronizedSet(new HashSet());

    private mo() {
    }

    private void mml(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.qdl.lnr.ud> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.f16464wd) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.mml) {
            this.f16464wd.remove(str);
        }
    }

    public static void qdl(int i10) {
        qdl = i10;
    }

    void lnr(String str) {
        com.bytedance.sdk.component.adexpress.qdl.lnr.lnr lnrVar;
        try {
            if (this.mzz != null && !this.mzz.isEmpty() && (lnrVar = this.mzz.get(str)) != null) {
                if (!TextUtils.isEmpty(lnrVar.qdl()) && com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mo() != null) {
                    com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mo();
                }
                this.mzz.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    Set<String> ud(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud().qdl("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorQdl != null) {
                try {
                    try {
                        if (cursorQdl.moveToFirst()) {
                            do {
                                hashSet.add(cursorQdl.getString(cursorQdl.getColumnIndex("id")));
                            } while (cursorQdl.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e10) {
                        Log.e("TmplDbHelper", "", e10);
                    }
                } finally {
                    cursorQdl.close();
                }
            }
        }
        return null;
    }

    public static mo qdl() {
        if (f16463ud == null) {
            synchronized (mo.class) {
                try {
                    if (f16463ud == null) {
                        f16463ud = new mo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f16463ud;
    }

    public static String lnr() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }

    com.bytedance.sdk.component.adexpress.qdl.lnr.ud qdl(String str) {
        com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVar;
        com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVarQdl;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud() == null) {
            return null;
        }
        synchronized (this.mml) {
            udVar = this.f16464wd.get(String.valueOf(str));
        }
        if (udVar != null) {
            return udVar;
        }
        Cursor cursorQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud().qdl("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorQdl != null) {
            try {
                if (cursorQdl.moveToFirst()) {
                    do {
                        String string = cursorQdl.getString(cursorQdl.getColumnIndex("rit"));
                        String string2 = cursorQdl.getString(cursorQdl.getColumnIndex("id"));
                        String string3 = cursorQdl.getString(cursorQdl.getColumnIndex("md5"));
                        String string4 = cursorQdl.getString(cursorQdl.getColumnIndex("url"));
                        String string5 = cursorQdl.getString(cursorQdl.getColumnIndex("data"));
                        String string6 = cursorQdl.getString(cursorQdl.getColumnIndex("version"));
                        udVarQdl = new com.bytedance.sdk.component.adexpress.qdl.lnr.ud().qdl(string).ud(string2).lnr(string3).mml(string4).mzz(string5).mo(string6).qdl(Long.valueOf(cursorQdl.getLong(cursorQdl.getColumnIndex("update_time"))));
                        synchronized (this.mml) {
                            this.f16464wd.put(string2, udVarQdl);
                        }
                        this.lnr.add(string2);
                    } while (cursorQdl.moveToNext());
                    cursorQdl.close();
                    return udVarQdl;
                }
            } catch (Throwable unused) {
            }
            cursorQdl.close();
        }
        return null;
    }

    List<com.bytedance.sdk.component.adexpress.qdl.lnr.ud> ud() {
        if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud() == null) {
            return null;
        }
        boolean z10 = this.mo.get();
        this.mo.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud().qdl("template_diff_new", null, null, null, null, null, null);
        if (cursorQdl != null) {
            while (cursorQdl.moveToNext()) {
                try {
                    String string = cursorQdl.getString(cursorQdl.getColumnIndex("rit"));
                    String string2 = cursorQdl.getString(cursorQdl.getColumnIndex("id"));
                    String string3 = cursorQdl.getString(cursorQdl.getColumnIndex("md5"));
                    String string4 = cursorQdl.getString(cursorQdl.getColumnIndex("url"));
                    String string5 = cursorQdl.getString(cursorQdl.getColumnIndex("data"));
                    String string6 = cursorQdl.getString(cursorQdl.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.qdl.lnr.ud().qdl(string).ud(string2).lnr(string3).mml(string4).mzz(string5).mo(string6).qdl(Long.valueOf(cursorQdl.getLong(cursorQdl.getColumnIndex("update_time")))));
                    synchronized (this.mml) {
                        this.f16464wd.put(string2, (com.bytedance.sdk.component.adexpress.qdl.lnr.ud) arrayList.get(arrayList.size() - 1));
                    }
                    this.lnr.add(string2);
                    if (!z10 && com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mo() != null) {
                        if (this.mzz == null) {
                            this.mzz = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.mzz.contains(string2)) {
                            this.mzz.put(string2, new com.bytedance.sdk.component.adexpress.qdl.lnr.lnr(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorQdl.close();
                }
            }
            cursorQdl.close();
            return arrayList;
        }
        return arrayList;
    }

    void qdl(com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVar, boolean z10) {
        if (udVar == null || com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud() == null || TextUtils.isEmpty(udVar.ud())) {
            return;
        }
        Cursor cursorQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud().qdl("template_diff_new", null, "id=?", new String[]{udVar.ud()}, null, null, null);
        boolean z11 = cursorQdl != null && cursorQdl.getCount() > 0;
        if (cursorQdl != null) {
            try {
                string = cursorQdl.moveToFirst() ? cursorQdl.getString(cursorQdl.getColumnIndex("rit")) : null;
                cursorQdl.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", udVar.qdl());
        contentValues.put("id", udVar.ud());
        contentValues.put("md5", udVar.lnr());
        contentValues.put("url", udVar.mml());
        contentValues.put("data", udVar.mzz());
        contentValues.put("version", udVar.mo());
        contentValues.put("update_time", udVar.wd());
        if (z11) {
            com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud().qdl("template_diff_new", contentValues, "id=?", new String[]{udVar.ud()});
        } else {
            com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud().qdl("template_diff_new", contentValues);
        }
        synchronized (this.mml) {
            this.f16464wd.put(udVar.ud(), udVar);
        }
        this.lnr.add(udVar.ud());
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mo() == null) {
                return;
            }
            if (this.mzz == null) {
                this.mzz = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.qdl.lnr.lnr lnrVar = new com.bytedance.sdk.component.adexpress.qdl.lnr.lnr(udVar.qdl(), udVar.ud(), udVar.lnr());
            this.mzz.put(udVar.ud(), lnrVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mo();
                lnrVar.ud();
            }
            com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mo();
            udVar.qdl();
        } catch (Throwable unused2) {
        }
    }

    void qdl(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                mml(strArr[i10]);
                com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().ud().qdl("template_diff_new", "id=?", new String[]{strArr[i10]});
                lnr(strArr[i10]);
            }
        }
    }
}
