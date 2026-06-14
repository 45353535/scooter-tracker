package y9;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f108443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f108444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f108445e;

    public g(String str, long j10, List list, List list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f108443c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) this.f108443c.get(i11)).f108396b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List list, List list2, e eVar) {
        this.f108441a = str;
        this.f108442b = j10;
        this.f108443c = DesugarCollections.unmodifiableList(list);
        this.f108444d = DesugarCollections.unmodifiableList(list2);
        this.f108445e = eVar;
    }
}
