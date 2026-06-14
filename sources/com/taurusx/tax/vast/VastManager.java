package com.taurusx.tax.vast;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.taurusx.tax.g.f;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.vast.VastXmlManagerAggregator;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.w;
import java.io.File;
import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Protocol;

/* JADX INFO: loaded from: classes11.dex */
public class VastManager implements VastXmlManagerAggregator.w {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f67001t = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f67002a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f67003c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f67004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67005o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f67006s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VastManagerListener f67007w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public VastXmlManagerAggregator f67008y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f67009z;

    public interface VastManagerListener {
        void onVastVideoConfigurationPrepared(VastConfig vastConfig, w wVar, long j10);

        void onVastVideoDownloadStart();
    }

    public class z implements com.taurusx.tax.g.o0.w {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ VastConfig f67011z;

        public z(VastConfig vastConfig) {
            this.f67011z = vastConfig;
        }

        @Override // com.taurusx.tax.g.o0.w
        public void downloadEnd(w wVar, long j10) {
            w wVar2 = w.SUCCESS;
            if (wVar == wVar2 && VastManager.this.z(this.f67011z) && f.w(this.f67011z.getDiskMediaFileUrl())) {
                this.f67011z.setDownloadRetriedCount(VastManager.this.f67004n);
                VastManager.this.f67007w.onVastVideoConfigurationPrepared(this.f67011z, wVar2, j10);
                return;
            }
            if (VastManager.this.f67004n >= 3) {
                LogUtil.v("taurusx", "Failed to download VAST video.");
                this.f67011z.setDownloadRetriedCount(VastManager.this.f67004n);
                this.f67011z.setDiskMediaFileUrl(null);
                VastManagerListener vastManagerListener = VastManager.this.f67007w;
                VastConfig vastConfig = this.f67011z;
                if (wVar == wVar2) {
                    wVar = w.MP4_URL_FAILED;
                }
                vastManagerListener.onVastVideoConfigurationPrepared(vastConfig, wVar, j10);
                return;
            }
            LogUtil.v("taurusx", "retry download");
            VastManager.w(VastManager.this);
            try {
                ArrayList<VastVideoBean> networkVideoBeans = this.f67011z.getNetworkVideoBeans();
                if ((networkVideoBeans.size() - 1) - VastManager.this.f67004n >= 0) {
                    VastVideoBean vastVideoBean = networkVideoBeans.get((networkVideoBeans.size() - 1) - VastManager.this.f67004n);
                    this.f67011z.setNetworkMediaFileUrl(vastVideoBean.getUrl());
                    this.f67011z.setVideoWidth(vastVideoBean.getWidth());
                    this.f67011z.setVideoHeight(vastVideoBean.getHeight());
                }
            } catch (Exception unused) {
            }
            LogUtil.i("taurusx", "networkMediaFileUrl:" + this.f67011z.getNetworkMediaFileUrl() + ",width: " + this.f67011z.getVideoWidth() + ",height: " + this.f67011z.getVideoHeight());
            if (!VastManager.this.f67006s || (VastManager.this.z(this.f67011z) && f.w(this.f67011z.getDiskMediaFileUrl()))) {
                this.f67011z.setDownloadRetriedCount(VastManager.this.f67004n);
                VastManager.this.f67007w.onVastVideoConfigurationPrepared(this.f67011z, w.SUCCESS, j10);
                return;
            }
            String networkMediaFileUrl = this.f67011z.getNetworkMediaFileUrl();
            if (networkMediaFileUrl != null && networkMediaFileUrl.endsWith(".mp")) {
                networkMediaFileUrl = networkMediaFileUrl + Protocol.VAST_1_0_WRAPPER;
            }
            com.taurusx.tax.g.o0.z.z(1, networkMediaFileUrl, ((long) VastManager.this.f67004n) * 500, this);
        }

        @Override // com.taurusx.tax.g.o0.w
        public void downloadStart() {
            VastManager.this.f67009z = true;
            VastManager.this.f67007w.onVastVideoDownloadStart();
        }
    }

    public VastManager(Context context, boolean z10) {
        z(context);
        this.f67006s = z10;
        if (z10) {
            com.taurusx.tax.g.n0.z.w(context);
        }
    }

