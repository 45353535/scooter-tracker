package za;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.a;
import j$.util.Objects;
import java.util.Arrays;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final io.bidmachine.media3.common.a f119324g = new a.b().u0("application/id3").N();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final io.bidmachine.media3.common.a f119325h = new a.b().u0("application/x-scte35").N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f119327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f119328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f119329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f119330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f119331f;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f119326a = str;
        this.f119327b = str2;
        this.f119328c = j10;
        this.f119329d = j11;
        this.f119330e = bArr;
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
            if (this.f119328c == aVar.f119328c && this.f119329d == aVar.f119329d && Objects.equals(this.f119326a, aVar.f119326a) && Objects.equals(this.f119327b, aVar.f119327b) && Arrays.equals(this.f119330e, aVar.f119330e)) {
                return true;
            }
        }
        return false;
    }

    @Override // n9.v.a
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f119330e;
        }
        return null;
    }

    @Override // n9.v.a
    public io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        String str = this.f119326a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f119325h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f119324g;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f119331f == 0) {
            String str = this.f119326a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f119327b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f119328c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f119329d;
            this.f119331f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f119330e);
        }
        return this.f119331f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f119326a + ", id=" + this.f119329d + ", durationMs=" + this.f119328c + ", value=" + this.f119327b;
    }
}
