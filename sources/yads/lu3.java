package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lu3 {
    public static void a(dt3 dt3Var) {
        if (!dt3Var.f110066f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (dt3Var.f110067g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
