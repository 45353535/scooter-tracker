package r9;

import com.google.common.primitives.Floats;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f99237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f99238b;

    public d(float f10, float f11) {
        q9.a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f99237a = f10;
        this.f99238b = f11;
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
            if (this.f99237a == dVar.f99237a && this.f99238b == dVar.f99238b) {
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
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Floats.hashCode(this.f99237a)) * 31) + Floats.hashCode(this.f99238b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f99237a + ", longitude=" + this.f99238b;
    }
}
