package f1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class a2 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f69361a = lf.i.a(b.f69364f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f69362b = lf.i.a(a.f69363f);

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f69363f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return k4.d(0, null, 3, null);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f69364f = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return k4.b(4, 0L, null, 6, null);
        }
    }

    @Override // f1.i1
    public ExecutorService a() {
        return (ExecutorService) this.f69361a.getValue();
    }

    @Override // f1.i1
    public ScheduledExecutorService b() {
        return (ScheduledExecutorService) this.f69362b.getValue();
    }
}
