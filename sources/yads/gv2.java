package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class gv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ gv2 f111353a = new gv2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f111354b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile iv2 f111355c;

    public static hv2 a(Context context) {
        iv2 iv2Var;
        iv2 iv2Var2 = f111355c;
        if (iv2Var2 != null) {
            return iv2Var2;
        }
        synchronized (f111354b) {
            iv2Var = f111355c;
            if (iv2Var == null) {
                iv2Var = new iv2(gf1.a(context, "YadPreferenceFile"));
                f111355c = iv2Var;
            }
        }
        return iv2Var;
    }
}
