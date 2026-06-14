package bb;

import java.util.Arrays;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6149c;

    public c(byte[] bArr, String str, String str2) {
        this.f6147a = bArr;
        this.f6148b = str;
        this.f6149c = str2;
    }

    @Override // n9.v.a
    public void a(t.b bVar) {
        String str = this.f6148b;
        if (str != null) {
            bVar.p0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6147a, ((c) obj).f6147a);
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
        return Arrays.hashCode(this.f6147a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f6148b, this.f6149c, Integer.valueOf(this.f6147a.length));
    }
}
