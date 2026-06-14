package yads;

import android.content.Context;
import android.location.Location;

/* JADX INFO: loaded from: classes4.dex */
public final class jx0 implements of1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf1 f112491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112492b;

    public /* synthetic */ jx0(Context context, String str) {
        this(new tf1(context, str));
    }

    @Override // yads.of1
    public final Location a() {
        Location location;
        synchronized (this.f112492b) {
            try {
                tf1 tf1Var = this.f112491a;
                sf1 sf1VarA = tf1Var.f116228c;
                if (sf1VarA == null) {
                    sf1VarA = tf1Var.a();
                }
                if (sf1VarA != null) {
                    Object objA = jk2.a(sf1VarA.f115783a, "isComplete", new Object[0]);
                    Boolean bool = objA instanceof Boolean ? (Boolean) objA : null;
                    if (bool != null && bool.booleanValue()) {
                        Object objA2 = jk2.a(sf1VarA.f115783a, "getResult", new Object[0]);
                        location = objA2 instanceof Location ? (Location) objA2 : null;
                        tf1 tf1Var2 = this.f112491a;
                        tf1Var2.f116228c = tf1Var2.a();
                        tf1Var2.f116228c = tf1Var2.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return location;
    }

    public jx0(tf1 tf1Var) {
        this.f112491a = tf1Var;
        this.f112492b = new Object();
    }
}
