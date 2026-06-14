package g0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l0.d f72062i;

    public e(List list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            l0.d dVar = (l0.d) ((r0.a) list.get(i10)).f99186b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f72062i = new l0.d(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public l0.d i(r0.a aVar, float f10) {
        this.f72062i.g((l0.d) aVar.f99186b, (l0.d) aVar.f99187c, f10);
        return this.f72062i;
    }
}
