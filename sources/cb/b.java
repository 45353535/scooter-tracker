package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6642b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f6642b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6666a.equals(bVar.f6666a) && Arrays.equals(this.f6642b, bVar.f6642b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6666a.hashCode()) * 31) + Arrays.hashCode(this.f6642b);
    }
}
