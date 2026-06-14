package ph;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f98402a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vh.h f98403b = vh.h.f106840e.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f98404c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f98405d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f98406e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i10] = StringsKt.V(ih.d.t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f98406e = strArr;
        String[] strArr2 = f98405d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f98405d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f98405d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f98405d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f98406e[i16];
            }
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f98406e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f98405d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = f98406e[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : StringsKt.W(str2, "PRIORITY", "COMPRESSED", false, 4, null) : StringsKt.W(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f98406e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f98404c;
        return i10 < strArr.length ? strArr[i10] : ih.d.t("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return ih.d.t("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
