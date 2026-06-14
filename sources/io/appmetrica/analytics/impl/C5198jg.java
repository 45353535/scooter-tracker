package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5198jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5375qg f77523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ga f77524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bg f77525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f77526d = lf.i.a(new C5121gg(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f77527e = lf.i.a(new C5069eg(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f77528f = lf.i.a(new C5172ig(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f77529g = new ArrayList();

    public C5198jg(C5375qg c5375qg, Ag ag2, Ga ga2, Bg bg2) {
        this.f77523a = c5375qg;
        this.f77524b = ga2;
        this.f77525c = bg2;
    }

    public static final InterfaceC4992bg a(C5198jg c5198jg) {
        return (InterfaceC4992bg) c5198jg.f77526d.getValue();
    }

    public static final void a(C5198jg c5198jg, C5424sg c5424sg, InterfaceC4992bg interfaceC4992bg) {
        boolean zAreEqual;
        c5198jg.f77529g.add(c5424sg);
        Bg bg2 = c5198jg.f77525c;
        if (c5424sg == null) {
            bg2.getClass();
        } else {
            SafePackageManager safePackageManager = bg2.f75586b;
            Context context = bg2.f75585a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c5424sg.f78239d.ordinal();
            if (iOrdinal == 1) {
                zAreEqual = Intrinsics.areEqual(bg2.f75590f, installerPackageName);
            } else if (iOrdinal == 2) {
                zAreEqual = Intrinsics.areEqual(bg2.f75591g, installerPackageName);
            }
            if (zAreEqual) {
                c5198jg.a(c5424sg);
                return;
            }
        }
        interfaceC4992bg.a();
    }

    public final void a(C5424sg c5424sg) {
        C5375qg c5375qg = this.f77523a;
        synchronized (c5375qg) {
            c5375qg.f78081b = c5424sg;
            c5375qg.f78082c = true;
            c5375qg.f78083d.a(c5424sg);
            c5375qg.f78083d.d();
            c5375qg.a(c5375qg.f78081b);
        }
    }
}
