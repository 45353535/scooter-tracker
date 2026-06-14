package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6660e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6657b = str;
        this.f6658c = str2;
        this.f6659d = str3;
        this.f6660e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f6657b, fVar.f6657b) && Objects.equals(this.f6658c, fVar.f6658c) && Objects.equals(this.f6659d, fVar.f6659d) && Arrays.equals(this.f6660e, fVar.f6660e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6657b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6658c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6659d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6660e);
    }

    @Override // cb.i
    public String toString() {
        return this.f6666a + ": mimeType=" + this.f6657b + ", filename=" + this.f6658c + ", description=" + this.f6659d;
    }
}
