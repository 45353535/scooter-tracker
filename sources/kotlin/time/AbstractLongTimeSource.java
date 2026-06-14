package kotlin.time;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001:\u0001\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H$¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lcg/c;", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()J", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlin/time/a;", "a", "()Lkotlin/time/a;", "Lcg/b;", "Lcg/b;", "d", "()Lcg/b;", "unit", "b", "Lkotlin/Lazy;", EidRequestBuilder.REQUEST_FIELD_EMAIL, CSSFontFeatureSettings.FEATURE_ZERO, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractLongTimeSource implements cg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cg.b unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy zero;

    private static final class a implements kotlin.time.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f93557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractLongTimeSource f93558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f93559d;

        public /* synthetic */ a(long j10, AbstractLongTimeSource abstractLongTimeSource, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, abstractLongTimeSource, j11);
        }

        @Override // kotlin.time.TimeMark
        public long a() {
            return b.F(f.d(this.f93558c.c(), this.f93557b, this.f93558c.getUnit()), this.f93559d);
        }

        @Override // kotlin.time.a
        public long b(kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (Intrinsics.areEqual(this.f93558c, aVar.f93558c)) {
                    return b.G(f.d(this.f93557b, aVar.f93557b, this.f93558c.getUnit()), b.F(this.f93559d, aVar.f93559d));
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
            return (obj instanceof a) && Intrinsics.areEqual(this.f93558c, ((a) obj).f93558c) && b.l(b((kotlin.time.a) obj), b.f93560c.c());
        }

        public int hashCode() {
            return (b.y(this.f93559d) * 37) + androidx.collection.b.a(this.f93557b);
        }

        public String toString() {
            return "LongTimeMark(" + this.f93557b + e.f(this.f93558c.getUnit()) + " + " + ((Object) b.L(this.f93559d)) + ", " + this.f93558c + ')';
        }

        private a(long j10, AbstractLongTimeSource timeSource, long j11) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f93557b = j10;
            this.f93558c = timeSource;
            this.f93559d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return f() - e();
    }

    private final long e() {
        return ((Number) this.zero.getValue()).longValue();
    }

    @Override // cg.c
    public kotlin.time.a a() {
        return new a(c(), this, b.f93560c.c(), null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final cg.b getUnit() {
        return this.unit;
    }

    protected abstract long f();
}
