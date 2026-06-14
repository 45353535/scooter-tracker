package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bg3 {
    public static int a() {
        Integer num;
        Object obj = vt2.f117186j;
        vt2 vt2VarA = ut2.a();
        synchronized (vt2.f117186j) {
            num = vt2VarA.f117195h;
        }
        if (num != null) {
            return kotlin.ranges.g.n(num.intValue(), 1, 4);
        }
        return 4;
    }
}
