package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f47034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47036c;

    public a a() {
        return this.f47034a;
    }

    public boolean b() {
        return this.f47035b;
    }

    public boolean c() {
        return this.f47036c;
    }

    public void a(a aVar) {
        this.f47034a = aVar;
        b(false);
    }

    public void b(boolean z10) {
        this.f47036c = z10;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f47035b = z10;
    }
}
