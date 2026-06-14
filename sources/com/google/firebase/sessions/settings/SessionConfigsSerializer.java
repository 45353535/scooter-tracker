package com.google.firebase.sessions.settings;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigsSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "getDefaultValue", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "defaultValue", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionConfigsSerializer implements Serializer<SessionConfigs> {

    @NotNull
    public static final SessionConfigsSerializer INSTANCE = new SessionConfigsSerializer();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final SessionConfigs defaultValue = new SessionConfigs(null, null, null, null, null);

    private SessionConfigsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) throws CorruptionException {
        try {
            b.a aVar = b.f93658d;
            String strF = StringsKt.F(uf.b.c(inputStream));
            aVar.a();
            return (SessionConfigs) aVar.c(SessionConfigs.INSTANCE.serializer(), strF);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session configs", e10);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public SessionConfigs getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object writeTo(@NotNull SessionConfigs sessionConfigs, @NotNull OutputStream outputStream, @NotNull Continuation continuation) throws IOException {
        outputStream.write(StringsKt.I(b.f93658d.b(SessionConfigs.INSTANCE.serializer(), sessionConfigs)));
        return Unit.f93236a;
    }
}
