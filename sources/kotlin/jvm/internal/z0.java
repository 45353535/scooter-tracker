package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f93337a;

    public z0(int i10) {
        this.f93337a = new ArrayList(i10);
    }

    public void a(Object obj) {
        this.f93337a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f93337a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f93337a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f93337a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f93337a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f93337a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f93337a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f93337a.toArray(objArr);
    }
}
