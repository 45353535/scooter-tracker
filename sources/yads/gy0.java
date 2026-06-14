package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile fy0 f111396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f111397b = new Object();

    public static final fy0 a(Context context) {
        if (f111396a == null) {
            synchronized (f111397b) {
                try {
                    if (f111396a == null) {
                        f111396a = new fy0(gf1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        fy0 fy0Var = f111396a;
        if (fy0Var != null) {
            return fy0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
