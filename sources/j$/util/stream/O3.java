package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class O3 extends AbstractC5695f2 implements X3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f85115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P3 f85116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(P3 p32, InterfaceC5725l2 interfaceC5725l2, boolean z10) {
        super(interfaceC5725l2);
        this.f85116e = p32;
        this.f85115d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.f85114c
            if (r0 != 0) goto L15
            j$.util.stream.P3 r0 = r6.f85116e
            java.util.function.IntPredicate r0 = r0.f85121l
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.f85114c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.f85115d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.f85113b
            r4 = 1
            long r2 = r2 + r4
            r6.f85113b = r2
        L23:
            if (r1 != 0) goto L29
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.stream.l2 r0 = r6.f85261a
            r0.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.O3.accept(int):void");
    }

    @Override // j$.util.stream.X3
    public final long f() {
        return this.f85113b;
    }
}
