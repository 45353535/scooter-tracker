package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f55467a = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return r.b();
        }
    });

    public static final o a() {
        return c();
    }

    public static final p b() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        return new p(b0.f55287a.a(), u.f55474a.a());
    }

    public static final p c() {
        return (p) f55467a.getValue();
    }
}
