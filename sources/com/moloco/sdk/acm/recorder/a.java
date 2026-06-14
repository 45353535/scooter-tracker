package com.moloco.sdk.acm.recorder;

import com.moloco.sdk.acm.c;
import com.moloco.sdk.acm.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    @NotNull
    public static final C0657a Companion = C0657a.f54092a;

    /* JADX INFO: renamed from: com.moloco.sdk.acm.recorder.a$a, reason: collision with other inner class name */
    public static final class C0657a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0657a f54092a = new C0657a();

        private C0657a() {
        }

        public final a a(String mediation) {
            Intrinsics.checkNotNullParameter(mediation, "mediation");
            return new com.moloco.sdk.acm.recorder.b(mediation);
        }

        public final a b() {
            return new com.moloco.sdk.acm.recorder.b(null, 1, 0 == true ? 1 : 0);
        }
    }

    public static final class b {
        public static f a(a aVar, String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return com.moloco.sdk.acm.a.f53924a.w(eventName);
        }
    }

    void a(f fVar);

    void b(c cVar);

    f c(String str);
}
