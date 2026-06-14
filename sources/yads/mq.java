package yads;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f113583a;

    public static IBinder a(Bundle bundle, String str) {
        if (w83.f117341a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f113583a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f113583a = method2;
                method2.setAccessible(true);
                method = f113583a;
            } catch (NoSuchMethodException e10) {
                uf1.c("BundleUtil", uf1.a("Failed to retrieve getIBinder method", e10));
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            uf1.c("BundleUtil", uf1.a("Failed to invoke getIBinder via reflection", e11));
            return null;
        }
    }
}
