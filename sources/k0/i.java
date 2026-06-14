package k0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f85927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f85928b;

    public i(b bVar, b bVar2) {
        this.f85927a = bVar;
        this.f85928b = bVar2;
    }

    @Override // k0.o
    public g0.a a() {
        return new g0.n(this.f85927a.a(), this.f85928b.a());
    }

    @Override // k0.o
    public List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // k0.o
    public boolean isStatic() {
        return this.f85927a.isStatic() && this.f85928b.isStatic();
    }
}
