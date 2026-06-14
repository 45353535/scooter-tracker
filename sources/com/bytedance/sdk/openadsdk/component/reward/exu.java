package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.bqt;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.aaj;
import com.bytedance.sdk.openadsdk.core.exu.lnr.qdl;
import com.bytedance.sdk.openadsdk.core.jyq;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.uw;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.yt;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class exu {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile exu qdl;
    private final AtomicBoolean lnr = new AtomicBoolean(false);
    private final List<ud> mml = DesugarCollections.synchronizedList(new ArrayList());
    private final bqt.qdl mo = new bqt.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.2
        @Override // com.bytedance.sdk.component.utils.bqt.qdl
        public void qdl(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                if (exu.this.mzz == null) {
                    exu exuVar = exu.this;
                    exuVar.mzz = new com.bytedance.sdk.openadsdk.component.reward.ud("net connect task", exuVar.mml);
                }
                com.bytedance.sdk.component.utils.tvp.qdl().post(exu.this.mzz);
            }
        }
    };
    private com.bytedance.sdk.component.jpc.jpc mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Context f17017ud;

    private static class lnr implements PAGRewardedAdLoadListener {
        private final AtomicInteger lnr;
        private final com.bytedance.sdk.openadsdk.core.model.qdl mml;
        private final PAGRewardedAdLoadListener qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final AtomicBoolean f17027ud;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public void onError(int i10, String str) {
            if (this.lnr.decrementAndGet() > 0 || this.qdl == null || !this.f17027ud.compareAndSet(false, true)) {
                return;
            }
            this.qdl.onError(i10, str);
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.lnr.1
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                @Nullable
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lnr.this.mml.ud());
                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("choose_ad_load_error").ud(jSONObject.toString());
                }
            });
        }

        private lnr(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
            this.f17027ud = new AtomicBoolean(false);
            this.qdl = pAGRewardedAdLoadListener;
            this.mml = qdlVar;
            this.lnr = new AtomicInteger(qdl());
        }

        private int qdl() {
            if (!this.mml.mzz()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.mml.mml().size(); i11++) {
                ljh ljhVar = this.mml.mml().get(i11);
                if (ljhVar != null && !vu.lnr(ljhVar) && ljhVar.tdy() != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.lnr.decrementAndGet();
            if (this.qdl == null || !this.f17027ud.compareAndSet(false, true)) {
                return;
            }
            this.qdl.onAdLoaded(pAGRewardedAd);
        }
    }

    private static class qdl implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.qdl lnr;
        private final PAGRewardedAdLoadListener mml;
        private final boolean mzz;
        private final Context qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final AdSlot f17028ud;

        public qdl(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z10) {
            this.qdl = context;
            this.f17028ud = adSlot;
            this.lnr = qdlVar;
            this.mml = pAGRewardedAdLoadListener;
            this.mzz = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public void onError(int i10, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.mml;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i10, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            exu.qdl(this.qdl).qdl(this.f17028ud, this.lnr, this.mml, pAGRewardedAd, this.mzz);
        }
    }

    public static class ud extends com.bytedance.sdk.component.jpc.jpc {
        final com.bytedance.sdk.openadsdk.core.model.qdl lnr;
        final ljh qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        final AdSlot f17029ud;

        ud(ljh ljhVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
            super("Reward Task");
            this.qdl = ljhVar;
            this.f17029ud = adSlot;
            this.lnr = qdlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ljh ljhVar = this.qdl;
            if (ljhVar == null || ljhVar.tdy() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(this.qdl.lhl()).qdl(), this.qdl);
            udVarQdl.qdl("material_meta", this.qdl);
            udVarQdl.qdl("ad_slot", this.f17029ud);
            com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.ud.1
                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10, String str) {
                }

                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10) {
                    fs fsVarQdl = fs.qdl(yt.qdl());
                    ud udVar = ud.this;
                    fsVarQdl.qdl(udVar.f17029ud, udVar.lnr);
                }
            });
        }
    }

    private exu(Context context) {
        this.f17017ud = context == null ? yt.qdl() : context.getApplicationContext();
        ud();
    }

    private void mml(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.bjy.mml()) {
            com.bykv.vk.openvk.qdl.qdl.qdl.wd.ud.qdl(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.f17341ud = 1;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 7, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.7
            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
                if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
                    bjy bjyVar = new bjy(exu.this.f17017ud, qdlVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(qdlVar.mml().isEmpty() ? null : qdlVar.mml().get(0));
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(qdlVar.mo(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || yt.mml().vu() != 0) {
                        qdlVar2 = qdlVar;
                    } else {
                        exu.this.qdl(adSlot, qdlVar, pAGRewardedAdLoadListener, (PAGRewardedAd) bjyVar.qdl(), false);
                        qdlVar2 = qdlVar;
                    }
                    exu.this.qdl(qdlVar2, bjyVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
                    lnrVar.qdl(-3);
                    lnrVar.lnr(6);
                    com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                }
            }
        });
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.mzz != null) {
            try {
                com.bytedance.sdk.component.utils.tvp.qdl().removeCallbacks(this.mzz);
            } catch (Exception unused) {
            }
            this.mzz = null;
        }
        lnr();
    }

    private void lnr(final AdSlot adSlot) {
        if (fs.qdl(this.f17017ud).ud(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.f17341ud = 2;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 7, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.3
            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                if (qdlVar.mml() == null || qdlVar.mml().isEmpty()) {
                    return;
                }
                exu.this.qdl(qdlVar, new bjy(exu.this.f17017ud, qdlVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    private void ud(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.f17341ud = 2;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 7, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.1
            boolean qdl = false;

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public String qdl() {
                return fs.qdl(exu.this.f17017ud).qdl(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                boolean zQdl = fs.qdl(exu.this.f17017ud).qdl(qdlVar);
                this.qdl = zQdl;
                return zQdl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                if (this.qdl || qdlVar.mml() == null || qdlVar.mml().isEmpty()) {
                    return;
                }
                exu.this.qdl(qdlVar, new bjy(exu.this.f17017ud, qdlVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    public static exu qdl(Context context) {
        if (qdl == null) {
            synchronized (exu.class) {
                try {
                    if (qdl == null) {
                        qdl = new exu(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    private void ud(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.bjy.mml()) {
            com.bykv.vk.openvk.qdl.qdl.qdl.wd.ud.qdl(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.f17341ud = 1;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 7, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.4
            boolean qdl = false;

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
                if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
                    bjy bjyVar = new bjy(exu.this.f17017ud, qdlVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(qdlVar.mml().isEmpty() ? null : qdlVar.mml().get(0));
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(qdlVar.mo(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || yt.mml().vu() != 0) {
                        qdlVar2 = qdlVar;
                    } else {
                        exu.this.qdl(adSlot, qdlVar, pAGRewardedAdLoadListener, bjyVar.qdl(), this.qdl);
                        qdlVar2 = qdlVar;
                    }
                    exu.this.qdl(qdlVar2, bjyVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
                    lnrVar.qdl(-3);
                    lnrVar.lnr(6);
                    com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public String qdl() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strQdl = fs.qdl(exu.this.f17017ud).qdl(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strQdl)) {
                    return null;
                }
                return strQdl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                boolean zQdl = fs.qdl(exu.this.f17017ud).qdl(qdlVar);
                this.qdl = zQdl;
                return zQdl;
            }
        });
    }

    private void lnr(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarUd;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (qdlVarUd = fs.qdl(this.f17017ud).ud(adSlot.getCodeId(), true)) != null && qdlVarUd.mzz()) {
            qdl(qdlVarUd, adSlot, pAGRewardedAdLoadListener);
        } else {
            mml(adSlot, pAGRewardedAdLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml(AdSlot adSlot) {
        if (mzz.ud() != 2) {
            return;
        }
        fs.qdl(this.f17017ud).qdl(adSlot.getCodeId());
    }

    public void qdl(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            ud(adSlot);
        } else {
            lnr(adSlot);
        }
    }

    private void lnr() {
        if (this.lnr.get()) {
            this.lnr.set(false);
            try {
                bqt.qdl(this.mo);
            } catch (Exception unused) {
            }
        }
    }

    public void qdl(String str, ljh ljhVar) {
        fs.qdl(this.f17017ud).qdl(str, ljhVar);
    }

    private void ud() {
        if (this.lnr.get()) {
            return;
        }
        this.lnr.set(true);
        bqt.qdl(this.mo, this.f17017ud);
    }

    public void qdl() {
        try {
            fs.qdl(this.f17017ud).qdl();
        } catch (Throwable unused) {
        }
    }

    public void qdl(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            ud(adSlot, pAGRewardedAdLoadListener);
        } else {
            lnr(adSlot, pAGRewardedAdLoadListener);
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
        exu exuVar;
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar3;
        AdSlot adSlot2;
        PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
        ljh ljhVarMo = qdlVar.mo();
        for (ljh ljhVar : qdlVar.mml()) {
            if (ljhVar.ji() == null) {
                ljhVar.qdl(adSlot);
            }
        }
        bjy bjyVar = new bjy(this.f17017ud, qdlVar, adSlot);
        if (!vu.lnr(ljhVarMo)) {
            bjyVar.ud();
        }
        if (pAGRewardedAdLoadListener != null) {
            com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(qdlVar);
            if (yt.mml().vu() == 0) {
                exuVar = this;
                qdlVar3 = qdlVar;
                adSlot2 = adSlot;
                pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                exuVar.qdl(adSlot2, qdlVar3, pAGRewardedAdLoadListener2, (PAGRewardedAd) bjyVar.qdl(), true);
            } else {
                exuVar = this;
                qdlVar3 = qdlVar;
                adSlot2 = adSlot;
                pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
            }
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener3 = pAGRewardedAdLoadListener2;
            AdSlot adSlot3 = adSlot2;
            com.bytedance.sdk.openadsdk.core.model.qdl qdlVar4 = qdlVar3;
            qdlVar2 = qdlVar4;
            lnr lnrVar = new lnr(new qdl(exuVar.f17017ud, adSlot3, qdlVar4, pAGRewardedAdLoadListener3, true), qdlVar2);
            for (int i10 = 0; i10 < qdlVar2.mml().size(); i10++) {
                qdl(qdlVar2.mml().get(i10), adSlot3, lnrVar, bjyVar);
                if (qdlVar2.to()) {
                    break;
                }
            }
        } else {
            qdlVar2 = qdlVar;
        }
        for (final int i11 = 0; i11 < qdlVar2.mml().size(); i11++) {
            com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdlVar2.mml().get(i11), new qdl.InterfaceC0253qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.5
                @Override // com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0253qdl
                public void qdl(boolean z10) {
                    com.bytedance.sdk.component.utils.aaj.qdl("RewardVideoLoadManager", "onCachedResponse: i=" + i11 + ", isSuccess=" + z10);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(com.bytedance.sdk.openadsdk.core.model.ljh r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.exu.lnr r6, final com.bytedance.sdk.openadsdk.component.reward.bjy r7) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto Lf
            com.bytedance.sdk.openadsdk.core.settings.rq r1 = com.bytedance.sdk.openadsdk.core.yt.mml()
            int r1 = r1.vu()
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.vu.lnr(r4)
            if (r1 != 0) goto L39
            int r1 = r4.lhl()
            com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.qdl()
            com.bytedance.sdk.openadsdk.core.exu.qdl.ud r1 = com.bytedance.sdk.openadsdk.core.model.ljh.qdl(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.qdl(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.qdl(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.exu$6 r4 = new com.bytedance.sdk.openadsdk.component.reward.exu$6
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(r1, r4)
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto L43
            com.bytedance.sdk.openadsdk.component.reward.jpc r4 = r7.qdl()
            r6.onAdLoaded(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.exu.qdl(com.bytedance.sdk.openadsdk.core.model.ljh, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.exu$lnr, com.bytedance.sdk.openadsdk.component.reward.bjy):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, bjy bjyVar, AdSlot adSlot, boolean z10, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.exu.qdl.qdl().qdl(qdlVar.mo());
        }
        AdSlot adSlot2 = adSlot;
        lnr lnrVar = new lnr(new qdl(this.f17017ud, adSlot2, qdlVar, pAGRewardedAdLoadListener, false), qdlVar);
        qdl(qdlVar);
        int i10 = 0;
        while (i10 < qdlVar.mml().size()) {
            ljh ljhVar = qdlVar.mml().get(i10);
            int iTaz = ljhVar.taz();
            if (i10 == 0 && iTaz == 43) {
                ljhVar.tdy().mo(0);
            }
            bjy bjyVar2 = bjyVar;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            qdl(qdlVar, ljhVar, bjyVar2, adSlot3, z11, lnrVar);
            adSlot2 = adSlot3;
            if (qdlVar.to() && iTaz != 43) {
                return;
            }
            i10++;
            bjyVar = bjyVar2;
            z10 = z11;
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        uw uwVarFs = qdlVar.fs();
        int iJtx = qdlVar.to() ? 10 : 1;
        if (uwVarFs != null) {
            iJtx = uwVarFs.jtx();
        }
        for (final int i10 = 0; i10 < qdlVar.mml().size(); i10++) {
            ljh ljhVar = qdlVar.mml().get(i10);
            if (i10 >= iJtx) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(ljhVar, new qdl.InterfaceC0253qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.8
                @Override // com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0253qdl
                public void qdl(boolean z10) {
                    com.bytedance.sdk.component.utils.aaj.qdl("RewardVideoLoadManager", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private void qdl(final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, ljh ljhVar, bjy bjyVar, final AdSlot adSlot, final boolean z10, lnr lnrVar) {
        final bjy bjyVar2;
        final lnr lnrVar2;
        if (z10 && !vu.lnr(ljhVar) && yt.mml().xmv(adSlot.getCodeId()).mml == 1 && !jl.mml(this.f17017ud)) {
            qdl(new ud(ljhVar, adSlot, qdlVar));
            return;
        }
        boolean z11 = false;
        boolean z12 = lnrVar != null && yt.mml().vu() == 1;
        if (vu.lnr(ljhVar)) {
            bjyVar2 = bjyVar;
            lnrVar2 = lnrVar;
            if (z10) {
                fs.qdl(this.f17017ud).qdl(adSlot, qdlVar);
            }
        } else {
            if (ljhVar.tdy() != null) {
                com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(ljhVar.lhl()).qdl(), ljhVar);
                udVarQdl.qdl("material_meta", ljhVar);
                udVarQdl.qdl("ad_slot", adSlot);
                bjyVar2 = bjyVar;
                lnrVar2 = lnrVar;
                com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.9
                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar3, int i10) {
                        bjyVar2.ud();
                        if (z10) {
                            fs.qdl(exu.this.f17017ud).qdl(adSlot, qdlVar);
                        } else {
                            if (lnrVar2 == null || yt.mml().vu() != 1) {
                                return;
                            }
                            lnrVar2.onAdLoaded(bjyVar2.qdl());
                        }
                    }

                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar3, int i10, String str) {
                        if (lnrVar2 == null || yt.mml().vu() != 1) {
                            return;
                        }
                        lnrVar2.onError(i10, str);
                    }
                });
            } else {
                bjyVar2 = bjyVar;
                lnrVar2 = lnrVar;
                z11 = z12;
            }
            z12 = z11;
        }
        if (z12) {
            lnrVar2.onAdLoaded(bjyVar2.qdl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.exu.10
            @Override // java.lang.Runnable
            public void run() {
                int iUd = mzz.ud();
                if (!z10) {
                    if (iUd == 2) {
                        fs.qdl(exu.this.f17017ud).qdl(adSlot, qdlVar);
                        exu.this.mml(adSlot);
                        return;
                    }
                    return;
                }
                if (iUd == 2) {
                    exu.this.mml(adSlot);
                } else if (iUd == 1) {
                    fs.qdl(exu.this.f17017ud).qdl(adSlot.getCodeId(), (ljh) null);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    private void qdl(ud udVar) {
        if (udVar == null) {
            return;
        }
        if (this.mml.size() > 0) {
            this.mml.remove(0);
        }
        this.mml.add(udVar);
    }
}
