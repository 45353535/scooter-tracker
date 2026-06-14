package hh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public enum e0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f73603c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f73610b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final e0 a(String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return e0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return e0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return e0.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return e0.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return e0.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        private a() {
        }
    }

    e0(String str) {
        this.f73610b = str;
    }

    public final String g() {
        return this.f73610b;
    }
}
