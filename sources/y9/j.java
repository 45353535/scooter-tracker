package y9;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import y9.k;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.a f108456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList f108457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f108458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f108459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f108460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f108461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f108462h;

    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f108464i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f108465j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f108466k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final i f108467l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f108468m;

        public c(long j10, io.bidmachine.media3.common.a aVar, List list, k.e eVar, List list2, List list3, List list4, String str, long j11) {
            super(j10, aVar, list, eVar, list2, list3, list4);
            this.f108464i = Uri.parse(((y9.b) list.get(0)).f108401a);
            i iVarC = eVar.c();
            this.f108467l = iVarC;
            this.f108466k = str;
            this.f108465j = j11;
            this.f108468m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // y9.j
        public String a() {
            return this.f108466k;
        }

        @Override // y9.j
        public x9.f b() {
            return this.f108468m;
        }

        @Override // y9.j
        public i c() {
            return this.f108467l;
        }
    }

    public static j e(long j10, io.bidmachine.media3.common.a aVar, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, aVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, aVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract x9.f b();

    public abstract i c();

    public i d() {
        return this.f108462h;
    }

    private j(long j10, io.bidmachine.media3.common.a aVar, List list, k kVar, List list2, List list3, List list4) {
        q9.a.a(!list.isEmpty());
        this.f108455a = j10;
        this.f108456b = aVar;
        this.f108457c = ImmutableList.copyOf((Collection) list);
        this.f108459e = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.f108460f = list3;
        this.f108461g = list4;
        this.f108462h = kVar.a(this);
        this.f108458d = kVar.b();
    }

    public static class b extends j implements x9.f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final k.a f108463i;

        public b(long j10, io.bidmachine.media3.common.a aVar, List list, k.a aVar2, List list2, List list3, List list4) {
            super(j10, aVar, list, aVar2, list2, list3, list4);
            this.f108463i = aVar2;
        }

        @Override // y9.j
        public String a() {
            return null;
        }

        @Override // y9.j
        public i c() {
            return null;
        }

        @Override // x9.f
        public long getAvailableSegmentCount(long j10, long j11) {
            return this.f108463i.c(j10, j11);
        }

        @Override // x9.f
        public long getDurationUs(long j10, long j11) {
            return this.f108463i.h(j10, j11);
        }

        @Override // x9.f
        public long getFirstAvailableSegmentNum(long j10, long j11) {
            return this.f108463i.d(j10, j11);
        }

        @Override // x9.f
        public long getFirstSegmentNum() {
            return this.f108463i.e();
        }

        @Override // x9.f
        public long getNextSegmentAvailableTimeUs(long j10, long j11) {
            return this.f108463i.f(j10, j11);
        }

        @Override // x9.f
        public long getSegmentCount(long j10) {
            return this.f108463i.g(j10);
        }

        @Override // x9.f
        public long getSegmentNum(long j10, long j11) {
            return this.f108463i.i(j10, j11);
        }

        @Override // x9.f
        public i getSegmentUrl(long j10) {
            return this.f108463i.k(this, j10);
        }

        @Override // x9.f
        public long getTimeUs(long j10) {
            return this.f108463i.j(j10);
        }

        @Override // x9.f
        public boolean isExplicit() {
            return this.f108463i.l();
        }

        @Override // y9.j
        public x9.f b() {
            return this;
        }
    }
}
