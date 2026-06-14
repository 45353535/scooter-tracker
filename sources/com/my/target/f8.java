package com.my.target;

import android.content.Context;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f59662a;

    public f8(za zaVar) {
        this.f59662a = zaVar;
    }

    public void a(g8 g8Var) {
        Context contextF = g8Var.f();
        if (contextF == null) {
            gb.a("NativeViewElementsTracker: can't tracking show elements, context is null ");
            return;
        }
        int i10 = (a(g8Var.q()) ? 1 : 0) + (a(g8Var.h()) ? 2 : 0) + (a(g8Var.d()) ? 4 : 0) + (a(g8Var.p()) ? 8 : 0) + (a(g8Var.r()) ? 16 : 0) + (a(g8Var.j()) ? 32 : 0) + (a(g8Var.k()) ? 64 : 0) + (a(g8Var.l()) ? 128 : 0) + (a(g8Var.g()) ? 256 : 0) + (a(g8Var.c()) ? 512 : 0) + (a(g8Var.i()) ? 1024 : 0) + (a(g8Var.b()) ? 2048 : 0);
        gb.a("NativeViewElementsTracker: visibleElementsBite is " + i10);
        HashMap map = new HashMap();
        map.put("args", Integer.toString(i10));
        bb.a(this.f59662a.b("showElement"), map, 1, contextF);
    }

    public final boolean a(View view) {
        return view != null && view.getVisibility() == 0;
    }
}
