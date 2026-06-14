package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: loaded from: classes10.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f48691c;

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f48689a = i10;
        this.f48691c = aVar;
    }

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f48689a = i10;
        this.f48691c = aVar;
        this.f48690b = str;
    }
}
