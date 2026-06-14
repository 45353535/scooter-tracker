package com.bytedance.sdk.openadsdk.mo;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jpc;
import com.bytedance.sdk.openadsdk.bjy.lnr;
import com.bytedance.sdk.openadsdk.bjy.qdl.mml;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.utils.ekw;
import com.ironsource.C4424m2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static volatile ud qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.jtx.qdl> f17751ud = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.jtx.qdl lnr = null;
    private volatile boolean mml = false;
    private volatile HandlerThread mzz = null;
    private volatile Handler mo = null;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private String f17752wd = "";
    private int jpc = 0;
    private volatile long tvp = 0;
    private final Runnable to = new Runnable() { // from class: com.bytedance.sdk.openadsdk.mo.ud.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (qdl.qdl().mzz()) {
                        Set<String> setKeySet = ud.this.f17751ud.keySet();
                        if (setKeySet.size() > ud.this.jpc) {
                            ud.this.jpc = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(ud.this.f17751ud.values());
                        Collections.sort(arrayList);
                        for (int i10 = 0; i10 < arrayList.size() && i10 < 5; i10++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.jtx.qdl) arrayList.get(i10)).ud());
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.jtx.qdl qdlVar = (com.bytedance.sdk.openadsdk.jtx.qdl) ud.this.f17751ud.get(str);
                                if (qdlVar != null) {
                                    JSONObject jSONObjectQdl = qdlVar.qdl(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectQdl);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e10) {
                            aaj.lnr(e10.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (ud.this.lnr != null) {
                                jSONObject.put("common", ud.this.lnr.qdl(jSONObject2));
                            }
                        } catch (JSONException e11) {
                            aaj.lnr(e11.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    aaj.lnr(th2.getMessage(), new Object[0]);
                }
                ud.this.f17752wd = jSONObject.toString();
                ud udVar = ud.this;
                udVar.qdl(udVar.to, qdl.qdl().mml());
            } catch (OutOfMemoryError e12) {
                aaj.lnr(e12.getMessage(), new Object[0]);
            }
        }
    };

    private ud() {
    }

    private void mzz() {
        if (this.mml) {
            return;
        }
        this.mml = true;
        qdl(this.to, qdl.qdl().mml());
    }

    private Handler lnr() {
        if (this.mzz == null || !this.mzz.isAlive()) {
            synchronized (rdp.class) {
                try {
                    if (this.mzz == null || !this.mzz.isAlive()) {
                        this.mzz = jpc.qdl("csj_feature", -1);
                        this.mo = new Handler(this.mzz.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (this.mo == null) {
            synchronized (rdp.class) {
                try {
                    if (this.mo == null) {
                        this.mo = new Handler(this.mzz.getLooper());
                    }
                } finally {
                }
            }
        }
        return this.mo;
    }

    private void mml() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.tvp > 10000) {
            lnr.qdl("track_feature_result", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.mo.ud.1
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                @Nullable
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    ud.this.tvp = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(ud.this.jpc));
                    return mml.ud().qdl("track_feature_result").ud(jSONObject.toString());
                }
            });
        }
    }

    public void ud() {
        try {
            if (qdl.qdl().lnr()) {
                qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mo.ud.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!qdl.qdl().mzz()) {
                            if (ud.this.lnr != null) {
                                ud.this.lnr.qdl();
                            }
                        } else {
                            Iterator it = ud.this.f17751ud.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.jtx.qdl qdlVar = (com.bytedance.sdk.openadsdk.jtx.qdl) ud.this.f17751ud.get((String) it.next());
                                if (qdlVar != null) {
                                    qdlVar.qdl();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e10) {
            aaj.lnr(e10.getMessage(), new Object[0]);
        }
    }

    private void qdl(Runnable runnable) {
        if (ekw.qdl || runnable == null) {
            return;
        }
        try {
            lnr().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Runnable runnable, long j10) {
        if (ekw.qdl || runnable == null) {
            return;
        }
        try {
            lnr().postDelayed(runnable, j10);
        } catch (Throwable unused) {
        }
    }

    public static ud qdl() {
        if (qdl == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.lnr.class) {
                try {
                    if (qdl == null) {
                        qdl = new ud();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public void qdl(JSONObject jSONObject) {
        if (qdl.qdl().lnr()) {
            try {
                jSONObject.put("feature_data", this.f17752wd);
                mml();
            } catch (JSONException e10) {
                aaj.lnr(e10.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(@NonNull String str, @NonNull String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && qdl.qdl().lnr()) {
                mzz();
                if (qdl.qdl().mzz()) {
                    com.bytedance.sdk.openadsdk.jtx.qdl qdlVar = this.f17751ud.get(str2);
                    if (qdlVar == null) {
                        qdlVar = new com.bytedance.sdk.openadsdk.jtx.qdl(str2);
                    }
                    qdlVar.qdl(str, str3);
                    this.f17751ud.put(str2, qdlVar);
                    return;
                }
                if (this.lnr == null) {
                    this.lnr = new com.bytedance.sdk.openadsdk.jtx.qdl(str2);
                }
                this.lnr.qdl(str, str3);
            }
        } catch (OutOfMemoryError e10) {
            aaj.lnr(e10.getMessage(), new Object[0]);
        }
    }

    public void qdl(@NonNull final String str, @NonNull final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !qdl.qdl().lnr()) {
            return;
        }
        if (!C4424m2.f43623v.equals(str) && !"click".equals(str) && !"dislike".equals(str)) {
            if (qdl.qdl().jl()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!Constants.REWARDED_VIDEO.equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mo.ud.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ud.this.qdl(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mo.ud.2
            @Override // java.lang.Runnable
            public void run() {
                ud.this.qdl(str, str2, str3);
            }
        });
    }

    public void qdl(@NonNull final String str, final ljh ljhVar) {
        if (!TextUtils.isEmpty(str) && qdl.qdl().lnr() && ljh.mzz(ljhVar)) {
            if (!qdl.qdl().jl() || ljhVar.ok() == 8 || ljhVar.ok() == 7 || ljhVar.ok() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mo.ud.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strWc = ljhVar.wc();
                            String strCev = ljhVar.cev();
                            if (TextUtils.isEmpty(strWc)) {
                                return;
                            }
                            ud.this.qdl(str, strWc, strCev);
                        }
                    });
                }
            }
        }
    }

    public void qdl(@NonNull final String str, final ljh ljhVar, final String str2) {
        if (TextUtils.isEmpty(str) || !qdl.qdl().lnr()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mo.ud.5
                @Override // java.lang.Runnable
                public void run() {
                    ljh ljhVar2 = ljhVar;
                    if (ljhVar2 == null || TextUtils.isEmpty(ljhVar2.wc())) {
                        return;
                    }
                    ud.this.qdl(str, ljhVar.wc(), ljhVar.cev() + str2);
                }
            });
        }
    }
}
