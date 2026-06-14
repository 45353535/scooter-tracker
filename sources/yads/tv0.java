package yads;

import android.content.Context;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class tv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tu0 f116395a;

    public /* synthetic */ tv0(Context context) {
        this(new tu0(context.getApplicationContext()));
    }

    public final Typeface a(ev0 ev0Var) {
        ConcurrentHashMap concurrentHashMap = qv0.f115176a;
        Typeface typeface = (Typeface) concurrentHashMap.get(ev0Var);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceA = this.f116395a.a(ev0Var);
        if (typefaceA == null) {
            return null;
        }
        concurrentHashMap.put(ev0Var, typefaceA);
        return typefaceA;
    }

    public tv0(tu0 tu0Var) {
        this.f116395a = tu0Var;
    }
}
