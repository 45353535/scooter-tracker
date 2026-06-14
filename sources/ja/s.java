package ja;

import java.util.List;
import n9.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f85683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f85684j;

    public s(f0 f0Var, int i10, int i11) {
        this(f0Var, i10, i11, 0, null);
    }

    @Override // ja.r
    public int getSelectedIndex() {
        return 0;
    }

    @Override // ja.r
    public Object getSelectionData() {
        return this.f85684j;
    }

    @Override // ja.r
    public int getSelectionReason() {
        return this.f85683i;
    }

    public s(f0 f0Var, int i10, int i11, int i12, Object obj) {
        super(f0Var, new int[]{i10}, i11);
        this.f85683i = i12;
        this.f85684j = obj;
    }

    @Override // ja.r
    public void b(long j10, long j11, long j12, List list, ha.n[] nVarArr) {
    }
}
