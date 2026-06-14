package db;

import com.google.common.collect.ComparisonChain;
import db.c;
import j$.util.Objects;
import java.util.Comparator;
import java.util.List;
import n9.t;
import n9.u;
import n9.v;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68608a;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator f68609d = new Comparator() { // from class: db.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.a aVar = (c.a) obj;
                c.a aVar2 = (c.a) obj2;
                return ComparisonChain.start().compare(aVar.f68610a, aVar2.f68610a).compare(aVar.f68611b, aVar2.f68611b).compare(aVar.f68612c, aVar2.f68612c).result();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f68610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f68611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68612c;

        public a(long j10, long j11, int i10) {
            q9.a.a(j10 < j11);
            this.f68610a = j10;
            this.f68611b = j11;
            this.f68612c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f68610a == aVar.f68610a && this.f68611b == aVar.f68611b && this.f68612c == aVar.f68612c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f68610a), Long.valueOf(this.f68611b), Integer.valueOf(this.f68612c));
        }

        public String toString() {
            return o0.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f68610a), Long.valueOf(this.f68611b), Integer.valueOf(this.f68612c));
        }
    }

    public c(List list) {
        this.f68608a = list;
        q9.a.a(!b(list));
    }

    private static boolean b(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((a) list.get(0)).f68611b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((a) list.get(i10)).f68610a < j10) {
                return true;
            }
            j10 = ((a) list.get(i10)).f68611b;
        }
        return false;
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f68608a.equals(((c) obj).f68608a);
    }

    @Override // n9.v.a
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return u.a(this);
    }

    @Override // n9.v.a
    public /* synthetic */ io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        return u.b(this);
    }

    public int hashCode() {
        return this.f68608a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f68608a;
    }
}
