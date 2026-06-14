package org.bidon.chartboost.impl;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f97217a = lf.i.a(new Function0() { // from class: org.bidon.chartboost.impl.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1.e b() {
        return new b1.e("Bidon", "0.13.0", org.bidon.chartboost.ext.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1.e d() {
        return (b1.e) f97217a.getValue();
    }
}
