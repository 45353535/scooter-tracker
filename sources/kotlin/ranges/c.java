package kotlin.ranges;

/* JADX INFO: loaded from: classes3.dex */
final class c implements bg.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f93359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f93360c;

    public c(float f10, float f11) {
        this.f93359b = f10;
        this.f93360c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bg.b
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean b(float f10) {
        return f10 >= this.f93359b && f10 <= this.f93360c;
    }

    @Override // bg.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f93360c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bg.b
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    @Override // bg.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f93359b);
    }

    public boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f93359b == cVar.f93359b && this.f93360c == cVar.f93360c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f93359b) * 31) + Float.floatToIntBits(this.f93360c);
    }

    @Override // bg.b, bg.c
    public boolean isEmpty() {
        return this.f93359b > this.f93360c;
    }

    public String toString() {
        return this.f93359b + ".." + this.f93360c;
    }
}
