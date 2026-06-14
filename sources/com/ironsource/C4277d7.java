package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4277d7 {

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    public static final class a implements kotlin.properties.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private WeakReference<T> f42888a;

        a(T t10) {
            this.f42888a = new WeakReference<>(t10);
        }

        @NotNull
        public final WeakReference<T> a() {
            return this.f42888a;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
        @Override // kotlin.properties.e, kotlin.properties.d
        @Nullable
        public T getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f42888a.get();
        }

        @Override // kotlin.properties.e
        public void setValue(@NotNull Object thisRef, @NotNull KProperty<?> property, @Nullable T t10) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            this.f42888a = new WeakReference<>(t10);
        }

        public final void a(@NotNull WeakReference<T> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.f42888a = weakReference;
        }
    }

    public static /* synthetic */ kotlin.properties.e a(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    @NotNull
    public static final <T> kotlin.properties.e a(@Nullable T t10) {
        return new a(t10);
    }
}
