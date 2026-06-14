package io.bidmachine;

/* JADX INFO: loaded from: classes12.dex */
abstract class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ee.c f82017a;

    public static ee.c a() {
        ee.c aVar;
        ee.c cVar = f82017a;
        if (cVar != null) {
            return cVar;
        }
        synchronized (x2.class) {
            try {
                aVar = f82017a;
                if (aVar == null) {
                    aVar = new ee.a();
                    f82017a = aVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
