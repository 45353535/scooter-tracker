package yads;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class m21 implements m31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f113295a;

    public m21(kotlinx.coroutines.e eVar) {
        this.f113295a = eVar;
    }

    @Override // yads.m31
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.m31
    public final void a(Map map) {
        CancellableContinuation cancellableContinuation = this.f113295a;
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(new n31(map)));
    }
}
