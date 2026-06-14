package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PAGRequest {
    private Bundle lnr = null;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Map<String, Object> f16910ud;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.lnr == null) {
            this.lnr = new Bundle();
        }
        this.lnr.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.qdl;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f16910ud;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.lnr;
    }

    public void setAdString(String str) {
        this.qdl = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f16910ud = map;
    }
}
