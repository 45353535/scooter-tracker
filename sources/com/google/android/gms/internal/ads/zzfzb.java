package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfzb implements Serializer {

    @NotNull
    public static final zzfzb zza = new zzfzb();

    @NotNull
    private static final zzfyy zzb;

    static {
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        Intrinsics.checkNotNullExpressionValue(zzfyyVarZzd, "getDefaultInstance(...)");
        zzb = zzfyyVarZzd;
    }

    private zzfzb() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public final Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) {
        try {
            zzfyy zzfyyVarZzc = zzfyy.zzc(inputStream);
            Intrinsics.checkNotNull(zzfyyVarZzc);
            return zzfyyVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        ((zzfyy) obj).zzaO(outputStream);
        return Unit.f93236a;
    }
}
