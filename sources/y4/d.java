package y4;

import androidx.core.util.Consumer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes10.dex */
public class d extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData f108355a = new MutableLiveData(null);

    public LiveData a() {
        return this.f108355a;
    }

    public void b(w4.d dVar) {
        this.f108355a.setValue(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Consumer consumer) {
        w4.d dVar = (w4.d) this.f108355a.getValue();
        if (dVar != null) {
            consumer.accept(dVar);
            this.f108355a.setValue(dVar);
        }
    }
}
