package yads;

import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yv2 {
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vv2 a(Set set, je2 je2Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof vv2) {
                vv2 vv2Var = (vv2) sortedSet;
                je2 je2Var2 = vv2Var.f117212c;
                je2Var2.getClass();
                je2Var.getClass();
                return new wv2((SortedSet) vv2Var.f117211b, new ke2(Arrays.asList(je2Var2, je2Var)));
            }
            sortedSet.getClass();
            je2Var.getClass();
            return new wv2(sortedSet, je2Var);
        }
        if (set instanceof vv2) {
            vv2 vv2Var2 = (vv2) set;
            je2 je2Var3 = vv2Var2.f117212c;
            je2Var3.getClass();
            je2Var.getClass();
            return new vv2((Set) vv2Var2.f117211b, new ke2(Arrays.asList(je2Var3, je2Var)));
        }
        set.getClass();
        je2Var.getClass();
        return new vv2(set, je2Var);
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static Set a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
