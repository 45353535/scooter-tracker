package com.inmobi.media;

import com.inmobi.media.AbstractC3900n6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3900n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f39082a = lf.i.a(new Function0() { // from class: w3.y9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3900n6.a();
        }
    });

    public static final CoroutineScope a() {
        Intrinsics.checkNotNullExpressionValue("n6", "TAG");
        Intrinsics.checkNotNullParameter("n6", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("n6", false));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return kotlinx.coroutines.i.a(eg.w0.c(executorServiceNewSingleThreadExecutor));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.inmobi.media.C3674e6 r15, java.lang.String r16, int r17, int r18, long r19, com.inmobi.media.Ak r21, com.inmobi.media.C3850l6 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3900n6.a(com.inmobi.media.e6, java.lang.String, int, int, long, com.inmobi.media.Ak, com.inmobi.media.l6, boolean):void");
    }
}
