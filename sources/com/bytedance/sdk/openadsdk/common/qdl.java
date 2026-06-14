package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jyq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static final HashMap<String, qdl> qdl = new HashMap<>();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final HashMap<String, C0250qdl> f16980ud = new HashMap<>();

    @SuppressLint({"StaticFieldLeak"})
    private final Context lnr;
    private final C0250qdl mml;
    private final Map<ljh, Long> mo = DesugarCollections.synchronizedMap(new HashMap());
    private final String mzz;

    private qdl(Context context, String str) {
        this.lnr = context;
        C0250qdl c0250qdl = f16980ud.get(str);
        this.mml = c0250qdl == null ? new C0250qdl(str) : c0250qdl;
        this.mzz = str;
    }

    public void lnr(String str) {
        this.mml.mo(str);
    }

    public boolean mml(String str) {
        return this.mml.wd(str);
    }

    public String ud(String str) {
        try {
            String strUd = this.mml.ud(str);
            if (TextUtils.isEmpty(strUd)) {
                return null;
            }
            return strUd;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.qdl$qdl, reason: collision with other inner class name */
    public static class C0250qdl {
        protected final String qdl;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private final HashSet<String> f16982wd = new HashSet<>();

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        String f16981ud = "material_data";
        String lnr = "has_played";
        String mml = "create_time";
        String mzz = "in_use_process";
        String mo = "req_id";

        public C0250qdl(String str) {
            this.qdl = TextUtils.isEmpty(str) ? "" : str;
        }

        public void jpc(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str));
                this.f16982wd.remove(str);
            } catch (Throwable unused) {
            }
        }

        public String lnr(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.ud(qdl(str), this.mo, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public long mml(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str), this.mml, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public void mo(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str), this.mzz, jyq.ud(com.bytedance.sdk.openadsdk.core.yt.qdl()));
                this.f16982wd.add(str);
            } catch (Throwable unused) {
            }
        }

        public boolean mzz(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str), this.lnr, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        protected String qdl(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.qdl + "_cache_" + str;
        }

        public String ud(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.ud(qdl(str), this.f16981ud, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean wd(String str) {
            try {
                String strQdl = qdl(str);
                String strUd = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud(strQdl, this.mzz, "");
                if (TextUtils.isEmpty(strUd)) {
                    return false;
                }
                if (strUd.equals(jyq.ud(com.bytedance.sdk.openadsdk.core.yt.qdl())) && !this.f16982wd.contains(str)) {
                    com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mzz, "");
                    return false;
                }
            } catch (Throwable unused) {
            }
            return true;
        }

        public void qdl(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strQdl = qdl(codeId);
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.lnr, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mml, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.f16981ud, str);
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mzz, "");
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mo, str2);
                this.f16982wd.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static qdl qdl(String str) {
        qdl qdlVar;
        HashMap<String, qdl> map = qdl;
        qdl qdlVar2 = map.get(str);
        if (qdlVar2 != null) {
            return qdlVar2;
        }
        synchronized (qdl.class) {
            try {
                qdlVar = map.get(str);
                if (qdlVar == null) {
                    qdlVar = new qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), str);
                    map.put(str, qdlVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qdlVar;
    }

    private String ud() {
        return CacheDirFactory.getICacheDir(0).qdl();
    }

    public static void qdl(String str, C0250qdl c0250qdl) {
        f16980ud.put(str, c0250qdl);
    }

    public void qdl(String str, ljh ljhVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLnr = this.mml.lnr(str);
        String strCev = ljhVar != null ? ljhVar.cev() : "";
        if (TextUtils.isEmpty(strLnr) || TextUtils.isEmpty(strCev) || strLnr.equals(strCev)) {
            this.mml.jpc(str);
        }
    }

    public void qdl() {
        String str;
        File file;
        File[] fileArrListFiles;
        try {
            int i10 = Build.VERSION.SDK_INT;
            boolean zWd = com.bytedance.sdk.openadsdk.core.tvp.wd(this.mzz);
            if (zWd) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            if (i10 >= 24) {
                file = new File(this.lnr.getDataDir(), str);
            } else {
                file = new File(this.lnr.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.qdl.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(qdl.this.mzz);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zWd) {
                        try {
                            com.bytedance.sdk.component.utils.wd.lnr(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.lnr.deleteSharedPreferences(strReplace);
                        } else {
                            this.lnr.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.wd.lnr(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(ud());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.wd.lnr(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        ljh ljhVarMo;
        if ((qdlVar != null && qdlVar.mo() != null && qdlVar.mo().ilu()) || qdlVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (ljhVarMo = qdlVar.mo()) == null || ljhVarMo.ly() == 2) {
            return;
        }
        try {
            this.mml.qdl(adSlot, qdlVar.rdp(), qdlVar.ud());
        } catch (Throwable unused) {
        }
    }

    public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, boolean z10) {
        if (qdlVar == null || !qdlVar.mzz()) {
            return false;
        }
        if (z10) {
            Iterator<ljh> it = qdlVar.mml().iterator();
            while (it.hasNext()) {
                if (!qdl(it.next())) {
                    it.remove();
                }
            }
        }
        return qdlVar.mzz();
    }

    public String qdl(String str, long j10) {
        long jMml = this.mml.mml(str);
        boolean zMzz = this.mml.mzz(str);
        if (System.currentTimeMillis() - jMml >= j10 || zMzz) {
            return null;
        }
        return ud(str);
    }

    private boolean qdl(ljh ljhVar) {
        if (ljhVar != null) {
            return vu.lnr(ljhVar) || ljhVar.tdy() != null;
        }
        return false;
    }
}
