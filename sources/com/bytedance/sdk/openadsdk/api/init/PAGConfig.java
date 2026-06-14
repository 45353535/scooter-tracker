package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.bjy;
import com.bytedance.sdk.component.wd.lnr.lnr;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.kdv;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes6.dex */
public final class PAGConfig implements InitConfig {
    private static String to;
    private String jpc;
    private int lnr;
    private String qdl;
    private String rq;
    private String tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f16913ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f16914wd;
    private int mml = -1;
    private int mzz = -1;
    private int mo = 0;

    public static class Builder {
        private String[] jpc;
        private int lnr;
        private String qdl;
        private String to;
        private String tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private boolean f16915ud;
        private int mml = -1;
        private int mzz = -1;
        private int mo = 0;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private boolean f16916wd = false;
        private String rq = "";

        public Builder appIcon(int i10) {
            this.lnr = i10;
            return this;
        }

        public Builder appId(String str) {
            this.qdl = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.ud(this.qdl);
            pAGConfig.qdl(this.lnr);
            pAGConfig.mml(this.mo);
            pAGConfig.ud(this.f16916wd);
            pAGConfig.ud(this.mml);
            pAGConfig.lnr(this.mzz);
            pAGConfig.qdl(this.f16915ud);
            pAGConfig.lnr(this.tvp);
            pAGConfig.qdl(this.to);
            pAGConfig.mml(this.rq);
            return pAGConfig;
        }

        public Builder debugLog(boolean z10) {
            this.f16915ud = z10;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.jpc = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.rq = str;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
            this.mml = i10;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
            if (i10 == 0 || i10 == 1) {
                this.mzz = i10;
                return this;
            }
            this.mzz = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.tvp = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.to = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            this.f16916wd = z10;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.mo = i10;
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }
    }

    public static void debugLog(boolean z10) {
        if (kdv.qdl() != null) {
            if (z10) {
                kdv.qdl().lnr(1);
                kdv.qdl().qdl();
                return;
            }
            kdv.qdl().lnr(0);
            lnr.qdl(lnr.qdl.OFF);
            bjy.lnr();
            com.bykv.vk.openvk.qdl.qdl.qdl.wd.lnr.ud();
            aaj.ud();
        }
    }

    public static int getGDPRConsent() {
        if (!gy.tvp("getGdpr")) {
            return -1;
        }
        int iUd = kdv.qdl().ud();
        if (iUd == 1) {
            return 0;
        }
        if (iUd == 0) {
            return 1;
        }
        return iUd;
    }

    public static int getPAConsent() {
        if (gy.tvp("getPAConsent")) {
            return kdv.qdl().mzz();
        }
        return -1;
    }

    public static void setAppIconId(int i10) {
        if (kdv.qdl() != null) {
            kdv.qdl().mml(i10);
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        gy.tvp("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        kdv.qdl().ud(i10);
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
        if (gy.tvp("setPAConsent")) {
            if (i10 == 1 || i10 == 0) {
                kdv.qdl().mzz(i10);
            } else {
                kdv.qdl().mzz(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        to = str;
    }

    public static void setUserData(String str) {
        if (kdv.qdl() != null) {
            kdv.qdl().ud(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.rq;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.tvp;
    }

    public boolean getDebugLog() {
        return this.f16913ud;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.jpc) ? to : this.jpc;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.mo;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.f16914wd;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(int i10) {
        this.mzz = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml(int i10) {
        this.mo = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(String str) {
        this.jpc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml(String str) {
        this.rq = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str) {
        this.tvp = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(String str) {
        this.qdl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(boolean z10) {
        this.f16913ud = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.mml = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i10) {
        this.lnr = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(boolean z10) {
        this.f16914wd = z10;
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(z10);
    }
}
