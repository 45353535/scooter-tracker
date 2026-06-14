package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j5 {
    public static long a(wb0 wb0Var) {
        byte[] bArr = (byte[]) wb0Var.f117385b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
