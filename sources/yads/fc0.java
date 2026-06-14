package yads;

import android.net.Uri;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class fc0 implements zi0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f110686c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hr f110687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f110688b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(o20.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f110686c = sparseArray;
    }

    public fc0(hr hrVar, ExecutorService executorService) {
        this.f110687a = (hr) fi.a(hrVar);
        this.f110688b = (Executor) fi.a(executorService);
    }

    public final yi0 a(wi0 wi0Var) {
        mk1 mk1Var;
        mk1 mk1Var2;
        int iA = w83.a(wi0Var.f117460c, wi0Var.f117461d);
        if (iA != 0 && iA != 1 && iA != 2) {
            if (iA != 4) {
                throw new IllegalArgumentException(he2.a("Unsupported type: ", iA));
            }
            ek1 ek1Var = new ek1();
            hk1 hk1Var = new hk1();
            List list = Collections.EMPTY_LIST;
            nk2 nk2Var = nk2.f113952f;
            ok1 ok1Var = ok1.f114343d;
            Uri uri = wi0Var.f117460c;
            String str = wi0Var.f117464g;
            if (hk1Var.f111617b != null && hk1Var.f111616a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                mk1Var2 = new mk1(uri, null, hk1Var.f111616a != null ? new ik1(hk1Var) : null, list, str, nk2Var, null);
            } else {
                mk1Var2 = null;
            }
            return new sh2(new rk1("", new gk1(ek1Var), mk1Var2, new kk1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), vk1.H, ok1Var), this.f110687a, this.f110688b);
        }
        Constructor constructor = (Constructor) f110686c.get(iA);
        if (constructor == null) {
            throw new IllegalStateException(he2.a("Module missing for content type ", iA));
        }
        ek1 ek1Var2 = new ek1();
        hk1 hk1Var2 = new hk1();
        nk2 nk2Var2 = nk2.f113952f;
        ok1 ok1Var2 = ok1.f114343d;
        Uri uri2 = wi0Var.f117460c;
        List list2 = wi0Var.f117462e;
        List listUnmodifiableList = (list2 == null || list2.isEmpty()) ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list2));
        String str2 = wi0Var.f117464g;
        if (hk1Var2.f111617b != null && hk1Var2.f111616a == null) {
            throw new IllegalStateException();
        }
        if (uri2 != null) {
            mk1Var = new mk1(uri2, null, hk1Var2.f111616a != null ? new ik1(hk1Var2) : null, listUnmodifiableList, str2, nk2Var2, null);
        } else {
            mk1Var = null;
        }
        try {
            return (yi0) constructor.newInstance(new rk1("", new gk1(ek1Var2), mk1Var, new kk1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), vk1.H, ok1Var2), this.f110687a, this.f110688b);
        } catch (Exception unused) {
            throw new IllegalStateException(he2.a("Failed to instantiate downloader for content type ", iA));
        }
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(yi0.class).getConstructor(rk1.class, hr.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }
}
