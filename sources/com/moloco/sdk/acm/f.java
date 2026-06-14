package com.moloco.sdk.acm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.moloco.sdk.acm.services.e f54052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f54053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f54054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54055d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return new f(eventName, new com.moloco.sdk.acm.services.e(new com.moloco.sdk.acm.services.g()), null);
        }

        private a() {
        }
    }

    public /* synthetic */ f(String str, com.moloco.sdk.acm.services.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar);
    }

    public List a() {
        return this.f54054c;
    }

    public String b() {
        return this.f54055d;
    }

    public final long c() {
        return this.f54053b;
    }

    public final void d() {
        this.f54052a.b();
    }

    public final void e() {
        if (this.f54053b == 0) {
            this.f54053b = this.f54052a.a();
        }
    }

    public f f(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (a().size() < 10 && key.length() <= 50 && value.length() <= 50) {
            a().add(new d(key, value));
        }
        return this;
    }

    public final f g(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }
        this.f54053b = j10;
        return this;
    }

    private f(String str, com.moloco.sdk.acm.services.e eVar) {
        this.f54052a = eVar;
        this.f54054c = new ArrayList();
        this.f54055d = str;
    }
}
