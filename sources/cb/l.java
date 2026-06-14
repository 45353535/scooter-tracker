package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f6674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f6675f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6671b = i10;
        this.f6672c = i11;
        this.f6673d = i12;
        this.f6674e = iArr;
        this.f6675f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f6671b == lVar.f6671b && this.f6672c == lVar.f6672c && this.f6673d == lVar.f6673d && Arrays.equals(this.f6674e, lVar.f6674e) && Arrays.equals(this.f6675f, lVar.f6675f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6671b) * 31) + this.f6672c) * 31) + this.f6673d) * 31) + Arrays.hashCode(this.f6674e)) * 31) + Arrays.hashCode(this.f6675f);
    }
}
