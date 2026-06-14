package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class z30 {

    @NotNull
    public static final y30 Companion = new y30();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KSerializer[] f118530c = {new yg.f(f40.f110596a), new yg.f(s30.f115677a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f118531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f118532b;

    public /* synthetic */ z30(int i10, List list, List list2) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, x30.f117692a.getDescriptor());
        }
        this.f118531a = list;
        this.f118532b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z30)) {
            return false;
        }
        z30 z30Var = (z30) obj;
        return Intrinsics.areEqual(this.f118531a, z30Var.f118531a) && Intrinsics.areEqual(this.f118532b, z30Var.f118532b);
    }

    public final int hashCode() {
        return this.f118532b.hashCode() + (this.f118531a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.f118531a + ", bidding=" + this.f118532b + ")";
    }
}
