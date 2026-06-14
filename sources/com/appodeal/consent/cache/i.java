package com.appodeal.consent.cache;

import android.content.Context;
import android.content.SharedPreferences;
import eg.o0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f15391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f15392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f15393c = new AtomicBoolean(false);

    public final Object b(Context context, kotlin.coroutines.jvm.internal.d dVar) {
        Object objG = eg.g.g(o0.b(), new g(this, context, null), dVar);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final Object c(p pVar, kotlin.coroutines.jvm.internal.d dVar) {
        return eg.g.g(o0.b(), new d(pVar, this, null), dVar);
    }

    public final Object d(String str, String str2, com.appodeal.consent.form.h hVar) {
        Object objG = eg.g.g(o0.b(), new h(str, str2, this, null), hVar);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final Object f(p pVar, kotlin.coroutines.jvm.internal.d dVar) {
        return eg.g.g(o0.b(), new f(pVar, this, null), dVar);
    }
}
