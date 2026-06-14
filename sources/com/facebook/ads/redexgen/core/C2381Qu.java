package com.facebook.ads.redexgen.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2381Qu implements InvocationHandler {
    public final /* synthetic */ ClassLoader A00;

    public C2381Qu(ClassLoader classLoader) {
        this.A00 = classLoader;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return C2382Qv.A00(this.A00, method);
    }
}
