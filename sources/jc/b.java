package jc;

import android.content.Context;
import hd.d;
import hd.e;
import hd.g;
import hd.h;
import id.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import pc.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec.b f85783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f85784b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85785a;

        static {
            int[] iArr = new int[id.b.values().length];
            try {
                iArr[id.b.Mraid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[id.b.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[id.b.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[id.b.Label.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[id.b.Progress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[id.b.Countdown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f85785a = iArr;
        }
    }

    public b(Context context, ec.b repository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f85783a = repository;
        this.f85784b = context.getApplicationContext();
    }

    public final e a(g gVar, List list) {
        e eVarCreateHtmlMeasurer;
        if (gVar == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            try {
                eVarCreateHtmlMeasurer = gVar.createHtmlMeasurer(this.f85784b, p0Var.a(), p0Var.b());
            } catch (Throwable unused) {
                eVarCreateHtmlMeasurer = null;
            }
            if (eVarCreateHtmlMeasurer != null) {
                arrayList.add(eVarCreateHtmlMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new hd.c(arrayList);
    }

    public final jc.a b(Object assetsHolder, id.a adElementParams, c adFormListener, yc.b eventCallback, wc.a aVar) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        switch (a.f85785a[adElementParams.a().ordinal()]) {
            case 1:
                Context applicationContext = this.f85784b;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                return new lc.g(applicationContext, assetsHolder, this.f85783a, adElementParams, adFormListener, eventCallback, aVar, a(adElementParams.h(), adElementParams.i()));
            case 2:
                Context applicationContext2 = this.f85784b;
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                return new k(applicationContext2, assetsHolder, this.f85783a, adElementParams, adFormListener, eventCallback, aVar, c(adElementParams.h(), adElementParams.i()));
            case 3:
                Context applicationContext3 = this.f85784b;
                Intrinsics.checkNotNullExpressionValue(applicationContext3, "applicationContext");
                return new mc.a(applicationContext3, assetsHolder, this.f85783a, adElementParams, adFormListener, eventCallback, aVar);
            case 4:
                Context applicationContext4 = this.f85784b;
                Intrinsics.checkNotNullExpressionValue(applicationContext4, "applicationContext");
                return new nc.a(applicationContext4, assetsHolder, this.f85783a, adElementParams, adFormListener, eventCallback, aVar);
            case 5:
                Context applicationContext5 = this.f85784b;
                Intrinsics.checkNotNullExpressionValue(applicationContext5, "applicationContext");
                return new oc.a(applicationContext5, assetsHolder, this.f85783a, adElementParams, adFormListener, eventCallback, aVar);
            case 6:
                Context applicationContext6 = this.f85784b;
                Intrinsics.checkNotNullExpressionValue(applicationContext6, "applicationContext");
                return new kc.a(applicationContext6, assetsHolder, this.f85783a, adElementParams, adFormListener, eventCallback, aVar);
            default:
                throw new m();
        }
    }

    public final h c(g gVar, List list) {
        h hVarCreateVideoMeasurer;
        if (gVar == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            try {
                hVarCreateVideoMeasurer = gVar.createVideoMeasurer(this.f85784b, p0Var.a(), p0Var.b());
            } catch (Throwable unused) {
                hVarCreateVideoMeasurer = null;
            }
            if (hVarCreateVideoMeasurer != null) {
                arrayList.add(hVarCreateVideoMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d(arrayList);
    }
}
