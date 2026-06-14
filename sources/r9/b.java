package r9;

import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99231a;

    public b(int i10) {
        this.f99231a = i10;
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f99231a == ((b) obj).f99231a;
    }

    @Override // n9.v.a
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return u.a(this);
    }

    @Override // n9.v.a
    public /* synthetic */ io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        return u.b(this);
    }

    public int hashCode() {
        return this.f99231a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f99231a;
    }
}
