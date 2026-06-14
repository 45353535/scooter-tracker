package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f48070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f48071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class<?> f48072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f48073d;

    SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f48070a = method;
        this.f48071b = threadMode;
        this.f48072c = cls;
    }

    private synchronized void a() {
        if (this.f48073d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f48070a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f48070a.getName());
            sb2.append('(');
            sb2.append(this.f48072c.getName());
            this.f48073d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f48073d.equals(((SubscriberMethod) obj).f48073d);
    }

    public int hashCode() {
        return this.f48070a.hashCode();
    }
}
