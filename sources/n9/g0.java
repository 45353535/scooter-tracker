package n9;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f95320c = o0.C0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f95321d = o0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f95322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f95323b;

    public g0(f0 f0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= f0Var.f95294a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f95322a = f0Var;
        this.f95323b = ImmutableList.copyOf((Collection) list);
    }

    public int a() {
        return this.f95322a.f95296c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f95322a.equals(g0Var.f95322a) && this.f95323b.equals(g0Var.f95323b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f95322a.hashCode() + (this.f95323b.hashCode() * 31);
    }
}
