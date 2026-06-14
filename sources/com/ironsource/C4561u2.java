package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4500q8;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4561u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C4561u2 f45538a;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45539a;

        static {
            int[] iArr = new int[C4500q8.a.values().length];
            f45539a = iArr;
            try {
                iArr[C4500q8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45539a[C4500q8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45539a[C4500q8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C4561u2 a() {
        C4561u2 c4561u2 = f45538a;
        return c4561u2 == null ? new C4561u2() : c4561u2;
    }

    public boolean a(Activity activity) {
        if (a.f45539a[C4280da.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) P9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
