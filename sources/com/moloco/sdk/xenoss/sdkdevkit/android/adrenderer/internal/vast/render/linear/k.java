package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.Job;
import lf.c0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k {
    public static final i d(Boolean bool, int i10, t tVar) {
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            tVar = null;
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            tVar = new t.b(((long) i10) * 1000);
        } else if (bool != null) {
            throw new lf.m();
        }
        return new j(tVar);
    }

    public static final int f(IntRange intRange, int i10) {
        return c0.a(kotlin.ranges.g.c((((double) (kotlin.ranges.g.e(intRange.f() - intRange.e(), 0) * i10)) / 100.0d) / ((double) 1000), 0.0d));
    }

    public static final long g(long j10) {
        return j10 / 1000;
    }

    public static final d.a h(int i10) {
        return i10 == 0 ? d.a.C0768a.f58158a : new d.a.b(i10, null);
    }

    public static final boolean i(Job job) {
        return job == null || job.isCancelled() || job.n();
    }
}
