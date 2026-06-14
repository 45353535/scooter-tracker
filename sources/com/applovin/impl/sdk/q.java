package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f10928a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10929b = new Object();

    q() {
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10929b) {
            try {
                if (b() <= 25) {
                    this.f10928a.offer(appLovinAdImpl);
                } else {
                    o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    int b() {
        int size;
        synchronized (this.f10929b) {
            size = this.f10928a.size();
        }
        return size;
    }

    boolean c() {
        boolean z10;
        synchronized (this.f10929b) {
            z10 = b() == 0;
        }
        return z10;
    }

    AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f10929b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f10928a.peek();
        }
        return appLovinAdImpl;
    }

    void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10929b) {
            this.f10928a.remove(appLovinAdImpl);
        }
    }

    AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f10929b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f10928a.poll() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return appLovinAdImpl;
    }
}
