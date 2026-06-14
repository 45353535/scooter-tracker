package zg;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f119426a = SetsKt.setOf((Object[]) new SerialDescriptor[]{vg.a.H(lf.t.f94227c).getDescriptor(), vg.a.I(lf.v.f94232c).getDescriptor(), vg.a.G(lf.r.f94222c).getDescriptor(), vg.a.J(lf.y.f94238c).getDescriptor()});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && Intrinsics.areEqual(serialDescriptor, kotlinx.serialization.json.j.k());
    }

    public static final boolean b(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f119426a.contains(serialDescriptor);
    }
}
