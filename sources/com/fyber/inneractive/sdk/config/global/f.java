package com.fyber.inneractive.sdk.config.global;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20376b;

    public f(boolean z10, String str) {
        this.f20375a = str;
        this.f20376b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.f20375a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.f20376b : this.f20376b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f20375a + " include: " + this.f20376b;
    }
}
