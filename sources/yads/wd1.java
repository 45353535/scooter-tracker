package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wd1 implements nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y31 f117434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117435b;

    public wd1(int i10, nk2 nk2Var) {
        this.f117435b = i10;
        this.f117434a = nk2Var;
    }

    public final nl a(Class cls) {
        v31 v31VarListIterator = this.f117434a.listIterator(0);
        while (v31VarListIterator.hasNext()) {
            nl nlVar = (nl) v31VarListIterator.next();
            if (nlVar.getClass() == cls) {
                return nlVar;
            }
        }
        return null;
    }

    @Override // yads.nl
    public final int getType() {
        return this.f117435b;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.wd1 a(int r20, yads.w92 r21) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wd1.a(int, yads.w92):yads.wd1");
    }
}
