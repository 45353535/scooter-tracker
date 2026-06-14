package f1;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import f1.vb;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class vb implements CacheEvictor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f71395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f71396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f71397e;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71398f = new a();

        /* JADX INFO: renamed from: f1.vb$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0878a extends kotlin.jvm.internal.y implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0878a f71399b = new C0878a();

            public C0878a() {
                super(2, lc.class, "compare", "compare(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)I", 1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(CacheSpan p02, CacheSpan p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return Integer.valueOf(lc.b(p02, p12));
            }
        }

        public a() {
            super(0);
        }

        public static final int a(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final TreeSet invoke() {
            final C0878a c0878a = C0878a.f71399b;
            return new TreeSet(new Comparator() { // from class: f1.ub
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return vb.a.a(c0878a, obj, obj2);
                }
            });
        }
    }

    public interface b {
        void c(String str);
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final TreeSet invoke() {
            return (TreeSet) vb.this.f71395c.invoke();
        }
    }

    public vb(long j10, b evictUrlCallback, Function0 treeSetFactory) {
        Intrinsics.checkNotNullParameter(evictUrlCallback, "evictUrlCallback");
        Intrinsics.checkNotNullParameter(treeSetFactory, "treeSetFactory");
        this.f71393a = j10;
        this.f71394b = evictUrlCallback;
        this.f71395c = treeSetFactory;
        this.f71396d = lf.i.a(new c());
    }

    public final TreeSet a() {
        return (TreeSet) this.f71396d.getValue();
    }

    public final void c(Cache cache, long j10) {
        while (this.f71397e + j10 > this.f71393a && !a().isEmpty()) {
            CacheSpan cacheSpan = (CacheSpan) a().first();
            eg.e("evictCache() - " + cacheSpan.key, null, 2, null);
            cache.removeSpan(cacheSpan);
            b bVar = this.f71394b;
            String key = cacheSpan.key;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            bVar.c(key);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        a().add(span);
        this.f71397e += span.length;
        c(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        a().remove(span);
        this.f71397e -= span.length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(oldSpan, "oldSpan");
        Intrinsics.checkNotNullParameter(newSpan, "newSpan");
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String key, long j10, long j11) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        if (j11 != -1) {
            c(cache, j11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    public /* synthetic */ vb(long j10, b bVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, bVar, (i10 & 4) != 0 ? a.f71398f : function0);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }
}
