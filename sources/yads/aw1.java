package yads;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class aw1 implements k23, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108847b;

    public aw1(int i10) {
        this.f108847b = uw.a(i10, "expectedValuesPerKey");
    }

    @Override // yads.k23
    public final Object get() {
        return new ArrayList(this.f108847b);
    }
}
