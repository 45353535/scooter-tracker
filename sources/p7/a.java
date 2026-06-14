package p7;

import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static void a(DivBorderSupports divBorderSupports) {
        DivBorderDrawer divBorderDrawer = divBorderSupports.getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.invalidateBorder();
        }
    }

    public static void b(DivBorderSupports divBorderSupports, int i10, int i11) {
        DivBorderDrawer divBorderDrawer = divBorderSupports.getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.onBoundsChanged(i10, i11);
        }
    }

    public static void c(DivBorderSupports divBorderSupports) {
        DivBorderDrawer divBorderDrawer = divBorderSupports.getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.release();
        }
    }
}
