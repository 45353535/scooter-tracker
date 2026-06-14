package lb;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f94092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f94094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94095d;

    public e(List list, long j10, long j11) {
        this.f94092a = ImmutableList.copyOf((Collection) list);
        this.f94093b = j10;
        this.f94094c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f94095d = j12;
    }
}
