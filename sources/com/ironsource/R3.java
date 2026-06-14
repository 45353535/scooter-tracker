package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public class R3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41656a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IronSourceError f41657b = null;

    public void a(IronSourceError ironSourceError) {
        this.f41656a = false;
        this.f41657b = ironSourceError;
    }

    public boolean b() {
        return this.f41656a;
    }

    public void c() {
        this.f41656a = true;
        this.f41657b = null;
    }

    public String toString() {
        if (b()) {
            return "valid:" + this.f41656a;
        }
        return "valid:" + this.f41656a + ", IronSourceError:" + this.f41657b;
    }

    public IronSourceError a() {
        return this.f41657b;
    }
}
