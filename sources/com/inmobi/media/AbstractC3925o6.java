package com.inmobi.media;

import com.inmobi.media.AbstractC3925o6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3925o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f39162a = lf.i.a(new Function0() { // from class: w3.aa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3925o6.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f39163b = lf.i.a(new Function0() { // from class: w3.ba
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3925o6.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f39164c = lf.i.a(new Function0() { // from class: w3.ca
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3925o6.e();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f39165d = lf.i.a(new Function0() { // from class: w3.da
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3925o6.b();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lazy f39166e = lf.i.a(new Function0() { // from class: w3.ea
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3925o6.d();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Lazy f39167f = lf.i.a(new Function0() { // from class: w3.fa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3925o6.f();
        }
    });

    public static final ExecutorService a() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.highIO", false));
    }

    public static final Wb d() {
        return new Wb();
    }

    public static final ExecutorService e() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new B9("ExecutorProvider.single", false));
    }
}
