package yads;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yd2 implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa f118162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f118163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu f118164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy1 f118165d;

    public yd2(xa xaVar, List list, vu vuVar, gy1 gy1Var) {
        this.f118162a = xaVar;
        this.f118163b = list;
        this.f118164c = vuVar;
        this.f118165d = gy1Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f118163b.size()) {
            return true;
        }
        this.f118162a.a(((qs0) this.f118163b.get(itemId)).f115143b, x53.f117713c);
        vu vuVar = this.f118164c;
        xl2 xl2Var = xl2.f117884u;
        vuVar.getClass();
        vuVar.f117202d.a(vuVar.a(xl2Var, new HashMap()));
        this.f118165d.f111398a.a();
        return true;
    }
}
