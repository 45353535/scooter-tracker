package y9;

import android.net.Uri;
import io.bidmachine.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class c implements fa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f108407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f108408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f108409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f108410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f108411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f108412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f108413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f108414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f108415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f108416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f108417m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f108405a = j10;
        this.f108406b = j11;
        this.f108407c = j12;
        this.f108408d = z10;
        this.f108409e = j13;
        this.f108410f = j14;
        this.f108411g = j15;
        this.f108412h = j16;
        this.f108416l = hVar;
        this.f108413i = oVar;
        this.f108415k = uri;
        this.f108414j = lVar;
        this.f108417m = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList b(List list, LinkedList linkedList) {
        StreamKey streamKey = (StreamKey) linkedList.poll();
        int i10 = streamKey.f80519b;
        ArrayList arrayList = new ArrayList();
        do {
            int i11 = streamKey.f80520c;
            a aVar = (a) list.get(i11);
            List list2 = aVar.f108397c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(streamKey.f80521d));
                streamKey = (StreamKey) linkedList.poll();
                if (streamKey.f80519b != i10) {
                    break;
                }
            } while (streamKey.f80520c == i11);
            arrayList.add(new a(aVar.f108395a, aVar.f108396b, arrayList2, aVar.f108398d, aVar.f108399e, aVar.f108400f));
        } while (streamKey.f80519b == i10);
        linkedList.addFirst(streamKey);
        return arrayList;
    }

    @Override // fa.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c copy(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= d()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f80519b != i10) {
                long jE = e(i10);
                if (jE != -9223372036854775807L) {
                    j10 += jE;
                }
            } else {
                g gVarC = c(i10);
                arrayList.add(new g(gVarC.f108441a, gVarC.f108442b - j10, b(gVarC.f108443c, linkedList), gVarC.f108444d));
            }
            i10++;
        }
        long j11 = this.f108406b;
        return new c(this.f108405a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f108407c, this.f108408d, this.f108409e, this.f108410f, this.f108411g, this.f108412h, this.f108416l, this.f108413i, this.f108414j, this.f108415k, arrayList);
    }

    public final g c(int i10) {
        return (g) this.f108417m.get(i10);
    }

    public final int d() {
        return this.f108417m.size();
    }

    public final long e(int i10) {
        long j10;
        long j11;
        if (i10 == this.f108417m.size() - 1) {
            j10 = this.f108406b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((g) this.f108417m.get(i10)).f108442b;
        } else {
            j10 = ((g) this.f108417m.get(i10 + 1)).f108442b;
            j11 = ((g) this.f108417m.get(i10)).f108442b;
        }
        return j10 - j11;
    }

    public final long f(int i10) {
        return o0.P0(e(i10));
    }
}
