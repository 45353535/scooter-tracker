package y4;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.ktwapps.speedometer.Database.AppDatabaseObject;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class g extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MutableLiveData f108358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LiveData f108359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LiveData f108360c;

    public g(Application application, int i10) {
        super(application);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f108358a = mutableLiveData;
        this.f108359b = Transformations.switchMap(mutableLiveData, new Function1() { // from class: y4.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f108356b.c((Integer) obj);
            }
        });
        this.f108360c = Transformations.switchMap(this.f108358a, new Function1() { // from class: y4.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f108357b.d((Integer) obj);
            }
        });
        this.f108358a.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LiveData c(Integer num) {
        return AppDatabaseObject.f(getApplication()).g().e(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LiveData d(Integer num) {
        return AppDatabaseObject.f(getApplication()).g().f(num.intValue());
    }
}
