package yads;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class py1 {
    public static qy1 a() {
        if (qy1.f115214d == null) {
            synchronized (qy1.f115213c) {
                try {
                    if (qy1.f115214d == null) {
                        qy1.f115214d = new qy1(new Handler(Looper.getMainLooper()));
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        qy1 qy1Var = qy1.f115214d;
        if (qy1Var != null) {
            return qy1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
