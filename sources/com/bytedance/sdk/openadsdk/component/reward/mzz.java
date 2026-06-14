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
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
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
public class mzz {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile mzz qdl;
    private final AtomicBoolean lnr = new AtomicBoolean(false);
    private final List<lnr> mml = DesugarCollections.synchronizedList(new ArrayList());
    private final bqt.qdl mo = new bqt.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.2
        @Override // com.bytedance.sdk.component.utils.bqt.qdl
        public void qdl(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                if (mzz.this.mzz == null) {
                    mzz mzzVar = mzz.this;
                    mzzVar.mzz = new com.bytedance.sdk.openadsdk.component.reward.ud("fsv net connect task", mzzVar.mml);
                }
                com.bytedance.sdk.component.utils.tvp.qdl().post(mzz.this.mzz);
            }
        }
    };
    private com.bytedance.sdk.component.jpc.jpc mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Context f17047ud;

    private static class lnr extends com.bytedance.sdk.component.jpc.jpc {
        final com.bytedance.sdk.openadsdk.core.model.qdl lnr;
        final ljh qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        final AdSlot f17056ud;

        lnr(ljh ljhVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
            super("Fullscreen Task");
            this.qdl = ljhVar;
            this.f17056ud = adSlot;
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
            udVarQdl.qdl("ad_slot", this.f17056ud);
            com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.lnr.1
                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10, String str) {
                }

                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10) {
                    mml mmlVarQdl = mml.qdl(yt.qdl());
                    lnr lnrVar2 = lnr.this;
                    mmlVarQdl.qdl(lnrVar2.f17056ud, lnrVar2.lnr);
                }
            });
        }
    }

    private static class qdl implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.qdl lnr;
        private final PAGInterstitialAdLoadListener mml;
        private final boolean mzz;
        private final Context qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final AdSlot f17057ud;

        public qdl(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z10) {
            this.qdl = context;
            this.f17057ud = adSlot;
            this.lnr = qdlVar;
            this.mml = pAGInterstitialAdLoadListener;
            this.mzz = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public void onError(int i10, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.mml;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i10, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            mzz.qdl(this.qdl).qdl(this.f17057ud, this.lnr, this.mml, pAGInterstitialAd, this.mzz);
        }
    }

    private static class ud implements PAGInterstitialAdLoadListener {
        private final AtomicInteger lnr;
        private final com.bytedance.sdk.openadsdk.core.model.qdl mml;
        private final PAGInterstitialAdLoadListener qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final AtomicBoolean f17058ud;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public void onError(int i10, String str) {
            if (this.lnr.decrementAndGet() > 0 || !this.f17058ud.compareAndSet(false, true)) {
                return;
            }
            this.qdl.onError(i10, str);
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.ud.1
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                @Nullable
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", ud.this.mml.ud());
                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("choose_ad_load_error").ud(jSONObject.toString());
                }
            });
        }

        private ud(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
            this.f17058ud = new AtomicBoolean(false);
            this.qdl = pAGInterstitialAdLoadListener;
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
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.lnr.decrementAndGet();
            if (this.qdl == null || !this.f17058ud.compareAndSet(false, true)) {
                return;
            }
            this.qdl.onAdLoaded(pAGInterstitialAd);
        }
    }

    private mzz(Context context) {
        this.f17047ud = context == null ? yt.qdl() : context.getApplicationContext();
        lnr();
    }

    private void mml(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 1;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.8
            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
                if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
                    rdp rdpVar = new rdp(mzz.this.f17047ud, qdlVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(qdlVar.mml().isEmpty() ? null : qdlVar.mml().get(0));
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(qdlVar.mo(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || yt.mml().vu() != 0) {
                        qdlVar2 = qdlVar;
                    } else {
                        mzz.this.qdl(adSlot, qdlVar, pAGInterstitialAdLoadListener, (PAGInterstitialAd) rdpVar.qdl(), false);
                        qdlVar2 = qdlVar;
                    }
                    mzz.this.qdl(qdlVar2, rdpVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
                    lnrVar.qdl(-3);
                    lnrVar.lnr(5);
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
        mml();
    }

    private void lnr(final AdSlot adSlot) {
        if (mml.qdl(this.f17047ud).ud(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 2;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.3
            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                if (qdlVar.mml() == null || qdlVar.mml().isEmpty()) {
                    return;
                }
                mzz.this.qdl(qdlVar, new rdp(mzz.this.f17047ud, qdlVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    private void ud(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 2;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.1
            boolean qdl = false;

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public String qdl() {
                return mml.qdl(mzz.this.f17047ud).qdl(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                boolean zQdl = mml.qdl(mzz.this.f17047ud).qdl(qdlVar);
                this.qdl = zQdl;
                return zQdl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                if (this.qdl || qdlVar.mml() == null || qdlVar.mml().isEmpty()) {
                    return;
                }
                mzz.this.qdl(qdlVar, new rdp(mzz.this.f17047ud, qdlVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    public static mzz qdl(Context context) {
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml(AdSlot adSlot) {
        if (ud() != 2) {
            return;
        }
        mml.qdl(this.f17047ud).qdl(adSlot.getCodeId());
    }

    private void ud(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 1;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.4
            boolean qdl = false;

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
                if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
                    rdp rdpVar = new rdp(mzz.this.f17047ud, qdlVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(qdlVar.mml().isEmpty() ? null : qdlVar.mml().get(0));
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(qdlVar.mo(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || yt.mml().vu() != 0) {
                        qdlVar2 = qdlVar;
                    } else {
                        mzz.this.qdl(adSlot, qdlVar, pAGInterstitialAdLoadListener, rdpVar.qdl(), this.qdl);
                        qdlVar2 = qdlVar;
                    }
                    mzz.this.qdl(qdlVar2, rdpVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
                    lnrVar.qdl(-3);
                    lnrVar.lnr(5);
                    com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public String qdl() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strQdl = mml.qdl(mzz.this.f17047ud).qdl(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strQdl)) {
                    return null;
                }
                return strQdl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                boolean zQdl = mml.qdl(mzz.this.f17047ud).qdl(qdlVar);
                this.qdl = zQdl;
                return zQdl;
            }
        });
    }

    private void lnr(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarUd;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (qdlVarUd = mml.qdl(this.f17047ud).ud(adSlot.getCodeId(), true)) != null && qdlVarUd.mzz()) {
            qdl(adSlot, qdlVarUd, pAGInterstitialAdLoadListener);
        } else {
            mml(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    private void mml() {
        if (this.lnr.get()) {
            this.lnr.set(false);
            try {
                bqt.qdl(this.mo);
            } catch (Exception unused) {
            }
        }
    }

    public void qdl() {
        try {
            mml.qdl(this.f17047ud).qdl();
        } catch (Throwable unused) {
        }
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
            return;
        }
        this.lnr.set(true);
        bqt.qdl(this.mo, this.f17047ud);
    }

    public static int ud() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("ivrv_load_ad_cache_strategy", 0);
    }

    public void qdl(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            ud(adSlot, pAGInterstitialAdLoadListener);
        } else {
            lnr(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    private void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
        mzz mzzVar;
        AdSlot adSlot2;
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar3;
        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
        ljh ljhVarMo = qdlVar.mo();
        for (ljh ljhVar : qdlVar.mml()) {
            if (ljhVar.ji() == null) {
                ljhVar.qdl(adSlot);
            }
        }
        rdp rdpVar = new rdp(this.f17047ud, qdlVar);
        if (!vu.lnr(ljhVarMo)) {
            rdpVar.ud();
        }
        if (pAGInterstitialAdLoadListener != null) {
            com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(qdlVar);
            if (yt.mml().vu() == 0) {
                mzzVar = this;
                adSlot2 = adSlot;
                qdlVar3 = qdlVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                mzzVar.qdl(adSlot2, qdlVar3, pAGInterstitialAdLoadListener2, (PAGInterstitialAd) rdpVar.qdl(), true);
            } else {
                mzzVar = this;
                adSlot2 = adSlot;
                qdlVar3 = qdlVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
            }
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener3 = pAGInterstitialAdLoadListener2;
            AdSlot adSlot3 = adSlot2;
            com.bytedance.sdk.openadsdk.core.model.qdl qdlVar4 = qdlVar3;
            qdlVar2 = qdlVar4;
            ud udVar = new ud(new qdl(mzzVar.f17047ud, adSlot3, qdlVar4, pAGInterstitialAdLoadListener3, true), qdlVar2);
            for (int i10 = 0; i10 < qdlVar2.mml().size(); i10++) {
                qdl(qdlVar2.mml().get(i10), adSlot3, udVar, rdpVar);
                if (qdlVar2.to()) {
                    break;
                }
            }
        } else {
            qdlVar2 = qdlVar;
        }
        for (int i11 = 0; i11 < qdlVar2.mml().size(); i11++) {
            com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdlVar2.mml().get(i11), new qdl.InterfaceC0253qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.5
                @Override // com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0253qdl
                public void qdl(boolean z10) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.6
            @Override // java.lang.Runnable
            public void run() {
                int iUd = mzz.ud();
                if (!z10) {
                    if (iUd == 2) {
                        mml.qdl(mzz.this.f17047ud).qdl(adSlot, qdlVar);
                        mzz.this.mml(adSlot);
                        return;
                    }
                    return;
                }
                if (iUd == 2) {
                    mzz.this.mml(adSlot);
                } else if (iUd == 1) {
                    mml.qdl(mzz.this.f17047ud).qdl(adSlot.getCodeId(), (ljh) null);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(com.bytedance.sdk.openadsdk.core.model.ljh r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.mzz.ud r6, final com.bytedance.sdk.openadsdk.component.reward.rdp r7) {
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
            if (r1 != 0) goto L3f
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.ljh.mzz(r4)
            if (r1 == 0) goto L3f
            int r1 = r4.lhl()
            com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.qdl()
            com.bytedance.sdk.openadsdk.core.exu.qdl.ud r1 = com.bytedance.sdk.openadsdk.core.model.ljh.qdl(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.qdl(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.qdl(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.mzz$7 r4 = new com.bytedance.sdk.openadsdk.component.reward.mzz$7
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(r1, r4)
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L49
            com.bytedance.sdk.openadsdk.component.reward.mo r4 = r7.qdl()
            r6.onAdLoaded(r4)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.mzz.qdl(com.bytedance.sdk.openadsdk.core.model.ljh, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.mzz$ud, com.bytedance.sdk.openadsdk.component.reward.rdp):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, rdp rdpVar, AdSlot adSlot, boolean z10, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.exu.qdl.qdl().qdl(qdlVar.mo());
        }
        AdSlot adSlot2 = adSlot;
        ud udVar = new ud(new qdl(this.f17047ud, adSlot2, qdlVar, pAGInterstitialAdLoadListener, false), qdlVar);
        qdl(qdlVar);
        int i10 = 0;
        while (i10 < qdlVar.mml().size()) {
            ljh ljhVar = qdlVar.mml().get(i10);
            int iTaz = ljhVar.taz();
            if (i10 == 0 && iTaz == 43) {
                ljhVar.tdy().mo(0);
            }
            rdp rdpVar2 = rdpVar;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            qdl(qdlVar, ljhVar, rdpVar2, adSlot3, z11, udVar);
            adSlot2 = adSlot3;
            if (qdlVar.to() && ljhVar.taz() != 43) {
                return;
            }
            i10++;
            rdpVar = rdpVar2;
            z10 = z11;
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        uw uwVarFs = qdlVar.fs();
        int iJtx = qdlVar.to() ? 10 : 1;
        if (uwVarFs != null) {
            iJtx = uwVarFs.jtx();
        }
        for (final int i10 = 0; i10 < qdlVar.mml().size() && i10 < iJtx; i10++) {
            com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdlVar.mml().get(i10), new qdl.InterfaceC0253qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.9
                @Override // com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0253qdl
                public void qdl(boolean z10) {
                    com.bytedance.sdk.component.utils.aaj.qdl("ScreenVideoLoadM", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private void qdl(final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, ljh ljhVar, rdp rdpVar, final AdSlot adSlot, final boolean z10, ud udVar) {
        final rdp rdpVar2;
        final ud udVar2;
        if (z10 && !vu.lnr(ljhVar) && ljh.mzz(ljhVar) && yt.mml().xmv(adSlot.getCodeId()).mml == 1 && !jl.mml(this.f17047ud)) {
            qdl(new lnr(ljhVar, adSlot, qdlVar));
            return;
        }
        boolean z11 = false;
        boolean z12 = udVar != null && yt.mml().vu() == 1;
        if (vu.lnr(ljhVar)) {
            rdpVar2 = rdpVar;
            udVar2 = udVar;
            if (z10) {
                mml.qdl(this.f17047ud).qdl(adSlot, qdlVar);
            }
        } else if (ljh.mzz(ljhVar)) {
            if (ljhVar.tdy() != null) {
                com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(ljhVar.lhl()).qdl(), ljhVar);
                udVarQdl.qdl("material_meta", ljhVar);
                udVarQdl.qdl("ad_slot", adSlot);
                rdpVar2 = rdpVar;
                udVar2 = udVar;
                com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.10
                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10) {
                        rdpVar2.ud();
                        if (z10) {
                            mml.qdl(mzz.this.f17047ud).qdl(adSlot, qdlVar);
                        } else {
                            if (udVar2 == null || yt.mml().vu() != 1) {
                                return;
                            }
                            udVar2.onAdLoaded(rdpVar2.qdl());
                        }
                    }

                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
                    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10, String str) {
                        if (udVar2 == null || yt.mml().vu() != 1) {
                            return;
                        }
                        udVar2.onError(i10, str);
                    }
                });
            } else {
                rdpVar2 = rdpVar;
                udVar2 = udVar;
                z11 = z12;
            }
            z12 = z11;
        } else {
            rdpVar2 = rdpVar;
            udVar2 = udVar;
            if (z10) {
                mml.qdl(this.f17047ud).qdl(adSlot, qdlVar);
            }
        }
        if (z12) {
            udVar2.onAdLoaded(rdpVar2.qdl());
        }
    }

    private void qdl(lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        if (this.mml.size() > 0) {
            this.mml.remove(0);
        }
        this.mml.add(lnrVar);
    }

    public void qdl(String str, ljh ljhVar) {
        mml.qdl(this.f17047ud).qdl(str, ljhVar);
    }
}
