package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;
import n9.t;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6641e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f6638b = str;
        this.f6639c = str2;
        this.f6640d = i10;
        this.f6641e = bArr;
    }

    @Override // cb.i, n9.v.a
    public void a(t.b bVar) {
        bVar.K(this.f6641e, this.f6640d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f6640d == aVar.f6640d && Objects.equals(this.f6638b, aVar.f6638b) && Objects.equals(this.f6639c, aVar.f6639c) && Arrays.equals(this.f6641e, aVar.f6641e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6640d) * 31;
        String str = this.f6638b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6639c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6641e);
    }

    @Override // cb.i
    public String toString() {
        return this.f6666a + ": mimeType=" + this.f6638b + ", description=" + this.f6639c;
    }
}
