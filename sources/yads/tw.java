package yads;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f116400a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f116401b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};

    public static String a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {f116401b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        int i14 = w83.f117341a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static boolean a(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }
}
