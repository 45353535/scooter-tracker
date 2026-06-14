package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class iz2 implements me1 {
    @Override // yads.me1
    public final void a() {
        synchronized (jz2.f112522a) {
            Object obj = jz2.f112523b;
            synchronized (obj) {
                if (jz2.f112524c) {
                    return;
                }
                long jA = jz2.a();
                synchronized (obj) {
                    jz2.f112525d = jA;
                    jz2.f112524c = true;
                }
            }
        }
    }

    @Override // yads.me1
    public final void b() {
    }
}
