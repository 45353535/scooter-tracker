package id;

import id.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f74583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String base64) {
        super(q0.b.PRELOAD, null);
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f74583c = base64;
    }

    public final String b() {
        return this.f74583c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.areEqual(this.f74583c, ((m) obj).f74583c);
    }

    public int hashCode() {
        return this.f74583c.hashCode();
    }

    public String toString() {
        return "Base64MediaSource(base64=" + this.f74583c + ')';
    }
}
