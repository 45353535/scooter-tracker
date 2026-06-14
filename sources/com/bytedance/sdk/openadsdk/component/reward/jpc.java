package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.ud;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.bytedance.sdk.openadsdk.utils.uw;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class jpc extends PAGRewardedAd {
    private boolean jpc;
    private final AdSlot lnr;
    private com.bytedance.sdk.openadsdk.qdl.mzz.qdl mml;
    private boolean mzz;
    private final Context qdl;
    private boolean tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.qdl f17031ud;
    private final AtomicBoolean mo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final String f17032wd = uw.qdl();

    jpc(Context context, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, AdSlot adSlot) {
        this.qdl = context;
        this.f17031ud = qdlVar;
        this.lnr = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.f17031ud;
        if (qdlVar == null || qdlVar.mo() == null || this.f17031ud.mo().dsy() == null) {
            return null;
        }
        try {
            return this.f17031ud.mo().dsy().get(str);
        } catch (Throwable th2) {
            aaj.lnr("TTRewardVideoAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.f17031ud;
        if (qdlVar == null || qdlVar.mo() == null) {
            return null;
        }
        return this.f17031ud.mo().dsy();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.tvp) {
            return;
        }
        rc.qdl(this.f17031ud.mo(), d10, str, str2);
        this.tvp = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.mml = new tvp(pAGRewardedAdInteractionCallback);
        qdl(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.mml = new tvp(pAGRewardedAdInteractionListener);
        qdl(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity) {
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.f17031ud;
        if (qdlVar != null && qdlVar.mzz()) {
            final ljh ljhVarMo = this.f17031ud.mo();
            if (!com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
                throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
            }
            List<ljh> listMml = this.f17031ud.mml();
            if (listMml != null) {
                Iterator<ljh> it = listMml.iterator();
                while (it.hasNext()) {
                    IPMiBroadcastReceiver.qdl(this.qdl, it.next());
                }
            }
            if (this.mo.compareAndSet(false, true)) {
                if (ljhVarMo == null || ljhVarMo.tdy() == null) {
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "materialMeta error ");
                    return;
                }
                Context contextQdl = activity == null ? this.qdl : activity;
                if (contextQdl == null) {
                    contextQdl = yt.qdl();
                }
                Intent intent = qdl(this.f17031ud) ? new Intent(contextQdl, (Class<?>) TTAdActivity.class) : qdl(ljhVarMo) ? new Intent(contextQdl, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(contextQdl, (Class<?>) TTRewardVideoActivity.class);
                boolean zTvp = com.bytedance.sdk.openadsdk.jyq.qdl.tvp();
                com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(intent, activity, this.mzz, this.f17031ud, this.f17032wd);
                intent.putExtra("media_extra", this.lnr.getMediaExtra());
                intent.putExtra("user_id", this.lnr.getUserID());
                intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                intent.putExtra("enable_new_arch", zTvp);
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    Objects.toString(this.mml);
                    if (zTvp) {
                        koa.qdl().qdl(this.f17032wd, this.mml);
                    } else {
                        koa.qdl().qdl(this.mml);
                    }
                    this.mml = null;
                }
                final boolean z10 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("start_activity_async", 0) == 1;
                if (z10) {
                    com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.1
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                            qdlVar2.ud("start_activity");
                            qdlVar2.mml(Constants.REWARDED_VIDEO);
                            return qdlVar2;
                        }
                    });
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.component.utils.ud.qdl(contextQdl, intent, new ud.InterfaceC0240ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2
                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0240ud
                    public void qdl() {
                        if (z10) {
                            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2.1
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml(Constants.REWARDED_VIDEO);
                                    return qdlVar2;
                                }
                            });
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("start_activity_action", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2.2
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
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "activity start  fail ");
                        if (z10) {
                            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2.3
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml(Constants.REWARDED_VIDEO);
                                    return qdlVar2;
                                }
                            });
                        }
                    }
                }, true);
                qdl.qdl(this.f17031ud.mo(), this.mzz, true);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.jpc) {
            return;
        }
        rc.qdl(this.f17031ud.mo(), d10);
        this.jpc = true;
    }

    public void qdl() {
        if (this.mo.get()) {
            return;
        }
        this.mzz = true;
    }

    private static boolean qdl(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        return ljhVar.mo();
    }

    private void qdl(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            fco.lnr(new com.bytedance.sdk.component.jpc.jpc("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl();
                    if (i10 != 0 || jpc.this.mml == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml mmlVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml(jpc.this.mml);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(qdlVarQdl.qdl(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(jpc.this.f17032wd, mmlVar);
                        } catch (RemoteException e10) {
                            aaj.lnr("TTRewardVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        ljh ljhVarMo;
        if (qdlVar == null || (ljhVarMo = qdlVar.mo()) == null || com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVarMo)) {
            return false;
        }
        if (ljhVarMo.ax()) {
            return true;
        }
        try {
            String strQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("rviv_new_arch", (String) null);
            if (TextUtils.isEmpty(strQdl)) {
                return false;
            }
            JSONArray jSONArray = new JSONArray(strQdl);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                int i11 = jSONArray.getInt(i10);
                if (ljh.taz(ljhVarMo.taz())) {
                    if (ljhVarMo.ax() && ljhVarMo.taz() == i11) {
                        return true;
                    }
                } else if (ljhVarMo.taz() == i11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
