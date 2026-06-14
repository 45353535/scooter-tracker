package eb;

import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements v.a {
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
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
