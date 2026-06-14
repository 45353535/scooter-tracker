package com.startapp.sdk.internal;

import androidx.webkit.internal.AssetHelper;
import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class p8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s8 f65089f = new s8(new byte[0], AssetHelper.DEFAULT_MIME_TYPE, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8 f65090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s8 f65092c = f65089f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeoutConfig f65093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i7 f65094e;

    public p8(q8 q8Var, String str) {
        this.f65090a = q8Var;
        this.f65091b = str;
    }

    public final t8 a() {
        q8 q8Var = this.f65090a;
        try {
            return q8Var.a(this);
        } catch (Throwable th2) {
            if (!q8Var.a(1)) {
                return null;
            }
            g9.a(th2);
            return null;
        }
    }

    public final String b() {
        q8 q8Var = this.f65090a;
        try {
            return q8Var.b(this);
        } catch (Throwable th2) {
            if (!q8Var.a(4)) {
                return null;
            }
            g9.a(th2);
            return null;
        }
    }
}
