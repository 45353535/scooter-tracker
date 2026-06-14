package org.bidon.amazon;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f97026a = i.a(new Function0() { // from class: org.bidon.amazon.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final b b() {
        return new b();
    }

    public static final b c() {
        return (b) f97026a.getValue();
    }
}
