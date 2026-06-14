package io.sentry.android.replay;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f83081a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SemanticsPropertyKey f83082b = new SemanticsPropertyKey("SentryPrivacy", a.f83084f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83083c = SemanticsPropertyKey.$stable;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f83084f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    private s() {
    }

    public final SemanticsPropertyKey a() {
        return f83082b;
    }
}
