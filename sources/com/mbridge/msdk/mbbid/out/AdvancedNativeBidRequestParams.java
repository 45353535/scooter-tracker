package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes10.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49487e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f49486d = i11;
        this.f49487e = i10;
    }

    public int getHeight() {
        return this.f49486d;
    }

    public int getWidth() {
        return this.f49487e;
    }

    public void setHeight(int i10) {
        this.f49486d = i10;
    }

    public void setWidth(int i10) {
        this.f49487e = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f49486d = i11;
        this.f49487e = i10;
    }
}
