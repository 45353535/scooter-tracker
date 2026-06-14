package io.sentry;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.sentry.util.q;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u8 implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u8 f84290c = new u8("00000000-0000-0000-0000-000000000000".replace(TokenBuilder.TOKEN_DELIMITER, "").substring(0, 16));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.q f84291b;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u8 a(m3 m3Var, ILogger iLogger) {
            return new u8(m3Var.nextString());
        }
    }

    public u8(final String str) {
        Objects.requireNonNull(str, "value is required");
        this.f84291b = new io.sentry.util.q(new q.a() { // from class: io.sentry.t8
            @Override // io.sentry.util.q.a
            public final Object a() {
                return u8.a(str);
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u8.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f84291b.a()).equals(((u8) obj).f84291b.a());
    }

    public int hashCode() {
        return ((String) this.f84291b.a()).hashCode();
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.a((String) this.f84291b.a());
    }

    public String toString() {
        return (String) this.f84291b.a();
    }

    public u8() {
        this.f84291b = new io.sentry.util.q(new q.a() { // from class: io.sentry.s8
            @Override // io.sentry.util.q.a
            public final Object a() {
                return i8.b();
            }
        });
    }
}
