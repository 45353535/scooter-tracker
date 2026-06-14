package ad;

import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f4233b;

    public a(List initial) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        this.f4232a = initial;
        this.f4233b = new HashSet(initial);
    }

    private final void b(String str) {
        if (this.f4233b.contains(str)) {
            return;
        }
        this.f4233b.add(str);
    }

    private final void c(String str) {
        if (StringsKt.a0(str, C4240b4.j.f42670c, false, 2, null)) {
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            b(strSubstring);
        } else if (StringsKt.a0(str, "!", false, 2, null)) {
            String strSubstring2 = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            e(strSubstring2);
        }
    }

    private final void e(String str) {
        if (Intrinsics.areEqual(str, "default")) {
            return;
        }
        this.f4233b.remove(str);
    }

    @Override // ad.b
    public boolean a(List stateGroups) {
        boolean z10;
        Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
        synchronized (this.f4233b) {
            if (stateGroups.isEmpty()) {
                z10 = true;
                break;
            }
            if (!stateGroups.isEmpty()) {
                Iterator it = stateGroups.iterator();
                while (it.hasNext()) {
                    if (d((String) it.next())) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "stateGroup"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.HashSet r0 = r2.f4233b
            monitor-enter(r0)
            java.lang.String r1 = "default"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            java.util.HashSet r1 = r2.f4233b     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L19
            goto L1d
        L19:
            r3 = 0
            goto L1e
        L1b:
            r3 = move-exception
            goto L20
        L1d:
            r3 = 1
        L1e:
            monitor-exit(r0)
            return r3
        L20:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.a.d(java.lang.String):boolean");
    }

    @Override // ad.b
    public void a(String stateGroups) {
        Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
        synchronized (this.f4233b) {
            try {
                List listSplit$default = StringsKt.split$default(stateGroups, new String[]{" "}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.v1((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!StringsKt.y0((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c((String) it2.next());
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
