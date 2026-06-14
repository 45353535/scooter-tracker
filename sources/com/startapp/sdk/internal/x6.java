package com.startapp.sdk.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f65527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f65528b;

    public x6(Object emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f65527a = new WeakReference(emitter);
        this.f65528b = new ArrayList();
    }

    public final boolean a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (this.f65527a.get() == obj) {
            return true;
        }
        for (x6 x6Var : this.f65528b) {
            if (x6Var.f65527a.get() == obj || x6Var.a(obj)) {
                return true;
            }
        }
        return false;
    }
}
