package db;

import com.google.common.primitives.Floats;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68614b;

    public d(float f10, int i10) {
        this.f68613a = f10;
        this.f68614b = i10;
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f68613a == dVar.f68613a && this.f68614b == dVar.f68614b) {
                return true;
            }
        }
        return false;
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
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Floats.hashCode(this.f68613a)) * 31) + this.f68614b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f68613a + ", svcTemporalLayerCount=" + this.f68614b;
    }
}
