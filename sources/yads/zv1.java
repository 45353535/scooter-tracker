package yads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zv1 extends dw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f118846a;

    public zv1(l62 l62Var) {
        this.f118846a = l62Var;
    }

    @Override // yads.dw1
    public final Map b() {
        return new TreeMap(this.f118846a);
    }
}
