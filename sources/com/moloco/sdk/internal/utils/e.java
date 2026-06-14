package com.moloco.sdk.internal.utils;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements CoroutineContext.Element {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f55777b;

    public e(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f55777b = key;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f getKey() {
        return this.f55777b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
