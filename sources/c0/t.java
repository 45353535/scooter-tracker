package c0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f6462a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function0 f6463b = a.f6464b;

    /* synthetic */ class a extends y implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6464b = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private t() {
    }

    public final long a() {
        return ((Number) f6463b.invoke()).longValue();
    }
}
