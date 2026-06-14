package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f65176a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf f65177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f65178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f65179d;

    public r0(vf vfVar) {
        this.f65177b = vfVar;
    }

    public final boolean a(String str, String str2) {
        boolean z10;
        if (str != null) {
            str = str.trim();
            if (str.isEmpty()) {
                str = null;
            }
        }
        if (str2 != null) {
            str2 = str2.trim();
            if (str2.isEmpty()) {
                str2 = null;
            }
        }
        synchronized (this.f65176a) {
            try {
                z10 = (vi.a((Object) this.f65178c, (Object) str) && vi.a((Object) this.f65179d, (Object) str2)) ? false : true;
                this.f65178c = str;
                this.f65179d = str2;
                uf ufVarEdit = this.f65177b.edit();
                ufVarEdit.a("c88d4eab540fab77", str);
                ufVarEdit.f65346a.putString("c88d4eab540fab77", str);
                ufVarEdit.a("2696a7f502faed4b", str2);
                ufVarEdit.f65346a.putString("2696a7f502faed4b", str2);
                ufVarEdit.f65346a.commit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final String a() {
        String string;
        String str = this.f65179d;
        if (str != null) {
            return str;
        }
        synchronized (this.f65176a) {
            try {
                string = this.f65179d;
                if (string == null && (string = this.f65177b.getString("2696a7f502faed4b", null)) == null) {
                    string = this.f65177b.getString("31721150b470a3b9", null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
