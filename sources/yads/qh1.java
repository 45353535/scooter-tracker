package yads;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class qh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df1 f114998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f114999b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f115000c;

    public qh1(df1 df1Var) {
        this.f114998a = df1Var;
    }

    public final String a() {
        String str;
        synchronized (this.f114999b) {
            try {
                if (this.f115000c == null) {
                    this.f115000c = ((ff1) this.f114998a).c("YmadMauid");
                }
                str = this.f115000c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final void a(String str) {
        synchronized (this.f114999b) {
            this.f115000c = str;
            ((ff1) this.f114998a).a("YmadMauid", str);
            Unit unit = Unit.f93236a;
        }
    }
}
