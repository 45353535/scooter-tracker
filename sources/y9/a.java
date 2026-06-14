package y9;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f108397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f108398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f108399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f108400f;

    public a(long j10, int i10, List list, List list2, List list3, List list4) {
        this.f108395a = j10;
        this.f108396b = i10;
        this.f108397c = DesugarCollections.unmodifiableList(list);
        this.f108398d = DesugarCollections.unmodifiableList(list2);
        this.f108399e = DesugarCollections.unmodifiableList(list3);
        this.f108400f = DesugarCollections.unmodifiableList(list4);
    }
}
