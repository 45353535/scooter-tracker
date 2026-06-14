package qc;

import android.content.Context;
import ic.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f98971a = new c();

    private c() {
    }

    public static final b a(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(str, "exo")) {
            v.g("PlayerFactory", "Create player (ExoPlayerImpl)", new Object[0]);
            return new rc.a(context);
        }
        v.g("PlayerFactory", "Create player (MediaPlayerImpl)", new Object[0]);
        return new sc.a(context);
    }
}
