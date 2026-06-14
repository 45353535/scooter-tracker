package sg.bigo.ads.common.h.b;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes4.dex */
final class j {
    protected static String a(float f10) {
        String str;
        if (f10 >= 1048576.0f) {
            f10 = (f10 / 1024.0f) / 1024.0f;
            str = "mb/s";
        } else if (f10 >= 1024.0f) {
            f10 /= 1024.0f;
            str = "kb/s";
        } else {
            str = "b/s";
        }
        return new DecimalFormat("0.00").format(f10) + str;
    }
}
