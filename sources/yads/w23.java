package yads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class w23 {
    public static Object a(Callable callable, Object obj, String str, String str2) {
        if (obj == null) {
            boolean z10 = lb1.f113032a;
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable unused) {
            boolean z11 = lb1.f113032a;
            return null;
        }
    }
}
