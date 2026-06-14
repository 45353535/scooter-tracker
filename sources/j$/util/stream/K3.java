package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class K3 extends AbstractC5705h2 implements X3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f85078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L3 f85079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3(L3 l32, InterfaceC5725l2 interfaceC5725l2, boolean z10) {
        super(interfaceC5725l2);
        this.f85079e = l32;
        this.f85078d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.f85077c
            if (r0 != 0) goto L15
            j$.util.stream.L3 r0 = r6.f85079e
            java.util.function.Predicate r0 = r0.f85088m
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.f85077c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.f85078d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.f85076b
            r4 = 1
            long r2 = r2 + r4
            r6.f85076b = r2
        L23:
            if (r1 != 0) goto L29
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.stream.l2 r0 = r6.f85274a
            r0.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.K3.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.X3
    public final long f() {
        return this.f85076b;
    }
}
