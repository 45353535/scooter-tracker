package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6677c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f6676b = str;
        this.f6677c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f6676b, mVar.f6676b) && Arrays.equals(this.f6677c, mVar.f6677c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6676b;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6677c);
    }

    @Override // cb.i
    public String toString() {
        return this.f6666a + ": owner=" + this.f6676b;
    }
}
