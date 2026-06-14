package y4;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes10.dex */
public class m extends ViewModelProvider.NewInstanceFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f108383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f108384b;

    public m(Application application, int i10) {
        this.f108383a = application;
        this.f108384b = i10;
    }

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        return cls == g.class ? new g(this.f108383a, this.f108384b) : super.create(cls);
    }
}
