package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f95676d = new z(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f95677e = o0.C0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f95678f = o0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f95679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f95680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f95681c;

    public z(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f95681c);
    }

    public z b(float f10) {
        return new z(f10, this.f95680b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f95679a == zVar.f95679a && this.f95680b == zVar.f95680b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f95679a)) * 31) + Float.floatToRawIntBits(this.f95680b);
    }

    public String toString() {
        return o0.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f95679a), Float.valueOf(this.f95680b));
    }

    public z(float f10, float f11) {
        q9.a.a(f10 > 0.0f);
        q9.a.a(f11 > 0.0f);
        this.f95679a = f10;
        this.f95680b = f11;
        this.f95681c = Math.round(f10 * 1000.0f);
    }
}
