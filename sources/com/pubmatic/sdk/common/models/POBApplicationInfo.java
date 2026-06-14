package com.pubmatic.sdk.common.models;

import androidx.annotation.Nullable;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
public class POBApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private URL f62357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f62358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62360e;

    @Nullable
    public String getCategories() {
        return this.f62359d;
    }

    @Nullable
    public String getDomain() {
        return this.f62356a;
    }

    @Nullable
    public String getKeywords() {
        return this.f62360e;
    }

    @Nullable
    public URL getStoreURL() {
        return this.f62357b;
    }

    @Nullable
    public Boolean isPaid() {
        return this.f62358c;
    }

    public void setCategories(@Nullable String str) {
        this.f62359d = str;
    }

    public void setDomain(@Nullable String str) {
        this.f62356a = str;
    }

    public void setKeywords(@Nullable String str) {
        this.f62360e = str;
    }

    public void setPaid(boolean z10) {
        this.f62358c = Boolean.valueOf(z10);
    }

    public void setStoreURL(@Nullable URL url) {
        this.f62357b = url;
    }
}
