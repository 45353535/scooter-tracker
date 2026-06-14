package com.google.firebase;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import eg.w0;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class FirebaseKt$coroutineDispatcher$1<T> implements ComponentFactory {
    public static final FirebaseKt$coroutineDispatcher$1<T> INSTANCE = new FirebaseKt$coroutineDispatcher$1<>();

    @Override // com.google.firebase.components.ComponentFactory
    public final CoroutineDispatcher create(ComponentContainer componentContainer) {
        Intrinsics.reifiedOperationMarker(4, "T");
        Object obj = componentContainer.get(Qualified.qualified(Annotation.class, Executor.class));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return w0.b((Executor) obj);
    }
}
