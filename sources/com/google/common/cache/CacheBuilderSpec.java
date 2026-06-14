package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.ironsource.D5;
import com.ironsource.U2;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class CacheBuilderSpec {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Splitter f29022o = Splitter.on(',').trimResults();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Splitter f29023p = Splitter.on(D5.T).trimResults();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ImmutableMap f29024q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Integer f29025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Long f29026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Long f29027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Integer f29028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    LocalCache.Strength f29029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    LocalCache.Strength f29030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Boolean f29031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f29032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    TimeUnit f29033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f29034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    TimeUnit f29035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f29036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    TimeUnit f29037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f29038n;

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29039a;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            f29039a = iArr;
            try {
                iArr[LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29039a[LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class AccessDurationParser extends DurationParser {
        AccessDurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void a(CacheBuilderSpec cacheBuilderSpec, long j10, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.f29035k == null, "expireAfterAccess already set");
            cacheBuilderSpec.f29034j = j10;
            cacheBuilderSpec.f29035k = timeUnit;
        }
    }

    static class ConcurrencyLevelParser extends IntegerParser {
        ConcurrencyLevelParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void a(CacheBuilderSpec cacheBuilderSpec, int i10) {
            Integer num = cacheBuilderSpec.f29028d;
            Preconditions.checkArgument(num == null, "concurrency level was already set to %s", num);
            cacheBuilderSpec.f29028d = Integer.valueOf(i10);
        }
    }

    static abstract class DurationParser implements ValueParser {
        DurationParser() {
        }

        protected abstract void a(CacheBuilderSpec cacheBuilderSpec, long j10, TimeUnit timeUnit);

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            TimeUnit timeUnit;
            if (Strings.isNullOrEmpty(str2)) {
                throw new IllegalArgumentException("value of key " + str + " omitted");
            }
            try {
                char cCharAt = str2.charAt(str2.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (cCharAt != 's') {
                        throw new IllegalArgumentException(CacheBuilderSpec.c("key %s invalid unit: was %s, must end with one of [dhms]", str, str2));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                a(cacheBuilderSpec, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(CacheBuilderSpec.c("key %s value set to %s, must be integer", str, str2));
            }
        }
    }

    static class InitialCapacityParser extends IntegerParser {
        InitialCapacityParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void a(CacheBuilderSpec cacheBuilderSpec, int i10) {
            Integer num = cacheBuilderSpec.f29025a;
            Preconditions.checkArgument(num == null, "initial capacity was already set to %s", num);
            cacheBuilderSpec.f29025a = Integer.valueOf(i10);
        }
    }

    static abstract class IntegerParser implements ValueParser {
        IntegerParser() {
        }

        protected abstract void a(CacheBuilderSpec cacheBuilderSpec, int i10);

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (!Strings.isNullOrEmpty(str2)) {
                try {
                    a(cacheBuilderSpec, Integer.parseInt(str2));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(CacheBuilderSpec.c("key %s value set to %s, must be integer", str, str2), e10);
                }
            } else {
                throw new IllegalArgumentException("value of key " + str + " omitted");
            }
        }
    }

    static class KeyStrengthParser implements ValueParser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocalCache.Strength f29040a;

        public KeyStrengthParser(LocalCache.Strength strength) {
            this.f29040a = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            LocalCache.Strength strength = cacheBuilderSpec.f29029e;
            Preconditions.checkArgument(strength == null, "%s was already set to %s", str, strength);
            cacheBuilderSpec.f29029e = this.f29040a;
        }
    }

    static abstract class LongParser implements ValueParser {
        LongParser() {
        }

        protected abstract void a(CacheBuilderSpec cacheBuilderSpec, long j10);

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (!Strings.isNullOrEmpty(str2)) {
                try {
                    a(cacheBuilderSpec, Long.parseLong(str2));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(CacheBuilderSpec.c("key %s value set to %s, must be integer", str, str2), e10);
                }
            } else {
                throw new IllegalArgumentException("value of key " + str + " omitted");
            }
        }
    }

    static class MaximumSizeParser extends LongParser {
        MaximumSizeParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void a(CacheBuilderSpec cacheBuilderSpec, long j10) {
            Long l10 = cacheBuilderSpec.f29026b;
            Preconditions.checkArgument(l10 == null, "maximum size was already set to %s", l10);
            Long l11 = cacheBuilderSpec.f29027c;
            Preconditions.checkArgument(l11 == null, "maximum weight was already set to %s", l11);
            cacheBuilderSpec.f29026b = Long.valueOf(j10);
        }
    }

    static class MaximumWeightParser extends LongParser {
        MaximumWeightParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void a(CacheBuilderSpec cacheBuilderSpec, long j10) {
            Long l10 = cacheBuilderSpec.f29027c;
            Preconditions.checkArgument(l10 == null, "maximum weight was already set to %s", l10);
            Long l11 = cacheBuilderSpec.f29026b;
            Preconditions.checkArgument(l11 == null, "maximum size was already set to %s", l11);
            cacheBuilderSpec.f29027c = Long.valueOf(j10);
        }
    }

    static class RecordStatsParser implements ValueParser {
        RecordStatsParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            Preconditions.checkArgument(str2 == null, "recordStats does not take values");
            Preconditions.checkArgument(cacheBuilderSpec.f29031g == null, "recordStats already set");
            cacheBuilderSpec.f29031g = Boolean.TRUE;
        }
    }

    static class RefreshDurationParser extends DurationParser {
        RefreshDurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void a(CacheBuilderSpec cacheBuilderSpec, long j10, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.f29037m == null, "refreshAfterWrite already set");
            cacheBuilderSpec.f29036l = j10;
            cacheBuilderSpec.f29037m = timeUnit;
        }
    }

    private interface ValueParser {
        void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2);
    }

    static class ValueStrengthParser implements ValueParser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocalCache.Strength f29041a;

        public ValueStrengthParser(LocalCache.Strength strength) {
            this.f29041a = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            LocalCache.Strength strength = cacheBuilderSpec.f29030f;
            Preconditions.checkArgument(strength == null, "%s was already set to %s", str, strength);
            cacheBuilderSpec.f29030f = this.f29041a;
        }
    }

    static class WriteDurationParser extends DurationParser {
        WriteDurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void a(CacheBuilderSpec cacheBuilderSpec, long j10, TimeUnit timeUnit) {
            Preconditions.checkArgument(cacheBuilderSpec.f29033i == null, "expireAfterWrite already set");
            cacheBuilderSpec.f29032h = j10;
            cacheBuilderSpec.f29033i = timeUnit;
        }
    }

    static {
        ImmutableMap.Builder builderPut = ImmutableMap.builder().put("initialCapacity", new InitialCapacityParser()).put("maximumSize", new MaximumSizeParser()).put("maximumWeight", new MaximumWeightParser()).put("concurrencyLevel", new ConcurrencyLevelParser());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        f29024q = builderPut.put("weakKeys", new KeyStrengthParser(strength)).put("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT)).put("weakValues", new ValueStrengthParser(strength)).put("recordStats", new RecordStatsParser()).put("expireAfterAccess", new AccessDurationParser()).put("expireAfterWrite", new WriteDurationParser()).put("refreshAfterWrite", new RefreshDurationParser()).put(U2.f41830b, new RefreshDurationParser()).buildOrThrow();
    }

    private CacheBuilderSpec(String str) {
        this.f29038n = str;
    }

    private static Long b(long j10, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static CacheBuilderSpec disableCaching() {
        return parse("maximumSize=0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CacheBuilderSpec parse(String str) {
        CacheBuilderSpec cacheBuilderSpec = new CacheBuilderSpec(str);
        if (!str.isEmpty()) {
            for (String str2 : f29022o.split(str)) {
                ImmutableList immutableListCopyOf = ImmutableList.copyOf(f29023p.split(str2));
                Preconditions.checkArgument(!immutableListCopyOf.isEmpty(), "blank key-value pair");
                Preconditions.checkArgument(immutableListCopyOf.size() <= 2, "key-value pair %s with more than one equals sign", str2);
                String str3 = (String) immutableListCopyOf.get(0);
                ValueParser valueParser = (ValueParser) f29024q.get(str3);
                Preconditions.checkArgument(valueParser != null, "unknown key %s", str3);
                valueParser.parse(cacheBuilderSpec, str3, immutableListCopyOf.size() == 1 ? null : (String) immutableListCopyOf.get(1));
            }
        }
        return cacheBuilderSpec;
    }

    CacheBuilder d() {
        CacheBuilder<Object, Object> cacheBuilderNewBuilder = CacheBuilder.newBuilder();
        Integer num = this.f29025a;
        if (num != null) {
            cacheBuilderNewBuilder.initialCapacity(num.intValue());
        }
        Long l10 = this.f29026b;
        if (l10 != null) {
            cacheBuilderNewBuilder.maximumSize(l10.longValue());
        }
        Long l11 = this.f29027c;
        if (l11 != null) {
            cacheBuilderNewBuilder.maximumWeight(l11.longValue());
        }
        Integer num2 = this.f29028d;
        if (num2 != null) {
            cacheBuilderNewBuilder.concurrencyLevel(num2.intValue());
        }
        LocalCache.Strength strength = this.f29029e;
        if (strength != null) {
            if (AnonymousClass1.f29039a[strength.ordinal()] != 1) {
                throw new AssertionError();
            }
            cacheBuilderNewBuilder.weakKeys();
        }
        LocalCache.Strength strength2 = this.f29030f;
        if (strength2 != null) {
            int i10 = AnonymousClass1.f29039a[strength2.ordinal()];
            if (i10 == 1) {
                cacheBuilderNewBuilder.weakValues();
            } else {
                if (i10 != 2) {
                    throw new AssertionError();
                }
                cacheBuilderNewBuilder.softValues();
            }
        }
        Boolean bool = this.f29031g;
        if (bool != null && bool.booleanValue()) {
            cacheBuilderNewBuilder.recordStats();
        }
        TimeUnit timeUnit = this.f29033i;
        if (timeUnit != null) {
            cacheBuilderNewBuilder.expireAfterWrite(this.f29032h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f29035k;
        if (timeUnit2 != null) {
            cacheBuilderNewBuilder.expireAfterAccess(this.f29034j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f29037m;
        if (timeUnit3 != null) {
            cacheBuilderNewBuilder.refreshAfterWrite(this.f29036l, timeUnit3);
        }
        return cacheBuilderNewBuilder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        return Objects.equal(this.f29025a, cacheBuilderSpec.f29025a) && Objects.equal(this.f29026b, cacheBuilderSpec.f29026b) && Objects.equal(this.f29027c, cacheBuilderSpec.f29027c) && Objects.equal(this.f29028d, cacheBuilderSpec.f29028d) && Objects.equal(this.f29029e, cacheBuilderSpec.f29029e) && Objects.equal(this.f29030f, cacheBuilderSpec.f29030f) && Objects.equal(this.f29031g, cacheBuilderSpec.f29031g) && Objects.equal(b(this.f29032h, this.f29033i), b(cacheBuilderSpec.f29032h, cacheBuilderSpec.f29033i)) && Objects.equal(b(this.f29034j, this.f29035k), b(cacheBuilderSpec.f29034j, cacheBuilderSpec.f29035k)) && Objects.equal(b(this.f29036l, this.f29037m), b(cacheBuilderSpec.f29036l, cacheBuilderSpec.f29037m));
    }

    public int hashCode() {
        return Objects.hashCode(this.f29025a, this.f29026b, this.f29027c, this.f29028d, this.f29029e, this.f29030f, this.f29031g, b(this.f29032h, this.f29033i), b(this.f29034j, this.f29035k), b(this.f29036l, this.f29037m));
    }

    public String toParsableString() {
        return this.f29038n;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }
}
