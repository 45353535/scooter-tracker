package pb;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes12.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f98160e;

    private a(int i10, int i11, int i12, int i13, int i14) {
        this.f98156a = i10;
        this.f98157b = i11;
        this.f98158c = i12;
        this.f98159d = i13;
        this.f98160e = i14;
    }

    public static a a(String str) {
        q9.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i14].trim());
            lowerCase.getClass();
            switch (lowerCase) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, strArrSplit.length);
    }
}
