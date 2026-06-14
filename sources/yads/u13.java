package yads;

import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class u13 implements yn2 {
    @Override // yads.yn2
    public final Object a(rn2 rn2Var) {
        byte[] bArr = rn2Var.f115532b.f115885a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, ez0.a(rn2Var.f115533c));
        } catch (Exception unused) {
            return new String(bArr, Charsets.UTF_8);
        }
    }
}
