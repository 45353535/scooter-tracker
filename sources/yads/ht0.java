package yads;

import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ht0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ht0 f111774b = new ht0();

    public ht0() {
        super(1);
    }

    public static String a(Map.Entry entry) {
        return entry.getKey() + C4240b4.j.f42668b + entry.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
