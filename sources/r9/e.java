package r9;

import com.google.common.primitives.Longs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f99239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99241c;

    public e(long j10, long j11, long j12) {
        this.f99239a = j10;
        this.f99240b = j11;
        this.f99241c = j12;
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f99239a == eVar.f99239a && this.f99240b == eVar.f99240b && this.f99241c == eVar.f99241c;
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
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Longs.hashCode(this.f99239a)) * 31) + Longs.hashCode(this.f99240b)) * 31) + Longs.hashCode(this.f99241c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f99239a + ", modification time=" + this.f99240b + ", timescale=" + this.f99241c;
    }
}
