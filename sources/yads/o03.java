package yads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class o03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f114149e;

    public o03(int i10, int i11, int i12, int i13, int i14) {
        this.f114145a = i10;
        this.f114146b = i11;
        this.f114147c = i12;
        this.f114148d = i13;
        this.f114149e = i14;
    }

    public static o03 a(String str) {
        if (!str.startsWith("Format:")) {
            throw new IllegalArgumentException();
        }
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strA = ci.a(strArrSplit[i14].trim());
            strA.getClass();
            switch (strA) {
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
        return new o03(i10, i11, i12, i13, strArrSplit.length);
    }
}
