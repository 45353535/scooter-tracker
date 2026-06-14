package r9;

import com.google.common.base.Joiner;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f99228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f99230d;

    public a(String str, byte[] bArr, int i10, int i11) {
        d(str, bArr, i11);
        this.f99227a = str;
        this.f99228b = bArr;
        this.f99229c = i10;
        this.f99230d = i11;
    }

    private static String c(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        Joiner.on(',').appendTo(sb2, (Iterable<? extends Object>) list);
        return sb2.toString();
    }

    private static void d(String str, byte[] bArr, int i10) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                q9.a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                q9.a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                q9.a.a(z10);
                break;
            case "auxiliary.tracks.map":
                q9.a.a(i10 == 0);
                break;
        }
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    public List b() {
        q9.a.h(this.f99227a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.f99228b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f99228b[i10 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f99227a.equals(aVar.f99227a) && Arrays.equals(this.f99228b, aVar.f99228b) && this.f99229c == aVar.f99229c && this.f99230d == aVar.f99230d) {
                return true;
            }
        }
        return false;
    }

    @Override // n9.v.a
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return u.a(this);
    }

    @Override // n9.v.a
    public /* synthetic */ io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        return u.b(this);
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f99227a.hashCode()) * 31) + Arrays.hashCode(this.f99228b)) * 31) + this.f99229c) * 31) + this.f99230d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.f99230d
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            q9.d0 r0 = new q9.d0
            byte[] r1 = r3.f99228b
            r0.<init>(r1)
            long r0 = r0.O()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r3.f99228b
            r1 = 0
            r0 = r0[r1]
            int r0 = com.google.android.gms.internal.ads.o0.a(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r3.f99228b
            int r0 = com.google.common.primitives.Ints.fromByteArray(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r3.f99228b
            int r0 = com.google.common.primitives.Ints.fromByteArray(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r3.f99228b
            java.lang.String r0 = q9.o0.H(r0)
            goto L70
        L57:
            java.lang.String r0 = r3.f99227a
            java.lang.String r1 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r3.b()
            java.lang.String r0 = c(r0)
            goto L70
        L6a:
            byte[] r0 = r3.f99228b
            java.lang.String r0 = q9.o0.n1(r0)
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mdta: key="
            r1.append(r2)
            java.lang.String r2 = r3.f99227a
            r1.append(r2)
            java.lang.String r2 = ", value="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.a.toString():java.lang.String");
    }
}
