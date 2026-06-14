package org.bidon.ironsource.impl;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f97380a = lf.i.a(new Function0() { // from class: org.bidon.ironsource.impl.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return q.c();
        }
    });

    public static final m b() {
        return (m) f97380a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o c() {
        return new o();
    }
}
