package kotlin.time;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H$¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lcg/c;", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()D", "Lkotlin/time/a;", "a", "()Lkotlin/time/a;", "Lcg/b;", "Lcg/b;", "b", "()Lcg/b;", "unit", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractDoubleTimeSource implements cg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cg.b unit;

    private static final class a implements kotlin.time.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f93552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractDoubleTimeSource f93553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f93554d;

        public /* synthetic */ a(double d10, AbstractDoubleTimeSource abstractDoubleTimeSource, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(d10, abstractDoubleTimeSource, j10);
        }

        @Override // kotlin.time.TimeMark
        public long a() {
            return b.F(c.r(this.f93553c.c() - this.f93552b, this.f93553c.getUnit()), this.f93554d);
        }

        @Override // kotlin.time.a
        public long b(kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (Intrinsics.areEqual(this.f93553c, aVar.f93553c)) {
                    if (b.l(this.f93554d, aVar.f93554d) && b.C(this.f93554d)) {
                        return b.f93560c.c();
                    }
                    long jF = b.F(this.f93554d, aVar.f93554d);
                    long jR = c.r(this.f93552b - aVar.f93552b, this.f93553c.getUnit());
                    return b.l(jR, b.M(jF)) ? b.f93560c.c() : b.G(jR, jF);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(kotlin.time.a aVar) {
            return a.C1072a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f93553c, ((a) obj).f93553c) && b.l(b((kotlin.time.a) obj), b.f93560c.c());
        }

        public int hashCode() {
            return b.y(b.G(c.r(this.f93552b, this.f93553c.getUnit()), this.f93554d));
        }

        public String toString() {
            return "DoubleTimeMark(" + this.f93552b + e.f(this.f93553c.getUnit()) + " + " + ((Object) b.L(this.f93554d)) + ", " + this.f93553c + ')';
        }

        private a(double d10, AbstractDoubleTimeSource timeSource, long j10) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f93552b = d10;
            this.f93553c = timeSource;
            this.f93554d = j10;
        }
    }

    @Override // cg.c
    public kotlin.time.a a() {
        return new a(c(), this, b.f93560c.c(), null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    protected final cg.b getUnit() {
        return this.unit;
    }

    protected abstract double c();
}
