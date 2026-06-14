package y4;

import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class c extends MediatorLiveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f108353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f108354b;

    public c(LiveData liveData, LiveData liveData2) {
        addSource(liveData, new Observer() { // from class: y4.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f108351b.c(obj);
            }
        });
        addSource(liveData2, new Observer() { // from class: y4.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f108352b.d(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        Object obj2;
        if (obj != null) {
            this.f108353a = obj;
        }
        Object obj3 = this.f108353a;
        if (obj3 == null || (obj2 = this.f108354b) == null) {
            return;
        }
        setValue(Pair.create(obj3, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj) {
        Object obj2;
        if (obj != null) {
            this.f108354b = obj;
        }
        Object obj3 = this.f108353a;
        if (obj3 == null || (obj2 = this.f108354b) == null) {
            return;
        }
        setValue(Pair.create(obj3, obj2));
    }
}
