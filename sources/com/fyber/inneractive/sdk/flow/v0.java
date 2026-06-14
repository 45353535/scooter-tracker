package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20989a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20990b;

    public boolean getAllowFullscreen() {
        return this.f20989a;
    }

    public String getMediationName() {
        return IAConfigManager.O.f20306l;
    }

    public String getMediationVersion() {
        return IAConfigManager.O.f20308n;
    }
}
