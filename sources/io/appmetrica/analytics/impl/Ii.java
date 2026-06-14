package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Ii implements InterfaceC5185j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f75947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC5185j3 f75948b;

    public Ii(@NonNull Object obj, @NonNull InterfaceC5185j3 interfaceC5185j3) {
        this.f75947a = obj;
        this.f75948b = interfaceC5185j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5185j3
    public final int getBytesTruncated() {
        return this.f75948b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f75947a + ", metaInfo=" + this.f75948b + '}';
    }
}
