package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5205jn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5533x0 f77566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Io f77567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5308o f77568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4997bl f77569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L5 f77570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5192ja f77571f;

    public C5205jn(C5533x0 c5533x0, Io io2, C5308o c5308o, C4997bl c4997bl, L5 l52, C5192ja c5192ja) {
        this.f77566a = c5533x0;
        this.f77567b = io2;
        this.f77568c = c5308o;
        this.f77569d = c4997bl;
        this.f77570e = l52;
        this.f77571f = c5192ja;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.lq
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C5205jn.b((Activity) obj);
            }
        });
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C5205jn(C5533x0 c5533x0, Io io2) {
        this(c5533x0, io2, C5186j4.l().a(), C5186j4.l().o(), C5186j4.l().h(), C5186j4.l().k());
    }
}
