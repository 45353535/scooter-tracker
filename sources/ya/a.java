package ya;

import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108498b;

    public a(int i10, String str) {
        this.f108497a = i10;
        this.f108498b = str;
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    @Override // n9.v.a
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return u.a(this);
    }

    @Override // n9.v.a
    public /* synthetic */ io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        return u.b(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f108497a + ",url=" + this.f108498b + ")";
    }
}
