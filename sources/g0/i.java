package g0;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public class i extends r0.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f72066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r0.a f72067r;

    public i(d0.i iVar, r0.a aVar) {
        super(iVar, (PointF) aVar.f99186b, (PointF) aVar.f99187c, aVar.f99188d, aVar.f99189e, aVar.f99190f, aVar.f99191g, aVar.f99192h);
        this.f72067r = aVar;
        j();
    }

    public void j() {
        Object obj;
        Object obj2;
        Object obj3 = this.f99187c;
        boolean z10 = (obj3 == null || (obj2 = this.f99186b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.f99186b;
        if (obj4 == null || (obj = this.f99187c) == null || z10) {
            return;
        }
        r0.a aVar = this.f72067r;
        this.f72066q = q0.p.d((PointF) obj4, (PointF) obj, aVar.f99199o, aVar.f99200p);
    }

    Path k() {
        return this.f72066q;
    }
}
