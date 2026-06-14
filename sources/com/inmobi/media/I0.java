package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class I0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f37038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37039b;

    public I0(L0 l02, boolean z10) {
        this.f37038a = l02;
        this.f37039b = z10;
    }

    @Override // com.inmobi.media.Eg
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f37038a.a("result pushed to queue");
        if (this.f37039b) {
            L0 l02 = this.f37038a;
            l02.a("session end - cleanup");
            l02.f37247g = null;
            l02.f37246f.clear();
            l02.f37243c.set(false);
            l02.f37244d.set(false);
        }
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f37038a.a("error in pushing to queue", exc);
    }
}
