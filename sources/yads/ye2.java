package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class ye2 {

    @NotNull
    public static final xe2 Companion = new xe2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f118167b = {new yg.f(bf2.f108991a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f118168a;

    public /* synthetic */ ye2(int i10, List list) {
        if (1 != (i10 & 1)) {
            yg.e2.a(i10, 1, we2.f117438a.getDescriptor());
        }
        this.f118168a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye2) && Intrinsics.areEqual(this.f118168a, ((ye2) obj).f118168a);
    }

    public final int hashCode() {
        return this.f118168a.hashCode();
    }

    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.f118168a + ")";
    }

    public ye2(List list) {
        this.f118168a = list;
    }
}
