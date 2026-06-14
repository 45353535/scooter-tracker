package yads;

import android.os.Trace;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q43 {
    public static void a(String str) {
        if (w83.f117341a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (w83.f117341a >= 18) {
            Trace.endSection();
        }
    }
}
