package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class d6 implements oq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d6 f109796h = new d6(null, new c6[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c6 f109797i = new c6(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final nq f109798j = new nq() { // from class: yads.p5
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return d6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f109799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f109801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f109802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f109803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c6[] f109804g;

    public d6(Object obj, c6[] c6VarArr, long j10, long j11, int i10) {
        this.f109799b = obj;
        this.f109801d = j10;
        this.f109802e = j11;
        this.f109800c = c6VarArr.length + i10;
        this.f109804g = c6VarArr;
        this.f109803f = i10;
    }

    public static d6 a(Bundle bundle) {
        c6[] c6VarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            c6VarArr = new c6[0];
        } else {
            c6[] c6VarArr2 = new c6[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                c6VarArr2[i10] = (c6) c6.f109252i.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            c6VarArr = c6VarArr2;
        }
        return new d6(null, c6VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d6.class == obj.getClass()) {
            d6 d6Var = (d6) obj;
            if (w83.a(this.f109799b, d6Var.f109799b) && this.f109800c == d6Var.f109800c && this.f109801d == d6Var.f109801d && this.f109802e == d6Var.f109802e && this.f109803f == d6Var.f109803f && Arrays.equals(this.f109804g, d6Var.f109804g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f109800c * 31;
        Object obj = this.f109799b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f109801d)) * 31) + ((int) this.f109802e)) * 31) + this.f109803f) * 31) + Arrays.hashCode(this.f109804g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f109799b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f109801d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f109804g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f109804g[i10].f109253b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f109804g[i10].f109256e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f109804g[i10].f109256e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f109804g[i10].f109257f[i11]);
                sb2.append(')');
                if (i11 < this.f109804g[i10].f109256e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f109804g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public final c6 a(int i10) {
        int i11 = this.f109803f;
        if (i10 < i11) {
            return f109797i;
        }
        return this.f109804g[i10 - i11];
    }
}
