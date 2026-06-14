package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import zg.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends JsonPrimitive {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f93713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f93714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f93715d;

    public /* synthetic */ w(Object obj, boolean z10, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String e() {
        return this.f93715d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return g() == wVar.g() && Intrinsics.areEqual(e(), wVar.e());
    }

    public final SerialDescriptor f() {
        return this.f93714c;
    }

    public boolean g() {
        return this.f93713b;
    }

    public int hashCode() {
        return (androidx.compose.foundation.c.a(g()) * 31) + e().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!g()) {
            return e();
        }
        StringBuilder sb2 = new StringBuilder();
        j1.c(sb2, e());
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Object body, boolean z10, SerialDescriptor serialDescriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f93713b = z10;
        this.f93714c = serialDescriptor;
        this.f93715d = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
