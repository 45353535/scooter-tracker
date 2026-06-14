package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/utils/networking/HttpClient;", "", "enqueue", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/impl/RawResponse;", "method", "Lorg/bidon/sdk/utils/networking/Method;", "url", "", "body", "", "enqueue-BWLJW6A", "(Lorg/bidon/sdk/utils/networking/Method;Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface HttpClient {
    @Nullable
    /* JADX INFO: renamed from: enqueue-BWLJW6A, reason: not valid java name */
    Object mo8679enqueueBWLJW6A(@NotNull Method method, @NotNull String str, @Nullable byte[] bArr, @NotNull Continuation continuation);
}
