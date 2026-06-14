package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f93237a;

    static {
        Result.Companion companion = Result.f93230c;
        f93237a = Result.b(pf.b.g());
    }

    public static final Object b(lf.a aVar, Object obj) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new b(aVar.a(), obj).c();
    }
}
