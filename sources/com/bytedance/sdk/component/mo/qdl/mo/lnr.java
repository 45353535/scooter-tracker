package com.bytedance.sdk.component.mo.qdl.mo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.mo.qdl.jpc;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements ud {
    private final Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final mzz f16528ud;

    @SuppressLint({"StaticFieldLeak"})
    private class qdl extends com.bytedance.sdk.component.mo.qdl.mzz.mzz {
        private final String lnr;
        private final Map<String, String> mml;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final mml f16531ud;

        private String lnr(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.lnr)) ? str.replace("{UID}", this.lnr).replace("__UID__", this.lnr) : str;
        }

        boolean qdl(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.mo.qdl.mzz.mml mmlVarQdl;
            com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
            if (mzzVarJtx == null || jpc.wd().mo() == null || !mzzVarJtx.lnr() || !qdl(this.f16531ud.ud())) {
                return;
            }
            if (this.f16531ud.mml() >= mzzVarJtx.lnr(this.f16531ud.mo())) {
                lnr.this.f16528ud.lnr(this.f16531ud);
                return;
            }
            try {
                if (this.f16531ud.rq()) {
                    lnr.this.f16528ud.qdl(this.f16531ud);
                }
                if (mzzVarJtx.qdl(lnr.this.qdl())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strUd = this.f16531ud.ud();
                    if (mzzVarJtx.mo() == 0) {
                        strUd = lnr(this.f16531ud.ud());
                        if (this.f16531ud.lnr()) {
                            strUd = ud(strUd);
                        }
                    }
                    com.bytedance.sdk.component.mo.qdl.mzz.lnr lnrVar = mzzVarJtx.to();
                    if (lnrVar == null) {
                        return;
                    }
                    lnrVar.qdl("User-Agent", mzzVarJtx.tvp());
                    lnrVar.qdl("csj_client_source_from", "1");
                    if (this.mml != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.mml.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        lnrVar.qdl("csj_extra_info", jSONObject.toString());
                    }
                    lnrVar.qdl(strUd);
                    try {
                        mmlVarQdl = lnrVar.qdl();
                        try {
                            mmlVarQdl.qdl();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        mmlVarQdl = null;
                    }
                    mml mmlVar = this.f16531ud;
                    mmlVar.qdl(mmlVar.mml() + 1);
                    if (mmlVarQdl != null && mmlVarQdl.qdl()) {
                        lnr.this.f16528ud.lnr(this.f16531ud);
                        this.f16531ud.ud();
                        mzzVarJtx.qdl(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.f16531ud);
                        return;
                    }
                    if (mmlVarQdl != null) {
                        this.f16531ud.ud(mmlVarQdl.ud());
                        this.f16531ud.lnr(mmlVarQdl.lnr());
                    }
                    if (mmlVarQdl == null || mmlVarQdl.ud() != 8848) {
                        this.f16531ud.ud();
                        if (this.f16531ud.mml() >= mzzVarJtx.lnr(this.f16531ud.mo())) {
                            lnr.this.f16528ud.lnr(this.f16531ud);
                            this.f16531ud.ud();
                        } else {
                            lnr.this.f16528ud.ud(this.f16531ud);
                        }
                    } else {
                        mmlVarQdl.lnr();
                        lnr.this.f16528ud.lnr(this.f16531ud);
                    }
                    mzzVarJtx.qdl(false, this.f16531ud.jpc(), System.currentTimeMillis() - jCurrentTimeMillis, this.f16531ud);
                }
            } catch (Throwable unused3) {
            }
        }

        String ud(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(lnr.lnr().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        private qdl(mml mmlVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.f16531ud = mmlVar;
            this.lnr = str;
            this.mml = map;
        }
    }

    public lnr(Context context, mzz mzzVar) {
        this.qdl = context;
        this.f16528ud = mzzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random lnr() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context qdl() {
        Context context = this.qdl;
        return context == null ? jpc.wd().mo() : context;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.ud
    public void qdl(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || mzzVarJtx.mml() == null || !mzzVarJtx.lnr() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            mzzVarJtx.mml().execute(new qdl(new mml(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z10, i10, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.ud
    public Runnable qdl(final mml mmlVar, final String str, final Map<String, String> map) {
        if (mmlVar == null || TextUtils.isEmpty(mmlVar.qdl())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.mo.qdl.mo.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                if (lnr.this.f16528ud.qdl(mmlVar.qdl()) != null) {
                    new qdl(mmlVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo.ud
    public void qdl(final String str, final boolean z10) {
        com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || jpc.wd().mo() == null || !mzzVarJtx.lnr()) {
            return;
        }
        com.bytedance.sdk.component.mo.qdl.mzz.mzz mzzVar = new com.bytedance.sdk.component.mo.qdl.mzz.mzz("trackFailedUrls") { // from class: com.bytedance.sdk.component.mo.qdl.mo.lnr.2
            @Override // java.lang.Runnable
            public void run() {
                lnr.this.qdl(lnr.this.f16528ud.qdl(), str, z10);
            }
        };
        mzzVar.qdl(1);
        if (mzzVarJtx.mml() != null) {
            mzzVarJtx.mml().execute(mzzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(List<mml> list, String str, boolean z10) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
        for (mml mmlVar : list) {
            if (mzzVarJtx == null || mzzVarJtx.mml() == null) {
                str2 = str;
            } else {
                mmlVar.qdl(z10);
                str2 = str;
                mzzVarJtx.mml().execute(new qdl(mmlVar, str2, null));
            }
            str = str2;
        }
    }
}
