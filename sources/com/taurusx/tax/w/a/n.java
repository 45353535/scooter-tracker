package com.taurusx.tax.w.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.p;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.ui.AppOpenAdActivity;
import com.taurusx.tax.ui.AppOpenNativeAdActivity;
import com.taurusx.tax.ui.TaurusxH5Activity;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.w.c.y;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class n extends com.taurusx.tax.w.a.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f67102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public VastConfig f67103g;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f67104t;

    public class w implements VastManager.VastManagerListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f67106z;

        public w(long j10) {
            this.f67106z = j10;
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoConfigurationPrepared(VastConfig vastConfig, com.taurusx.tax.w.w wVar, long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onVastVideoConfigurationPrepared ");
            sb2.append(vastConfig == null ? "null" : vastConfig.toJsonString());
            LogUtil.sensitiveD(com.taurusx.tax.w.a.y.f67233n, sb2.toString());
            if (vastConfig == null || TextUtils.isEmpty(vastConfig.getDiskMediaFileUrl())) {
                c cVar = n.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(wVar);
                }
                com.taurusx.tax.w.s.s sVar = n.this.f67240z;
                if (sVar != null) {
                    sVar.z(1, System.currentTimeMillis() - this.f67106z, vastConfig != null ? vastConfig.getDownloadRetriedCount() + 1 : 0, wVar.getCode(), wVar.getMessageCompatibility(), j10);
                    return;
                }
                return;
            }
            n.this.f67103g = vastConfig;
            if (n.this.f67240z != null) {
                n.this.f67240z.z(1, System.currentTimeMillis() - this.f67106z, vastConfig.isDownloadFromCache() ? 0 : vastConfig.getDownloadRetriedCount() + 1, com.taurusx.tax.w.w.SUCCESS.getCode(), "", j10);
            }
            c cVar2 = n.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
            }
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoDownloadStart() {
            com.taurusx.tax.w.s.s sVar = n.this.f67240z;
            if (sVar != null) {
                sVar.z(1);
            }
        }
    }

    public static class y {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Map<String, com.taurusx.tax.w.c.z> f67107z;

        public static class z {

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final y f67108z = new y(null);
        }

        public /* synthetic */ y(z zVar) {
            this();
        }

        public static y z() {
            return z.f67108z;
        }

        public void w(String str) {
            this.f67107z.remove(str);
        }

        public y() {
            this.f67107z = new HashMap(2);
        }

        public void z(String str, com.taurusx.tax.w.c.z zVar) {
            this.f67107z.put(str, zVar);
        }

        public com.taurusx.tax.w.c.z z(String str) {
            return this.f67107z.get(str);
        }
    }

    public class z implements p.o {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f67110z;

        public z(long j10) {
            this.f67110z = j10;
        }

        @Override // com.taurusx.tax.g.p.o
        public void z(Bitmap bitmap, com.taurusx.tax.w.w wVar) {
            com.taurusx.tax.w.s.s sVar = n.this.f67240z;
            if (sVar != null) {
                sVar.z(2, System.currentTimeMillis() - this.f67110z, 1, bitmap != null ? com.taurusx.tax.w.w.SUCCESS.getCode() : wVar.getCode(), wVar.getMessageCompatibility(), 0L);
            }
            if (bitmap != null) {
                c cVar = n.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoaded();
                    return;
                }
                return;
            }
            c cVar2 = n.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoadFailed(wVar);
            }
        }
    }

    public n(String str, com.taurusx.tax.w.c.y yVar) {
        super(str, yVar);
        this.f67104t = false;
    }

    @Override // com.taurusx.tax.w.a.y
    public void c() {
        z(this.f67238w, this.f67235c);
    }

    public void o() {
        com.taurusx.tax.w.c.z zVar = new com.taurusx.tax.w.c.z();
        zVar.z(z());
        zVar.w(w());
        y.z zVar2 = this.f67238w;
        y.w.C0823w c0823wW = null;
        if (zVar2 != null && "native".equalsIgnoreCase(zVar2.w())) {
            zVar.y(this.f67239y);
            zVar.z(this.f67238w);
            zVar.z(this.f67240z);
            zVar.z(this.f67235c);
            zVar.z(this.f67236o);
            com.taurusx.tax.w.c.y yVar = this.f67235c;
            if (yVar != null && yVar.c() != null && (c0823wW = this.f67235c.c().w()) != null) {
                zVar.z(c0823wW.L());
                zVar.w(c0823wW.M());
                zVar.y(c0823wW.y());
                zVar.z((int) (c0823wW.o() / 1000));
                zVar.z(c0823wW.c());
            }
            y.z().z(this.f67239y, zVar);
            if (c0823wW != null && c0823wW.Q() && !TextUtils.isEmpty(c0823wW.v())) {
                if (new File(com.taurusx.tax.g.n0.z.z(TaurusXAds.getContext()).getPath() + "/" + j0.z(c0823wW.v())).exists()) {
                    TaurusxH5Activity.z(this.f67239y, true);
                    return;
                }
            }
            AppOpenNativeAdActivity.z(this.f67239y);
            return;
        }
        zVar.y(this.f67239y);
        zVar.z(this.f67238w);
        zVar.z(this.f67103g);
        zVar.o(this.f67104t);
        zVar.z(this.f67102f);
        zVar.z(this.f67240z);
        zVar.z(this.f67235c);
        zVar.z(this.f67236o);
        com.taurusx.tax.w.c.y yVar2 = this.f67235c;
        if (yVar2 != null && yVar2.c() != null && (c0823wW = this.f67235c.c().w()) != null) {
            zVar.c(c0823wW.m() / 1000);
            zVar.o(5);
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
        y.z().z(this.f67239y, zVar);
        if (c0823wW != null && c0823wW.Q() && !TextUtils.isEmpty(c0823wW.v())) {
            if (new File(com.taurusx.tax.g.n0.z.z(TaurusXAds.getContext()).getPath() + "/" + j0.z(c0823wW.v())).exists()) {
                TaurusxH5Activity.z(this.f67239y, true);
                return;
            }
        }
        AppOpenAdActivity.w(this.f67239y);
    }

    @Override // com.taurusx.tax.w.a.y
    public void z(com.taurusx.tax.w.y yVar) {
        super.z(yVar);
        this.f67104t = yVar.s();
    }

    private void z(y.z zVar, com.taurusx.tax.w.c.y yVar) {
        LogUtil.d("taurusx", "TaxSplashImp parseAdm");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zVar != null) {
            this.f67102f = zVar.w();
        }
        if (zVar != null && "native".equalsIgnoreCase(zVar.w())) {
            try {
                String strOptString = new JSONObject(zVar.z()).optString(com.taurusx.tax.w.o.z.f67418l);
                com.taurusx.tax.w.s.s sVar = this.f67240z;
                if (sVar != null) {
                    sVar.z(2);
                }
                p.z(null, strOptString, new z(jCurrentTimeMillis));
                return;
            } catch (Exception unused) {
                com.taurusx.tax.w.s.s sVar2 = this.f67240z;
                if (sVar2 != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED;
                    sVar2.z(2, jCurrentTimeMillis2, 1, wVar.getCode(), wVar.getMessageCompatibility(), 0L);
                }
                c cVar = this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED);
                    return;
                }
                return;
            }
        }
        if (zVar != null && "vast".equalsIgnoreCase(zVar.w())) {
            new VastManager(TaurusXAds.getContext(), true, yVar).prepareVastVideoConfiguration(zVar.z(), new w(jCurrentTimeMillis), TaurusXAds.getContext());
            return;
        }
        if (zVar != null && "html".equalsIgnoreCase(zVar.w())) {
            c cVar2 = this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
                return;
            }
            return;
        }
        if (zVar != null && POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(zVar.w())) {
            c cVar3 = this.f67236o;
            if (cVar3 != null) {
                cVar3.onAdLoaded();
                return;
            }
            return;
        }
        com.taurusx.tax.w.s.s sVar3 = this.f67240z;
        if (sVar3 != null) {
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            com.taurusx.tax.w.w wVar2 = com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT;
            sVar3.z(1, jCurrentTimeMillis3, 0, wVar2.getCode(), wVar2.getMessageCompatibility(), 0L);
        }
        c cVar4 = this.f67236o;
        if (cVar4 != null) {
            cVar4.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
        }
    }
}
