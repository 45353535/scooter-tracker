package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* JADX INFO: loaded from: classes6.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f10139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10142d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f10141c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f10142d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f10139a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f10140b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i10, String str2) {
        this.f10139a = code;
        this.f10140b = str;
        this.f10141c = i10;
        this.f10142d = str2;
    }
}
