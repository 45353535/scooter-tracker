package org.bidon.ironsource.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f97333a = lf.i.a(new Function0() { // from class: org.bidon.ironsource.impl.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.d();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        Object value = f97333a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (List) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d() {
        return DesugarCollections.synchronizedList(new ArrayList());
    }
}
