package f1;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class mb implements fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f70486a;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j4 f70487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kd f70488g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j4 j4Var, kd kdVar) {
            super(0);
            this.f70487f = j4Var;
            this.f70488g = kdVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final hg invoke() {
            return new hg(new k1(this.f70487f.getContext()), this.f70488g.a());
        }
    }

    public mb(j4 androidComponent, kd trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f70486a = lf.i.a(new a(androidComponent, trackerComponent));
    }

    @Override // f1.fa
    public of a() {
        return (of) this.f70486a.getValue();
    }
}
