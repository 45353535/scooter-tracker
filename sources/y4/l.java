package y4;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import com.ktwapps.speedometer.Database.AppDatabaseObject;
import com.ktwapps.speedometer.R;
import java.util.List;
import java.util.concurrent.Executors;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class l extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData f108370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MutableLiveData f108371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableLiveData f108372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MutableLiveData f108373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MutableLiveData f108374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MutableLiveData f108375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MutableLiveData f108376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LiveData f108377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LiveData f108378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f108379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LiveData f108380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LiveData f108381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LiveData f108382m;

    public l(@NonNull Application application) {
        super(application);
        MutableLiveData mutableLiveData = new MutableLiveData(5);
        this.f108370a = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData(2);
        this.f108371b = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData(0);
        this.f108372c = mutableLiveData3;
        MutableLiveData mutableLiveData4 = new MutableLiveData(Boolean.FALSE);
        this.f108373d = mutableLiveData4;
        MutableLiveData mutableLiveData5 = new MutableLiveData(Boolean.TRUE);
        this.f108374e = mutableLiveData5;
        MutableLiveData mutableLiveData6 = new MutableLiveData("RED");
        this.f108375f = mutableLiveData6;
        MutableLiveData mutableLiveData7 = new MutableLiveData(180);
        this.f108376g = mutableLiveData7;
        this.f108377h = mutableLiveData2;
        this.f108378i = mutableLiveData3;
        this.f108379j = new c(mutableLiveData, mutableLiveData4);
        this.f108380k = mutableLiveData5;
        this.f108381l = mutableLiveData7;
        this.f108382m = mutableLiveData6;
        n(application);
    }

    public static /* synthetic */ void a(Context context, w4.f fVar) {
        AppDatabaseObject appDatabaseObjectF = AppDatabaseObject.f(context);
        int iJ = (int) appDatabaseObjectF.g().j(new v4.b(context.getResources().getString(R.string.untitled), fVar.c(), fVar.b(), fVar.f(), fVar.a(), fVar.g(), (fVar.h() == null || fVar.h().isEmpty()) ? context.getResources().getString(R.string.address_not_found) : fVar.h(), (fVar.d() == null || fVar.d().isEmpty()) ? context.getResources().getString(R.string.address_not_found) : fVar.d(), fVar.i(), fVar.e()));
        List listQ = x.q(context);
        for (int i10 = 0; i10 < listQ.size(); i10++) {
            String str = (String) listQ.get(i10);
            if (!str.isEmpty()) {
                List<LatLng> listDecode = PolyUtil.decode(str);
                for (int i11 = 0; i11 < listDecode.size(); i11++) {
                    LatLng latLng = listDecode.get(i11);
                    v4.a aVar = new v4.a(System.currentTimeMillis(), 0, i10, latLng.longitude, latLng.latitude, -1.0f);
                    aVar.j(iJ);
                    appDatabaseObjectF.g().h(aVar);
                }
            }
        }
        x.H(context);
    }

    public int b(Context context) {
        return this.f108375f.getValue() == 0 ? ((Integer) x4.k.b(context).get("RED")).intValue() : ((Integer) x4.k.b(context).get(this.f108375f.getValue())).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c() {
        if (this.f108372c.getValue() == 0) {
            return 0;
        }
        return ((Integer) this.f108372c.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int d() {
        if (this.f108370a.getValue() == 0) {
            return 5;
        }
        return ((Integer) this.f108370a.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e() {
        if (this.f108371b.getValue() == 0) {
            return 2;
        }
        return ((Integer) this.f108371b.getValue()).intValue();
    }

    public void f(final Context context) {
        final w4.f fVarR = x.r(context);
        if (fVarR != null) {
            if (x.F(context)) {
                Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: y4.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.a(context, fVarR);
                    }
                });
            } else {
                x.H(context);
            }
        }
    }

    public void g(boolean z10) {
        this.f108374e.setValue(Boolean.valueOf(z10));
    }

    public void h(String str) {
        this.f108375f.setValue(str);
    }

    public void i(int i10) {
        this.f108372c.setValue(Integer.valueOf(i10));
    }

    public void j(int i10) {
        this.f108370a.setValue(Integer.valueOf(i10));
    }

    public void k(int i10) {
        this.f108376g.setValue(Integer.valueOf(i10));
    }

    public void l(boolean z10) {
        this.f108373d.setValue(Boolean.valueOf(z10));
    }

    public void m(int i10) {
        this.f108371b.setValue(Integer.valueOf(i10));
    }

    public void n(Context context) {
        m(x.u(context));
        j(x.o(context));
        i(x.c(context));
        g(x.w(context));
        k(x.s(context));
        h(x.d(context));
    }
}
