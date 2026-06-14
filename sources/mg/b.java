package mg;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f94874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function3 f94875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function3 f94876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function3 f94877d;

    public b(Object obj, Function3 function3, Function3 function32) {
        this.f94874a = obj;
        this.f94875b = function3;
        this.f94876c = function32;
        this.f94877d = k.f94905a;
    }

    @Override // mg.g
    public Function3 a() {
        return this.f94876c;
    }

    @Override // mg.g
    public Function3 b() {
        return this.f94877d;
    }

    @Override // mg.g
    public Function3 c() {
        return this.f94875b;
    }

    @Override // mg.g
    public Object d() {
        return this.f94874a;
    }

    public /* synthetic */ b(Object obj, Function3 function3, Function3 function32, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, (i10 & 4) != 0 ? null : function32);
    }
}
