package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f6648g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f6643b = str;
        this.f6644c = i10;
        this.f6645d = i11;
        this.f6646e = j10;
        this.f6647f = j11;
        this.f6648g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f6644c == cVar.f6644c && this.f6645d == cVar.f6645d && this.f6646e == cVar.f6646e && this.f6647f == cVar.f6647f && Objects.equals(this.f6643b, cVar.f6643b) && Arrays.equals(this.f6648g, cVar.f6648g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6644c) * 31) + this.f6645d) * 31) + ((int) this.f6646e)) * 31) + ((int) this.f6647f)) * 31;
        String str = this.f6643b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
