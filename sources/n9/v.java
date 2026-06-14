package n9;

import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;
import n9.t;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f95659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95660b;

    public interface a {
        void a(t.b bVar);

        byte[] getWrappedMetadataBytes();

        io.bidmachine.media3.common.a getWrappedMetadataFormat();
    }

    public v(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public v a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new v(this.f95660b, (a[]) o0.U0(this.f95659a, aVarArr));
    }

    public v b(v vVar) {
        return vVar == null ? this : a(vVar.f95659a);
    }

    public v c(long j10) {
        return this.f95660b == j10 ? this : new v(j10, this.f95659a);
    }

    public a d(int i10) {
        return this.f95659a[i10];
    }

    public int e() {
        return this.f95659a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (Arrays.equals(this.f95659a, vVar.f95659a) && this.f95660b == vVar.f95660b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f95659a) * 31) + Longs.hashCode(this.f95660b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f95659a));
        if (this.f95660b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f95660b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public v(long j10, a... aVarArr) {
        this.f95660b = j10;
        this.f95659a = aVarArr;
    }

    public v(List list) {
        this((a[]) list.toArray(new a[0]));
    }

    public v(long j10, List list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }
}
