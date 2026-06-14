package ba;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h implements fa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6087c;

    protected h(String str, List list, boolean z10) {
        this.f6085a = str;
        this.f6086b = DesugarCollections.unmodifiableList(list);
        this.f6087c = z10;
    }
}
