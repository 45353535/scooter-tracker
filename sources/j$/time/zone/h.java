package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f84768a;

    public h(ArrayList arrayList) {
        this.f84768a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                i iVar = (i) i.class.cast(Class.forName(property, true, i.class.getClassLoader()).newInstance());
                i.b(iVar);
                this.f84768a.add(iVar);
                return null;
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }
        i.b(new i());
        return null;
    }
}
