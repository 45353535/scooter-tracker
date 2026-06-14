package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.my.target.c;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import com.my.target.common.menu.MenuActionType;
import com.my.target.common.menu.MenuFactory;
import com.my.target.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements Menu.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuFactory f59604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f59605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Menu f59606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d.a f59607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f59608f;

    public f(List list, MenuFactory menuFactory) {
        this.f59603a = list;
        this.f59604b = menuFactory;
    }

    public static f a(List list, MenuFactory menuFactory) {
        return new f(list, menuFactory);
    }

    public boolean b() {
        return this.f59606d != null;
    }

    @Override // com.my.target.common.menu.Menu.Listener
    public void onActionClick(MenuAction menuAction) {
        d.a aVar;
        if (menuAction.style == 1) {
            a();
            return;
        }
        WeakReference weakReference = this.f59608f;
        if (weakReference == null) {
            gb.a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            gb.a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Map map = this.f59605c;
        if (map == null) {
            gb.a("AdChoicesOptionsController: there are no associatedOptions, can't process action click");
            return;
        }
        c.a aVar2 = (c.a) map.get(menuAction);
        if (aVar2 == null) {
            gb.a("AdChoicesOptionsController: can't obtain option by menu action.");
            return;
        }
        String str = aVar2.f59312c;
        if (!TextUtils.isEmpty(str)) {
            bb.c(str, context);
        }
        if (aVar2.f59311b.equals(MenuActionType.COPY)) {
            String str2 = aVar2.f59314e;
            if (str2 != null) {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str2));
            }
            a();
            return;
        }
        String str3 = aVar2.f59313d;
        if (!TextUtils.isEmpty(str3)) {
            y3.a(str3, context);
        }
        if (aVar2.f59316g && (aVar = this.f59607e) != null) {
            aVar.a(context);
        }
        a();
    }

    public void a(Context context) {
        if (this.f59603a.size() == 0) {
            return;
        }
        Menu menuCreateMenu = this.f59604b.createMenu();
        this.f59606d = menuCreateMenu;
        this.f59608f = new WeakReference(context);
        if (this.f59605c == null) {
            this.f59605c = new HashMap();
        }
        for (c.a aVar : this.f59603a) {
            MenuAction menuAction = new MenuAction(aVar.f59310a, 0, aVar.f59311b, aVar.f59315f);
            menuCreateMenu.addAction(menuAction);
            this.f59605c.put(menuAction, aVar);
        }
        menuCreateMenu.addAction(new MenuAction("", 1, MenuActionType.CANCEL, null));
        menuCreateMenu.setListener(this);
        menuCreateMenu.present(context);
    }

    public void a(d.a aVar) {
        this.f59607e = aVar;
    }

    public final void a() {
        Menu menu = this.f59606d;
        if (menu == null) {
            return;
        }
        menu.dismiss();
        this.f59606d = null;
        this.f59605c = null;
    }
}
