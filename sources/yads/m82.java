package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile l82 f113348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f113349b = new Object();

    public static final l82 a(Context context) {
        if (f113348a == null) {
            synchronized (f113349b) {
                try {
                    if (f113348a == null) {
                        f113348a = new l82(gf1.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        l82 l82Var = f113348a;
        if (l82Var != null) {
            return l82Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
