package com.my.tracker.obfuscated;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f61793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e2 f61794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e2[] f61795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v[] f61796d;

    public q2(long j10, e2 e2Var, e2[] e2VarArr, v[] vVarArr) {
        this.f61793a = j10;
        this.f61794b = e2Var;
        this.f61795c = e2VarArr;
        this.f61796d = vVarArr;
    }

    public e2 a() {
        return this.f61794b;
    }

    public v[] b() {
        return this.f61796d;
    }

    public long c() {
        return this.f61793a;
    }

    public e2[] d() {
        return this.f61795c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f61794b != null) {
            sb2.append("|-----\n");
            sb2.append("| ");
            sb2.append(this.f61794b);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        e2[] e2VarArr = this.f61795c;
        if (e2VarArr != null && e2VarArr.length > 0) {
            sb2.append("|-----\n");
            for (e2 e2Var : this.f61795c) {
                sb2.append("| ");
                sb2.append(e2Var);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        v[] vVarArr = this.f61796d;
        if (vVarArr != null && vVarArr.length > 0) {
            sb3.append("|-----\n");
            for (v vVar : this.f61796d) {
                sb3.append("| ");
                sb3.append(vVar);
                sb3.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return "[TimeSpentTickDTO]\n| timestamp = " + this.f61793a + IOUtils.LINE_SEPARATOR_UNIX + ((Object) sb2) + ((Object) sb3) + "[/TimeSpentTickDTO]\n";
    }
}
