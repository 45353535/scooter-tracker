package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class CacheBuilder<K, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final Supplier f28999q = Suppliers.ofInstance(new AbstractCache.StatsCounter() { // from class: com.google.common.cache.CacheBuilder.1
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i10) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j10) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j10) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i10) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
            return CacheBuilder.f29000r;
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final CacheStats f29000r = new CacheStats(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Supplier f29001s = new Supplier<AbstractCache.StatsCounter>() { // from class: com.google.common.cache.CacheBuilder.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public AbstractCache.StatsCounter get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Ticker f29002t = new Ticker() { // from class: com.google.common.cache.CacheBuilder.3
        @Override // com.google.common.base.Ticker
        public long read() {
            return 0L;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Weigher f29008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LocalCache.Strength f29009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    LocalCache.Strength f29010h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Equivalence f29014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Equivalence f29015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    RemovalListener f29016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Ticker f29017o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f29003a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f29004b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f29005c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f29006d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f29007e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f29011i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f29012j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f29013k = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Supplier f29018p = f28999q;

    private static final class LoggerHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Logger f29019a = Logger.getLogger(CacheBuilder.class.getName());
    }

    enum NullListener implements RemovalListener<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    enum OneWeigher implements Weigher<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.Weigher
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    private CacheBuilder() {
    }

    private void a() {
        Preconditions.checkState(this.f29013k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void b() {
        if (this.f29008f == null) {
            Preconditions.checkState(this.f29007e == -1, "maximumWeight requires weigher");
        } else if (this.f29003a) {
            Preconditions.checkState(this.f29007e != -1, "weigher requires maximumWeight");
        } else if (this.f29007e == -1) {
            LoggerHolder.f29019a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(CacheBuilderSpec cacheBuilderSpec) {
        return cacheBuilderSpec.d().r();
    }

    public static CacheBuilder<Object, Object> newBuilder() {
        return new CacheBuilder<>();
    }

    private static long u(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(CacheLoader<? super K1, V1> cacheLoader) {
        b();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    int c() {
        int i10 = this.f29005c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> concurrencyLevel(int i10) {
        int i11 = this.f29005c;
        Preconditions.checkState(i11 == -1, "concurrency level was already set to %s", i11);
        Preconditions.checkArgument(i10 > 0);
        this.f29005c = i10;
        return this;
    }

    long d() {
        long j10 = this.f29012j;
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    long e() {
        long j10 = this.f29011i;
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    @CanIgnoreReturnValue
    @IgnoreJRERequirement
    @GwtIncompatible
    public CacheBuilder<K, V> expireAfterAccess(Duration duration) {
        return expireAfterAccess(u(duration), TimeUnit.NANOSECONDS);
    }

    @CanIgnoreReturnValue
    @IgnoreJRERequirement
    @GwtIncompatible
    public CacheBuilder<K, V> expireAfterWrite(Duration duration) {
        return expireAfterWrite(u(duration), TimeUnit.NANOSECONDS);
    }

    int f() {
        int i10 = this.f29004b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    Equivalence g() {
        return (Equivalence) MoreObjects.firstNonNull(this.f29014l, h().g());
    }

    LocalCache.Strength h() {
        return (LocalCache.Strength) MoreObjects.firstNonNull(this.f29009g, LocalCache.Strength.STRONG);
    }

    long i() {
        if (this.f29011i == 0 || this.f29012j == 0) {
            return 0L;
        }
        return this.f29008f == null ? this.f29006d : this.f29007e;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> initialCapacity(int i10) {
        int i11 = this.f29004b;
        Preconditions.checkState(i11 == -1, "initial capacity was already set to %s", i11);
        Preconditions.checkArgument(i10 >= 0);
        this.f29004b = i10;
        return this;
    }

    long j() {
        long j10 = this.f29013k;
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    RemovalListener k() {
        return (RemovalListener) MoreObjects.firstNonNull(this.f29016n, NullListener.INSTANCE);
    }

    Supplier l() {
        return this.f29018p;
    }

    Ticker m(boolean z10) {
        Ticker ticker = this.f29017o;
        return ticker != null ? ticker : z10 ? Ticker.systemTicker() : f29002t;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> maximumSize(long j10) {
        long j11 = this.f29006d;
        Preconditions.checkState(j11 == -1, "maximum size was already set to %s", j11);
        long j12 = this.f29007e;
        Preconditions.checkState(j12 == -1, "maximum weight was already set to %s", j12);
        Preconditions.checkState(this.f29008f == null, "maximum size can not be combined with weigher");
        Preconditions.checkArgument(j10 >= 0, "maximum size must not be negative");
        this.f29006d = j10;
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> maximumWeight(long j10) {
        long j11 = this.f29007e;
        Preconditions.checkState(j11 == -1, "maximum weight was already set to %s", j11);
        long j12 = this.f29006d;
        Preconditions.checkState(j12 == -1, "maximum size was already set to %s", j12);
        Preconditions.checkArgument(j10 >= 0, "maximum weight must not be negative");
        this.f29007e = j10;
        return this;
    }

    Equivalence n() {
        return (Equivalence) MoreObjects.firstNonNull(this.f29015m, o().g());
    }

    LocalCache.Strength o() {
        return (LocalCache.Strength) MoreObjects.firstNonNull(this.f29010h, LocalCache.Strength.STRONG);
    }

    Weigher p() {
        return (Weigher) MoreObjects.firstNonNull(this.f29008f, OneWeigher.INSTANCE);
    }

    CacheBuilder q(Equivalence equivalence) {
        Equivalence equivalence2 = this.f29014l;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f29014l = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    CacheBuilder r() {
        this.f29003a = false;
        return this;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> recordStats() {
        this.f29018p = f29001s;
        return this;
    }

    @CanIgnoreReturnValue
    @IgnoreJRERequirement
    @GwtIncompatible
    public CacheBuilder<K, V> refreshAfterWrite(Duration duration) {
        return refreshAfterWrite(u(duration), TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> removalListener(RemovalListener<? super K1, ? super V1> removalListener) {
        Preconditions.checkState(this.f29016n == null);
        this.f29016n = (RemovalListener) Preconditions.checkNotNull(removalListener);
        return this;
    }

    CacheBuilder s(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f29009g;
        Preconditions.checkState(strength2 == null, "Key strength was already set to %s", strength2);
        this.f29009g = (LocalCache.Strength) Preconditions.checkNotNull(strength);
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> softValues() {
        return t(LocalCache.Strength.SOFT);
    }

    CacheBuilder t(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f29010h;
        Preconditions.checkState(strength2 == null, "Value strength was already set to %s", strength2);
        this.f29010h = (LocalCache.Strength) Preconditions.checkNotNull(strength);
        return this;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> ticker(Ticker ticker) {
        Preconditions.checkState(this.f29017o == null);
        this.f29017o = (Ticker) Preconditions.checkNotNull(ticker);
        return this;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i10 = this.f29004b;
        if (i10 != -1) {
            stringHelper.add("initialCapacity", i10);
        }
        int i11 = this.f29005c;
        if (i11 != -1) {
            stringHelper.add("concurrencyLevel", i11);
        }
        long j10 = this.f29006d;
        if (j10 != -1) {
            stringHelper.add("maximumSize", j10);
        }
        long j11 = this.f29007e;
        if (j11 != -1) {
            stringHelper.add("maximumWeight", j11);
        }
        if (this.f29011i != -1) {
            stringHelper.add("expireAfterWrite", this.f29011i + "ns");
        }
        if (this.f29012j != -1) {
            stringHelper.add("expireAfterAccess", this.f29012j + "ns");
        }
        LocalCache.Strength strength = this.f29009g;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        LocalCache.Strength strength2 = this.f29010h;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.f29014l != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.f29015m != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.f29016n != null) {
            stringHelper.addValue("removalListener");
        }
        return stringHelper.toString();
    }

    CacheBuilder v(Equivalence equivalence) {
        Equivalence equivalence2 = this.f29015m;
        Preconditions.checkState(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.f29015m = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> weakKeys() {
        return s(LocalCache.Strength.WEAK);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> weakValues() {
        return t(LocalCache.Strength.WEAK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    @GwtIncompatible
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> weigher(Weigher<? super K1, ? super V1> weigher) {
        Preconditions.checkState(this.f29008f == null);
        if (this.f29003a) {
            long j10 = this.f29006d;
            Preconditions.checkState(j10 == -1, "weigher can not be combined with maximum size (%s provided)", j10);
        }
        this.f29008f = (Weigher) Preconditions.checkNotNull(weigher);
        return this;
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(String str) {
        return from(CacheBuilderSpec.parse(str));
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> expireAfterAccess(long j10, TimeUnit timeUnit) {
        long j11 = this.f29012j;
        Preconditions.checkState(j11 == -1, "expireAfterAccess was already set to %s ns", j11);
        Preconditions.checkArgument(j10 >= 0, "duration cannot be negative: %s %s", j10, timeUnit);
        this.f29012j = timeUnit.toNanos(j10);
        return this;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> expireAfterWrite(long j10, TimeUnit timeUnit) {
        long j11 = this.f29011i;
        Preconditions.checkState(j11 == -1, "expireAfterWrite was already set to %s ns", j11);
        Preconditions.checkArgument(j10 >= 0, "duration cannot be negative: %s %s", j10, timeUnit);
        this.f29011i = timeUnit.toNanos(j10);
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> refreshAfterWrite(long j10, TimeUnit timeUnit) {
        Preconditions.checkNotNull(timeUnit);
        long j11 = this.f29013k;
        Preconditions.checkState(j11 == -1, "refresh was already set to %s ns", j11);
        Preconditions.checkArgument(j10 > 0, "duration must be positive: %s %s", j10, timeUnit);
        this.f29013k = timeUnit.toNanos(j10);
        return this;
    }

    public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
        b();
        a();
        return new LocalCache.LocalManualCache(this);
    }
}
