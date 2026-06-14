package com.mbridge.msdk.mbbid.common;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49470c;

    public c(String str, String str2) {
        this.f49468a = str;
        this.f49469b = str2;
    }

    public String getmFloorPrice() {
        return this.f49470c;
    }

    public String getmPlacementId() {
        return this.f49468a;
    }

    public String getmUnitId() {
        return this.f49469b;
    }

    public void setmFloorPrice(String str) {
        this.f49470c = str;
    }

    public void setmPlacementId(String str) {
        this.f49468a = str;
    }

    public void setmUnitId(String str) {
        this.f49469b = str;
    }

    public c(String str, String str2, String str3) {
        this.f49468a = str;
        this.f49469b = str2;
        this.f49470c = str3;
    }
}
