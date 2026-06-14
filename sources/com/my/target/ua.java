package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class ua extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public na f60909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60910c = true;

    public static ua e() {
        return new ua();
    }

    public void a(boolean z10) {
        this.f60910c = z10;
    }

    public na c() {
        return this.f60909b;
    }

    public boolean d() {
        return this.f60910c;
    }

    public void a(na naVar) {
        this.f60909b = naVar;
    }

    @Override // com.my.target.t
    public int a() {
        return this.f60909b == null ? 0 : 1;
    }
}
