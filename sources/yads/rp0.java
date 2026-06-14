package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static sp0 f115542a;

    public static final synchronized sp0 a(Context context) {
        sp0 sp0Var;
        sp0Var = f115542a;
        if (sp0Var == null) {
            sp0Var = new sp0(context);
            f115542a = sp0Var;
        }
        return sp0Var;
    }
}
