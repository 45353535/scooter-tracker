package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes10.dex */
public class MBSplashData implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f48024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f48027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f48028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f48029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f48032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f48033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48034k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f48024a = dyOption;
        this.f48029f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f48026c;
    }

    public String getAppInfo() {
        return this.f48025b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f48029f;
    }

    public int getClickType() {
        return this.f48034k;
    }

    public String getCountDownText() {
        return this.f48027d;
    }

    public DyOption getDyOption() {
        return this.f48024a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f48024a;
    }

    public int getLogoImage() {
        return this.f48031h;
    }

    public String getLogoText() {
        return this.f48028e;
    }

    public int getNoticeImage() {
        return this.f48030g;
    }

    public float getxInScreen() {
        return this.f48032i;
    }

    public float getyInScreen() {
        return this.f48033j;
    }

    public void setAdClickText(String str) {
        this.f48026c = str;
    }

    public void setAppInfo(String str) {
        this.f48025b = str;
    }

    public void setClickType(int i10) {
        this.f48034k = i10;
    }

    public void setCountDownText(String str) {
        this.f48027d = str;
    }

    public void setLogoImage(int i10) {
        this.f48031h = i10;
    }

    public void setLogoText(String str) {
        this.f48028e = str;
    }

    public void setNoticeImage(int i10) {
        this.f48030g = i10;
    }

    public void setxInScreen(float f10) {
        this.f48032i = f10;
    }

    public void setyInScreen(float f10) {
        this.f48033j = f10;
    }
}
