package com.moloco.sdk.acm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {
    public static final String a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.a() + ':' + dVar.b();
    }
}
