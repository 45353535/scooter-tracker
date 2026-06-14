package yads;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class fs2 implements b30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f110849b;

    public fs2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f110848a = str;
        this.f110849b = sSLSocketFactory;
    }

    @Override // yads.b30
    public final c30 a() {
        return new ds2(this.f110848a, 8000, 8000, false, new e01(), this.f110849b);
    }
}
