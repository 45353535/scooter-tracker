package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ky f112889a = new ky();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f112890b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile oy f112891c;

    public static ly a(Context context) {
        if (f112891c == null) {
            synchronized (f112890b) {
                try {
                    if (f112891c == null) {
                        f112891c = new oy(gf1.a(context, "YadPreferenceFile"), new zl0(), new s7(), new b13());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        oy oyVar = f112891c;
        if (oyVar != null) {
            return oyVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