    public static String getVastNetworkMediaUrl(VastConfig vastConfig) {
        return vastConfig == null ? "" : vastConfig.getNetworkMediaFileUrl();
    }

    public static /* synthetic */ int w(VastManager vastManager) {
        int i10 = vastManager.f67004n;
        vastManager.f67004n = i10 + 1;
        return i10;
    }

    public void cancel() {
        VastXmlManagerAggregator vastXmlManagerAggregator = this.f67008y;
        if (vastXmlManagerAggregator != null) {
            vastXmlManagerAggregator.cancel(true);
            this.f67008y = null;
        }
    }

    public boolean isStartDownload() {
        return this.f67009z;
    }

    @Override // com.taurusx.tax.vast.VastXmlManagerAggregator.w
    public void onAggregationComplete(VastConfig vastConfig) {
        VastManagerListener vastManagerListener = this.f67007w;
        if (vastManagerListener == null) {
            throw new IllegalStateException("mVastManagerListener cannot be null here. Did you call prepareVastVideoConfiguration()?");
        }
        if (vastConfig == null) {
            vastManagerListener.onVastVideoConfigurationPrepared(null, w.AD_CONTENT_PARSE_FAILED.setMessage("vastVideoConfig is null"), 0L);
            return;
        }
        if (!this.f67006s || (z(vastConfig) && f.w(vastConfig.getDiskMediaFileUrl()))) {
            this.f67009z = true;
            vastConfig.setIsDownloadFromCache(true);
            File file = new File(vastConfig.getDiskMediaFileUrl());
            long length = file.exists() ? file.length() : 0L;
            this.f67007w.onVastVideoDownloadStart();
            this.f67007w.onVastVideoConfigurationPrepared(vastConfig, w.SUCCESS, length);
            return;
        }
        z zVar = new z(vastConfig);
        String networkMediaFileUrl = vastConfig.getNetworkMediaFileUrl();
        if (networkMediaFileUrl != null && networkMediaFileUrl.endsWith(".mp")) {
            networkMediaFileUrl = networkMediaFileUrl + Protocol.VAST_1_0_WRAPPER;
        }
        com.taurusx.tax.g.o0.z.z(1, networkMediaFileUrl, zVar);
    }

    public void prepareVastVideoConfiguration(String str, VastManagerListener vastManagerListener, Context context) {
        r.z(vastManagerListener, "vastManagerListener cannot be null");
        r.z(context, "context cannot be null");
        if (this.f67008y == null) {
            this.f67007w = vastManagerListener;
            VastXmlManagerAggregator vastXmlManagerAggregator = new VastXmlManagerAggregator(this, this.f67003c, this.f67005o, context.getApplicationContext());
            this.f67008y = vastXmlManagerAggregator;
            try {
                com.taurusx.tax.g.r0.w.z(vastXmlManagerAggregator, str);
            } catch (Exception e10) {
                LogUtil.v("taurusx", "Failed to aggregate vast xml" + e10);
                this.f67007w.onVastVideoConfigurationPrepared(null, w.TASK_EXECUTE_FAILED.setMessage("Failed to aggregate vast xml " + e10), 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(VastConfig vastConfig) {
        r.z(vastConfig, "vastVideoConfig cannot be null");
        String networkMediaFileUrl = vastConfig.getNetworkMediaFileUrl();
        if (networkMediaFileUrl != null && networkMediaFileUrl.endsWith(CampaignEx.JSON_KEY_AD_MP)) {
            networkMediaFileUrl = networkMediaFileUrl + Protocol.VAST_1_0_WRAPPER;
        }
        if (!com.taurusx.tax.g.n0.z.z(networkMediaFileUrl)) {
            return false;
        }
        vastConfig.setDiskMediaFileUrl(com.taurusx.tax.g.n0.z.y(networkMediaFileUrl));
        return true;
    }

    public VastManager(Context context, boolean z10, y yVar) {
        z(context);
        this.f67006s = z10;
        this.f67002a = yVar;
        if (z10) {
            com.taurusx.tax.g.n0.z.w(context);
        }
    }

    private void z(Context context) {
        r.z(context, "context cannot be null");
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        float f10 = context.getResources().getDisplayMetrics().density;
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        this.f67003c = ((double) width) / ((double) height);
        this.f67005o = (int) (width / f10);
    }
}
