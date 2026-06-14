package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
abstract class q2 {
    q2() {
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, ByteString byteString);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    final void k(Object obj, u1 u1Var) {
        while (u1Var.getFieldNumber() != Integer.MAX_VALUE && l(obj, u1Var)) {
        }
    }

    final boolean l(Object obj, u1 u1Var) throws InvalidProtocolBufferException {
        int tag = u1Var.getTag();
        int iA = z2.a(tag);
        int iB = z2.b(tag);
        if (iB == 0) {
            e(obj, iA, u1Var.readInt64());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, u1Var.readFixed64());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, u1Var.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a(obj, iA, u1Var.readFixed32());
            return true;
        }
        Object objM = m();
        int iC = z2.c(iA, 4);
        k(objM, u1Var);
        if (iC != u1Var.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(obj, iA, p(objM));
        return true;
    }

    abstract Object m();

    abstract void n(Object obj, Object obj2);

    abstract boolean o(u1 u1Var);

    abstract Object p(Object obj);
}
