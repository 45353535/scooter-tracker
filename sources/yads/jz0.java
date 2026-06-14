package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f112520a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile jx0 f112521b;

    public static final jx0 a(Context context) {
        if (f112521b == null) {
            synchronized (f112520a) {
                try {
                    if (f112521b == null) {
                        f112521b = new jx0(context, "com.huawei.hms.location.LocationServices");
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        jx0 jx0Var = f112521b;
        if (jx0Var != null) {
            return jx0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
