package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class g80 {

    @NotNull
    public static final f80 Companion = new f80();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f111103d = {null, null, new yg.f(yg.y2.f119104a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f111106c;

    public /* synthetic */ g80(int i10, String str, boolean z10, List list) {
        if (7 != (i10 & 7)) {
            yg.e2.a(i10, 7, e80.f110246a.getDescriptor());
        }
        this.f111104a = str;
        this.f111105b = z10;
        this.f111106c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return Intrinsics.areEqual(this.f111104a, g80Var.f111104a) && this.f111105b == g80Var.f111105b && Intrinsics.areEqual(this.f111106c, g80Var.f111106c);
    }

    public final int hashCode() {
        return this.f111106c.hashCode() + ((androidx.compose.foundation.c.a(this.f111105b) + (this.f111104a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelSdkData(version=" + this.f111104a + ", isIntegratedSuccess=" + this.f111105b + ", integrationMessages=" + this.f111106c + ")";
    }

    public g80(boolean z10, List list) {
        this.f111104a = "7.17.0";
        this.f111105b = z10;
        this.f111106c = list;
    }
}
