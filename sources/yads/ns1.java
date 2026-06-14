package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ns1 {
    public final os1 a() {
        os1 os1Var;
        os1 os1Var2 = os1.f114408f;
        if (os1Var2 != null) {
            return os1Var2;
        }
        synchronized (this) {
            os1Var = os1.f114408f;
            if (os1Var == null) {
                os1Var = new os1();
                os1.f114408f = os1Var;
            }
        }
        return os1Var;
    }
}
