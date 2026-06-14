package yads;

import android.widget.ImageView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v21 f113342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f113343b;

    public m70(px2 px2Var, List list) {
        this.f113342a = px2Var;
        this.f113343b = list;
    }

    public final vs a(String str, ImageView imageView) {
        final t21 t21VarA = this.f113342a.a(str, new l70(imageView), 0, 0);
        vs vsVar = new vs() { // from class: yads.gj
            @Override // yads.vs
            public final void cancel() {
                m70.a(t21VarA);
            }
        };
        this.f113343b.add(vsVar);
        return vsVar;
    }

    public static final void a(t21 t21Var) {
        t21Var.a();
    }
}
