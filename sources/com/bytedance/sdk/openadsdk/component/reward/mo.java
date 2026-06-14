package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.ud;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.bytedance.sdk.openadsdk.utils.uw;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class mo extends PAGInterstitialAd {
    private boolean jpc;
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud lnr;
    private final Context qdl;
    private boolean tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.qdl f17042ud;
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private boolean mo = false;
    private boolean mml = false;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final String f17043wd = uw.qdl();

    mo(Context context, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        this.qdl = context;
        this.f17042ud = qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.f17042ud;
        if (qdlVar == null || qdlVar.mo() == null || this.f17042ud.mo().dsy() == null) {
            return null;
        }
        try {
            return this.f17042ud.mo().dsy().get(str);
        } catch (Throwable th2) {
            aaj.lnr("TTFullScreenVideoAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.f17042ud;
        if (qdlVar == null || qdlVar.mo() == null) {
            return null;
        }
        return this.f17042ud.mo().dsy();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.tvp) {
            return;
        }
        rc.qdl(this.f17042ud.mo(), d10, str, str2);
        this.tvp = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.lnr = new com.bytedance.sdk.openadsdk.component.lnr.qdl(pAGInterstitialAdInteractionCallback);
        qdl(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.lnr = new com.bytedance.sdk.openadsdk.component.lnr.qdl(pAGInterstitialAdInteractionListener);
        qdl(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.f17042ud;
        if (qdlVar != null && qdlVar.mzz()) {
            final ljh ljhVarMo = this.f17042ud.mo();
            if (!com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
                throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
            }
            List<ljh> listMml = this.f17042ud.mml();
            if (listMml != null) {
                Iterator<ljh> it = listMml.iterator();
                while (it.hasNext()) {
                    IPMiBroadcastReceiver.qdl(this.qdl, it.next());
                }
            }
            if (!this.mzz.get()) {
                this.mzz.set(true);
                if (ljhVarMo == null || (ljhVarMo.tdy() == null && ljhVarMo.vm() == null)) {
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "materialMeta error ");
                    return;
                }
                Context contextQdl = activity == null ? this.qdl : activity;
                if (contextQdl == null) {
                    contextQdl = yt.qdl();
                }
                Intent intent = jpc.qdl(this.f17042ud) ? new Intent(contextQdl, (Class<?>) TTAdActivity.class) : qdl(ljhVarMo) ? com.bytedance.sdk.openadsdk.component.reward.ud.jpc.qdl(ljhVarMo) ? new Intent(contextQdl, (Class<?>) TTInterstitialExpressActivity.class) : new Intent(contextQdl, (Class<?>) TTFullScreenExpressVideoActivity.class) : com.bytedance.sdk.openadsdk.component.reward.ud.jpc.qdl(ljhVarMo) ? new Intent(contextQdl, (Class<?>) TTInterstitialActivity.class) : new Intent(contextQdl, (Class<?>) TTFullScreenVideoActivity.class);
                intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                boolean zTvp = com.bytedance.sdk.openadsdk.jyq.qdl.tvp();
                com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(intent, activity, this.mml, this.f17042ud, this.f17043wd);
                intent.putExtra("is_verity_playable", this.mo);
                intent.putExtra("enable_new_arch", zTvp);
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    if (zTvp) {
                        koa.qdl().qdl(this.f17043wd, this.lnr);
                    } else {
                        koa.qdl().qdl(this.lnr);
                    }
                    this.lnr = null;
                }
                final boolean z10 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("start_activity_async", 0) == 1;
                if (z10) {
                    com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.1
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                            qdlVar2.ud("start_activity");
                            qdlVar2.mml("fullscreen_interstitial_ad");
                            return qdlVar2;
                        }
                    });
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.component.utils.ud.qdl(contextQdl, intent, new ud.InterfaceC0240ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2
                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0240ud
                    public void qdl() {
                        if (mo.this.mo) {
                            try {
                                com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(ljhVarMo.tdy().fs());
                            } catch (Throwable unused) {
                            }
                        }
                        if (z10) {
                            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2.1
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml("fullscreen_interstitial_ad");
                                    return qdlVar2;
                                }
                            });
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("start_activity_action", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2.2
                                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("duration", jElapsedRealtime2);
                                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("start_activity_action").ud(jSONObject.toString());
                                }
                            });
                        }
                    }

                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0240ud
                    public void qdl(Throwable th2) {
                        if (mo.this.mo) {
                            try {
                                com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(ljhVarMo.tdy().fs(), -1, th2 != null ? th2.getMessage() : "playable tool error open");
                            } catch (Throwable unused) {
                            }
                        }
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "activity start  fail ");
                        if (z10) {
                            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2.3
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml("fullscreen_interstitial_ad");
                                    return qdlVar2;
                                }
                            });
                        }
                    }
                }, true);
                qdl.qdl(this.f17042ud.mo(), this.mml, false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.jpc) {
            return;
        }
        rc.qdl(this.f17042ud.mo(), d10);
        this.jpc = true;
    }

    public void qdl(boolean z10) {
        this.mo = z10;
    }

    public void qdl() {
        if (this.mzz.get()) {
            return;
        }
        this.mml = true;
    }

    private static boolean qdl(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        return ljhVar.mo();
    }

    private void qdl(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            fco.lnr(new com.bytedance.sdk.component.jpc.jpc("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl();
                    if (i10 != 1 || mo.this.lnr == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.ud.lnr lnrVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ud.lnr(mo.this.lnr);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(qdlVarQdl.qdl(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(mo.this.f17043wd, lnrVar);
                        } catch (RemoteException e10) {
                            aaj.lnr("TTFullScreenVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
