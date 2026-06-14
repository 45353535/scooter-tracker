package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class qv2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile sv2 f115180b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ qv2 f115179a = new qv2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f115181c = new Object();

    public static rv2 a(Context context) {
        if (f115180b == null) {
            synchronized (f115181c) {
                try {
                    if (f115180b == null) {
                        f115180b = new sv2(gf1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        sv2 sv2Var = f115180b;
        if (sv2Var != null) {
            return sv2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
