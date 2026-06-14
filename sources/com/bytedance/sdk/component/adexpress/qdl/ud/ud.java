package com.bytedance.sdk.component.adexpress.qdl.ud;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.mml.tvp;
import com.bytedance.sdk.component.adexpress.qdl.lnr.qdl;
import com.ironsource.D5;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    static Object qdl = new Object();

    public static String lnr() {
        return mo.lnr();
    }

    public static com.bytedance.sdk.component.adexpress.qdl.lnr.qdl mml() {
        return mzz.ud().mo();
    }

    private static String mo() {
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarMml = mml();
        if (qdlVarMml == null) {
            return null;
        }
        return qdlVarMml.mml();
    }

    public static boolean mzz() {
        return mzz.ud().mzz();
    }

    public static void qdl() {
        mzz.ud();
    }

    public static void ud() {
        try {
            jpc.mml();
            File fileJpc = mzz.jpc();
            if (fileJpc == null || !fileJpc.exists()) {
                return;
            }
            if (fileJpc.getParentFile() != null) {
                com.bytedance.sdk.component.utils.wd.lnr(fileJpc.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.wd.lnr(fileJpc);
            }
        } catch (Throwable unused) {
        }
    }

    private static File wd(String str) {
        List<Pair<String, String>> listUd;
        qdl.ud udVarMzz = mml().mzz();
        if (udVarMzz != null && (listUd = udVarMzz.ud()) != null && listUd.size() > 0) {
            for (Pair<String, String> pair : listUd) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(mzz.jpc(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static com.bytedance.sdk.component.adexpress.qdl.lnr.ud lnr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVarQdl = wd.qdl().qdl(str);
        if (udVarQdl != null) {
            udVarQdl.qdl(Long.valueOf(System.currentTimeMillis()));
            qdl(udVarQdl);
        }
        return udVarQdl;
    }

    public static String mml(String str) {
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar;
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarMml = mml();
        if (qdlVarMml == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return mo();
        }
        Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl = qdlVarMml.qdl();
        if (mapQdl == null || mapQdl.size() <= 0 || (qdlVar = mapQdl.get(str)) == null) {
            return null;
        }
        return qdlVar.mml();
    }

    private static boolean mzz(String str) {
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarMml;
        List<qdl.C0226qdl> listMo;
        if (!mzz() || (qdlVarMml = mml()) == null || (listMo = qdlVarMml.mo()) == null) {
            return false;
        }
        for (qdl.C0226qdl c0226qdl : listMo) {
            if (c0226qdl != null && TextUtils.equals(str, c0226qdl.qdl())) {
                return true;
            }
        }
        return false;
    }

    public static com.bytedance.sdk.component.adexpress.qdl.lnr.ud qdl(String str) {
        return wd.qdl().qdl(str);
    }

    private static File mo(String str) {
        if (mzz()) {
            Iterator<qdl.C0226qdl> it = mml().mo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qdl.C0226qdl next = it.next();
                if (next.qdl() != null && next.qdl().equals(str)) {
                    File file = new File(mzz.jpc(), com.bytedance.sdk.component.utils.mzz.qdl(next.qdl()));
                    String strQdl = com.bytedance.sdk.component.utils.mzz.qdl(file);
                    if (next.ud() == null || !next.ud().equals(strQdl)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static void qdl(com.bytedance.sdk.component.adexpress.qdl.lnr.mml mmlVar) {
        wd.qdl().qdl(mmlVar, mmlVar.mo);
    }

    private static void qdl(final com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVar) {
        com.bytedance.sdk.component.adexpress.mml.mml.qdl(new com.bytedance.sdk.component.jpc.jpc("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.qdl.ud.ud.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ud.qdl) {
                    mo.qdl().qdl(udVar, true);
                }
            }
        }, 10);
    }

    public static qdl qdl(String str, tvp.qdl qdlVar, String str2, String str3) {
        File fileMo;
        qdl qdlVar2 = new qdl();
        if (TextUtils.isEmpty(str3)) {
            fileMo = null;
        } else {
            fileMo = ud(str3, str);
            if (fileMo != null) {
                qdlVar2.qdl(1);
            }
        }
        if (fileMo == null && (fileMo = wd(str)) != null) {
            qdlVar2.qdl(3);
        }
        if (fileMo == null && (fileMo = mo(str)) != null) {
            qdlVar2.qdl(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!qdl(str, str3)) {
                qdlVar2.qdl(4);
            }
        } else if (!mzz(str)) {
            qdlVar2.qdl(6);
        }
        qdlVar2.ud();
        if (fileMo != null) {
            try {
                qdlVar2.qdl(new WebResourceResponse(qdlVar.qdl(), D5.N, new FileInputStream(fileMo)));
            } catch (Throwable unused) {
            }
        }
        return qdlVar2;
    }

    public static Set<String> ud(String str) {
        return wd.qdl().ud(str);
    }

    private static File ud(String str, String str2) {
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar;
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarMml = mml();
        if (qdlVarMml != null && mzz()) {
            Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl = qdlVarMml.qdl();
            if (mapQdl.size() != 0 && (qdlVar = mapQdl.get(str)) != null) {
                Iterator<qdl.C0226qdl> it = qdlVar.mo().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    qdl.C0226qdl next = it.next();
                    if (next.qdl() != null && next.qdl().equals(str2)) {
                        File file = new File(mzz.jpc(), com.bytedance.sdk.component.utils.mzz.qdl(next.qdl()));
                        String strQdl = com.bytedance.sdk.component.utils.mzz.qdl(file);
                        if (next.ud() == null || !next.ud().equals(strQdl)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean ud(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean qdl(String str, String str2) {
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarMml;
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar;
        if (!mzz() || (qdlVarMml = mml()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl = qdlVarMml.qdl();
        if (mapQdl.size() == 0 || (qdlVar = mapQdl.get(str2)) == null) {
            return false;
        }
        for (qdl.C0226qdl c0226qdl : qdlVar.mo()) {
            if (c0226qdl != null && TextUtils.equals(str, c0226qdl.qdl())) {
                return true;
            }
        }
        return false;
    }

    public static boolean qdl(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
