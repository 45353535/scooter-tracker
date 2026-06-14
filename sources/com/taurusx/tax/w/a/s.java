package com.taurusx.tax.w.a;

import android.text.TextUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.ui.AppOpenAdActivity;
import com.taurusx.tax.ui.TaurusxH5Activity;
import com.taurusx.tax.ui.TaxVideoActivity;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.w.c.y;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class s extends y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f67195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67196g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f67197i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VastConfig f67198m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f67199p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f67200t;

    public static class w {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Map<String, com.taurusx.tax.w.c.z> f67201z;

        public static class z {

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final w f67202z = new w(null);
        }

        public /* synthetic */ w(z zVar) {
            this();
        }

        public static w z() {
            return z.f67202z;
        }

        public void w(String str) {
            this.f67201z.remove(str);
        }

        public w() {
            this.f67201z = new HashMap(2);
        }

        public void z(String str, com.taurusx.tax.w.c.z zVar) {
            this.f67201z.put(str, zVar);
        }

        public com.taurusx.tax.w.c.z z(String str) {
            return this.f67201z.get(str);
        }
    }

    public class z implements VastManager.VastManagerListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f67204z;

        public z(long j10) {
            this.f67204z = j10;
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoConfigurationPrepared(VastConfig vastConfig, com.taurusx.tax.w.w wVar, long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onVastVideoConfigurationPrepared ");
            sb2.append(vastConfig == null ? "null" : vastConfig.toJsonString());
            LogUtil.sensitiveD(y.f67233n, sb2.toString());
            if (vastConfig == null || TextUtils.isEmpty(vastConfig.getDiskMediaFileUrl())) {
                com.taurusx.tax.w.s.s sVar = s.this.f67240z;
                if (sVar != null) {
                    sVar.z(1, System.currentTimeMillis() - this.f67204z, vastConfig != null ? vastConfig.getDownloadRetriedCount() + 1 : 0, wVar.getCode(), wVar.getMessageCompatibility(), j10);
                }
                c cVar = s.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(wVar);
                    return;
                }
                return;
            }
            s.this.f67198m = vastConfig;
            if (s.this.f67240z != null) {
                s.this.f67240z.z(1, System.currentTimeMillis() - this.f67204z, vastConfig.isDownloadFromCache() ? 0 : vastConfig.getDownloadRetriedCount() + 1, com.taurusx.tax.w.w.SUCCESS.getCode(), "", j10);
            }
            c cVar2 = s.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
            }
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoDownloadStart() {
            com.taurusx.tax.w.s.s sVar = s.this.f67240z;
            if (sVar != null) {
                sVar.z(1);
            }
        }
    }

    public s(String str, com.taurusx.tax.w.c.y yVar) {
        super(str, yVar);
        this.f67200t = false;
    }

    @Override // com.taurusx.tax.w.a.y
    public void c() {
        z(this.f67238w, this.f67235c);
    }

    public void o() {
        y.w.C0823w c0823wW;
        com.taurusx.tax.w.c.z zVar = new com.taurusx.tax.w.c.z();
        zVar.y(this.f67239y);
        zVar.z(this.f67238w);
        zVar.z(this.f67198m);
        zVar.o(this.f67200t);
        zVar.s(this.f67196g);
        zVar.z(this.f67197i);
        zVar.z(this.f67240z);
        zVar.z(this.f67235c);
        zVar.z(this.f67236o);
        zVar.w(this.f67195f);
        zVar.w(w());
        zVar.z(z());
        com.taurusx.tax.w.c.y yVar = this.f67235c;
        if (yVar == null || yVar.c() == null) {
            c0823wW = null;
        } else {
            c0823wW = this.f67235c.c().w();
            if (c0823wW != null) {
                zVar.c(c0823wW.m() / 1000);
                zVar.o((int) (c0823wW.e() / 1000));
                zVar.a(c0823wW.I() / 1000);
                zVar.y(c0823wW.P());
                zVar.y(c0823wW.g() / 1000);
                zVar.c(c0823wW.O());
                zVar.z(c0823wW.L());
                zVar.w(c0823wW.M());
                zVar.y(c0823wW.y());
                zVar.z((int) (c0823wW.o() / 1000));
                zVar.w((int) (c0823wW.s() / 1000));
                zVar.z(c0823wW.c());
            }
        }
        w.z().z(this.f67239y, zVar);
        if ("splash".equals(this.f67199p)) {
            AppOpenAdActivity.w(this.f67239y);
            return;
        }
        if (c0823wW != null && c0823wW.Q() && !TextUtils.isEmpty(c0823wW.v())) {
            if (new File(com.taurusx.tax.g.n0.z.z(TaurusXAds.getContext()).getPath() + "/" + j0.z(c0823wW.v())).exists()) {
                TaurusxH5Activity.z(this.f67239y, false);
                return;
            }
        }
        TaxVideoActivity.w(this.f67239y);
    }

    @Override // com.taurusx.tax.w.a.y
    public void z(com.taurusx.tax.w.y yVar) {
        super.z(yVar);
        this.f67200t = yVar.s();
        this.f67196g = yVar.o();
        this.f67195f = yVar.c();
        this.f67199p = yVar.w();
    }

    private void z(y.z zVar, com.taurusx.tax.w.c.y yVar) {
        LogUtil.d("taurusx", "TaxInterAndRewardedImp parseAdm");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zVar != null) {
            this.f67197i = zVar.w();
        }
        if (zVar != null && "vast".equalsIgnoreCase(zVar.w())) {
            new VastManager(TaurusXAds.getContext(), true, yVar).prepareVastVideoConfiguration(zVar.z(), new z(jCurrentTimeMillis), TaurusXAds.getContext());
            return;
        }
        if (zVar != null && "html".equalsIgnoreCase(zVar.w())) {
            c cVar = this.f67236o;
            if (cVar != null) {
                cVar.onAdLoaded();
                return;
            }
            return;
        }
        if (zVar != null && POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(zVar.w())) {
            c cVar2 = this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
                return;
            }
            return;
        }
        c cVar3 = this.f67236o;
        if (cVar3 != null) {
            cVar3.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
        }
        com.taurusx.tax.w.s.s sVar = this.f67240z;
        if (sVar != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT;
            sVar.z(1, jCurrentTimeMillis2, 0, wVar.getCode(), wVar.getMessageCompatibility(), 0L);
        }
    }
}
