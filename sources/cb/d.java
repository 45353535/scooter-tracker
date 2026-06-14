package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f6652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f6653f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f6649b = str;
        this.f6650c = z10;
        this.f6651d = z11;
        this.f6652e = strArr;
        this.f6653f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f6650c == dVar.f6650c && this.f6651d == dVar.f6651d && Objects.equals(this.f6649b, dVar.f6649b) && Arrays.equals(this.f6652e, dVar.f6652e) && Arrays.equals(this.f6653f, dVar.f6653f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f6650c ? 1 : 0)) * 31) + (this.f6651d ? 1 : 0)) * 31;
        String str = this.f6649b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
