package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo1 f112621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rp1 f112622c;

    public k70(Context context, qo1 qo1Var, rp1 rp1Var) {
        this.f112620a = context;
        this.f112621b = qo1Var;
        this.f112622c = rp1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r18, yads.o40 r19) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.k70.a(java.util.List, yads.o40):void");
    }

    public final k80 a(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return new k80(this.f112620a.getString(R$string.yes), 0, null, 0, 14);
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return new k80(this.f112620a.getString(R$string.no), 0, null, 0, 14);
        }
        if (bool == null) {
            return new k80(this.f112620a.getString(R$string.no_value_set), 0, null, 0, 14);
        }
        throw new lf.m();
    }
}
