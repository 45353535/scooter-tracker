package db;

import com.google.common.primitives.Longs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68607e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f68603a = j10;
        this.f68604b = j11;
        this.f68605c = j12;
        this.f68606d = j13;
        this.f68607e = j14;
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f68603a == aVar.f68603a && this.f68604b == aVar.f68604b && this.f68605c == aVar.f68605c && this.f68606d == aVar.f68606d && this.f68607e == aVar.f68607e) {
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
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Longs.hashCode(this.f68603a)) * 31) + Longs.hashCode(this.f68604b)) * 31) + Longs.hashCode(this.f68605c)) * 31) + Longs.hashCode(this.f68606d)) * 31) + Longs.hashCode(this.f68607e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f68603a + ", photoSize=" + this.f68604b + ", photoPresentationTimestampUs=" + this.f68605c + ", videoStartPosition=" + this.f68606d + ", videoSize=" + this.f68607e;
    }
}
