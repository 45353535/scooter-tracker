package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k82 f117943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f117944b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f117945c = new ArrayList();

    public xr3(Context context) {
        this.f117943a = k82.f112642g.a(context);
    }

    public final void a(za3 za3Var) {
        synchronized (this.f117944b) {
            this.f117945c.add(za3Var);
            this.f117943a.b(za3Var);
            Unit unit = Unit.f93236a;
        }
    }
}
