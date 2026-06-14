package com.my.target;

import android.content.Context;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements Menu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59549a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f59550b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f59551c;

    @Override // com.my.target.common.menu.Menu
    public void addAction(MenuAction menuAction) {
        this.f59549a.add(menuAction);
    }

    @Override // com.my.target.common.menu.Menu
    public void dismiss() {
        WeakReference weakReference = this.f59551c;
        if (weakReference == null) {
            gb.a("AdChoicesOptionMenu: can't dismiss not existing view");
            return;
        }
        g gVar = (g) weakReference.get();
        if (gVar == null) {
            gb.a("AdChoicesOptionMenu: can't dismiss not existing or garbage-collected view");
        } else {
            gVar.a();
        }
    }

    @Override // com.my.target.common.menu.Menu
    public void present(Context context) {
        if (this.f59549a.isEmpty()) {
            gb.a("AdChoicesOptionMenu: there are no actions, can't present.");
        } else {
            if (this.f59550b == null) {
                gb.a("AdChoicesOptionMenu: there is no listener, can't present");
                return;
            }
            g gVar = new g(context, this.f59549a, this.f59550b);
            this.f59551c = new WeakReference(gVar);
            gVar.b();
        }
    }

    @Override // com.my.target.common.menu.Menu
    public void setListener(Menu.Listener listener) {
        this.f59550b = new WeakReference(listener);
    }
}
