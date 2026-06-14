package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class cj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o92 f109423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej3 f109424b;

    public cj3(o92 o92Var, ej3 ej3Var) {
        this.f109423a = o92Var;
        this.f109424b = ej3Var;
    }

    public static String b(View view) {
        int visibility = view.getVisibility();
        return "view is not shown: visibility=" + (visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE") + ", attached=" + view.isAttachedToWindow();
    }

    public static String c(View view) {
        return "view rect is null: " + (!view.isAttachedToWindow() ? "not attached" : (view.getWidth() <= 0 || view.getHeight() <= 0) ? "zero size" : "scrolled off");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.dj3 a(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cj3.a(android.view.View):yads.dj3");
    }
}
