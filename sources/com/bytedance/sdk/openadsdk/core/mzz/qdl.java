package com.bytedance.sdk.openadsdk.core.mzz;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.mzz;
import com.bytedance.sdk.component.utils.wd;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.bjy.qdl.mml;
import com.bytedance.sdk.openadsdk.core.exu.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.ud;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private final List<String> qdl = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final lnr f17412ud = new lnr(5, 5, true);
    private final ConcurrentHashMap<String, Long> lnr = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mzz.qdl$qdl, reason: collision with other inner class name */
    private static class C0266qdl {
        private static final qdl qdl = new qdl();
    }

    private boolean lnr(String str) {
        return !this.qdl.contains(str);
    }

    public File ud(String str) {
        String str2;
        String strQdl = mzz.qdl(str);
        if (strQdl == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (ud.lnr()) {
            str2 = name + "/music/";
        } else {
            str2 = name + "//music/";
        }
        return wd.qdl(yt.qdl(), ud.lnr(), str2, strQdl);
    }

    public void lnr() {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("music_preload_start", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.mzz.qdl.2
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                mml mmlVarQdl = mml.ud().qdl("music_preload_start");
                mmlVarQdl.qdl();
                return mmlVarQdl;
            }
        });
    }

    public static qdl qdl() {
        return C0266qdl.qdl;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        List<ljh> listMml = qdlVar.mml();
        if (listMml == null || listMml.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < listMml.size(); i10++) {
            ljh ljhVar = listMml.get(i10);
            if (ljhVar != null) {
                qdl(ljhVar);
            }
        }
    }

    public InputStream qdl(String str) {
        File fileUd = ud(str);
        if (fileUd == null || !qdl(fileUd)) {
            return null;
        }
        try {
            return new FileInputStream(fileUd);
        } catch (Exception e10) {
            aaj.lnr("MusicCacheManager", e10.getMessage());
            return null;
        }
    }

    public void ud() {
        File fileQdl = qdl(yt.qdl(), ud.lnr());
        fileQdl.getAbsolutePath();
        try {
            this.f17412ud.qdl(fileQdl);
        } catch (IOException e10) {
            aaj.qdl("MusicCacheManager", "trimFileCache fail", e10);
        }
    }

    private void qdl(ljh ljhVar) {
        ljh.qdl qdlVarXdk;
        String strTvp;
        if (ljhVar == null || (qdlVarXdk = ljhVar.xdk()) == null || (strTvp = qdlVarXdk.tvp()) == null || !strTvp.contains("music_url")) {
            return;
        }
        lnr();
        String strUd = qdlVarXdk.ud();
        if (TextUtils.isEmpty(strUd)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e10) {
                aaj.lnr("MusicCacheManager", e10.getMessage());
            }
            qdl(0, -1L, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "music url string is null");
            return;
        }
        File fileUd = ud(strUd);
        if (fileUd == null) {
            return;
        }
        fileUd.getPath();
        if (qdl(fileUd)) {
            qdl(2, -1L, -1, null);
        } else {
            qdl(ljhVar, strUd, fileUd);
        }
    }

    private boolean qdl(File file) {
        return file.exists() && file.length() != 0;
    }

    private void qdl(ljh ljhVar, String str, File file) {
        if (lnr(str)) {
            this.lnr.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.wd.ud.qdl qdlVarMml = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mml();
            qdlVarMml.ud(str);
            qdlVarMml.qdl(file.getParent(), file.getName());
            qdlVarMml.lnr(str);
            this.qdl.add(str);
            qdlVarMml.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mzz.qdl.1
                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                    udVar.lnr();
                    udVar.qdl();
                    String strLnr = lnrVar.lnr();
                    Long l10 = (Long) qdl.this.lnr.get(strLnr);
                    if (udVar.mo() && udVar.mzz() != null && udVar.mzz().exists()) {
                        udVar.mzz();
                        if (l10 != null) {
                            qdl.this.lnr.remove(strLnr);
                            qdl.this.qdl(1, SystemClock.elapsedRealtime() - l10.longValue(), -1, null);
                        }
                        try {
                            wd.ud(udVar.mzz());
                        } catch (IOException e10) {
                            aaj.lnr("MusicCacheManager", e10.getMessage());
                        }
                    }
                    if (udVar.mo() || l10 == null) {
                        return;
                    }
                    qdl.this.qdl(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                    Long l10 = (Long) qdl.this.lnr.get(lnrVar.lnr());
                    if (l10 != null) {
                        qdl.this.qdl(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    private File qdl(Context context, boolean z10) {
        String str;
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (ud.lnr()) {
            str = name + "/music";
        } else {
            str = name + "//music";
        }
        return wd.qdl(context, z10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final int i10, final long j10, final int i11, final String str) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("music_preload_finish", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.mzz.qdl.3
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i10);
                long j11 = j10;
                if (j11 != -1) {
                    jSONObject.put("load_duration", j11);
                }
                mml mmlVarUd = mml.ud().qdl("music_preload_finish").ud(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    mmlVarUd.ud(i11);
                    mmlVarUd.mo(str);
                }
                mmlVarUd.qdl();
                return mmlVarUd;
            }
        });
    }

    public void qdl(final boolean z10) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("music_cache", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.mzz.qdl.4
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z10);
                mml mmlVarUd = mml.ud().qdl("music_cache").ud(jSONObject.toString());
                mmlVarUd.qdl();
                return mmlVarUd;
            }
        });
    }
}
