package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3824k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38858c;

    public C3824k5(Context context, ArrayList tableInfos, int i10) {
        Intrinsics.checkNotNullParameter("com.im_11.1.0.db", "name");
        Intrinsics.checkNotNullParameter(tableInfos, "tableInfos");
        this.f38856a = context;
        this.f38857b = tableInfos;
        this.f38858c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3824k5)) {
            return false;
        }
        C3824k5 c3824k5 = (C3824k5) obj;
        return Intrinsics.areEqual(this.f38856a, c3824k5.f38856a) && Intrinsics.areEqual("com.im_11.1.0.db", "com.im_11.1.0.db") && Intrinsics.areEqual(this.f38857b, c3824k5.f38857b) && this.f38858c == c3824k5.f38858c && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return AbstractC3712fi.a(this.f38858c, (this.f38857b.hashCode() + AbstractC3712fi.a(1, (((this.f38856a == null ? 0 : r0.hashCode()) * 31) - 2016312295) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.f38856a + ", name=com.im_11.1.0.db, version=1, tableInfos=" + this.f38857b + ", journalMode=" + this.f38858c + ", transactionExecutor=" + ((Object) null) + ")";
    }
}
