package hh;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f73828c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f73836b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            y yVar = y.HTTP_1_0;
            if (Intrinsics.areEqual(protocol, yVar.f73836b)) {
                return yVar;
            }
            y yVar2 = y.HTTP_1_1;
            if (Intrinsics.areEqual(protocol, yVar2.f73836b)) {
                return yVar2;
            }
            y yVar3 = y.H2_PRIOR_KNOWLEDGE;
            if (Intrinsics.areEqual(protocol, yVar3.f73836b)) {
                return yVar3;
            }
            y yVar4 = y.HTTP_2;
            if (Intrinsics.areEqual(protocol, yVar4.f73836b)) {
                return yVar4;
            }
            y yVar5 = y.SPDY_3;
            if (Intrinsics.areEqual(protocol, yVar5.f73836b)) {
                return yVar5;
            }
            y yVar6 = y.QUIC;
            if (Intrinsics.areEqual(protocol, yVar6.f73836b)) {
                return yVar6;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private a() {
        }
    }

    y(String str) {
        this.f73836b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f73836b;
    }
}
