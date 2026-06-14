package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f117770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f117771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f117772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f117773f;

    public xb(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f117768a = i10;
        this.f117769b = i11;
        this.f117770c = DesugarCollections.unmodifiableList(arrayList);
        this.f117771d = DesugarCollections.unmodifiableList(list);
        this.f117772e = DesugarCollections.unmodifiableList(list2);
        this.f117773f = DesugarCollections.unmodifiableList(list3);
    }
}
