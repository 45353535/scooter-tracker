package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rw2 extends mw2 implements e23 {
    public rw2() {
        super(new i23[2], new j23[2]);
        g();
    }

    public abstract d23 a(byte[] bArr, int i10, boolean z10);

    @Override // yads.e23
    public final void a(long j10) {
    }

    @Override // yads.mw2
    public final i23 c() {
        return new i23();
    }

    @Override // yads.mw2
    public final qw2 d() {
        return new qw2(this);
    }

    @Override // yads.mw2
    public final f23 a(fa0 fa0Var, ha0 ha0Var, boolean z10) {
        i23 i23Var = (i23) fa0Var;
        j23 j23Var = (j23) ha0Var;
        try {
            ByteBuffer byteBuffer = i23Var.f110670d;
            byteBuffer.getClass();
            d23 d23VarA = a(byteBuffer.array(), byteBuffer.limit(), z10);
            long j10 = i23Var.f110672f;
            long j11 = i23Var.f111848j;
            j23Var.f111527c = j10;
            j23Var.f112227d = d23VarA;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            j23Var.f112228e = j10;
            j23Var.f112430b &= Integer.MAX_VALUE;
            return null;
        } catch (f23 e10) {
            return e10;
        }
    }
}
