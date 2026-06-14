package y4;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ktwapps.speedometer.Database.AppDatabaseObject;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class j extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData f108366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LiveData f108367b;

    public j(@NonNull Application application) {
        super(application);
        this.f108366a = new MutableLiveData(0);
        this.f108367b = AppDatabaseObject.f(getApplication()).g().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(List list) {
        AppDatabaseObject appDatabaseObjectF = AppDatabaseObject.f(getApplication());
        appDatabaseObjectF.g().a(list);
        appDatabaseObjectF.g().i(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, String str) {
        AppDatabaseObject.f(getApplication()).g().d(i10, str);
    }

    public void c(final List list) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: y4.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f108361b.f(list);
            }
        });
    }

    public void d(final String str, final int i10) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: y4.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f108363b.g(i10, str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e() {
        if (this.f108366a.getValue() == 0) {
            return 0;
        }
        return ((Integer) this.f108366a.getValue()).intValue();
    }

    public void h(int i10) {
        this.f108366a.setValue(Integer.valueOf(i10));
    }
}
