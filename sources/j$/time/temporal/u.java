package j$.time.temporal;

import androidx.collection.SieveCacheKt;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f84725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f84726d;

    public static u e(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(j10, j10, j11, j11);
    }

    public static u f(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(1L, 1L, j10, j11);
    }

    public u(long j10, long j11, long j12, long j13) {
        this.f84723a = j10;
        this.f84724b = j11;
        this.f84725c = j12;
        this.f84726d = j13;
    }

    public final int a(long j10, q qVar) {
        if (this.f84723a < SieveCacheKt.NodeMetaAndPreviousMask || this.f84726d > SieveCacheKt.NodeLinkMask || !d(j10)) {
            throw new j$.time.b(c(j10, qVar));
        }
        return (int) j10;
    }

    public final boolean d(long j10) {
        return j10 >= this.f84723a && j10 <= this.f84726d;
    }

    public final void b(long j10, q qVar) {
        if (!d(j10)) {
            throw new j$.time.b(c(j10, qVar));
        }
    }

    public final String c(long j10, q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j10 = this.f84723a;
        long j11 = this.f84724b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.f84725c;
        long j13 = this.f84726d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f84723a == uVar.f84723a && this.f84724b == uVar.f84724b && this.f84725c == uVar.f84725c && this.f84726d == uVar.f84726d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f84724b;
        long j11 = this.f84723a + (j10 << 16) + (j10 >> 48);
        long j12 = this.f84725c;
        long j13 = j11 + (j12 << 32) + (j12 >> 32);
        long j14 = this.f84726d;
        long j15 = j13 + (j14 << 48) + (j14 >> 16);
        return (int) ((j15 >>> 32) ^ j15);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f84723a;
        sb2.append(j10);
        long j11 = this.f84724b;
        if (j10 != j11) {
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(j11);
        }
        sb2.append(" - ");
        long j12 = this.f84725c;
        sb2.append(j12);
        long j13 = this.f84726d;
        if (j12 != j13) {
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(j13);
        }
        return sb2.toString();
    }
}
