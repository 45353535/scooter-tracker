package com.google.firebase.sessions;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/sessions/SessionDataSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/firebase/sessions/SessionData;", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "<init>", "(Lcom/google/firebase/sessions/SessionGenerator;)V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/google/firebase/sessions/SessionData;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/google/firebase/sessions/SessionGenerator;", "getDefaultValue", "()Lcom/google/firebase/sessions/SessionData;", "defaultValue", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionDataSerializer implements Serializer<SessionData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SessionGenerator sessionGenerator;

    public SessionDataSerializer(@NotNull SessionGenerator sessionGenerator) {
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        this.sessionGenerator = sessionGenerator;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) throws CorruptionException {
        try {
            b.a aVar = kotlinx.serialization.json.b.f93658d;
            String strF = StringsKt.F(uf.b.c(inputStream));
            aVar.a();
            return (SessionData) aVar.c(SessionData.INSTANCE.serializer(), strF);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session data", e10);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public SessionData getDefaultValue() {
        return new SessionData(this.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object writeTo(@NotNull SessionData sessionData, @NotNull OutputStream outputStream, @NotNull Continuation continuation) throws IOException {
        outputStream.write(StringsKt.I(kotlinx.serialization.json.b.f93658d.b(SessionData.INSTANCE.serializer(), sessionData)));
        return Unit.f93236a;
    }
}
