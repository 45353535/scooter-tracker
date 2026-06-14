package we;

import android.support.v4.media.session.PlaybackStateCompat;
import gg.x;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ye.a, CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f107910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f107911c;

    public a(CoroutineContext coroutineContext, io.ktor.utils.io.e channel, CharSequence contentType, Long l10, long j10) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f107910b = coroutineContext;
        this.f107911c = g.j(this, channel, contentType, l10, j10);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f107910b;
    }

    public /* synthetic */ a(CoroutineContext coroutineContext, io.ktor.utils.io.e eVar, CharSequence charSequence, Long l10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, eVar, charSequence, l10, (i10 & 16) != 0 ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH : j10);
    }
}
