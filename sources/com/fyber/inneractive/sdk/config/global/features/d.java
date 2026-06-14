package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.a f20378e;

    public d() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public final h b() {
        d dVar = new d();
        a(dVar);
        return dVar;
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str) || this.f20378e != null) {
            return;
        }
        this.f20378e = new com.fyber.inneractive.sdk.model.vast.a(a("install_" + str, null), a("skip_ad_" + str, null), a("skip_in_" + str, null));
    }
}
