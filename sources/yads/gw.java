package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class gw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile jw f111357b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ gw f111356a = new gw();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f111358c = new Object();

    public static hw a(Context context) {
        if (f111357b == null) {
            synchronized (f111358c) {
                try {
                    if (f111357b == null) {
                        f111357b = iw.a(context);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        jw jwVar = f111357b;
        if (jwVar != null) {
            return jwVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
