package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f47008a;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f47009a = new i();
    }

    public static i b() {
        return b.f47009a;
    }

    public void a(int i10) {
        this.f47008a = new com.mbridge.msdk.config.component.load.downloader.core.a(i10);
    }

    private i() {
    }

    public j a() {
        if (this.f47008a == null) {
            this.f47008a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.f47008a;
    }
}
