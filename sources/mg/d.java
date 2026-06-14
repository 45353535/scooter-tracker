package mg;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f94878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function3 f94879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function3 f94880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function3 f94881d;

    public d(Object obj, Function3 function3, Function3 function32, Function3 function33) {
        this.f94878a = obj;
        this.f94879b = function3;
        this.f94880c = function32;
        this.f94881d = function33;
    }

    @Override // mg.g
    public Function3 a() {
        return this.f94881d;
    }

    @Override // mg.g
    public Function3 b() {
        return this.f94880c;
    }

    @Override // mg.g
    public Function3 c() {
        return this.f94879b;
    }

    @Override // mg.g
    public Object d() {
        return this.f94878a;
    }

    public /* synthetic */ d(Object obj, Function3 function3, Function3 function32, Function3 function33, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function32, (i10 & 8) != 0 ? null : function33);
    }
}
