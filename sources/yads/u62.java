package yads;

import android.util.Base64;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class u62 implements t62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm f116536a;

    public /* synthetic */ u62() {
        this(new zm());
    }

    public final String a(rn2 rn2Var) {
        byte[] bArr = rn2Var.f115532b.f115885a;
        if (bArr == null) {
            return null;
        }
        String strC = ez0.c(rn2Var.f115533c, f01.T);
        if (strC != null && !Boolean.parseBoolean(strC)) {
            return new String(bArr, Charsets.UTF_8);
        }
        this.f116536a.getClass();
        try {
            return new String(Base64.decode(bArr, 0), Charsets.UTF_8);
        } catch (Exception unused) {
            String str = new String(bArr, Charsets.UTF_8);
            boolean z10 = lb1.f113032a;
            return str;
        }
    }

    public u62(zm zmVar) {
        this.f116536a = zmVar;
    }
}
