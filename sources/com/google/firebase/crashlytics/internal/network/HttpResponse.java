package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: classes9.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32654b;

    public HttpResponse(int i10, String str) {
        this.f32653a = i10;
        this.f32654b = str;
    }

    public String body() {
        return this.f32654b;
    }

    public int code() {
        return this.f32653a;
    }
}
