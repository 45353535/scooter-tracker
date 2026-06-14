package yads;

import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a90 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b90 f108604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(b90 b90Var) {
        super(0);
        this.f108604b = b90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        synchronized (qs1.f115144a) {
            qs1.f115145b = true;
        }
        b90 b90Var = this.f108604b;
        Toast.makeText(b90Var.f108946a, b90Var.f108946a.getString(R$string.logging_is_enabled), 0).show();
        return Unit.f93236a;
    }
}
