package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f95243b;

    public d(int i10, float f10) {
        this.f95242a = i10;
        this.f95243b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f95242a == dVar.f95242a && Float.compare(dVar.f95243b, this.f95243b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f95242a) * 31) + Float.floatToIntBits(this.f95243b);
    }
}
