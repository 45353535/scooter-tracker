package yads;

import android.view.View;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class a02 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f108504b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a02 f108505c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f108506a;

    public a02(Map map) {
        this.f108506a = map;
    }

    public final void a(View view, d22 d22Var) {
        synchronized (f108504b) {
            this.f108506a.put(view, d22Var);
            Unit unit = Unit.f93236a;
        }
    }
}
