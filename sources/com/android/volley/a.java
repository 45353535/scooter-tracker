package com.android.volley;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public class a extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Intent f7490d;

    public a(k kVar) {
        super(kVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f7490d != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
