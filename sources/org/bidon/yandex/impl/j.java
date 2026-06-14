package org.bidon.yandex.impl;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f97895a = lf.i.a(new Function0() { // from class: org.bidon.yandex.impl.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j.c();
        }
    });

    public static final g b() {
        return (g) f97895a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h c() {
        return new h();
    }
}
