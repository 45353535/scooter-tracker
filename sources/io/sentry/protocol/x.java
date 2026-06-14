package io.sentry.protocol;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.i8;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import io.sentry.util.q;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f84062c = new x("00000000-0000-0000-0000-000000000000".replace(TokenBuilder.TOKEN_DELIMITER, ""));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.q f84063b;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(m3 m3Var, ILogger iLogger) {
            return new x(m3Var.nextString());
        }
    }

    public x() {
        this((UUID) null);
    }

    public static /* synthetic */ String a(x xVar, UUID uuid) {
        xVar.getClass();
        return xVar.d(io.sentry.util.j0.c(uuid));
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return io.sentry.util.d0.e(str).replace(TokenBuilder.TOKEN_DELIMITER, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f84063b.a()).equals(((x) obj).f84063b.a());
    }

    public int hashCode() {
        return ((String) this.f84063b.a()).hashCode();
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.a(toString());
    }

    public String toString() {
        return (String) this.f84063b.a();
    }

    public x(final UUID uuid) {
        if (uuid != null) {
            this.f84063b = new io.sentry.util.q(new q.a() { // from class: io.sentry.protocol.t
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return x.a(this.f84057a, uuid);
                }
            });
        } else {
            this.f84063b = new io.sentry.util.q(new q.a() { // from class: io.sentry.protocol.u
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return i8.a();
                }
            });
        }
    }

    public x(String str) {
        final String strE = io.sentry.util.d0.e(str);
        if (strE.length() != 32 && strE.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strE.length() == 36) {
            this.f84063b = new io.sentry.util.q(new q.a() { // from class: io.sentry.protocol.v
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return this.f84059a.d(strE);
                }
            });
        } else {
            this.f84063b = new io.sentry.util.q(new q.a() { // from class: io.sentry.protocol.w
                @Override // io.sentry.util.q.a
                public final Object a() {
                    return x.b(strE);
                }
            });
        }
    }
}
