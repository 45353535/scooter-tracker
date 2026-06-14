package com.pubmatic.sdk.common.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBHttpRequest implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f62433f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62428a = 5000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62429b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f62430c = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HTTP_METHOD f62435h = HTTP_METHOD.GET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f62434g = new HashMap();

    public enum HTTP_METHOD {
        GET,
        POST,
        PUT,
        DELETE
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f62434g;
    }

    @Nullable
    public String getPostData() {
        return this.f62433f;
    }

    public HTTP_METHOD getRequestMethod() {
        return this.f62435h;
    }

    @Nullable
    public String getRequestTag() {
        return this.f62431d;
    }

    public float getRetryBackoffMultiplier() {
        return this.f62430c;
    }

    public int getRetryCount() {
        return this.f62429b;
    }

    public int getTimeout() {
        return this.f62428a;
    }

    @Nullable
    public String getUrl() {
        return this.f62432e;
    }

    public void setHeaders(@NonNull Map<String, String> map) {
        this.f62434g = map;
    }

    public void setPostData(@Nullable String str) {
        this.f62433f = str;
    }

    public void setRequestMethod(HTTP_METHOD http_method) {
        this.f62435h = http_method;
    }

    public void setRequestTag(@Nullable String str) {
        this.f62431d = str;
    }

    public void setRetryBackoffMultiplier(float f10) {
        this.f62430c = f10;
    }

    public void setRetryCount(int i10) {
        this.f62429b = i10;
    }

    public void setTimeout(int i10) {
        this.f62428a = i10;
    }

    public void setUrl(@Nullable String str) {
        this.f62432e = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getUrl());
        if (getRequestMethod() == HTTP_METHOD.POST) {
            sb2.append("\nPOST Data : ");
            sb2.append(getPostData());
        } else {
            sb2.append(getPostData());
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public POBHttpRequest m7437clone() throws CloneNotSupportedException {
        return (POBHttpRequest) super.clone();
    }
}
