package yads;

import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class ny2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f114125h = new Comparator() { // from class: yads.cz
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ny2.a((my2) obj, (my2) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f114126i = new Comparator() { // from class: yads.kz
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((my2) obj).f113657c, ((my2) obj2).f113657c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114127a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114133g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final my2[] f114129c = new my2[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f114128b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114130d = -1;

    public ny2(int i10) {
        this.f114127a = i10;
    }

    public static /* synthetic */ int a(my2 my2Var, my2 my2Var2) {
        return my2Var.f113655a - my2Var2.f113655a;
    }
}
