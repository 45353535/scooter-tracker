package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class u extends w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final u f19349j = new u(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f19350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f19351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f19352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f19353i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Descriptors.Descriptor f19354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19355b;

        a(Descriptors.Descriptor descriptor, int i10) {
            this.f19354a = descriptor;
            this.f19355b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19354a == aVar.f19354a && this.f19355b == aVar.f19355b;
        }

        public int hashCode() {
            return (this.f19354a.hashCode() * 65535) + this.f19355b;
        }
    }

    public static final class b {
    }

    u(boolean z10) {
        super(w.f19394e);
        Map map = Collections.EMPTY_MAP;
        this.f19350f = map;
        this.f19351g = map;
        this.f19352h = map;
        this.f19353i = map;
    }

    public static u g() {
        return f19349j;
    }

    public b d(Descriptors.Descriptor descriptor, int i10) {
        f(descriptor, i10);
        return null;
    }

    public b e(String str) {
        androidx.privacysandbox.ads.adservices.topics.a.a(this.f19350f.get(str));
        return null;
    }

    public b f(Descriptors.Descriptor descriptor, int i10) {
        androidx.privacysandbox.ads.adservices.topics.a.a(this.f19352h.get(new a(descriptor, i10)));
        return null;
    }
}
