package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* JADX INFO: loaded from: classes10.dex */
public interface e {

    public static final class a {
        public static /* synthetic */ void a(e eVar, String str, byte[] bArr, ve.g gVar, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPost");
            }
            if ((i10 & 8) != 0) {
                str2 = null;
            }
            eVar.a(str, bArr, gVar, str2);
        }
    }

    void a(String str);

    void a(String str, byte[] bArr, ve.g gVar, String str2);
}
