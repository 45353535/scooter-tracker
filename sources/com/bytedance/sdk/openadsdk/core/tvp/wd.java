package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.bqt;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.taurusx.tax.y.z.w.s;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    private com.bytedance.sdk.openadsdk.core.model.ljh jpc;
    private final Context lnr;
    private PAGBannerAdLoadListener mml;
    private AdSlot qdl;
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private int mo = 5;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final mrf f17537wd = mrf.lnr();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.oth f17536ud = com.bytedance.sdk.openadsdk.core.yt.lnr();

    private wd(Context context) {
        if (context != null) {
            this.lnr = context.getApplicationContext();
        } else {
            this.lnr = com.bytedance.sdk.openadsdk.core.yt.qdl();
        }
    }

    public static wd qdl(Context context) {
        return new wd(context);
    }

    public void qdl(AdSlot adSlot, int i10, @Nullable com.bytedance.sdk.openadsdk.common.mo moVar) {
        this.f17537wd.mzz();
        if (this.mzz.get()) {
            return;
        }
        this.mo = i10;
        this.mzz.set(true);
        this.qdl = adSlot;
        if (moVar instanceof PAGBannerAdLoadListener) {
            this.mml = (PAGBannerAdLoadListener) moVar;
        }
        qdl(adSlot);
    }

    private void qdl(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        bqt bqtVar = new bqt();
        bqtVar.tvp = 2;
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            this.f17536ud.qdl(adSlot, bqtVar, this.mo, (com.bytedance.sdk.openadsdk.core.aaj) new com.bytedance.sdk.openadsdk.core.jyq() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.1
                @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(int i10, String str) {
                    wd.this.qdl(i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                    wd.this.qdl(qdlVar, lnrVar, adSlot);
                }
            });
        } else {
            this.f17536ud.qdl(adSlot, bqtVar, this.mo, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.2
                @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(int i10, String str) {
                    wd.this.qdl(i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                    wd.this.qdl(qdlVar, lnrVar, adSlot);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar, AdSlot adSlot) {
        if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVarRq = qdlVar.rq();
            this.jpc = ljhVarRq;
            qdl(ljhVarRq, adSlot);
            if (com.bytedance.sdk.component.utils.bjy.mml()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.f17537wd.mml() + "run in  " + Thread.currentThread().getName());
            }
            if (this.mzz.getAndSet(false)) {
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.3
                    @Override // java.lang.Runnable
                    public void run() {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (wd.this.jpc != null) {
                            wd wdVar = wd.this;
                            wdVar.qdl(wdVar.jpc, jElapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        qdl(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
        lnrVar.qdl(-3);
        lnrVar.lnr(8);
        com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 : ljhVar.gxp()) {
            if (com.bytedance.sdk.openadsdk.core.model.ljh.mzz(ljhVar2) && ljhVar2.tdy() != null && ljhVar2.tdy().rq() != null) {
                if (com.bytedance.sdk.openadsdk.core.yt.mml().mzz(String.valueOf(ljhVar2.fz())) && com.bytedance.sdk.openadsdk.core.yt.mml().ijp()) {
                    com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = com.bytedance.sdk.openadsdk.core.model.ljh.qdl(CacheDirFactory.getICacheDir(ljhVar2.lhl()).lnr(), ljhVar2);
                    udVarQdl.qdl("material_meta", ljhVar2);
                    udVarQdl.qdl("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, null);
                }
            }
        }
    }

    private PAGBannerAd qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeFl = ljhVar.fl();
        float fMin = Math.min(this.qdl.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeFl != null) {
            width = pAGBannerSizeFl.getWidth();
            height = pAGBannerSizeFl.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.qdl.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.qdl.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.mml.wd(this.lnr, ljhVar, this.qdl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, long j10) {
        if (this.mml != null) {
            PAGBannerAd pAGBannerAdQdl = qdl(ljhVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMml = this.f17537wd.mml();
            if (!TextUtils.isEmpty(this.qdl.getBidAdm())) {
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl(ljhVar, jMml);
            }
            this.mml.onAdLoaded(pAGBannerAdQdl);
            qdl(ljhVar, jMml, j10, jElapsedRealtime);
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, final long j10, final long j11, final long j12) {
        try {
            if (!com.bytedance.sdk.openadsdk.core.yt.mml().dk() || !com.bytedance.sdk.openadsdk.jyq.qdl.mml() || this.mo != 1 || ljhVar == null || ljhVar.gxp() == null || ljhVar.gxp().isEmpty() || ljhVar.mml().qdl() == null) {
                return;
            }
            final JSONObject jSONObjectQdl = ljhVar.mml().qdl();
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, jSONObjectQdl.optString(s.z.f67720z, ""), "load_ad_time", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.4
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    try {
                        long jOptLong = jSONObjectQdl.optLong("callback_start", 0L);
                        long j13 = j11;
                        long j14 = j13 - jOptLong;
                        long j15 = j12 - j13;
                        JSONObject jSONObjectOptJSONObject = jSONObjectQdl.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j14);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j15);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j10);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject ud() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", jSONObjectQdl.optLong("duration", 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i10, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.mzz.getAndSet(false) || (pAGBannerAdLoadListener = this.mml) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i10, str);
    }
}
