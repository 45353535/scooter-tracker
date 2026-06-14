package com.mbridge.msdk.foundation.same.net;

/* JADX INFO: loaded from: classes10.dex */
public class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.exception.a f48686a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f48687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f48688c;

    private e(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f48688c = t10;
        this.f48687b = aVar;
    }

    public static <T> e<T> a(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t10, aVar);
    }
}
