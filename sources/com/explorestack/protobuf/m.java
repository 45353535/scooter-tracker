package com.explorestack.protobuf;

import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.z2;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class m implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f19220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19223d = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19224a;

        static {
            int[] iArr = new int[z2.b.values().length];
            f19224a = iArr;
            try {
                iArr[z2.b.f19480k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19224a[z2.b.f19484o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19224a[z2.b.f19473d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19224a[z2.b.f19486q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19224a[z2.b.f19479j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19224a[z2.b.f19478i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19224a[z2.b.f19474e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19224a[z2.b.f19477h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19224a[z2.b.f19475f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19224a[z2.b.f19483n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19224a[z2.b.f19487r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19224a[z2.b.f19488s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19224a[z2.b.f19489t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19224a[z2.b.f19490u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19224a[z2.b.f19481l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19224a[z2.b.f19485p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19224a[z2.b.f19476g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private m(l lVar) {
        l lVar2 = (l) j0.b(lVar, "input");
        this.f19220a = lVar2;
        lVar2.f19149d = this;
    }

    public static m f(l lVar) {
        m mVar = lVar.f19149d;
        return mVar != null ? mVar : new m(lVar);
    }

    private Object g(z2.b bVar, Class cls, w wVar) {
        switch (a.f19224a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return j(cls, wVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object h(x1 x1Var, w wVar) {
        int i10 = this.f19222c;
        this.f19222c = z2.c(z2.a(this.f19221b), 4);
        try {
            Object objNewInstance = x1Var.newInstance();
            x1Var.a(objNewInstance, this, wVar);
            x1Var.makeImmutable(objNewInstance);
            if (this.f19221b == this.f19222c) {
                return objNewInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f19222c = i10;
        }
    }

    private Object i(x1 x1Var, w wVar) throws InvalidProtocolBufferException {
        int iL = this.f19220a.L();
        l lVar = this.f19220a;
        if (lVar.f19146a >= lVar.f19147b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iP = lVar.p(iL);
        Object objNewInstance = x1Var.newInstance();
        this.f19220a.f19146a++;
        x1Var.a(objNewInstance, this, wVar);
        x1Var.makeImmutable(objNewInstance);
        this.f19220a.a(0);
        r5.f19146a--;
        this.f19220a.o(iP);
        return objNewInstance;
    }

    private void l(int i10) throws InvalidProtocolBufferException {
        if (this.f19220a.e() != i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void m(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (z2.b(this.f19221b) != i10) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void n(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void o(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.explorestack.protobuf.u1
    public void a(List list, x1 x1Var, w wVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iK;
        if (z2.b(this.f19221b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i10 = this.f19221b;
        do {
            list.add(i(x1Var, wVar));
            if (this.f19220a.f() || this.f19223d != 0) {
                return;
            } else {
                iK = this.f19220a.K();
            }
        } while (iK == i10);
        this.f19223d = iK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f19220a.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // com.explorestack.protobuf.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.Map r8, com.explorestack.protobuf.v0.b r9, com.explorestack.protobuf.w r10) throws com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r7 = this;
            r0 = 2
            r7.m(r0)
            com.explorestack.protobuf.l r1 = r7.f19220a
            int r1 = r1.L()
            com.explorestack.protobuf.l r2 = r7.f19220a
            int r1 = r2.p(r1)
            java.lang.Object r2 = r9.f19371b
            java.lang.Object r3 = r9.f19373d
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.explorestack.protobuf.l r5 = r7.f19220a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.explorestack.protobuf.InvalidProtocolBufferException r4 = new com.explorestack.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.explorestack.protobuf.z2$b r4 = r9.f19372c     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.f19373d     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.g(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            com.explorestack.protobuf.z2$b r4 = r9.f19370a     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.g(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.explorestack.protobuf.InvalidProtocolBufferException r8 = new com.explorestack.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.explorestack.protobuf.l r8 = r7.f19220a
            r8.o(r1)
            return
        L67:
            com.explorestack.protobuf.l r9 = r7.f19220a
            r9.o(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.m.b(java.util.Map, com.explorestack.protobuf.v0$b, com.explorestack.protobuf.w):void");
    }

    @Override // com.explorestack.protobuf.u1
    public Object c(x1 x1Var, w wVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return i(x1Var, wVar);
    }

    @Override // com.explorestack.protobuf.u1
    public void d(List list, x1 x1Var, w wVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iK;
        if (z2.b(this.f19221b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i10 = this.f19221b;
        do {
            list.add(h(x1Var, wVar));
            if (this.f19220a.f() || this.f19223d != 0) {
                return;
            } else {
                iK = this.f19220a.K();
            }
        } while (iK == i10);
        this.f19223d = iK;
    }

    @Override // com.explorestack.protobuf.u1
    public Object e(x1 x1Var, w wVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(3);
        return h(x1Var, wVar);
    }

    @Override // com.explorestack.protobuf.u1
    public int getFieldNumber() {
        int i10 = this.f19223d;
        if (i10 != 0) {
            this.f19221b = i10;
            this.f19223d = 0;
        } else {
            this.f19221b = this.f19220a.K();
        }
        int i11 = this.f19221b;
        if (i11 == 0 || i11 == this.f19222c) {
            return Integer.MAX_VALUE;
        }
        return z2.a(i11);
    }

    @Override // com.explorestack.protobuf.u1
    public int getTag() {
        return this.f19221b;
    }

    public Object j(Class cls, w wVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return i(s1.a().c(cls), wVar);
    }

    public void k(List list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iK;
        int iK2;
        if (z2.b(this.f19221b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof p0) || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK = this.f19220a.K();
                }
            } while (iK == this.f19221b);
            this.f19223d = iK;
            return;
        }
        p0 p0Var = (p0) list;
        do {
            p0Var.c(readBytes());
            if (this.f19220a.f()) {
                return;
            } else {
                iK2 = this.f19220a.K();
            }
        } while (iK2 == this.f19221b);
        this.f19223d = iK2;
    }

    @Override // com.explorestack.protobuf.u1
    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.q();
    }

    @Override // com.explorestack.protobuf.u1
    public void readBoolList(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof h)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f19220a.q()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Boolean.valueOf(this.f19220a.q()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        h hVar = (h) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                hVar.addBoolean(this.f19220a.q());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            hVar.addBoolean(this.f19220a.q());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public ByteString readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f19220a.r();
    }

    @Override // com.explorestack.protobuf.u1
    public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iK;
        if (z2.b(this.f19221b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f19220a.f()) {
                return;
            } else {
                iK = this.f19220a.K();
            }
        } while (iK == this.f19221b);
        this.f19223d = iK;
    }

    @Override // com.explorestack.protobuf.u1
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f19220a.s();
    }

    @Override // com.explorestack.protobuf.u1
    public void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof p)) {
            int iB = z2.b(this.f19221b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f19220a.s()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iL = this.f19220a.L();
            o(iL);
            int iE = this.f19220a.e() + iL;
            do {
                list.add(Double.valueOf(this.f19220a.s()));
            } while (this.f19220a.e() < iE);
            return;
        }
        p pVar = (p) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 1) {
            do {
                pVar.addDouble(this.f19220a.s());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iL2 = this.f19220a.L();
        o(iL2);
        int iE2 = this.f19220a.e() + iL2;
        do {
            pVar.addDouble(this.f19220a.s());
        } while (this.f19220a.e() < iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.t();
    }

    @Override // com.explorestack.protobuf.u1
    public void readEnumList(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof i0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19220a.t()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Integer.valueOf(this.f19220a.t()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                i0Var.addInt(this.f19220a.t());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            i0Var.addInt(this.f19220a.t());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f19220a.u();
    }

    @Override // com.explorestack.protobuf.u1
    public void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof i0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 2) {
                int iL = this.f19220a.L();
                n(iL);
                int iE = this.f19220a.e() + iL;
                do {
                    list.add(Integer.valueOf(this.f19220a.u()));
                } while (this.f19220a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f19220a.u()));
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK = this.f19220a.K();
                }
            } while (iK == this.f19221b);
            this.f19223d = iK;
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 2) {
            int iL2 = this.f19220a.L();
            n(iL2);
            int iE2 = this.f19220a.e() + iL2;
            do {
                i0Var.addInt(this.f19220a.u());
            } while (this.f19220a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            i0Var.addInt(this.f19220a.u());
            if (this.f19220a.f()) {
                return;
            } else {
                iK2 = this.f19220a.K();
            }
        } while (iK2 == this.f19221b);
        this.f19223d = iK2;
    }

    @Override // com.explorestack.protobuf.u1
    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f19220a.v();
    }

    @Override // com.explorestack.protobuf.u1
    public void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof s0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f19220a.v()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iL = this.f19220a.L();
            o(iL);
            int iE = this.f19220a.e() + iL;
            do {
                list.add(Long.valueOf(this.f19220a.v()));
            } while (this.f19220a.e() < iE);
            return;
        }
        s0 s0Var = (s0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 1) {
            do {
                s0Var.addLong(this.f19220a.v());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iL2 = this.f19220a.L();
        o(iL2);
        int iE2 = this.f19220a.e() + iL2;
        do {
            s0Var.addLong(this.f19220a.v());
        } while (this.f19220a.e() < iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f19220a.w();
    }

    @Override // com.explorestack.protobuf.u1
    public void readFloatList(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof e0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 2) {
                int iL = this.f19220a.L();
                n(iL);
                int iE = this.f19220a.e() + iL;
                do {
                    list.add(Float.valueOf(this.f19220a.w()));
                } while (this.f19220a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f19220a.w()));
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK = this.f19220a.K();
                }
            } while (iK == this.f19221b);
            this.f19223d = iK;
            return;
        }
        e0 e0Var = (e0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 2) {
            int iL2 = this.f19220a.L();
            n(iL2);
            int iE2 = this.f19220a.e() + iL2;
            do {
                e0Var.addFloat(this.f19220a.w());
            } while (this.f19220a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            e0Var.addFloat(this.f19220a.w());
            if (this.f19220a.f()) {
                return;
            } else {
                iK2 = this.f19220a.K();
            }
        } while (iK2 == this.f19221b);
        this.f19223d = iK2;
    }

    @Override // com.explorestack.protobuf.u1
    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.y();
    }

    @Override // com.explorestack.protobuf.u1
    public void readInt32List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof i0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19220a.y()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Integer.valueOf(this.f19220a.y()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                i0Var.addInt(this.f19220a.y());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            i0Var.addInt(this.f19220a.y());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.z();
    }

    @Override // com.explorestack.protobuf.u1
    public void readInt64List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof s0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f19220a.z()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Long.valueOf(this.f19220a.z()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        s0 s0Var = (s0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                s0Var.addLong(this.f19220a.z());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            s0Var.addLong(this.f19220a.z());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f19220a.E();
    }

    @Override // com.explorestack.protobuf.u1
    public void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof i0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 2) {
                int iL = this.f19220a.L();
                n(iL);
                int iE = this.f19220a.e() + iL;
                do {
                    list.add(Integer.valueOf(this.f19220a.E()));
                } while (this.f19220a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f19220a.E()));
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK = this.f19220a.K();
                }
            } while (iK == this.f19221b);
            this.f19223d = iK;
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 2) {
            int iL2 = this.f19220a.L();
            n(iL2);
            int iE2 = this.f19220a.e() + iL2;
            do {
                i0Var.addInt(this.f19220a.E());
            } while (this.f19220a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            i0Var.addInt(this.f19220a.E());
            if (this.f19220a.f()) {
                return;
            } else {
                iK2 = this.f19220a.K();
            }
        } while (iK2 == this.f19221b);
        this.f19223d = iK2;
    }

    @Override // com.explorestack.protobuf.u1
    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f19220a.F();
    }

    @Override // com.explorestack.protobuf.u1
    public void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof s0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f19220a.F()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iL = this.f19220a.L();
            o(iL);
            int iE = this.f19220a.e() + iL;
            do {
                list.add(Long.valueOf(this.f19220a.F()));
            } while (this.f19220a.e() < iE);
            return;
        }
        s0 s0Var = (s0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 1) {
            do {
                s0Var.addLong(this.f19220a.F());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iL2 = this.f19220a.L();
        o(iL2);
        int iE2 = this.f19220a.e() + iL2;
        do {
            s0Var.addLong(this.f19220a.F());
        } while (this.f19220a.e() < iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.G();
    }

    @Override // com.explorestack.protobuf.u1
    public void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof i0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19220a.G()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Integer.valueOf(this.f19220a.G()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                i0Var.addInt(this.f19220a.G());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            i0Var.addInt(this.f19220a.G());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.H();
    }

    @Override // com.explorestack.protobuf.u1
    public void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof s0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f19220a.H()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Long.valueOf(this.f19220a.H()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        s0 s0Var = (s0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                s0Var.addLong(this.f19220a.H());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            s0Var.addLong(this.f19220a.H());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f19220a.I();
    }

    @Override // com.explorestack.protobuf.u1
    public void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(list, false);
    }

    @Override // com.explorestack.protobuf.u1
    public void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(list, true);
    }

    @Override // com.explorestack.protobuf.u1
    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f19220a.J();
    }

    @Override // com.explorestack.protobuf.u1
    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.L();
    }

    @Override // com.explorestack.protobuf.u1
    public void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof i0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19220a.L()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Integer.valueOf(this.f19220a.L()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                i0Var.addInt(this.f19220a.L());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            i0Var.addInt(this.f19220a.L());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f19220a.M();
    }

    @Override // com.explorestack.protobuf.u1
    public void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iK;
        int iK2;
        if (!(list instanceof s0)) {
            int iB = z2.b(this.f19221b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f19220a.M()));
                    if (this.f19220a.f()) {
                        return;
                    } else {
                        iK = this.f19220a.K();
                    }
                } while (iK == this.f19221b);
                this.f19223d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f19220a.e() + this.f19220a.L();
            do {
                list.add(Long.valueOf(this.f19220a.M()));
            } while (this.f19220a.e() < iE);
            l(iE);
            return;
        }
        s0 s0Var = (s0) list;
        int iB2 = z2.b(this.f19221b);
        if (iB2 == 0) {
            do {
                s0Var.addLong(this.f19220a.M());
                if (this.f19220a.f()) {
                    return;
                } else {
                    iK2 = this.f19220a.K();
                }
            } while (iK2 == this.f19221b);
            this.f19223d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f19220a.e() + this.f19220a.L();
        do {
            s0Var.addLong(this.f19220a.M());
        } while (this.f19220a.e() < iE2);
        l(iE2);
    }

    @Override // com.explorestack.protobuf.u1
    public boolean skipField() {
        int i10;
        if (this.f19220a.f() || (i10 = this.f19221b) == this.f19222c) {
            return false;
        }
        return this.f19220a.O(i10);
    }
}
