package yads;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ez1 implements m31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz1 f110531a;

    public ez1(fz1 fz1Var) {
        this.f110531a = fz1Var;
    }

    @Override // yads.m31
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.m31
    public final void a(Map map) {
        this.f110531a.f110986b.f111585b.putAll(map);
        this.f110531a.f110987c.a();
        Iterator it = this.f110531a.f110991g.iterator();
        if (it.hasNext()) {
            androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
            throw null;
        }
    }
}
