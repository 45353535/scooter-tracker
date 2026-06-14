package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f46502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f46503h;

    public String a() {
        return "statusCode=" + this.f46501f + ", location=" + this.f46496a + ", contentType=" + this.f46497b + ", contentLength=" + this.f46500e + ", contentEncoding=" + this.f46498c + ", referer=" + this.f46499d;
    }

    @NonNull
    public String toString() {
        return "ClickResponseHeader{location='" + this.f46496a + "', contentType='" + this.f46497b + "', contentEncoding='" + this.f46498c + "', referer='" + this.f46499d + "', contentLength=" + this.f46500e + ", statusCode=" + this.f46501f + ", url='" + this.f46502g + "', exception='" + this.f46503h + "'}";
    }
}
