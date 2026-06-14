package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ww implements oq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nq f117611g = new nq() { // from class: yads.yt0
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return ww.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f117614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f117615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f117616f;

    public ww(int i10, int i11, int i12, byte[] bArr) {
        this.f117612b = i10;
        this.f117613c = i11;
        this.f117614d = i12;
        this.f117615e = bArr;
    }

    public static ww a(Bundle bundle) {
        return new ww(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ww.class == obj.getClass()) {
            ww wwVar = (ww) obj;
            if (this.f117612b == wwVar.f117612b && this.f117613c == wwVar.f117613c && this.f117614d == wwVar.f117614d && Arrays.equals(this.f117615e, wwVar.f117615e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f117616f == 0) {
            this.f117616f = Arrays.hashCode(this.f117615e) + ((((((this.f117612b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f117613c) * 31) + this.f117614d) * 31);
        }
        return this.f117616f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f117612b);
        sb2.append(", ");
        sb2.append(this.f117613c);
        sb2.append(", ");
        sb2.append(this.f117614d);
        sb2.append(", ");
        sb2.append(this.f117615e != null);
        sb2.append(")");
        return sb2.toString();
    }
}
