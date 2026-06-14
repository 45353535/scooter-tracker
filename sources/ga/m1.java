package ga;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;

/* JADX INFO: loaded from: classes12.dex */
public final class m1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f72378d = new m1(new n9.f0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f72379e = q9.o0.C0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList f72381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f72382c;

    public m1(n9.f0... f0VarArr) {
        this.f72381b = ImmutableList.copyOf(f0VarArr);
        this.f72380a = f0VarArr.length;
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        int i10 = 0;
        while (i10 < this.f72381b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f72381b.size(); i12++) {
                if (((n9.f0) this.f72381b.get(i10)).equals(this.f72381b.get(i12))) {
                    q9.u.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n9.f0 b(int i10) {
        return (n9.f0) this.f72381b.get(i10);
    }

    public ImmutableList c() {
        return ImmutableList.copyOf((Collection) Lists.transform(this.f72381b, new Function() { // from class: ga.l1
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((n9.f0) obj).f95296c);
            }
        }));
    }

    public int d(n9.f0 f0Var) {
        int iIndexOf = this.f72381b.indexOf(f0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f72380a == m1Var.f72380a && this.f72381b.equals(m1Var.f72381b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f72382c == 0) {
            this.f72382c = this.f72381b.hashCode();
        }
        return this.f72382c;
    }

    public String toString() {
        return this.f72381b.toString();
    }
}
