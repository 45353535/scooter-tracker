package io.bidmachine.analytics.internal.l;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.analytics.internal.i.a;
import io.bidmachine.analytics.internal.j.a;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.j.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0953a f79638j = new C0953a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f79639h = "isimp";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f79640i;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$a, reason: collision with other inner class name */
    public static final class C0953a {
        public /* synthetic */ C0953a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0953a() {
        }
    }

    public static final class b implements ImpressionDataListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.h.b f79641a;

        public b(io.bidmachine.analytics.internal.h.b bVar) {
            this.f79641a = bVar;
        }

        public void onImpressionSuccess(ImpressionData impressionData) {
            if (impressionData == null) {
                return;
            }
            try {
                Result.Companion companion = Result.f93230c;
                JSONObject allData = impressionData.getAllData();
                if (allData == null || allData.length() <= 0) {
                    this.f79641a.a(new e("isimp", e.a.MONITOR_NO_CONTENT, null, 4, null));
                    return;
                }
                try {
                    this.f79641a.a(io.bidmachine.analytics.internal.a.e.a(allData));
                } catch (Throwable th2) {
                    this.f79641a.a(new e("isimp", e.a.MONITOR_BAD_CONTENT, io.bidmachine.analytics.internal.a.e.a(th2)));
                }
                Result.b(Unit.f93236a);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(d.a(th3));
            }
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79639h;
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public a.EnumC0951a c(Map map) {
        String string;
        String upperCase;
        Object obj = map.get("adFormat");
        if (obj == null || (string = obj.toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null) {
            return null;
        }
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1466654086) {
            if (iHashCode != -1372958932) {
                if (iHashCode != 1666382058) {
                    if (iHashCode == 1951953708 && upperCase.equals("BANNER")) {
                        return a.EnumC0951a.BANNER;
                    }
                } else if (upperCase.equals("REWARDED_VIDEO")) {
                    return a.EnumC0951a.REWARDED;
                }
            } else if (upperCase.equals("INTERSTITIAL")) {
                return a.EnumC0951a.INTERSTITIAL;
            }
        } else if (upperCase.equals("NATIVEAD")) {
            return a.EnumC0951a.NATIVE;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        b bVar = this.f79640i;
        if (bVar != null) {
            IronSource.removeImpressionDataListener(bVar);
        }
    }

    @Override // io.bidmachine.analytics.internal.j.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        super.f(context);
        b bVar = this.f79640i;
        if (bVar != null) {
            IronSource.addImpressionDataListener(bVar);
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(a.C0950a c0950a) {
        super.b(c0950a);
        this.f79640i = new b(this);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public a.b b(Map map) {
        Object obj;
        String string;
        Float fA = io.bidmachine.analytics.internal.a.b.a(map.get("revenue"));
        if (fA == null || (obj = map.get("adNetwork")) == null || (string = obj.toString()) == null) {
            return null;
        }
        return new a.b(null, 0, fA, string, null, false, 51, null);
    }
}
