package io.bidmachine.analytics.internal.s;

import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends io.bidmachine.analytics.internal.n.a {
    public abstract File a(ReaderConfig.Rule rule);

    @Override // io.bidmachine.analytics.internal.n.a
    public Object a(ReaderConfig.Rule rule, Continuation continuation) {
        return a(this, rule, continuation);
    }

    static /* synthetic */ Object a(a aVar, ReaderConfig.Rule rule, Continuation continuation) throws FileNotFoundException {
        File fileA = aVar.a(rule);
        if (!fileA.exists()) {
            throw new FileNotFoundException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fileA.lastModified());
        sb2.append('_');
        sb2.append(fileA.length());
        return sb2.toString();
    }
}
