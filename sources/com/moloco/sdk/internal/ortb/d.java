package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.c0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f54464a = i.a(new Function0() { // from class: com.moloco.sdk.internal.ortb.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.b();
        }
    });

    public static final a a() {
        return c();
    }

    public static final b b() {
        return new b(c0.c());
    }

    public static final a c() {
        return (a) f54464a.getValue();
    }
}
